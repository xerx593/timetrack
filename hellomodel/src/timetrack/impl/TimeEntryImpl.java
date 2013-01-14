/**
 */
package timetrack.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import timetrack.Project;
import timetrack.TimeEntry;
import timetrack.TimetrackPackage;
import timetrack.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link timetrack.impl.TimeEntryImpl#getUser <em>User</em>}</li>
 *   <li>{@link timetrack.impl.TimeEntryImpl#getProject <em>Project</em>}</li>
 *   <li>{@link timetrack.impl.TimeEntryImpl#getDay <em>Day</em>}</li>
 *   <li>{@link timetrack.impl.TimeEntryImpl#getFrom <em>From</em>}</li>
 *   <li>{@link timetrack.impl.TimeEntryImpl#getTill <em>Till</em>}</li>
 *   <li>{@link timetrack.impl.TimeEntryImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link timetrack.impl.TimeEntryImpl#isFactured <em>Factured</em>}</li>
 *   <li>{@link timetrack.impl.TimeEntryImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link timetrack.impl.TimeEntryImpl#getSync_date <em>Sync date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeEntryImpl extends EObjectImpl implements TimeEntry {
	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected User user;

	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected Project project;

	/**
	 * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected static final Date DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected Date day = DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Date from = FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTill() <em>Till</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTill()
	 * @generated
	 * @ordered
	 */
	protected static final Date TILL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTill() <em>Till</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTill()
	 * @generated
	 * @ordered
	 */
	protected Date till = TILL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Date DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Date duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isFactured() <em>Factured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFactured()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FACTURED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFactured() <em>Factured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFactured()
	 * @generated
	 * @ordered
	 */
	protected boolean factured = FACTURED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected String notes = NOTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSync_date() <em>Sync date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSync_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date SYNC_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSync_date() <em>Sync date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSync_date()
	 * @generated
	 * @ordered
	 */
	protected Date sync_date = SYNC_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimetrackPackage.Literals.TIME_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUser() {
		if (user != null && user.eIsProxy()) {
			InternalEObject oldUser = (InternalEObject)user;
			user = (User)eResolveProxy(oldUser);
			if (user != oldUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimetrackPackage.TIME_ENTRY__USER, oldUser, user));
			}
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(User newUser) {
		User oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetrackPackage.TIME_ENTRY__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		if (project != null && project.eIsProxy()) {
			InternalEObject oldProject = (InternalEObject)project;
			project = (Project)eResolveProxy(oldProject);
			if (project != oldProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimetrackPackage.TIME_ENTRY__PROJECT, oldProject, project));
			}
		}
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project basicGetProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		Project oldProject = project;
		project = newProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetrackPackage.TIME_ENTRY__PROJECT, oldProject, project));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDay(Date newDay) {
		Date oldDay = day;
		day = newDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetrackPackage.TIME_ENTRY__DAY, oldDay, day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Date newFrom) {
		Date oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetrackPackage.TIME_ENTRY__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTill() {
		return till;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTill(Date newTill) {
		Date oldTill = till;
		till = newTill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetrackPackage.TIME_ENTRY__TILL, oldTill, till));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Date newDuration) {
		Date oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetrackPackage.TIME_ENTRY__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFactured() {
		return factured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactured(boolean newFactured) {
		boolean oldFactured = factured;
		factured = newFactured;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetrackPackage.TIME_ENTRY__FACTURED, oldFactured, factured));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(String newNotes) {
		String oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetrackPackage.TIME_ENTRY__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getSync_date() {
		return sync_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSync_date(Date newSync_date) {
		Date oldSync_date = sync_date;
		sync_date = newSync_date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetrackPackage.TIME_ENTRY__SYNC_DATE, oldSync_date, sync_date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimetrackPackage.TIME_ENTRY__USER:
				if (resolve) return getUser();
				return basicGetUser();
			case TimetrackPackage.TIME_ENTRY__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
			case TimetrackPackage.TIME_ENTRY__DAY:
				return getDay();
			case TimetrackPackage.TIME_ENTRY__FROM:
				return getFrom();
			case TimetrackPackage.TIME_ENTRY__TILL:
				return getTill();
			case TimetrackPackage.TIME_ENTRY__DURATION:
				return getDuration();
			case TimetrackPackage.TIME_ENTRY__FACTURED:
				return isFactured();
			case TimetrackPackage.TIME_ENTRY__NOTES:
				return getNotes();
			case TimetrackPackage.TIME_ENTRY__SYNC_DATE:
				return getSync_date();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TimetrackPackage.TIME_ENTRY__USER:
				setUser((User)newValue);
				return;
			case TimetrackPackage.TIME_ENTRY__PROJECT:
				setProject((Project)newValue);
				return;
			case TimetrackPackage.TIME_ENTRY__DAY:
				setDay((Date)newValue);
				return;
			case TimetrackPackage.TIME_ENTRY__FROM:
				setFrom((Date)newValue);
				return;
			case TimetrackPackage.TIME_ENTRY__TILL:
				setTill((Date)newValue);
				return;
			case TimetrackPackage.TIME_ENTRY__DURATION:
				setDuration((Date)newValue);
				return;
			case TimetrackPackage.TIME_ENTRY__FACTURED:
				setFactured((Boolean)newValue);
				return;
			case TimetrackPackage.TIME_ENTRY__NOTES:
				setNotes((String)newValue);
				return;
			case TimetrackPackage.TIME_ENTRY__SYNC_DATE:
				setSync_date((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TimetrackPackage.TIME_ENTRY__USER:
				setUser((User)null);
				return;
			case TimetrackPackage.TIME_ENTRY__PROJECT:
				setProject((Project)null);
				return;
			case TimetrackPackage.TIME_ENTRY__DAY:
				setDay(DAY_EDEFAULT);
				return;
			case TimetrackPackage.TIME_ENTRY__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case TimetrackPackage.TIME_ENTRY__TILL:
				setTill(TILL_EDEFAULT);
				return;
			case TimetrackPackage.TIME_ENTRY__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case TimetrackPackage.TIME_ENTRY__FACTURED:
				setFactured(FACTURED_EDEFAULT);
				return;
			case TimetrackPackage.TIME_ENTRY__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case TimetrackPackage.TIME_ENTRY__SYNC_DATE:
				setSync_date(SYNC_DATE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TimetrackPackage.TIME_ENTRY__USER:
				return user != null;
			case TimetrackPackage.TIME_ENTRY__PROJECT:
				return project != null;
			case TimetrackPackage.TIME_ENTRY__DAY:
				return DAY_EDEFAULT == null ? day != null : !DAY_EDEFAULT.equals(day);
			case TimetrackPackage.TIME_ENTRY__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case TimetrackPackage.TIME_ENTRY__TILL:
				return TILL_EDEFAULT == null ? till != null : !TILL_EDEFAULT.equals(till);
			case TimetrackPackage.TIME_ENTRY__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case TimetrackPackage.TIME_ENTRY__FACTURED:
				return factured != FACTURED_EDEFAULT;
			case TimetrackPackage.TIME_ENTRY__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case TimetrackPackage.TIME_ENTRY__SYNC_DATE:
				return SYNC_DATE_EDEFAULT == null ? sync_date != null : !SYNC_DATE_EDEFAULT.equals(sync_date);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (day: ");
		result.append(day);
		result.append(", from: ");
		result.append(from);
		result.append(", till: ");
		result.append(till);
		result.append(", duration: ");
		result.append(duration);
		result.append(", factured: ");
		result.append(factured);
		result.append(", notes: ");
		result.append(notes);
		result.append(", sync_date: ");
		result.append(sync_date);
		result.append(')');
		return result.toString();
	}

} //TimeEntryImpl
