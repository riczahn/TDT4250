package transition.io;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import JavaModel.TestClass;
import testsuite.TestSuite;
import testsuite.TestsuitePackage;

public class FileHelper {
	
	public static final String EXAMPLES_FOLDER = "../no.ntnu.tdt4250.examples/";
	public static final String EXAMPLES_XMI_FOLDER = EXAMPLES_FOLDER + "xmi/";
	public static final String EXAMPLES_JSON_FOLDER = EXAMPLES_FOLDER + "json/";
	public static final String EXAMPLES_JAVA_FOLDER = EXAMPLES_FOLDER + "java/";
	public static final String EXAMPLE_TEST_SUITE_XMI_FILE = EXAMPLES_XMI_FOLDER + "ExampleTestSuite.xmi";
	public static final String EXAMPLE_TEST_SUITE_JAVA_FILE = EXAMPLES_XMI_FOLDER + "ExampleTestSuiteJavaModel.xmi";
	
	public static TestSuite loadTestSuite() {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(TestsuitePackage.eNS_URI, TestsuitePackage.eINSTANCE);
		
		resourceSet.getResourceFactoryRegistry()
		.getExtensionToFactoryMap()
		.put("xmi", new XMIResourceFactoryImpl());
		
		Resource resource = resourceSet.getResource(URI.createURI(EXAMPLE_TEST_SUITE_XMI_FILE), true);
		return (TestSuite) resource.getContents().get(0);
	}
	
	public static void saveTestClass(TestClass testClass) throws IOException {
		Resource javaModelResource = new XMIResourceFactoryImpl().createResource(URI.createURI(EXAMPLE_TEST_SUITE_JAVA_FILE));
		javaModelResource.getContents().add(testClass);
		javaModelResource.save(System.out, null);
	}
}
