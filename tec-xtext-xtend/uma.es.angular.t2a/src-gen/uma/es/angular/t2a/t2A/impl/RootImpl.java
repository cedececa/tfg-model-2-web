/**
 * generated by Xtext 2.26.0
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uma.es.angular.t2a.t2A.Element;
import uma.es.angular.t2a.t2A.Root;
import uma.es.angular.t2a.t2A.StyleGlobal;
import uma.es.angular.t2a.t2A.T2APackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uma.es.angular.t2a.t2A.impl.RootImpl#getGlobalStyle <em>Global Style</em>}</li>
 *   <li>{@link uma.es.angular.t2a.t2A.impl.RootImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootImpl extends MinimalEObjectImpl.Container implements Root
{
  /**
   * The cached value of the '{@link #getGlobalStyle() <em>Global Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGlobalStyle()
   * @generated
   * @ordered
   */
  protected StyleGlobal globalStyle;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<Element> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RootImpl()
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
    return T2APackage.Literals.ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StyleGlobal getGlobalStyle()
  {
    return globalStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGlobalStyle(StyleGlobal newGlobalStyle, NotificationChain msgs)
  {
    StyleGlobal oldGlobalStyle = globalStyle;
    globalStyle = newGlobalStyle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, T2APackage.ROOT__GLOBAL_STYLE, oldGlobalStyle, newGlobalStyle);
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
  public void setGlobalStyle(StyleGlobal newGlobalStyle)
  {
    if (newGlobalStyle != globalStyle)
    {
      NotificationChain msgs = null;
      if (globalStyle != null)
        msgs = ((InternalEObject)globalStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - T2APackage.ROOT__GLOBAL_STYLE, null, msgs);
      if (newGlobalStyle != null)
        msgs = ((InternalEObject)newGlobalStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - T2APackage.ROOT__GLOBAL_STYLE, null, msgs);
      msgs = basicSetGlobalStyle(newGlobalStyle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, T2APackage.ROOT__GLOBAL_STYLE, newGlobalStyle, newGlobalStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Element> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<Element>(Element.class, this, T2APackage.ROOT__ELEMENTS);
    }
    return elements;
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
      case T2APackage.ROOT__GLOBAL_STYLE:
        return basicSetGlobalStyle(null, msgs);
      case T2APackage.ROOT__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
      case T2APackage.ROOT__GLOBAL_STYLE:
        return getGlobalStyle();
      case T2APackage.ROOT__ELEMENTS:
        return getElements();
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
      case T2APackage.ROOT__GLOBAL_STYLE:
        setGlobalStyle((StyleGlobal)newValue);
        return;
      case T2APackage.ROOT__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends Element>)newValue);
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
      case T2APackage.ROOT__GLOBAL_STYLE:
        setGlobalStyle((StyleGlobal)null);
        return;
      case T2APackage.ROOT__ELEMENTS:
        getElements().clear();
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
      case T2APackage.ROOT__GLOBAL_STYLE:
        return globalStyle != null;
      case T2APackage.ROOT__ELEMENTS:
        return elements != null && !elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RootImpl
