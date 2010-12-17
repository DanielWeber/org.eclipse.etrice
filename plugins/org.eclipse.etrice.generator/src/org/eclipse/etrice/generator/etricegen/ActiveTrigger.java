/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.etrice.generator.etricegen;

import org.eclipse.etrice.core.room.InterfaceItem;
import org.eclipse.etrice.core.room.Message;
import org.eclipse.etrice.core.room.TriggeredTransition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Active Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.etrice.generator.etricegen.ActiveTrigger#getMsg <em>Msg</em>}</li>
 *   <li>{@link org.eclipse.etrice.generator.etricegen.ActiveTrigger#getIfitem <em>Ifitem</em>}</li>
 *   <li>{@link org.eclipse.etrice.generator.etricegen.ActiveTrigger#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.eclipse.etrice.generator.etricegen.ActiveTrigger#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getActiveTrigger()
 * @model
 * @generated
 */
public interface ActiveTrigger extends EObject {
	/**
	 * Returns the value of the '<em><b>Msg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg</em>' reference.
	 * @see #setMsg(Message)
	 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getActiveTrigger_Msg()
	 * @model
	 * @generated
	 */
	Message getMsg();

	/**
	 * Sets the value of the '{@link org.eclipse.etrice.generator.etricegen.ActiveTrigger#getMsg <em>Msg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg</em>' reference.
	 * @see #getMsg()
	 * @generated
	 */
	void setMsg(Message value);

	/**
	 * Returns the value of the '<em><b>Ifitem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifitem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifitem</em>' reference.
	 * @see #setIfitem(InterfaceItem)
	 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getActiveTrigger_Ifitem()
	 * @model
	 * @generated
	 */
	InterfaceItem getIfitem();

	/**
	 * Sets the value of the '{@link org.eclipse.etrice.generator.etricegen.ActiveTrigger#getIfitem <em>Ifitem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifitem</em>' reference.
	 * @see #getIfitem()
	 * @generated
	 */
	void setIfitem(InterfaceItem value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see #setTrigger(String)
	 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getActiveTrigger_Trigger()
	 * @model
	 * @generated
	 */
	String getTrigger();

	/**
	 * Sets the value of the '{@link org.eclipse.etrice.generator.etricegen.ActiveTrigger#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(String value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.etrice.core.room.TriggeredTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' reference list.
	 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getActiveTrigger_Transitions()
	 * @model
	 * @generated
	 */
	EList<TriggeredTransition> getTransitions();

} // ActiveTrigger
