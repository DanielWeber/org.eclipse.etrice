/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.etrice.generator.etricegen.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.etrice.core.room.ActorClass;
import org.eclipse.etrice.core.room.ActorContainerClass;
import org.eclipse.etrice.core.room.RoomClass;
import org.eclipse.etrice.core.room.StructureClass;

import org.eclipse.etrice.generator.etricegen.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage
 * @generated
 */
public class ETriceGenSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ETriceGenPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETriceGenSwitch() {
		if (modelPackage == null) {
			modelPackage = ETriceGenPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ETriceGenPackage.ROOT: {
				Root root = (Root)theEObject;
				T result = caseRoot(root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ETriceGenPackage.COUNTER: {
				Counter counter = (Counter)theEObject;
				T result = caseCounter(counter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ETriceGenPackage.INSTANCE_BASE: {
				InstanceBase instanceBase = (InstanceBase)theEObject;
				T result = caseInstanceBase(instanceBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ETriceGenPackage.STRUCTURE_INSTANCE: {
				StructureInstance structureInstance = (StructureInstance)theEObject;
				T result = caseStructureInstance(structureInstance);
				if (result == null) result = caseInstanceBase(structureInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ETriceGenPackage.SUB_SYSTEM_INSTANCE: {
				SubSystemInstance subSystemInstance = (SubSystemInstance)theEObject;
				T result = caseSubSystemInstance(subSystemInstance);
				if (result == null) result = caseStructureInstance(subSystemInstance);
				if (result == null) result = caseInstanceBase(subSystemInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ETriceGenPackage.ACTOR_INSTANCE: {
				ActorInstance actorInstance = (ActorInstance)theEObject;
				T result = caseActorInstance(actorInstance);
				if (result == null) result = caseStructureInstance(actorInstance);
				if (result == null) result = caseInstanceBase(actorInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ETriceGenPackage.INTERFACE_ITEM_INSTANCE: {
				InterfaceItemInstance interfaceItemInstance = (InterfaceItemInstance)theEObject;
				T result = caseInterfaceItemInstance(interfaceItemInstance);
				if (result == null) result = caseInstanceBase(interfaceItemInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ETriceGenPackage.PORT_INSTANCE: {
				PortInstance portInstance = (PortInstance)theEObject;
				T result = casePortInstance(portInstance);
				if (result == null) result = caseInterfaceItemInstance(portInstance);
				if (result == null) result = caseInstanceBase(portInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ETriceGenPackage.BINDING_INSTANCE: {
				BindingInstance bindingInstance = (BindingInstance)theEObject;
				T result = caseBindingInstance(bindingInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ETriceGenPackage.SAP_INSTANCE: {
				SAPInstance sapInstance = (SAPInstance)theEObject;
				T result = caseSAPInstance(sapInstance);
				if (result == null) result = caseInterfaceItemInstance(sapInstance);
				if (result == null) result = caseInstanceBase(sapInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ETriceGenPackage.SPP_INSTANCE: {
				SPPInstance sppInstance = (SPPInstance)theEObject;
				T result = caseSPPInstance(sppInstance);
				if (result == null) result = caseInstanceBase(sppInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ETriceGenPackage.SERVICE_IMPL_INSTANCE: {
				ServiceImplInstance serviceImplInstance = (ServiceImplInstance)theEObject;
				T result = caseServiceImplInstance(serviceImplInstance);
				if (result == null) result = caseInterfaceItemInstance(serviceImplInstance);
				if (result == null) result = caseInstanceBase(serviceImplInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ETriceGenPackage.CONNECTION_INSTANCE: {
				ConnectionInstance connectionInstance = (ConnectionInstance)theEObject;
				T result = caseConnectionInstance(connectionInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ETriceGenPackage.ACTIVE_TRIGGER: {
				ActiveTrigger activeTrigger = (ActiveTrigger)theEObject;
				T result = caseActiveTrigger(activeTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ETriceGenPackage.TRANSITION_CHAIN: {
				TransitionChain transitionChain = (TransitionChain)theEObject;
				T result = caseTransitionChain(transitionChain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ETriceGenPackage.EXPANDED_ACTOR_CLASS: {
				ExpandedActorClass expandedActorClass = (ExpandedActorClass)theEObject;
				T result = caseExpandedActorClass(expandedActorClass);
				if (result == null) result = caseActorClass(expandedActorClass);
				if (result == null) result = caseActorContainerClass(expandedActorClass);
				if (result == null) result = caseStructureClass(expandedActorClass);
				if (result == null) result = caseRoomClass(expandedActorClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoot(Root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Counter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Counter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCounter(Counter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceBase(InstanceBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureInstance(StructureInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub System Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub System Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubSystemInstance(SubSystemInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActorInstance(ActorInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Item Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Item Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceItemInstance(InterfaceItemInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortInstance(PortInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingInstance(BindingInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SAP Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SAP Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSAPInstance(SAPInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPP Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPP Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPPInstance(SPPInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Impl Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Impl Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceImplInstance(ServiceImplInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionInstance(ConnectionInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Active Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Active Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActiveTrigger(ActiveTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Chain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Chain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionChain(TransitionChain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITransition Chain Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITransition Chain Visitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITransitionChainVisitor(ITransitionChainVisitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDiagnostician</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDiagnostician</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDiagnostician(IDiagnostician object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expanded Actor Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expanded Actor Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpandedActorClass(ExpandedActorClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomClass(RoomClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureClass(StructureClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor Container Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor Container Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActorContainerClass(ActorContainerClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActorClass(ActorClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //ETriceGenSwitch
