/**
 */
package javatestmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javatestmodel.Method#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link javatestmodel.Method#getName <em>Name</em>}</li>
 *   <li>{@link javatestmodel.Method#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link javatestmodel.Method#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link javatestmodel.Method#getStatements <em>Statements</em>}</li>
 *   <li>{@link javatestmodel.Method#getTestClass <em>Test Class</em>}</li>
 * </ul>
 *
 * @see javatestmodel.JavaModelPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"PACKAGE_PRIVATE"</code>.
	 * The literals are from the enumeration {@link javatestmodel.Visibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see javatestmodel.Visibility
	 * @see #setVisibility(Visibility)
	 * @see javatestmodel.JavaModelPackage#getMethod_Visibility()
	 * @model default="PACKAGE_PRIVATE"
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link javatestmodel.Method#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see javatestmodel.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see javatestmodel.JavaModelPackage#getMethod_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link javatestmodel.Method#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * The default value is <code>"VOID"</code>.
	 * The literals are from the enumeration {@link javatestmodel.SimpleDatatype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see javatestmodel.SimpleDatatype
	 * @see #setReturnType(SimpleDatatype)
	 * @see javatestmodel.JavaModelPackage#getMethod_ReturnType()
	 * @model default="VOID" required="true"
	 * @generated
	 */
	SimpleDatatype getReturnType();

	/**
	 * Sets the value of the '{@link javatestmodel.Method#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see javatestmodel.SimpleDatatype
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(SimpleDatatype value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' attribute list.
	 * @see javatestmodel.JavaModelPackage#getMethod_Annotations()
	 * @model
	 * @generated
	 */
	EList<String> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link javatestmodel.Statement}.
	 * It is bidirectional and its opposite is '{@link javatestmodel.Statement#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see javatestmodel.JavaModelPackage#getMethod_Statements()
	 * @see javatestmodel.Statement#getMethod
	 * @model opposite="method" containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

	/**
	 * Returns the value of the '<em><b>Test Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link javatestmodel.TestClass#getTestMethods <em>Test Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Class</em>' container reference.
	 * @see #setTestClass(TestClass)
	 * @see javatestmodel.JavaModelPackage#getMethod_TestClass()
	 * @see javatestmodel.TestClass#getTestMethods
	 * @model opposite="testMethods" transient="false"
	 * @generated
	 */
	TestClass getTestClass();

	/**
	 * Sets the value of the '{@link javatestmodel.Method#getTestClass <em>Test Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Class</em>' container reference.
	 * @see #getTestClass()
	 * @generated
	 */
	void setTestClass(TestClass value);

} // Method
