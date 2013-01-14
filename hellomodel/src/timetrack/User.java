/**
 */
package timetrack;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link timetrack.User#getName <em>Name</em>}</li>
 *   <li>{@link timetrack.User#getPassword <em>Password</em>}</li>
 *   <li>{@link timetrack.User#getSap_name <em>Sap name</em>}</li>
 *   <li>{@link timetrack.User#getSap_password <em>Sap password</em>}</li>
 * </ul>
 * </p>
 *
 * @see timetrack.TimetrackPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see timetrack.TimetrackPackage#getUser_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link timetrack.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see timetrack.TimetrackPackage#getUser_Password()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link timetrack.User#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Sap name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sap name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sap name</em>' attribute.
	 * @see #setSap_name(String)
	 * @see timetrack.TimetrackPackage#getUser_Sap_name()
	 * @model required="true"
	 * @generated
	 */
	String getSap_name();

	/**
	 * Sets the value of the '{@link timetrack.User#getSap_name <em>Sap name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sap name</em>' attribute.
	 * @see #getSap_name()
	 * @generated
	 */
	void setSap_name(String value);

	/**
	 * Returns the value of the '<em><b>Sap password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sap password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sap password</em>' attribute.
	 * @see #setSap_password(String)
	 * @see timetrack.TimetrackPackage#getUser_Sap_password()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getSap_password();

	/**
	 * Sets the value of the '{@link timetrack.User#getSap_password <em>Sap password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sap password</em>' attribute.
	 * @see #getSap_password()
	 * @generated
	 */
	void setSap_password(String value);

} // User
