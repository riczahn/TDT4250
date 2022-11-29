/**
 */
package javatestmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javatestmodel.TestClass#getName <em>Name</em>}</li>
 *   <li>{@link javatestmodel.TestClass#getImports <em>Imports</em>}</li>
 *   <li>{@link javatestmodel.TestClass#getPackage <em>Package</em>}</li>
 *   <li>{@link javatestmodel.TestClass#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link javatestmodel.TestClass#getTestMethods <em>Test Methods</em>}</li>
 * </ul>
 *
 * @see javatestmodel.JavaModelPackage#getTestClass()
 * @model
 * @generated
 */
public interface TestClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see javatestmodel.JavaModelPackage#getTestClass_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link javatestmodel.TestClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' attribute list.
	 * @see javatestmodel.JavaModelPackage#getTestClass_Imports()
	 * @model
	 * @generated
	 */
	EList<String> getImports();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' attribute.
	 * @see #setPackage(String)
	 * @see javatestmodel.JavaModelPackage#getTestClass_Package()
	 * @model
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link javatestmodel.TestClass#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"PACKAGE_PRIVATE"</code>.
	 * The literals are from the enumeration {@link javatestmodel.Visibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see javatestmodel.Visibility
	 * @see #setVisibility(Visibility)
	 * @see javatestmodel.JavaModelPackage#getTestClass_Visibility()
	 * @model default="PACKAGE_PRIVATE"
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link javatestmodel.TestClass#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see javatestmodel.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

	/**
	 * Returns the value of the '<em><b>Test Methods</b></em>' containment reference list.
	 * The list contents are of type {@link javatestmodel.Method}.
	 * It is bidirectional and its opposite is '{@link javatestmodel.Method#getTestClass <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Methods</em>' containment reference list.
	 * @see javatestmodel.JavaModelPackage#getTestClass_TestMethods()
	 * @see javatestmodel.Method#getTestClass
	 * @model opposite="testClass" containment="true"
	 * @generated
	 */
	EList<Method> getTestMethods();

} // TestClass
