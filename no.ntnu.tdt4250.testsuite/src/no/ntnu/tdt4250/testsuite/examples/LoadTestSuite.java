package no.ntnu.tdt4250.testsuite.examples;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import no.ntnu.tdt4250.testsuite.APIRequest;
import no.ntnu.tdt4250.testsuite.Header;
import no.ntnu.tdt4250.testsuite.InferrableParameter;
import no.ntnu.tdt4250.testsuite.Method;
import no.ntnu.tdt4250.testsuite.ParameterLocation;
import no.ntnu.tdt4250.testsuite.StatusAssertion;
import no.ntnu.tdt4250.testsuite.TestCase;
import no.ntnu.tdt4250.testsuite.TestSuite;
import no.ntnu.tdt4250.testsuite.TestsuiteFactory;

/*
import no.ntnu.tdt4250.testsuite.TestStep;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emfcloud.jackson.resource.JsonResourceFactory;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import no.ntnu.tdt4250.testsuite.Assertion;
import no.ntnu.tdt4250.testsuite.TestsuitePackage;
import no.ntnu.tdt4250.testsuite.impl.TestCaseImpl;
*/

public class LoadTestSuite {

	public static void main(String[] args) throws IOException {
		/*ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(TestsuitePackage.eNS_URI, TestsuitePackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry()
						.getExtensionToFactoryMap()
						.put("json", new JsonResourceFactory());
	
		//Resource resource = resourceSet.getResource(URI.createURI(LoadTestSuite.class.getResource("exampleData.json").toString()), true);
		
		Resource res = resourceSet.createResource(URI.createFileURI("src/no/ntnu/tdt4250/testsuite/examples/output.json"));
		
		TestSuite tSuite = TestsuiteFactory.eINSTANCE.createTestSuite();
		tSuite.setName("test suite 1 ");
		
		TestCase tCase = TestsuiteFactory.eINSTANCE.createTestCase();
		tCase.setName("test case 1");
		tCase.setTestSuite(tSuite);
		tSuite.getTestCases().add(tCase);
		
		APIRequest tStep = TestsuiteFactory.eINSTANCE.createAPIRequest();
		tCase.getTestSteps().add(tStep);
		tStep.setTestCase(tCase);
		tStep.setId(0);
		tStep.setUri("https://api.ionos.com/cloudapi/v5/datacenters?pretty=true&depth=0");
		tStep.setMethod(Method.POST);
		tStep.setBody("{\"properties\":{\"location\":\"us\\/las\"}}");
		
		Header header1 = TestsuiteFactory.eINSTANCE.createHeader();
		header1.setKey("Accept");
		header1.setValue("application/json");
		
		Header header2 = TestsuiteFactory.eINSTANCE.createHeader();
		header2.setKey("Authentication");
		header2.setValue("dGVzdHVzZXI6cGFzc3dvcmQ=");
		
		Header header3 = TestsuiteFactory.eINSTANCE.createHeader();
		header3.setKey("Content-Type");
		header3.setValue("application/json");
		
		tStep.getHeaders().add(header1);
		tStep.getHeaders().add(header2);
		tStep.getHeaders().add(header3);
		
		StatusAssertion ass = TestsuiteFactory.eINSTANCE.createStatusAssertion();
		tStep.getAssertions().add(ass);
		ass.setApiRequest(tStep);
		ass.setErrorMessage("Expected response code 200");
		ass.getSuccessfulCodes().add(200);
		
		res.getContents().add(tSuite);
		
		try {
			res.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	    
		TestSuite test = LoadTestSuite.deserializeJSON("src/no/ntnu/tdt4250/testsuite/examples/exampleData.json");
		
		// check headers
		((APIRequest)test.getTestCases().get(0).getTestSteps().get(0)).getHeaders().forEach(h -> {
			System.out.println(h.getKey() + ": " + h.getValue());
		});
		
		// check status assertions
		((APIRequest)test.getTestCases().get(0).getTestSteps().get(0)).getAssertions().forEach(a -> {
			StatusAssertion assertion = (StatusAssertion)a;
			System.out.println(assertion.getSuccessfulCodes());
		});
		
		// check status assertions
		((APIRequest)test.getTestCases().get(0).getTestSteps().get(1)).getAssertions().forEach(a -> {
			StatusAssertion assertion = (StatusAssertion)a;
			System.out.println(assertion.getSuccessfulCodes());
		});
		
		// check parameter location
		((APIRequest)test.getTestCases().get(0).getTestSteps().get(1)).getParameters().forEach(p -> {
			System.out.println(p);
		});
				
				
		//System.out.println(resource.getContents());
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
