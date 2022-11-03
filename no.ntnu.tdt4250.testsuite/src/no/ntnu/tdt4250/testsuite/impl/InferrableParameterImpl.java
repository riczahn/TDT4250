/**
 */
package no.ntnu.tdt4250.testsuite.impl;

import no.ntnu.tdt4250.testsuite.APIRequest;
import no.ntnu.tdt4250.testsuite.InferrableParameter;
import no.ntnu.tdt4250.testsuite.ParameterLocation;
import no.ntnu.tdt4250.testsuite.TestsuitePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inferrable Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.testsuite.impl.InferrableParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.testsuite.impl.InferrableParameterImpl#getParameterLocation <em>Parameter Location</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.testsuite.impl.InferrableParameterImpl#getApiRequest <em>Api Request</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.testsuite.impl.InferrableParameterImpl#getTestStepId <em>Test Step Id</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.testsuite.impl.InferrableParameterImpl#getJsonPath <em>Json Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InferrableParameterImpl extends MinimalEObjectImpl.Container implements InferrableParameter {
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
	 * The default value of the '{@link #getParameterLocation() <em>Parameter Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterLocation()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterLocation PARAMETER_LOCATION_EDEFAULT = ParameterLocation.PATH;

	/**
	 * The cached value of the '{@link #getParameterLocation() <em>Parameter Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterLocation()
	 * @generated
	 * @ordered
	 */
	protected ParameterLocation parameterLocation = PARAMETER_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestStepId() <em>Test Step Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStepId()
	 * @generated
	 * @ordered
	 */
	protected static final long TEST_STEP_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTestStepId() <em>Test Step Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStepId()
	 * @generated
	 * @ordered
	 */
	protected long testStepId = TEST_STEP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getJsonPath() <em>Json Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonPath()
	 * @generated
	 * @ordered
	 */
	protected static final String JSON_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJsonPath() <em>Json Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonPath()
	 * @generated
	 * @ordered
	 */
	protected String jsonPath = JSON_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InferrableParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestsuitePackage.Literals.INFERRABLE_PARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestsuitePackage.INFERRABLE_PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterLocation getParameterLocation() {
		return parameterLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterLocation(ParameterLocation newParameterLocation) {
		ParameterLocation oldParameterLocation = parameterLocation;
		parameterLocation = newParameterLocation == null ? PARAMETER_LOCATION_EDEFAULT : newParameterLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsuitePackage.INFERRABLE_PARAMETER__PARAMETER_LOCATION, oldParameterLocation, parameterLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIRequest getApiRequest() {
		if (eContainerFeatureID() != TestsuitePackage.INFERRABLE_PARAMETER__API_REQUEST) return null;
		return (APIRequest)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiRequest(APIRequest newApiRequest, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newApiRequest, TestsuitePackage.INFERRABLE_PARAMETER__API_REQUEST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiRequest(APIRequest newApiRequest) {
		if (newApiRequest != eInternalContainer() || (eContainerFeatureID() != TestsuitePackage.INFERRABLE_PARAMETER__API_REQUEST && newApiRequest != null)) {
			if (EcoreUtil.isAncestor(this, newApiRequest))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApiRequest != null)
				msgs = ((InternalEObject)newApiRequest).eInverseAdd(this, TestsuitePackage.API_REQUEST__PARAMETERS, APIRequest.class, msgs);
			msgs = basicSetApiRequest(newApiRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsuitePackage.INFERRABLE_PARAMETER__API_REQUEST, newApiRequest, newApiRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTestStepId() {
		return testStepId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestStepId(long newTestStepId) {
		long oldTestStepId = testStepId;
		testStepId = newTestStepId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsuitePackage.INFERRABLE_PARAMETER__TEST_STEP_ID, oldTestStepId, testStepId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJsonPath() {
		return jsonPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsonPath(String newJsonPath) {
		String oldJsonPath = jsonPath;
		jsonPath = newJsonPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsuitePackage.INFERRABLE_PARAMETER__JSON_PATH, oldJsonPath, jsonPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestsuitePackage.INFERRABLE_PARAMETER__API_REQUEST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetApiRequest((APIRequest)otherEnd, msgs);
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
			case TestsuitePackage.INFERRABLE_PARAMETER__API_REQUEST:
				return basicSetApiRequest(null, msgs);
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
			case TestsuitePackage.INFERRABLE_PARAMETER__API_REQUEST:
				return eInternalContainer().eInverseRemove(this, TestsuitePackage.API_REQUEST__PARAMETERS, APIRequest.class, msgs);
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
			case TestsuitePackage.INFERRABLE_PARAMETER__NAME:
				return getName();
			case TestsuitePackage.INFERRABLE_PARAMETER__PARAMETER_LOCATION:
				return getParameterLocation();
			case TestsuitePackage.INFERRABLE_PARAMETER__API_REQUEST:
				return getApiRequest();
			case TestsuitePackage.INFERRABLE_PARAMETER__TEST_STEP_ID:
				return getTestStepId();
			case TestsuitePackage.INFERRABLE_PARAMETER__JSON_PATH:
				return getJsonPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TestsuitePackage.INFERRABLE_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case TestsuitePackage.INFERRABLE_PARAMETER__PARAMETER_LOCATION:
				setParameterLocation((ParameterLocation)newValue);
				return;
			case TestsuitePackage.INFERRABLE_PARAMETER__API_REQUEST:
				setApiRequest((APIRequest)newValue);
				return;
			case TestsuitePackage.INFERRABLE_PARAMETER__TEST_STEP_ID:
				setTestStepId((Long)newValue);
				return;
			case TestsuitePackage.INFERRABLE_PARAMETER__JSON_PATH:
				setJsonPath((String)newValue);
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
			case TestsuitePackage.INFERRABLE_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TestsuitePackage.INFERRABLE_PARAMETER__PARAMETER_LOCATION:
				setParameterLocation(PARAMETER_LOCATION_EDEFAULT);
				return;
			case TestsuitePackage.INFERRABLE_PARAMETER__API_REQUEST:
				setApiRequest((APIRequest)null);
				return;
			case TestsuitePackage.INFERRABLE_PARAMETER__TEST_STEP_ID:
				setTestStepId(TEST_STEP_ID_EDEFAULT);
				return;
			case TestsuitePackage.INFERRABLE_PARAMETER__JSON_PATH:
				setJsonPath(JSON_PATH_EDEFAULT);
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
			case TestsuitePackage.INFERRABLE_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TestsuitePackage.INFERRABLE_PARAMETER__PARAMETER_LOCATION:
				return parameterLocation != PARAMETER_LOCATION_EDEFAULT;
			case TestsuitePackage.INFERRABLE_PARAMETER__API_REQUEST:
				return getApiRequest() != null;
			case TestsuitePackage.INFERRABLE_PARAMETER__TEST_STEP_ID:
				return testStepId != TEST_STEP_ID_EDEFAULT;
			case TestsuitePackage.INFERRABLE_PARAMETER__JSON_PATH:
				return JSON_PATH_EDEFAULT == null ? jsonPath != null : !JSON_PATH_EDEFAULT.equals(jsonPath);
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
		result.append(", parameterLocation: ");
		result.append(parameterLocation);
		result.append(", testStepId: ");
		result.append(testStepId);
		result.append(", jsonPath: ");
		result.append(jsonPath);
		result.append(')');
		return result.toString();
	}

} //InferrableParameterImpl
