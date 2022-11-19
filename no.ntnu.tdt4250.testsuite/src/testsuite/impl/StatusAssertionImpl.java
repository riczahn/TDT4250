/**
 */
package testsuite.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import testsuite.StatusAssertion;
import testsuite.TestsuitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Status Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link testsuite.impl.StatusAssertionImpl#getSuccessfulCodes <em>Successful Codes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatusAssertionImpl extends AssertionImpl implements StatusAssertion {
	/**
	 * The cached value of the '{@link #getSuccessfulCodes() <em>Successful Codes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessfulCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> successfulCodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatusAssertionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestsuitePackage.Literals.STATUS_ASSERTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getSuccessfulCodes() {
		if (successfulCodes == null) {
			successfulCodes = new EDataTypeUniqueEList<Integer>(Integer.class, this, TestsuitePackage.STATUS_ASSERTION__SUCCESSFUL_CODES);
		}
		return successfulCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestsuitePackage.STATUS_ASSERTION__SUCCESSFUL_CODES:
				return getSuccessfulCodes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TestsuitePackage.STATUS_ASSERTION__SUCCESSFUL_CODES:
				getSuccessfulCodes().clear();
				getSuccessfulCodes().addAll((Collection<? extends Integer>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TestsuitePackage.STATUS_ASSERTION__SUCCESSFUL_CODES:
				getSuccessfulCodes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TestsuitePackage.STATUS_ASSERTION__SUCCESSFUL_CODES:
				return successfulCodes != null && !successfulCodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (successfulCodes: ");
		result.append(successfulCodes);
		result.append(')');
		return result.toString();
	}

} //StatusAssertionImpl
