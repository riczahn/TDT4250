/**
 */
package JavaModel.impl;

import JavaModel.JavaModelPackage;
import JavaModel.LineStatement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link JavaModel.impl.LineStatementImpl#getLineContent <em>Line Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineStatementImpl extends StatementImpl implements LineStatement {
	/**
	 * The default value of the '{@link #getLineContent() <em>Line Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineContent()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineContent() <em>Line Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineContent()
	 * @generated
	 * @ordered
	 */
	protected String lineContent = LINE_CONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaModelPackage.Literals.LINE_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLineContent() {
		return lineContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineContent(String newLineContent) {
		String oldLineContent = lineContent;
		lineContent = newLineContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaModelPackage.LINE_STATEMENT__LINE_CONTENT, oldLineContent, lineContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaModelPackage.LINE_STATEMENT__LINE_CONTENT:
				return getLineContent();
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
			case JavaModelPackage.LINE_STATEMENT__LINE_CONTENT:
				setLineContent((String)newValue);
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
			case JavaModelPackage.LINE_STATEMENT__LINE_CONTENT:
				setLineContent(LINE_CONTENT_EDEFAULT);
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
			case JavaModelPackage.LINE_STATEMENT__LINE_CONTENT:
				return LINE_CONTENT_EDEFAULT == null ? lineContent != null : !LINE_CONTENT_EDEFAULT.equals(lineContent);
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
		result.append(" (lineContent: ");
		result.append(lineContent);
		result.append(')');
		return result.toString();
	}

} //LineStatementImpl
