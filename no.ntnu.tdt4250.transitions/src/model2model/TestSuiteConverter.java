package model2model;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import javatest.TestClass;
import model2model.handlers.TestSuiteHandler;
import model2model.io.FileHelper;
import testsuite.TestSuite;



public class TestSuiteConverter {
	
	private static final FileHelper fileHelper = new FileHelper();
	private static final TestSuiteHandler testSuiteHandler = new TestSuiteHandler();
	
	public static void main(String[] args) throws IOException {
		transformTestSuiteModelInstanceToJavaTestModelInstance(FileHelper.EXAMPLE_ONE_TESTSUITE_XMI_FILE);
		String sourceFile;
		String destinationFile;
		
		if (args.length == 2) {
			sourceFile = args[0];
			destinationFile = args[1];
		} else {
			// default values
			sourceFile = FileHelper.EXAMPLE_ONE_TESTSUITE_XMI_FILE;
			destinationFile = fileHelper.adjustFilePathToPointToJavaModelDirectory(sourceFile);
		}
		
		TestSuite testSuite =  fileHelper.loadTestSuiteFromXmiFile(sourceFile);
		TestClass testClass = testSuiteHandler.convertTestSuiteToTestClass(testSuite);
		fileHelper.saveTestClassAsXmi(testClass, destinationFile);
	}
	
	public static void transformTestSuiteModelInstanceToJavaTestModelInstance(String filename) throws IOException {
		TestSuite testSuite = fileHelper.loadTestSuiteFromXmiFile(filename);
		
		TestClass testClass = testSuiteHandler.convertTestSuiteToTestClass(testSuite);
		
		// keep the name, but adjust the file path to point to the correct directory
		String targetFilename = fileHelper.adjustFilePathToPointToJavaModelDirectory(filename);
		fileHelper.saveTestClassAsXmi(testClass, targetFilename);
	}
}