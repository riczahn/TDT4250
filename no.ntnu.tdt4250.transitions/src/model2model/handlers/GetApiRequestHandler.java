package model2model.handlers;

import java.util.ArrayList;
import java.util.List;

import javatest.LineStatement;
import javatest.Statement;
import javatest.impl.JavaModelFactoryImpl;
import testsuite.APIRequest;

public class GetApiRequestHandler extends ApiRequestHandler{
	
	public GetApiRequestHandler(DependencyHandler dependencyHandler) {
		this.dependencyHandler = dependencyHandler;
	}

	@Override
	public List<Statement> convertRequestToStatements(APIRequest apiRequest) {
		List<Statement> statements = new ArrayList<>();
		statements.add(addRequestStatementAndDependency(apiRequest));
		statements.addAll(addHeaders(apiRequest));
		
		statements.add(addRequestExecutionStatement(apiRequest));
		
		statements.addAll(addAssertionStatements(apiRequest));
		
		return statements;
	}

	@Override
	public Statement addRequestStatementAndDependency(APIRequest apiRequest) {
		LineStatement createHttpRequestStatement = JavaModelFactoryImpl.eINSTANCE.createLineStatement();
		String createHttpRequest = "var httpRequest" + apiRequest.getId() + " = new HttpGet(\"" + apiRequest.getUri() + "\");";
		
		createHttpRequestStatement.setLineContent(createHttpRequest);
		dependencyHandler.addDependency("org.apache.hc.client5.http.classic.methods.HttpGet");
		
		return createHttpRequestStatement;
	}

}
