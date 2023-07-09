/**
 * generated by Xtext 2.31.0
 */
package uma.es.angular.t2a.t2A.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uma.es.angular.t2a.t2A.EDOM;
import uma.es.angular.t2a.t2A.InstanceEDOMFeature;
import uma.es.angular.t2a.t2A.InstanciaEDOM;
import uma.es.angular.t2a.t2A.StyleClass;
import uma.es.angular.t2a.t2A.T2APackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instancia EDOM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uma.es.angular.t2a.t2A.impl.InstanciaEDOMImpl#getInstancia <em>Instancia</em>}</li>
 *   <li>{@link uma.es.angular.t2a.t2A.impl.InstanciaEDOMImpl#getSclasses <em>Sclasses</em>}</li>
 *   <li>{@link uma.es.angular.t2a.t2A.impl.InstanciaEDOMImpl#getSclassesOnline <em>Sclasses Online</em>}</li>
 *   <li>{@link uma.es.angular.t2a.t2A.impl.InstanciaEDOMImpl#getInsfeatures <em>Insfeatures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanciaEDOMImpl extends MinimalEObjectImpl.Container implements InstanciaEDOM
{
  /**
   * The cached value of the '{@link #getInstancia() <em>Instancia</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstancia()
   * @generated
   * @ordered
   */
  protected EDOM instancia;

  /**
   * The cached value of the '{@link #getSclasses() <em>Sclasses</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSclasses()
   * @generated
   * @ordered
   */
  protected EList<StyleClass> sclasses;

  /**
   * The cached value of the '{@link #getSclassesOnline() <em>Sclasses Online</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSclassesOnline()
   * @generated
   * @ordered
   */
  protected EList<String> sclassesOnline;

  /**
   * The cached value of the '{@link #getInsfeatures() <em>Insfeatures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInsfeatures()
   * @generated
   * @ordered
   */
  protected EList<InstanceEDOMFeature> insfeatures;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstanciaEDOMImpl()
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
    return T2APackage.Literals.INSTANCIA_EDOM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EDOM getInstancia()
  {
    if (instancia != null && instancia.eIsProxy())
    {
      InternalEObject oldInstancia = (InternalEObject)instancia;
      instancia = (EDOM)eResolveProxy(oldInstancia);
      if (instancia != oldInstancia)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, T2APackage.INSTANCIA_EDOM__INSTANCIA, oldInstancia, instancia));
      }
    }
    return instancia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDOM basicGetInstancia()
  {
    return instancia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInstancia(EDOM newInstancia)
  {
    EDOM oldInstancia = instancia;
    instancia = newInstancia;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, T2APackage.INSTANCIA_EDOM__INSTANCIA, oldInstancia, instancia));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<StyleClass> getSclasses()
  {
    if (sclasses == null)
    {
      sclasses = new EObjectResolvingEList<StyleClass>(StyleClass.class, this, T2APackage.INSTANCIA_EDOM__SCLASSES);
    }
    return sclasses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getSclassesOnline()
  {
    if (sclassesOnline == null)
    {
      sclassesOnline = new EDataTypeEList<String>(String.class, this, T2APackage.INSTANCIA_EDOM__SCLASSES_ONLINE);
    }
    return sclassesOnline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<InstanceEDOMFeature> getInsfeatures()
  {
    if (insfeatures == null)
    {
      insfeatures = new EObjectContainmentEList<InstanceEDOMFeature>(InstanceEDOMFeature.class, this, T2APackage.INSTANCIA_EDOM__INSFEATURES);
    }
    return insfeatures;
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
      case T2APackage.INSTANCIA_EDOM__INSFEATURES:
        return ((InternalEList<?>)getInsfeatures()).basicRemove(otherEnd, msgs);
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
      case T2APackage.INSTANCIA_EDOM__INSTANCIA:
        if (resolve) return getInstancia();
        return basicGetInstancia();
      case T2APackage.INSTANCIA_EDOM__SCLASSES:
        return getSclasses();
      case T2APackage.INSTANCIA_EDOM__SCLASSES_ONLINE:
        return getSclassesOnline();
      case T2APackage.INSTANCIA_EDOM__INSFEATURES:
        return getInsfeatures();
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
      case T2APackage.INSTANCIA_EDOM__INSTANCIA:
        setInstancia((EDOM)newValue);
        return;
      case T2APackage.INSTANCIA_EDOM__SCLASSES:
        getSclasses().clear();
        getSclasses().addAll((Collection<? extends StyleClass>)newValue);
        return;
      case T2APackage.INSTANCIA_EDOM__SCLASSES_ONLINE:
        getSclassesOnline().clear();
        getSclassesOnline().addAll((Collection<? extends String>)newValue);
        return;
      case T2APackage.INSTANCIA_EDOM__INSFEATURES:
        getInsfeatures().clear();
        getInsfeatures().addAll((Collection<? extends InstanceEDOMFeature>)newValue);
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
      case T2APackage.INSTANCIA_EDOM__INSTANCIA:
        setInstancia((EDOM)null);
        return;
      case T2APackage.INSTANCIA_EDOM__SCLASSES:
        getSclasses().clear();
        return;
      case T2APackage.INSTANCIA_EDOM__SCLASSES_ONLINE:
        getSclassesOnline().clear();
        return;
      case T2APackage.INSTANCIA_EDOM__INSFEATURES:
        getInsfeatures().clear();
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
      case T2APackage.INSTANCIA_EDOM__INSTANCIA:
        return instancia != null;
      case T2APackage.INSTANCIA_EDOM__SCLASSES:
        return sclasses != null && !sclasses.isEmpty();
      case T2APackage.INSTANCIA_EDOM__SCLASSES_ONLINE:
        return sclassesOnline != null && !sclassesOnline.isEmpty();
      case T2APackage.INSTANCIA_EDOM__INSFEATURES:
        return insfeatures != null && !insfeatures.isEmpty();
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
    result.append(" (sclassesOnline: ");
    result.append(sclassesOnline);
    result.append(')');
    return result.toString();
  }

} //InstanciaEDOMImpl
