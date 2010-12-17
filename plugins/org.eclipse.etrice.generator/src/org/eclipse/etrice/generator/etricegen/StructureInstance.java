/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.etrice.generator.etricegen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.etrice.generator.etricegen.StructureInstance#getInstances <em>Instances</em>}</li>
 *   <li>{@link org.eclipse.etrice.generator.etricegen.StructureInstance#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.eclipse.etrice.generator.etricegen.StructureInstance#getSaps <em>Saps</em>}</li>
 *   <li>{@link org.eclipse.etrice.generator.etricegen.StructureInstance#getSpps <em>Spps</em>}</li>
 *   <li>{@link org.eclipse.etrice.generator.etricegen.StructureInstance#getServices <em>Services</em>}</li>
 *   <li>{@link org.eclipse.etrice.generator.etricegen.StructureInstance#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.eclipse.etrice.generator.etricegen.StructureInstance#getConnections <em>Connections</em>}</li>
 *   <li>{@link org.eclipse.etrice.generator.etricegen.StructureInstance#getAllContainedInstances <em>All Contained Instances</em>}</li>
 *   <li>{@link org.eclipse.etrice.generator.etricegen.StructureInstance#getOrderedIfItemInstances <em>Ordered If Item Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getStructureInstance()
 * @model
 * @generated
 */
public interface StructureInstance extends InstanceBase {
	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.etrice.generator.etricegen.ActorInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getStructureInstance_Instances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActorInstance> getInstances();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.etrice.generator.etricegen.PortInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getStructureInstance_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortInstance> getPorts();

	/**
	 * Returns the value of the '<em><b>Saps</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.etrice.generator.etricegen.SAPInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Saps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saps</em>' containment reference list.
	 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getStructureInstance_Saps()
	 * @model containment="true"
	 * @generated
	 */
	EList<SAPInstance> getSaps();

	/**
	 * Returns the value of the '<em><b>Spps</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.etrice.generator.etricegen.SPPInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spps</em>' containment reference list.
	 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getStructureInstance_Spps()
	 * @model containment="true"
	 * @generated
	 */
	EList<SPPInstance> getSpps();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.etrice.generator.etricegen.ServiceImplInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getStructureInstance_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceImplInstance> getServices();

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.etrice.generator.etricegen.BindingInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getStructureInstance_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<BindingInstance> getBindings();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.etrice.generator.etricegen.ConnectionInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getStructureInstance_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectionInstance> getConnections();

	/**
	 * Returns the value of the '<em><b>All Contained Instances</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.etrice.generator.etricegen.ActorInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Contained Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Contained Instances</em>' reference list.
	 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getStructureInstance_AllContainedInstances()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<ActorInstance> getAllContainedInstances();

	/**
	 * Returns the value of the '<em><b>Ordered If Item Instances</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.etrice.generator.etricegen.InterfaceItemInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordered If Item Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered If Item Instances</em>' reference list.
	 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getStructureInstance_OrderedIfItemInstances()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	EList<InterfaceItemInstance> getOrderedIfItemInstances();

} // StructureInstance
