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
 * A representation of the model object '<em><b>Interface Item Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.etrice.generator.etricegen.InterfaceItemInstance#getPeers <em>Peers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getInterfaceItemInstance()
 * @model
 * @generated
 */
public interface InterfaceItemInstance extends InstanceBase {
	/**
	 * Returns the value of the '<em><b>Peers</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.etrice.generator.etricegen.InterfaceItemInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peers</em>' reference list.
	 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getInterfaceItemInstance_Peers()
	 * @model
	 * @generated
	 */
	EList<InterfaceItemInstance> getPeers();

} // InterfaceItemInstance
