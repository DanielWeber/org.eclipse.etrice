/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.etrice.core.room.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.etrice.core.room.BaseState;
import org.eclipse.etrice.core.room.RoomPackage;
import org.eclipse.etrice.core.room.SubStateTrPointTerminal;
import org.eclipse.etrice.core.room.TrPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub State Tr Point Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.etrice.core.room.impl.SubStateTrPointTerminalImpl#getTrPoint <em>Tr Point</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.impl.SubStateTrPointTerminalImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubStateTrPointTerminalImpl extends TransitionTerminalImpl implements SubStateTrPointTerminal
{
  /**
   * The cached value of the '{@link #getTrPoint() <em>Tr Point</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrPoint()
   * @generated
   * @ordered
   */
  protected TrPoint trPoint;

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected BaseState state;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubStateTrPointTerminalImpl()
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
    return RoomPackage.Literals.SUB_STATE_TR_POINT_TERMINAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrPoint getTrPoint()
  {
    if (trPoint != null && trPoint.eIsProxy())
    {
      InternalEObject oldTrPoint = (InternalEObject)trPoint;
      trPoint = (TrPoint)eResolveProxy(oldTrPoint);
      if (trPoint != oldTrPoint)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoomPackage.SUB_STATE_TR_POINT_TERMINAL__TR_POINT, oldTrPoint, trPoint));
      }
    }
    return trPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrPoint basicGetTrPoint()
  {
    return trPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrPoint(TrPoint newTrPoint)
  {
    TrPoint oldTrPoint = trPoint;
    trPoint = newTrPoint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoomPackage.SUB_STATE_TR_POINT_TERMINAL__TR_POINT, oldTrPoint, trPoint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseState getState()
  {
    if (state != null && state.eIsProxy())
    {
      InternalEObject oldState = (InternalEObject)state;
      state = (BaseState)eResolveProxy(oldState);
      if (state != oldState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoomPackage.SUB_STATE_TR_POINT_TERMINAL__STATE, oldState, state));
      }
    }
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseState basicGetState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setState(BaseState newState)
  {
    BaseState oldState = state;
    state = newState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoomPackage.SUB_STATE_TR_POINT_TERMINAL__STATE, oldState, state));
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
      case RoomPackage.SUB_STATE_TR_POINT_TERMINAL__TR_POINT:
        if (resolve) return getTrPoint();
        return basicGetTrPoint();
      case RoomPackage.SUB_STATE_TR_POINT_TERMINAL__STATE:
        if (resolve) return getState();
        return basicGetState();
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
      case RoomPackage.SUB_STATE_TR_POINT_TERMINAL__TR_POINT:
        setTrPoint((TrPoint)newValue);
        return;
      case RoomPackage.SUB_STATE_TR_POINT_TERMINAL__STATE:
        setState((BaseState)newValue);
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
      case RoomPackage.SUB_STATE_TR_POINT_TERMINAL__TR_POINT:
        setTrPoint((TrPoint)null);
        return;
      case RoomPackage.SUB_STATE_TR_POINT_TERMINAL__STATE:
        setState((BaseState)null);
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
      case RoomPackage.SUB_STATE_TR_POINT_TERMINAL__TR_POINT:
        return trPoint != null;
      case RoomPackage.SUB_STATE_TR_POINT_TERMINAL__STATE:
        return state != null;
    }
    return super.eIsSet(featureID);
  }

} //SubStateTrPointTerminalImpl
