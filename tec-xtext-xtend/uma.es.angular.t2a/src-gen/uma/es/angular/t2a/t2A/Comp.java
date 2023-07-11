/**
 * generated by Xtext 2.31.0
 */
package uma.es.angular.t2a.t2A;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uma.es.angular.t2a.t2A.Comp#getHostclasses <em>Hostclasses</em>}</li>
 *   <li>{@link uma.es.angular.t2a.t2A.Comp#getSclassesOnline <em>Sclasses Online</em>}</li>
 *   <li>{@link uma.es.angular.t2a.t2A.Comp#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see uma.es.angular.t2a.t2A.T2APackage#getComp()
 * @model
 * @generated
 */
public interface Comp extends EDOM
{
  /**
   * Returns the value of the '<em><b>Hostclasses</b></em>' reference list.
   * The list contents are of type {@link uma.es.angular.t2a.t2A.StyleClass}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hostclasses</em>' reference list.
   * @see uma.es.angular.t2a.t2A.T2APackage#getComp_Hostclasses()
   * @model
   * @generated
   */
  EList<StyleClass> getHostclasses();

  /**
   * Returns the value of the '<em><b>Sclasses Online</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sclasses Online</em>' attribute list.
   * @see uma.es.angular.t2a.t2A.T2APackage#getComp_SclassesOnline()
   * @model unique="false"
   * @generated
   */
  EList<String> getSclassesOnline();

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link uma.es.angular.t2a.t2A.Feature}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see uma.es.angular.t2a.t2A.T2APackage#getComp_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

} // Comp
