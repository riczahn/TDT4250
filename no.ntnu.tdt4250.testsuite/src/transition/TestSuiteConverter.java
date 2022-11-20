package transition;

import java.io.IOException;
import JavaModel.TestClass;
import testsuite.TestSuite;
import transition.handlers.TestSuiteHandler;
import transition.io.FileHelper;



public class TestSuiteConverter {
	
	private static final FileHelper fileHelper = new FileHelper();
	private static final TestSuiteHandler testSuiteHandler = new TestSuiteHandler();
	
	public static void main(String[] args) throws IOException {
		processXmiFile(FileHelper.EXAMPLE_TEST_SUITE_XMI_FILE);
		
		// or alternatively start the workflow from a JSON file
		// t.b.d.
		// processJsonFile(FileHelper.EXAMPLE_TEST_SUITE_JSON_FILE);
	}
	
	public static void processXmiFile(String filename) throws IOException {
		TestSuite testSuite = fileHelper.loadTestSuiteFromXmiFile(FileHelper.EXAMPLE_TEST_SUITE_XMI_FILE);
		
		TestClass testClass = testSuiteHandler.convertTestSuiteToTestClass(testSuite);
		
		fileHelper.saveTestClassAsXmi(testClass, FileHelper.EXAMPLE_JAVA_MODEL_XMI_FILE);
	}
}