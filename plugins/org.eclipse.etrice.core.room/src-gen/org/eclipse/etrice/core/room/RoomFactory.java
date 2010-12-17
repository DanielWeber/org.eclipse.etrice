/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.etrice.core.room;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.etrice.core.room.RoomPackage
 * @generated
 */
public interface RoomFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RoomFactory eINSTANCE = org.eclipse.etrice.core.room.impl.RoomFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  RoomModel createRoomModel();

  /**
   * Returns a new object of class '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class</em>'.
   * @generated
   */
  RoomClass createRoomClass();

  /**
   * Returns a new object of class '<em>Structure Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Structure Class</em>'.
   * @generated
   */
  StructureClass createStructureClass();

  /**
   * Returns a new object of class '<em>Actor Container Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actor Container Class</em>'.
   * @generated
   */
  ActorContainerClass createActorContainerClass();

  /**
   * Returns a new object of class '<em>Typed ID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typed ID</em>'.
   * @generated
   */
  TypedID createTypedID();

  /**
   * Returns a new object of class '<em>Free Typed ID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Free Typed ID</em>'.
   * @generated
   */
  FreeTypedID createFreeTypedID();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Free Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Free Type</em>'.
   * @generated
   */
  FreeType createFreeType();

  /**
   * Returns a new object of class '<em>Data Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Class</em>'.
   * @generated
   */
  DataClass createDataClass();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation</em>'.
   * @generated
   */
  Operation createOperation();

  /**
   * Returns a new object of class '<em>Protocol Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Protocol Class</em>'.
   * @generated
   */
  ProtocolClass createProtocolClass();

  /**
   * Returns a new object of class '<em>Message</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message</em>'.
   * @generated
   */
  Message createMessage();

  /**
   * Returns a new object of class '<em>Port Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Port Class</em>'.
   * @generated
   */
  PortClass createPortClass();

  /**
   * Returns a new object of class '<em>Message Handler</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message Handler</em>'.
   * @generated
   */
  MessageHandler createMessageHandler();

  /**
   * Returns a new object of class '<em>Protocol Semantics</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Protocol Semantics</em>'.
   * @generated
   */
  ProtocolSemantics createProtocolSemantics();

  /**
   * Returns a new object of class '<em>Semantics Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Semantics Rule</em>'.
   * @generated
   */
  SemanticsRule createSemanticsRule();

  /**
   * Returns a new object of class '<em>Semantics In Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Semantics In Rule</em>'.
   * @generated
   */
  SemanticsInRule createSemanticsInRule();

  /**
   * Returns a new object of class '<em>Semantics Out Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Semantics Out Rule</em>'.
   * @generated
   */
  SemanticsOutRule createSemanticsOutRule();

  /**
   * Returns a new object of class '<em>Actor Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actor Class</em>'.
   * @generated
   */
  ActorClass createActorClass();

  /**
   * Returns a new object of class '<em>Interface Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Item</em>'.
   * @generated
   */
  InterfaceItem createInterfaceItem();

  /**
   * Returns a new object of class '<em>Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Port</em>'.
   * @generated
   */
  Port createPort();

  /**
   * Returns a new object of class '<em>External Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Port</em>'.
   * @generated
   */
  ExternalPort createExternalPort();

  /**
   * Returns a new object of class '<em>SAP Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SAP Ref</em>'.
   * @generated
   */
  SAPRef createSAPRef();

  /**
   * Returns a new object of class '<em>SPP Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SPP Ref</em>'.
   * @generated
   */
  SPPRef createSPPRef();

  /**
   * Returns a new object of class '<em>Service Implementation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Implementation</em>'.
   * @generated
   */
  ServiceImplementation createServiceImplementation();

  /**
   * Returns a new object of class '<em>Logical System</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logical System</em>'.
   * @generated
   */
  LogicalSystem createLogicalSystem();

  /**
   * Returns a new object of class '<em>Actor Container Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actor Container Ref</em>'.
   * @generated
   */
  ActorContainerRef createActorContainerRef();

  /**
   * Returns a new object of class '<em>Sub System Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub System Ref</em>'.
   * @generated
   */
  SubSystemRef createSubSystemRef();

  /**
   * Returns a new object of class '<em>Sub System Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub System Class</em>'.
   * @generated
   */
  SubSystemClass createSubSystemClass();

  /**
   * Returns a new object of class '<em>Logical Thread</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logical Thread</em>'.
   * @generated
   */
  LogicalThread createLogicalThread();

  /**
   * Returns a new object of class '<em>Actor Instance Path</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actor Instance Path</em>'.
   * @generated
   */
  ActorInstancePath createActorInstancePath();

  /**
   * Returns a new object of class '<em>Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binding</em>'.
   * @generated
   */
  Binding createBinding();

  /**
   * Returns a new object of class '<em>Binding End Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binding End Point</em>'.
   * @generated
   */
  BindingEndPoint createBindingEndPoint();

  /**
   * Returns a new object of class '<em>Layer Connection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Layer Connection</em>'.
   * @generated
   */
  LayerConnection createLayerConnection();

  /**
   * Returns a new object of class '<em>SA Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SA Point</em>'.
   * @generated
   */
  SAPoint createSAPoint();

  /**
   * Returns a new object of class '<em>Ref SA Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref SA Point</em>'.
   * @generated
   */
  RefSAPoint createRefSAPoint();

  /**
   * Returns a new object of class '<em>Relay SA Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relay SA Point</em>'.
   * @generated
   */
  RelaySAPoint createRelaySAPoint();

  /**
   * Returns a new object of class '<em>SP Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SP Point</em>'.
   * @generated
   */
  SPPoint createSPPoint();

  /**
   * Returns a new object of class '<em>Actor Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actor Ref</em>'.
   * @generated
   */
  ActorRef createActorRef();

  /**
   * Returns a new object of class '<em>State Graph Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Graph Node</em>'.
   * @generated
   */
  StateGraphNode createStateGraphNode();

  /**
   * Returns a new object of class '<em>State Graph Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Graph Item</em>'.
   * @generated
   */
  StateGraphItem createStateGraphItem();

  /**
   * Returns a new object of class '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State</em>'.
   * @generated
   */
  State createState();

  /**
   * Returns a new object of class '<em>State Graph</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Graph</em>'.
   * @generated
   */
  StateGraph createStateGraph();

  /**
   * Returns a new object of class '<em>Base State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Base State</em>'.
   * @generated
   */
  BaseState createBaseState();

  /**
   * Returns a new object of class '<em>Refined State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Refined State</em>'.
   * @generated
   */
  RefinedState createRefinedState();

  /**
   * Returns a new object of class '<em>Detail Code</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Detail Code</em>'.
   * @generated
   */
  DetailCode createDetailCode();

  /**
   * Returns a new object of class '<em>Tr Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tr Point</em>'.
   * @generated
   */
  TrPoint createTrPoint();

  /**
   * Returns a new object of class '<em>Transition Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Point</em>'.
   * @generated
   */
  TransitionPoint createTransitionPoint();

  /**
   * Returns a new object of class '<em>Entry Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entry Point</em>'.
   * @generated
   */
  EntryPoint createEntryPoint();

  /**
   * Returns a new object of class '<em>Exit Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exit Point</em>'.
   * @generated
   */
  ExitPoint createExitPoint();

  /**
   * Returns a new object of class '<em>Choice Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Choice Point</em>'.
   * @generated
   */
  ChoicePoint createChoicePoint();

  /**
   * Returns a new object of class '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition</em>'.
   * @generated
   */
  Transition createTransition();

  /**
   * Returns a new object of class '<em>Non Initial Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Non Initial Transition</em>'.
   * @generated
   */
  NonInitialTransition createNonInitialTransition();

  /**
   * Returns a new object of class '<em>Initial Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Initial Transition</em>'.
   * @generated
   */
  InitialTransition createInitialTransition();

  /**
   * Returns a new object of class '<em>Continuation Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Continuation Transition</em>'.
   * @generated
   */
  ContinuationTransition createContinuationTransition();

  /**
   * Returns a new object of class '<em>Triggered Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Triggered Transition</em>'.
   * @generated
   */
  TriggeredTransition createTriggeredTransition();

  /**
   * Returns a new object of class '<em>CP Branch Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CP Branch Transition</em>'.
   * @generated
   */
  CPBranchTransition createCPBranchTransition();

  /**
   * Returns a new object of class '<em>Transition Terminal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Terminal</em>'.
   * @generated
   */
  TransitionTerminal createTransitionTerminal();

  /**
   * Returns a new object of class '<em>State Terminal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Terminal</em>'.
   * @generated
   */
  StateTerminal createStateTerminal();

  /**
   * Returns a new object of class '<em>Tr Point Terminal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tr Point Terminal</em>'.
   * @generated
   */
  TrPointTerminal createTrPointTerminal();

  /**
   * Returns a new object of class '<em>Sub State Tr Point Terminal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub State Tr Point Terminal</em>'.
   * @generated
   */
  SubStateTrPointTerminal createSubStateTrPointTerminal();

  /**
   * Returns a new object of class '<em>Choicepoint Terminal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Choicepoint Terminal</em>'.
   * @generated
   */
  ChoicepointTerminal createChoicepointTerminal();

  /**
   * Returns a new object of class '<em>Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trigger</em>'.
   * @generated
   */
  Trigger createTrigger();

  /**
   * Returns a new object of class '<em>Message From If</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message From If</em>'.
   * @generated
   */
  MessageFromIf createMessageFromIf();

  /**
   * Returns a new object of class '<em>Guard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Guard</em>'.
   * @generated
   */
  Guard createGuard();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RoomPackage getRoomPackage();

} //RoomFactory
