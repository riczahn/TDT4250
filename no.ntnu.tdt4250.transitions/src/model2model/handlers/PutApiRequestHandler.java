package model2model.handlers;

import java.util.List;

import javatest.LineStatement;
import javatest.Statement;
import javatest.impl.JavaModelFactoryImpl;
import testsuite.APIRequest;

public class PutApiRequestHandler extends ApiRequestHandler {
	
	public PutApiRequestHandler(DependencyHandler dependencyHandler) {
		this.dependencyHandler = dependencyHandler;
	}

	@Override
	public List<Statement> convertRequestToStatements(APIRequest apiRequest) {
		List<Statement> statements = addStatementsForHttpClient(apiRequest);
		
		LineStatement setBodyStatement = JavaModelFactoryImpl.eINSTANCE.createLineStatement();
		String body = "String body" + apiRequest.getId() + " = \"" + apiRequest.getBody() + "\";";
		setBodyStatement.setLineContent(body);
		statements.add(setBodyStatement);
		
		LineStatement setRequestEntityStatement = JavaModelFactoryImpl.eINSTANCE.createLineStatement();
		String setRequestEntity = "httpRequest" + apiRequest.getId() + ".setEntity(new StringEntity(body));";
		setRequestEntityStatement.setLineContent(setRequestEntity);
		statements.add(setRequestEntityStatement);
		
		statements.addAll(addHeaders(apiRequest));
		
		statements.add(addRequestExecutionStatement(apiRequest));
		
		statements.addAll(addAssertionStatements(apiRequest));
		
		return statements;
	}

	@Override
	public Statement addRequestStatementAndDependency(APIRequest apiRequest) {
		LineStatement createHttpRequestStatement = JavaModelFactoryImpl.eINSTANCE.createLineStatement();
		String createHttpRequest = "var httpRequest" + apiRequest.getId() + " = new HttpPut(\"" + apiRequest.getUri() + "\");";
		
		createHttpRequestStatement.setLineContent(createHttpRequest);
		dependencyHandler.addDependency("org.apache.hc.client5.http.classic.methods.HttpPut");
		
		return createHttpRequestStatement;
	}

}
