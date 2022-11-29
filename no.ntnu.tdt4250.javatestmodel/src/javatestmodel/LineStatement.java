/**
 */
package javatestmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javatestmodel.LineStatement#getLineContent <em>Line Content</em>}</li>
 * </ul>
 *
 * @see javatestmodel.JavaModelPackage#getLineStatement()
 * @model
 * @generated
 */
public interface LineStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Line Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Content</em>' attribute.
	 * @see #setLineContent(String)
	 * @see javatestmodel.JavaModelPackage#getLineStatement_LineContent()
	 * @model required="true"
	 * @generated
	 */
	String getLineContent();

	/**
	 * Sets the value of the '{@link javatestmodel.LineStatement#getLineContent <em>Line Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Content</em>' attribute.
	 * @see #getLineContent()
	 * @generated
	 */
	void setLineContent(String value);

} // LineStatement
