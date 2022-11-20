package transition;

import java.io.IOException;
import JavaModel.Method;
import JavaModel.TestClass;
import JavaModel.impl.JavaModelFactoryImpl;
import testsuite.TestCase;
import testsuite.TestSuite;
import transition.handlers.TestCaseHandler;
import transition.io.FileHelper;



public class TestSuiteConverter {
	
	public static void main(String[] args) throws IOException {
		TestSuite testSuite = FileHelper.loadTestSuite();
		
		// convert instance of TestSuite to instance of JavaModel
		TestClass testClass = JavaModelFactoryImpl.eINSTANCE.createTestClass();
		testClass.setName(testSuite.getName());
		
		for(TestCase testCase : testSuite.getTestCases()) {
			Method testMethod = TestCaseHandler.convertTestCaseToMethod(testCase);
			testClass.getTestMethods().add(testMethod);
		}
		
		FileHelper.saveTestClass(testClass);
	}

}