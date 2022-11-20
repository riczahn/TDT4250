package transition.handlers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import JavaModel.LineStatement;
import JavaModel.Statement;
import JavaModel.impl.JavaModelFactoryImpl;
import testsuite.APIRequest;
import testsuite.Assertion;
import testsuite.Header;
import testsuite.StatusAssertion;
import testsuite.TestStep;

public class TestStepHandler {
	
	public List<Statement> convertTestStepToStatements(TestStep testStep) {
		if (testStep instanceof APIRequest) {
			return convertApiRequestToStatements((APIRequest) testStep);
		}
		
		throw new UnsupportedOperationException("Currently we can't process normal TestSteps.");
	}
	
	private List<Statement> convertApiRequestToStatements(APIRequest testStep) {
		switch(testStep.getMethod()) {
			case GET: return convertGetRequestToStatements(testStep);
			case POST: return convertPostRequestToStatements(testStep);
			case DELETE: return convertDeleteRequestToStatements(testStep);
			case PUT: return convertPutRequestToStatements(testStep);
			default: throw new UnsupportedOperationException("We didn't implement this HTTP Method yet. Whoops");
		}
		
	}
	
	private List<Statement> convertGetRequestToStatements(APIRequest testStep) {
		List<Statement> statements = addStatementsForHttpClient(testStep);
		statements.addAll(addHeaders(testStep.getHeaders()));
		
		statements.add(addRequestExecutionStatement());
		
		statements.addAll(addAssertionStatements(testStep));
		
		return statements;
	}
	
	private List<Statement> convertPostRequestToStatements(APIRequest testStep) {
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
	
	private List<Statement> convertDeleteRequestToStatements(APIRequest testStep) {
		List<Statement> statements = addStatementsForHttpClient(testStep);
		statements.addAll(addHeaders(testStep.getHeaders()));
		
		statements.add(addRequestExecutionStatement());
		
		statements.addAll(addAssertionStatements(testStep));
		
		return statements;
	}
	
	private List<Statement> convertPutRequestToStatements(APIRequest testStep) {
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
	
	private List<Statement> addStatementsForHttpClient(APIRequest testStep) {
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
	
	private List<Statement> addHeaders(List<Header> headers) {
		List<Statement> statements = new ArrayList<>();
		
		return statements;
	}
	
	private Statement addRequestExecutionStatement() {
		LineStatement executeRequestStatement = JavaModelFactoryImpl.eINSTANCE.createLineStatement();
		String executeRequest = "var response = httpClient.execute(httpRequest);";
		executeRequestStatement.setLineContent(executeRequest);
		return executeRequestStatement;
	}
	
	private List<Statement> addAssertionStatements(APIRequest testStep) {
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
	
	private Statement addStatusCodeAssertion(StatusAssertion statusAssertion) {
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
