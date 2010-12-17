/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.etrice.core.room.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.etrice.core.room.Message;
import org.eclipse.etrice.core.room.RoomPackage;
import org.eclipse.etrice.core.room.SemanticsRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semantics Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.etrice.core.room.impl.SemanticsRuleImpl#getMsg <em>Msg</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.impl.SemanticsRuleImpl#getFollowUps <em>Follow Ups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SemanticsRuleImpl extends MinimalEObjectImpl.Container implements SemanticsRule
{
  /**
   * The cached value of the '{@link #getMsg() <em>Msg</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMsg()
   * @generated
   * @ordered
   */
  protected Message msg;

  /**
   * The cached value of the '{@link #getFollowUps() <em>Follow Ups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFollowUps()
   * @generated
   * @ordered
   */
  protected EList<SemanticsRule> followUps;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SemanticsRuleImpl()
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
    return RoomPackage.Literals.SEMANTICS_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message getMsg()
  {
    if (msg != null && msg.eIsProxy())
    {
      InternalEObject oldMsg = (InternalEObject)msg;
      msg = (Message)eResolveProxy(oldMsg);
      if (msg != oldMsg)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoomPackage.SEMANTICS_RULE__MSG, oldMsg, msg));
      }
    }
    return msg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message basicGetMsg()
  {
    return msg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMsg(Message newMsg)
  {
    Message oldMsg = msg;
    msg = newMsg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoomPackage.SEMANTICS_RULE__MSG, oldMsg, msg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SemanticsRule> getFollowUps()
  {
    if (followUps == null)
    {
      followUps = new EObjectContainmentEList<SemanticsRule>(SemanticsRule.class, this, RoomPackage.SEMANTICS_RULE__FOLLOW_UPS);
    }
    return followUps;
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
      case RoomPackage.SEMANTICS_RULE__FOLLOW_UPS:
        return ((InternalEList<?>)getFollowUps()).basicRemove(otherEnd, msgs);
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
      case RoomPackage.SEMANTICS_RULE__MSG:
        if (resolve) return getMsg();
        return basicGetMsg();
      case RoomPackage.SEMANTICS_RULE__FOLLOW_UPS:
        return getFollowUps();
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
      case RoomPackage.SEMANTICS_RULE__MSG:
        setMsg((Message)newValue);
        return;
      case RoomPackage.SEMANTICS_RULE__FOLLOW_UPS:
        getFollowUps().clear();
        getFollowUps().addAll((Collection<? extends SemanticsRule>)newValue);
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
      case RoomPackage.SEMANTICS_RULE__MSG:
        setMsg((Message)null);
        return;
      case RoomPackage.SEMANTICS_RULE__FOLLOW_UPS:
        getFollowUps().clear();
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
      case RoomPackage.SEMANTICS_RULE__MSG:
        return msg != null;
      case RoomPackage.SEMANTICS_RULE__FOLLOW_UPS:
        return followUps != null && !followUps.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SemanticsRuleImpl
