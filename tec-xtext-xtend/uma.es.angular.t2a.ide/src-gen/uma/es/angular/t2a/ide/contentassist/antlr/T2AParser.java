/*
 * generated by Xtext 2.31.0
 */
package uma.es.angular.t2a.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import uma.es.angular.t2a.ide.contentassist.antlr.internal.InternalT2AParser;
import uma.es.angular.t2a.services.T2AGrammarAccess;

public class T2AParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(T2AGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, T2AGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
			builder.put(grammarAccess.getEDOMAccess().getAlternatives(), "rule__EDOM__Alternatives");
			builder.put(grammarAccess.getInstanceEDOMFeatureAccess().getAlternatives(), "rule__InstanceEDOMFeature__Alternatives");
			builder.put(grammarAccess.getPageFeatureAccess().getAlternatives(), "rule__PageFeature__Alternatives");
			builder.put(grammarAccess.getFeatureAccess().getAlternatives(), "rule__Feature__Alternatives");
			builder.put(grammarAccess.getNameAccess().getAlternatives(), "rule__Name__Alternatives");
			builder.put(grammarAccess.getRootAccess().getGroup(), "rule__Root__Group__0");
			builder.put(grammarAccess.getPageAccess().getGroup(), "rule__Page__Group__0");
			builder.put(grammarAccess.getPageAccess().getGroup_3(), "rule__Page__Group_3__0");
			builder.put(grammarAccess.getStyleGlobalAccess().getGroup(), "rule__StyleGlobal__Group__0");
			builder.put(grammarAccess.getStyleOnlineAccess().getGroup(), "rule__StyleOnline__Group__0");
			builder.put(grammarAccess.getJSOnlineAccess().getGroup(), "rule__JSOnline__Group__0");
			builder.put(grammarAccess.getStyleClassAccess().getGroup(), "rule__StyleClass__Group__0");
			builder.put(grammarAccess.getStyleClassAccess().getGroup_3(), "rule__StyleClass__Group_3__0");
			builder.put(grammarAccess.getStyleClassAccess().getGroup_4(), "rule__StyleClass__Group_4__0");
			builder.put(grammarAccess.getStyleClassAccess().getGroup_4_2(), "rule__StyleClass__Group_4_2__0");
			builder.put(grammarAccess.getStyleClassAccess().getGroup_5(), "rule__StyleClass__Group_5__0");
			builder.put(grammarAccess.getStyleClassAccess().getGroup_5_2(), "rule__StyleClass__Group_5_2__0");
			builder.put(grammarAccess.getSAttributeAndValueAccess().getGroup(), "rule__SAttributeAndValue__Group__0");
			builder.put(grammarAccess.getDOMAccess().getGroup(), "rule__DOM__Group__0");
			builder.put(grammarAccess.getDOMAccess().getGroup_2(), "rule__DOM__Group_2__0");
			builder.put(grammarAccess.getDOMAccess().getGroup_2_1(), "rule__DOM__Group_2_1__0");
			builder.put(grammarAccess.getDOMAccess().getGroup_2_2(), "rule__DOM__Group_2_2__0");
			builder.put(grammarAccess.getCompAccess().getGroup(), "rule__Comp__Group__0");
			builder.put(grammarAccess.getCompAccess().getGroup_2(), "rule__Comp__Group_2__0");
			builder.put(grammarAccess.getCompAccess().getGroup_2_1(), "rule__Comp__Group_2_1__0");
			builder.put(grammarAccess.getCompAccess().getGroup_2_2(), "rule__Comp__Group_2_2__0");
			builder.put(grammarAccess.getGoToAccess().getGroup(), "rule__GoTo__Group__0");
			builder.put(grammarAccess.getInstanciaEDOMAccess().getGroup(), "rule__InstanciaEDOM__Group__0");
			builder.put(grammarAccess.getInstanciaEDOMAccess().getGroup_1(), "rule__InstanciaEDOM__Group_1__0");
			builder.put(grammarAccess.getInstanciaEDOMAccess().getGroup_1_1(), "rule__InstanciaEDOM__Group_1_1__0");
			builder.put(grammarAccess.getInstanciaEDOMAccess().getGroup_1_2(), "rule__InstanciaEDOM__Group_1_2__0");
			builder.put(grammarAccess.getInstanciaEDOMAccess().getGroup_1_3(), "rule__InstanciaEDOM__Group_1_3__0");
			builder.put(grammarAccess.getRootAccess().getAppNameAssignment_1(), "rule__Root__AppNameAssignment_1");
			builder.put(grammarAccess.getRootAccess().getGlobalStyleAssignment_2(), "rule__Root__GlobalStyleAssignment_2");
			builder.put(grammarAccess.getRootAccess().getStyleOnlineAssignment_3(), "rule__Root__StyleOnlineAssignment_3");
			builder.put(grammarAccess.getRootAccess().getJsOnlineAssignment_4(), "rule__Root__JsOnlineAssignment_4");
			builder.put(grammarAccess.getRootAccess().getElementsAssignment_5(), "rule__Root__ElementsAssignment_5");
			builder.put(grammarAccess.getPageAccess().getNameAssignment_1(), "rule__Page__NameAssignment_1");
			builder.put(grammarAccess.getPageAccess().getHostclassesAssignment_3_2(), "rule__Page__HostclassesAssignment_3_2");
			builder.put(grammarAccess.getPageAccess().getHomeAssignment_4(), "rule__Page__HomeAssignment_4");
			builder.put(grammarAccess.getPageAccess().getShowInNavAssignment_5(), "rule__Page__ShowInNavAssignment_5");
			builder.put(grammarAccess.getPageAccess().getPageFeaturesAssignment_6(), "rule__Page__PageFeaturesAssignment_6");
			builder.put(grammarAccess.getStyleGlobalAccess().getStyleclassesAssignment_3(), "rule__StyleGlobal__StyleclassesAssignment_3");
			builder.put(grammarAccess.getStyleOnlineAccess().getFullTagsAssignment_3(), "rule__StyleOnline__FullTagsAssignment_3");
			builder.put(grammarAccess.getJSOnlineAccess().getFullTagsAssignment_3(), "rule__JSOnline__FullTagsAssignment_3");
			builder.put(grammarAccess.getStyleClassAccess().getNameAssignment_1(), "rule__StyleClass__NameAssignment_1");
			builder.put(grammarAccess.getStyleClassAccess().getSattributesAssignment_3_0(), "rule__StyleClass__SattributesAssignment_3_0");
			builder.put(grammarAccess.getStyleClassAccess().getSattributesAfterAssignment_4_2_0(), "rule__StyleClass__SattributesAfterAssignment_4_2_0");
			builder.put(grammarAccess.getStyleClassAccess().getSattributesActiveAssignment_5_2_0(), "rule__StyleClass__SattributesActiveAssignment_5_2_0");
			builder.put(grammarAccess.getSAttributeAndValueAccess().getStnameAssignment_0(), "rule__SAttributeAndValue__StnameAssignment_0");
			builder.put(grammarAccess.getSAttributeAndValueAccess().getValueAssignment_1(), "rule__SAttributeAndValue__ValueAssignment_1");
			builder.put(grammarAccess.getDOMAccess().getNameAssignment_1(), "rule__DOM__NameAssignment_1");
			builder.put(grammarAccess.getDOMAccess().getSclassesAssignment_2_1_2(), "rule__DOM__SclassesAssignment_2_1_2");
			builder.put(grammarAccess.getDOMAccess().getSclassesOnlineAssignment_2_2_2(), "rule__DOM__SclassesOnlineAssignment_2_2_2");
			builder.put(grammarAccess.getDOMAccess().getFeaturesAssignment_2_3(), "rule__DOM__FeaturesAssignment_2_3");
			builder.put(grammarAccess.getCompAccess().getNameAssignment_1(), "rule__Comp__NameAssignment_1");
			builder.put(grammarAccess.getCompAccess().getHostclassesAssignment_2_1_2(), "rule__Comp__HostclassesAssignment_2_1_2");
			builder.put(grammarAccess.getCompAccess().getSclassesOnlineAssignment_2_2_2(), "rule__Comp__SclassesOnlineAssignment_2_2_2");
			builder.put(grammarAccess.getCompAccess().getFeaturesAssignment_2_3(), "rule__Comp__FeaturesAssignment_2_3");
			builder.put(grammarAccess.getGoToAccess().getPageAssignment_3(), "rule__GoTo__PageAssignment_3");
			builder.put(grammarAccess.getInstanciaEDOMAccess().getInstanciaAssignment_0(), "rule__InstanciaEDOM__InstanciaAssignment_0");
			builder.put(grammarAccess.getInstanciaEDOMAccess().getSclassesAssignment_1_1_2(), "rule__InstanciaEDOM__SclassesAssignment_1_1_2");
			builder.put(grammarAccess.getInstanciaEDOMAccess().getSclassesOnlineAssignment_1_2_2(), "rule__InstanciaEDOM__SclassesOnlineAssignment_1_2_2");
			builder.put(grammarAccess.getInstanciaEDOMAccess().getGoToAssignment_1_3_1(), "rule__InstanciaEDOM__GoToAssignment_1_3_1");
			builder.put(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesAssignment_1_4(), "rule__InstanciaEDOM__InsfeaturesAssignment_1_4");
			builder.put(grammarAccess.getInstanceEDOMFeatureAccess().getInstanciaEDOMAssignment_0(), "rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0");
			builder.put(grammarAccess.getInstanceEDOMFeatureAccess().getStringAssignment_1(), "rule__InstanceEDOMFeature__StringAssignment_1");
			builder.put(grammarAccess.getPageFeatureAccess().getInstanciaEDOMAssignment_0(), "rule__PageFeature__InstanciaEDOMAssignment_0");
			builder.put(grammarAccess.getPageFeatureAccess().getStringAssignment_1(), "rule__PageFeature__StringAssignment_1");
			builder.put(grammarAccess.getFeatureAccess().getInstanciaEDOMAssignment_0(), "rule__Feature__InstanciaEDOMAssignment_0");
			builder.put(grammarAccess.getFeatureAccess().getAllowSlotAssignment_1(), "rule__Feature__AllowSlotAssignment_1");
			builder.put(grammarAccess.getFeatureAccess().getStringAssignment_2(), "rule__Feature__StringAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private T2AGrammarAccess grammarAccess;

	@Override
	protected InternalT2AParser createParser() {
		InternalT2AParser result = new InternalT2AParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public T2AGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(T2AGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
