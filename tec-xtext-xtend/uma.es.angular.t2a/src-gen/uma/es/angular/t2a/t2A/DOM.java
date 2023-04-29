/**
 * generated by Xtext 2.26.0
 */
package uma.es.angular.t2a.t2A;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DOM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.es.angular.t2a.t2A.DOM#getSclasses <em>Sclasses</em>}</li>
 *   <li>{@link uma.es.angular.t2a.t2A.DOM#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see uma.es.angular.t2a.t2A.T2APackage#getDOM()
 * @model
 * @generated
 */
public interface DOM extends EDOM
{
  /**
   * Returns the value of the '<em><b>Sclasses</b></em>' reference list.
   * The list contents are of type {@link uma.es.angular.t2a.t2A.StyleClass}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sclasses</em>' reference list.
   * @see uma.es.angular.t2a.t2A.T2APackage#getDOM_Sclasses()
   * @model
   * @generated
   */
  EList<StyleClass> getSclasses();

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link uma.es.angular.t2a.t2A.Feature}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see uma.es.angular.t2a.t2A.T2APackage#getDOM_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

} // DOM
