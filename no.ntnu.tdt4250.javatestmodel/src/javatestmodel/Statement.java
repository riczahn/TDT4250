/**
 */
package javatestmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javatestmodel.Statement#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see javatestmodel.JavaModelPackage#getStatement()
 * @model abstract="true"
 * @generated
 */
public interface Statement extends EObject {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link javatestmodel.Method#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' container reference.
	 * @see #setMethod(Method)
	 * @see javatestmodel.JavaModelPackage#getStatement_Method()
	 * @see javatestmodel.Method#getStatements
	 * @model opposite="statements" transient="false"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link javatestmodel.Statement#getMethod <em>Method</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' container reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

} // Statement
