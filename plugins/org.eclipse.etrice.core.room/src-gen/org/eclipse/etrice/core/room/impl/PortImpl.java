/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.etrice.core.room.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.etrice.core.room.Port;
import org.eclipse.etrice.core.room.RoomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.etrice.core.room.impl.PortImpl#isConjugated <em>Conjugated</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.impl.PortImpl#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortImpl extends InterfaceItemImpl implements Port
{
  /**
   * The default value of the '{@link #isConjugated() <em>Conjugated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConjugated()
   * @generated
   * @ordered
   */
  protected static final boolean CONJUGATED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isConjugated() <em>Conjugated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConjugated()
   * @generated
   * @ordered
   */
  protected boolean conjugated = CONJUGATED_EDEFAULT;

  /**
   * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicity()
   * @generated
   * @ordered
   */
  protected static final int MULTIPLICITY_EDEFAULT = 1;

  /**
   * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicity()
   * @generated
   * @ordered
   */
  protected int multiplicity = MULTIPLICITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PortImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RoomPackage.Literals.PORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isConjugated()
  {
    return conjugated;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConjugated(boolean newConjugated)
  {
    boolean oldConjugated = conjugated;
    conjugated = newConjugated;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoomPackage.PORT__CONJUGATED, oldConjugated, conjugated));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMultiplicity()
  {
    return multiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiplicity(int newMultiplicity)
  {
    int oldMultiplicity = multiplicity;
    multiplicity = newMultiplicity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoomPackage.PORT__MULTIPLICITY, oldMultiplicity, multiplicity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RoomPackage.PORT__CONJUGATED:
        return isConjugated();
      case RoomPackage.PORT__MULTIPLICITY:
        return getMultiplicity();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RoomPackage.PORT__CONJUGATED:
        setConjugated((Boolean)newValue);
        return;
      case RoomPackage.PORT__MULTIPLICITY:
        setMultiplicity((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RoomPackage.PORT__CONJUGATED:
        setConjugated(CONJUGATED_EDEFAULT);
        return;
      case RoomPackage.PORT__MULTIPLICITY:
        setMultiplicity(MULTIPLICITY_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RoomPackage.PORT__CONJUGATED:
        return conjugated != CONJUGATED_EDEFAULT;
      case RoomPackage.PORT__MULTIPLICITY:
        return multiplicity != MULTIPLICITY_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (conjugated: ");
    result.append(conjugated);
    result.append(", multiplicity: ");
    result.append(multiplicity);
    result.append(')');
    return result.toString();
  }

} //PortImpl
