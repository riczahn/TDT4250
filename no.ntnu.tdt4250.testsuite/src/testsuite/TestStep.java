/**
 */
package testsuite;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testsuite.TestStep#getId <em>Id</em>}</li>
 *   <li>{@link testsuite.TestStep#getTestCase <em>Test Case</em>}</li>
 * </ul>
 *
 * @see testsuite.TestsuitePackage#getTestStep()
 * @model
 * @generated
 */
public interface TestStep extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see testsuite.TestsuitePackage#getTestStep_Id()
	 * @model required="true"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link testsuite.TestStep#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Test Case</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link testsuite.TestCase#getTestSteps <em>Test Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Case</em>' container reference.
	 * @see #setTestCase(TestCase)
	 * @see testsuite.TestsuitePackage#getTestStep_TestCase()
	 * @see testsuite.TestCase#getTestSteps
	 * @model opposite="testSteps" transient="false"
	 * @generated
	 */
	TestCase getTestCase();

	/**
	 * Sets the value of the '{@link testsuite.TestStep#getTestCase <em>Test Case</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Case</em>' container reference.
	 * @see #getTestCase()
	 * @generated
	 */
	void setTestCase(TestCase value);

} // TestStep
