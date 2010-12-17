/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.etrice.core.room;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SP Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.etrice.core.room.SPPoint#getRef <em>Ref</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.SPPoint#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.etrice.core.room.RoomPackage#getSPPoint()
 * @model
 * @generated
 */
public interface SPPoint extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(ActorContainerRef)
   * @see org.eclipse.etrice.core.room.RoomPackage#getSPPoint_Ref()
   * @model
   * @generated
   */
  ActorContainerRef getRef();

  /**
   * Sets the value of the '{@link org.eclipse.etrice.core.room.SPPoint#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(ActorContainerRef value);

  /**
   * Returns the value of the '<em><b>Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service</em>' reference.
   * @see #setService(SPPRef)
   * @see org.eclipse.etrice.core.room.RoomPackage#getSPPoint_Service()
   * @model
   * @generated
   */
  SPPRef getService();

  /**
   * Sets the value of the '{@link org.eclipse.etrice.core.room.SPPoint#getService <em>Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service</em>' reference.
   * @see #getService()
   * @generated
   */
  void setService(SPPRef value);

} // SPPoint
