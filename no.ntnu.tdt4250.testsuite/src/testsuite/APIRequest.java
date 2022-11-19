/**
 */
package testsuite;

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
 *   <li>{@link testsuite.APIRequest#getUri <em>Uri</em>}</li>
 *   <li>{@link testsuite.APIRequest#getMethod <em>Method</em>}</li>
 *   <li>{@link testsuite.APIRequest#getParameters <em>Parameters</em>}</li>
 *   <li>{@link testsuite.APIRequest#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link testsuite.APIRequest#getBody <em>Body</em>}</li>
 *   <li>{@link testsuite.APIRequest#getHeaders <em>Headers</em>}</li>
 * </ul>
 *
 * @see testsuite.TestsuitePackage#getAPIRequest()
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
	 * @see testsuite.TestsuitePackage#getAPIRequest_Uri()
	 * @model required="true"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link testsuite.APIRequest#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link testsuite.Method}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see testsuite.Method
	 * @see #setMethod(Method)
	 * @see testsuite.TestsuitePackage#getAPIRequest_Method()
	 * @model required="true"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link testsuite.APIRequest#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see testsuite.Method
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link testsuite.InferrableParameter}.
	 * It is bidirectional and its opposite is '{@link testsuite.InferrableParameter#getApiRequest <em>Api Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see testsuite.TestsuitePackage#getAPIRequest_Parameters()
	 * @see testsuite.InferrableParameter#getApiRequest
	 * @model opposite="apiRequest" containment="true"
	 * @generated
	 */
	EList<InferrableParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Assertions</b></em>' containment reference list.
	 * The list contents are of type {@link testsuite.Assertion}.
	 * It is bidirectional and its opposite is '{@link testsuite.Assertion#getApiRequest <em>Api Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assertions</em>' containment reference list.
	 * @see testsuite.TestsuitePackage#getAPIRequest_Assertions()
	 * @see testsuite.Assertion#getApiRequest
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
	 * @see testsuite.TestsuitePackage#getAPIRequest_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link testsuite.APIRequest#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Headers</b></em>' containment reference list.
	 * The list contents are of type {@link testsuite.Header}.
	 * It is bidirectional and its opposite is '{@link testsuite.Header#getApiRequest <em>Api Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headers</em>' containment reference list.
	 * @see testsuite.TestsuitePackage#getAPIRequest_Headers()
	 * @see testsuite.Header#getApiRequest
	 * @model opposite="apiRequest" containment="true"
	 * @generated
	 */
	EList<Header> getHeaders();

} // APIRequest
