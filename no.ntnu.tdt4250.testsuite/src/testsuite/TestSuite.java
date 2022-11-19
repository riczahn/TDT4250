/**
 */
package testsuite;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Suite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testsuite.TestSuite#getName <em>Name</em>}</li>
 *   <li>{@link testsuite.TestSuite#getTestCases <em>Test Cases</em>}</li>
 * </ul>
 *
 * @see testsuite.TestsuitePackage#getTestSuite()
 * @model
 * @generated
 */
public interface TestSuite extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see testsuite.TestsuitePackage#getTestSuite_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link testsuite.TestSuite#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Test Cases</b></em>' containment reference list.
	 * The list contents are of type {@link testsuite.TestCase}.
	 * It is bidirectional and its opposite is '{@link testsuite.TestCase#getTestSuite <em>Test Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Cases</em>' containment reference list.
	 * @see testsuite.TestsuitePackage#getTestSuite_TestCases()
	 * @see testsuite.TestCase#getTestSuite
	 * @model opposite="testSuite" containment="true"
	 * @generated
	 */
	EList<TestCase> getTestCases();

} // TestSuite
