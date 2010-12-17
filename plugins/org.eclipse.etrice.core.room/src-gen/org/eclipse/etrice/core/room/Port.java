/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.etrice.core.room;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.etrice.core.room.Port#isConjugated <em>Conjugated</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.Port#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.etrice.core.room.RoomPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends InterfaceItem
{
  /**
   * Returns the value of the '<em><b>Conjugated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conjugated</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conjugated</em>' attribute.
   * @see #setConjugated(boolean)
   * @see org.eclipse.etrice.core.room.RoomPackage#getPort_Conjugated()
   * @model
   * @generated
   */
  boolean isConjugated();

  /**
   * Sets the value of the '{@link org.eclipse.etrice.core.room.Port#isConjugated <em>Conjugated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conjugated</em>' attribute.
   * @see #isConjugated()
   * @generated
   */
  void setConjugated(boolean value);

  /**
   * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiplicity</em>' attribute.
   * @see #setMultiplicity(int)
   * @see org.eclipse.etrice.core.room.RoomPackage#getPort_Multiplicity()
   * @model default="1"
   * @generated
   */
  int getMultiplicity();

  /**
   * Sets the value of the '{@link org.eclipse.etrice.core.room.Port#getMultiplicity <em>Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiplicity</em>' attribute.
   * @see #getMultiplicity()
   * @generated
   */
  void setMultiplicity(int value);

} // Port
