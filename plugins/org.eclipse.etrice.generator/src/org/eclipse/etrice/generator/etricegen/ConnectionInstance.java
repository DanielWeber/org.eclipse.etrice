/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.etrice.generator.etricegen;

import org.eclipse.etrice.core.room.LayerConnection;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.etrice.generator.etricegen.ConnectionInstance#getFromAI <em>From AI</em>}</li>
 *   <li>{@link org.eclipse.etrice.generator.etricegen.ConnectionInstance#getFromSPP <em>From SPP</em>}</li>
 *   <li>{@link org.eclipse.etrice.generator.etricegen.ConnectionInstance#getToSPP <em>To SPP</em>}</li>
 *   <li>{@link org.eclipse.etrice.generator.etricegen.ConnectionInstance#getConnection <em>Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getConnectionInstance()
 * @model
 * @generated
 */
public interface ConnectionInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>From AI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From AI</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From AI</em>' reference.
	 * @see #setFromAI(ActorInstance)
	 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getConnectionInstance_FromAI()
	 * @model
	 * @generated
	 */
	ActorInstance getFromAI();

	/**
	 * Sets the value of the '{@link org.eclipse.etrice.generator.etricegen.ConnectionInstance#getFromAI <em>From AI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From AI</em>' reference.
	 * @see #getFromAI()
	 * @generated
	 */
	void setFromAI(ActorInstance value);

	/**
	 * Returns the value of the '<em><b>From SPP</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.etrice.generator.etricegen.SPPInstance#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From SPP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From SPP</em>' reference.
	 * @see #setFromSPP(SPPInstance)
	 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getConnectionInstance_FromSPP()
	 * @see org.eclipse.etrice.generator.etricegen.SPPInstance#getOutgoing
	 * @model opposite="outgoing"
	 * @generated
	 */
	SPPInstance getFromSPP();

	/**
	 * Sets the value of the '{@link org.eclipse.etrice.generator.etricegen.ConnectionInstance#getFromSPP <em>From SPP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From SPP</em>' reference.
	 * @see #getFromSPP()
	 * @generated
	 */
	void setFromSPP(SPPInstance value);

	/**
	 * Returns the value of the '<em><b>To SPP</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.etrice.generator.etricegen.SPPInstance#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To SPP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To SPP</em>' reference.
	 * @see #setToSPP(SPPInstance)
	 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getConnectionInstance_ToSPP()
	 * @see org.eclipse.etrice.generator.etricegen.SPPInstance#getIncoming
	 * @model opposite="incoming"
	 * @generated
	 */
	SPPInstance getToSPP();

	/**
	 * Sets the value of the '{@link org.eclipse.etrice.generator.etricegen.ConnectionInstance#getToSPP <em>To SPP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To SPP</em>' reference.
	 * @see #getToSPP()
	 * @generated
	 */
	void setToSPP(SPPInstance value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' reference.
	 * @see #setConnection(LayerConnection)
	 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getConnectionInstance_Connection()
	 * @model
	 * @generated
	 */
	LayerConnection getConnection();

	/**
	 * Sets the value of the '{@link org.eclipse.etrice.generator.etricegen.ConnectionInstance#getConnection <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(LayerConnection value);

} // ConnectionInstance
