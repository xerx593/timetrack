/**
 */
package timetrack;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see timetrack.TimetrackFactory
 * @model kind="package"
 * @generated
 */
public interface TimetrackPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "timetrack";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://timetrack/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "timetrack";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimetrackPackage eINSTANCE = timetrack.impl.TimetrackPackageImpl.init();

	/**
	 * The meta object id for the '{@link timetrack.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see timetrack.impl.UserImpl
	 * @see timetrack.impl.TimetrackPackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASSWORD = 1;

	/**
	 * The feature id for the '<em><b>Sap name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SAP_NAME = 2;

	/**
	 * The feature id for the '<em><b>Sap password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SAP_PASSWORD = 3;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link timetrack.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see timetrack.impl.ProjectImpl
	 * @see timetrack.impl.TimetrackPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link timetrack.impl.TimeEntryImpl <em>Time Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see timetrack.impl.TimeEntryImpl
	 * @see timetrack.impl.TimetrackPackageImpl#getTimeEntry()
	 * @generated
	 */
	int TIME_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__USER = 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__DAY = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__FROM = 3;

	/**
	 * The feature id for the '<em><b>Till</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__TILL = 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__DURATION = 5;

	/**
	 * The feature id for the '<em><b>Factured</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__FACTURED = 6;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__NOTES = 7;

	/**
	 * The feature id for the '<em><b>Sync date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__SYNC_DATE = 8;

	/**
	 * The number of structural features of the '<em>Time Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link timetrack.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see timetrack.impl.LibraryImpl
	 * @see timetrack.impl.TimetrackPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 3;

	/**
	 * The feature id for the '<em><b>List Book</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__LIST_BOOK = 0;

	/**
	 * The feature id for the '<em><b>List Time Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__LIST_TIME_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>List Project</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__LIST_PROJECT = 2;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link timetrack.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see timetrack.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link timetrack.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see timetrack.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link timetrack.User#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see timetrack.User#getPassword()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Password();

	/**
	 * Returns the meta object for the attribute '{@link timetrack.User#getSap_name <em>Sap name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sap name</em>'.
	 * @see timetrack.User#getSap_name()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Sap_name();

	/**
	 * Returns the meta object for the attribute '{@link timetrack.User#getSap_password <em>Sap password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sap password</em>'.
	 * @see timetrack.User#getSap_password()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Sap_password();

	/**
	 * Returns the meta object for class '{@link timetrack.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see timetrack.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link timetrack.Project#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see timetrack.Project#getNumber()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Number();

	/**
	 * Returns the meta object for the attribute '{@link timetrack.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see timetrack.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for class '{@link timetrack.TimeEntry <em>Time Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Entry</em>'.
	 * @see timetrack.TimeEntry
	 * @generated
	 */
	EClass getTimeEntry();

	/**
	 * Returns the meta object for the reference '{@link timetrack.TimeEntry#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see timetrack.TimeEntry#getUser()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EReference getTimeEntry_User();

	/**
	 * Returns the meta object for the reference '{@link timetrack.TimeEntry#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project</em>'.
	 * @see timetrack.TimeEntry#getProject()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EReference getTimeEntry_Project();

	/**
	 * Returns the meta object for the attribute '{@link timetrack.TimeEntry#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see timetrack.TimeEntry#getDay()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EAttribute getTimeEntry_Day();

	/**
	 * Returns the meta object for the attribute '{@link timetrack.TimeEntry#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see timetrack.TimeEntry#getFrom()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EAttribute getTimeEntry_From();

	/**
	 * Returns the meta object for the attribute '{@link timetrack.TimeEntry#getTill <em>Till</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Till</em>'.
	 * @see timetrack.TimeEntry#getTill()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EAttribute getTimeEntry_Till();

	/**
	 * Returns the meta object for the attribute '{@link timetrack.TimeEntry#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see timetrack.TimeEntry#getDuration()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EAttribute getTimeEntry_Duration();

	/**
	 * Returns the meta object for the attribute '{@link timetrack.TimeEntry#isFactured <em>Factured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factured</em>'.
	 * @see timetrack.TimeEntry#isFactured()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EAttribute getTimeEntry_Factured();

	/**
	 * Returns the meta object for the attribute '{@link timetrack.TimeEntry#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see timetrack.TimeEntry#getNotes()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EAttribute getTimeEntry_Notes();

	/**
	 * Returns the meta object for the attribute '{@link timetrack.TimeEntry#getSync_date <em>Sync date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync date</em>'.
	 * @see timetrack.TimeEntry#getSync_date()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EAttribute getTimeEntry_Sync_date();

	/**
	 * Returns the meta object for class '{@link timetrack.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see timetrack.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link timetrack.Library#getListBook <em>List Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Book</em>'.
	 * @see timetrack.Library#getListBook()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_ListBook();

	/**
	 * Returns the meta object for the containment reference list '{@link timetrack.Library#getListTimeEntry <em>List Time Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Time Entry</em>'.
	 * @see timetrack.Library#getListTimeEntry()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_ListTimeEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link timetrack.Library#getListProject <em>List Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Project</em>'.
	 * @see timetrack.Library#getListProject()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_ListProject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimetrackFactory getTimetrackFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link timetrack.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see timetrack.impl.UserImpl
		 * @see timetrack.impl.TimetrackPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PASSWORD = eINSTANCE.getUser_Password();

		/**
		 * The meta object literal for the '<em><b>Sap name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__SAP_NAME = eINSTANCE.getUser_Sap_name();

		/**
		 * The meta object literal for the '<em><b>Sap password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__SAP_PASSWORD = eINSTANCE.getUser_Sap_password();

		/**
		 * The meta object literal for the '{@link timetrack.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see timetrack.impl.ProjectImpl
		 * @see timetrack.impl.TimetrackPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NUMBER = eINSTANCE.getProject_Number();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '{@link timetrack.impl.TimeEntryImpl <em>Time Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see timetrack.impl.TimeEntryImpl
		 * @see timetrack.impl.TimetrackPackageImpl#getTimeEntry()
		 * @generated
		 */
		EClass TIME_ENTRY = eINSTANCE.getTimeEntry();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ENTRY__USER = eINSTANCE.getTimeEntry_User();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ENTRY__PROJECT = eINSTANCE.getTimeEntry_Project();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ENTRY__DAY = eINSTANCE.getTimeEntry_Day();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ENTRY__FROM = eINSTANCE.getTimeEntry_From();

		/**
		 * The meta object literal for the '<em><b>Till</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ENTRY__TILL = eINSTANCE.getTimeEntry_Till();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ENTRY__DURATION = eINSTANCE.getTimeEntry_Duration();

		/**
		 * The meta object literal for the '<em><b>Factured</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ENTRY__FACTURED = eINSTANCE.getTimeEntry_Factured();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ENTRY__NOTES = eINSTANCE.getTimeEntry_Notes();

		/**
		 * The meta object literal for the '<em><b>Sync date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ENTRY__SYNC_DATE = eINSTANCE.getTimeEntry_Sync_date();

		/**
		 * The meta object literal for the '{@link timetrack.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see timetrack.impl.LibraryImpl
		 * @see timetrack.impl.TimetrackPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>List Book</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__LIST_BOOK = eINSTANCE.getLibrary_ListBook();

		/**
		 * The meta object literal for the '<em><b>List Time Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__LIST_TIME_ENTRY = eINSTANCE.getLibrary_ListTimeEntry();

		/**
		 * The meta object literal for the '<em><b>List Project</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__LIST_PROJECT = eINSTANCE.getLibrary_ListProject();

	}

} //TimetrackPackage
