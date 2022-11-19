/**
 */
package testsuite;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testsuite.Header#getKey <em>Key</em>}</li>
 *   <li>{@link testsuite.Header#getValue <em>Value</em>}</li>
 *   <li>{@link testsuite.Header#getApiRequest <em>Api Request</em>}</li>
 * </ul>
 *
 * @see testsuite.TestsuitePackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see testsuite.TestsuitePackage#getHeader_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link testsuite.Header#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see testsuite.TestsuitePackage#getHeader_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link testsuite.Header#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Api Request</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link testsuite.APIRequest#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Request</em>' container reference.
	 * @see #setApiRequest(APIRequest)
	 * @see testsuite.TestsuitePackage#getHeader_ApiRequest()
	 * @see testsuite.APIRequest#getHeaders
	 * @model opposite="headers" transient="false"
	 * @generated
	 */
	APIRequest getApiRequest();

	/**
	 * Sets the value of the '{@link testsuite.Header#getApiRequest <em>Api Request</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Request</em>' container reference.
	 * @see #getApiRequest()
	 * @generated
	 */
	void setApiRequest(APIRequest value);

} // Header
