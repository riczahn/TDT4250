package model2model.handlers;

import java.util.ArrayList;
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
		List<Statement> statements = new ArrayList<>();
		statements.add(addRequestStatementAndDependency(apiRequest));
		statements.addAll(addHeaders(apiRequest));
		statements.addAll(addBodyToRequest(apiRequest));
		
		statements.add(addRequestExecutionStatement(apiRequest));
		
		statements.addAll(addAssertionStatements(apiRequest));
		
		return statements;
	}

	@Override
	public Statement addRequestStatementAndDependency(APIRequest apiRequest) {
		LineStatement createHttpRequestStatement = JavaModelFactoryImpl.eINSTANCE.createLineStatement();
		String createHttpRequest = "var httpRequest" + apiRequest.getId() + " = new HttpPost(\"" + apiRequest.getUri() + "\");";
		
		createHttpRequestStatement.setLineContent(createHttpRequest);
		dependencyHandler.addDependency("org.apache.hc.client5.http.classic.methods.HttpPost");
		
		return createHttpRequestStatement;
	}
	
	private List<Statement> addBodyToRequest(APIRequest apiRequest) {
		List<Statement> statements = new ArrayList<>();
		
		LineStatement setBodyStatement = JavaModelFactoryImpl.eINSTANCE.createLineStatement();
		// TODO: Escaping of " does not work for whatever reason...
		String body = "String body" + apiRequest.getId() + " = \"" + apiRequest.getBody() + "\";";
		setBodyStatement.setLineContent(body);
		statements.add(setBodyStatement);
		
		LineStatement setRequestEntityStatement = JavaModelFactoryImpl.eINSTANCE.createLineStatement();
		String setRequestEntity = "httpRequest" + apiRequest.getId() + ".setEntity(new StringEntity(body));";
		setRequestEntityStatement.setLineContent(setRequestEntity);
		statements.add(setRequestEntityStatement);
		
		return statements;
	}
}
