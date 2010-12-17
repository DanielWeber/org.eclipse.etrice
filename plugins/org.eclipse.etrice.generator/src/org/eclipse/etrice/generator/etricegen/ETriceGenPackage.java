/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.etrice.generator.etricegen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.etrice.core.room.RoomPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.etrice.generator.etricegen.ETriceGenFactory
 * @model kind="package"
 * @generated
 */
public interface ETriceGenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "etricegen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/etrice/generator";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "etricegen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ETriceGenPackage eINSTANCE = org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.etrice.generator.etricegen.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.etrice.generator.etricegen.impl.RootImpl
	 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>Sub Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__SUB_SYSTEMS = 0;

	/**
	 * The feature id for the '<em><b>Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__MODELS = 1;

	/**
	 * The feature id for the '<em><b>Xp Actor Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__XP_ACTOR_CLASSES = 2;

	/**
	 * The feature id for the '<em><b>Used Data Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__USED_DATA_CLASSES = 3;

	/**
	 * The feature id for the '<em><b>Used Protocol Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__USED_PROTOCOL_CLASSES = 4;

	/**
	 * The feature id for the '<em><b>Used Actor Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__USED_ACTOR_CLASSES = 5;

	/**
	 * The feature id for the '<em><b>Used Room Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__USED_ROOM_MODELS = 6;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.etrice.generator.etricegen.impl.CounterImpl <em>Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.etrice.generator.etricegen.impl.CounterImpl
	 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getCounter()
	 * @generated
	 */
	int COUNTER = 1;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__COUNTER = 0;

	/**
	 * The number of structural features of the '<em>Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.etrice.generator.etricegen.impl.InstanceBaseImpl <em>Instance Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.etrice.generator.etricegen.impl.InstanceBaseImpl
	 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getInstanceBase()
	 * @generated
	 */
	int INSTANCE_BASE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BASE__PATH = 1;

	/**
	 * The feature id for the '<em><b>Obj Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BASE__OBJ_ID = 2;

	/**
	 * The number of structural features of the '<em>Instance Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BASE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.etrice.generator.etricegen.impl.StructureInstanceImpl <em>Structure Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.etrice.generator.etricegen.impl.StructureInstanceImpl
	 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getStructureInstance()
	 * @generated
	 */
	int STRUCTURE_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INSTANCE__NAME = INSTANCE_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INSTANCE__PATH = INSTANCE_BASE__PATH;

	/**
	 * The feature id for the '<em><b>Obj Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INSTANCE__OBJ_ID = INSTANCE_BASE__OBJ_ID;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INSTANCE__INSTANCES = INSTANCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INSTANCE__PORTS = INSTANCE_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Saps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INSTANCE__SAPS = INSTANCE_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Spps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INSTANCE__SPPS = INSTANCE_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INSTANCE__SERVICES = INSTANCE_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INSTANCE__BINDINGS = INSTANCE_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INSTANCE__CONNECTIONS = INSTANCE_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>All Contained Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INSTANCE__ALL_CONTAINED_INSTANCES = INSTANCE_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ordered If Item Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INSTANCE__ORDERED_IF_ITEM_INSTANCES = INSTANCE_BASE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Structure Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INSTANCE_FEATURE_COUNT = INSTANCE_BASE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.eclipse.etrice.generator.etricegen.impl.SubSystemInstanceImpl <em>Sub System Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.etrice.generator.etricegen.impl.SubSystemInstanceImpl
	 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getSubSystemInstance()
	 * @generated
	 */
	int SUB_SYSTEM_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_INSTANCE__NAME = STRUCTURE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_INSTANCE__PATH = STRUCTURE_INSTANCE__PATH;

	/**
	 * The feature id for the '<em><b>Obj Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_INSTANCE__OBJ_ID = STRUCTURE_INSTANCE__OBJ_ID;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_INSTANCE__INSTANCES = STRUCTURE_INSTANCE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_INSTANCE__PORTS = STRUCTURE_INSTANCE__PORTS;

	/**
	 * The feature id for the '<em><b>Saps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_INSTANCE__SAPS = STRUCTURE_INSTANCE__SAPS;

	/**
	 * The feature id for the '<em><b>Spps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_INSTANCE__SPPS = STRUCTURE_INSTANCE__SPPS;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_INSTANCE__SERVICES = STRUCTURE_INSTANCE__SERVICES;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_INSTANCE__BINDINGS = STRUCTURE_INSTANCE__BINDINGS;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_INSTANCE__CONNECTIONS = STRUCTURE_INSTANCE__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>All Contained Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_INSTANCE__ALL_CONTAINED_INSTANCES = STRUCTURE_INSTANCE__ALL_CONTAINED_INSTANCES;

	/**
	 * The feature id for the '<em><b>Ordered If Item Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_INSTANCE__ORDERED_IF_ITEM_INSTANCES = STRUCTURE_INSTANCE__ORDERED_IF_ITEM_INSTANCES;

	/**
	 * The feature id for the '<em><b>Sub System Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_INSTANCE__SUB_SYSTEM_CLASS = STRUCTURE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Obj Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_INSTANCE__OBJ_COUNTER = STRUCTURE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sub System Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_INSTANCE_FEATURE_COUNT = STRUCTURE_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.etrice.generator.etricegen.impl.ActorInstanceImpl <em>Actor Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.etrice.generator.etricegen.impl.ActorInstanceImpl
	 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getActorInstance()
	 * @generated
	 */
	int ACTOR_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__NAME = STRUCTURE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__PATH = STRUCTURE_INSTANCE__PATH;

	/**
	 * The feature id for the '<em><b>Obj Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__OBJ_ID = STRUCTURE_INSTANCE__OBJ_ID;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__INSTANCES = STRUCTURE_INSTANCE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__PORTS = STRUCTURE_INSTANCE__PORTS;

	/**
	 * The feature id for the '<em><b>Saps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__SAPS = STRUCTURE_INSTANCE__SAPS;

	/**
	 * The feature id for the '<em><b>Spps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__SPPS = STRUCTURE_INSTANCE__SPPS;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__SERVICES = STRUCTURE_INSTANCE__SERVICES;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__BINDINGS = STRUCTURE_INSTANCE__BINDINGS;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__CONNECTIONS = STRUCTURE_INSTANCE__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>All Contained Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__ALL_CONTAINED_INSTANCES = STRUCTURE_INSTANCE__ALL_CONTAINED_INSTANCES;

	/**
	 * The feature id for the '<em><b>Ordered If Item Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__ORDERED_IF_ITEM_INSTANCES = STRUCTURE_INSTANCE__ORDERED_IF_ITEM_INSTANCES;

	/**
	 * The feature id for the '<em><b>Actor Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE__ACTOR_CLASS = STRUCTURE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actor Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_INSTANCE_FEATURE_COUNT = STRUCTURE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.etrice.generator.etricegen.impl.InterfaceItemInstanceImpl <em>Interface Item Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.etrice.generator.etricegen.impl.InterfaceItemInstanceImpl
	 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getInterfaceItemInstance()
	 * @generated
	 */
	int INTERFACE_ITEM_INSTANCE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ITEM_INSTANCE__NAME = INSTANCE_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ITEM_INSTANCE__PATH = INSTANCE_BASE__PATH;

	/**
	 * The feature id for the '<em><b>Obj Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ITEM_INSTANCE__OBJ_ID = INSTANCE_BASE__OBJ_ID;

	/**
	 * The feature id for the '<em><b>Peers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ITEM_INSTANCE__PEERS = INSTANCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Item Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ITEM_INSTANCE_FEATURE_COUNT = INSTANCE_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.etrice.generator.etricegen.impl.PortInstanceImpl <em>Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.etrice.generator.etricegen.impl.PortInstanceImpl
	 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getPortInstance()
	 * @generated
	 */
	int PORT_INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__NAME = INTERFACE_ITEM_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__PATH = INTERFACE_ITEM_INSTANCE__PATH;

	/**
	 * The feature id for the '<em><b>Obj Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__OBJ_ID = INTERFACE_ITEM_INSTANCE__OBJ_ID;

	/**
	 * The feature id for the '<em><b>Peers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__PEERS = INTERFACE_ITEM_INSTANCE__PEERS;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__PORT = INTERFACE_ITEM_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__KIND = INTERFACE_ITEM_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__BINDINGS = INTERFACE_ITEM_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_FEATURE_COUNT = INTERFACE_ITEM_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.etrice.generator.etricegen.impl.BindingInstanceImpl <em>Binding Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.etrice.generator.etricegen.impl.BindingInstanceImpl
	 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getBindingInstance()
	 * @generated
	 */
	int BINDING_INSTANCE = 8;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INSTANCE__PORTS = 0;

	/**
	 * The number of structural features of the '<em>Binding Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INSTANCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.etrice.generator.etricegen.impl.SAPInstanceImpl <em>SAP Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.etrice.generator.etricegen.impl.SAPInstanceImpl
	 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getSAPInstance()
	 * @generated
	 */
	int SAP_INSTANCE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAP_INSTANCE__NAME = INTERFACE_ITEM_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAP_INSTANCE__PATH = INTERFACE_ITEM_INSTANCE__PATH;

	/**
	 * The feature id for the '<em><b>Obj Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAP_INSTANCE__OBJ_ID = INTERFACE_ITEM_INSTANCE__OBJ_ID;

	/**
	 * The feature id for the '<em><b>Peers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAP_INSTANCE__PEERS = INTERFACE_ITEM_INSTANCE__PEERS;

	/**
	 * The feature id for the '<em><b>Sap</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAP_INSTANCE__SAP = INTERFACE_ITEM_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SAP Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAP_INSTANCE_FEATURE_COUNT = INTERFACE_ITEM_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.etrice.generator.etricegen.impl.SPPInstanceImpl <em>SPP Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.etrice.generator.etricegen.impl.SPPInstanceImpl
	 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getSPPInstance()
	 * @generated
	 */
	int SPP_INSTANCE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPP_INSTANCE__NAME = INSTANCE_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPP_INSTANCE__PATH = INSTANCE_BASE__PATH;

	/**
	 * The feature id for the '<em><b>Obj Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPP_INSTANCE__OBJ_ID = INSTANCE_BASE__OBJ_ID;

	/**
	 * The feature id for the '<em><b>Spp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPP_INSTANCE__SPP = INSTANCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPP_INSTANCE__INCOMING = INSTANCE_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPP_INSTANCE__OUTGOING = INSTANCE_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SPP Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPP_INSTANCE_FEATURE_COUNT = INSTANCE_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.etrice.generator.etricegen.impl.ServiceImplInstanceImpl <em>Service Impl Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.etrice.generator.etricegen.impl.ServiceImplInstanceImpl
	 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getServiceImplInstance()
	 * @generated
	 */
	int SERVICE_IMPL_INSTANCE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IMPL_INSTANCE__NAME = INTERFACE_ITEM_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IMPL_INSTANCE__PATH = INTERFACE_ITEM_INSTANCE__PATH;

	/**
	 * The feature id for the '<em><b>Obj Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IMPL_INSTANCE__OBJ_ID = INTERFACE_ITEM_INSTANCE__OBJ_ID;

	/**
	 * The feature id for the '<em><b>Peers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IMPL_INSTANCE__PEERS = INTERFACE_ITEM_INSTANCE__PEERS;

	/**
	 * The feature id for the '<em><b>Svc Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IMPL_INSTANCE__SVC_IMPL = INTERFACE_ITEM_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Impl Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IMPL_INSTANCE_FEATURE_COUNT = INTERFACE_ITEM_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.etrice.generator.etricegen.impl.ConnectionInstanceImpl <em>Connection Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.etrice.generator.etricegen.impl.ConnectionInstanceImpl
	 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getConnectionInstance()
	 * @generated
	 */
	int CONNECTION_INSTANCE = 12;

	/**
	 * The feature id for the '<em><b>From AI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE__FROM_AI = 0;

	/**
	 * The feature id for the '<em><b>From SPP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE__FROM_SPP = 1;

	/**
	 * The feature id for the '<em><b>To SPP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE__TO_SPP = 2;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE__CONNECTION = 3;

	/**
	 * The number of structural features of the '<em>Connection Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.etrice.generator.etricegen.impl.ActiveTriggerImpl <em>Active Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.etrice.generator.etricegen.impl.ActiveTriggerImpl
	 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getActiveTrigger()
	 * @generated
	 */
	int ACTIVE_TRIGGER = 13;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_TRIGGER__MSG = 0;

	/**
	 * The feature id for the '<em><b>Ifitem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_TRIGGER__IFITEM = 1;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_TRIGGER__TRIGGER = 2;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_TRIGGER__TRANSITIONS = 3;

	/**
	 * The number of structural features of the '<em>Active Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_TRIGGER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.etrice.generator.etricegen.impl.TransitionChainImpl <em>Transition Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.etrice.generator.etricegen.impl.TransitionChainImpl
	 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getTransitionChain()
	 * @generated
	 */
	int TRANSITION_CHAIN = 14;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CHAIN__TRANSITION = 0;

	/**
	 * The number of structural features of the '<em>Transition Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CHAIN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ITransitionChainVisitor <em>ITransition Chain Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ITransitionChainVisitor
	 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getITransitionChainVisitor()
	 * @generated
	 */
	int ITRANSITION_CHAIN_VISITOR = 15;

	/**
	 * The number of structural features of the '<em>ITransition Chain Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITRANSITION_CHAIN_VISITOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link IDiagnostician <em>IDiagnostician</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IDiagnostician
	 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getIDiagnostician()
	 * @generated
	 */
	int IDIAGNOSTICIAN = 16;

	/**
	 * The number of structural features of the '<em>IDiagnostician</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDIAGNOSTICIAN_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.etrice.generator.etricegen.impl.ExpandedActorClassImpl <em>Expanded Actor Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.etrice.generator.etricegen.impl.ExpandedActorClassImpl
	 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getExpandedActorClass()
	 * @generated
	 */
	int EXPANDED_ACTOR_CLASS = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDED_ACTOR_CLASS__NAME = RoomPackage.ACTOR_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDED_ACTOR_CLASS__BINDINGS = RoomPackage.ACTOR_CLASS__BINDINGS;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDED_ACTOR_CLASS__CONNECTIONS = RoomPackage.ACTOR_CLASS__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>If SP Ps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDED_ACTOR_CLASS__IF_SP_PS = RoomPackage.ACTOR_CLASS__IF_SP_PS;

	/**
	 * The feature id for the '<em><b>Actor Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDED_ACTOR_CLASS__ACTOR_REFS = RoomPackage.ACTOR_CLASS__ACTOR_REFS;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDED_ACTOR_CLASS__BASE = RoomPackage.ACTOR_CLASS__BASE;

	/**
	 * The feature id for the '<em><b>If Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDED_ACTOR_CLASS__IF_PORTS = RoomPackage.ACTOR_CLASS__IF_PORTS;

	/**
	 * The feature id for the '<em><b>User Code1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDED_ACTOR_CLASS__USER_CODE1 = RoomPackage.ACTOR_CLASS__USER_CODE1;

	/**
	 * The feature id for the '<em><b>User Code2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDED_ACTOR_CLASS__USER_CODE2 = RoomPackage.ACTOR_CLASS__USER_CODE2;

	/**
	 * The feature id for the '<em><b>Int Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDED_ACTOR_CLASS__INT_PORTS = RoomPackage.ACTOR_CLASS__INT_PORTS;

	/**
	 * The feature id for the '<em><b>Ext Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDED_ACTOR_CLASS__EXT_PORTS = RoomPackage.ACTOR_CLASS__EXT_PORTS;

	/**
	 * The feature id for the '<em><b>Service Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDED_ACTOR_CLASS__SERVICE_IMPLEMENTATIONS = RoomPackage.ACTOR_CLASS__SERVICE_IMPLEMENTATIONS;

	/**
	 * The feature id for the '<em><b>Str SA Ps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDED_ACTOR_CLASS__STR_SA_PS = RoomPackage.ACTOR_CLASS__STR_SA_PS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDED_ACTOR_CLASS__ATTRIBUTES = RoomPackage.ACTOR_CLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDED_ACTOR_CLASS__OPERATIONS = RoomPackage.ACTOR_CLASS__OPERATIONS;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDED_ACTOR_CLASS__STATE_MACHINE = RoomPackage.ACTOR_CLASS__STATE_MACHINE;

	/**
	 * The feature id for the '<em><b>Actor Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDED_ACTOR_CLASS__ACTOR_CLASS = RoomPackage.ACTOR_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expanded Actor Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDED_ACTOR_CLASS_FEATURE_COUNT = RoomPackage.ACTOR_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.etrice.generator.etricegen.PortKind <em>Port Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.etrice.generator.etricegen.PortKind
	 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getPortKind()
	 * @generated
	 */
	int PORT_KIND = 18;


	/**
	 * Returns the meta object for class '{@link org.eclipse.etrice.generator.etricegen.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.etrice.generator.etricegen.Root#getSubSystems <em>Sub Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Systems</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.Root#getSubSystems()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_SubSystems();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.etrice.generator.etricegen.Root#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Models</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.Root#getModels()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Models();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.etrice.generator.etricegen.Root#getXpActorClasses <em>Xp Actor Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Xp Actor Classes</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.Root#getXpActorClasses()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_XpActorClasses();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.etrice.generator.etricegen.Root#getUsedDataClasses <em>Used Data Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Data Classes</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.Root#getUsedDataClasses()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_UsedDataClasses();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.etrice.generator.etricegen.Root#getUsedProtocolClasses <em>Used Protocol Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Protocol Classes</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.Root#getUsedProtocolClasses()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_UsedProtocolClasses();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.etrice.generator.etricegen.Root#getUsedActorClasses <em>Used Actor Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Actor Classes</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.Root#getUsedActorClasses()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_UsedActorClasses();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.etrice.generator.etricegen.Root#getUsedRoomModels <em>Used Room Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Room Models</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.Root#getUsedRoomModels()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_UsedRoomModels();

	/**
	 * Returns the meta object for class '{@link org.eclipse.etrice.generator.etricegen.Counter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counter</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.Counter
	 * @generated
	 */
	EClass getCounter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.etrice.generator.etricegen.Counter#getCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.Counter#getCounter()
	 * @see #getCounter()
	 * @generated
	 */
	EAttribute getCounter_Counter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.etrice.generator.etricegen.InstanceBase <em>Instance Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Base</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.InstanceBase
	 * @generated
	 */
	EClass getInstanceBase();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.etrice.generator.etricegen.InstanceBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.InstanceBase#getName()
	 * @see #getInstanceBase()
	 * @generated
	 */
	EAttribute getInstanceBase_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.etrice.generator.etricegen.InstanceBase#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.InstanceBase#getPath()
	 * @see #getInstanceBase()
	 * @generated
	 */
	EAttribute getInstanceBase_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.etrice.generator.etricegen.InstanceBase#getObjId <em>Obj Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obj Id</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.InstanceBase#getObjId()
	 * @see #getInstanceBase()
	 * @generated
	 */
	EAttribute getInstanceBase_ObjId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.etrice.generator.etricegen.StructureInstance <em>Structure Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Instance</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.StructureInstance
	 * @generated
	 */
	EClass getStructureInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.etrice.generator.etricegen.StructureInstance#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.StructureInstance#getInstances()
	 * @see #getStructureInstance()
	 * @generated
	 */
	EReference getStructureInstance_Instances();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.etrice.generator.etricegen.StructureInstance#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.StructureInstance#getPorts()
	 * @see #getStructureInstance()
	 * @generated
	 */
	EReference getStructureInstance_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.etrice.generator.etricegen.StructureInstance#getSaps <em>Saps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Saps</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.StructureInstance#getSaps()
	 * @see #getStructureInstance()
	 * @generated
	 */
	EReference getStructureInstance_Saps();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.etrice.generator.etricegen.StructureInstance#getSpps <em>Spps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spps</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.StructureInstance#getSpps()
	 * @see #getStructureInstance()
	 * @generated
	 */
	EReference getStructureInstance_Spps();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.etrice.generator.etricegen.StructureInstance#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.StructureInstance#getServices()
	 * @see #getStructureInstance()
	 * @generated
	 */
	EReference getStructureInstance_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.etrice.generator.etricegen.StructureInstance#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.StructureInstance#getBindings()
	 * @see #getStructureInstance()
	 * @generated
	 */
	EReference getStructureInstance_Bindings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.etrice.generator.etricegen.StructureInstance#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.StructureInstance#getConnections()
	 * @see #getStructureInstance()
	 * @generated
	 */
	EReference getStructureInstance_Connections();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.etrice.generator.etricegen.StructureInstance#getAllContainedInstances <em>All Contained Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Contained Instances</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.StructureInstance#getAllContainedInstances()
	 * @see #getStructureInstance()
	 * @generated
	 */
	EReference getStructureInstance_AllContainedInstances();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.etrice.generator.etricegen.StructureInstance#getOrderedIfItemInstances <em>Ordered If Item Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ordered If Item Instances</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.StructureInstance#getOrderedIfItemInstances()
	 * @see #getStructureInstance()
	 * @generated
	 */
	EReference getStructureInstance_OrderedIfItemInstances();

	/**
	 * Returns the meta object for class '{@link org.eclipse.etrice.generator.etricegen.SubSystemInstance <em>Sub System Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub System Instance</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.SubSystemInstance
	 * @generated
	 */
	EClass getSubSystemInstance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.etrice.generator.etricegen.SubSystemInstance#getSubSystemClass <em>Sub System Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub System Class</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.SubSystemInstance#getSubSystemClass()
	 * @see #getSubSystemInstance()
	 * @generated
	 */
	EReference getSubSystemInstance_SubSystemClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.etrice.generator.etricegen.SubSystemInstance#getObjCounter <em>Obj Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Obj Counter</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.SubSystemInstance#getObjCounter()
	 * @see #getSubSystemInstance()
	 * @generated
	 */
	EReference getSubSystemInstance_ObjCounter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.etrice.generator.etricegen.ActorInstance <em>Actor Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Instance</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.ActorInstance
	 * @generated
	 */
	EClass getActorInstance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.etrice.generator.etricegen.ActorInstance#getActorClass <em>Actor Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor Class</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.ActorInstance#getActorClass()
	 * @see #getActorInstance()
	 * @generated
	 */
	EReference getActorInstance_ActorClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.etrice.generator.etricegen.InterfaceItemInstance <em>Interface Item Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Item Instance</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.InterfaceItemInstance
	 * @generated
	 */
	EClass getInterfaceItemInstance();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.etrice.generator.etricegen.InterfaceItemInstance#getPeers <em>Peers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Peers</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.InterfaceItemInstance#getPeers()
	 * @see #getInterfaceItemInstance()
	 * @generated
	 */
	EReference getInterfaceItemInstance_Peers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.etrice.generator.etricegen.PortInstance <em>Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Instance</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.PortInstance
	 * @generated
	 */
	EClass getPortInstance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.etrice.generator.etricegen.PortInstance#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.PortInstance#getPort()
	 * @see #getPortInstance()
	 * @generated
	 */
	EReference getPortInstance_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.etrice.generator.etricegen.PortInstance#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.PortInstance#getKind()
	 * @see #getPortInstance()
	 * @generated
	 */
	EAttribute getPortInstance_Kind();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.etrice.generator.etricegen.PortInstance#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bindings</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.PortInstance#getBindings()
	 * @see #getPortInstance()
	 * @generated
	 */
	EReference getPortInstance_Bindings();

	/**
	 * Returns the meta object for class '{@link org.eclipse.etrice.generator.etricegen.BindingInstance <em>Binding Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Instance</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.BindingInstance
	 * @generated
	 */
	EClass getBindingInstance();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.etrice.generator.etricegen.BindingInstance#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ports</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.BindingInstance#getPorts()
	 * @see #getBindingInstance()
	 * @generated
	 */
	EReference getBindingInstance_Ports();

	/**
	 * Returns the meta object for class '{@link org.eclipse.etrice.generator.etricegen.SAPInstance <em>SAP Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SAP Instance</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.SAPInstance
	 * @generated
	 */
	EClass getSAPInstance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.etrice.generator.etricegen.SAPInstance#getSap <em>Sap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sap</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.SAPInstance#getSap()
	 * @see #getSAPInstance()
	 * @generated
	 */
	EReference getSAPInstance_Sap();

	/**
	 * Returns the meta object for class '{@link org.eclipse.etrice.generator.etricegen.SPPInstance <em>SPP Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPP Instance</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.SPPInstance
	 * @generated
	 */
	EClass getSPPInstance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.etrice.generator.etricegen.SPPInstance#getSpp <em>Spp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Spp</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.SPPInstance#getSpp()
	 * @see #getSPPInstance()
	 * @generated
	 */
	EReference getSPPInstance_Spp();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.etrice.generator.etricegen.SPPInstance#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.SPPInstance#getIncoming()
	 * @see #getSPPInstance()
	 * @generated
	 */
	EReference getSPPInstance_Incoming();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.etrice.generator.etricegen.SPPInstance#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.SPPInstance#getOutgoing()
	 * @see #getSPPInstance()
	 * @generated
	 */
	EReference getSPPInstance_Outgoing();

	/**
	 * Returns the meta object for class '{@link org.eclipse.etrice.generator.etricegen.ServiceImplInstance <em>Service Impl Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Impl Instance</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.ServiceImplInstance
	 * @generated
	 */
	EClass getServiceImplInstance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.etrice.generator.etricegen.ServiceImplInstance#getSvcImpl <em>Svc Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Svc Impl</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.ServiceImplInstance#getSvcImpl()
	 * @see #getServiceImplInstance()
	 * @generated
	 */
	EReference getServiceImplInstance_SvcImpl();

	/**
	 * Returns the meta object for class '{@link org.eclipse.etrice.generator.etricegen.ConnectionInstance <em>Connection Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Instance</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.ConnectionInstance
	 * @generated
	 */
	EClass getConnectionInstance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.etrice.generator.etricegen.ConnectionInstance#getFromAI <em>From AI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From AI</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.ConnectionInstance#getFromAI()
	 * @see #getConnectionInstance()
	 * @generated
	 */
	EReference getConnectionInstance_FromAI();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.etrice.generator.etricegen.ConnectionInstance#getFromSPP <em>From SPP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From SPP</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.ConnectionInstance#getFromSPP()
	 * @see #getConnectionInstance()
	 * @generated
	 */
	EReference getConnectionInstance_FromSPP();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.etrice.generator.etricegen.ConnectionInstance#getToSPP <em>To SPP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To SPP</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.ConnectionInstance#getToSPP()
	 * @see #getConnectionInstance()
	 * @generated
	 */
	EReference getConnectionInstance_ToSPP();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.etrice.generator.etricegen.ConnectionInstance#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.ConnectionInstance#getConnection()
	 * @see #getConnectionInstance()
	 * @generated
	 */
	EReference getConnectionInstance_Connection();

	/**
	 * Returns the meta object for class '{@link org.eclipse.etrice.generator.etricegen.ActiveTrigger <em>Active Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active Trigger</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.ActiveTrigger
	 * @generated
	 */
	EClass getActiveTrigger();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.etrice.generator.etricegen.ActiveTrigger#getMsg <em>Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Msg</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.ActiveTrigger#getMsg()
	 * @see #getActiveTrigger()
	 * @generated
	 */
	EReference getActiveTrigger_Msg();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.etrice.generator.etricegen.ActiveTrigger#getIfitem <em>Ifitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ifitem</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.ActiveTrigger#getIfitem()
	 * @see #getActiveTrigger()
	 * @generated
	 */
	EReference getActiveTrigger_Ifitem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.etrice.generator.etricegen.ActiveTrigger#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.ActiveTrigger#getTrigger()
	 * @see #getActiveTrigger()
	 * @generated
	 */
	EAttribute getActiveTrigger_Trigger();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.etrice.generator.etricegen.ActiveTrigger#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transitions</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.ActiveTrigger#getTransitions()
	 * @see #getActiveTrigger()
	 * @generated
	 */
	EReference getActiveTrigger_Transitions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.etrice.generator.etricegen.TransitionChain <em>Transition Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Chain</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.TransitionChain
	 * @generated
	 */
	EClass getTransitionChain();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.etrice.generator.etricegen.TransitionChain#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.TransitionChain#getTransition()
	 * @see #getTransitionChain()
	 * @generated
	 */
	EReference getTransitionChain_Transition();

	/**
	 * Returns the meta object for class '{@link ITransitionChainVisitor <em>ITransition Chain Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ITransition Chain Visitor</em>'.
	 * @see ITransitionChainVisitor
	 * @model instanceClass="ITransitionChainVisitor"
	 * @generated
	 */
	EClass getITransitionChainVisitor();

	/**
	 * Returns the meta object for class '{@link IDiagnostician <em>IDiagnostician</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDiagnostician</em>'.
	 * @see IDiagnostician
	 * @model instanceClass="IDiagnostician"
	 * @generated
	 */
	EClass getIDiagnostician();

	/**
	 * Returns the meta object for class '{@link org.eclipse.etrice.generator.etricegen.ExpandedActorClass <em>Expanded Actor Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expanded Actor Class</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.ExpandedActorClass
	 * @generated
	 */
	EClass getExpandedActorClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.etrice.generator.etricegen.ExpandedActorClass#getActorClass <em>Actor Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor Class</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.ExpandedActorClass#getActorClass()
	 * @see #getExpandedActorClass()
	 * @generated
	 */
	EReference getExpandedActorClass_ActorClass();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.etrice.generator.etricegen.PortKind <em>Port Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Kind</em>'.
	 * @see org.eclipse.etrice.generator.etricegen.PortKind
	 * @generated
	 */
	EEnum getPortKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ETriceGenFactory getETriceGenFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.etrice.generator.etricegen.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.etrice.generator.etricegen.impl.RootImpl
		 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Sub Systems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__SUB_SYSTEMS = eINSTANCE.getRoot_SubSystems();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__MODELS = eINSTANCE.getRoot_Models();

		/**
		 * The meta object literal for the '<em><b>Xp Actor Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__XP_ACTOR_CLASSES = eINSTANCE.getRoot_XpActorClasses();

		/**
		 * The meta object literal for the '<em><b>Used Data Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__USED_DATA_CLASSES = eINSTANCE.getRoot_UsedDataClasses();

		/**
		 * The meta object literal for the '<em><b>Used Protocol Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__USED_PROTOCOL_CLASSES = eINSTANCE.getRoot_UsedProtocolClasses();

		/**
		 * The meta object literal for the '<em><b>Used Actor Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__USED_ACTOR_CLASSES = eINSTANCE.getRoot_UsedActorClasses();

		/**
		 * The meta object literal for the '<em><b>Used Room Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__USED_ROOM_MODELS = eINSTANCE.getRoot_UsedRoomModels();

		/**
		 * The meta object literal for the '{@link org.eclipse.etrice.generator.etricegen.impl.CounterImpl <em>Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.etrice.generator.etricegen.impl.CounterImpl
		 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getCounter()
		 * @generated
		 */
		EClass COUNTER = eINSTANCE.getCounter();

		/**
		 * The meta object literal for the '<em><b>Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTER__COUNTER = eINSTANCE.getCounter_Counter();

		/**
		 * The meta object literal for the '{@link org.eclipse.etrice.generator.etricegen.impl.InstanceBaseImpl <em>Instance Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.etrice.generator.etricegen.impl.InstanceBaseImpl
		 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getInstanceBase()
		 * @generated
		 */
		EClass INSTANCE_BASE = eINSTANCE.getInstanceBase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BASE__NAME = eINSTANCE.getInstanceBase_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BASE__PATH = eINSTANCE.getInstanceBase_Path();

		/**
		 * The meta object literal for the '<em><b>Obj Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BASE__OBJ_ID = eINSTANCE.getInstanceBase_ObjId();

		/**
		 * The meta object literal for the '{@link org.eclipse.etrice.generator.etricegen.impl.StructureInstanceImpl <em>Structure Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.etrice.generator.etricegen.impl.StructureInstanceImpl
		 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getStructureInstance()
		 * @generated
		 */
		EClass STRUCTURE_INSTANCE = eINSTANCE.getStructureInstance();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_INSTANCE__INSTANCES = eINSTANCE.getStructureInstance_Instances();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_INSTANCE__PORTS = eINSTANCE.getStructureInstance_Ports();

		/**
		 * The meta object literal for the '<em><b>Saps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_INSTANCE__SAPS = eINSTANCE.getStructureInstance_Saps();

		/**
		 * The meta object literal for the '<em><b>Spps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_INSTANCE__SPPS = eINSTANCE.getStructureInstance_Spps();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_INSTANCE__SERVICES = eINSTANCE.getStructureInstance_Services();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_INSTANCE__BINDINGS = eINSTANCE.getStructureInstance_Bindings();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_INSTANCE__CONNECTIONS = eINSTANCE.getStructureInstance_Connections();

		/**
		 * The meta object literal for the '<em><b>All Contained Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_INSTANCE__ALL_CONTAINED_INSTANCES = eINSTANCE.getStructureInstance_AllContainedInstances();

		/**
		 * The meta object literal for the '<em><b>Ordered If Item Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_INSTANCE__ORDERED_IF_ITEM_INSTANCES = eINSTANCE.getStructureInstance_OrderedIfItemInstances();

		/**
		 * The meta object literal for the '{@link org.eclipse.etrice.generator.etricegen.impl.SubSystemInstanceImpl <em>Sub System Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.etrice.generator.etricegen.impl.SubSystemInstanceImpl
		 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getSubSystemInstance()
		 * @generated
		 */
		EClass SUB_SYSTEM_INSTANCE = eINSTANCE.getSubSystemInstance();

		/**
		 * The meta object literal for the '<em><b>Sub System Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SYSTEM_INSTANCE__SUB_SYSTEM_CLASS = eINSTANCE.getSubSystemInstance_SubSystemClass();

		/**
		 * The meta object literal for the '<em><b>Obj Counter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SYSTEM_INSTANCE__OBJ_COUNTER = eINSTANCE.getSubSystemInstance_ObjCounter();

		/**
		 * The meta object literal for the '{@link org.eclipse.etrice.generator.etricegen.impl.ActorInstanceImpl <em>Actor Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.etrice.generator.etricegen.impl.ActorInstanceImpl
		 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getActorInstance()
		 * @generated
		 */
		EClass ACTOR_INSTANCE = eINSTANCE.getActorInstance();

		/**
		 * The meta object literal for the '<em><b>Actor Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_INSTANCE__ACTOR_CLASS = eINSTANCE.getActorInstance_ActorClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.etrice.generator.etricegen.impl.InterfaceItemInstanceImpl <em>Interface Item Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.etrice.generator.etricegen.impl.InterfaceItemInstanceImpl
		 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getInterfaceItemInstance()
		 * @generated
		 */
		EClass INTERFACE_ITEM_INSTANCE = eINSTANCE.getInterfaceItemInstance();

		/**
		 * The meta object literal for the '<em><b>Peers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_ITEM_INSTANCE__PEERS = eINSTANCE.getInterfaceItemInstance_Peers();

		/**
		 * The meta object literal for the '{@link org.eclipse.etrice.generator.etricegen.impl.PortInstanceImpl <em>Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.etrice.generator.etricegen.impl.PortInstanceImpl
		 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getPortInstance()
		 * @generated
		 */
		EClass PORT_INSTANCE = eINSTANCE.getPortInstance();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE__PORT = eINSTANCE.getPortInstance_Port();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_INSTANCE__KIND = eINSTANCE.getPortInstance_Kind();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE__BINDINGS = eINSTANCE.getPortInstance_Bindings();

		/**
		 * The meta object literal for the '{@link org.eclipse.etrice.generator.etricegen.impl.BindingInstanceImpl <em>Binding Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.etrice.generator.etricegen.impl.BindingInstanceImpl
		 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getBindingInstance()
		 * @generated
		 */
		EClass BINDING_INSTANCE = eINSTANCE.getBindingInstance();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_INSTANCE__PORTS = eINSTANCE.getBindingInstance_Ports();

		/**
		 * The meta object literal for the '{@link org.eclipse.etrice.generator.etricegen.impl.SAPInstanceImpl <em>SAP Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.etrice.generator.etricegen.impl.SAPInstanceImpl
		 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getSAPInstance()
		 * @generated
		 */
		EClass SAP_INSTANCE = eINSTANCE.getSAPInstance();

		/**
		 * The meta object literal for the '<em><b>Sap</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAP_INSTANCE__SAP = eINSTANCE.getSAPInstance_Sap();

		/**
		 * The meta object literal for the '{@link org.eclipse.etrice.generator.etricegen.impl.SPPInstanceImpl <em>SPP Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.etrice.generator.etricegen.impl.SPPInstanceImpl
		 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getSPPInstance()
		 * @generated
		 */
		EClass SPP_INSTANCE = eINSTANCE.getSPPInstance();

		/**
		 * The meta object literal for the '<em><b>Spp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPP_INSTANCE__SPP = eINSTANCE.getSPPInstance_Spp();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPP_INSTANCE__INCOMING = eINSTANCE.getSPPInstance_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPP_INSTANCE__OUTGOING = eINSTANCE.getSPPInstance_Outgoing();

		/**
		 * The meta object literal for the '{@link org.eclipse.etrice.generator.etricegen.impl.ServiceImplInstanceImpl <em>Service Impl Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.etrice.generator.etricegen.impl.ServiceImplInstanceImpl
		 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getServiceImplInstance()
		 * @generated
		 */
		EClass SERVICE_IMPL_INSTANCE = eINSTANCE.getServiceImplInstance();

		/**
		 * The meta object literal for the '<em><b>Svc Impl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_IMPL_INSTANCE__SVC_IMPL = eINSTANCE.getServiceImplInstance_SvcImpl();

		/**
		 * The meta object literal for the '{@link org.eclipse.etrice.generator.etricegen.impl.ConnectionInstanceImpl <em>Connection Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.etrice.generator.etricegen.impl.ConnectionInstanceImpl
		 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getConnectionInstance()
		 * @generated
		 */
		EClass CONNECTION_INSTANCE = eINSTANCE.getConnectionInstance();

		/**
		 * The meta object literal for the '<em><b>From AI</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_INSTANCE__FROM_AI = eINSTANCE.getConnectionInstance_FromAI();

		/**
		 * The meta object literal for the '<em><b>From SPP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_INSTANCE__FROM_SPP = eINSTANCE.getConnectionInstance_FromSPP();

		/**
		 * The meta object literal for the '<em><b>To SPP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_INSTANCE__TO_SPP = eINSTANCE.getConnectionInstance_ToSPP();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_INSTANCE__CONNECTION = eINSTANCE.getConnectionInstance_Connection();

		/**
		 * The meta object literal for the '{@link org.eclipse.etrice.generator.etricegen.impl.ActiveTriggerImpl <em>Active Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.etrice.generator.etricegen.impl.ActiveTriggerImpl
		 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getActiveTrigger()
		 * @generated
		 */
		EClass ACTIVE_TRIGGER = eINSTANCE.getActiveTrigger();

		/**
		 * The meta object literal for the '<em><b>Msg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVE_TRIGGER__MSG = eINSTANCE.getActiveTrigger_Msg();

		/**
		 * The meta object literal for the '<em><b>Ifitem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVE_TRIGGER__IFITEM = eINSTANCE.getActiveTrigger_Ifitem();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVE_TRIGGER__TRIGGER = eINSTANCE.getActiveTrigger_Trigger();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVE_TRIGGER__TRANSITIONS = eINSTANCE.getActiveTrigger_Transitions();

		/**
		 * The meta object literal for the '{@link org.eclipse.etrice.generator.etricegen.impl.TransitionChainImpl <em>Transition Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.etrice.generator.etricegen.impl.TransitionChainImpl
		 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getTransitionChain()
		 * @generated
		 */
		EClass TRANSITION_CHAIN = eINSTANCE.getTransitionChain();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_CHAIN__TRANSITION = eINSTANCE.getTransitionChain_Transition();

		/**
		 * The meta object literal for the '{@link ITransitionChainVisitor <em>ITransition Chain Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ITransitionChainVisitor
		 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getITransitionChainVisitor()
		 * @generated
		 */
		EClass ITRANSITION_CHAIN_VISITOR = eINSTANCE.getITransitionChainVisitor();

		/**
		 * The meta object literal for the '{@link IDiagnostician <em>IDiagnostician</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IDiagnostician
		 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getIDiagnostician()
		 * @generated
		 */
		EClass IDIAGNOSTICIAN = eINSTANCE.getIDiagnostician();

		/**
		 * The meta object literal for the '{@link org.eclipse.etrice.generator.etricegen.impl.ExpandedActorClassImpl <em>Expanded Actor Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.etrice.generator.etricegen.impl.ExpandedActorClassImpl
		 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getExpandedActorClass()
		 * @generated
		 */
		EClass EXPANDED_ACTOR_CLASS = eINSTANCE.getExpandedActorClass();

		/**
		 * The meta object literal for the '<em><b>Actor Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPANDED_ACTOR_CLASS__ACTOR_CLASS = eINSTANCE.getExpandedActorClass_ActorClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.etrice.generator.etricegen.PortKind <em>Port Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.etrice.generator.etricegen.PortKind
		 * @see org.eclipse.etrice.generator.etricegen.impl.ETriceGenPackageImpl#getPortKind()
		 * @generated
		 */
		EEnum PORT_KIND = eINSTANCE.getPortKind();

	}

} //ETriceGenPackage
