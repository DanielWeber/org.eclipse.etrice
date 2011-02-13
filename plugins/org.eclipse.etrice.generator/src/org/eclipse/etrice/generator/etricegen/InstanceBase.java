/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.etrice.generator.etricegen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.etrice.generator.etricegen.InstanceBase#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.etrice.generator.etricegen.InstanceBase#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.etrice.generator.etricegen.InstanceBase#getObjId <em>Obj Id</em>}</li>
 *   <li>{@link org.eclipse.etrice.generator.etricegen.InstanceBase#getThreadId <em>Thread Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getInstanceBase()
 * @model abstract="true"
 * @generated
 */
public interface InstanceBase extends EObject {
	
	/**
	 * delimiter character for paths
	 */
	static char pathDelim = '/';
	
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getInstanceBase_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.etrice.generator.etricegen.InstanceBase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getInstanceBase_Path()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Returns the value of the '<em><b>Obj Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obj Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obj Id</em>' attribute.
	 * @see #setObjId(int)
	 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getInstanceBase_ObjId()
	 * @model
	 * @generated
	 */
	int getObjId();

	/**
	 * Sets the value of the '{@link org.eclipse.etrice.generator.etricegen.InstanceBase#getObjId <em>Obj Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obj Id</em>' attribute.
	 * @see #getObjId()
	 * @generated
	 */
	void setObjId(int value);

	/**
	 * Returns the value of the '<em><b>Thread Id</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Id</em>' attribute.
	 * @see org.eclipse.etrice.generator.etricegen.ETriceGenPackage#getInstanceBase_ThreadId()
	 * @model default="-1" changeable="false" derived="true"
	 * @generated
	 */
	int getThreadId();

} // InstanceBase
