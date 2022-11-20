package transition;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import JavaModel.LineStatement;
import JavaModel.Method;
import JavaModel.Statement;
import JavaModel.TestClass;
import JavaModel.impl.JavaModelFactoryImpl;
import testsuite.APIRequest;
import testsuite.Assertion;
import testsuite.Header;
import testsuite.StatusAssertion;
import testsuite.TestCase;
import testsuite.TestStep;
import testsuite.TestSuite;
import testsuite.TestsuitePackage;



public class TestSuiteConverter {
	public static void main(String[] args) throws IOException {
		TestSuite testSuite = loadTestSuite();
		
		// convert instance of TestSuite to instance of JavaModel
		TestClass testClass = JavaModelFactoryImpl.eINSTANCE.createTestClass();
		testClass.setName(testSuite.getName());
		
		for(TestCase testCase : testSuite.getTestCases()) {
			Method testMethod = convertTestCaseToMethod(testCase);
			testClass.getTestMethods().add(testMethod);
		}
		
		Resource javaModelResource = new XMIResourceFactoryImpl().createResource(URI.createURI("ExampleTestSuiteJavaModel.xmi"));
		javaModelResource.getContents().add(testClass);
		try {
			// TODO: Fix this
			// The object 'JavaModel.impl.MethodImpl@7722c3c3 (visibility: PACKAGE_PRIVATE, name: Create and Get Teacher, returnType: VOID, annotations: null)' is not contained in a resource
			javaModelResource.save(System.out, null);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	static TestSuite loadTestSuite() {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(TestsuitePackage.eNS_URI, TestsuitePackage.eINSTANCE);
		
		resourceSet.getResourceFactoryRegistry()
		.getExtensionToFactoryMap()
		.put("xmi", new XMIResourceFactoryImpl());
		
		Resource resource = resourceSet.getResource(URI.createURI("../no.ntnu.tdt4250.examples/ExampleTestSuite.xmi"), true);
		return (TestSuite) resource.getContents().get(0);
	}
	
	static Method convertTestCaseToMethod(TestCase testCase) {
		Method testMethod = JavaModelFactoryImpl.eINSTANCE.createMethod();
		
		// process each request of the test case
		testMethod.setName(testCase.getName());
		for(TestStep testStep : testCase.getTestSteps()) {
			EList<Statement> statements = testMethod.getStatements();
			statements.addAll(convertTestStepToStatements(testStep));
			
			// add new line
			LineStatement newLineStatement = JavaModelFactoryImpl.eINSTANCE.createLineStatement();
			newLineStatement.setLineContent("\n");
			statements.add(newLineStatement);
		}
		
		return testMethod;
	}
	
	static List<Statement> convertTestStepToStatements(TestStep testStep) {
		if (testStep instanceof APIRequest) {
			return convertApiRequestToStatements((APIRequest) testStep);
		}
		throw new UnsupportedOperationException("Currently we can't process normal TestSteps.");
	}
	
	static List<Statement> convertApiRequestToStatements(APIRequest testStep) {
		switch(testStep.getMethod()) {
			case GET: return convertGetRequestToStatements(testStep);
			case POST: return convertPostRequestToStatements(testStep);
			case DELETE: return convertDeleteRequestToStatements(testStep);
			case PUT: return convertPutRequestToStatements(testStep);
			default: throw new UnsupportedOperationException("We didn't implement this HTTP Method yet. Whoops");
		}
		
	}
	
	static List<Statement> convertGetRequestToStatements(APIRequest testStep) {
		List<Statement> statements = addStatementsForHttpClient(testStep);
		statements.addAll(addHeaders(testStep.getHeaders()));
		
		statements.add(addRequestExecutionStatement());
		
		statements.addAll(addAssertionStatements(testStep));
		
		return statements;
	}
	
	static List<Statement> convertPostRequestToStatements(APIRequest testStep) {
		List<Statement> statements = addStatementsForHttpClient(testStep);
		
		LineStatement setBodyStatement = JavaModelFactoryImpl.eINSTANCE.createLineStatement();
		String body = "String body = \"" + testStep.getBody() + "\";";
		setBodyStatement.setLineContent(body);
		statements.add(setBodyStatement);
		
		statements.addAll(addHeaders(testStep.getHeaders()));
		
		statements.add(addRequestExecutionStatement());
		
		statements.addAll(addAssertionStatements(testStep));
		
		return statements;
	}
	
	static List<Statement> convertDeleteRequestToStatements(APIRequest testStep) {
		List<Statement> statements = addStatementsForHttpClient(testStep);
		statements.addAll(addHeaders(testStep.getHeaders()));
		
		statements.add(addRequestExecutionStatement());
		
		statements.addAll(addAssertionStatements(testStep));
		
		return statements;
	}
	
	static List<Statement> convertPutRequestToStatements(APIRequest testStep) {
		List<Statement> statements = addStatementsForHttpClient(testStep);
		
		LineStatement setBodyStatement = JavaModelFactoryImpl.eINSTANCE.createLineStatement();
		String body = "String body = \"" + testStep.getBody() + "\";";
		setBodyStatement.setLineContent(body);
		statements.add(setBodyStatement);
		
		statements.addAll(addHeaders(testStep.getHeaders()));
		
		statements.add(addRequestExecutionStatement());
		
		statements.addAll(addAssertionStatements(testStep));
		
		return statements;
	}
	
	static List<Statement> addStatementsForHttpClient(APIRequest testStep) {
		List<Statement> statements = new ArrayList<>();
		
		LineStatement createHttpClientStatement = JavaModelFactoryImpl.eINSTANCE.createLineStatement();
		String createHttpClient = "HttpClient httpClient = HttpClients.createDefault();";
		createHttpClientStatement.setLineContent(createHttpClient);
		statements.add(createHttpClientStatement);
		
		LineStatement createHttpRequestStatement = JavaModelFactoryImpl.eINSTANCE.createLineStatement();
		String createHttpRequest;
		
		switch(testStep.getMethod()) {
		case DELETE:
			createHttpRequest = "HttpDelete httpRequest = new HttpDelete(\"" + testStep.getUri() + "\");";
			break;
		case GET:
			createHttpRequest = "HttpGet httpRequest = new HttpGet(\"" + testStep.getUri() + "\");";
			break;
		case POST:
			createHttpRequest = "HttpPost httpRequest = new HttpPost(\"" + testStep.getUri() + "\");";
			break;
		case PUT:
			createHttpRequest = "HttpPut httpRequest = new HttpPut(\"" + testStep.getUri() + "\");";
			break;
		default:
			throw new UnsupportedOperationException("We didn't implement this HTTP Method yet. Whoops");
		}

		createHttpRequestStatement.setLineContent(createHttpRequest);
		statements.add(createHttpRequestStatement);
		
		return statements;
	}
	
	static List<Statement> addHeaders(List<Header> headers) {
		List<Statement> statements = new ArrayList<>();
		
		return statements;
	}
	
	static Statement addRequestExecutionStatement() {
		LineStatement executeRequestStatement = JavaModelFactoryImpl.eINSTANCE.createLineStatement();
		String executeRequest = "var response = httpClient.execute(httpRequest);";
		executeRequestStatement.setLineContent(executeRequest);
		return executeRequestStatement;
	}
	
	static List<Statement> addAssertionStatements(APIRequest testStep) {
		List<Statement> assertionStatements = new ArrayList<>();
		
		for (Assertion assertion : testStep.getAssertions()) {
			if(assertion instanceof StatusAssertion) {
				assertionStatements.add(addStatusCodeAssertion((StatusAssertion) assertion));
			} else {
				throw new UnsupportedOperationException("We currently only support StatusAssertions.");
			}
		}
		
		return assertionStatements;
	}
	
	static Statement addStatusCodeAssertion(StatusAssertion statusAssertion) {
		LineStatement assertionStatement = JavaModelFactoryImpl.eINSTANCE.createLineStatement();
		
		StringBuilder assertion = new StringBuilder();
		assertion.append("assertThat(response.getCode()).isIn(");
		
		// transform List of successful codes to comma separated String
		String codes = statusAssertion.getSuccessfulCodes()
				.stream()
				.map((code) -> String.valueOf(code))
				.collect(Collectors.joining(", "));
		assertion.append(codes).append(");");
		
		assertionStatement.setLineContent(assertion.toString());
		return assertionStatement;
		
	}
}