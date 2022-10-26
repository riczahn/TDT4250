/**
 */
package no.ntnu.tdt4250.testsuite;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.testsuite.APIRequest#getUri <em>Uri</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.testsuite.APIRequest#getMethod <em>Method</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.testsuite.APIRequest#getParameters <em>Parameters</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.testsuite.APIRequest#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.testsuite.APIRequest#getBody <em>Body</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.testsuite.APIRequest#getHeaders <em>Headers</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.testsuite.TestsuitePackage#getAPIRequest()
 * @model
 * @generated
 */
public interface APIRequest extends TestStep {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see no.ntnu.tdt4250.testsuite.TestsuitePackage#getAPIRequest_Uri()
	 * @model required="true"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.testsuite.APIRequest#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link no.ntnu.tdt4250.testsuite.Method}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see no.ntnu.tdt4250.testsuite.Method
	 * @see #setMethod(Method)
	 * @see no.ntnu.tdt4250.testsuite.TestsuitePackage#getAPIRequest_Method()
	 * @model required="true"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.testsuite.APIRequest#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see no.ntnu.tdt4250.testsuite.Method
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.testsuite.InferrableParameter}.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.testsuite.InferrableParameter#getApiRequest <em>Api Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see no.ntnu.tdt4250.testsuite.TestsuitePackage#getAPIRequest_Parameters()
	 * @see no.ntnu.tdt4250.testsuite.InferrableParameter#getApiRequest
	 * @model opposite="apiRequest" containment="true"
	 * @generated
	 */
	EList<InferrableParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Assertions</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.testsuite.Assertion}.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.testsuite.Assertion#getApiRequest <em>Api Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assertions</em>' containment reference list.
	 * @see no.ntnu.tdt4250.testsuite.TestsuitePackage#getAPIRequest_Assertions()
	 * @see no.ntnu.tdt4250.testsuite.Assertion#getApiRequest
	 * @model opposite="apiRequest" containment="true"
	 * @generated
	 */
	EList<Assertion> getAssertions();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see no.ntnu.tdt4250.testsuite.TestsuitePackage#getAPIRequest_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.testsuite.APIRequest#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Headers</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.testsuite.Header}.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.testsuite.Header#getApiRequest <em>Api Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headers</em>' containment reference list.
	 * @see no.ntnu.tdt4250.testsuite.TestsuitePackage#getAPIRequest_Headers()
	 * @see no.ntnu.tdt4250.testsuite.Header#getApiRequest
	 * @model opposite="apiRequest" containment="true"
	 * @generated
	 */
	EList<Header> getHeaders();

} // APIRequest
