/**
 * generated by Xtext 2.26.0
 */
package uma.es.angular.t2a.t2A;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.es.angular.t2a.t2A.Page#getSclasses <em>Sclasses</em>}</li>
 *   <li>{@link uma.es.angular.t2a.t2A.Page#isHome <em>Home</em>}</li>
 *   <li>{@link uma.es.angular.t2a.t2A.Page#isShowInNav <em>Show In Nav</em>}</li>
 *   <li>{@link uma.es.angular.t2a.t2A.Page#getPageFeatures <em>Page Features</em>}</li>
 * </ul>
 *
 * @see uma.es.angular.t2a.t2A.T2APackage#getPage()
 * @model
 * @generated
 */
public interface Page extends Element
{
  /**
   * Returns the value of the '<em><b>Sclasses</b></em>' reference list.
   * The list contents are of type {@link uma.es.angular.t2a.t2A.StyleClass}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sclasses</em>' reference list.
   * @see uma.es.angular.t2a.t2A.T2APackage#getPage_Sclasses()
   * @model
   * @generated
   */
  EList<StyleClass> getSclasses();

  /**
   * Returns the value of the '<em><b>Home</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Home</em>' attribute.
   * @see #setHome(boolean)
   * @see uma.es.angular.t2a.t2A.T2APackage#getPage_Home()
   * @model
   * @generated
   */
  boolean isHome();

  /**
   * Sets the value of the '{@link uma.es.angular.t2a.t2A.Page#isHome <em>Home</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Home</em>' attribute.
   * @see #isHome()
   * @generated
   */
  void setHome(boolean value);

  /**
   * Returns the value of the '<em><b>Show In Nav</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Show In Nav</em>' attribute.
   * @see #setShowInNav(boolean)
   * @see uma.es.angular.t2a.t2A.T2APackage#getPage_ShowInNav()
   * @model
   * @generated
   */
  boolean isShowInNav();

  /**
   * Sets the value of the '{@link uma.es.angular.t2a.t2A.Page#isShowInNav <em>Show In Nav</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Show In Nav</em>' attribute.
   * @see #isShowInNav()
   * @generated
   */
  void setShowInNav(boolean value);

  /**
   * Returns the value of the '<em><b>Page Features</b></em>' containment reference list.
   * The list contents are of type {@link uma.es.angular.t2a.t2A.PageFeature}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Page Features</em>' containment reference list.
   * @see uma.es.angular.t2a.t2A.T2APackage#getPage_PageFeatures()
   * @model containment="true"
   * @generated
   */
  EList<PageFeature> getPageFeatures();

} // Page
