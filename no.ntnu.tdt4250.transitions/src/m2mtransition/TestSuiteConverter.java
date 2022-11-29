package m2mtransition;

import java.io.IOException;
import javatest.TestClass;
import m2mtransition.handlers.TestSuiteHandler;
import m2mtransition.io.FileHelper;
import testsuite.TestSuite;



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