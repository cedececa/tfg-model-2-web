/*
 * generated by Xtext 2.26.0
 */
package uma.es.angular.t2a.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import uma.es.angular.t2a.services.T2AGrammarAccess;
import uma.es.angular.t2a.t2A.Comp;
import uma.es.angular.t2a.t2A.DOM;
import uma.es.angular.t2a.t2A.Feature;
import uma.es.angular.t2a.t2A.InstanceEDOMFeature;
import uma.es.angular.t2a.t2A.InstanciaEDOM;
import uma.es.angular.t2a.t2A.Page;
import uma.es.angular.t2a.t2A.PageFeature;
import uma.es.angular.t2a.t2A.Root;
import uma.es.angular.t2a.t2A.T2APackage;

@SuppressWarnings("all")
public class T2ASemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private T2AGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == T2APackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case T2APackage.COMP:
				sequence_Comp(context, (Comp) semanticObject); 
				return; 
			case T2APackage.DOM:
				sequence_DOM(context, (DOM) semanticObject); 
				return; 
			case T2APackage.FEATURE:
				sequence_Feature(context, (Feature) semanticObject); 
				return; 
			case T2APackage.INSTANCE_EDOM_FEATURE:
				sequence_InstanceEDOMFeature(context, (InstanceEDOMFeature) semanticObject); 
				return; 
			case T2APackage.INSTANCIA_EDOM:
				sequence_InstanciaEDOM(context, (InstanciaEDOM) semanticObject); 
				return; 
			case T2APackage.PAGE:
				sequence_Page(context, (Page) semanticObject); 
				return; 
			case T2APackage.PAGE_FEATURE:
				sequence_PageFeature(context, (PageFeature) semanticObject); 
				return; 
			case T2APackage.ROOT:
				sequence_Root(context, (Root) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Element returns Comp
	 *     EDOM returns Comp
	 *     Comp returns Comp
	 *
	 * Constraint:
	 *     (name=ID features+=Feature*)
	 * </pre>
	 */
	protected void sequence_Comp(ISerializationContext context, Comp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Element returns DOM
	 *     EDOM returns DOM
	 *     DOM returns DOM
	 *
	 * Constraint:
	 *     (name=ID features+=Feature*)
	 * </pre>
	 */
	protected void sequence_DOM(ISerializationContext context, DOM semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Feature returns Feature
	 *
	 * Constraint:
	 *     (instanciaEDOM=InstanciaEDOM | AllowSlot?='AllowSlot' | string=STRING)
	 * </pre>
	 */
	protected void sequence_Feature(ISerializationContext context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     InstanceEDOMFeature returns InstanceEDOMFeature
	 *
	 * Constraint:
	 *     (instanciaEDOM=InstanciaEDOM | string=STRING)
	 * </pre>
	 */
	protected void sequence_InstanceEDOMFeature(ISerializationContext context, InstanceEDOMFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     InstanciaEDOM returns InstanciaEDOM
	 *
	 * Constraint:
	 *     (instancia=[EDOM|ID] insfeatures+=InstanceEDOMFeature*)
	 * </pre>
	 */
	protected void sequence_InstanciaEDOM(ISerializationContext context, InstanciaEDOM semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PageFeature returns PageFeature
	 *
	 * Constraint:
	 *     (instanciaEDOM=InstanciaEDOM | string=STRING)
	 * </pre>
	 */
	protected void sequence_PageFeature(ISerializationContext context, PageFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Element returns Page
	 *     Page returns Page
	 *
	 * Constraint:
	 *     (name=ID pageFeatures+=PageFeature*)
	 * </pre>
	 */
	protected void sequence_Page(ISerializationContext context, Page semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Root returns Root
	 *
	 * Constraint:
	 *     elements+=Element+
	 * </pre>
	 */
	protected void sequence_Root(ISerializationContext context, Root semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
