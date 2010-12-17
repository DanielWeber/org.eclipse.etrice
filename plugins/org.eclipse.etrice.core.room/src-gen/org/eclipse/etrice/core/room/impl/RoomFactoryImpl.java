/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.etrice.core.room.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.etrice.core.room.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoomFactoryImpl extends EFactoryImpl implements RoomFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RoomFactory init()
  {
    try
    {
      RoomFactory theRoomFactory = (RoomFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/etrice/Room"); 
      if (theRoomFactory != null)
      {
        return theRoomFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RoomFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoomFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RoomPackage.ROOM_MODEL: return createRoomModel();
      case RoomPackage.ROOM_CLASS: return createRoomClass();
      case RoomPackage.STRUCTURE_CLASS: return createStructureClass();
      case RoomPackage.ACTOR_CONTAINER_CLASS: return createActorContainerClass();
      case RoomPackage.TYPED_ID: return createTypedID();
      case RoomPackage.FREE_TYPED_ID: return createFreeTypedID();
      case RoomPackage.TYPE: return createType();
      case RoomPackage.FREE_TYPE: return createFreeType();
      case RoomPackage.DATA_CLASS: return createDataClass();
      case RoomPackage.ATTRIBUTE: return createAttribute();
      case RoomPackage.OPERATION: return createOperation();
      case RoomPackage.PROTOCOL_CLASS: return createProtocolClass();
      case RoomPackage.MESSAGE: return createMessage();
      case RoomPackage.PORT_CLASS: return createPortClass();
      case RoomPackage.MESSAGE_HANDLER: return createMessageHandler();
      case RoomPackage.PROTOCOL_SEMANTICS: return createProtocolSemantics();
      case RoomPackage.SEMANTICS_RULE: return createSemanticsRule();
      case RoomPackage.SEMANTICS_IN_RULE: return createSemanticsInRule();
      case RoomPackage.SEMANTICS_OUT_RULE: return createSemanticsOutRule();
      case RoomPackage.ACTOR_CLASS: return createActorClass();
      case RoomPackage.INTERFACE_ITEM: return createInterfaceItem();
      case RoomPackage.PORT: return createPort();
      case RoomPackage.EXTERNAL_PORT: return createExternalPort();
      case RoomPackage.SAP_REF: return createSAPRef();
      case RoomPackage.SPP_REF: return createSPPRef();
      case RoomPackage.SERVICE_IMPLEMENTATION: return createServiceImplementation();
      case RoomPackage.LOGICAL_SYSTEM: return createLogicalSystem();
      case RoomPackage.ACTOR_CONTAINER_REF: return createActorContainerRef();
      case RoomPackage.SUB_SYSTEM_REF: return createSubSystemRef();
      case RoomPackage.SUB_SYSTEM_CLASS: return createSubSystemClass();
      case RoomPackage.LOGICAL_THREAD: return createLogicalThread();
      case RoomPackage.ACTOR_INSTANCE_PATH: return createActorInstancePath();
      case RoomPackage.BINDING: return createBinding();
      case RoomPackage.BINDING_END_POINT: return createBindingEndPoint();
      case RoomPackage.LAYER_CONNECTION: return createLayerConnection();
      case RoomPackage.SA_POINT: return createSAPoint();
      case RoomPackage.REF_SA_POINT: return createRefSAPoint();
      case RoomPackage.RELAY_SA_POINT: return createRelaySAPoint();
      case RoomPackage.SP_POINT: return createSPPoint();
      case RoomPackage.ACTOR_REF: return createActorRef();
      case RoomPackage.STATE_GRAPH_NODE: return createStateGraphNode();
      case RoomPackage.STATE_GRAPH_ITEM: return createStateGraphItem();
      case RoomPackage.STATE: return createState();
      case RoomPackage.STATE_GRAPH: return createStateGraph();
      case RoomPackage.BASE_STATE: return createBaseState();
      case RoomPackage.REFINED_STATE: return createRefinedState();
      case RoomPackage.DETAIL_CODE: return createDetailCode();
      case RoomPackage.TR_POINT: return createTrPoint();
      case RoomPackage.TRANSITION_POINT: return createTransitionPoint();
      case RoomPackage.ENTRY_POINT: return createEntryPoint();
      case RoomPackage.EXIT_POINT: return createExitPoint();
      case RoomPackage.CHOICE_POINT: return createChoicePoint();
      case RoomPackage.TRANSITION: return createTransition();
      case RoomPackage.NON_INITIAL_TRANSITION: return createNonInitialTransition();
      case RoomPackage.INITIAL_TRANSITION: return createInitialTransition();
      case RoomPackage.CONTINUATION_TRANSITION: return createContinuationTransition();
      case RoomPackage.TRIGGERED_TRANSITION: return createTriggeredTransition();
      case RoomPackage.CP_BRANCH_TRANSITION: return createCPBranchTransition();
      case RoomPackage.TRANSITION_TERMINAL: return createTransitionTerminal();
      case RoomPackage.STATE_TERMINAL: return createStateTerminal();
      case RoomPackage.TR_POINT_TERMINAL: return createTrPointTerminal();
      case RoomPackage.SUB_STATE_TR_POINT_TERMINAL: return createSubStateTrPointTerminal();
      case RoomPackage.CHOICEPOINT_TERMINAL: return createChoicepointTerminal();
      case RoomPackage.TRIGGER: return createTrigger();
      case RoomPackage.MESSAGE_FROM_IF: return createMessageFromIf();
      case RoomPackage.GUARD: return createGuard();
      case RoomPackage.IMPORT: return createImport();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RoomPackage.PRIMITIVE_TYPE:
        return createPrimitiveTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RoomPackage.PRIMITIVE_TYPE:
        return convertPrimitiveTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoomModel createRoomModel()
  {
    RoomModelImpl roomModel = new RoomModelImpl();
    return roomModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoomClass createRoomClass()
  {
    RoomClassImpl roomClass = new RoomClassImpl();
    return roomClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructureClass createStructureClass()
  {
    StructureClassImpl structureClass = new StructureClassImpl();
    return structureClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorContainerClass createActorContainerClass()
  {
    ActorContainerClassImpl actorContainerClass = new ActorContainerClassImpl();
    return actorContainerClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedID createTypedID()
  {
    TypedIDImpl typedID = new TypedIDImpl();
    return typedID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FreeTypedID createFreeTypedID()
  {
    FreeTypedIDImpl freeTypedID = new FreeTypedIDImpl();
    return freeTypedID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FreeType createFreeType()
  {
    FreeTypeImpl freeType = new FreeTypeImpl();
    return freeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataClass createDataClass()
  {
    DataClassImpl dataClass = new DataClassImpl();
    return dataClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtocolClass createProtocolClass()
  {
    ProtocolClassImpl protocolClass = new ProtocolClassImpl();
    return protocolClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message createMessage()
  {
    MessageImpl message = new MessageImpl();
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortClass createPortClass()
  {
    PortClassImpl portClass = new PortClassImpl();
    return portClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageHandler createMessageHandler()
  {
    MessageHandlerImpl messageHandler = new MessageHandlerImpl();
    return messageHandler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtocolSemantics createProtocolSemantics()
  {
    ProtocolSemanticsImpl protocolSemantics = new ProtocolSemanticsImpl();
    return protocolSemantics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SemanticsRule createSemanticsRule()
  {
    SemanticsRuleImpl semanticsRule = new SemanticsRuleImpl();
    return semanticsRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SemanticsInRule createSemanticsInRule()
  {
    SemanticsInRuleImpl semanticsInRule = new SemanticsInRuleImpl();
    return semanticsInRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SemanticsOutRule createSemanticsOutRule()
  {
    SemanticsOutRuleImpl semanticsOutRule = new SemanticsOutRuleImpl();
    return semanticsOutRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorClass createActorClass()
  {
    ActorClassImpl actorClass = new ActorClassImpl();
    return actorClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceItem createInterfaceItem()
  {
    InterfaceItemImpl interfaceItem = new InterfaceItemImpl();
    return interfaceItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port createPort()
  {
    PortImpl port = new PortImpl();
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalPort createExternalPort()
  {
    ExternalPortImpl externalPort = new ExternalPortImpl();
    return externalPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SAPRef createSAPRef()
  {
    SAPRefImpl sapRef = new SAPRefImpl();
    return sapRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SPPRef createSPPRef()
  {
    SPPRefImpl sppRef = new SPPRefImpl();
    return sppRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceImplementation createServiceImplementation()
  {
    ServiceImplementationImpl serviceImplementation = new ServiceImplementationImpl();
    return serviceImplementation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalSystem createLogicalSystem()
  {
    LogicalSystemImpl logicalSystem = new LogicalSystemImpl();
    return logicalSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorContainerRef createActorContainerRef()
  {
    ActorContainerRefImpl actorContainerRef = new ActorContainerRefImpl();
    return actorContainerRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubSystemRef createSubSystemRef()
  {
    SubSystemRefImpl subSystemRef = new SubSystemRefImpl();
    return subSystemRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubSystemClass createSubSystemClass()
  {
    SubSystemClassImpl subSystemClass = new SubSystemClassImpl();
    return subSystemClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalThread createLogicalThread()
  {
    LogicalThreadImpl logicalThread = new LogicalThreadImpl();
    return logicalThread;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorInstancePath createActorInstancePath()
  {
    ActorInstancePathImpl actorInstancePath = new ActorInstancePathImpl();
    return actorInstancePath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding createBinding()
  {
    BindingImpl binding = new BindingImpl();
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingEndPoint createBindingEndPoint()
  {
    BindingEndPointImpl bindingEndPoint = new BindingEndPointImpl();
    return bindingEndPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayerConnection createLayerConnection()
  {
    LayerConnectionImpl layerConnection = new LayerConnectionImpl();
    return layerConnection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SAPoint createSAPoint()
  {
    SAPointImpl saPoint = new SAPointImpl();
    return saPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefSAPoint createRefSAPoint()
  {
    RefSAPointImpl refSAPoint = new RefSAPointImpl();
    return refSAPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelaySAPoint createRelaySAPoint()
  {
    RelaySAPointImpl relaySAPoint = new RelaySAPointImpl();
    return relaySAPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SPPoint createSPPoint()
  {
    SPPointImpl spPoint = new SPPointImpl();
    return spPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorRef createActorRef()
  {
    ActorRefImpl actorRef = new ActorRefImpl();
    return actorRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateGraphNode createStateGraphNode()
  {
    StateGraphNodeImpl stateGraphNode = new StateGraphNodeImpl();
    return stateGraphNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateGraphItem createStateGraphItem()
  {
    StateGraphItemImpl stateGraphItem = new StateGraphItemImpl();
    return stateGraphItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateGraph createStateGraph()
  {
    StateGraphImpl stateGraph = new StateGraphImpl();
    return stateGraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseState createBaseState()
  {
    BaseStateImpl baseState = new BaseStateImpl();
    return baseState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefinedState createRefinedState()
  {
    RefinedStateImpl refinedState = new RefinedStateImpl();
    return refinedState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DetailCode createDetailCode()
  {
    DetailCodeImpl detailCode = new DetailCodeImpl();
    return detailCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrPoint createTrPoint()
  {
    TrPointImpl trPoint = new TrPointImpl();
    return trPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionPoint createTransitionPoint()
  {
    TransitionPointImpl transitionPoint = new TransitionPointImpl();
    return transitionPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntryPoint createEntryPoint()
  {
    EntryPointImpl entryPoint = new EntryPointImpl();
    return entryPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExitPoint createExitPoint()
  {
    ExitPointImpl exitPoint = new ExitPointImpl();
    return exitPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChoicePoint createChoicePoint()
  {
    ChoicePointImpl choicePoint = new ChoicePointImpl();
    return choicePoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonInitialTransition createNonInitialTransition()
  {
    NonInitialTransitionImpl nonInitialTransition = new NonInitialTransitionImpl();
    return nonInitialTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitialTransition createInitialTransition()
  {
    InitialTransitionImpl initialTransition = new InitialTransitionImpl();
    return initialTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContinuationTransition createContinuationTransition()
  {
    ContinuationTransitionImpl continuationTransition = new ContinuationTransitionImpl();
    return continuationTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TriggeredTransition createTriggeredTransition()
  {
    TriggeredTransitionImpl triggeredTransition = new TriggeredTransitionImpl();
    return triggeredTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CPBranchTransition createCPBranchTransition()
  {
    CPBranchTransitionImpl cpBranchTransition = new CPBranchTransitionImpl();
    return cpBranchTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionTerminal createTransitionTerminal()
  {
    TransitionTerminalImpl transitionTerminal = new TransitionTerminalImpl();
    return transitionTerminal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateTerminal createStateTerminal()
  {
    StateTerminalImpl stateTerminal = new StateTerminalImpl();
    return stateTerminal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrPointTerminal createTrPointTerminal()
  {
    TrPointTerminalImpl trPointTerminal = new TrPointTerminalImpl();
    return trPointTerminal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubStateTrPointTerminal createSubStateTrPointTerminal()
  {
    SubStateTrPointTerminalImpl subStateTrPointTerminal = new SubStateTrPointTerminalImpl();
    return subStateTrPointTerminal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChoicepointTerminal createChoicepointTerminal()
  {
    ChoicepointTerminalImpl choicepointTerminal = new ChoicepointTerminalImpl();
    return choicepointTerminal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trigger createTrigger()
  {
    TriggerImpl trigger = new TriggerImpl();
    return trigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageFromIf createMessageFromIf()
  {
    MessageFromIfImpl messageFromIf = new MessageFromIfImpl();
    return messageFromIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Guard createGuard()
  {
    GuardImpl guard = new GuardImpl();
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveType createPrimitiveTypeFromString(EDataType eDataType, String initialValue)
  {
    PrimitiveType result = PrimitiveType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPrimitiveTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoomPackage getRoomPackage()
  {
    return (RoomPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RoomPackage getPackage()
  {
    return RoomPackage.eINSTANCE;
  }

} //RoomFactoryImpl
