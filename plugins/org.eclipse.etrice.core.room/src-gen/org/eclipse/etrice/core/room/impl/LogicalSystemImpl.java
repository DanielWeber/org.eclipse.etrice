/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.etrice.core.room.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.etrice.core.room.LogicalSystem;
import org.eclipse.etrice.core.room.RoomPackage;
import org.eclipse.etrice.core.room.SubSystemRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.etrice.core.room.impl.LogicalSystemImpl#getSubSystems <em>Sub Systems</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicalSystemImpl extends StructureClassImpl implements LogicalSystem
{
  /**
   * The cached value of the '{@link #getSubSystems() <em>Sub Systems</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubSystems()
   * @generated
   * @ordered
   */
  protected EList<SubSystemRef> subSystems;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicalSystemImpl()
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
    return RoomPackage.Literals.LOGICAL_SYSTEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SubSystemRef> getSubSystems()
  {
    if (subSystems == null)
    {
      subSystems = new EObjectContainmentEList<SubSystemRef>(SubSystemRef.class, this, RoomPackage.LOGICAL_SYSTEM__SUB_SYSTEMS);
    }
    return subSystems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RoomPackage.LOGICAL_SYSTEM__SUB_SYSTEMS:
        return ((InternalEList<?>)getSubSystems()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case RoomPackage.LOGICAL_SYSTEM__SUB_SYSTEMS:
        return getSubSystems();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RoomPackage.LOGICAL_SYSTEM__SUB_SYSTEMS:
        getSubSystems().clear();
        getSubSystems().addAll((Collection<? extends SubSystemRef>)newValue);
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
      case RoomPackage.LOGICAL_SYSTEM__SUB_SYSTEMS:
        getSubSystems().clear();
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
      case RoomPackage.LOGICAL_SYSTEM__SUB_SYSTEMS:
        return subSystems != null && !subSystems.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LogicalSystemImpl
