/**
 */
package timetrack.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import timetrack.Library;
import timetrack.Project;
import timetrack.TimeEntry;
import timetrack.TimetrackPackage;
import timetrack.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link timetrack.impl.LibraryImpl#getListBook <em>List Book</em>}</li>
 *   <li>{@link timetrack.impl.LibraryImpl#getListTimeEntry <em>List Time Entry</em>}</li>
 *   <li>{@link timetrack.impl.LibraryImpl#getListProject <em>List Project</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LibraryImpl extends EObjectImpl implements Library {
	/**
	 * The cached value of the '{@link #getListBook() <em>List Book</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListBook()
	 * @generated
	 * @ordered
	 */
	protected EList<User> listBook;

	/**
	 * The cached value of the '{@link #getListTimeEntry() <em>List Time Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListTimeEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeEntry> listTimeEntry;

	/**
	 * The cached value of the '{@link #getListProject() <em>List Project</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListProject()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> listProject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimetrackPackage.Literals.LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getListBook() {
		if (listBook == null) {
			listBook = new EObjectContainmentEList<User>(User.class, this, TimetrackPackage.LIBRARY__LIST_BOOK);
		}
		return listBook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeEntry> getListTimeEntry() {
		if (listTimeEntry == null) {
			listTimeEntry = new EObjectContainmentEList<TimeEntry>(TimeEntry.class, this, TimetrackPackage.LIBRARY__LIST_TIME_ENTRY);
		}
		return listTimeEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Project> getListProject() {
		if (listProject == null) {
			listProject = new EObjectContainmentEList<Project>(Project.class, this, TimetrackPackage.LIBRARY__LIST_PROJECT);
		}
		return listProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimetrackPackage.LIBRARY__LIST_BOOK:
				return ((InternalEList<?>)getListBook()).basicRemove(otherEnd, msgs);
			case TimetrackPackage.LIBRARY__LIST_TIME_ENTRY:
				return ((InternalEList<?>)getListTimeEntry()).basicRemove(otherEnd, msgs);
			case TimetrackPackage.LIBRARY__LIST_PROJECT:
				return ((InternalEList<?>)getListProject()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimetrackPackage.LIBRARY__LIST_BOOK:
				return getListBook();
			case TimetrackPackage.LIBRARY__LIST_TIME_ENTRY:
				return getListTimeEntry();
			case TimetrackPackage.LIBRARY__LIST_PROJECT:
				return getListProject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TimetrackPackage.LIBRARY__LIST_BOOK:
				getListBook().clear();
				getListBook().addAll((Collection<? extends User>)newValue);
				return;
			case TimetrackPackage.LIBRARY__LIST_TIME_ENTRY:
				getListTimeEntry().clear();
				getListTimeEntry().addAll((Collection<? extends TimeEntry>)newValue);
				return;
			case TimetrackPackage.LIBRARY__LIST_PROJECT:
				getListProject().clear();
				getListProject().addAll((Collection<? extends Project>)newValue);
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
			case TimetrackPackage.LIBRARY__LIST_BOOK:
				getListBook().clear();
				return;
			case TimetrackPackage.LIBRARY__LIST_TIME_ENTRY:
				getListTimeEntry().clear();
				return;
			case TimetrackPackage.LIBRARY__LIST_PROJECT:
				getListProject().clear();
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
			case TimetrackPackage.LIBRARY__LIST_BOOK:
				return listBook != null && !listBook.isEmpty();
			case TimetrackPackage.LIBRARY__LIST_TIME_ENTRY:
				return listTimeEntry != null && !listTimeEntry.isEmpty();
			case TimetrackPackage.LIBRARY__LIST_PROJECT:
				return listProject != null && !listProject.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LibraryImpl
