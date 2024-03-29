/**
 * generated by Xtext 2.31.0
 */
package uma.es.angular.t2a.t2A.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uma.es.angular.t2a.t2A.Feature;
import uma.es.angular.t2a.t2A.InstanciaEDOM;
import uma.es.angular.t2a.t2A.T2APackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uma.es.angular.t2a.t2A.impl.FeatureImpl#getInstanciaEDOM <em>Instancia EDOM</em>}</li>
 *   <li>{@link uma.es.angular.t2a.t2A.impl.FeatureImpl#isAllowSlot <em>Allow Slot</em>}</li>
 *   <li>{@link uma.es.angular.t2a.t2A.impl.FeatureImpl#getString <em>String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends MinimalEObjectImpl.Container implements Feature
{
  /**
   * The cached value of the '{@link #getInstanciaEDOM() <em>Instancia EDOM</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstanciaEDOM()
   * @generated
   * @ordered
   */
  protected InstanciaEDOM instanciaEDOM;

  /**
   * The default value of the '{@link #isAllowSlot() <em>Allow Slot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAllowSlot()
   * @generated
   * @ordered
   */
  protected static final boolean ALLOW_SLOT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAllowSlot() <em>Allow Slot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAllowSlot()
   * @generated
   * @ordered
   */
  protected boolean allowSlot = ALLOW_SLOT_EDEFAULT;

  /**
   * The default value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected static final String STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected String string = STRING_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureImpl()
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
    return T2APackage.Literals.FEATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InstanciaEDOM getInstanciaEDOM()
  {
    return instanciaEDOM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInstanciaEDOM(InstanciaEDOM newInstanciaEDOM, NotificationChain msgs)
  {
    InstanciaEDOM oldInstanciaEDOM = instanciaEDOM;
    instanciaEDOM = newInstanciaEDOM;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, T2APackage.FEATURE__INSTANCIA_EDOM, oldInstanciaEDOM, newInstanciaEDOM);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInstanciaEDOM(InstanciaEDOM newInstanciaEDOM)
  {
    if (newInstanciaEDOM != instanciaEDOM)
    {
      NotificationChain msgs = null;
      if (instanciaEDOM != null)
        msgs = ((InternalEObject)instanciaEDOM).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - T2APackage.FEATURE__INSTANCIA_EDOM, null, msgs);
      if (newInstanciaEDOM != null)
        msgs = ((InternalEObject)newInstanciaEDOM).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - T2APackage.FEATURE__INSTANCIA_EDOM, null, msgs);
      msgs = basicSetInstanciaEDOM(newInstanciaEDOM, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, T2APackage.FEATURE__INSTANCIA_EDOM, newInstanciaEDOM, newInstanciaEDOM));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isAllowSlot()
  {
    return allowSlot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAllowSlot(boolean newAllowSlot)
  {
    boolean oldAllowSlot = allowSlot;
    allowSlot = newAllowSlot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, T2APackage.FEATURE__ALLOW_SLOT, oldAllowSlot, allowSlot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getString()
  {
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setString(String newString)
  {
    String oldString = string;
    string = newString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, T2APackage.FEATURE__STRING, oldString, string));
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
      case T2APackage.FEATURE__INSTANCIA_EDOM:
        return basicSetInstanciaEDOM(null, msgs);
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
      case T2APackage.FEATURE__INSTANCIA_EDOM:
        return getInstanciaEDOM();
      case T2APackage.FEATURE__ALLOW_SLOT:
        return isAllowSlot();
      case T2APackage.FEATURE__STRING:
        return getString();
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
      case T2APackage.FEATURE__INSTANCIA_EDOM:
        setInstanciaEDOM((InstanciaEDOM)newValue);
        return;
      case T2APackage.FEATURE__ALLOW_SLOT:
        setAllowSlot((Boolean)newValue);
        return;
      case T2APackage.FEATURE__STRING:
        setString((String)newValue);
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
      case T2APackage.FEATURE__INSTANCIA_EDOM:
        setInstanciaEDOM((InstanciaEDOM)null);
        return;
      case T2APackage.FEATURE__ALLOW_SLOT:
        setAllowSlot(ALLOW_SLOT_EDEFAULT);
        return;
      case T2APackage.FEATURE__STRING:
        setString(STRING_EDEFAULT);
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
      case T2APackage.FEATURE__INSTANCIA_EDOM:
        return instanciaEDOM != null;
      case T2APackage.FEATURE__ALLOW_SLOT:
        return allowSlot != ALLOW_SLOT_EDEFAULT;
      case T2APackage.FEATURE__STRING:
        return STRING_EDEFAULT == null ? string != null : !STRING_EDEFAULT.equals(string);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (AllowSlot: ");
    result.append(allowSlot);
    result.append(", string: ");
    result.append(string);
    result.append(')');
    return result.toString();
  }

} //FeatureImpl
