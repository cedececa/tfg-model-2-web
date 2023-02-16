/*
 * generated by Xtext 2.26.0
 */
grammar InternalT2A;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package uma.es.angular.t2a.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package uma.es.angular.t2a.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uma.es.angular.t2a.services.T2AGrammarAccess;

}
@parser::members {
	private T2AGrammarAccess grammarAccess;

	public void setGrammarAccess(T2AGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleRoot
entryRuleRoot
:
{ before(grammarAccess.getRootRule()); }
	 ruleRoot
{ after(grammarAccess.getRootRule()); } 
	 EOF 
;

// Rule Root
ruleRoot 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		(
			{ before(grammarAccess.getRootAccess().getElementsAssignment()); }
			(rule__Root__ElementsAssignment)
			{ after(grammarAccess.getRootAccess().getElementsAssignment()); }
		)
		(
			{ before(grammarAccess.getRootAccess().getElementsAssignment()); }
			(rule__Root__ElementsAssignment)*
			{ after(grammarAccess.getRootAccess().getElementsAssignment()); }
		)
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleElement
entryRuleElement
:
{ before(grammarAccess.getElementRule()); }
	 ruleElement
{ after(grammarAccess.getElementRule()); } 
	 EOF 
;

// Rule Element
ruleElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getElementAccess().getAlternatives()); }
		(rule__Element__Alternatives)
		{ after(grammarAccess.getElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePage
entryRulePage
:
{ before(grammarAccess.getPageRule()); }
	 rulePage
{ after(grammarAccess.getPageRule()); } 
	 EOF 
;

// Rule Page
rulePage 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPageAccess().getGroup()); }
		(rule__Page__Group__0)
		{ after(grammarAccess.getPageAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEDOM
entryRuleEDOM
:
{ before(grammarAccess.getEDOMRule()); }
	 ruleEDOM
{ after(grammarAccess.getEDOMRule()); } 
	 EOF 
;

// Rule EDOM
ruleEDOM 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEDOMAccess().getAlternatives()); }
		(rule__EDOM__Alternatives)
		{ after(grammarAccess.getEDOMAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDOM
entryRuleDOM
:
{ before(grammarAccess.getDOMRule()); }
	 ruleDOM
{ after(grammarAccess.getDOMRule()); } 
	 EOF 
;

// Rule DOM
ruleDOM 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDOMAccess().getGroup()); }
		(rule__DOM__Group__0)
		{ after(grammarAccess.getDOMAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComp
entryRuleComp
:
{ before(grammarAccess.getCompRule()); }
	 ruleComp
{ after(grammarAccess.getCompRule()); } 
	 EOF 
;

// Rule Comp
ruleComp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCompAccess().getGroup()); }
		(rule__Comp__Group__0)
		{ after(grammarAccess.getCompAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInstanciaEDOM
entryRuleInstanciaEDOM
:
{ before(grammarAccess.getInstanciaEDOMRule()); }
	 ruleInstanciaEDOM
{ after(grammarAccess.getInstanciaEDOMRule()); } 
	 EOF 
;

// Rule InstanciaEDOM
ruleInstanciaEDOM 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInstanciaEDOMAccess().getGroup()); }
		(rule__InstanciaEDOM__Group__0)
		{ after(grammarAccess.getInstanciaEDOMAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInstanceEDOMFeature
entryRuleInstanceEDOMFeature
:
{ before(grammarAccess.getInstanceEDOMFeatureRule()); }
	 ruleInstanceEDOMFeature
{ after(grammarAccess.getInstanceEDOMFeatureRule()); } 
	 EOF 
;

// Rule InstanceEDOMFeature
ruleInstanceEDOMFeature 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInstanceEDOMFeatureAccess().getAlternatives()); }
		(rule__InstanceEDOMFeature__Alternatives)
		{ after(grammarAccess.getInstanceEDOMFeatureAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePageFeature
entryRulePageFeature
:
{ before(grammarAccess.getPageFeatureRule()); }
	 rulePageFeature
{ after(grammarAccess.getPageFeatureRule()); } 
	 EOF 
;

// Rule PageFeature
rulePageFeature 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPageFeatureAccess().getAlternatives()); }
		(rule__PageFeature__Alternatives)
		{ after(grammarAccess.getPageFeatureAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFeature
entryRuleFeature
:
{ before(grammarAccess.getFeatureRule()); }
	 ruleFeature
{ after(grammarAccess.getFeatureRule()); } 
	 EOF 
;

// Rule Feature
ruleFeature 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFeatureAccess().getAlternatives()); }
		(rule__Feature__Alternatives)
		{ after(grammarAccess.getFeatureAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getElementAccess().getPageParserRuleCall_0()); }
		rulePage
		{ after(grammarAccess.getElementAccess().getPageParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getElementAccess().getEDOMParserRuleCall_1()); }
		ruleEDOM
		{ after(grammarAccess.getElementAccess().getEDOMParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EDOM__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEDOMAccess().getDOMParserRuleCall_0()); }
		ruleDOM
		{ after(grammarAccess.getEDOMAccess().getDOMParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEDOMAccess().getCompParserRuleCall_1()); }
		ruleComp
		{ after(grammarAccess.getEDOMAccess().getCompParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanceEDOMFeature__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstanceEDOMFeatureAccess().getEdomsAssignment_0()); }
		(rule__InstanceEDOMFeature__EdomsAssignment_0)
		{ after(grammarAccess.getInstanceEDOMFeatureAccess().getEdomsAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getInstanceEDOMFeatureAccess().getStringAssignment_1()); }
		(rule__InstanceEDOMFeature__StringAssignment_1)
		{ after(grammarAccess.getInstanceEDOMFeatureAccess().getStringAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PageFeature__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPageFeatureAccess().getInstanciaEDOMAssignment_0()); }
		(rule__PageFeature__InstanciaEDOMAssignment_0)
		{ after(grammarAccess.getPageFeatureAccess().getInstanciaEDOMAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getPageFeatureAccess().getStringAssignment_1()); }
		(rule__PageFeature__StringAssignment_1)
		{ after(grammarAccess.getPageFeatureAccess().getStringAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getInstanciaEDOMAssignment_0()); }
		(rule__Feature__InstanciaEDOMAssignment_0)
		{ after(grammarAccess.getFeatureAccess().getInstanciaEDOMAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getFeatureAccess().getAllowSlotAssignment_1()); }
		(rule__Feature__AllowSlotAssignment_1)
		{ after(grammarAccess.getFeatureAccess().getAllowSlotAssignment_1()); }
	)
	|
	(
		{ before(grammarAccess.getFeatureAccess().getStringAssignment_2()); }
		(rule__Feature__StringAssignment_2)
		{ after(grammarAccess.getFeatureAccess().getStringAssignment_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Page__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Page__Group__0__Impl
	rule__Page__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Page__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPageAccess().getPageKeyword_0()); }
	'Page'
	{ after(grammarAccess.getPageAccess().getPageKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Page__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Page__Group__1__Impl
	rule__Page__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Page__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPageAccess().getNameAssignment_1()); }
	(rule__Page__NameAssignment_1)
	{ after(grammarAccess.getPageAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Page__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Page__Group__2__Impl
	rule__Page__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Page__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Page__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Page__Group__3__Impl
	rule__Page__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Page__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPageAccess().getPageFeaturesAssignment_3()); }
	(rule__Page__PageFeaturesAssignment_3)*
	{ after(grammarAccess.getPageAccess().getPageFeaturesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Page__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Page__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Page__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DOM__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DOM__Group__0__Impl
	rule__DOM__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DOM__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDOMAccess().getDomKeyword_0()); }
	'Dom'
	{ after(grammarAccess.getDOMAccess().getDomKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DOM__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DOM__Group__1__Impl
	rule__DOM__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DOM__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDOMAccess().getNameAssignment_1()); }
	(rule__DOM__NameAssignment_1)
	{ after(grammarAccess.getDOMAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DOM__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DOM__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DOM__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDOMAccess().getGroup_2()); }
	(rule__DOM__Group_2__0)?
	{ after(grammarAccess.getDOMAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DOM__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DOM__Group_2__0__Impl
	rule__DOM__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DOM__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDOMAccess().getLeftCurlyBracketKeyword_2_0()); }
	'{'
	{ after(grammarAccess.getDOMAccess().getLeftCurlyBracketKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DOM__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DOM__Group_2__1__Impl
	rule__DOM__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DOM__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDOMAccess().getFeaturesAssignment_2_1()); }
	(rule__DOM__FeaturesAssignment_2_1)*
	{ after(grammarAccess.getDOMAccess().getFeaturesAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DOM__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DOM__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DOM__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_2()); }
	'}'
	{ after(grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Comp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comp__Group__0__Impl
	rule__Comp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Comp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompAccess().getCompKeyword_0()); }
	'Comp'
	{ after(grammarAccess.getCompAccess().getCompKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comp__Group__1__Impl
	rule__Comp__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Comp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompAccess().getNameAssignment_1()); }
	(rule__Comp__NameAssignment_1)
	{ after(grammarAccess.getCompAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comp__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comp__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Comp__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompAccess().getGroup_2()); }
	(rule__Comp__Group_2__0)?
	{ after(grammarAccess.getCompAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Comp__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comp__Group_2__0__Impl
	rule__Comp__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Comp__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompAccess().getLeftCurlyBracketKeyword_2_0()); }
	'{'
	{ after(grammarAccess.getCompAccess().getLeftCurlyBracketKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comp__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comp__Group_2__1__Impl
	rule__Comp__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Comp__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompAccess().getFeaturesAssignment_2_1()); }
	(rule__Comp__FeaturesAssignment_2_1)*
	{ after(grammarAccess.getCompAccess().getFeaturesAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comp__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comp__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Comp__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_2()); }
	'}'
	{ after(grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InstanciaEDOM__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InstanciaEDOM__Group__0__Impl
	rule__InstanciaEDOM__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanciaEDOM__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstanciaEDOMAccess().getInstanciaAssignment_0()); }
	(rule__InstanciaEDOM__InstanciaAssignment_0)
	{ after(grammarAccess.getInstanciaEDOMAccess().getInstanciaAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanciaEDOM__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InstanciaEDOM__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanciaEDOM__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstanciaEDOMAccess().getGroup_1()); }
	(rule__InstanciaEDOM__Group_1__0)?
	{ after(grammarAccess.getInstanciaEDOMAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InstanciaEDOM__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InstanciaEDOM__Group_1__0__Impl
	rule__InstanciaEDOM__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanciaEDOM__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstanciaEDOMAccess().getLeftCurlyBracketKeyword_1_0()); }
	'{'
	{ after(grammarAccess.getInstanciaEDOMAccess().getLeftCurlyBracketKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanciaEDOM__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InstanciaEDOM__Group_1__1__Impl
	rule__InstanciaEDOM__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanciaEDOM__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesAssignment_1_1()); }
	(rule__InstanciaEDOM__InsfeaturesAssignment_1_1)*
	{ after(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanciaEDOM__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InstanciaEDOM__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanciaEDOM__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstanciaEDOMAccess().getRightCurlyBracketKeyword_1_2()); }
	'}'
	{ after(grammarAccess.getInstanciaEDOMAccess().getRightCurlyBracketKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Root__ElementsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRootAccess().getElementsElementParserRuleCall_0()); }
		ruleElement
		{ after(grammarAccess.getRootAccess().getElementsElementParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Page__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Page__PageFeaturesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPageAccess().getPageFeaturesPageFeatureParserRuleCall_3_0()); }
		rulePageFeature
		{ after(grammarAccess.getPageAccess().getPageFeaturesPageFeatureParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DOM__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDOMAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDOMAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DOM__FeaturesAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDOMAccess().getFeaturesFeatureParserRuleCall_2_1_0()); }
		ruleFeature
		{ after(grammarAccess.getDOMAccess().getFeaturesFeatureParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comp__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getCompAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comp__FeaturesAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompAccess().getFeaturesFeatureParserRuleCall_2_1_0()); }
		ruleFeature
		{ after(grammarAccess.getCompAccess().getFeaturesFeatureParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanciaEDOM__InstanciaAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstanciaEDOMAccess().getInstanciaEDOMCrossReference_0_0()); }
		(
			{ before(grammarAccess.getInstanciaEDOMAccess().getInstanciaEDOMIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getInstanciaEDOMAccess().getInstanciaEDOMIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getInstanciaEDOMAccess().getInstanciaEDOMCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanciaEDOM__InsfeaturesAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesInstanceEDOMFeatureParserRuleCall_1_1_0()); }
		ruleInstanceEDOMFeature
		{ after(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesInstanceEDOMFeatureParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanceEDOMFeature__EdomsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstanceEDOMFeatureAccess().getEdomsEDOMCrossReference_0_0()); }
		(
			{ before(grammarAccess.getInstanceEDOMFeatureAccess().getEdomsEDOMIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getInstanceEDOMFeatureAccess().getEdomsEDOMIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getInstanceEDOMFeatureAccess().getEdomsEDOMCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InstanceEDOMFeature__StringAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstanceEDOMFeatureAccess().getStringSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getInstanceEDOMFeatureAccess().getStringSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PageFeature__InstanciaEDOMAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPageFeatureAccess().getInstanciaEDOMInstanciaEDOMParserRuleCall_0_0()); }
		ruleInstanciaEDOM
		{ after(grammarAccess.getPageFeatureAccess().getInstanciaEDOMInstanciaEDOMParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PageFeature__StringAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPageFeatureAccess().getStringSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getPageFeatureAccess().getStringSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__InstanciaEDOMAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getInstanciaEDOMInstanciaEDOMParserRuleCall_0_0()); }
		ruleInstanciaEDOM
		{ after(grammarAccess.getFeatureAccess().getInstanciaEDOMInstanciaEDOMParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__AllowSlotAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getAllowSlotAllowSlotKeyword_1_0()); }
		(
			{ before(grammarAccess.getFeatureAccess().getAllowSlotAllowSlotKeyword_1_0()); }
			'AllowSlot'
			{ after(grammarAccess.getFeatureAccess().getAllowSlotAllowSlotKeyword_1_0()); }
		)
		{ after(grammarAccess.getFeatureAccess().getAllowSlotAllowSlotKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__StringAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getStringSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getFeatureAccess().getStringSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;