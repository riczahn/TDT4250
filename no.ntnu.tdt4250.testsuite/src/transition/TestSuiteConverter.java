package transition;

import java.io.IOException;
import JavaModel.TestClass;
import testsuite.TestSuite;
import transition.handlers.TestSuiteHandler;
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
		TestSuiteHandler testSuiteHandler = new TestSuiteHandler();
		TestClass testClass = testSuiteHandler.convertTestSuiteToTestClass(testSuite);
		
		FileHelper.saveTestClass(testClass);
	}
}