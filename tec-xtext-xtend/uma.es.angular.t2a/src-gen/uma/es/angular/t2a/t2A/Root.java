/**
 * generated by Xtext 2.26.0
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
