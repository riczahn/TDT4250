package model2model.handlers;

import java.util.List;
import java.util.Set;

import javatest.Statement;
import testsuite.APIRequest;
import testsuite.TestStep;

public class TestStepHandler {
	
	private final DependencyHandler dependencyHandler;
	
	public TestStepHandler() {
		this(new DependencyHandler());
	}
	
	public TestStepHandler(DependencyHandler importHandler) {
		this.dependencyHandler = importHandler;
	}
	
	public List<Statement> convertTestStepToStatements(TestStep testStep) {
		if (testStep instanceof APIRequest) {
			return convertApiRequestToStatements((APIRequest) testStep);
		}
		
		throw new UnsupportedOperationException("Currently we can't process normal TestSteps.");
	}
	
	private List<Statement> convertApiRequestToStatements(APIRequest testStep) {
		ApiRequestHandler apiRequestHandler = ApiRequestHandler.getResponsibleApiRequestHandler(testStep.getMethod(), dependencyHandler);
		
		return apiRequestHandler.convertRequestToStatements(testStep);
	}

	public Set<String> getNecessaryImports() {
		return dependencyHandler.getImportStatements();
	}

}
