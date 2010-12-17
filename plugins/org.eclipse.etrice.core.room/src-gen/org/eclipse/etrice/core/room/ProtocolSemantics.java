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
 * A representation of the model object '<em><b>Protocol Semantics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.etrice.core.room.ProtocolSemantics#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.etrice.core.room.RoomPackage#getProtocolSemantics()
 * @model
 * @generated
 */
public interface ProtocolSemantics extends EObject
{
  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.etrice.core.room.SemanticsRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see org.eclipse.etrice.core.room.RoomPackage#getProtocolSemantics_Rules()
   * @model containment="true"
   * @generated
   */
  EList<SemanticsRule> getRules();

} // ProtocolSemantics
