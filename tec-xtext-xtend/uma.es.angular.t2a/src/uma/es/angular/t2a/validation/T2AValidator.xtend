package uma.es.angular.t2a.validation

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import uma.es.angular.t2a.t2A.T2APackage
import uma.es.angular.t2a.t2A.Page
import uma.es.angular.t2a.t2A.Comp

class T2AValidator extends AbstractT2AValidator {

//	@Check
//	def checkNameUniqueness(EObject eObject) {
//		val nameFeature = getNameFeature(eObject)
//		if (nameFeature !== null) {
//			val scope = Scopes.scopeFor(eObject.eContainer().eContents())
//			val name = eObject.eGet(nameFeature) as String
//			if (scope.getSingleElement(QualifiedName.create(name)) !== null) {
//				error("Name should be unique", nameFeature)
//			}
//		}
//	}
//
//	private def EStructuralFeature getNameFeature(EObject eObject) {
//		if (eObject instanceof Page) {
//			return T2APackage.Literals.ELEMENT__NAME
//		} else if (eObject instanceof Comp) {
//			return T2APackage.Literals.ELEMENT__NAME
//		} else {
//			return null;
//		}
//	}

// Add other validation methods as needed...
}
