/**
 * generated by Xtext 2.31.0
 */
package uma.es.angular.t2a.t2A;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance EDOM Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.es.angular.t2a.t2A.InstanceEDOMFeature#getInstanciaEDOM <em>Instancia EDOM</em>}</li>
 *   <li>{@link uma.es.angular.t2a.t2A.InstanceEDOMFeature#getString <em>String</em>}</li>
 * </ul>
 *
 * @see uma.es.angular.t2a.t2A.T2APackage#getInstanceEDOMFeature()
 * @model
 * @generated
 */
public interface InstanceEDOMFeature extends EObject
{
  /**
   * Returns the value of the '<em><b>Instancia EDOM</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instancia EDOM</em>' containment reference.
   * @see #setInstanciaEDOM(InstanciaEDOM)
   * @see uma.es.angular.t2a.t2A.T2APackage#getInstanceEDOMFeature_InstanciaEDOM()
   * @model containment="true"
   * @generated
   */
  InstanciaEDOM getInstanciaEDOM();

  /**
   * Sets the value of the '{@link uma.es.angular.t2a.t2A.InstanceEDOMFeature#getInstanciaEDOM <em>Instancia EDOM</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instancia EDOM</em>' containment reference.
   * @see #getInstanciaEDOM()
   * @generated
   */
  void setInstanciaEDOM(InstanciaEDOM value);

  /**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(String)
   * @see uma.es.angular.t2a.t2A.T2APackage#getInstanceEDOMFeature_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link uma.es.angular.t2a.t2A.InstanceEDOMFeature#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

} // InstanceEDOMFeature
