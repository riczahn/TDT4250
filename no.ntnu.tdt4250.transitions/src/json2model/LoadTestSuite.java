package json2model;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import testsuite.APIRequest;
import testsuite.Header;
import testsuite.InferrableParameter;
import testsuite.Method;
import testsuite.ParameterLocation;
import testsuite.StatusAssertion;
import testsuite.TestCase;
import testsuite.TestSuite;
import testsuite.TestsuiteFactory;


public class LoadTestSuite {

	public static void main(String[] args) throws IOException {
		String sourceFile;
		String destinationFile;
		
		if (args.length == 2) {
			sourceFile = args[0];
			destinationFile = args[1];
		} else {
			// default values
			sourceFile = "../no.ntnu.tdt4250.examples/json/ExampleJsonOne.json";
			destinationFile = "../no.ntnu.tdt4250.examples/xmi/testsuite/ExampleTestSuiteOne.xmi";
		}
		
		TestSuite testSuite = deserializeJSON(sourceFile);
		
		Resource testSuiteResource = new XMIResourceFactoryImpl().createResource(URI.createURI(destinationFile));
		testSuiteResource.getContents().add(testSuite);
		testSuiteResource.save(null);
			
	}
	
	public static TestSuite deserializeJSON(String path) throws IOException {
		File file = new File(path);  
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		JsonNode node =  objectMapper.readTree(file);
		
		TestSuite res = TestsuiteFactory.eINSTANCE.createTestSuite();
		res.setName(file.getName());
		
		TestCase tCase = TestsuiteFactory.eINSTANCE.createTestCase();
		res.getTestCases().add(tCase);
		tCase.setName("Test case 1"); // TODO: define this dynamically
		
		int id = 0;
		
		for (JsonNode step : node.get("testSteps") ) {
			APIRequest tStep = TestsuiteFactory.eINSTANCE.createAPIRequest();
			tCase.getTestSteps().add(tStep);
			tStep.setId(id++);
			tStep.setMethod(Method.valueOf(step.get("method").asText().toUpperCase()));
			tStep.setUri(step.get("uri").asText());
			
			if (step.get("body") != null)
				tStep.setBody(step.get("body").asText());
			
			if (step.get("headers") != null) {
				step.get("headers").fields().forEachRemaining( header -> {
					Header tHeader = TestsuiteFactory.eINSTANCE.createHeader();
					tStep.getHeaders().add(tHeader);
					tHeader.setKey(header.getKey());
					tHeader.setValue(header.getValue().asText());
				});
			}
			
			if (step.get("assertions") != null) {
				step.get("assertions").fields().forEachRemaining( assertion -> {
					switch (assertion.getKey()) {
					case "successfulCodes":
						StatusAssertion sAss = TestsuiteFactory.eINSTANCE.createStatusAssertion();
						tStep.getAssertions().add(sAss);
						assertion.getValue().forEach(code -> {
							sAss.getSuccessfulCodes().add(code.asInt());
						});
						break;
					default:
						throw new IllegalArgumentException("Unknown assertion type.");
					}
				});
			}
			
			if (step.get("inferrableParameters") != null) {
				step.get("inferrableParameters").forEach(par -> {
					InferrableParameter iPar = TestsuiteFactory.eINSTANCE.createInferrableParameter();
					tStep.getParameters().add(iPar);
					iPar.setJsonPath(par.get("jsonPath").asText());
					iPar.setName(par.get("name").asText());
					iPar.setTestStepId(par.get("testStepId").asLong());
					iPar.setParameterLocation(ParameterLocation.valueOf(par.get("parameterLocation").asText().toUpperCase()));
				});
			}
		}
		
		return res;
	}

}

