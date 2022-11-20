package transition.handlers;

import java.util.List;
import JavaModel.LineStatement;
import JavaModel.Method;
import JavaModel.Statement;
import JavaModel.impl.JavaModelFactoryImpl;
import testsuite.TestCase;
import testsuite.TestStep;

public class TestCaseHandler {
	
	private final TestStepHandler testStepHandler;
	
	public TestCaseHandler() {
		this(new TestStepHandler());
	}
	
	public TestCaseHandler(TestStepHandler testStepHandler) {
		this.testStepHandler = testStepHandler;
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
		
		// TODO: Here are annotations missing. Each method needs the @Test annotation
		// don't forget to add the import 'org.junit.jupiter.api.Test'
		
		return testMethod;
	}
	
	
}
