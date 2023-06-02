/*
 * generated by Xtext 2.26.0
 */
grammar InternalT2A;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package uma.es.angular.t2a.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package uma.es.angular.t2a.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uma.es.angular.t2a.services.T2AGrammarAccess;

}

@parser::members {

 	private T2AGrammarAccess grammarAccess;

    public InternalT2AParser(TokenStream input, T2AGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Root";
   	}

   	@Override
   	protected T2AGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRoot
entryRuleRoot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRootRule()); }
	iv_ruleRoot=ruleRoot
	{ $current=$iv_ruleRoot.current; }
	EOF;

// Rule Root
ruleRoot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='AppName:'
		{
			newLeafNode(otherlv_0, grammarAccess.getRootAccess().getAppNameKeyword_0());
		}
		(
			(
				lv_appName_1_0=RULE_STRING
				{
					newLeafNode(lv_appName_1_0, grammarAccess.getRootAccess().getAppNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRootRule());
					}
					setWithLastConsumed(
						$current,
						"appName",
						lv_appName_1_0,
						"uma.es.angular.t2a.T2A.STRING");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRootAccess().getGlobalStyleStyleGlobalParserRuleCall_2_0());
				}
				lv_globalStyle_2_0=ruleStyleGlobal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRootRule());
					}
					set(
						$current,
						"globalStyle",
						lv_globalStyle_2_0,
						"uma.es.angular.t2a.T2A.StyleGlobal");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getRootAccess().getStyleOnlineStyleOnlineParserRuleCall_3_0());
				}
				lv_styleOnline_3_0=ruleStyleOnline
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRootRule());
					}
					set(
						$current,
						"styleOnline",
						lv_styleOnline_3_0,
						"uma.es.angular.t2a.T2A.StyleOnline");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getRootAccess().getJsOnlineJSOnlineParserRuleCall_4_0());
				}
				lv_jsOnline_4_0=ruleJSOnline
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRootRule());
					}
					set(
						$current,
						"jsOnline",
						lv_jsOnline_4_0,
						"uma.es.angular.t2a.T2A.JSOnline");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getRootAccess().getElementsElementParserRuleCall_5_0());
				}
				lv_elements_5_0=ruleElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRootRule());
					}
					add(
						$current,
						"elements",
						lv_elements_5_0,
						"uma.es.angular.t2a.T2A.Element");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleElement
entryRuleElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementRule()); }
	iv_ruleElement=ruleElement
	{ $current=$iv_ruleElement.current; }
	EOF;

// Rule Element
ruleElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getElementAccess().getPageParserRuleCall_0());
		}
		this_Page_0=rulePage
		{
			$current = $this_Page_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementAccess().getEDOMParserRuleCall_1());
		}
		this_EDOM_1=ruleEDOM
		{
			$current = $this_EDOM_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePage
entryRulePage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPageRule()); }
	iv_rulePage=rulePage
	{ $current=$iv_rulePage.current; }
	EOF;

// Rule Page
rulePage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Page'
		{
			newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPageRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='sclass'
			{
				newLeafNode(otherlv_3, grammarAccess.getPageAccess().getSclassKeyword_3_0());
			}
			otherlv_4='{'
			{
				newLeafNode(otherlv_4, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPageRule());
						}
					}
					otherlv_5=RULE_ID
					{
						newLeafNode(otherlv_5, grammarAccess.getPageAccess().getHostclassesStyleClassCrossReference_3_2_0());
					}
				)
			)*
			otherlv_6='}'
			{
				newLeafNode(otherlv_6, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_3_3());
			}
		)?
		(
			(
				lv_home_7_0='home'
				{
					newLeafNode(lv_home_7_0, grammarAccess.getPageAccess().getHomeHomeKeyword_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPageRule());
					}
					setWithLastConsumed($current, "home", lv_home_7_0 != null, "home");
				}
			)
		)?
		(
			(
				lv_showInNav_8_0='showInNav'
				{
					newLeafNode(lv_showInNav_8_0, grammarAccess.getPageAccess().getShowInNavShowInNavKeyword_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPageRule());
					}
					setWithLastConsumed($current, "showInNav", lv_showInNav_8_0 != null, "showInNav");
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getPageAccess().getPageFeaturesPageFeatureParserRuleCall_6_0());
				}
				lv_pageFeatures_9_0=rulePageFeature
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPageRule());
					}
					add(
						$current,
						"pageFeatures",
						lv_pageFeatures_9_0,
						"uma.es.angular.t2a.T2A.PageFeature");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleEDOM
entryRuleEDOM returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEDOMRule()); }
	iv_ruleEDOM=ruleEDOM
	{ $current=$iv_ruleEDOM.current; }
	EOF;

// Rule EDOM
ruleEDOM returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEDOMAccess().getDOMParserRuleCall_0());
		}
		this_DOM_0=ruleDOM
		{
			$current = $this_DOM_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEDOMAccess().getCompParserRuleCall_1());
		}
		this_Comp_1=ruleComp
		{
			$current = $this_Comp_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEDOMAccess().getStyleClassParserRuleCall_2());
		}
		this_StyleClass_2=ruleStyleClass
		{
			$current = $this_StyleClass_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleStyleGlobal
entryRuleStyleGlobal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStyleGlobalRule()); }
	iv_ruleStyleGlobal=ruleStyleGlobal
	{ $current=$iv_ruleStyleGlobal.current; }
	EOF;

// Rule StyleGlobal
ruleStyleGlobal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStyleGlobalAccess().getStyleGlobalAction_0(),
					$current);
			}
		)
		otherlv_1='StyleGlobal'
		{
			newLeafNode(otherlv_1, grammarAccess.getStyleGlobalAccess().getStyleGlobalKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getStyleGlobalAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStyleGlobalAccess().getStyleclassesStyleClassParserRuleCall_3_0());
				}
				lv_styleclasses_3_0=ruleStyleClass
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStyleGlobalRule());
					}
					add(
						$current,
						"styleclasses",
						lv_styleclasses_3_0,
						"uma.es.angular.t2a.T2A.StyleClass");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getStyleGlobalAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleStyleOnline
entryRuleStyleOnline returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStyleOnlineRule()); }
	iv_ruleStyleOnline=ruleStyleOnline
	{ $current=$iv_ruleStyleOnline.current; }
	EOF;

// Rule StyleOnline
ruleStyleOnline returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStyleOnlineAccess().getStyleOnlineAction_0(),
					$current);
			}
		)
		otherlv_1='StyleOnline'
		{
			newLeafNode(otherlv_1, grammarAccess.getStyleOnlineAccess().getStyleOnlineKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getStyleOnlineAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				lv_fullTags_3_0=RULE_STRING
				{
					newLeafNode(lv_fullTags_3_0, grammarAccess.getStyleOnlineAccess().getFullTagsSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStyleOnlineRule());
					}
					addWithLastConsumed(
						$current,
						"fullTags",
						lv_fullTags_3_0,
						"uma.es.angular.t2a.T2A.STRING");
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getStyleOnlineAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleJSOnline
entryRuleJSOnline returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJSOnlineRule()); }
	iv_ruleJSOnline=ruleJSOnline
	{ $current=$iv_ruleJSOnline.current; }
	EOF;

// Rule JSOnline
ruleJSOnline returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getJSOnlineAccess().getJSOnlineAction_0(),
					$current);
			}
		)
		otherlv_1='JSOnline'
		{
			newLeafNode(otherlv_1, grammarAccess.getJSOnlineAccess().getJSOnlineKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getJSOnlineAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				lv_fullTags_3_0=RULE_STRING
				{
					newLeafNode(lv_fullTags_3_0, grammarAccess.getJSOnlineAccess().getFullTagsSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJSOnlineRule());
					}
					addWithLastConsumed(
						$current,
						"fullTags",
						lv_fullTags_3_0,
						"uma.es.angular.t2a.T2A.STRING");
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getJSOnlineAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleStyleClass
entryRuleStyleClass returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStyleClassRule()); }
	iv_ruleStyleClass=ruleStyleClass
	{ $current=$iv_ruleStyleClass.current; }
	EOF;

// Rule StyleClass
ruleStyleClass returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='StyleClass'
		{
			newLeafNode(otherlv_0, grammarAccess.getStyleClassAccess().getStyleClassKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStyleClassAccess().getNameNameParserRuleCall_1_0());
				}
				lv_name_1_0=ruleName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStyleClassRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"uma.es.angular.t2a.T2A.Name");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getStyleClassAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getStyleClassAccess().getSattributesSAttributeAndValueParserRuleCall_3_0_0());
					}
					lv_sattributes_3_0=ruleSAttributeAndValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStyleClassRule());
						}
						add(
							$current,
							"sattributes",
							lv_sattributes_3_0,
							"uma.es.angular.t2a.T2A.SAttributeAndValue");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_4=';'
			{
				newLeafNode(otherlv_4, grammarAccess.getStyleClassAccess().getSemicolonKeyword_3_1());
			}
		)*
		(
			otherlv_5='after'
			{
				newLeafNode(otherlv_5, grammarAccess.getStyleClassAccess().getAfterKeyword_4_0());
			}
			otherlv_6='{'
			{
				newLeafNode(otherlv_6, grammarAccess.getStyleClassAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getStyleClassAccess().getSattributesAfterSAttributeAndValueParserRuleCall_4_2_0_0());
						}
						lv_sattributesAfter_7_0=ruleSAttributeAndValue
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStyleClassRule());
							}
							add(
								$current,
								"sattributesAfter",
								lv_sattributesAfter_7_0,
								"uma.es.angular.t2a.T2A.SAttributeAndValue");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_8=';'
				{
					newLeafNode(otherlv_8, grammarAccess.getStyleClassAccess().getSemicolonKeyword_4_2_1());
				}
			)*
			otherlv_9='}'
			{
				newLeafNode(otherlv_9, grammarAccess.getStyleClassAccess().getRightCurlyBracketKeyword_4_3());
			}
		)?
		(
			otherlv_10='active'
			{
				newLeafNode(otherlv_10, grammarAccess.getStyleClassAccess().getActiveKeyword_5_0());
			}
			otherlv_11='{'
			{
				newLeafNode(otherlv_11, grammarAccess.getStyleClassAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getStyleClassAccess().getSattributesActiveSAttributeAndValueParserRuleCall_5_2_0_0());
						}
						lv_sattributesActive_12_0=ruleSAttributeAndValue
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStyleClassRule());
							}
							add(
								$current,
								"sattributesActive",
								lv_sattributesActive_12_0,
								"uma.es.angular.t2a.T2A.SAttributeAndValue");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_13=';'
				{
					newLeafNode(otherlv_13, grammarAccess.getStyleClassAccess().getSemicolonKeyword_5_2_1());
				}
			)*
			otherlv_14='}'
			{
				newLeafNode(otherlv_14, grammarAccess.getStyleClassAccess().getRightCurlyBracketKeyword_5_3());
			}
		)?
		otherlv_15='}'
		{
			newLeafNode(otherlv_15, grammarAccess.getStyleClassAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleSAttributeAndValue
entryRuleSAttributeAndValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSAttributeAndValueRule()); }
	iv_ruleSAttributeAndValue=ruleSAttributeAndValue
	{ $current=$iv_ruleSAttributeAndValue.current; }
	EOF;

// Rule SAttributeAndValue
ruleSAttributeAndValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getSAttributeAndValueAccess().getStnameNameParserRuleCall_0_0());
				}
				lv_stname_0_0=ruleName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSAttributeAndValueRule());
					}
					set(
						$current,
						"stname",
						lv_stname_0_0,
						"uma.es.angular.t2a.T2A.Name");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_value_1_0=RULE_STRING2
				{
					newLeafNode(lv_value_1_0, grammarAccess.getSAttributeAndValueAccess().getValueSTRING2TerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSAttributeAndValueRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"uma.es.angular.t2a.T2A.STRING2");
				}
			)
		)
	)
;

// Entry rule entryRuleDOM
entryRuleDOM returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDOMRule()); }
	iv_ruleDOM=ruleDOM
	{ $current=$iv_ruleDOM.current; }
	EOF;

// Rule DOM
ruleDOM returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Dom'
		{
			newLeafNode(otherlv_0, grammarAccess.getDOMAccess().getDomKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDOMAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDOMRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='{'
			{
				newLeafNode(otherlv_2, grammarAccess.getDOMAccess().getLeftCurlyBracketKeyword_2_0());
			}
			(
				otherlv_3='sclass'
				{
					newLeafNode(otherlv_3, grammarAccess.getDOMAccess().getSclassKeyword_2_1_0());
				}
				otherlv_4='{'
				{
					newLeafNode(otherlv_4, grammarAccess.getDOMAccess().getLeftCurlyBracketKeyword_2_1_1());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getDOMRule());
							}
						}
						otherlv_5=RULE_ID
						{
							newLeafNode(otherlv_5, grammarAccess.getDOMAccess().getSclassesStyleClassCrossReference_2_1_2_0());
						}
					)
				)*
				otherlv_6='}'
				{
					newLeafNode(otherlv_6, grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_1_3());
				}
			)?
			(
				otherlv_7='sclassString'
				{
					newLeafNode(otherlv_7, grammarAccess.getDOMAccess().getSclassStringKeyword_2_2_0());
				}
				otherlv_8='{'
				{
					newLeafNode(otherlv_8, grammarAccess.getDOMAccess().getLeftCurlyBracketKeyword_2_2_1());
				}
				(
					(
						lv_sclassesOnline_9_0=RULE_STRING
						{
							newLeafNode(lv_sclassesOnline_9_0, grammarAccess.getDOMAccess().getSclassesOnlineSTRINGTerminalRuleCall_2_2_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getDOMRule());
							}
							addWithLastConsumed(
								$current,
								"sclassesOnline",
								lv_sclassesOnline_9_0,
								"uma.es.angular.t2a.T2A.STRING");
						}
					)
				)*
				otherlv_10='}'
				{
					newLeafNode(otherlv_10, grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_2_3());
				}
			)?
			(
				(
					{
						newCompositeNode(grammarAccess.getDOMAccess().getFeaturesFeatureParserRuleCall_2_3_0());
					}
					lv_features_11_0=ruleFeature
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDOMRule());
						}
						add(
							$current,
							"features",
							lv_features_11_0,
							"uma.es.angular.t2a.T2A.Feature");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_12='}'
			{
				newLeafNode(otherlv_12, grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_4());
			}
		)?
	)
;

// Entry rule entryRuleComp
entryRuleComp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCompRule()); }
	iv_ruleComp=ruleComp
	{ $current=$iv_ruleComp.current; }
	EOF;

// Rule Comp
ruleComp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Comp'
		{
			newLeafNode(otherlv_0, grammarAccess.getCompAccess().getCompKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCompAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCompRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='{'
			{
				newLeafNode(otherlv_2, grammarAccess.getCompAccess().getLeftCurlyBracketKeyword_2_0());
			}
			(
				otherlv_3='sclass'
				{
					newLeafNode(otherlv_3, grammarAccess.getCompAccess().getSclassKeyword_2_1_0());
				}
				otherlv_4='{'
				{
					newLeafNode(otherlv_4, grammarAccess.getCompAccess().getLeftCurlyBracketKeyword_2_1_1());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getCompRule());
							}
						}
						otherlv_5=RULE_ID
						{
							newLeafNode(otherlv_5, grammarAccess.getCompAccess().getHostclassesStyleClassCrossReference_2_1_2_0());
						}
					)
				)*
				otherlv_6='}'
				{
					newLeafNode(otherlv_6, grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_1_3());
				}
			)?
			(
				otherlv_7='sclassString'
				{
					newLeafNode(otherlv_7, grammarAccess.getCompAccess().getSclassStringKeyword_2_2_0());
				}
				otherlv_8='{'
				{
					newLeafNode(otherlv_8, grammarAccess.getCompAccess().getLeftCurlyBracketKeyword_2_2_1());
				}
				(
					(
						lv_sclassesOnline_9_0=RULE_STRING
						{
							newLeafNode(lv_sclassesOnline_9_0, grammarAccess.getCompAccess().getSclassesOnlineSTRINGTerminalRuleCall_2_2_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getCompRule());
							}
							addWithLastConsumed(
								$current,
								"sclassesOnline",
								lv_sclassesOnline_9_0,
								"uma.es.angular.t2a.T2A.STRING");
						}
					)
				)*
				otherlv_10='}'
				{
					newLeafNode(otherlv_10, grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_2_3());
				}
			)?
			(
				(
					{
						newCompositeNode(grammarAccess.getCompAccess().getFeaturesFeatureParserRuleCall_2_3_0());
					}
					lv_features_11_0=ruleFeature
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCompRule());
						}
						add(
							$current,
							"features",
							lv_features_11_0,
							"uma.es.angular.t2a.T2A.Feature");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_12='}'
			{
				newLeafNode(otherlv_12, grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_4());
			}
		)?
	)
;

// Entry rule entryRuleGoTo
entryRuleGoTo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGoToRule()); }
	iv_ruleGoTo=ruleGoTo
	{ $current=$iv_ruleGoTo.current; }
	EOF;

// Rule GoTo
ruleGoTo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getGoToAccess().getGoToAction_0(),
					$current);
			}
		)
		otherlv_1='GoTo'
		{
			newLeafNode(otherlv_1, grammarAccess.getGoToAccess().getGoToKeyword_1());
		}
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getGoToAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGoToRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getGoToAccess().getPagePageCrossReference_3_0());
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getGoToAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleInstanciaEDOM
entryRuleInstanciaEDOM returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstanciaEDOMRule()); }
	iv_ruleInstanciaEDOM=ruleInstanciaEDOM
	{ $current=$iv_ruleInstanciaEDOM.current; }
	EOF;

// Rule InstanciaEDOM
ruleInstanciaEDOM returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstanciaEDOMRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getInstanciaEDOMAccess().getInstanciaEDOMCrossReference_0_0());
				}
			)
		)
		(
			otherlv_1='{'
			{
				newLeafNode(otherlv_1, grammarAccess.getInstanciaEDOMAccess().getLeftCurlyBracketKeyword_1_0());
			}
			(
				otherlv_2='sclass'
				{
					newLeafNode(otherlv_2, grammarAccess.getInstanciaEDOMAccess().getSclassKeyword_1_1_0());
				}
				otherlv_3='{'
				{
					newLeafNode(otherlv_3, grammarAccess.getInstanciaEDOMAccess().getLeftCurlyBracketKeyword_1_1_1());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getInstanciaEDOMRule());
							}
						}
						otherlv_4=RULE_ID
						{
							newLeafNode(otherlv_4, grammarAccess.getInstanciaEDOMAccess().getSclassesStyleClassCrossReference_1_1_2_0());
						}
					)
				)*
				otherlv_5='}'
				{
					newLeafNode(otherlv_5, grammarAccess.getInstanciaEDOMAccess().getRightCurlyBracketKeyword_1_1_3());
				}
			)?
			(
				otherlv_6='sclassString'
				{
					newLeafNode(otherlv_6, grammarAccess.getInstanciaEDOMAccess().getSclassStringKeyword_1_2_0());
				}
				otherlv_7='{'
				{
					newLeafNode(otherlv_7, grammarAccess.getInstanciaEDOMAccess().getLeftCurlyBracketKeyword_1_2_1());
				}
				(
					(
						lv_sclassesOnline_8_0=RULE_STRING
						{
							newLeafNode(lv_sclassesOnline_8_0, grammarAccess.getInstanciaEDOMAccess().getSclassesOnlineSTRINGTerminalRuleCall_1_2_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getInstanciaEDOMRule());
							}
							addWithLastConsumed(
								$current,
								"sclassesOnline",
								lv_sclassesOnline_8_0,
								"uma.es.angular.t2a.T2A.STRING");
						}
					)
				)*
				otherlv_9='}'
				{
					newLeafNode(otherlv_9, grammarAccess.getInstanciaEDOMAccess().getRightCurlyBracketKeyword_1_2_3());
				}
			)?
			(
				otherlv_10='click::'
				{
					newLeafNode(otherlv_10, grammarAccess.getInstanciaEDOMAccess().getClickKeyword_1_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getInstanciaEDOMAccess().getGoToGoToParserRuleCall_1_3_1_0());
						}
						lv_goTo_11_0=ruleGoTo
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getInstanciaEDOMRule());
							}
							set(
								$current,
								"goTo",
								lv_goTo_11_0,
								"uma.es.angular.t2a.T2A.GoTo");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
			(
				(
					{
						newCompositeNode(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesInstanceEDOMFeatureParserRuleCall_1_4_0());
					}
					lv_insfeatures_12_0=ruleInstanceEDOMFeature
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInstanciaEDOMRule());
						}
						add(
							$current,
							"insfeatures",
							lv_insfeatures_12_0,
							"uma.es.angular.t2a.T2A.InstanceEDOMFeature");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_13='}'
			{
				newLeafNode(otherlv_13, grammarAccess.getInstanciaEDOMAccess().getRightCurlyBracketKeyword_1_5());
			}
		)?
	)
;

// Entry rule entryRuleInstanceEDOMFeature
entryRuleInstanceEDOMFeature returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstanceEDOMFeatureRule()); }
	iv_ruleInstanceEDOMFeature=ruleInstanceEDOMFeature
	{ $current=$iv_ruleInstanceEDOMFeature.current; }
	EOF;

// Rule InstanceEDOMFeature
ruleInstanceEDOMFeature returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getInstanceEDOMFeatureAccess().getInstanciaEDOMInstanciaEDOMParserRuleCall_0_0());
				}
				lv_instanciaEDOM_0_0=ruleInstanciaEDOM
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstanceEDOMFeatureRule());
					}
					set(
						$current,
						"instanciaEDOM",
						lv_instanciaEDOM_0_0,
						"uma.es.angular.t2a.T2A.InstanciaEDOM");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				lv_string_1_0=RULE_STRING
				{
					newLeafNode(lv_string_1_0, grammarAccess.getInstanceEDOMFeatureAccess().getStringSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstanceEDOMFeatureRule());
					}
					setWithLastConsumed(
						$current,
						"string",
						lv_string_1_0,
						"uma.es.angular.t2a.T2A.STRING");
				}
			)
		)
	)
;

// Entry rule entryRulePageFeature
entryRulePageFeature returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPageFeatureRule()); }
	iv_rulePageFeature=rulePageFeature
	{ $current=$iv_rulePageFeature.current; }
	EOF;

// Rule PageFeature
rulePageFeature returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getPageFeatureAccess().getInstanciaEDOMInstanciaEDOMParserRuleCall_0_0());
				}
				lv_instanciaEDOM_0_0=ruleInstanciaEDOM
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPageFeatureRule());
					}
					set(
						$current,
						"instanciaEDOM",
						lv_instanciaEDOM_0_0,
						"uma.es.angular.t2a.T2A.InstanciaEDOM");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				lv_string_1_0=RULE_STRING
				{
					newLeafNode(lv_string_1_0, grammarAccess.getPageFeatureAccess().getStringSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPageFeatureRule());
					}
					setWithLastConsumed(
						$current,
						"string",
						lv_string_1_0,
						"uma.es.angular.t2a.T2A.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureRule()); }
	iv_ruleFeature=ruleFeature
	{ $current=$iv_ruleFeature.current; }
	EOF;

// Rule Feature
ruleFeature returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getInstanciaEDOMInstanciaEDOMParserRuleCall_0_0());
				}
				lv_instanciaEDOM_0_0=ruleInstanciaEDOM
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					set(
						$current,
						"instanciaEDOM",
						lv_instanciaEDOM_0_0,
						"uma.es.angular.t2a.T2A.InstanciaEDOM");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				lv_AllowSlot_1_0='AllowSlot'
				{
					newLeafNode(lv_AllowSlot_1_0, grammarAccess.getFeatureAccess().getAllowSlotAllowSlotKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureRule());
					}
					setWithLastConsumed($current, "AllowSlot", lv_AllowSlot_1_0 != null, "AllowSlot");
				}
			)
		)
		    |
		(
			(
				lv_string_2_0=RULE_STRING
				{
					newLeafNode(lv_string_2_0, grammarAccess.getFeatureAccess().getStringSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureRule());
					}
					setWithLastConsumed(
						$current,
						"string",
						lv_string_2_0,
						"uma.es.angular.t2a.T2A.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleName
entryRuleName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNameRule()); }
	iv_ruleName=ruleName
	{ $current=$iv_ruleName.current.getText(); }
	EOF;

// Rule Name
ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='_'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getNameAccess().get_Keyword_0());
		}
		    |
		kw='#'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getNameAccess().getNumberSignKeyword_1());
		}
		    |
		kw='-'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getNameAccess().getHyphenMinusKeyword_2());
		}
		    |
		kw='*'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getNameAccess().getAsteriskKeyword_3());
		}
		    |
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getNameAccess().getFullStopKeyword_4());
		}
		    |
		kw='::'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getNameAccess().getColonColonKeyword_5());
		}
		    |
		kw='>'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getNameAccess().getGreaterThanSignKeyword_6());
		}
		    |
		this_ID_7=RULE_ID
		{
			$current.merge(this_ID_7);
		}
		{
			newLeafNode(this_ID_7, grammarAccess.getNameAccess().getIDTerminalRuleCall_7());
		}
	)*
;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_STRING2 : (': '|':'|' : ') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'#'|'-'|'%'|'*'|','|', '|'('|')'|'px '|'"') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'#'|'-'|'%'|'*'|','|', '|'('|')'|'px '|'"')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
