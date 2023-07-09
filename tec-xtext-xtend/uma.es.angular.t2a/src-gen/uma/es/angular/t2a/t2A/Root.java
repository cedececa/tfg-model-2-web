/**
 * generated by Xtext 2.31.0
 */
package uma.es.angular.t2a.t2A;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.es.angular.t2a.t2A.Root#getAppName <em>App Name</em>}</li>
 *   <li>{@link uma.es.angular.t2a.t2A.Root#getGlobalStyle <em>Global Style</em>}</li>
 *   <li>{@link uma.es.angular.t2a.t2A.Root#getStyleOnline <em>Style Online</em>}</li>
 *   <li>{@link uma.es.angular.t2a.t2A.Root#getJsOnline <em>Js Online</em>}</li>
 *   <li>{@link uma.es.angular.t2a.t2A.Root#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see uma.es.angular.t2a.t2A.T2APackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject
{
  /**
   * Returns the value of the '<em><b>App Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>App Name</em>' attribute.
   * @see #setAppName(String)
   * @see uma.es.angular.t2a.t2A.T2APackage#getRoot_AppName()
   * @model
   * @generated
   */
  String getAppName();

  /**
   * Sets the value of the '{@link uma.es.angular.t2a.t2A.Root#getAppName <em>App Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>App Name</em>' attribute.
   * @see #getAppName()
   * @generated
   */
  void setAppName(String value);

  /**
   * Returns the value of the '<em><b>Global Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Global Style</em>' containment reference.
   * @see #setGlobalStyle(StyleGlobal)
   * @see uma.es.angular.t2a.t2A.T2APackage#getRoot_GlobalStyle()
   * @model containment="true"
   * @generated
   */
  StyleGlobal getGlobalStyle();

  /**
   * Sets the value of the '{@link uma.es.angular.t2a.t2A.Root#getGlobalStyle <em>Global Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Global Style</em>' containment reference.
   * @see #getGlobalStyle()
   * @generated
   */
  void setGlobalStyle(StyleGlobal value);

  /**
   * Returns the value of the '<em><b>Style Online</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style Online</em>' containment reference.
   * @see #setStyleOnline(StyleOnline)
   * @see uma.es.angular.t2a.t2A.T2APackage#getRoot_StyleOnline()
   * @model containment="true"
   * @generated
   */
  StyleOnline getStyleOnline();

  /**
   * Sets the value of the '{@link uma.es.angular.t2a.t2A.Root#getStyleOnline <em>Style Online</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style Online</em>' containment reference.
   * @see #getStyleOnline()
   * @generated
   */
  void setStyleOnline(StyleOnline value);

  /**
   * Returns the value of the '<em><b>Js Online</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Js Online</em>' containment reference.
   * @see #setJsOnline(JSOnline)
   * @see uma.es.angular.t2a.t2A.T2APackage#getRoot_JsOnline()
   * @model containment="true"
   * @generated
   */
  JSOnline getJsOnline();

  /**
   * Sets the value of the '{@link uma.es.angular.t2a.t2A.Root#getJsOnline <em>Js Online</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Js Online</em>' containment reference.
   * @see #getJsOnline()
   * @generated
   */
  void setJsOnline(JSOnline value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link uma.es.angular.t2a.t2A.Element}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see uma.es.angular.t2a.t2A.T2APackage#getRoot_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Element> getElements();

} // Root
