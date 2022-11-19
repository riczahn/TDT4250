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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import testsuite.APIRequest;
import testsuite.Assertion;
import testsuite.Header;
import testsuite.InferrableParameter;
import testsuite.Method;
import testsuite.TestsuitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link testsuite.impl.APIRequestImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link testsuite.impl.APIRequestImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link testsuite.impl.APIRequestImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link testsuite.impl.APIRequestImpl#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link testsuite.impl.APIRequestImpl#getBody <em>Body</em>}</li>
 *   <li>{@link testsuite.impl.APIRequestImpl#getHeaders <em>Headers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APIRequestImpl extends TestStepImpl implements APIRequest {
	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final Method METHOD_EDEFAULT = Method.GET;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected Method method = METHOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<InferrableParameter> parameters;

	/**
	 * The cached value of the '{@link #getAssertions() <em>Assertions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertions()
	 * @generated
	 * @ordered
	 */
	protected EList<Assertion> assertions;

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHeaders() <em>Headers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<Header> headers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APIRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestsuitePackage.Literals.API_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsuitePackage.API_REQUEST__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(Method newMethod) {
		Method oldMethod = method;
		method = newMethod == null ? METHOD_EDEFAULT : newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsuitePackage.API_REQUEST__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InferrableParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<InferrableParameter>(InferrableParameter.class, this, TestsuitePackage.API_REQUEST__PARAMETERS, TestsuitePackage.INFERRABLE_PARAMETER__API_REQUEST);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assertion> getAssertions() {
		if (assertions == null) {
			assertions = new EObjectContainmentWithInverseEList<Assertion>(Assertion.class, this, TestsuitePackage.API_REQUEST__ASSERTIONS, TestsuitePackage.ASSERTION__API_REQUEST);
		}
		return assertions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsuitePackage.API_REQUEST__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Header> getHeaders() {
		if (headers == null) {
			headers = new EObjectContainmentWithInverseEList<Header>(Header.class, this, TestsuitePackage.API_REQUEST__HEADERS, TestsuitePackage.HEADER__API_REQUEST);
		}
		return headers;
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
			case TestsuitePackage.API_REQUEST__PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
			case TestsuitePackage.API_REQUEST__ASSERTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssertions()).basicAdd(otherEnd, msgs);
			case TestsuitePackage.API_REQUEST__HEADERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHeaders()).basicAdd(otherEnd, msgs);
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
			case TestsuitePackage.API_REQUEST__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case TestsuitePackage.API_REQUEST__ASSERTIONS:
				return ((InternalEList<?>)getAssertions()).basicRemove(otherEnd, msgs);
			case TestsuitePackage.API_REQUEST__HEADERS:
				return ((InternalEList<?>)getHeaders()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestsuitePackage.API_REQUEST__URI:
				return getUri();
			case TestsuitePackage.API_REQUEST__METHOD:
				return getMethod();
			case TestsuitePackage.API_REQUEST__PARAMETERS:
				return getParameters();
			case TestsuitePackage.API_REQUEST__ASSERTIONS:
				return getAssertions();
			case TestsuitePackage.API_REQUEST__BODY:
				return getBody();
			case TestsuitePackage.API_REQUEST__HEADERS:
				return getHeaders();
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
			case TestsuitePackage.API_REQUEST__URI:
				setUri((String)newValue);
				return;
			case TestsuitePackage.API_REQUEST__METHOD:
				setMethod((Method)newValue);
				return;
			case TestsuitePackage.API_REQUEST__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends InferrableParameter>)newValue);
				return;
			case TestsuitePackage.API_REQUEST__ASSERTIONS:
				getAssertions().clear();
				getAssertions().addAll((Collection<? extends Assertion>)newValue);
				return;
			case TestsuitePackage.API_REQUEST__BODY:
				setBody((String)newValue);
				return;
			case TestsuitePackage.API_REQUEST__HEADERS:
				getHeaders().clear();
				getHeaders().addAll((Collection<? extends Header>)newValue);
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
			case TestsuitePackage.API_REQUEST__URI:
				setUri(URI_EDEFAULT);
				return;
			case TestsuitePackage.API_REQUEST__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case TestsuitePackage.API_REQUEST__PARAMETERS:
				getParameters().clear();
				return;
			case TestsuitePackage.API_REQUEST__ASSERTIONS:
				getAssertions().clear();
				return;
			case TestsuitePackage.API_REQUEST__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case TestsuitePackage.API_REQUEST__HEADERS:
				getHeaders().clear();
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
			case TestsuitePackage.API_REQUEST__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case TestsuitePackage.API_REQUEST__METHOD:
				return method != METHOD_EDEFAULT;
			case TestsuitePackage.API_REQUEST__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case TestsuitePackage.API_REQUEST__ASSERTIONS:
				return assertions != null && !assertions.isEmpty();
			case TestsuitePackage.API_REQUEST__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case TestsuitePackage.API_REQUEST__HEADERS:
				return headers != null && !headers.isEmpty();
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
		result.append(" (uri: ");
		result.append(uri);
		result.append(", method: ");
		result.append(method);
		result.append(", body: ");
		result.append(body);
		result.append(')');
		return result.toString();
	}

} //APIRequestImpl
