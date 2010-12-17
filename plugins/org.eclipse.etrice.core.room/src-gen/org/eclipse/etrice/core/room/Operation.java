/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.etrice.core.room;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.etrice.core.room.Operation#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.Operation#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.Operation#getReturntype <em>Returntype</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.Operation#getDetailCode <em>Detail Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.etrice.core.room.RoomPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject
{
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
   * @see org.eclipse.etrice.core.room.RoomPackage#getOperation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.etrice.core.room.Operation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.etrice.core.room.FreeTypedID}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see org.eclipse.etrice.core.room.RoomPackage#getOperation_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<FreeTypedID> getArguments();

  /**
   * Returns the value of the '<em><b>Returntype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Returntype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Returntype</em>' containment reference.
   * @see #setReturntype(FreeType)
   * @see org.eclipse.etrice.core.room.RoomPackage#getOperation_Returntype()
   * @model containment="true"
   * @generated
   */
  FreeType getReturntype();

  /**
   * Sets the value of the '{@link org.eclipse.etrice.core.room.Operation#getReturntype <em>Returntype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Returntype</em>' containment reference.
   * @see #getReturntype()
   * @generated
   */
  void setReturntype(FreeType value);

  /**
   * Returns the value of the '<em><b>Detail Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Detail Code</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Detail Code</em>' containment reference.
   * @see #setDetailCode(DetailCode)
   * @see org.eclipse.etrice.core.room.RoomPackage#getOperation_DetailCode()
   * @model containment="true"
   * @generated
   */
  DetailCode getDetailCode();

  /**
   * Sets the value of the '{@link org.eclipse.etrice.core.room.Operation#getDetailCode <em>Detail Code</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Detail Code</em>' containment reference.
   * @see #getDetailCode()
   * @generated
   */
  void setDetailCode(DetailCode value);

} // Operation
