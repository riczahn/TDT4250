package no.ntnu.tdt4250.testsuite.examples;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emfcloud.jackson.resource.JsonResourceFactory;

import no.ntnu.tdt4250.testsuite.TestsuitePackage;

public class LoadTestSuite {

	public static void main(String[] args) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(TestsuitePackage.eNS_URI, TestsuitePackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry()
						.getExtensionToFactoryMap()
						.put("json", new JsonResourceFactory());
	
		Resource resource = resourceSet.getResource(URI.createURI(LoadTestSuite.class.getResource("exampleData.json").toString()), true);
		System.out.println(resource.toString());
		System.out.println(resource.getContents());
	}

}
