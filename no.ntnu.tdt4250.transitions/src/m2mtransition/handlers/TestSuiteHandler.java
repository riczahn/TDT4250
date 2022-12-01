package m2mtransition.handlers;

import javatest.Method;
import javatest.TestClass;
import javatest.impl.JavaModelFactoryImpl;
import testsuite.TestCase;
import testsuite.TestSuite;

public class TestSuiteHandler {
	
	private final TestCaseHandler testCaseHandler;
	
	public TestSuiteHandler() {
		this(new TestCaseHandler());
	}
	
	public TestSuiteHandler(TestCaseHandler testCaseHandler) {
		this.testCaseHandler = testCaseHandler;
	}
	
	public TestClass convertTestSuiteToTestClass(TestSuite testSuite) {
		TestClass testClass = JavaModelFactoryImpl.eINSTANCE.createTestClass();
		testClass.setName(testSuite.getName());
		
		for(TestCase testCase : testSuite.getTestCases()) {
			Method testMethod = testCaseHandler.convertTestCaseToMethod(testCase);
			testClass.getTestMethods().add(testMethod);
		}
		
		// TODO: Here are the import statements missing. See DependencyHandler
		
		return testClass;
	}

}
