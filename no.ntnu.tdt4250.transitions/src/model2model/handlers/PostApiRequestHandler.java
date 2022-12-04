package model2model.handlers;

import java.util.List;

import javatest.LineStatement;
import javatest.Statement;
import javatest.impl.JavaModelFactoryImpl;
import testsuite.APIRequest;

public class PostApiRequestHandler extends ApiRequestHandler {
	
	public PostApiRequestHandler(DependencyHandler dependencyHandler) {
		this.dependencyHandler = dependencyHandler;
	}

	@Override
	public List<Statement> convertRequestToStatements(APIRequest apiRequest) {
		List<Statement> statements = addStatementsForHttpClient(apiRequest);
		
		LineStatement setBodyStatement = JavaModelFactoryImpl.eINSTANCE.createLineStatement();
		String body = "String body = \"" + apiRequest.getBody() + "\";";
		setBodyStatement.setLineContent(body);
		statements.add(setBodyStatement);
		
		LineStatement setRequestEntityStatement = JavaModelFactoryImpl.eINSTANCE.createLineStatement();
		String setRequestEntity = "httpRequest.setEntity(new StringEntity(body));";
		setRequestEntityStatement.setLineContent(setRequestEntity);
		statements.add(setRequestEntityStatement);
		
		statements.addAll(addHeaders(apiRequest.getHeaders()));
		
		statements.add(addRequestExecutionStatement());
		
		statements.addAll(addAssertionStatements(apiRequest));
		
		return statements;
	}

	@Override
	public Statement addRequestStatementAndDependency(APIRequest apiRequest) {
		LineStatement createHttpRequestStatement = JavaModelFactoryImpl.eINSTANCE.createLineStatement();
		String createHttpRequest = "var httpRequest = new HttpPost(\"" + apiRequest.getUri() + "\");";
		
		createHttpRequestStatement.setLineContent(createHttpRequest);
		dependencyHandler.addDependency("org.apache.hc.client5.http.classic.methods.HttpPost");
		
		return createHttpRequestStatement;
	}

}
