/**
 */
package timetrack.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import timetrack.TimetrackPackage;
import timetrack.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link timetrack.impl.UserImpl#getName <em>Name</em>}</li>
 *   <li>{@link timetrack.impl.UserImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link timetrack.impl.UserImpl#getSap_name <em>Sap name</em>}</li>
 *   <li>{@link timetrack.impl.UserImpl#getSap_password <em>Sap password</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserImpl extends EObjectImpl implements User {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSap_name() <em>Sap name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSap_name()
	 * @generated
	 * @ordered
	 */
	protected static final String SAP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSap_name() <em>Sap name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSap_name()
	 * @generated
	 * @ordered
	 */
	protected String sap_name = SAP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSap_password() <em>Sap password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSap_password()
	 * @generated
	 * @ordered
	 */
	protected static final String SAP_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSap_password() <em>Sap password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSap_password()
	 * @generated
	 * @ordered
	 */
	protected String sap_password = SAP_PASSWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimetrackPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetrackPackage.USER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetrackPackage.USER__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSap_name() {
		return sap_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSap_name(String newSap_name) {
		String oldSap_name = sap_name;
		sap_name = newSap_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetrackPackage.USER__SAP_NAME, oldSap_name, sap_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSap_password() {
		return sap_password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSap_password(String newSap_password) {
		String oldSap_password = sap_password;
		sap_password = newSap_password;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetrackPackage.USER__SAP_PASSWORD, oldSap_password, sap_password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimetrackPackage.USER__NAME:
				return getName();
			case TimetrackPackage.USER__PASSWORD:
				return getPassword();
			case TimetrackPackage.USER__SAP_NAME:
				return getSap_name();
			case TimetrackPackage.USER__SAP_PASSWORD:
				return getSap_password();
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
			case TimetrackPackage.USER__NAME:
				setName((String)newValue);
				return;
			case TimetrackPackage.USER__PASSWORD:
				setPassword((String)newValue);
				return;
			case TimetrackPackage.USER__SAP_NAME:
				setSap_name((String)newValue);
				return;
			case TimetrackPackage.USER__SAP_PASSWORD:
				setSap_password((String)newValue);
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
			case TimetrackPackage.USER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TimetrackPackage.USER__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case TimetrackPackage.USER__SAP_NAME:
				setSap_name(SAP_NAME_EDEFAULT);
				return;
			case TimetrackPackage.USER__SAP_PASSWORD:
				setSap_password(SAP_PASSWORD_EDEFAULT);
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
			case TimetrackPackage.USER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TimetrackPackage.USER__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case TimetrackPackage.USER__SAP_NAME:
				return SAP_NAME_EDEFAULT == null ? sap_name != null : !SAP_NAME_EDEFAULT.equals(sap_name);
			case TimetrackPackage.USER__SAP_PASSWORD:
				return SAP_PASSWORD_EDEFAULT == null ? sap_password != null : !SAP_PASSWORD_EDEFAULT.equals(sap_password);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", password: ");
		result.append(password);
		result.append(", sap_name: ");
		result.append(sap_name);
		result.append(", sap_password: ");
		result.append(sap_password);
		result.append(')');
		return result.toString();
	}

} //UserImpl
