/**
 */
package testsuite;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inferrable Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testsuite.InferrableParameter#getName <em>Name</em>}</li>
 *   <li>{@link testsuite.InferrableParameter#getParameterLocation <em>Parameter Location</em>}</li>
 *   <li>{@link testsuite.InferrableParameter#getApiRequest <em>Api Request</em>}</li>
 *   <li>{@link testsuite.InferrableParameter#getTestStepId <em>Test Step Id</em>}</li>
 *   <li>{@link testsuite.InferrableParameter#getJsonPath <em>Json Path</em>}</li>
 * </ul>
 *
 * @see testsuite.TestsuitePackage#getInferrableParameter()
 * @model
 * @generated
 */
public interface InferrableParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see testsuite.TestsuitePackage#getInferrableParameter_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link testsuite.InferrableParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Location</b></em>' attribute.
	 * The literals are from the enumeration {@link testsuite.ParameterLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Location</em>' attribute.
	 * @see testsuite.ParameterLocation
	 * @see #setParameterLocation(ParameterLocation)
	 * @see testsuite.TestsuitePackage#getInferrableParameter_ParameterLocation()
	 * @model required="true"
	 * @generated
	 */
	ParameterLocation getParameterLocation();

	/**
	 * Sets the value of the '{@link testsuite.InferrableParameter#getParameterLocation <em>Parameter Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Location</em>' attribute.
	 * @see testsuite.ParameterLocation
	 * @see #getParameterLocation()
	 * @generated
	 */
	void setParameterLocation(ParameterLocation value);

	/**
	 * Returns the value of the '<em><b>Api Request</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link testsuite.APIRequest#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Request</em>' container reference.
	 * @see #setApiRequest(APIRequest)
	 * @see testsuite.TestsuitePackage#getInferrableParameter_ApiRequest()
	 * @see testsuite.APIRequest#getParameters
	 * @model opposite="parameters" transient="false"
	 * @generated
	 */
	APIRequest getApiRequest();

	/**
	 * Sets the value of the '{@link testsuite.InferrableParameter#getApiRequest <em>Api Request</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Request</em>' container reference.
	 * @see #getApiRequest()
	 * @generated
	 */
	void setApiRequest(APIRequest value);

	/**
	 * Returns the value of the '<em><b>Test Step Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Step Id</em>' attribute.
	 * @see #setTestStepId(long)
	 * @see testsuite.TestsuitePackage#getInferrableParameter_TestStepId()
	 * @model required="true"
	 * @generated
	 */
	long getTestStepId();

	/**
	 * Sets the value of the '{@link testsuite.InferrableParameter#getTestStepId <em>Test Step Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Step Id</em>' attribute.
	 * @see #getTestStepId()
	 * @generated
	 */
	void setTestStepId(long value);

	/**
	 * Returns the value of the '<em><b>Json Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json Path</em>' attribute.
	 * @see #setJsonPath(String)
	 * @see testsuite.TestsuitePackage#getInferrableParameter_JsonPath()
	 * @model required="true"
	 * @generated
	 */
	String getJsonPath();

	/**
	 * Sets the value of the '{@link testsuite.InferrableParameter#getJsonPath <em>Json Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json Path</em>' attribute.
	 * @see #getJsonPath()
	 * @generated
	 */
	void setJsonPath(String value);

} // InferrableParameter
