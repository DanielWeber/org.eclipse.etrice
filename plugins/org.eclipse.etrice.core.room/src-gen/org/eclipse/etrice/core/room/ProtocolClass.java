/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.etrice.core.room;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.etrice.core.room.ProtocolClass#getBase <em>Base</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.ProtocolClass#getUserCode1 <em>User Code1</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.ProtocolClass#getUserCode2 <em>User Code2</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.ProtocolClass#getIncomingMessages <em>Incoming Messages</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.ProtocolClass#getOutgoingMessages <em>Outgoing Messages</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.ProtocolClass#getRegular <em>Regular</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.ProtocolClass#getConjugate <em>Conjugate</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.ProtocolClass#getSemantics <em>Semantics</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.etrice.core.room.RoomPackage#getProtocolClass()
 * @model
 * @generated
 */
public interface ProtocolClass extends RoomClass
{
  /**
   * Returns the value of the '<em><b>Base</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' reference.
   * @see #setBase(ProtocolClass)
   * @see org.eclipse.etrice.core.room.RoomPackage#getProtocolClass_Base()
   * @model
   * @generated
   */
  ProtocolClass getBase();

  /**
   * Sets the value of the '{@link org.eclipse.etrice.core.room.ProtocolClass#getBase <em>Base</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' reference.
   * @see #getBase()
   * @generated
   */
  void setBase(ProtocolClass value);

  /**
   * Returns the value of the '<em><b>User Code1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>User Code1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>User Code1</em>' containment reference.
   * @see #setUserCode1(DetailCode)
   * @see org.eclipse.etrice.core.room.RoomPackage#getProtocolClass_UserCode1()
   * @model containment="true"
   * @generated
   */
  DetailCode getUserCode1();

  /**
   * Sets the value of the '{@link org.eclipse.etrice.core.room.ProtocolClass#getUserCode1 <em>User Code1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>User Code1</em>' containment reference.
   * @see #getUserCode1()
   * @generated
   */
  void setUserCode1(DetailCode value);

  /**
   * Returns the value of the '<em><b>User Code2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>User Code2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>User Code2</em>' containment reference.
   * @see #setUserCode2(DetailCode)
   * @see org.eclipse.etrice.core.room.RoomPackage#getProtocolClass_UserCode2()
   * @model containment="true"
   * @generated
   */
  DetailCode getUserCode2();

  /**
   * Sets the value of the '{@link org.eclipse.etrice.core.room.ProtocolClass#getUserCode2 <em>User Code2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>User Code2</em>' containment reference.
   * @see #getUserCode2()
   * @generated
   */
  void setUserCode2(DetailCode value);

  /**
   * Returns the value of the '<em><b>Incoming Messages</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.etrice.core.room.Message}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incoming Messages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incoming Messages</em>' containment reference list.
   * @see org.eclipse.etrice.core.room.RoomPackage#getProtocolClass_IncomingMessages()
   * @model containment="true"
   * @generated
   */
  EList<Message> getIncomingMessages();

  /**
   * Returns the value of the '<em><b>Outgoing Messages</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.etrice.core.room.Message}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outgoing Messages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outgoing Messages</em>' containment reference list.
   * @see org.eclipse.etrice.core.room.RoomPackage#getProtocolClass_OutgoingMessages()
   * @model containment="true"
   * @generated
   */
  EList<Message> getOutgoingMessages();

  /**
   * Returns the value of the '<em><b>Regular</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Regular</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Regular</em>' containment reference.
   * @see #setRegular(PortClass)
   * @see org.eclipse.etrice.core.room.RoomPackage#getProtocolClass_Regular()
   * @model containment="true"
   * @generated
   */
  PortClass getRegular();

  /**
   * Sets the value of the '{@link org.eclipse.etrice.core.room.ProtocolClass#getRegular <em>Regular</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Regular</em>' containment reference.
   * @see #getRegular()
   * @generated
   */
  void setRegular(PortClass value);

  /**
   * Returns the value of the '<em><b>Conjugate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conjugate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conjugate</em>' containment reference.
   * @see #setConjugate(PortClass)
   * @see org.eclipse.etrice.core.room.RoomPackage#getProtocolClass_Conjugate()
   * @model containment="true"
   * @generated
   */
  PortClass getConjugate();

  /**
   * Sets the value of the '{@link org.eclipse.etrice.core.room.ProtocolClass#getConjugate <em>Conjugate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conjugate</em>' containment reference.
   * @see #getConjugate()
   * @generated
   */
  void setConjugate(PortClass value);

  /**
   * Returns the value of the '<em><b>Semantics</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Semantics</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Semantics</em>' containment reference.
   * @see #setSemantics(ProtocolSemantics)
   * @see org.eclipse.etrice.core.room.RoomPackage#getProtocolClass_Semantics()
   * @model containment="true"
   * @generated
   */
  ProtocolSemantics getSemantics();

  /**
   * Sets the value of the '{@link org.eclipse.etrice.core.room.ProtocolClass#getSemantics <em>Semantics</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Semantics</em>' containment reference.
   * @see #getSemantics()
   * @generated
   */
  void setSemantics(ProtocolSemantics value);

} // ProtocolClass
