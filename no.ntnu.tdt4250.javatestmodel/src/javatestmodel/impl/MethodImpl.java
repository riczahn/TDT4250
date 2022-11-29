/**
 */
package javatestmodel.impl;

import java.util.Collection;

import javatestmodel.JavaModelPackage;
import javatestmodel.Method;
import javatestmodel.SimpleDatatype;
import javatestmodel.Statement;
import javatestmodel.TestClass;
import javatestmodel.Visibility;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javatestmodel.impl.MethodImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link javatestmodel.impl.MethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link javatestmodel.impl.MethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link javatestmodel.impl.MethodImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link javatestmodel.impl.MethodImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link javatestmodel.impl.MethodImpl#getTestClass <em>Test Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends MinimalEObjectImpl.Container implements Method {
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final Visibility VISIBILITY_EDEFAULT = Visibility.PACKAGE_PRIVATE;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected Visibility visibility = VISIBILITY_EDEFAULT;

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
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final SimpleDatatype RETURN_TYPE_EDEFAULT = SimpleDatatype.VOID;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected SimpleDatatype returnType = RETURN_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<String> annotations;

	/**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> statements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaModelPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Visibility newVisibility) {
		Visibility oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaModelPackage.METHOD__VISIBILITY, oldVisibility, visibility));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaModelPackage.METHOD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleDatatype getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(SimpleDatatype newReturnType) {
		SimpleDatatype oldReturnType = returnType;
		returnType = newReturnType == null ? RETURN_TYPE_EDEFAULT : newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaModelPackage.METHOD__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAnnotations() {
		if (annotations == null) {
			annotations = new EDataTypeUniqueEList<String>(String.class, this, JavaModelPackage.METHOD__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentWithInverseEList<Statement>(Statement.class, this, JavaModelPackage.METHOD__STATEMENTS, JavaModelPackage.STATEMENT__METHOD);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestClass getTestClass() {
		if (eContainerFeatureID() != JavaModelPackage.METHOD__TEST_CLASS) return null;
		return (TestClass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestClass(TestClass newTestClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTestClass, JavaModelPackage.METHOD__TEST_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestClass(TestClass newTestClass) {
		if (newTestClass != eInternalContainer() || (eContainerFeatureID() != JavaModelPackage.METHOD__TEST_CLASS && newTestClass != null)) {
			if (EcoreUtil.isAncestor(this, newTestClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTestClass != null)
				msgs = ((InternalEObject)newTestClass).eInverseAdd(this, JavaModelPackage.TEST_CLASS__TEST_METHODS, TestClass.class, msgs);
			msgs = basicSetTestClass(newTestClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaModelPackage.METHOD__TEST_CLASS, newTestClass, newTestClass));
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
			case JavaModelPackage.METHOD__STATEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStatements()).basicAdd(otherEnd, msgs);
			case JavaModelPackage.METHOD__TEST_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTestClass((TestClass)otherEnd, msgs);
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
			case JavaModelPackage.METHOD__STATEMENTS:
				return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
			case JavaModelPackage.METHOD__TEST_CLASS:
				return basicSetTestClass(null, msgs);
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
			case JavaModelPackage.METHOD__TEST_CLASS:
				return eInternalContainer().eInverseRemove(this, JavaModelPackage.TEST_CLASS__TEST_METHODS, TestClass.class, msgs);
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
			case JavaModelPackage.METHOD__VISIBILITY:
				return getVisibility();
			case JavaModelPackage.METHOD__NAME:
				return getName();
			case JavaModelPackage.METHOD__RETURN_TYPE:
				return getReturnType();
			case JavaModelPackage.METHOD__ANNOTATIONS:
				return getAnnotations();
			case JavaModelPackage.METHOD__STATEMENTS:
				return getStatements();
			case JavaModelPackage.METHOD__TEST_CLASS:
				return getTestClass();
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
			case JavaModelPackage.METHOD__VISIBILITY:
				setVisibility((Visibility)newValue);
				return;
			case JavaModelPackage.METHOD__NAME:
				setName((String)newValue);
				return;
			case JavaModelPackage.METHOD__RETURN_TYPE:
				setReturnType((SimpleDatatype)newValue);
				return;
			case JavaModelPackage.METHOD__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends String>)newValue);
				return;
			case JavaModelPackage.METHOD__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends Statement>)newValue);
				return;
			case JavaModelPackage.METHOD__TEST_CLASS:
				setTestClass((TestClass)newValue);
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
			case JavaModelPackage.METHOD__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case JavaModelPackage.METHOD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JavaModelPackage.METHOD__RETURN_TYPE:
				setReturnType(RETURN_TYPE_EDEFAULT);
				return;
			case JavaModelPackage.METHOD__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case JavaModelPackage.METHOD__STATEMENTS:
				getStatements().clear();
				return;
			case JavaModelPackage.METHOD__TEST_CLASS:
				setTestClass((TestClass)null);
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
			case JavaModelPackage.METHOD__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case JavaModelPackage.METHOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JavaModelPackage.METHOD__RETURN_TYPE:
				return returnType != RETURN_TYPE_EDEFAULT;
			case JavaModelPackage.METHOD__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case JavaModelPackage.METHOD__STATEMENTS:
				return statements != null && !statements.isEmpty();
			case JavaModelPackage.METHOD__TEST_CLASS:
				return getTestClass() != null;
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
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(", name: ");
		result.append(name);
		result.append(", returnType: ");
		result.append(returnType);
		result.append(", annotations: ");
		result.append(annotations);
		result.append(')');
		return result.toString();
	}

} //MethodImpl
