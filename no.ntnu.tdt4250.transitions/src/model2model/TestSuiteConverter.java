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
		transformTestSuiteModelInstanceToJavaTestModelInstance(FileHelper.EXAMPLE_ONE_TESTSUITE_XMI_FILE);
	}
	
	public static void transformTestSuiteModelInstanceToJavaTestModelInstance(String filename) throws IOException {
		TestSuite testSuite = fileHelper.loadTestSuiteFromXmiFile(filename);
		
		TestClass testClass = testSuiteHandler.convertTestSuiteToTestClass(testSuite);
		
		// keep the name, but adjust the file path to point to the correct directory
		String targetFilename = fileHelper.adjustFilePathToPointToJavaModelDirectory(filename);
		fileHelper.saveTestClassAsXmi(testClass, targetFilename);
	}
}