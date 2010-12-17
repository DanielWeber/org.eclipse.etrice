/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.etrice.generator.etricegen.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.etrice.generator.etricegen.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ETriceGenFactoryImpl extends EFactoryImpl implements ETriceGenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ETriceGenFactory init() {
		try {
			ETriceGenFactory theETriceGenFactory = (ETriceGenFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/etrice/generator"); 
			if (theETriceGenFactory != null) {
				return theETriceGenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ETriceGenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETriceGenFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ETriceGenPackage.ROOT: return createRoot();
			case ETriceGenPackage.COUNTER: return createCounter();
			case ETriceGenPackage.STRUCTURE_INSTANCE: return createStructureInstance();
			case ETriceGenPackage.SUB_SYSTEM_INSTANCE: return createSubSystemInstance();
			case ETriceGenPackage.ACTOR_INSTANCE: return createActorInstance();
			case ETriceGenPackage.INTERFACE_ITEM_INSTANCE: return createInterfaceItemInstance();
			case ETriceGenPackage.PORT_INSTANCE: return createPortInstance();
			case ETriceGenPackage.BINDING_INSTANCE: return createBindingInstance();
			case ETriceGenPackage.SAP_INSTANCE: return createSAPInstance();
			case ETriceGenPackage.SPP_INSTANCE: return createSPPInstance();
			case ETriceGenPackage.SERVICE_IMPL_INSTANCE: return createServiceImplInstance();
			case ETriceGenPackage.CONNECTION_INSTANCE: return createConnectionInstance();
			case ETriceGenPackage.ACTIVE_TRIGGER: return createActiveTrigger();
			case ETriceGenPackage.TRANSITION_CHAIN: return createTransitionChain();
			case ETriceGenPackage.EXPANDED_ACTOR_CLASS: return createExpandedActorClass();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ETriceGenPackage.PORT_KIND:
				return createPortKindFromString(eDataType, initialValue);
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
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ETriceGenPackage.PORT_KIND:
				return convertPortKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Counter createCounter() {
		CounterImpl counter = new CounterImpl();
		return counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureInstance createStructureInstance() {
		StructureInstanceImpl structureInstance = new StructureInstanceImpl();
		return structureInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSystemInstance createSubSystemInstance() {
		SubSystemInstanceImpl subSystemInstance = new SubSystemInstanceImpl();
		return subSystemInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorInstance createActorInstance() {
		ActorInstanceImpl actorInstance = new ActorInstanceImpl();
		return actorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceItemInstance createInterfaceItemInstance() {
		InterfaceItemInstanceImpl interfaceItemInstance = new InterfaceItemInstanceImpl();
		return interfaceItemInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance createPortInstance() {
		PortInstanceImpl portInstance = new PortInstanceImpl();
		return portInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingInstance createBindingInstance() {
		BindingInstanceImpl bindingInstance = new BindingInstanceImpl();
		return bindingInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAPInstance createSAPInstance() {
		SAPInstanceImpl sapInstance = new SAPInstanceImpl();
		return sapInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPPInstance createSPPInstance() {
		SPPInstanceImpl sppInstance = new SPPInstanceImpl();
		return sppInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceImplInstance createServiceImplInstance() {
		ServiceImplInstanceImpl serviceImplInstance = new ServiceImplInstanceImpl();
		return serviceImplInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionInstance createConnectionInstance() {
		ConnectionInstanceImpl connectionInstance = new ConnectionInstanceImpl();
		return connectionInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveTrigger createActiveTrigger() {
		ActiveTriggerImpl activeTrigger = new ActiveTriggerImpl();
		return activeTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionChain createTransitionChain() {
		TransitionChainImpl transitionChain = new TransitionChainImpl();
		return transitionChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpandedActorClass createExpandedActorClass() {
		ExpandedActorClassImpl expandedActorClass = new ExpandedActorClassImpl();
		return expandedActorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortKind createPortKindFromString(EDataType eDataType, String initialValue) {
		PortKind result = PortKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETriceGenPackage getETriceGenPackage() {
		return (ETriceGenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ETriceGenPackage getPackage() {
		return ETriceGenPackage.eINSTANCE;
	}

} //ETriceGenFactoryImpl
