package model2model;

import java.io.IOException;
import javatest.TestClass;
import model2model.handlers.TestSuiteHandler;
import model2model.io.FileHelper;
import testsuite.TestSuite;



public class TestSuiteConverter {
	
	private static final FileHelper fileHelper = new FileHelper();
	private static final TestSuiteHandler testSuiteHandler = new TestSuiteHandler();
	
	public static void main(String[] args) throws IOException {
		transformTestSuiteModelInstanceToJavaTestModelInstance(FileHelper.EXAMPLE_TEST_SUITE_XMI_FILE);
		
		// or alternatively start the workflow from a JSON file
		// t.b.d.
		// processJsonFile(FileHelper.EXAMPLE_TEST_SUITE_JSON_FILE);
	}
	
	public static void transformTestSuiteModelInstanceToJavaTestModelInstance(String filename) throws IOException {
		TestSuite testSuite = fileHelper.loadTestSuiteFromXmiFile(filename);
		
		TestClass testClass = testSuiteHandler.convertTestSuiteToTestClass(testSuite);
		
		// save the instance in the same folder, with the same name but "AsJavaTestModel" before the file extension
		String targetFilename = fileHelper.addBeforeFileExtension(filename, "AsJavaTestModel");
		fileHelper.saveTestClassAsXmi(testClass, targetFilename);
	}
}