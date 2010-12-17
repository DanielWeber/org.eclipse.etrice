/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.etrice.core.room;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.etrice.core.room.Trigger#getMsgFromIfPairs <em>Msg From If Pairs</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.Trigger#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.etrice.core.room.RoomPackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends EObject
{
  /**
   * Returns the value of the '<em><b>Msg From If Pairs</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.etrice.core.room.MessageFromIf}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Msg From If Pairs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Msg From If Pairs</em>' containment reference list.
   * @see org.eclipse.etrice.core.room.RoomPackage#getTrigger_MsgFromIfPairs()
   * @model containment="true"
   * @generated
   */
  EList<MessageFromIf> getMsgFromIfPairs();

  /**
   * Returns the value of the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' containment reference.
   * @see #setGuard(Guard)
   * @see org.eclipse.etrice.core.room.RoomPackage#getTrigger_Guard()
   * @model containment="true"
   * @generated
   */
  Guard getGuard();

  /**
   * Sets the value of the '{@link org.eclipse.etrice.core.room.Trigger#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(Guard value);

} // Trigger
