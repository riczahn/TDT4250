package no.ntnu.tdt4250.testsuite.example;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emfcloud.jackson.resource.JsonResourceFactory;

import no.ntnu.tdt4250.testsuite.TestSuite;
import no.ntnu.tdt4250.testsuite.TestsuiteFactory;

public class LoadTestSuite {

	public static void main(String[] args) {
		
		
		ResourceSet resourceSet = new ResourceSetImpl();
		
		resourceSet.getResourceFactoryRegistry()
						.getExtensionToFactoryMap()
						.put("json", new JsonResourceFactory());
	
		
		Resource resource = resourceSet.createResource
				  (URI.createFileURI("src/no/ntnu/tdt4250/testsuite/example/output.json"));
		
		TestSuite ts = TestsuiteFactory.eINSTANCE.createTestSuite();
		
		ts.setName("testSuite");
		
		resource.getContents().add((EObject)ts);
		
		try {
			resource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
