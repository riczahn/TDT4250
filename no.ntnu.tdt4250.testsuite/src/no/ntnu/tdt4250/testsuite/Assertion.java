/**
 */
package no.ntnu.tdt4250.testsuite;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.testsuite.Assertion#getErrorMessage <em>Error Message</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.testsuite.Assertion#getApiRequest <em>Api Request</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.testsuite.TestsuitePackage#getAssertion()
 * @model abstract="true"
 * @generated
 */
public interface Assertion extends EObject {
	/**
	 * Returns the value of the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Message</em>' attribute.
	 * @see #setErrorMessage(String)
	 * @see no.ntnu.tdt4250.testsuite.TestsuitePackage#getAssertion_ErrorMessage()
	 * @model
	 * @generated
	 */
	String getErrorMessage();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.testsuite.Assertion#getErrorMessage <em>Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Message</em>' attribute.
	 * @see #getErrorMessage()
	 * @generated
	 */
	void setErrorMessage(String value);

	/**
	 * Returns the value of the '<em><b>Api Request</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.testsuite.APIRequest#getAssertions <em>Assertions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Request</em>' container reference.
	 * @see #setApiRequest(APIRequest)
	 * @see no.ntnu.tdt4250.testsuite.TestsuitePackage#getAssertion_ApiRequest()
	 * @see no.ntnu.tdt4250.testsuite.APIRequest#getAssertions
	 * @model opposite="assertions" transient="false"
	 * @generated
	 */
	APIRequest getApiRequest();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.testsuite.Assertion#getApiRequest <em>Api Request</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Request</em>' container reference.
	 * @see #getApiRequest()
	 * @generated
	 */
	void setApiRequest(APIRequest value);

} // Assertion
