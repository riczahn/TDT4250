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
	public static final String EXAMPLES_JSON_FOLDER = EXAMPLES_FOLDER + "json/";
	public static final String EXAMPLES_JAVA_FOLDER = EXAMPLES_FOLDER + "java/";
	public static final String EXAMPLE_TEST_SUITE_XMI_FILE = EXAMPLES_XMI_FOLDER + "ExampleTestSuite.xmi";
	public static final String EXAMPLE_JAVA_MODEL_XMI_FILE = EXAMPLES_XMI_FOLDER + "ExampleTestSuiteJavaModel.xmi";
	
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
	
	public String addBeforeFileExtension(String originalFilename, String x) {
		int indexOfFileExtensionBegin = originalFilename.lastIndexOf('.');
		String filenameWithoutExtension = originalFilename.substring(0, indexOfFileExtensionBegin);
		String extension = originalFilename.substring(indexOfFileExtensionBegin);
		return filenameWithoutExtension + x + extension;
	}
	
	public String replaceFileExtension(String originalFilename, String desiredFileExtension) {
		int indexOfFileExtensionBegin = originalFilename.lastIndexOf('.');
		String filename = originalFilename.substring(0, indexOfFileExtensionBegin);
		
		return filename + desiredFileExtension;
	}
}
