/**
 */
package testsuite.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import testsuite.TestCase;
import testsuite.TestStep;
import testsuite.TestSuite;
import testsuite.TestsuitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link testsuite.impl.TestCaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link testsuite.impl.TestCaseImpl#getTestSteps <em>Test Steps</em>}</li>
 *   <li>{@link testsuite.impl.TestCaseImpl#getTestSuite <em>Test Suite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestCaseImpl extends MinimalEObjectImpl.Container implements TestCase {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestSteps() <em>Test Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<TestStep> testSteps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestsuitePackage.Literals.TEST_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsuitePackage.TEST_CASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestStep> getTestSteps() {
		if (testSteps == null) {
			testSteps = new EObjectContainmentWithInverseEList<TestStep>(TestStep.class, this, TestsuitePackage.TEST_CASE__TEST_STEPS, TestsuitePackage.TEST_STEP__TEST_CASE);
		}
		return testSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSuite getTestSuite() {
		if (eContainerFeatureID() != TestsuitePackage.TEST_CASE__TEST_SUITE) return null;
		return (TestSuite)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestSuite(TestSuite newTestSuite, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTestSuite, TestsuitePackage.TEST_CASE__TEST_SUITE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestSuite(TestSuite newTestSuite) {
		if (newTestSuite != eInternalContainer() || (eContainerFeatureID() != TestsuitePackage.TEST_CASE__TEST_SUITE && newTestSuite != null)) {
			if (EcoreUtil.isAncestor(this, newTestSuite))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTestSuite != null)
				msgs = ((InternalEObject)newTestSuite).eInverseAdd(this, TestsuitePackage.TEST_SUITE__TEST_CASES, TestSuite.class, msgs);
			msgs = basicSetTestSuite(newTestSuite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsuitePackage.TEST_CASE__TEST_SUITE, newTestSuite, newTestSuite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestsuitePackage.TEST_CASE__TEST_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTestSteps()).basicAdd(otherEnd, msgs);
			case TestsuitePackage.TEST_CASE__TEST_SUITE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTestSuite((TestSuite)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestsuitePackage.TEST_CASE__TEST_STEPS:
				return ((InternalEList<?>)getTestSteps()).basicRemove(otherEnd, msgs);
			case TestsuitePackage.TEST_CASE__TEST_SUITE:
				return basicSetTestSuite(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TestsuitePackage.TEST_CASE__TEST_SUITE:
				return eInternalContainer().eInverseRemove(this, TestsuitePackage.TEST_SUITE__TEST_CASES, TestSuite.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestsuitePackage.TEST_CASE__NAME:
				return getName();
			case TestsuitePackage.TEST_CASE__TEST_STEPS:
				return getTestSteps();
			case TestsuitePackage.TEST_CASE__TEST_SUITE:
				return getTestSuite();
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
			case TestsuitePackage.TEST_CASE__NAME:
				setName((String)newValue);
				return;
			case TestsuitePackage.TEST_CASE__TEST_STEPS:
				getTestSteps().clear();
				getTestSteps().addAll((Collection<? extends TestStep>)newValue);
				return;
			case TestsuitePackage.TEST_CASE__TEST_SUITE:
				setTestSuite((TestSuite)newValue);
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
			case TestsuitePackage.TEST_CASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TestsuitePackage.TEST_CASE__TEST_STEPS:
				getTestSteps().clear();
				return;
			case TestsuitePackage.TEST_CASE__TEST_SUITE:
				setTestSuite((TestSuite)null);
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
			case TestsuitePackage.TEST_CASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TestsuitePackage.TEST_CASE__TEST_STEPS:
				return testSteps != null && !testSteps.isEmpty();
			case TestsuitePackage.TEST_CASE__TEST_SUITE:
				return getTestSuite() != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TestCaseImpl
