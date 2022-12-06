/**
 */
package javatest.util;

import java.util.Map;

import javatest.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see javatest.JavaModelPackage
 * @generated
 */
public class JavaModelValidator extends EObjectValidator {
	
	/**
	 * The list of java reserved keywords
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	static final String keywords[] = { "abstract", "assert", "boolean",
            "break", "byte", "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else", "extends", "false",
            "final", "finally", "float", "for", "goto", "if", "implements",
            "import", "instanceof", "int", "interface", "long", "native",
            "new", "null", "package", "private", "protected", "public",
            "return", "short", "static", "strictfp", "super", "switch",
            "synchronized", "this", "throw", "throws", "transient", "true",
            "try", "void", "volatile", "while" };
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final JavaModelValidator INSTANCE = new JavaModelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "javatest";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaModelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return JavaModelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case JavaModelPackage.TEST_CLASS:
				return validateTestClass((TestClass)value, diagnostics, context);
			case JavaModelPackage.METHOD:
				return validateMethod((Method)value, diagnostics, context);
			case JavaModelPackage.STATEMENT:
				return validateStatement((Statement)value, diagnostics, context);
			case JavaModelPackage.LINE_STATEMENT:
				return validateLineStatement((LineStatement)value, diagnostics, context);
			case JavaModelPackage.VISIBILITY:
				return validateVisibility((Visibility)value, diagnostics, context);
			case JavaModelPackage.SIMPLE_DATATYPE:
				return validateSimpleDatatype((SimpleDatatype)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestClass(TestClass testClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(testClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(testClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(testClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(testClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(testClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(testClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(testClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(testClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(testClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateTestClass_validName(testClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateTestClass_validPackage(testClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateTestClass_validImports(testClass, diagnostics, context);
		return result;
	}
	
	/**
	 * Checks whether the given string is a valid Java identifier or not
	 * @generated NOT
	 */
	public static boolean isValidJavaIdentifier(String s) {
		// an empty or null string cannot be a valid identifier
		if (s == null || s.length() == 0) {
			return false;
		}
	
		char[] c = s.toCharArray();
		
		if (!Character.isJavaIdentifierStart(c[0])) {
			return false;
		}
	
		for (int i = 1; i < c.length; i++) {
			if (!Character.isJavaIdentifierPart(c[i])) {
				return false;
			}
		}
	
		return true;
	}

	/**
	 * Validates the validName constraint of '<em>Test Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTestClass_validName(TestClass testClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		boolean valid = true;
		
		String className = testClass.getName();
		
		// check that the string is a valid java identifier
		if (!isValidJavaIdentifier(className))
			valid = false;
		
		// check that it is capitalized
		if (!Character.isUpperCase(className.charAt(0)))
			valid = false;
		
		// check if the classname is a java reserved keyword
		for (String k : keywords) {
			if (k.toLowerCase().equals(className.toLowerCase())) {
				valid = false;
				break;
			}
		}

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validName", getObjectLabel(testClass, context) },
						 new Object[] { testClass },
						 context));
			}
			return valid;
		}
		return valid;
	}

	/**
	 * Validates the validPackage constraint of '<em>Test Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTestClass_validPackage(TestClass testClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		boolean valid = true;
		
		String packageName = testClass.getPackage();
		
		// check that the string is a valid java package identifier
		// see: https://stackoverflow.com/questions/39289986/regular-expression-to-validate-a-java-package-name-in-javascript
		if (!packageName.matches("(^(?:[a-z_]+(?:\\d*[a-zA-Z_]*)*)(?:\\.[a-z_]+(?:\\d*[a-zA-Z_]*)*)*$)"))
			valid = false;
		
		// check that package name doesn't include reserved java keywords
		for (String k : keywords) {
			if (packageName.contains(k+"."))
				valid = false;
			if (packageName.contains("."+k+"."))
				valid = false;
			if (packageName.contains("."+k))
				valid = false;
			if (packageName.equals(k))
				valid = false;
		}

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validPackage", getObjectLabel(testClass, context) },
						 new Object[] { testClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the validImports constraint of '<em>Test Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestClass_validImports(TestClass testClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean valid = true;
		
		for (String _import : testClass.getImports()) {
			if (!_import.startsWith("import "))
				valid = false;
			// check that there are no spaces in the import string 
			if (_import.substring(7).trim().contains(" "))
				valid = false;
			if (!_import.trim().endsWith(";"))
				valid = false;
		}
		
		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validImports", getObjectLabel(testClass, context) },
						 new Object[] { testClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethod(Method method, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(method, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(method, diagnostics, context);
		if (result || diagnostics != null) result &= validateMethod_validAnnotations(method, diagnostics, context);
		if (result || diagnostics != null) result &= validateMethod_validMethodName(method, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validAnnotations constraint of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateMethod_validAnnotations(Method method, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		boolean valid = true;
		
		EList<String> annotations = method.getAnnotations();
		
		for (String annotation : annotations) {
			if (!annotation.startsWith("@") || !isValidJavaIdentifier(annotation.substring(1))) {
				valid = false;
				break;
			}
		}
		
		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validAnnotations", getObjectLabel(method, context) },
						 new Object[] { method },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the validMethodName constraint of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateMethod_validMethodName(Method method, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		boolean valid = true;
		
		String methodName = method.getName();
		
		// check that the string is a valid java identifier
		if (!isValidJavaIdentifier(methodName))
			valid = false;
		
		// check if the method name is not a java reserved keyword
		for (String k : keywords) {
			if (methodName.toLowerCase().equals(k.toLowerCase())) {
				valid = false;
				break;
			}
		}
		
		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validMethodName", getObjectLabel(method, context) },
						 new Object[] { method },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatement(Statement statement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(statement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineStatement(LineStatement lineStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineStatement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibility(Visibility visibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleDatatype(SimpleDatatype simpleDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //JavaModelValidator
