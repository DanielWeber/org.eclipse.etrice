/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.etrice.generator.etricegen;

import org.eclipse.etrice.core.room.ServiceImplementation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Impl Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.etrice.generator.etricegen.ServiceImplInstance#getSvcImpl <em>Svc Impl</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getServiceImplInstance()
 * @model
 * @generated
 */
public interface ServiceImplInstance extends InterfaceItemInstance {
	/**
	 * Returns the value of the '<em><b>Svc Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Svc Impl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Svc Impl</em>' reference.
	 * @see #setSvcImpl(ServiceImplementation)
	 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getServiceImplInstance_SvcImpl()
	 * @model
	 * @generated
	 */
	ServiceImplementation getSvcImpl();

	/**
	 * Sets the value of the '{@link org.eclipse.etrice.generator.etricegen.ServiceImplInstance#getSvcImpl <em>Svc Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Svc Impl</em>' reference.
	 * @see #getSvcImpl()
	 * @generated
	 */
	void setSvcImpl(ServiceImplementation value);

} // ServiceImplInstance
