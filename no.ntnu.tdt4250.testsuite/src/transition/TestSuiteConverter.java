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
		processXmiFile(FileHelper.EXAMPLE_TEST_SUITE_XMI_FILE);
		
		// or alternatively start the workflow from a JSON file
		// t.b.d.
		// processJsonFile(FileHelper.EXAMPLE_TEST_SUITE_JSON_FILE);
	}
	
	public static void processXmiFile(String filename) throws IOException {
		TestSuite testSuite = FileHelper.loadTestSuite();
		
		// convert instance of TestSuite to instance of JavaModel
		TestClass testClass = JavaModelFactoryImpl.eINSTANCE.createTestClass();
		testClass.setName(testSuite.getName());
		
		TestCaseHandler testCaseHandler = new TestCaseHandler();
		
		for(TestCase testCase : testSuite.getTestCases()) {
			Method testMethod = testCaseHandler.convertTestCaseToMethod(testCase);
			testClass.getTestMethods().add(testMethod);
		}
		
		FileHelper.saveTestClass(testClass);
	}
}