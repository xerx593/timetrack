/**
 */
package timetrack;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link timetrack.Library#getListBook <em>List Book</em>}</li>
 *   <li>{@link timetrack.Library#getListTimeEntry <em>List Time Entry</em>}</li>
 *   <li>{@link timetrack.Library#getListProject <em>List Project</em>}</li>
 * </ul>
 * </p>
 *
 * @see timetrack.TimetrackPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends EObject {
	/**
	 * Returns the value of the '<em><b>List Book</b></em>' containment reference list.
	 * The list contents are of type {@link timetrack.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Book</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Book</em>' containment reference list.
	 * @see timetrack.TimetrackPackage#getLibrary_ListBook()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getListBook();

	/**
	 * Returns the value of the '<em><b>List Time Entry</b></em>' containment reference list.
	 * The list contents are of type {@link timetrack.TimeEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Time Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Time Entry</em>' containment reference list.
	 * @see timetrack.TimetrackPackage#getLibrary_ListTimeEntry()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimeEntry> getListTimeEntry();

	/**
	 * Returns the value of the '<em><b>List Project</b></em>' containment reference list.
	 * The list contents are of type {@link timetrack.Project}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Project</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Project</em>' containment reference list.
	 * @see timetrack.TimetrackPackage#getLibrary_ListProject()
	 * @model containment="true"
	 * @generated
	 */
	EList<Project> getListProject();

} // Library
