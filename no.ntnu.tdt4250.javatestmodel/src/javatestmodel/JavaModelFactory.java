/**
 */
package javatestmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see javatestmodel.JavaModelPackage
 * @generated
 */
public interface JavaModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaModelFactory eINSTANCE = javatestmodel.impl.JavaModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Test Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Class</em>'.
	 * @generated
	 */
	TestClass createTestClass();

	/**
	 * Returns a new object of class '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method</em>'.
	 * @generated
	 */
	Method createMethod();

	/**
	 * Returns a new object of class '<em>Line Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Statement</em>'.
	 * @generated
	 */
	LineStatement createLineStatement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JavaModelPackage getJavaModelPackage();

} //JavaModelFactory
