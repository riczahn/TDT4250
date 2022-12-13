package model2model.handlers;

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
		String className = Character.toUpperCase(testSuite.getName().charAt(0)) + testSuite.getName().substring(1);
		testClass.setName(className.replace(" ", ""));
		testClass.setPackage("no.ntnu.tdt4250.testpackage");
		
		for(TestCase testCase : testSuite.getTestCases()) {
			Method testMethod = testCaseHandler.convertTestCaseToMethod(testCase);
			testClass.getTestMethods().add(testMethod);
		}
		
		testClass.getImports().addAll(testCaseHandler.dependencyHandler.getImportStatements());
		
		return testClass;
	}

}
