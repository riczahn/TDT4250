package model2model.handlers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javatest.LineStatement;
import javatest.Statement;
import javatest.impl.JavaModelFactoryImpl;
import testsuite.APIRequest;
import testsuite.Assertion;
import testsuite.Header;
import testsuite.Method;
import testsuite.StatusAssertion;

public abstract class ApiRequestHandler {
	
	protected DependencyHandler dependencyHandler;
	
	public static ApiRequestHandler getResponsibleApiRequestHandler(Method httpMethod, DependencyHandler dependencyHandler) {
		return switch(httpMethod) {
			case GET -> new GetApiRequestHandler(dependencyHandler);
			case POST -> new PostApiRequestHandler(dependencyHandler);
			case DELETE -> new DeleteApiRequestHandler(dependencyHandler);
			case PUT -> new PutApiRequestHandler(dependencyHandler);
			case HEAD -> throw new UnsupportedOperationException("We didn't implement this HTTP Method yet. Whoops");
		};
	}
	
	public abstract List<Statement> convertRequestToStatements(APIRequest apiRequest);
	
	public abstract Statement addRequestStatementAndDependency(APIRequest apiRequest);
	
	protected List<Statement> addStatementsForHttpClient(APIRequest apiRequest) {
		List<Statement> statements = new ArrayList<>();
		
		// TODO: Move HttpClient creation into before method
		LineStatement createHttpClientStatement = JavaModelFactoryImpl.eINSTANCE.createLineStatement();
		String createHttpClient = "HttpClient httpClient = HttpClients.createDefault();";
		createHttpClientStatement.setLineContent(createHttpClient);
		statements.add(createHttpClientStatement);
		
		dependencyHandler.addDependency("org.apache.hc.client5.http.classic.HttpClient");
		
		statements.add(addRequestStatementAndDependency(apiRequest));
		
		return statements;
	}
	
	protected Statement addRequestExecutionStatement(APIRequest apiRequest) {
		LineStatement executeRequestStatement = JavaModelFactoryImpl.eINSTANCE.createLineStatement();
		String executeRequest = "var response" + apiRequest.getId() + " = httpClient.execute(httpRequest);";
		executeRequestStatement.setLineContent(executeRequest);
		return executeRequestStatement;
	}
	
	protected List<Statement> addHeaders(APIRequest apiRequest) {
		List<Statement> statements = new ArrayList<>();
		
		for (Header header : apiRequest.getHeaders()) {
			LineStatement addHeaderStatement = JavaModelFactoryImpl.eINSTANCE.createLineStatement();
			String addHeader = "httpRequest" + apiRequest.getId() + ".setHeader(\"" +  header.getKey() + "\", \"" + header.getValue() + "\"";
			addHeaderStatement.setLineContent(addHeader);
			statements.add(addHeaderStatement);
		}
		
		return statements;
	}
	
	protected List<Statement> addAssertionStatements(APIRequest testStep) {
		List<Statement> assertionStatements = new ArrayList<>();
		
		for (Assertion assertion : testStep.getAssertions()) {
			if(assertion instanceof StatusAssertion) {
				assertionStatements.add(addStatusCodeAssertion((StatusAssertion) assertion, testStep));
			} else {
				throw new UnsupportedOperationException("We currently only support StatusAssertions.");
			}
		}
		
		return assertionStatements;
	}
	
	private Statement addStatusCodeAssertion(StatusAssertion statusAssertion, APIRequest apiRequest) {
		LineStatement assertionStatement = JavaModelFactoryImpl.eINSTANCE.createLineStatement();
		
		StringBuilder assertion = new StringBuilder();
		assertion.append("assertThat(response" + apiRequest.getId() + ".getCode()).isIn(");
		
		// transform List of successful codes to comma separated String
		String codes = statusAssertion.getSuccessfulCodes()
				.stream()
				.map((code) -> String.valueOf(code))
				.collect(Collectors.joining(", "));
		assertion.append(codes).append(");");
		
		assertionStatement.setLineContent(assertion.toString());
		
		dependencyHandler.addStaticDependency("org.assertj.core.api.Assertions.assertThat");
		
		return assertionStatement;
		
	}
}
