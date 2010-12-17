/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.etrice.core.room;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.etrice.core.room.ActorClass#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.ActorClass#getBase <em>Base</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.ActorClass#getIfPorts <em>If Ports</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.ActorClass#getUserCode1 <em>User Code1</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.ActorClass#getUserCode2 <em>User Code2</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.ActorClass#getIntPorts <em>Int Ports</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.ActorClass#getExtPorts <em>Ext Ports</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.ActorClass#getServiceImplementations <em>Service Implementations</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.ActorClass#getStrSAPs <em>Str SA Ps</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.ActorClass#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.ActorClass#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.ActorClass#getStateMachine <em>State Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.etrice.core.room.RoomPackage#getActorClass()
 * @model
 * @generated
 */
public interface ActorClass extends ActorContainerClass
{
  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(boolean)
   * @see org.eclipse.etrice.core.room.RoomPackage#getActorClass_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link org.eclipse.etrice.core.room.ActorClass#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

  /**
   * Returns the value of the '<em><b>Base</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' reference.
   * @see #setBase(ActorClass)
   * @see org.eclipse.etrice.core.room.RoomPackage#getActorClass_Base()
   * @model
   * @generated
   */
  ActorClass getBase();

  /**
   * Sets the value of the '{@link org.eclipse.etrice.core.room.ActorClass#getBase <em>Base</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' reference.
   * @see #getBase()
   * @generated
   */
  void setBase(ActorClass value);

  /**
   * Returns the value of the '<em><b>If Ports</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.etrice.core.room.Port}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If Ports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If Ports</em>' containment reference list.
   * @see org.eclipse.etrice.core.room.RoomPackage#getActorClass_IfPorts()
   * @model containment="true"
   * @generated
   */
  EList<Port> getIfPorts();

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
   * @see org.eclipse.etrice.core.room.RoomPackage#getActorClass_UserCode1()
   * @model containment="true"
   * @generated
   */
  DetailCode getUserCode1();

  /**
   * Sets the value of the '{@link org.eclipse.etrice.core.room.ActorClass#getUserCode1 <em>User Code1</em>}' containment reference.
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
   * @see org.eclipse.etrice.core.room.RoomPackage#getActorClass_UserCode2()
   * @model containment="true"
   * @generated
   */
  DetailCode getUserCode2();

  /**
   * Sets the value of the '{@link org.eclipse.etrice.core.room.ActorClass#getUserCode2 <em>User Code2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>User Code2</em>' containment reference.
   * @see #getUserCode2()
   * @generated
   */
  void setUserCode2(DetailCode value);

  /**
   * Returns the value of the '<em><b>Int Ports</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.etrice.core.room.Port}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Ports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Ports</em>' containment reference list.
   * @see org.eclipse.etrice.core.room.RoomPackage#getActorClass_IntPorts()
   * @model containment="true"
   * @generated
   */
  EList<Port> getIntPorts();

  /**
   * Returns the value of the '<em><b>Ext Ports</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.etrice.core.room.ExternalPort}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ext Ports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ext Ports</em>' containment reference list.
   * @see org.eclipse.etrice.core.room.RoomPackage#getActorClass_ExtPorts()
   * @model containment="true"
   * @generated
   */
  EList<ExternalPort> getExtPorts();

  /**
   * Returns the value of the '<em><b>Service Implementations</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.etrice.core.room.ServiceImplementation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Implementations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Implementations</em>' containment reference list.
   * @see org.eclipse.etrice.core.room.RoomPackage#getActorClass_ServiceImplementations()
   * @model containment="true"
   * @generated
   */
  EList<ServiceImplementation> getServiceImplementations();

  /**
   * Returns the value of the '<em><b>Str SA Ps</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.etrice.core.room.SAPRef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Str SA Ps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Str SA Ps</em>' containment reference list.
   * @see org.eclipse.etrice.core.room.RoomPackage#getActorClass_StrSAPs()
   * @model containment="true"
   * @generated
   */
  EList<SAPRef> getStrSAPs();

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.etrice.core.room.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.eclipse.etrice.core.room.RoomPackage#getActorClass_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.etrice.core.room.Operation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference list.
   * @see org.eclipse.etrice.core.room.RoomPackage#getActorClass_Operations()
   * @model containment="true"
   * @generated
   */
  EList<Operation> getOperations();

  /**
   * Returns the value of the '<em><b>State Machine</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Machine</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Machine</em>' containment reference.
   * @see #setStateMachine(StateGraph)
   * @see org.eclipse.etrice.core.room.RoomPackage#getActorClass_StateMachine()
   * @model containment="true"
   * @generated
   */
  StateGraph getStateMachine();

  /**
   * Sets the value of the '{@link org.eclipse.etrice.core.room.ActorClass#getStateMachine <em>State Machine</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State Machine</em>' containment reference.
   * @see #getStateMachine()
   * @generated
   */
  void setStateMachine(StateGraph value);

} // ActorClass
