/**
 */
package no.ntnu.tdt4250.testsuite;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.testsuite.StatusAssertion#getSuccessfulCodes <em>Successful Codes</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.testsuite.TestsuitePackage#getStatusAssertion()
 * @model
 * @generated
 */
public interface StatusAssertion extends Assertion {
	/**
	 * Returns the value of the '<em><b>Successful Codes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successful Codes</em>' attribute list.
	 * @see no.ntnu.tdt4250.testsuite.TestsuitePackage#getStatusAssertion_SuccessfulCodes()
	 * @model
	 * @generated
	 */
	EList<Integer> getSuccessfulCodes();

} // StatusAssertion
