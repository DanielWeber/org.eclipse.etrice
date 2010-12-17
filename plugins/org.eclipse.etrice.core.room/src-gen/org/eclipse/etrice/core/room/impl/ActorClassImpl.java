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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.etrice.core.room.ActorClass;
import org.eclipse.etrice.core.room.Attribute;
import org.eclipse.etrice.core.room.DetailCode;
import org.eclipse.etrice.core.room.ExternalPort;
import org.eclipse.etrice.core.room.Operation;
import org.eclipse.etrice.core.room.Port;
import org.eclipse.etrice.core.room.RoomPackage;
import org.eclipse.etrice.core.room.SAPRef;
import org.eclipse.etrice.core.room.ServiceImplementation;
import org.eclipse.etrice.core.room.StateGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.etrice.core.room.impl.ActorClassImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.impl.ActorClassImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.impl.ActorClassImpl#getIfPorts <em>If Ports</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.impl.ActorClassImpl#getUserCode1 <em>User Code1</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.impl.ActorClassImpl#getUserCode2 <em>User Code2</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.impl.ActorClassImpl#getIntPorts <em>Int Ports</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.impl.ActorClassImpl#getExtPorts <em>Ext Ports</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.impl.ActorClassImpl#getServiceImplementations <em>Service Implementations</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.impl.ActorClassImpl#getStrSAPs <em>Str SA Ps</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.impl.ActorClassImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.impl.ActorClassImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.eclipse.etrice.core.room.impl.ActorClassImpl#getStateMachine <em>State Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorClassImpl extends ActorContainerClassImpl implements ActorClass
{
  /**
   * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected boolean abstract_ = ABSTRACT_EDEFAULT;

  /**
   * The cached value of the '{@link #getBase() <em>Base</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected ActorClass base;

  /**
   * The cached value of the '{@link #getIfPorts() <em>If Ports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfPorts()
   * @generated
   * @ordered
   */
  protected EList<Port> ifPorts;

  /**
   * The cached value of the '{@link #getUserCode1() <em>User Code1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUserCode1()
   * @generated
   * @ordered
   */
  protected DetailCode userCode1;

  /**
   * The cached value of the '{@link #getUserCode2() <em>User Code2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUserCode2()
   * @generated
   * @ordered
   */
  protected DetailCode userCode2;

  /**
   * The cached value of the '{@link #getIntPorts() <em>Int Ports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntPorts()
   * @generated
   * @ordered
   */
  protected EList<Port> intPorts;

  /**
   * The cached value of the '{@link #getExtPorts() <em>Ext Ports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtPorts()
   * @generated
   * @ordered
   */
  protected EList<ExternalPort> extPorts;

  /**
   * The cached value of the '{@link #getServiceImplementations() <em>Service Implementations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceImplementations()
   * @generated
   * @ordered
   */
  protected EList<ServiceImplementation> serviceImplementations;

  /**
   * The cached value of the '{@link #getStrSAPs() <em>Str SA Ps</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrSAPs()
   * @generated
   * @ordered
   */
  protected EList<SAPRef> strSAPs;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperations()
   * @generated
   * @ordered
   */
  protected EList<Operation> operations;

  /**
   * The cached value of the '{@link #getStateMachine() <em>State Machine</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateMachine()
   * @generated
   * @ordered
   */
  protected StateGraph stateMachine;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActorClassImpl()
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
    return RoomPackage.Literals.ACTOR_CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAbstract()
  {
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract(boolean newAbstract)
  {
    boolean oldAbstract = abstract_;
    abstract_ = newAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoomPackage.ACTOR_CLASS__ABSTRACT, oldAbstract, abstract_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorClass getBase()
  {
    if (base != null && base.eIsProxy())
    {
      InternalEObject oldBase = (InternalEObject)base;
      base = (ActorClass)eResolveProxy(oldBase);
      if (base != oldBase)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoomPackage.ACTOR_CLASS__BASE, oldBase, base));
      }
    }
    return base;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorClass basicGetBase()
  {
    return base;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBase(ActorClass newBase)
  {
    ActorClass oldBase = base;
    base = newBase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoomPackage.ACTOR_CLASS__BASE, oldBase, base));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Port> getIfPorts()
  {
    if (ifPorts == null)
    {
      ifPorts = new EObjectContainmentEList<Port>(Port.class, this, RoomPackage.ACTOR_CLASS__IF_PORTS);
    }
    return ifPorts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DetailCode getUserCode1()
  {
    return userCode1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUserCode1(DetailCode newUserCode1, NotificationChain msgs)
  {
    DetailCode oldUserCode1 = userCode1;
    userCode1 = newUserCode1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoomPackage.ACTOR_CLASS__USER_CODE1, oldUserCode1, newUserCode1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUserCode1(DetailCode newUserCode1)
  {
    if (newUserCode1 != userCode1)
    {
      NotificationChain msgs = null;
      if (userCode1 != null)
        msgs = ((InternalEObject)userCode1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoomPackage.ACTOR_CLASS__USER_CODE1, null, msgs);
      if (newUserCode1 != null)
        msgs = ((InternalEObject)newUserCode1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoomPackage.ACTOR_CLASS__USER_CODE1, null, msgs);
      msgs = basicSetUserCode1(newUserCode1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoomPackage.ACTOR_CLASS__USER_CODE1, newUserCode1, newUserCode1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DetailCode getUserCode2()
  {
    return userCode2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUserCode2(DetailCode newUserCode2, NotificationChain msgs)
  {
    DetailCode oldUserCode2 = userCode2;
    userCode2 = newUserCode2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoomPackage.ACTOR_CLASS__USER_CODE2, oldUserCode2, newUserCode2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUserCode2(DetailCode newUserCode2)
  {
    if (newUserCode2 != userCode2)
    {
      NotificationChain msgs = null;
      if (userCode2 != null)
        msgs = ((InternalEObject)userCode2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoomPackage.ACTOR_CLASS__USER_CODE2, null, msgs);
      if (newUserCode2 != null)
        msgs = ((InternalEObject)newUserCode2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoomPackage.ACTOR_CLASS__USER_CODE2, null, msgs);
      msgs = basicSetUserCode2(newUserCode2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoomPackage.ACTOR_CLASS__USER_CODE2, newUserCode2, newUserCode2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Port> getIntPorts()
  {
    if (intPorts == null)
    {
      intPorts = new EObjectContainmentEList<Port>(Port.class, this, RoomPackage.ACTOR_CLASS__INT_PORTS);
    }
    return intPorts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExternalPort> getExtPorts()
  {
    if (extPorts == null)
    {
      extPorts = new EObjectContainmentEList<ExternalPort>(ExternalPort.class, this, RoomPackage.ACTOR_CLASS__EXT_PORTS);
    }
    return extPorts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceImplementation> getServiceImplementations()
  {
    if (serviceImplementations == null)
    {
      serviceImplementations = new EObjectContainmentEList<ServiceImplementation>(ServiceImplementation.class, this, RoomPackage.ACTOR_CLASS__SERVICE_IMPLEMENTATIONS);
    }
    return serviceImplementations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SAPRef> getStrSAPs()
  {
    if (strSAPs == null)
    {
      strSAPs = new EObjectContainmentEList<SAPRef>(SAPRef.class, this, RoomPackage.ACTOR_CLASS__STR_SA_PS);
    }
    return strSAPs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, RoomPackage.ACTOR_CLASS__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operation> getOperations()
  {
    if (operations == null)
    {
      operations = new EObjectContainmentEList<Operation>(Operation.class, this, RoomPackage.ACTOR_CLASS__OPERATIONS);
    }
    return operations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateGraph getStateMachine()
  {
    return stateMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStateMachine(StateGraph newStateMachine, NotificationChain msgs)
  {
    StateGraph oldStateMachine = stateMachine;
    stateMachine = newStateMachine;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoomPackage.ACTOR_CLASS__STATE_MACHINE, oldStateMachine, newStateMachine);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStateMachine(StateGraph newStateMachine)
  {
    if (newStateMachine != stateMachine)
    {
      NotificationChain msgs = null;
      if (stateMachine != null)
        msgs = ((InternalEObject)stateMachine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoomPackage.ACTOR_CLASS__STATE_MACHINE, null, msgs);
      if (newStateMachine != null)
        msgs = ((InternalEObject)newStateMachine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoomPackage.ACTOR_CLASS__STATE_MACHINE, null, msgs);
      msgs = basicSetStateMachine(newStateMachine, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoomPackage.ACTOR_CLASS__STATE_MACHINE, newStateMachine, newStateMachine));
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
      case RoomPackage.ACTOR_CLASS__IF_PORTS:
        return ((InternalEList<?>)getIfPorts()).basicRemove(otherEnd, msgs);
      case RoomPackage.ACTOR_CLASS__USER_CODE1:
        return basicSetUserCode1(null, msgs);
      case RoomPackage.ACTOR_CLASS__USER_CODE2:
        return basicSetUserCode2(null, msgs);
      case RoomPackage.ACTOR_CLASS__INT_PORTS:
        return ((InternalEList<?>)getIntPorts()).basicRemove(otherEnd, msgs);
      case RoomPackage.ACTOR_CLASS__EXT_PORTS:
        return ((InternalEList<?>)getExtPorts()).basicRemove(otherEnd, msgs);
      case RoomPackage.ACTOR_CLASS__SERVICE_IMPLEMENTATIONS:
        return ((InternalEList<?>)getServiceImplementations()).basicRemove(otherEnd, msgs);
      case RoomPackage.ACTOR_CLASS__STR_SA_PS:
        return ((InternalEList<?>)getStrSAPs()).basicRemove(otherEnd, msgs);
      case RoomPackage.ACTOR_CLASS__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case RoomPackage.ACTOR_CLASS__OPERATIONS:
        return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
      case RoomPackage.ACTOR_CLASS__STATE_MACHINE:
        return basicSetStateMachine(null, msgs);
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
      case RoomPackage.ACTOR_CLASS__ABSTRACT:
        return isAbstract();
      case RoomPackage.ACTOR_CLASS__BASE:
        if (resolve) return getBase();
        return basicGetBase();
      case RoomPackage.ACTOR_CLASS__IF_PORTS:
        return getIfPorts();
      case RoomPackage.ACTOR_CLASS__USER_CODE1:
        return getUserCode1();
      case RoomPackage.ACTOR_CLASS__USER_CODE2:
        return getUserCode2();
      case RoomPackage.ACTOR_CLASS__INT_PORTS:
        return getIntPorts();
      case RoomPackage.ACTOR_CLASS__EXT_PORTS:
        return getExtPorts();
      case RoomPackage.ACTOR_CLASS__SERVICE_IMPLEMENTATIONS:
        return getServiceImplementations();
      case RoomPackage.ACTOR_CLASS__STR_SA_PS:
        return getStrSAPs();
      case RoomPackage.ACTOR_CLASS__ATTRIBUTES:
        return getAttributes();
      case RoomPackage.ACTOR_CLASS__OPERATIONS:
        return getOperations();
      case RoomPackage.ACTOR_CLASS__STATE_MACHINE:
        return getStateMachine();
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
      case RoomPackage.ACTOR_CLASS__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case RoomPackage.ACTOR_CLASS__BASE:
        setBase((ActorClass)newValue);
        return;
      case RoomPackage.ACTOR_CLASS__IF_PORTS:
        getIfPorts().clear();
        getIfPorts().addAll((Collection<? extends Port>)newValue);
        return;
      case RoomPackage.ACTOR_CLASS__USER_CODE1:
        setUserCode1((DetailCode)newValue);
        return;
      case RoomPackage.ACTOR_CLASS__USER_CODE2:
        setUserCode2((DetailCode)newValue);
        return;
      case RoomPackage.ACTOR_CLASS__INT_PORTS:
        getIntPorts().clear();
        getIntPorts().addAll((Collection<? extends Port>)newValue);
        return;
      case RoomPackage.ACTOR_CLASS__EXT_PORTS:
        getExtPorts().clear();
        getExtPorts().addAll((Collection<? extends ExternalPort>)newValue);
        return;
      case RoomPackage.ACTOR_CLASS__SERVICE_IMPLEMENTATIONS:
        getServiceImplementations().clear();
        getServiceImplementations().addAll((Collection<? extends ServiceImplementation>)newValue);
        return;
      case RoomPackage.ACTOR_CLASS__STR_SA_PS:
        getStrSAPs().clear();
        getStrSAPs().addAll((Collection<? extends SAPRef>)newValue);
        return;
      case RoomPackage.ACTOR_CLASS__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case RoomPackage.ACTOR_CLASS__OPERATIONS:
        getOperations().clear();
        getOperations().addAll((Collection<? extends Operation>)newValue);
        return;
      case RoomPackage.ACTOR_CLASS__STATE_MACHINE:
        setStateMachine((StateGraph)newValue);
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
      case RoomPackage.ACTOR_CLASS__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case RoomPackage.ACTOR_CLASS__BASE:
        setBase((ActorClass)null);
        return;
      case RoomPackage.ACTOR_CLASS__IF_PORTS:
        getIfPorts().clear();
        return;
      case RoomPackage.ACTOR_CLASS__USER_CODE1:
        setUserCode1((DetailCode)null);
        return;
      case RoomPackage.ACTOR_CLASS__USER_CODE2:
        setUserCode2((DetailCode)null);
        return;
      case RoomPackage.ACTOR_CLASS__INT_PORTS:
        getIntPorts().clear();
        return;
      case RoomPackage.ACTOR_CLASS__EXT_PORTS:
        getExtPorts().clear();
        return;
      case RoomPackage.ACTOR_CLASS__SERVICE_IMPLEMENTATIONS:
        getServiceImplementations().clear();
        return;
      case RoomPackage.ACTOR_CLASS__STR_SA_PS:
        getStrSAPs().clear();
        return;
      case RoomPackage.ACTOR_CLASS__ATTRIBUTES:
        getAttributes().clear();
        return;
      case RoomPackage.ACTOR_CLASS__OPERATIONS:
        getOperations().clear();
        return;
      case RoomPackage.ACTOR_CLASS__STATE_MACHINE:
        setStateMachine((StateGraph)null);
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
      case RoomPackage.ACTOR_CLASS__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
      case RoomPackage.ACTOR_CLASS__BASE:
        return base != null;
      case RoomPackage.ACTOR_CLASS__IF_PORTS:
        return ifPorts != null && !ifPorts.isEmpty();
      case RoomPackage.ACTOR_CLASS__USER_CODE1:
        return userCode1 != null;
      case RoomPackage.ACTOR_CLASS__USER_CODE2:
        return userCode2 != null;
      case RoomPackage.ACTOR_CLASS__INT_PORTS:
        return intPorts != null && !intPorts.isEmpty();
      case RoomPackage.ACTOR_CLASS__EXT_PORTS:
        return extPorts != null && !extPorts.isEmpty();
      case RoomPackage.ACTOR_CLASS__SERVICE_IMPLEMENTATIONS:
        return serviceImplementations != null && !serviceImplementations.isEmpty();
      case RoomPackage.ACTOR_CLASS__STR_SA_PS:
        return strSAPs != null && !strSAPs.isEmpty();
      case RoomPackage.ACTOR_CLASS__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case RoomPackage.ACTOR_CLASS__OPERATIONS:
        return operations != null && !operations.isEmpty();
      case RoomPackage.ACTOR_CLASS__STATE_MACHINE:
        return stateMachine != null;
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
    result.append(" (abstract: ");
    result.append(abstract_);
    result.append(')');
    return result.toString();
  }

} //ActorClassImpl
