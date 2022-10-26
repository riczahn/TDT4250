/**
 */
package no.ntnu.tdt4250.testsuite;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.testsuite.TestsuiteFactory
 * @model kind="package"
 * @generated
 */
public interface TestsuitePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "testsuite";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform://plugin/no.ntnu.tdt4250.testsuite/TestSuite.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestsuitePackage eINSTANCE = no.ntnu.tdt4250.testsuite.impl.TestsuitePackageImpl.init();

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.testsuite.impl.TestSuiteImpl <em>Test Suite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.testsuite.impl.TestSuiteImpl
	 * @see no.ntnu.tdt4250.testsuite.impl.TestsuitePackageImpl#getTestSuite()
	 * @generated
	 */
	int TEST_SUITE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Test Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__TEST_CASES = 1;

	/**
	 * The number of structural features of the '<em>Test Suite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Test Suite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.testsuite.impl.TestCaseImpl <em>Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.testsuite.impl.TestCaseImpl
	 * @see no.ntnu.tdt4250.testsuite.impl.TestsuitePackageImpl#getTestCase()
	 * @generated
	 */
	int TEST_CASE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Test Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__TEST_STEPS = 1;

	/**
	 * The feature id for the '<em><b>Test Suite</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__TEST_SUITE = 2;

	/**
	 * The number of structural features of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.testsuite.impl.TestStepImpl <em>Test Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.testsuite.impl.TestStepImpl
	 * @see no.ntnu.tdt4250.testsuite.impl.TestsuitePackageImpl#getTestStep()
	 * @generated
	 */
	int TEST_STEP = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_STEP__ID = 0;

	/**
	 * The feature id for the '<em><b>Test Case</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_STEP__TEST_CASE = 1;

	/**
	 * The number of structural features of the '<em>Test Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_STEP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Test Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.testsuite.impl.APIRequestImpl <em>API Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.testsuite.impl.APIRequestImpl
	 * @see no.ntnu.tdt4250.testsuite.impl.TestsuitePackageImpl#getAPIRequest()
	 * @generated
	 */
	int API_REQUEST = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REQUEST__ID = TEST_STEP__ID;

	/**
	 * The feature id for the '<em><b>Test Case</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REQUEST__TEST_CASE = TEST_STEP__TEST_CASE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REQUEST__URI = TEST_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REQUEST__METHOD = TEST_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REQUEST__PARAMETERS = TEST_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assertions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REQUEST__ASSERTIONS = TEST_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REQUEST__BODY = TEST_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REQUEST__HEADERS = TEST_STEP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>API Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REQUEST_FEATURE_COUNT = TEST_STEP_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>API Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REQUEST_OPERATION_COUNT = TEST_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.testsuite.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.testsuite.impl.HeaderImpl
	 * @see no.ntnu.tdt4250.testsuite.impl.TestsuitePackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Api Request</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__API_REQUEST = 2;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.testsuite.impl.InferrableParameterImpl <em>Inferrable Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.testsuite.impl.InferrableParameterImpl
	 * @see no.ntnu.tdt4250.testsuite.impl.TestsuitePackageImpl#getInferrableParameter()
	 * @generated
	 */
	int INFERRABLE_PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERRABLE_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameter Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERRABLE_PARAMETER__PARAMETER_LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Api Request</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERRABLE_PARAMETER__API_REQUEST = 2;

	/**
	 * The feature id for the '<em><b>Test Step Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERRABLE_PARAMETER__TEST_STEP_ID = 3;

	/**
	 * The feature id for the '<em><b>Json Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERRABLE_PARAMETER__JSON_PATH = 4;

	/**
	 * The number of structural features of the '<em>Inferrable Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERRABLE_PARAMETER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Inferrable Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERRABLE_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.testsuite.impl.AssertionImpl <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.testsuite.impl.AssertionImpl
	 * @see no.ntnu.tdt4250.testsuite.impl.TestsuitePackageImpl#getAssertion()
	 * @generated
	 */
	int ASSERTION = 6;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__ERROR_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Api Request</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__API_REQUEST = 1;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.testsuite.impl.StatusAssertionImpl <em>Status Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.testsuite.impl.StatusAssertionImpl
	 * @see no.ntnu.tdt4250.testsuite.impl.TestsuitePackageImpl#getStatusAssertion()
	 * @generated
	 */
	int STATUS_ASSERTION = 7;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ASSERTION__ERROR_MESSAGE = ASSERTION__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Api Request</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ASSERTION__API_REQUEST = ASSERTION__API_REQUEST;

	/**
	 * The feature id for the '<em><b>Successful Codes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ASSERTION__SUCCESSFUL_CODES = ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Status Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Status Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ASSERTION_OPERATION_COUNT = ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.testsuite.ParameterLocation <em>Parameter Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.testsuite.ParameterLocation
	 * @see no.ntnu.tdt4250.testsuite.impl.TestsuitePackageImpl#getParameterLocation()
	 * @generated
	 */
	int PARAMETER_LOCATION = 8;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.testsuite.Method <em>Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.testsuite.Method
	 * @see no.ntnu.tdt4250.testsuite.impl.TestsuitePackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 9;


	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.testsuite.TestSuite <em>Test Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Suite</em>'.
	 * @see no.ntnu.tdt4250.testsuite.TestSuite
	 * @generated
	 */
	EClass getTestSuite();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.testsuite.TestSuite#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.testsuite.TestSuite#getName()
	 * @see #getTestSuite()
	 * @generated
	 */
	EAttribute getTestSuite_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.testsuite.TestSuite#getTestCases <em>Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Cases</em>'.
	 * @see no.ntnu.tdt4250.testsuite.TestSuite#getTestCases()
	 * @see #getTestSuite()
	 * @generated
	 */
	EReference getTestSuite_TestCases();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.testsuite.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Case</em>'.
	 * @see no.ntnu.tdt4250.testsuite.TestCase
	 * @generated
	 */
	EClass getTestCase();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.testsuite.TestCase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.testsuite.TestCase#getName()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.testsuite.TestCase#getTestSteps <em>Test Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Steps</em>'.
	 * @see no.ntnu.tdt4250.testsuite.TestCase#getTestSteps()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_TestSteps();

	/**
	 * Returns the meta object for the container reference '{@link no.ntnu.tdt4250.testsuite.TestCase#getTestSuite <em>Test Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Test Suite</em>'.
	 * @see no.ntnu.tdt4250.testsuite.TestCase#getTestSuite()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_TestSuite();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.testsuite.TestStep <em>Test Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Step</em>'.
	 * @see no.ntnu.tdt4250.testsuite.TestStep
	 * @generated
	 */
	EClass getTestStep();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.testsuite.TestStep#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see no.ntnu.tdt4250.testsuite.TestStep#getId()
	 * @see #getTestStep()
	 * @generated
	 */
	EAttribute getTestStep_Id();

	/**
	 * Returns the meta object for the container reference '{@link no.ntnu.tdt4250.testsuite.TestStep#getTestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Test Case</em>'.
	 * @see no.ntnu.tdt4250.testsuite.TestStep#getTestCase()
	 * @see #getTestStep()
	 * @generated
	 */
	EReference getTestStep_TestCase();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.testsuite.APIRequest <em>API Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Request</em>'.
	 * @see no.ntnu.tdt4250.testsuite.APIRequest
	 * @generated
	 */
	EClass getAPIRequest();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.testsuite.APIRequest#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see no.ntnu.tdt4250.testsuite.APIRequest#getUri()
	 * @see #getAPIRequest()
	 * @generated
	 */
	EAttribute getAPIRequest_Uri();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.testsuite.APIRequest#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see no.ntnu.tdt4250.testsuite.APIRequest#getMethod()
	 * @see #getAPIRequest()
	 * @generated
	 */
	EAttribute getAPIRequest_Method();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.testsuite.APIRequest#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see no.ntnu.tdt4250.testsuite.APIRequest#getParameters()
	 * @see #getAPIRequest()
	 * @generated
	 */
	EReference getAPIRequest_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.testsuite.APIRequest#getAssertions <em>Assertions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assertions</em>'.
	 * @see no.ntnu.tdt4250.testsuite.APIRequest#getAssertions()
	 * @see #getAPIRequest()
	 * @generated
	 */
	EReference getAPIRequest_Assertions();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.testsuite.APIRequest#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see no.ntnu.tdt4250.testsuite.APIRequest#getBody()
	 * @see #getAPIRequest()
	 * @generated
	 */
	EAttribute getAPIRequest_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.testsuite.APIRequest#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Headers</em>'.
	 * @see no.ntnu.tdt4250.testsuite.APIRequest#getHeaders()
	 * @see #getAPIRequest()
	 * @generated
	 */
	EReference getAPIRequest_Headers();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.testsuite.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see no.ntnu.tdt4250.testsuite.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.testsuite.Header#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see no.ntnu.tdt4250.testsuite.Header#getKey()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Key();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.testsuite.Header#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see no.ntnu.tdt4250.testsuite.Header#getValue()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Value();

	/**
	 * Returns the meta object for the container reference '{@link no.ntnu.tdt4250.testsuite.Header#getApiRequest <em>Api Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Api Request</em>'.
	 * @see no.ntnu.tdt4250.testsuite.Header#getApiRequest()
	 * @see #getHeader()
	 * @generated
	 */
	EReference getHeader_ApiRequest();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.testsuite.InferrableParameter <em>Inferrable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inferrable Parameter</em>'.
	 * @see no.ntnu.tdt4250.testsuite.InferrableParameter
	 * @generated
	 */
	EClass getInferrableParameter();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.testsuite.InferrableParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.testsuite.InferrableParameter#getName()
	 * @see #getInferrableParameter()
	 * @generated
	 */
	EAttribute getInferrableParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.testsuite.InferrableParameter#getParameterLocation <em>Parameter Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Location</em>'.
	 * @see no.ntnu.tdt4250.testsuite.InferrableParameter#getParameterLocation()
	 * @see #getInferrableParameter()
	 * @generated
	 */
	EAttribute getInferrableParameter_ParameterLocation();

	/**
	 * Returns the meta object for the container reference '{@link no.ntnu.tdt4250.testsuite.InferrableParameter#getApiRequest <em>Api Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Api Request</em>'.
	 * @see no.ntnu.tdt4250.testsuite.InferrableParameter#getApiRequest()
	 * @see #getInferrableParameter()
	 * @generated
	 */
	EReference getInferrableParameter_ApiRequest();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.testsuite.InferrableParameter#getTestStepId <em>Test Step Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Step Id</em>'.
	 * @see no.ntnu.tdt4250.testsuite.InferrableParameter#getTestStepId()
	 * @see #getInferrableParameter()
	 * @generated
	 */
	EAttribute getInferrableParameter_TestStepId();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.testsuite.InferrableParameter#getJsonPath <em>Json Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Json Path</em>'.
	 * @see no.ntnu.tdt4250.testsuite.InferrableParameter#getJsonPath()
	 * @see #getInferrableParameter()
	 * @generated
	 */
	EAttribute getInferrableParameter_JsonPath();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.testsuite.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see no.ntnu.tdt4250.testsuite.Assertion
	 * @generated
	 */
	EClass getAssertion();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.testsuite.Assertion#getErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Message</em>'.
	 * @see no.ntnu.tdt4250.testsuite.Assertion#getErrorMessage()
	 * @see #getAssertion()
	 * @generated
	 */
	EAttribute getAssertion_ErrorMessage();

	/**
	 * Returns the meta object for the container reference '{@link no.ntnu.tdt4250.testsuite.Assertion#getApiRequest <em>Api Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Api Request</em>'.
	 * @see no.ntnu.tdt4250.testsuite.Assertion#getApiRequest()
	 * @see #getAssertion()
	 * @generated
	 */
	EReference getAssertion_ApiRequest();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.testsuite.StatusAssertion <em>Status Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Assertion</em>'.
	 * @see no.ntnu.tdt4250.testsuite.StatusAssertion
	 * @generated
	 */
	EClass getStatusAssertion();

	/**
	 * Returns the meta object for the attribute list '{@link no.ntnu.tdt4250.testsuite.StatusAssertion#getSuccessfulCodes <em>Successful Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Successful Codes</em>'.
	 * @see no.ntnu.tdt4250.testsuite.StatusAssertion#getSuccessfulCodes()
	 * @see #getStatusAssertion()
	 * @generated
	 */
	EAttribute getStatusAssertion_SuccessfulCodes();

	/**
	 * Returns the meta object for enum '{@link no.ntnu.tdt4250.testsuite.ParameterLocation <em>Parameter Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Location</em>'.
	 * @see no.ntnu.tdt4250.testsuite.ParameterLocation
	 * @generated
	 */
	EEnum getParameterLocation();

	/**
	 * Returns the meta object for enum '{@link no.ntnu.tdt4250.testsuite.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Method</em>'.
	 * @see no.ntnu.tdt4250.testsuite.Method
	 * @generated
	 */
	EEnum getMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestsuiteFactory getTestsuiteFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.testsuite.impl.TestSuiteImpl <em>Test Suite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.testsuite.impl.TestSuiteImpl
		 * @see no.ntnu.tdt4250.testsuite.impl.TestsuitePackageImpl#getTestSuite()
		 * @generated
		 */
		EClass TEST_SUITE = eINSTANCE.getTestSuite();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_SUITE__NAME = eINSTANCE.getTestSuite_Name();

		/**
		 * The meta object literal for the '<em><b>Test Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SUITE__TEST_CASES = eINSTANCE.getTestSuite_TestCases();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.testsuite.impl.TestCaseImpl <em>Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.testsuite.impl.TestCaseImpl
		 * @see no.ntnu.tdt4250.testsuite.impl.TestsuitePackageImpl#getTestCase()
		 * @generated
		 */
		EClass TEST_CASE = eINSTANCE.getTestCase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__NAME = eINSTANCE.getTestCase_Name();

		/**
		 * The meta object literal for the '<em><b>Test Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__TEST_STEPS = eINSTANCE.getTestCase_TestSteps();

		/**
		 * The meta object literal for the '<em><b>Test Suite</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__TEST_SUITE = eINSTANCE.getTestCase_TestSuite();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.testsuite.impl.TestStepImpl <em>Test Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.testsuite.impl.TestStepImpl
		 * @see no.ntnu.tdt4250.testsuite.impl.TestsuitePackageImpl#getTestStep()
		 * @generated
		 */
		EClass TEST_STEP = eINSTANCE.getTestStep();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_STEP__ID = eINSTANCE.getTestStep_Id();

		/**
		 * The meta object literal for the '<em><b>Test Case</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_STEP__TEST_CASE = eINSTANCE.getTestStep_TestCase();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.testsuite.impl.APIRequestImpl <em>API Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.testsuite.impl.APIRequestImpl
		 * @see no.ntnu.tdt4250.testsuite.impl.TestsuitePackageImpl#getAPIRequest()
		 * @generated
		 */
		EClass API_REQUEST = eINSTANCE.getAPIRequest();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_REQUEST__URI = eINSTANCE.getAPIRequest_Uri();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_REQUEST__METHOD = eINSTANCE.getAPIRequest_Method();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_REQUEST__PARAMETERS = eINSTANCE.getAPIRequest_Parameters();

		/**
		 * The meta object literal for the '<em><b>Assertions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_REQUEST__ASSERTIONS = eINSTANCE.getAPIRequest_Assertions();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_REQUEST__BODY = eINSTANCE.getAPIRequest_Body();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_REQUEST__HEADERS = eINSTANCE.getAPIRequest_Headers();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.testsuite.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.testsuite.impl.HeaderImpl
		 * @see no.ntnu.tdt4250.testsuite.impl.TestsuitePackageImpl#getHeader()
		 * @generated
		 */
		EClass HEADER = eINSTANCE.getHeader();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__KEY = eINSTANCE.getHeader_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__VALUE = eINSTANCE.getHeader_Value();

		/**
		 * The meta object literal for the '<em><b>Api Request</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER__API_REQUEST = eINSTANCE.getHeader_ApiRequest();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.testsuite.impl.InferrableParameterImpl <em>Inferrable Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.testsuite.impl.InferrableParameterImpl
		 * @see no.ntnu.tdt4250.testsuite.impl.TestsuitePackageImpl#getInferrableParameter()
		 * @generated
		 */
		EClass INFERRABLE_PARAMETER = eINSTANCE.getInferrableParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFERRABLE_PARAMETER__NAME = eINSTANCE.getInferrableParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Parameter Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFERRABLE_PARAMETER__PARAMETER_LOCATION = eINSTANCE.getInferrableParameter_ParameterLocation();

		/**
		 * The meta object literal for the '<em><b>Api Request</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFERRABLE_PARAMETER__API_REQUEST = eINSTANCE.getInferrableParameter_ApiRequest();

		/**
		 * The meta object literal for the '<em><b>Test Step Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFERRABLE_PARAMETER__TEST_STEP_ID = eINSTANCE.getInferrableParameter_TestStepId();

		/**
		 * The meta object literal for the '<em><b>Json Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFERRABLE_PARAMETER__JSON_PATH = eINSTANCE.getInferrableParameter_JsonPath();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.testsuite.impl.AssertionImpl <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.testsuite.impl.AssertionImpl
		 * @see no.ntnu.tdt4250.testsuite.impl.TestsuitePackageImpl#getAssertion()
		 * @generated
		 */
		EClass ASSERTION = eINSTANCE.getAssertion();

		/**
		 * The meta object literal for the '<em><b>Error Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION__ERROR_MESSAGE = eINSTANCE.getAssertion_ErrorMessage();

		/**
		 * The meta object literal for the '<em><b>Api Request</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION__API_REQUEST = eINSTANCE.getAssertion_ApiRequest();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.testsuite.impl.StatusAssertionImpl <em>Status Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.testsuite.impl.StatusAssertionImpl
		 * @see no.ntnu.tdt4250.testsuite.impl.TestsuitePackageImpl#getStatusAssertion()
		 * @generated
		 */
		EClass STATUS_ASSERTION = eINSTANCE.getStatusAssertion();

		/**
		 * The meta object literal for the '<em><b>Successful Codes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_ASSERTION__SUCCESSFUL_CODES = eINSTANCE.getStatusAssertion_SuccessfulCodes();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.testsuite.ParameterLocation <em>Parameter Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.testsuite.ParameterLocation
		 * @see no.ntnu.tdt4250.testsuite.impl.TestsuitePackageImpl#getParameterLocation()
		 * @generated
		 */
		EEnum PARAMETER_LOCATION = eINSTANCE.getParameterLocation();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.testsuite.Method <em>Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.testsuite.Method
		 * @see no.ntnu.tdt4250.testsuite.impl.TestsuitePackageImpl#getMethod()
		 * @generated
		 */
		EEnum METHOD = eINSTANCE.getMethod();

	}

} //TestsuitePackage
