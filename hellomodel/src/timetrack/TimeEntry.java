/**
 */
package timetrack;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link timetrack.TimeEntry#getUser <em>User</em>}</li>
 *   <li>{@link timetrack.TimeEntry#getProject <em>Project</em>}</li>
 *   <li>{@link timetrack.TimeEntry#getDay <em>Day</em>}</li>
 *   <li>{@link timetrack.TimeEntry#getFrom <em>From</em>}</li>
 *   <li>{@link timetrack.TimeEntry#getTill <em>Till</em>}</li>
 *   <li>{@link timetrack.TimeEntry#getDuration <em>Duration</em>}</li>
 *   <li>{@link timetrack.TimeEntry#isFactured <em>Factured</em>}</li>
 *   <li>{@link timetrack.TimeEntry#getNotes <em>Notes</em>}</li>
 *   <li>{@link timetrack.TimeEntry#getSync_date <em>Sync date</em>}</li>
 * </ul>
 * </p>
 *
 * @see timetrack.TimetrackPackage#getTimeEntry()
 * @model
 * @generated
 */
public interface TimeEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see timetrack.TimetrackPackage#getTimeEntry_User()
	 * @model required="true"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link timetrack.TimeEntry#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(Project)
	 * @see timetrack.TimetrackPackage#getTimeEntry_Project()
	 * @model required="true"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link timetrack.TimeEntry#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see #setDay(Date)
	 * @see timetrack.TimetrackPackage#getTimeEntry_Day()
	 * @model unique="false"
	 * @generated
	 */
	Date getDay();

	/**
	 * Sets the value of the '{@link timetrack.TimeEntry#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(Date value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(Date)
	 * @see timetrack.TimetrackPackage#getTimeEntry_From()
	 * @model unique="false"
	 * @generated
	 */
	Date getFrom();

	/**
	 * Sets the value of the '{@link timetrack.TimeEntry#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Date value);

	/**
	 * Returns the value of the '<em><b>Till</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Till</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Till</em>' attribute.
	 * @see #setTill(Date)
	 * @see timetrack.TimetrackPackage#getTimeEntry_Till()
	 * @model unique="false"
	 * @generated
	 */
	Date getTill();

	/**
	 * Sets the value of the '{@link timetrack.TimeEntry#getTill <em>Till</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Till</em>' attribute.
	 * @see #getTill()
	 * @generated
	 */
	void setTill(Date value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(Date)
	 * @see timetrack.TimetrackPackage#getTimeEntry_Duration()
	 * @model transient="true"
	 * @generated
	 */
	Date getDuration();

	/**
	 * Sets the value of the '{@link timetrack.TimeEntry#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Date value);

	/**
	 * Returns the value of the '<em><b>Factured</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factured</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factured</em>' attribute.
	 * @see #setFactured(boolean)
	 * @see timetrack.TimetrackPackage#getTimeEntry_Factured()
	 * @model unique="false" required="true"
	 * @generated
	 */
	boolean isFactured();

	/**
	 * Sets the value of the '{@link timetrack.TimeEntry#isFactured <em>Factured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factured</em>' attribute.
	 * @see #isFactured()
	 * @generated
	 */
	void setFactured(boolean value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(String)
	 * @see timetrack.TimetrackPackage#getTimeEntry_Notes()
	 * @model unique="false"
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link timetrack.TimeEntry#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Sync date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sync date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sync date</em>' attribute.
	 * @see #setSync_date(Date)
	 * @see timetrack.TimetrackPackage#getTimeEntry_Sync_date()
	 * @model unique="false"
	 * @generated
	 */
	Date getSync_date();

	/**
	 * Sets the value of the '{@link timetrack.TimeEntry#getSync_date <em>Sync date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync date</em>' attribute.
	 * @see #getSync_date()
	 * @generated
	 */
	void setSync_date(Date value);

} // TimeEntry
