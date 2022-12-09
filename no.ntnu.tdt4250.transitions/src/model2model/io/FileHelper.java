package model2model.io;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import javatest.TestClass;
import testsuite.TestSuite;
import testsuite.TestsuitePackage;

public class FileHelper {
	
	public static final String EXAMPLES_FOLDER = "../no.ntnu.tdt4250.examples/";
	
	public static final String EXAMPLES_XMI_FOLDER = EXAMPLES_FOLDER + "xmi/";
	public static final String EXAMPLES_XMI_TESTSUITE_FOLDER = EXAMPLES_XMI_FOLDER + "testsuite/";
	public static final String EXAMPLES_XMI_JAVATESTS_FOLDER = EXAMPLES_XMI_FOLDER + "javatests/";
	
	public static final String EXAMPLES_JSON_FOLDER = EXAMPLES_FOLDER + "json/";
	
	public static final String EXAMPLES_JAVA_FOLDER = EXAMPLES_FOLDER + "java/";
	
	public static final String EXAMPLE_ONE_TESTSUITE_XMI_FILE = EXAMPLES_XMI_TESTSUITE_FOLDER + "ExampleTestSuiteOne.xmi";
	public static final String EXAMPLE_TWO_TESTSUITE_XMI_FILE = EXAMPLES_XMI_TESTSUITE_FOLDER + "ExampleTestSuiteTwo.xmi";
	
	public static final String EXAMPLE_ONE_JAVATEST_MODEL_XMI_FILE = EXAMPLES_XMI_JAVATESTS_FOLDER + "ExampleTestSuiteOneAsJavaModel.xmi";
	public static final String EXAMPLE_TWO_JAVATEST_MODEL_XMI_FILE = EXAMPLES_XMI_JAVATESTS_FOLDER + "ExampleTestSuiteTwoAsJavaModel.xmi";
	
	public TestSuite loadTestSuiteFromXmiFile(String filepath) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(TestsuitePackage.eNS_URI, TestsuitePackage.eINSTANCE);
		
		resourceSet.getResourceFactoryRegistry()
		.getExtensionToFactoryMap()
		.put("xmi", new XMIResourceFactoryImpl());
		
		Resource resource = resourceSet.getResource(URI.createURI(filepath), true);
		return (TestSuite) resource.getContents().get(0);
	}
	
	public void saveTestClassAsXmi(TestClass testClass, String filepath) throws IOException {
		Resource javaModelResource = new XMIResourceFactoryImpl().createResource(URI.createURI(filepath));
		javaModelResource.getContents().add(testClass);
		javaModelResource.save(null);
	}
	
	/**
	 * Extracts the filename from the originalFilepath and puts the path to the examples xmi javatests folder in front of it.
	 * @param originalFilepath The path of the testsuite file
	 * @return Corrected file path
	 */
	public String adjustFilePathToPointToJavaModelDirectory(String originalFilepath) {
		int indexOfBeginOfFilename = originalFilepath.lastIndexOf('/');
		String filename = originalFilepath.substring(indexOfBeginOfFilename);
		return EXAMPLES_XMI_JAVATESTS_FOLDER + filename;
	}
}
