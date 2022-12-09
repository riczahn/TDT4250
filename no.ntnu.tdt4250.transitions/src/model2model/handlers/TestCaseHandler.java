package model2model.handlers;

import java.util.List;
import javatest.LineStatement;
import javatest.Method;
import javatest.Statement;
import javatest.impl.JavaModelFactoryImpl;
import testsuite.TestCase;
import testsuite.TestStep;

public class TestCaseHandler {
	
	private final TestStepHandler testStepHandler;
	public final DependencyHandler dependencyHandler;
	
	public TestCaseHandler() {
		this(new DependencyHandler());
	}
	
	public TestCaseHandler(DependencyHandler dependencyHandler) {
		this.testStepHandler = new TestStepHandler(dependencyHandler);
		this.dependencyHandler = dependencyHandler;
	}
	
	public Method convertTestCaseToMethod(TestCase testCase) {
		Method testMethod = JavaModelFactoryImpl.eINSTANCE.createMethod();
		
		// process each request of the test case
		testMethod.setName(testCase.getName());
		for(TestStep testStep : testCase.getTestSteps()) {
			List<Statement> statementsForTestStep = testStepHandler.convertTestStepToStatements(testStep);
			
			testMethod.getStatements().addAll(statementsForTestStep);
			
			// add new line
			LineStatement newLineStatement = JavaModelFactoryImpl.eINSTANCE.createLineStatement();
			newLineStatement.setLineContent("\n");
			testMethod.getStatements().add(newLineStatement);
		}
		
		// add test annotation and corresponding import
		testMethod.getAnnotations().add("@Test");
		dependencyHandler.addDependency("org.junit.jupiter.api.Test");
		
		return testMethod;
	}
	
	
}
