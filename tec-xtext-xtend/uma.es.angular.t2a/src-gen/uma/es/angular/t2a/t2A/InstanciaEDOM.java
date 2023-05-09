/**
 * generated by Xtext 2.26.0
 */
package uma.es.angular.t2a.t2A;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instancia EDOM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.es.angular.t2a.t2A.InstanciaEDOM#getInstancia <em>Instancia</em>}</li>
 *   <li>{@link uma.es.angular.t2a.t2A.InstanciaEDOM#getSclasses <em>Sclasses</em>}</li>
 *   <li>{@link uma.es.angular.t2a.t2A.InstanciaEDOM#getSclassesOnline <em>Sclasses Online</em>}</li>
 *   <li>{@link uma.es.angular.t2a.t2A.InstanciaEDOM#getInsfeatures <em>Insfeatures</em>}</li>
 * </ul>
 *
 * @see uma.es.angular.t2a.t2A.T2APackage#getInstanciaEDOM()
 * @model
 * @generated
 */
public interface InstanciaEDOM extends EObject
{
  /**
   * Returns the value of the '<em><b>Instancia</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instancia</em>' reference.
   * @see #setInstancia(EDOM)
   * @see uma.es.angular.t2a.t2A.T2APackage#getInstanciaEDOM_Instancia()
   * @model
   * @generated
   */
  EDOM getInstancia();

  /**
   * Sets the value of the '{@link uma.es.angular.t2a.t2A.InstanciaEDOM#getInstancia <em>Instancia</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instancia</em>' reference.
   * @see #getInstancia()
   * @generated
   */
  void setInstancia(EDOM value);

  /**
   * Returns the value of the '<em><b>Sclasses</b></em>' reference list.
   * The list contents are of type {@link uma.es.angular.t2a.t2A.StyleClass}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sclasses</em>' reference list.
   * @see uma.es.angular.t2a.t2A.T2APackage#getInstanciaEDOM_Sclasses()
   * @model
   * @generated
   */
  EList<StyleClass> getSclasses();

  /**
   * Returns the value of the '<em><b>Sclasses Online</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sclasses Online</em>' attribute list.
   * @see uma.es.angular.t2a.t2A.T2APackage#getInstanciaEDOM_SclassesOnline()
   * @model unique="false"
   * @generated
   */
  EList<String> getSclassesOnline();

  /**
   * Returns the value of the '<em><b>Insfeatures</b></em>' containment reference list.
   * The list contents are of type {@link uma.es.angular.t2a.t2A.InstanceEDOMFeature}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Insfeatures</em>' containment reference list.
   * @see uma.es.angular.t2a.t2A.T2APackage#getInstanciaEDOM_Insfeatures()
   * @model containment="true"
   * @generated
   */
  EList<InstanceEDOMFeature> getInsfeatures();

} // InstanciaEDOM
