/**
 */
package testsuite;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testsuite.TestCase#getName <em>Name</em>}</li>
 *   <li>{@link testsuite.TestCase#getTestSteps <em>Test Steps</em>}</li>
 *   <li>{@link testsuite.TestCase#getTestSuite <em>Test Suite</em>}</li>
 * </ul>
 *
 * @see testsuite.TestsuitePackage#getTestCase()
 * @model
 * @generated
 */
public interface TestCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see testsuite.TestsuitePackage#getTestCase_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link testsuite.TestCase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Test Steps</b></em>' containment reference list.
	 * The list contents are of type {@link testsuite.TestStep}.
	 * It is bidirectional and its opposite is '{@link testsuite.TestStep#getTestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Steps</em>' containment reference list.
	 * @see testsuite.TestsuitePackage#getTestCase_TestSteps()
	 * @see testsuite.TestStep#getTestCase
	 * @model opposite="testCase" containment="true"
	 * @generated
	 */
	EList<TestStep> getTestSteps();

	/**
	 * Returns the value of the '<em><b>Test Suite</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link testsuite.TestSuite#getTestCases <em>Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Suite</em>' container reference.
	 * @see #setTestSuite(TestSuite)
	 * @see testsuite.TestsuitePackage#getTestCase_TestSuite()
	 * @see testsuite.TestSuite#getTestCases
	 * @model opposite="testCases" transient="false"
	 * @generated
	 */
	TestSuite getTestSuite();

	/**
	 * Sets the value of the '{@link testsuite.TestCase#getTestSuite <em>Test Suite</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Suite</em>' container reference.
	 * @see #getTestSuite()
	 * @generated
	 */
	void setTestSuite(TestSuite value);

} // TestCase
