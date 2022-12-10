package json2java;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.emf.common.util.BasicMonitor;

import javatest.TestClass;
import json2model.LoadTestSuite;
import model2model.handlers.TestSuiteHandler;
import model2text.GenerateJavaCode;
import testsuite.TestSuite;

public class JsonToJavaConverter {

	public static void main(String[] args) throws IOException {
		String sourceFile;
		String destinationFolder;
		
		if (args.length == 2) {
			sourceFile = args[0];
			destinationFolder = args[1];
		} else {
			// default values
			sourceFile = "../no.ntnu.tdt4250.examples/json/ExampleTestSuiteOne.json";
			destinationFolder = "../no.ntnu.tdt4250.examples/java/";
		}
		
		TestSuite testSuite = LoadTestSuite.deserializeJSON(sourceFile);
		
		TestSuiteHandler testSuiteHandler = new TestSuiteHandler();
		TestClass testClass = testSuiteHandler.convertTestSuiteToTestClass(testSuite);
		
		GenerateJavaCode javaCodeGenerator = new GenerateJavaCode(testClass, new File(destinationFolder), new ArrayList<>());
		
		javaCodeGenerator.doGenerate(new BasicMonitor());

	}

}
