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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uma.es.angular.t2a.t2A.Page;
import uma.es.angular.t2a.t2A.PageFeature;
import uma.es.angular.t2a.t2A.StyleClass;
import uma.es.angular.t2a.t2A.T2APackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uma.es.angular.t2a.t2A.impl.PageImpl#getHostclasses <em>Hostclasses</em>}</li>
 *   <li>{@link uma.es.angular.t2a.t2A.impl.PageImpl#isHome <em>Home</em>}</li>
 *   <li>{@link uma.es.angular.t2a.t2A.impl.PageImpl#isShowInNav <em>Show In Nav</em>}</li>
 *   <li>{@link uma.es.angular.t2a.t2A.impl.PageImpl#getPageFeatures <em>Page Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends ElementImpl implements Page
{
  /**
   * The cached value of the '{@link #getHostclasses() <em>Hostclasses</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHostclasses()
   * @generated
   * @ordered
   */
  protected EList<StyleClass> hostclasses;

  /**
   * The default value of the '{@link #isHome() <em>Home</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHome()
   * @generated
   * @ordered
   */
  protected static final boolean HOME_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHome() <em>Home</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHome()
   * @generated
   * @ordered
   */
  protected boolean home = HOME_EDEFAULT;

  /**
   * The default value of the '{@link #isShowInNav() <em>Show In Nav</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShowInNav()
   * @generated
   * @ordered
   */
  protected static final boolean SHOW_IN_NAV_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isShowInNav() <em>Show In Nav</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShowInNav()
   * @generated
   * @ordered
   */
  protected boolean showInNav = SHOW_IN_NAV_EDEFAULT;

  /**
   * The cached value of the '{@link #getPageFeatures() <em>Page Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPageFeatures()
   * @generated
   * @ordered
   */
  protected EList<PageFeature> pageFeatures;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PageImpl()
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
    return T2APackage.Literals.PAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<StyleClass> getHostclasses()
  {
    if (hostclasses == null)
    {
      hostclasses = new EObjectResolvingEList<StyleClass>(StyleClass.class, this, T2APackage.PAGE__HOSTCLASSES);
    }
    return hostclasses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isHome()
  {
    return home;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHome(boolean newHome)
  {
    boolean oldHome = home;
    home = newHome;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, T2APackage.PAGE__HOME, oldHome, home));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isShowInNav()
  {
    return showInNav;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setShowInNav(boolean newShowInNav)
  {
    boolean oldShowInNav = showInNav;
    showInNav = newShowInNav;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, T2APackage.PAGE__SHOW_IN_NAV, oldShowInNav, showInNav));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PageFeature> getPageFeatures()
  {
    if (pageFeatures == null)
    {
      pageFeatures = new EObjectContainmentEList<PageFeature>(PageFeature.class, this, T2APackage.PAGE__PAGE_FEATURES);
    }
    return pageFeatures;
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
      case T2APackage.PAGE__PAGE_FEATURES:
        return ((InternalEList<?>)getPageFeatures()).basicRemove(otherEnd, msgs);
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
      case T2APackage.PAGE__HOSTCLASSES:
        return getHostclasses();
      case T2APackage.PAGE__HOME:
        return isHome();
      case T2APackage.PAGE__SHOW_IN_NAV:
        return isShowInNav();
      case T2APackage.PAGE__PAGE_FEATURES:
        return getPageFeatures();
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
      case T2APackage.PAGE__HOSTCLASSES:
        getHostclasses().clear();
        getHostclasses().addAll((Collection<? extends StyleClass>)newValue);
        return;
      case T2APackage.PAGE__HOME:
        setHome((Boolean)newValue);
        return;
      case T2APackage.PAGE__SHOW_IN_NAV:
        setShowInNav((Boolean)newValue);
        return;
      case T2APackage.PAGE__PAGE_FEATURES:
        getPageFeatures().clear();
        getPageFeatures().addAll((Collection<? extends PageFeature>)newValue);
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
      case T2APackage.PAGE__HOSTCLASSES:
        getHostclasses().clear();
        return;
      case T2APackage.PAGE__HOME:
        setHome(HOME_EDEFAULT);
        return;
      case T2APackage.PAGE__SHOW_IN_NAV:
        setShowInNav(SHOW_IN_NAV_EDEFAULT);
        return;
      case T2APackage.PAGE__PAGE_FEATURES:
        getPageFeatures().clear();
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
      case T2APackage.PAGE__HOSTCLASSES:
        return hostclasses != null && !hostclasses.isEmpty();
      case T2APackage.PAGE__HOME:
        return home != HOME_EDEFAULT;
      case T2APackage.PAGE__SHOW_IN_NAV:
        return showInNav != SHOW_IN_NAV_EDEFAULT;
      case T2APackage.PAGE__PAGE_FEATURES:
        return pageFeatures != null && !pageFeatures.isEmpty();
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
    result.append(" (home: ");
    result.append(home);
    result.append(", showInNav: ");
    result.append(showInNav);
    result.append(')');
    return result.toString();
  }

} //PageImpl
