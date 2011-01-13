/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.etrice.core.room.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.etrice.core.room.DetailCode;
import org.eclipse.etrice.core.room.RoomPackage;
import org.eclipse.etrice.core.room.State;
import org.eclipse.etrice.core.room.StateGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.etrice.core.room.impl.StateImpl#getEntryCode <em>Entry Code</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.impl.StateImpl#getExitCode <em>Exit Code</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.impl.StateImpl#getSubgraph <em>Subgraph</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends StateGraphNodeImpl implements State
{
  /**
   * The cached value of the '{@link #getEntryCode() <em>Entry Code</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryCode()
   * @generated
   * @ordered
   */
  protected DetailCode entryCode;

  /**
   * The cached value of the '{@link #getExitCode() <em>Exit Code</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExitCode()
   * @generated
   * @ordered
   */
  protected DetailCode exitCode;

  /**
   * The cached value of the '{@link #getSubgraph() <em>Subgraph</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubgraph()
   * @generated
   * @ordered
   */
  protected StateGraph subgraph;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateImpl()
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
    return RoomPackage.Literals.STATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DetailCode getEntryCode()
  {
    return entryCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntryCode(DetailCode newEntryCode, NotificationChain msgs)
  {
    DetailCode oldEntryCode = entryCode;
    entryCode = newEntryCode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoomPackage.STATE__ENTRY_CODE, oldEntryCode, newEntryCode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntryCode(DetailCode newEntryCode)
  {
    if (newEntryCode != entryCode)
    {
      NotificationChain msgs = null;
      if (entryCode != null)
        msgs = ((InternalEObject)entryCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoomPackage.STATE__ENTRY_CODE, null, msgs);
      if (newEntryCode != null)
        msgs = ((InternalEObject)newEntryCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoomPackage.STATE__ENTRY_CODE, null, msgs);
      msgs = basicSetEntryCode(newEntryCode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoomPackage.STATE__ENTRY_CODE, newEntryCode, newEntryCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DetailCode getExitCode()
  {
    return exitCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExitCode(DetailCode newExitCode, NotificationChain msgs)
  {
    DetailCode oldExitCode = exitCode;
    exitCode = newExitCode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoomPackage.STATE__EXIT_CODE, oldExitCode, newExitCode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExitCode(DetailCode newExitCode)
  {
    if (newExitCode != exitCode)
    {
      NotificationChain msgs = null;
      if (exitCode != null)
        msgs = ((InternalEObject)exitCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoomPackage.STATE__EXIT_CODE, null, msgs);
      if (newExitCode != null)
        msgs = ((InternalEObject)newExitCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoomPackage.STATE__EXIT_CODE, null, msgs);
      msgs = basicSetExitCode(newExitCode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoomPackage.STATE__EXIT_CODE, newExitCode, newExitCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateGraph getSubgraph()
  {
    return subgraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubgraph(StateGraph newSubgraph, NotificationChain msgs)
  {
    StateGraph oldSubgraph = subgraph;
    subgraph = newSubgraph;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoomPackage.STATE__SUBGRAPH, oldSubgraph, newSubgraph);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubgraph(StateGraph newSubgraph)
  {
    if (newSubgraph != subgraph)
    {
      NotificationChain msgs = null;
      if (subgraph != null)
        msgs = ((InternalEObject)subgraph).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoomPackage.STATE__SUBGRAPH, null, msgs);
      if (newSubgraph != null)
        msgs = ((InternalEObject)newSubgraph).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoomPackage.STATE__SUBGRAPH, null, msgs);
      msgs = basicSetSubgraph(newSubgraph, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoomPackage.STATE__SUBGRAPH, newSubgraph, newSubgraph));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return (this instanceof org.eclipse.etrice.core.room.BaseState)? ((org.eclipse.etrice.core.room.BaseState)this).getName() :((org.eclipse.etrice.core.room.RefinedState)this).getBase()==null? "":((org.eclipse.etrice.core.room.RefinedState)this).getBase().getName();
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
      case RoomPackage.STATE__ENTRY_CODE:
        return basicSetEntryCode(null, msgs);
      case RoomPackage.STATE__EXIT_CODE:
        return basicSetExitCode(null, msgs);
      case RoomPackage.STATE__SUBGRAPH:
        return basicSetSubgraph(null, msgs);
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
      case RoomPackage.STATE__ENTRY_CODE:
        return getEntryCode();
      case RoomPackage.STATE__EXIT_CODE:
        return getExitCode();
      case RoomPackage.STATE__SUBGRAPH:
        return getSubgraph();
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
      case RoomPackage.STATE__ENTRY_CODE:
        setEntryCode((DetailCode)newValue);
        return;
      case RoomPackage.STATE__EXIT_CODE:
        setExitCode((DetailCode)newValue);
        return;
      case RoomPackage.STATE__SUBGRAPH:
        setSubgraph((StateGraph)newValue);
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
      case RoomPackage.STATE__ENTRY_CODE:
        setEntryCode((DetailCode)null);
        return;
      case RoomPackage.STATE__EXIT_CODE:
        setExitCode((DetailCode)null);
        return;
      case RoomPackage.STATE__SUBGRAPH:
        setSubgraph((StateGraph)null);
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
      case RoomPackage.STATE__ENTRY_CODE:
        return entryCode != null;
      case RoomPackage.STATE__EXIT_CODE:
        return exitCode != null;
      case RoomPackage.STATE__SUBGRAPH:
        return subgraph != null;
    }
    return super.eIsSet(featureID);
  }

} //StateImpl
