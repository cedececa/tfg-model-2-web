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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalT2AParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING2", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'_'", "'#'", "'-'", "'*'", "'.'", "'::'", "'>'", "'Page'", "'{'", "'}'", "'sclass'", "'StyleClass'", "';'", "'after'", "'active'", "'Dom'", "'Comp'", "'home'", "'showInNav'", "'AllowSlot'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int RULE_STRING2=5;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalT2AParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalT2AParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalT2AParser.tokenNames; }
    public String getGrammarFileName() { return "InternalT2A.g"; }


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



    // $ANTLR start "entryRuleRoot"
    // InternalT2A.g:53:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // InternalT2A.g:54:1: ( ruleRoot EOF )
            // InternalT2A.g:55:1: ruleRoot EOF
            {
             before(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getRootRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalT2A.g:62:1: ruleRoot : ( ( ( rule__Root__ElementsAssignment ) ) ( ( rule__Root__ElementsAssignment )* ) ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:66:2: ( ( ( ( rule__Root__ElementsAssignment ) ) ( ( rule__Root__ElementsAssignment )* ) ) )
            // InternalT2A.g:67:2: ( ( ( rule__Root__ElementsAssignment ) ) ( ( rule__Root__ElementsAssignment )* ) )
            {
            // InternalT2A.g:67:2: ( ( ( rule__Root__ElementsAssignment ) ) ( ( rule__Root__ElementsAssignment )* ) )
            // InternalT2A.g:68:3: ( ( rule__Root__ElementsAssignment ) ) ( ( rule__Root__ElementsAssignment )* )
            {
            // InternalT2A.g:68:3: ( ( rule__Root__ElementsAssignment ) )
            // InternalT2A.g:69:4: ( rule__Root__ElementsAssignment )
            {
             before(grammarAccess.getRootAccess().getElementsAssignment()); 
            // InternalT2A.g:70:4: ( rule__Root__ElementsAssignment )
            // InternalT2A.g:70:5: rule__Root__ElementsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Root__ElementsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getElementsAssignment()); 

            }

            // InternalT2A.g:73:3: ( ( rule__Root__ElementsAssignment )* )
            // InternalT2A.g:74:4: ( rule__Root__ElementsAssignment )*
            {
             before(grammarAccess.getRootAccess().getElementsAssignment()); 
            // InternalT2A.g:75:4: ( rule__Root__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19||LA1_0==23||(LA1_0>=27 && LA1_0<=28)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalT2A.g:75:5: rule__Root__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Root__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getRootAccess().getElementsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleElement"
    // InternalT2A.g:85:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalT2A.g:86:1: ( ruleElement EOF )
            // InternalT2A.g:87:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalT2A.g:94:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:98:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalT2A.g:99:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalT2A.g:99:2: ( ( rule__Element__Alternatives ) )
            // InternalT2A.g:100:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalT2A.g:101:3: ( rule__Element__Alternatives )
            // InternalT2A.g:101:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRulePage"
    // InternalT2A.g:110:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // InternalT2A.g:111:1: ( rulePage EOF )
            // InternalT2A.g:112:1: rulePage EOF
            {
             before(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_1);
            rulePage();

            state._fsp--;

             after(grammarAccess.getPageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // InternalT2A.g:119:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:123:2: ( ( ( rule__Page__Group__0 ) ) )
            // InternalT2A.g:124:2: ( ( rule__Page__Group__0 ) )
            {
            // InternalT2A.g:124:2: ( ( rule__Page__Group__0 ) )
            // InternalT2A.g:125:3: ( rule__Page__Group__0 )
            {
             before(grammarAccess.getPageAccess().getGroup()); 
            // InternalT2A.g:126:3: ( rule__Page__Group__0 )
            // InternalT2A.g:126:4: rule__Page__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleEDOM"
    // InternalT2A.g:135:1: entryRuleEDOM : ruleEDOM EOF ;
    public final void entryRuleEDOM() throws RecognitionException {
        try {
            // InternalT2A.g:136:1: ( ruleEDOM EOF )
            // InternalT2A.g:137:1: ruleEDOM EOF
            {
             before(grammarAccess.getEDOMRule()); 
            pushFollow(FOLLOW_1);
            ruleEDOM();

            state._fsp--;

             after(grammarAccess.getEDOMRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDOM"


    // $ANTLR start "ruleEDOM"
    // InternalT2A.g:144:1: ruleEDOM : ( ( rule__EDOM__Alternatives ) ) ;
    public final void ruleEDOM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:148:2: ( ( ( rule__EDOM__Alternatives ) ) )
            // InternalT2A.g:149:2: ( ( rule__EDOM__Alternatives ) )
            {
            // InternalT2A.g:149:2: ( ( rule__EDOM__Alternatives ) )
            // InternalT2A.g:150:3: ( rule__EDOM__Alternatives )
            {
             before(grammarAccess.getEDOMAccess().getAlternatives()); 
            // InternalT2A.g:151:3: ( rule__EDOM__Alternatives )
            // InternalT2A.g:151:4: rule__EDOM__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EDOM__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEDOMAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDOM"


    // $ANTLR start "entryRuleStyleClass"
    // InternalT2A.g:160:1: entryRuleStyleClass : ruleStyleClass EOF ;
    public final void entryRuleStyleClass() throws RecognitionException {
        try {
            // InternalT2A.g:161:1: ( ruleStyleClass EOF )
            // InternalT2A.g:162:1: ruleStyleClass EOF
            {
             before(grammarAccess.getStyleClassRule()); 
            pushFollow(FOLLOW_1);
            ruleStyleClass();

            state._fsp--;

             after(grammarAccess.getStyleClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStyleClass"


    // $ANTLR start "ruleStyleClass"
    // InternalT2A.g:169:1: ruleStyleClass : ( ( rule__StyleClass__Group__0 ) ) ;
    public final void ruleStyleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:173:2: ( ( ( rule__StyleClass__Group__0 ) ) )
            // InternalT2A.g:174:2: ( ( rule__StyleClass__Group__0 ) )
            {
            // InternalT2A.g:174:2: ( ( rule__StyleClass__Group__0 ) )
            // InternalT2A.g:175:3: ( rule__StyleClass__Group__0 )
            {
             before(grammarAccess.getStyleClassAccess().getGroup()); 
            // InternalT2A.g:176:3: ( rule__StyleClass__Group__0 )
            // InternalT2A.g:176:4: rule__StyleClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StyleClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStyleClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStyleClass"


    // $ANTLR start "entryRuleSAttributeAndValue"
    // InternalT2A.g:185:1: entryRuleSAttributeAndValue : ruleSAttributeAndValue EOF ;
    public final void entryRuleSAttributeAndValue() throws RecognitionException {
        try {
            // InternalT2A.g:186:1: ( ruleSAttributeAndValue EOF )
            // InternalT2A.g:187:1: ruleSAttributeAndValue EOF
            {
             before(grammarAccess.getSAttributeAndValueRule()); 
            pushFollow(FOLLOW_1);
            ruleSAttributeAndValue();

            state._fsp--;

             after(grammarAccess.getSAttributeAndValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSAttributeAndValue"


    // $ANTLR start "ruleSAttributeAndValue"
    // InternalT2A.g:194:1: ruleSAttributeAndValue : ( ( rule__SAttributeAndValue__Group__0 ) ) ;
    public final void ruleSAttributeAndValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:198:2: ( ( ( rule__SAttributeAndValue__Group__0 ) ) )
            // InternalT2A.g:199:2: ( ( rule__SAttributeAndValue__Group__0 ) )
            {
            // InternalT2A.g:199:2: ( ( rule__SAttributeAndValue__Group__0 ) )
            // InternalT2A.g:200:3: ( rule__SAttributeAndValue__Group__0 )
            {
             before(grammarAccess.getSAttributeAndValueAccess().getGroup()); 
            // InternalT2A.g:201:3: ( rule__SAttributeAndValue__Group__0 )
            // InternalT2A.g:201:4: rule__SAttributeAndValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SAttributeAndValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSAttributeAndValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSAttributeAndValue"


    // $ANTLR start "entryRuleDOM"
    // InternalT2A.g:210:1: entryRuleDOM : ruleDOM EOF ;
    public final void entryRuleDOM() throws RecognitionException {
        try {
            // InternalT2A.g:211:1: ( ruleDOM EOF )
            // InternalT2A.g:212:1: ruleDOM EOF
            {
             before(grammarAccess.getDOMRule()); 
            pushFollow(FOLLOW_1);
            ruleDOM();

            state._fsp--;

             after(grammarAccess.getDOMRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDOM"


    // $ANTLR start "ruleDOM"
    // InternalT2A.g:219:1: ruleDOM : ( ( rule__DOM__Group__0 ) ) ;
    public final void ruleDOM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:223:2: ( ( ( rule__DOM__Group__0 ) ) )
            // InternalT2A.g:224:2: ( ( rule__DOM__Group__0 ) )
            {
            // InternalT2A.g:224:2: ( ( rule__DOM__Group__0 ) )
            // InternalT2A.g:225:3: ( rule__DOM__Group__0 )
            {
             before(grammarAccess.getDOMAccess().getGroup()); 
            // InternalT2A.g:226:3: ( rule__DOM__Group__0 )
            // InternalT2A.g:226:4: rule__DOM__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DOM__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDOMAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDOM"


    // $ANTLR start "entryRuleComp"
    // InternalT2A.g:235:1: entryRuleComp : ruleComp EOF ;
    public final void entryRuleComp() throws RecognitionException {
        try {
            // InternalT2A.g:236:1: ( ruleComp EOF )
            // InternalT2A.g:237:1: ruleComp EOF
            {
             before(grammarAccess.getCompRule()); 
            pushFollow(FOLLOW_1);
            ruleComp();

            state._fsp--;

             after(grammarAccess.getCompRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComp"


    // $ANTLR start "ruleComp"
    // InternalT2A.g:244:1: ruleComp : ( ( rule__Comp__Group__0 ) ) ;
    public final void ruleComp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:248:2: ( ( ( rule__Comp__Group__0 ) ) )
            // InternalT2A.g:249:2: ( ( rule__Comp__Group__0 ) )
            {
            // InternalT2A.g:249:2: ( ( rule__Comp__Group__0 ) )
            // InternalT2A.g:250:3: ( rule__Comp__Group__0 )
            {
             before(grammarAccess.getCompAccess().getGroup()); 
            // InternalT2A.g:251:3: ( rule__Comp__Group__0 )
            // InternalT2A.g:251:4: rule__Comp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComp"


    // $ANTLR start "entryRuleInstanciaEDOM"
    // InternalT2A.g:260:1: entryRuleInstanciaEDOM : ruleInstanciaEDOM EOF ;
    public final void entryRuleInstanciaEDOM() throws RecognitionException {
        try {
            // InternalT2A.g:261:1: ( ruleInstanciaEDOM EOF )
            // InternalT2A.g:262:1: ruleInstanciaEDOM EOF
            {
             before(grammarAccess.getInstanciaEDOMRule()); 
            pushFollow(FOLLOW_1);
            ruleInstanciaEDOM();

            state._fsp--;

             after(grammarAccess.getInstanciaEDOMRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstanciaEDOM"


    // $ANTLR start "ruleInstanciaEDOM"
    // InternalT2A.g:269:1: ruleInstanciaEDOM : ( ( rule__InstanciaEDOM__Group__0 ) ) ;
    public final void ruleInstanciaEDOM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:273:2: ( ( ( rule__InstanciaEDOM__Group__0 ) ) )
            // InternalT2A.g:274:2: ( ( rule__InstanciaEDOM__Group__0 ) )
            {
            // InternalT2A.g:274:2: ( ( rule__InstanciaEDOM__Group__0 ) )
            // InternalT2A.g:275:3: ( rule__InstanciaEDOM__Group__0 )
            {
             before(grammarAccess.getInstanciaEDOMAccess().getGroup()); 
            // InternalT2A.g:276:3: ( rule__InstanciaEDOM__Group__0 )
            // InternalT2A.g:276:4: rule__InstanciaEDOM__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InstanciaEDOM__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstanciaEDOMAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstanciaEDOM"


    // $ANTLR start "entryRuleInstanceEDOMFeature"
    // InternalT2A.g:285:1: entryRuleInstanceEDOMFeature : ruleInstanceEDOMFeature EOF ;
    public final void entryRuleInstanceEDOMFeature() throws RecognitionException {
        try {
            // InternalT2A.g:286:1: ( ruleInstanceEDOMFeature EOF )
            // InternalT2A.g:287:1: ruleInstanceEDOMFeature EOF
            {
             before(grammarAccess.getInstanceEDOMFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleInstanceEDOMFeature();

            state._fsp--;

             after(grammarAccess.getInstanceEDOMFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstanceEDOMFeature"


    // $ANTLR start "ruleInstanceEDOMFeature"
    // InternalT2A.g:294:1: ruleInstanceEDOMFeature : ( ( rule__InstanceEDOMFeature__Alternatives ) ) ;
    public final void ruleInstanceEDOMFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:298:2: ( ( ( rule__InstanceEDOMFeature__Alternatives ) ) )
            // InternalT2A.g:299:2: ( ( rule__InstanceEDOMFeature__Alternatives ) )
            {
            // InternalT2A.g:299:2: ( ( rule__InstanceEDOMFeature__Alternatives ) )
            // InternalT2A.g:300:3: ( rule__InstanceEDOMFeature__Alternatives )
            {
             before(grammarAccess.getInstanceEDOMFeatureAccess().getAlternatives()); 
            // InternalT2A.g:301:3: ( rule__InstanceEDOMFeature__Alternatives )
            // InternalT2A.g:301:4: rule__InstanceEDOMFeature__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InstanceEDOMFeature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstanceEDOMFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstanceEDOMFeature"


    // $ANTLR start "entryRulePageFeature"
    // InternalT2A.g:310:1: entryRulePageFeature : rulePageFeature EOF ;
    public final void entryRulePageFeature() throws RecognitionException {
        try {
            // InternalT2A.g:311:1: ( rulePageFeature EOF )
            // InternalT2A.g:312:1: rulePageFeature EOF
            {
             before(grammarAccess.getPageFeatureRule()); 
            pushFollow(FOLLOW_1);
            rulePageFeature();

            state._fsp--;

             after(grammarAccess.getPageFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePageFeature"


    // $ANTLR start "rulePageFeature"
    // InternalT2A.g:319:1: rulePageFeature : ( ( rule__PageFeature__Alternatives ) ) ;
    public final void rulePageFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:323:2: ( ( ( rule__PageFeature__Alternatives ) ) )
            // InternalT2A.g:324:2: ( ( rule__PageFeature__Alternatives ) )
            {
            // InternalT2A.g:324:2: ( ( rule__PageFeature__Alternatives ) )
            // InternalT2A.g:325:3: ( rule__PageFeature__Alternatives )
            {
             before(grammarAccess.getPageFeatureAccess().getAlternatives()); 
            // InternalT2A.g:326:3: ( rule__PageFeature__Alternatives )
            // InternalT2A.g:326:4: rule__PageFeature__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PageFeature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPageFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePageFeature"


    // $ANTLR start "entryRuleFeature"
    // InternalT2A.g:335:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalT2A.g:336:1: ( ruleFeature EOF )
            // InternalT2A.g:337:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalT2A.g:344:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:348:2: ( ( ( rule__Feature__Alternatives ) ) )
            // InternalT2A.g:349:2: ( ( rule__Feature__Alternatives ) )
            {
            // InternalT2A.g:349:2: ( ( rule__Feature__Alternatives ) )
            // InternalT2A.g:350:3: ( rule__Feature__Alternatives )
            {
             before(grammarAccess.getFeatureAccess().getAlternatives()); 
            // InternalT2A.g:351:3: ( rule__Feature__Alternatives )
            // InternalT2A.g:351:4: rule__Feature__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleName"
    // InternalT2A.g:360:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalT2A.g:361:1: ( ruleName EOF )
            // InternalT2A.g:362:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalT2A.g:369:1: ruleName : ( ( rule__Name__Alternatives )* ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:373:2: ( ( ( rule__Name__Alternatives )* ) )
            // InternalT2A.g:374:2: ( ( rule__Name__Alternatives )* )
            {
            // InternalT2A.g:374:2: ( ( rule__Name__Alternatives )* )
            // InternalT2A.g:375:3: ( rule__Name__Alternatives )*
            {
             before(grammarAccess.getNameAccess().getAlternatives()); 
            // InternalT2A.g:376:3: ( rule__Name__Alternatives )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||(LA2_0>=12 && LA2_0<=18)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalT2A.g:376:4: rule__Name__Alternatives
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Name__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalT2A.g:384:1: rule__Element__Alternatives : ( ( rulePage ) | ( ruleEDOM ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:388:1: ( ( rulePage ) | ( ruleEDOM ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==23||(LA3_0>=27 && LA3_0<=28)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalT2A.g:389:2: ( rulePage )
                    {
                    // InternalT2A.g:389:2: ( rulePage )
                    // InternalT2A.g:390:3: rulePage
                    {
                     before(grammarAccess.getElementAccess().getPageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePage();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getPageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT2A.g:395:2: ( ruleEDOM )
                    {
                    // InternalT2A.g:395:2: ( ruleEDOM )
                    // InternalT2A.g:396:3: ruleEDOM
                    {
                     before(grammarAccess.getElementAccess().getEDOMParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEDOM();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getEDOMParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__EDOM__Alternatives"
    // InternalT2A.g:405:1: rule__EDOM__Alternatives : ( ( ruleDOM ) | ( ruleComp ) | ( ruleStyleClass ) );
    public final void rule__EDOM__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:409:1: ( ( ruleDOM ) | ( ruleComp ) | ( ruleStyleClass ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt4=1;
                }
                break;
            case 28:
                {
                alt4=2;
                }
                break;
            case 23:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalT2A.g:410:2: ( ruleDOM )
                    {
                    // InternalT2A.g:410:2: ( ruleDOM )
                    // InternalT2A.g:411:3: ruleDOM
                    {
                     before(grammarAccess.getEDOMAccess().getDOMParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDOM();

                    state._fsp--;

                     after(grammarAccess.getEDOMAccess().getDOMParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT2A.g:416:2: ( ruleComp )
                    {
                    // InternalT2A.g:416:2: ( ruleComp )
                    // InternalT2A.g:417:3: ruleComp
                    {
                     before(grammarAccess.getEDOMAccess().getCompParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComp();

                    state._fsp--;

                     after(grammarAccess.getEDOMAccess().getCompParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalT2A.g:422:2: ( ruleStyleClass )
                    {
                    // InternalT2A.g:422:2: ( ruleStyleClass )
                    // InternalT2A.g:423:3: ruleStyleClass
                    {
                     before(grammarAccess.getEDOMAccess().getStyleClassParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleStyleClass();

                    state._fsp--;

                     after(grammarAccess.getEDOMAccess().getStyleClassParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDOM__Alternatives"


    // $ANTLR start "rule__InstanceEDOMFeature__Alternatives"
    // InternalT2A.g:432:1: rule__InstanceEDOMFeature__Alternatives : ( ( ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__InstanceEDOMFeature__StringAssignment_1 ) ) );
    public final void rule__InstanceEDOMFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:436:1: ( ( ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__InstanceEDOMFeature__StringAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalT2A.g:437:2: ( ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 ) )
                    {
                    // InternalT2A.g:437:2: ( ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 ) )
                    // InternalT2A.g:438:3: ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 )
                    {
                     before(grammarAccess.getInstanceEDOMFeatureAccess().getInstanciaEDOMAssignment_0()); 
                    // InternalT2A.g:439:3: ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 )
                    // InternalT2A.g:439:4: rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstanceEDOMFeatureAccess().getInstanciaEDOMAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT2A.g:443:2: ( ( rule__InstanceEDOMFeature__StringAssignment_1 ) )
                    {
                    // InternalT2A.g:443:2: ( ( rule__InstanceEDOMFeature__StringAssignment_1 ) )
                    // InternalT2A.g:444:3: ( rule__InstanceEDOMFeature__StringAssignment_1 )
                    {
                     before(grammarAccess.getInstanceEDOMFeatureAccess().getStringAssignment_1()); 
                    // InternalT2A.g:445:3: ( rule__InstanceEDOMFeature__StringAssignment_1 )
                    // InternalT2A.g:445:4: rule__InstanceEDOMFeature__StringAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__InstanceEDOMFeature__StringAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstanceEDOMFeatureAccess().getStringAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceEDOMFeature__Alternatives"


    // $ANTLR start "rule__PageFeature__Alternatives"
    // InternalT2A.g:453:1: rule__PageFeature__Alternatives : ( ( ( rule__PageFeature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__PageFeature__StringAssignment_1 ) ) );
    public final void rule__PageFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:457:1: ( ( ( rule__PageFeature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__PageFeature__StringAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalT2A.g:458:2: ( ( rule__PageFeature__InstanciaEDOMAssignment_0 ) )
                    {
                    // InternalT2A.g:458:2: ( ( rule__PageFeature__InstanciaEDOMAssignment_0 ) )
                    // InternalT2A.g:459:3: ( rule__PageFeature__InstanciaEDOMAssignment_0 )
                    {
                     before(grammarAccess.getPageFeatureAccess().getInstanciaEDOMAssignment_0()); 
                    // InternalT2A.g:460:3: ( rule__PageFeature__InstanciaEDOMAssignment_0 )
                    // InternalT2A.g:460:4: rule__PageFeature__InstanciaEDOMAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PageFeature__InstanciaEDOMAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPageFeatureAccess().getInstanciaEDOMAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT2A.g:464:2: ( ( rule__PageFeature__StringAssignment_1 ) )
                    {
                    // InternalT2A.g:464:2: ( ( rule__PageFeature__StringAssignment_1 ) )
                    // InternalT2A.g:465:3: ( rule__PageFeature__StringAssignment_1 )
                    {
                     before(grammarAccess.getPageFeatureAccess().getStringAssignment_1()); 
                    // InternalT2A.g:466:3: ( rule__PageFeature__StringAssignment_1 )
                    // InternalT2A.g:466:4: rule__PageFeature__StringAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PageFeature__StringAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPageFeatureAccess().getStringAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageFeature__Alternatives"


    // $ANTLR start "rule__Feature__Alternatives"
    // InternalT2A.g:474:1: rule__Feature__Alternatives : ( ( ( rule__Feature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__Feature__AllowSlotAssignment_1 ) ) | ( ( rule__Feature__StringAssignment_2 ) ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:478:1: ( ( ( rule__Feature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__Feature__AllowSlotAssignment_1 ) ) | ( ( rule__Feature__StringAssignment_2 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case 31:
                {
                alt7=2;
                }
                break;
            case RULE_STRING:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalT2A.g:479:2: ( ( rule__Feature__InstanciaEDOMAssignment_0 ) )
                    {
                    // InternalT2A.g:479:2: ( ( rule__Feature__InstanciaEDOMAssignment_0 ) )
                    // InternalT2A.g:480:3: ( rule__Feature__InstanciaEDOMAssignment_0 )
                    {
                     before(grammarAccess.getFeatureAccess().getInstanciaEDOMAssignment_0()); 
                    // InternalT2A.g:481:3: ( rule__Feature__InstanciaEDOMAssignment_0 )
                    // InternalT2A.g:481:4: rule__Feature__InstanciaEDOMAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__InstanciaEDOMAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureAccess().getInstanciaEDOMAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT2A.g:485:2: ( ( rule__Feature__AllowSlotAssignment_1 ) )
                    {
                    // InternalT2A.g:485:2: ( ( rule__Feature__AllowSlotAssignment_1 ) )
                    // InternalT2A.g:486:3: ( rule__Feature__AllowSlotAssignment_1 )
                    {
                     before(grammarAccess.getFeatureAccess().getAllowSlotAssignment_1()); 
                    // InternalT2A.g:487:3: ( rule__Feature__AllowSlotAssignment_1 )
                    // InternalT2A.g:487:4: rule__Feature__AllowSlotAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__AllowSlotAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureAccess().getAllowSlotAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalT2A.g:491:2: ( ( rule__Feature__StringAssignment_2 ) )
                    {
                    // InternalT2A.g:491:2: ( ( rule__Feature__StringAssignment_2 ) )
                    // InternalT2A.g:492:3: ( rule__Feature__StringAssignment_2 )
                    {
                     before(grammarAccess.getFeatureAccess().getStringAssignment_2()); 
                    // InternalT2A.g:493:3: ( rule__Feature__StringAssignment_2 )
                    // InternalT2A.g:493:4: rule__Feature__StringAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__StringAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureAccess().getStringAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Alternatives"


    // $ANTLR start "rule__Name__Alternatives"
    // InternalT2A.g:501:1: rule__Name__Alternatives : ( ( '_' ) | ( '#' ) | ( '-' ) | ( '*' ) | ( '.' ) | ( '::' ) | ( '>' ) | ( RULE_ID ) );
    public final void rule__Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:505:1: ( ( '_' ) | ( '#' ) | ( '-' ) | ( '*' ) | ( '.' ) | ( '::' ) | ( '>' ) | ( RULE_ID ) )
            int alt8=8;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt8=1;
                }
                break;
            case 13:
                {
                alt8=2;
                }
                break;
            case 14:
                {
                alt8=3;
                }
                break;
            case 15:
                {
                alt8=4;
                }
                break;
            case 16:
                {
                alt8=5;
                }
                break;
            case 17:
                {
                alt8=6;
                }
                break;
            case 18:
                {
                alt8=7;
                }
                break;
            case RULE_ID:
                {
                alt8=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalT2A.g:506:2: ( '_' )
                    {
                    // InternalT2A.g:506:2: ( '_' )
                    // InternalT2A.g:507:3: '_'
                    {
                     before(grammarAccess.getNameAccess().get_Keyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().get_Keyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT2A.g:512:2: ( '#' )
                    {
                    // InternalT2A.g:512:2: ( '#' )
                    // InternalT2A.g:513:3: '#'
                    {
                     before(grammarAccess.getNameAccess().getNumberSignKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getNumberSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalT2A.g:518:2: ( '-' )
                    {
                    // InternalT2A.g:518:2: ( '-' )
                    // InternalT2A.g:519:3: '-'
                    {
                     before(grammarAccess.getNameAccess().getHyphenMinusKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getHyphenMinusKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalT2A.g:524:2: ( '*' )
                    {
                    // InternalT2A.g:524:2: ( '*' )
                    // InternalT2A.g:525:3: '*'
                    {
                     before(grammarAccess.getNameAccess().getAsteriskKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getAsteriskKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalT2A.g:530:2: ( '.' )
                    {
                    // InternalT2A.g:530:2: ( '.' )
                    // InternalT2A.g:531:3: '.'
                    {
                     before(grammarAccess.getNameAccess().getFullStopKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getFullStopKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalT2A.g:536:2: ( '::' )
                    {
                    // InternalT2A.g:536:2: ( '::' )
                    // InternalT2A.g:537:3: '::'
                    {
                     before(grammarAccess.getNameAccess().getColonColonKeyword_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getColonColonKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalT2A.g:542:2: ( '>' )
                    {
                    // InternalT2A.g:542:2: ( '>' )
                    // InternalT2A.g:543:3: '>'
                    {
                     before(grammarAccess.getNameAccess().getGreaterThanSignKeyword_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getGreaterThanSignKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalT2A.g:548:2: ( RULE_ID )
                    {
                    // InternalT2A.g:548:2: ( RULE_ID )
                    // InternalT2A.g:549:3: RULE_ID
                    {
                     before(grammarAccess.getNameAccess().getIDTerminalRuleCall_7()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getIDTerminalRuleCall_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Alternatives"


    // $ANTLR start "rule__Page__Group__0"
    // InternalT2A.g:558:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:562:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // InternalT2A.g:563:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Page__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0"


    // $ANTLR start "rule__Page__Group__0__Impl"
    // InternalT2A.g:570:1: rule__Page__Group__0__Impl : ( 'Page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:574:1: ( ( 'Page' ) )
            // InternalT2A.g:575:1: ( 'Page' )
            {
            // InternalT2A.g:575:1: ( 'Page' )
            // InternalT2A.g:576:2: 'Page'
            {
             before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getPageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0__Impl"


    // $ANTLR start "rule__Page__Group__1"
    // InternalT2A.g:585:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:589:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // InternalT2A.g:590:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Page__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1"


    // $ANTLR start "rule__Page__Group__1__Impl"
    // InternalT2A.g:597:1: rule__Page__Group__1__Impl : ( ( rule__Page__NameAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:601:1: ( ( ( rule__Page__NameAssignment_1 ) ) )
            // InternalT2A.g:602:1: ( ( rule__Page__NameAssignment_1 ) )
            {
            // InternalT2A.g:602:1: ( ( rule__Page__NameAssignment_1 ) )
            // InternalT2A.g:603:2: ( rule__Page__NameAssignment_1 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_1()); 
            // InternalT2A.g:604:2: ( rule__Page__NameAssignment_1 )
            // InternalT2A.g:604:3: rule__Page__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Page__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1__Impl"


    // $ANTLR start "rule__Page__Group__2"
    // InternalT2A.g:612:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:616:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // InternalT2A.g:617:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Page__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2"


    // $ANTLR start "rule__Page__Group__2__Impl"
    // InternalT2A.g:624:1: rule__Page__Group__2__Impl : ( '{' ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:628:1: ( ( '{' ) )
            // InternalT2A.g:629:1: ( '{' )
            {
            // InternalT2A.g:629:1: ( '{' )
            // InternalT2A.g:630:2: '{'
            {
             before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2__Impl"


    // $ANTLR start "rule__Page__Group__3"
    // InternalT2A.g:639:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:643:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // InternalT2A.g:644:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Page__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3"


    // $ANTLR start "rule__Page__Group__3__Impl"
    // InternalT2A.g:651:1: rule__Page__Group__3__Impl : ( ( rule__Page__Group_3__0 )? ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:655:1: ( ( ( rule__Page__Group_3__0 )? ) )
            // InternalT2A.g:656:1: ( ( rule__Page__Group_3__0 )? )
            {
            // InternalT2A.g:656:1: ( ( rule__Page__Group_3__0 )? )
            // InternalT2A.g:657:2: ( rule__Page__Group_3__0 )?
            {
             before(grammarAccess.getPageAccess().getGroup_3()); 
            // InternalT2A.g:658:2: ( rule__Page__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalT2A.g:658:3: rule__Page__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPageAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3__Impl"


    // $ANTLR start "rule__Page__Group__4"
    // InternalT2A.g:666:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:670:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // InternalT2A.g:671:2: rule__Page__Group__4__Impl rule__Page__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Page__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__4"


    // $ANTLR start "rule__Page__Group__4__Impl"
    // InternalT2A.g:678:1: rule__Page__Group__4__Impl : ( ( rule__Page__HomeAssignment_4 )? ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:682:1: ( ( ( rule__Page__HomeAssignment_4 )? ) )
            // InternalT2A.g:683:1: ( ( rule__Page__HomeAssignment_4 )? )
            {
            // InternalT2A.g:683:1: ( ( rule__Page__HomeAssignment_4 )? )
            // InternalT2A.g:684:2: ( rule__Page__HomeAssignment_4 )?
            {
             before(grammarAccess.getPageAccess().getHomeAssignment_4()); 
            // InternalT2A.g:685:2: ( rule__Page__HomeAssignment_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalT2A.g:685:3: rule__Page__HomeAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__HomeAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPageAccess().getHomeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__4__Impl"


    // $ANTLR start "rule__Page__Group__5"
    // InternalT2A.g:693:1: rule__Page__Group__5 : rule__Page__Group__5__Impl rule__Page__Group__6 ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:697:1: ( rule__Page__Group__5__Impl rule__Page__Group__6 )
            // InternalT2A.g:698:2: rule__Page__Group__5__Impl rule__Page__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Page__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__5"


    // $ANTLR start "rule__Page__Group__5__Impl"
    // InternalT2A.g:705:1: rule__Page__Group__5__Impl : ( ( rule__Page__ShowInNavAssignment_5 )? ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:709:1: ( ( ( rule__Page__ShowInNavAssignment_5 )? ) )
            // InternalT2A.g:710:1: ( ( rule__Page__ShowInNavAssignment_5 )? )
            {
            // InternalT2A.g:710:1: ( ( rule__Page__ShowInNavAssignment_5 )? )
            // InternalT2A.g:711:2: ( rule__Page__ShowInNavAssignment_5 )?
            {
             before(grammarAccess.getPageAccess().getShowInNavAssignment_5()); 
            // InternalT2A.g:712:2: ( rule__Page__ShowInNavAssignment_5 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalT2A.g:712:3: rule__Page__ShowInNavAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__ShowInNavAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPageAccess().getShowInNavAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__5__Impl"


    // $ANTLR start "rule__Page__Group__6"
    // InternalT2A.g:720:1: rule__Page__Group__6 : rule__Page__Group__6__Impl rule__Page__Group__7 ;
    public final void rule__Page__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:724:1: ( rule__Page__Group__6__Impl rule__Page__Group__7 )
            // InternalT2A.g:725:2: rule__Page__Group__6__Impl rule__Page__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Page__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__6"


    // $ANTLR start "rule__Page__Group__6__Impl"
    // InternalT2A.g:732:1: rule__Page__Group__6__Impl : ( ( rule__Page__PageFeaturesAssignment_6 )* ) ;
    public final void rule__Page__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:736:1: ( ( ( rule__Page__PageFeaturesAssignment_6 )* ) )
            // InternalT2A.g:737:1: ( ( rule__Page__PageFeaturesAssignment_6 )* )
            {
            // InternalT2A.g:737:1: ( ( rule__Page__PageFeaturesAssignment_6 )* )
            // InternalT2A.g:738:2: ( rule__Page__PageFeaturesAssignment_6 )*
            {
             before(grammarAccess.getPageAccess().getPageFeaturesAssignment_6()); 
            // InternalT2A.g:739:2: ( rule__Page__PageFeaturesAssignment_6 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==RULE_STRING) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalT2A.g:739:3: rule__Page__PageFeaturesAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Page__PageFeaturesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPageAccess().getPageFeaturesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__6__Impl"


    // $ANTLR start "rule__Page__Group__7"
    // InternalT2A.g:747:1: rule__Page__Group__7 : rule__Page__Group__7__Impl ;
    public final void rule__Page__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:751:1: ( rule__Page__Group__7__Impl )
            // InternalT2A.g:752:2: rule__Page__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__7"


    // $ANTLR start "rule__Page__Group__7__Impl"
    // InternalT2A.g:758:1: rule__Page__Group__7__Impl : ( '}' ) ;
    public final void rule__Page__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:762:1: ( ( '}' ) )
            // InternalT2A.g:763:1: ( '}' )
            {
            // InternalT2A.g:763:1: ( '}' )
            // InternalT2A.g:764:2: '}'
            {
             before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__7__Impl"


    // $ANTLR start "rule__Page__Group_3__0"
    // InternalT2A.g:774:1: rule__Page__Group_3__0 : rule__Page__Group_3__0__Impl rule__Page__Group_3__1 ;
    public final void rule__Page__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:778:1: ( rule__Page__Group_3__0__Impl rule__Page__Group_3__1 )
            // InternalT2A.g:779:2: rule__Page__Group_3__0__Impl rule__Page__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Page__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_3__0"


    // $ANTLR start "rule__Page__Group_3__0__Impl"
    // InternalT2A.g:786:1: rule__Page__Group_3__0__Impl : ( 'sclass' ) ;
    public final void rule__Page__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:790:1: ( ( 'sclass' ) )
            // InternalT2A.g:791:1: ( 'sclass' )
            {
            // InternalT2A.g:791:1: ( 'sclass' )
            // InternalT2A.g:792:2: 'sclass'
            {
             before(grammarAccess.getPageAccess().getSclassKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getSclassKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_3__0__Impl"


    // $ANTLR start "rule__Page__Group_3__1"
    // InternalT2A.g:801:1: rule__Page__Group_3__1 : rule__Page__Group_3__1__Impl rule__Page__Group_3__2 ;
    public final void rule__Page__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:805:1: ( rule__Page__Group_3__1__Impl rule__Page__Group_3__2 )
            // InternalT2A.g:806:2: rule__Page__Group_3__1__Impl rule__Page__Group_3__2
            {
            pushFollow(FOLLOW_9);
            rule__Page__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_3__1"


    // $ANTLR start "rule__Page__Group_3__1__Impl"
    // InternalT2A.g:813:1: rule__Page__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Page__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:817:1: ( ( '{' ) )
            // InternalT2A.g:818:1: ( '{' )
            {
            // InternalT2A.g:818:1: ( '{' )
            // InternalT2A.g:819:2: '{'
            {
             before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_3__1__Impl"


    // $ANTLR start "rule__Page__Group_3__2"
    // InternalT2A.g:828:1: rule__Page__Group_3__2 : rule__Page__Group_3__2__Impl rule__Page__Group_3__3 ;
    public final void rule__Page__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:832:1: ( rule__Page__Group_3__2__Impl rule__Page__Group_3__3 )
            // InternalT2A.g:833:2: rule__Page__Group_3__2__Impl rule__Page__Group_3__3
            {
            pushFollow(FOLLOW_9);
            rule__Page__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_3__2"


    // $ANTLR start "rule__Page__Group_3__2__Impl"
    // InternalT2A.g:840:1: rule__Page__Group_3__2__Impl : ( ( rule__Page__HostclassesAssignment_3_2 )* ) ;
    public final void rule__Page__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:844:1: ( ( ( rule__Page__HostclassesAssignment_3_2 )* ) )
            // InternalT2A.g:845:1: ( ( rule__Page__HostclassesAssignment_3_2 )* )
            {
            // InternalT2A.g:845:1: ( ( rule__Page__HostclassesAssignment_3_2 )* )
            // InternalT2A.g:846:2: ( rule__Page__HostclassesAssignment_3_2 )*
            {
             before(grammarAccess.getPageAccess().getHostclassesAssignment_3_2()); 
            // InternalT2A.g:847:2: ( rule__Page__HostclassesAssignment_3_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalT2A.g:847:3: rule__Page__HostclassesAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Page__HostclassesAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getPageAccess().getHostclassesAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_3__2__Impl"


    // $ANTLR start "rule__Page__Group_3__3"
    // InternalT2A.g:855:1: rule__Page__Group_3__3 : rule__Page__Group_3__3__Impl ;
    public final void rule__Page__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:859:1: ( rule__Page__Group_3__3__Impl )
            // InternalT2A.g:860:2: rule__Page__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_3__3"


    // $ANTLR start "rule__Page__Group_3__3__Impl"
    // InternalT2A.g:866:1: rule__Page__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Page__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:870:1: ( ( '}' ) )
            // InternalT2A.g:871:1: ( '}' )
            {
            // InternalT2A.g:871:1: ( '}' )
            // InternalT2A.g:872:2: '}'
            {
             before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_3__3__Impl"


    // $ANTLR start "rule__StyleClass__Group__0"
    // InternalT2A.g:882:1: rule__StyleClass__Group__0 : rule__StyleClass__Group__0__Impl rule__StyleClass__Group__1 ;
    public final void rule__StyleClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:886:1: ( rule__StyleClass__Group__0__Impl rule__StyleClass__Group__1 )
            // InternalT2A.g:887:2: rule__StyleClass__Group__0__Impl rule__StyleClass__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__StyleClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group__0"


    // $ANTLR start "rule__StyleClass__Group__0__Impl"
    // InternalT2A.g:894:1: rule__StyleClass__Group__0__Impl : ( 'StyleClass' ) ;
    public final void rule__StyleClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:898:1: ( ( 'StyleClass' ) )
            // InternalT2A.g:899:1: ( 'StyleClass' )
            {
            // InternalT2A.g:899:1: ( 'StyleClass' )
            // InternalT2A.g:900:2: 'StyleClass'
            {
             before(grammarAccess.getStyleClassAccess().getStyleClassKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStyleClassAccess().getStyleClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group__0__Impl"


    // $ANTLR start "rule__StyleClass__Group__1"
    // InternalT2A.g:909:1: rule__StyleClass__Group__1 : rule__StyleClass__Group__1__Impl rule__StyleClass__Group__2 ;
    public final void rule__StyleClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:913:1: ( rule__StyleClass__Group__1__Impl rule__StyleClass__Group__2 )
            // InternalT2A.g:914:2: rule__StyleClass__Group__1__Impl rule__StyleClass__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__StyleClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group__1"


    // $ANTLR start "rule__StyleClass__Group__1__Impl"
    // InternalT2A.g:921:1: rule__StyleClass__Group__1__Impl : ( ( rule__StyleClass__NameAssignment_1 ) ) ;
    public final void rule__StyleClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:925:1: ( ( ( rule__StyleClass__NameAssignment_1 ) ) )
            // InternalT2A.g:926:1: ( ( rule__StyleClass__NameAssignment_1 ) )
            {
            // InternalT2A.g:926:1: ( ( rule__StyleClass__NameAssignment_1 ) )
            // InternalT2A.g:927:2: ( rule__StyleClass__NameAssignment_1 )
            {
             before(grammarAccess.getStyleClassAccess().getNameAssignment_1()); 
            // InternalT2A.g:928:2: ( rule__StyleClass__NameAssignment_1 )
            // InternalT2A.g:928:3: rule__StyleClass__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StyleClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStyleClassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group__1__Impl"


    // $ANTLR start "rule__StyleClass__Group__2"
    // InternalT2A.g:936:1: rule__StyleClass__Group__2 : rule__StyleClass__Group__2__Impl rule__StyleClass__Group__3 ;
    public final void rule__StyleClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:940:1: ( rule__StyleClass__Group__2__Impl rule__StyleClass__Group__3 )
            // InternalT2A.g:941:2: rule__StyleClass__Group__2__Impl rule__StyleClass__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__StyleClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group__2"


    // $ANTLR start "rule__StyleClass__Group__2__Impl"
    // InternalT2A.g:948:1: rule__StyleClass__Group__2__Impl : ( '{' ) ;
    public final void rule__StyleClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:952:1: ( ( '{' ) )
            // InternalT2A.g:953:1: ( '{' )
            {
            // InternalT2A.g:953:1: ( '{' )
            // InternalT2A.g:954:2: '{'
            {
             before(grammarAccess.getStyleClassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStyleClassAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group__2__Impl"


    // $ANTLR start "rule__StyleClass__Group__3"
    // InternalT2A.g:963:1: rule__StyleClass__Group__3 : rule__StyleClass__Group__3__Impl rule__StyleClass__Group__4 ;
    public final void rule__StyleClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:967:1: ( rule__StyleClass__Group__3__Impl rule__StyleClass__Group__4 )
            // InternalT2A.g:968:2: rule__StyleClass__Group__3__Impl rule__StyleClass__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__StyleClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleClass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group__3"


    // $ANTLR start "rule__StyleClass__Group__3__Impl"
    // InternalT2A.g:975:1: rule__StyleClass__Group__3__Impl : ( ( rule__StyleClass__Group_3__0 )* ) ;
    public final void rule__StyleClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:979:1: ( ( ( rule__StyleClass__Group_3__0 )* ) )
            // InternalT2A.g:980:1: ( ( rule__StyleClass__Group_3__0 )* )
            {
            // InternalT2A.g:980:1: ( ( rule__StyleClass__Group_3__0 )* )
            // InternalT2A.g:981:2: ( rule__StyleClass__Group_3__0 )*
            {
             before(grammarAccess.getStyleClassAccess().getGroup_3()); 
            // InternalT2A.g:982:2: ( rule__StyleClass__Group_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==EOF||(LA14_0>=RULE_ID && LA14_0<=RULE_STRING2)||(LA14_0>=12 && LA14_0<=18)||LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalT2A.g:982:3: rule__StyleClass__Group_3__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__StyleClass__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getStyleClassAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group__3__Impl"


    // $ANTLR start "rule__StyleClass__Group__4"
    // InternalT2A.g:990:1: rule__StyleClass__Group__4 : rule__StyleClass__Group__4__Impl rule__StyleClass__Group__5 ;
    public final void rule__StyleClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:994:1: ( rule__StyleClass__Group__4__Impl rule__StyleClass__Group__5 )
            // InternalT2A.g:995:2: rule__StyleClass__Group__4__Impl rule__StyleClass__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__StyleClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleClass__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group__4"


    // $ANTLR start "rule__StyleClass__Group__4__Impl"
    // InternalT2A.g:1002:1: rule__StyleClass__Group__4__Impl : ( ( rule__StyleClass__Group_4__0 )? ) ;
    public final void rule__StyleClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1006:1: ( ( ( rule__StyleClass__Group_4__0 )? ) )
            // InternalT2A.g:1007:1: ( ( rule__StyleClass__Group_4__0 )? )
            {
            // InternalT2A.g:1007:1: ( ( rule__StyleClass__Group_4__0 )? )
            // InternalT2A.g:1008:2: ( rule__StyleClass__Group_4__0 )?
            {
             before(grammarAccess.getStyleClassAccess().getGroup_4()); 
            // InternalT2A.g:1009:2: ( rule__StyleClass__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalT2A.g:1009:3: rule__StyleClass__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StyleClass__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStyleClassAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group__4__Impl"


    // $ANTLR start "rule__StyleClass__Group__5"
    // InternalT2A.g:1017:1: rule__StyleClass__Group__5 : rule__StyleClass__Group__5__Impl rule__StyleClass__Group__6 ;
    public final void rule__StyleClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1021:1: ( rule__StyleClass__Group__5__Impl rule__StyleClass__Group__6 )
            // InternalT2A.g:1022:2: rule__StyleClass__Group__5__Impl rule__StyleClass__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__StyleClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleClass__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group__5"


    // $ANTLR start "rule__StyleClass__Group__5__Impl"
    // InternalT2A.g:1029:1: rule__StyleClass__Group__5__Impl : ( ( rule__StyleClass__Group_5__0 )? ) ;
    public final void rule__StyleClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1033:1: ( ( ( rule__StyleClass__Group_5__0 )? ) )
            // InternalT2A.g:1034:1: ( ( rule__StyleClass__Group_5__0 )? )
            {
            // InternalT2A.g:1034:1: ( ( rule__StyleClass__Group_5__0 )? )
            // InternalT2A.g:1035:2: ( rule__StyleClass__Group_5__0 )?
            {
             before(grammarAccess.getStyleClassAccess().getGroup_5()); 
            // InternalT2A.g:1036:2: ( rule__StyleClass__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalT2A.g:1036:3: rule__StyleClass__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StyleClass__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStyleClassAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group__5__Impl"


    // $ANTLR start "rule__StyleClass__Group__6"
    // InternalT2A.g:1044:1: rule__StyleClass__Group__6 : rule__StyleClass__Group__6__Impl ;
    public final void rule__StyleClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1048:1: ( rule__StyleClass__Group__6__Impl )
            // InternalT2A.g:1049:2: rule__StyleClass__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StyleClass__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group__6"


    // $ANTLR start "rule__StyleClass__Group__6__Impl"
    // InternalT2A.g:1055:1: rule__StyleClass__Group__6__Impl : ( '}' ) ;
    public final void rule__StyleClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1059:1: ( ( '}' ) )
            // InternalT2A.g:1060:1: ( '}' )
            {
            // InternalT2A.g:1060:1: ( '}' )
            // InternalT2A.g:1061:2: '}'
            {
             before(grammarAccess.getStyleClassAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStyleClassAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group__6__Impl"


    // $ANTLR start "rule__StyleClass__Group_3__0"
    // InternalT2A.g:1071:1: rule__StyleClass__Group_3__0 : rule__StyleClass__Group_3__0__Impl rule__StyleClass__Group_3__1 ;
    public final void rule__StyleClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1075:1: ( rule__StyleClass__Group_3__0__Impl rule__StyleClass__Group_3__1 )
            // InternalT2A.g:1076:2: rule__StyleClass__Group_3__0__Impl rule__StyleClass__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__StyleClass__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleClass__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_3__0"


    // $ANTLR start "rule__StyleClass__Group_3__0__Impl"
    // InternalT2A.g:1083:1: rule__StyleClass__Group_3__0__Impl : ( ( rule__StyleClass__SattributesAssignment_3_0 ) ) ;
    public final void rule__StyleClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1087:1: ( ( ( rule__StyleClass__SattributesAssignment_3_0 ) ) )
            // InternalT2A.g:1088:1: ( ( rule__StyleClass__SattributesAssignment_3_0 ) )
            {
            // InternalT2A.g:1088:1: ( ( rule__StyleClass__SattributesAssignment_3_0 ) )
            // InternalT2A.g:1089:2: ( rule__StyleClass__SattributesAssignment_3_0 )
            {
             before(grammarAccess.getStyleClassAccess().getSattributesAssignment_3_0()); 
            // InternalT2A.g:1090:2: ( rule__StyleClass__SattributesAssignment_3_0 )
            // InternalT2A.g:1090:3: rule__StyleClass__SattributesAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__StyleClass__SattributesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getStyleClassAccess().getSattributesAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_3__0__Impl"


    // $ANTLR start "rule__StyleClass__Group_3__1"
    // InternalT2A.g:1098:1: rule__StyleClass__Group_3__1 : rule__StyleClass__Group_3__1__Impl ;
    public final void rule__StyleClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1102:1: ( rule__StyleClass__Group_3__1__Impl )
            // InternalT2A.g:1103:2: rule__StyleClass__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StyleClass__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_3__1"


    // $ANTLR start "rule__StyleClass__Group_3__1__Impl"
    // InternalT2A.g:1109:1: rule__StyleClass__Group_3__1__Impl : ( ';' ) ;
    public final void rule__StyleClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1113:1: ( ( ';' ) )
            // InternalT2A.g:1114:1: ( ';' )
            {
            // InternalT2A.g:1114:1: ( ';' )
            // InternalT2A.g:1115:2: ';'
            {
             before(grammarAccess.getStyleClassAccess().getSemicolonKeyword_3_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStyleClassAccess().getSemicolonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_3__1__Impl"


    // $ANTLR start "rule__StyleClass__Group_4__0"
    // InternalT2A.g:1125:1: rule__StyleClass__Group_4__0 : rule__StyleClass__Group_4__0__Impl rule__StyleClass__Group_4__1 ;
    public final void rule__StyleClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1129:1: ( rule__StyleClass__Group_4__0__Impl rule__StyleClass__Group_4__1 )
            // InternalT2A.g:1130:2: rule__StyleClass__Group_4__0__Impl rule__StyleClass__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__StyleClass__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleClass__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_4__0"


    // $ANTLR start "rule__StyleClass__Group_4__0__Impl"
    // InternalT2A.g:1137:1: rule__StyleClass__Group_4__0__Impl : ( 'after' ) ;
    public final void rule__StyleClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1141:1: ( ( 'after' ) )
            // InternalT2A.g:1142:1: ( 'after' )
            {
            // InternalT2A.g:1142:1: ( 'after' )
            // InternalT2A.g:1143:2: 'after'
            {
             before(grammarAccess.getStyleClassAccess().getAfterKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStyleClassAccess().getAfterKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_4__0__Impl"


    // $ANTLR start "rule__StyleClass__Group_4__1"
    // InternalT2A.g:1152:1: rule__StyleClass__Group_4__1 : rule__StyleClass__Group_4__1__Impl rule__StyleClass__Group_4__2 ;
    public final void rule__StyleClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1156:1: ( rule__StyleClass__Group_4__1__Impl rule__StyleClass__Group_4__2 )
            // InternalT2A.g:1157:2: rule__StyleClass__Group_4__1__Impl rule__StyleClass__Group_4__2
            {
            pushFollow(FOLLOW_14);
            rule__StyleClass__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleClass__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_4__1"


    // $ANTLR start "rule__StyleClass__Group_4__1__Impl"
    // InternalT2A.g:1164:1: rule__StyleClass__Group_4__1__Impl : ( '{' ) ;
    public final void rule__StyleClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1168:1: ( ( '{' ) )
            // InternalT2A.g:1169:1: ( '{' )
            {
            // InternalT2A.g:1169:1: ( '{' )
            // InternalT2A.g:1170:2: '{'
            {
             before(grammarAccess.getStyleClassAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStyleClassAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_4__1__Impl"


    // $ANTLR start "rule__StyleClass__Group_4__2"
    // InternalT2A.g:1179:1: rule__StyleClass__Group_4__2 : rule__StyleClass__Group_4__2__Impl rule__StyleClass__Group_4__3 ;
    public final void rule__StyleClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1183:1: ( rule__StyleClass__Group_4__2__Impl rule__StyleClass__Group_4__3 )
            // InternalT2A.g:1184:2: rule__StyleClass__Group_4__2__Impl rule__StyleClass__Group_4__3
            {
            pushFollow(FOLLOW_14);
            rule__StyleClass__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleClass__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_4__2"


    // $ANTLR start "rule__StyleClass__Group_4__2__Impl"
    // InternalT2A.g:1191:1: rule__StyleClass__Group_4__2__Impl : ( ( rule__StyleClass__Group_4_2__0 )* ) ;
    public final void rule__StyleClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1195:1: ( ( ( rule__StyleClass__Group_4_2__0 )* ) )
            // InternalT2A.g:1196:1: ( ( rule__StyleClass__Group_4_2__0 )* )
            {
            // InternalT2A.g:1196:1: ( ( rule__StyleClass__Group_4_2__0 )* )
            // InternalT2A.g:1197:2: ( rule__StyleClass__Group_4_2__0 )*
            {
             before(grammarAccess.getStyleClassAccess().getGroup_4_2()); 
            // InternalT2A.g:1198:2: ( rule__StyleClass__Group_4_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==EOF||(LA17_0>=RULE_ID && LA17_0<=RULE_STRING2)||(LA17_0>=12 && LA17_0<=18)||LA17_0==20) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalT2A.g:1198:3: rule__StyleClass__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__StyleClass__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getStyleClassAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_4__2__Impl"


    // $ANTLR start "rule__StyleClass__Group_4__3"
    // InternalT2A.g:1206:1: rule__StyleClass__Group_4__3 : rule__StyleClass__Group_4__3__Impl ;
    public final void rule__StyleClass__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1210:1: ( rule__StyleClass__Group_4__3__Impl )
            // InternalT2A.g:1211:2: rule__StyleClass__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StyleClass__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_4__3"


    // $ANTLR start "rule__StyleClass__Group_4__3__Impl"
    // InternalT2A.g:1217:1: rule__StyleClass__Group_4__3__Impl : ( '}' ) ;
    public final void rule__StyleClass__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1221:1: ( ( '}' ) )
            // InternalT2A.g:1222:1: ( '}' )
            {
            // InternalT2A.g:1222:1: ( '}' )
            // InternalT2A.g:1223:2: '}'
            {
             before(grammarAccess.getStyleClassAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStyleClassAccess().getRightCurlyBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_4__3__Impl"


    // $ANTLR start "rule__StyleClass__Group_4_2__0"
    // InternalT2A.g:1233:1: rule__StyleClass__Group_4_2__0 : rule__StyleClass__Group_4_2__0__Impl rule__StyleClass__Group_4_2__1 ;
    public final void rule__StyleClass__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1237:1: ( rule__StyleClass__Group_4_2__0__Impl rule__StyleClass__Group_4_2__1 )
            // InternalT2A.g:1238:2: rule__StyleClass__Group_4_2__0__Impl rule__StyleClass__Group_4_2__1
            {
            pushFollow(FOLLOW_13);
            rule__StyleClass__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleClass__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_4_2__0"


    // $ANTLR start "rule__StyleClass__Group_4_2__0__Impl"
    // InternalT2A.g:1245:1: rule__StyleClass__Group_4_2__0__Impl : ( ( rule__StyleClass__SattributesAfterAssignment_4_2_0 ) ) ;
    public final void rule__StyleClass__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1249:1: ( ( ( rule__StyleClass__SattributesAfterAssignment_4_2_0 ) ) )
            // InternalT2A.g:1250:1: ( ( rule__StyleClass__SattributesAfterAssignment_4_2_0 ) )
            {
            // InternalT2A.g:1250:1: ( ( rule__StyleClass__SattributesAfterAssignment_4_2_0 ) )
            // InternalT2A.g:1251:2: ( rule__StyleClass__SattributesAfterAssignment_4_2_0 )
            {
             before(grammarAccess.getStyleClassAccess().getSattributesAfterAssignment_4_2_0()); 
            // InternalT2A.g:1252:2: ( rule__StyleClass__SattributesAfterAssignment_4_2_0 )
            // InternalT2A.g:1252:3: rule__StyleClass__SattributesAfterAssignment_4_2_0
            {
            pushFollow(FOLLOW_2);
            rule__StyleClass__SattributesAfterAssignment_4_2_0();

            state._fsp--;


            }

             after(grammarAccess.getStyleClassAccess().getSattributesAfterAssignment_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_4_2__0__Impl"


    // $ANTLR start "rule__StyleClass__Group_4_2__1"
    // InternalT2A.g:1260:1: rule__StyleClass__Group_4_2__1 : rule__StyleClass__Group_4_2__1__Impl ;
    public final void rule__StyleClass__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1264:1: ( rule__StyleClass__Group_4_2__1__Impl )
            // InternalT2A.g:1265:2: rule__StyleClass__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StyleClass__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_4_2__1"


    // $ANTLR start "rule__StyleClass__Group_4_2__1__Impl"
    // InternalT2A.g:1271:1: rule__StyleClass__Group_4_2__1__Impl : ( ';' ) ;
    public final void rule__StyleClass__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1275:1: ( ( ';' ) )
            // InternalT2A.g:1276:1: ( ';' )
            {
            // InternalT2A.g:1276:1: ( ';' )
            // InternalT2A.g:1277:2: ';'
            {
             before(grammarAccess.getStyleClassAccess().getSemicolonKeyword_4_2_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStyleClassAccess().getSemicolonKeyword_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_4_2__1__Impl"


    // $ANTLR start "rule__StyleClass__Group_5__0"
    // InternalT2A.g:1287:1: rule__StyleClass__Group_5__0 : rule__StyleClass__Group_5__0__Impl rule__StyleClass__Group_5__1 ;
    public final void rule__StyleClass__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1291:1: ( rule__StyleClass__Group_5__0__Impl rule__StyleClass__Group_5__1 )
            // InternalT2A.g:1292:2: rule__StyleClass__Group_5__0__Impl rule__StyleClass__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__StyleClass__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleClass__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_5__0"


    // $ANTLR start "rule__StyleClass__Group_5__0__Impl"
    // InternalT2A.g:1299:1: rule__StyleClass__Group_5__0__Impl : ( 'active' ) ;
    public final void rule__StyleClass__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1303:1: ( ( 'active' ) )
            // InternalT2A.g:1304:1: ( 'active' )
            {
            // InternalT2A.g:1304:1: ( 'active' )
            // InternalT2A.g:1305:2: 'active'
            {
             before(grammarAccess.getStyleClassAccess().getActiveKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStyleClassAccess().getActiveKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_5__0__Impl"


    // $ANTLR start "rule__StyleClass__Group_5__1"
    // InternalT2A.g:1314:1: rule__StyleClass__Group_5__1 : rule__StyleClass__Group_5__1__Impl rule__StyleClass__Group_5__2 ;
    public final void rule__StyleClass__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1318:1: ( rule__StyleClass__Group_5__1__Impl rule__StyleClass__Group_5__2 )
            // InternalT2A.g:1319:2: rule__StyleClass__Group_5__1__Impl rule__StyleClass__Group_5__2
            {
            pushFollow(FOLLOW_14);
            rule__StyleClass__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleClass__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_5__1"


    // $ANTLR start "rule__StyleClass__Group_5__1__Impl"
    // InternalT2A.g:1326:1: rule__StyleClass__Group_5__1__Impl : ( '{' ) ;
    public final void rule__StyleClass__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1330:1: ( ( '{' ) )
            // InternalT2A.g:1331:1: ( '{' )
            {
            // InternalT2A.g:1331:1: ( '{' )
            // InternalT2A.g:1332:2: '{'
            {
             before(grammarAccess.getStyleClassAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStyleClassAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_5__1__Impl"


    // $ANTLR start "rule__StyleClass__Group_5__2"
    // InternalT2A.g:1341:1: rule__StyleClass__Group_5__2 : rule__StyleClass__Group_5__2__Impl rule__StyleClass__Group_5__3 ;
    public final void rule__StyleClass__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1345:1: ( rule__StyleClass__Group_5__2__Impl rule__StyleClass__Group_5__3 )
            // InternalT2A.g:1346:2: rule__StyleClass__Group_5__2__Impl rule__StyleClass__Group_5__3
            {
            pushFollow(FOLLOW_14);
            rule__StyleClass__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleClass__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_5__2"


    // $ANTLR start "rule__StyleClass__Group_5__2__Impl"
    // InternalT2A.g:1353:1: rule__StyleClass__Group_5__2__Impl : ( ( rule__StyleClass__Group_5_2__0 )* ) ;
    public final void rule__StyleClass__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1357:1: ( ( ( rule__StyleClass__Group_5_2__0 )* ) )
            // InternalT2A.g:1358:1: ( ( rule__StyleClass__Group_5_2__0 )* )
            {
            // InternalT2A.g:1358:1: ( ( rule__StyleClass__Group_5_2__0 )* )
            // InternalT2A.g:1359:2: ( rule__StyleClass__Group_5_2__0 )*
            {
             before(grammarAccess.getStyleClassAccess().getGroup_5_2()); 
            // InternalT2A.g:1360:2: ( rule__StyleClass__Group_5_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==EOF||(LA18_0>=RULE_ID && LA18_0<=RULE_STRING2)||(LA18_0>=12 && LA18_0<=18)||LA18_0==20) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalT2A.g:1360:3: rule__StyleClass__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__StyleClass__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getStyleClassAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_5__2__Impl"


    // $ANTLR start "rule__StyleClass__Group_5__3"
    // InternalT2A.g:1368:1: rule__StyleClass__Group_5__3 : rule__StyleClass__Group_5__3__Impl ;
    public final void rule__StyleClass__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1372:1: ( rule__StyleClass__Group_5__3__Impl )
            // InternalT2A.g:1373:2: rule__StyleClass__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StyleClass__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_5__3"


    // $ANTLR start "rule__StyleClass__Group_5__3__Impl"
    // InternalT2A.g:1379:1: rule__StyleClass__Group_5__3__Impl : ( '}' ) ;
    public final void rule__StyleClass__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1383:1: ( ( '}' ) )
            // InternalT2A.g:1384:1: ( '}' )
            {
            // InternalT2A.g:1384:1: ( '}' )
            // InternalT2A.g:1385:2: '}'
            {
             before(grammarAccess.getStyleClassAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStyleClassAccess().getRightCurlyBracketKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_5__3__Impl"


    // $ANTLR start "rule__StyleClass__Group_5_2__0"
    // InternalT2A.g:1395:1: rule__StyleClass__Group_5_2__0 : rule__StyleClass__Group_5_2__0__Impl rule__StyleClass__Group_5_2__1 ;
    public final void rule__StyleClass__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1399:1: ( rule__StyleClass__Group_5_2__0__Impl rule__StyleClass__Group_5_2__1 )
            // InternalT2A.g:1400:2: rule__StyleClass__Group_5_2__0__Impl rule__StyleClass__Group_5_2__1
            {
            pushFollow(FOLLOW_13);
            rule__StyleClass__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleClass__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_5_2__0"


    // $ANTLR start "rule__StyleClass__Group_5_2__0__Impl"
    // InternalT2A.g:1407:1: rule__StyleClass__Group_5_2__0__Impl : ( ( rule__StyleClass__SattributesActiveAssignment_5_2_0 ) ) ;
    public final void rule__StyleClass__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1411:1: ( ( ( rule__StyleClass__SattributesActiveAssignment_5_2_0 ) ) )
            // InternalT2A.g:1412:1: ( ( rule__StyleClass__SattributesActiveAssignment_5_2_0 ) )
            {
            // InternalT2A.g:1412:1: ( ( rule__StyleClass__SattributesActiveAssignment_5_2_0 ) )
            // InternalT2A.g:1413:2: ( rule__StyleClass__SattributesActiveAssignment_5_2_0 )
            {
             before(grammarAccess.getStyleClassAccess().getSattributesActiveAssignment_5_2_0()); 
            // InternalT2A.g:1414:2: ( rule__StyleClass__SattributesActiveAssignment_5_2_0 )
            // InternalT2A.g:1414:3: rule__StyleClass__SattributesActiveAssignment_5_2_0
            {
            pushFollow(FOLLOW_2);
            rule__StyleClass__SattributesActiveAssignment_5_2_0();

            state._fsp--;


            }

             after(grammarAccess.getStyleClassAccess().getSattributesActiveAssignment_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_5_2__0__Impl"


    // $ANTLR start "rule__StyleClass__Group_5_2__1"
    // InternalT2A.g:1422:1: rule__StyleClass__Group_5_2__1 : rule__StyleClass__Group_5_2__1__Impl ;
    public final void rule__StyleClass__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1426:1: ( rule__StyleClass__Group_5_2__1__Impl )
            // InternalT2A.g:1427:2: rule__StyleClass__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StyleClass__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_5_2__1"


    // $ANTLR start "rule__StyleClass__Group_5_2__1__Impl"
    // InternalT2A.g:1433:1: rule__StyleClass__Group_5_2__1__Impl : ( ';' ) ;
    public final void rule__StyleClass__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1437:1: ( ( ';' ) )
            // InternalT2A.g:1438:1: ( ';' )
            {
            // InternalT2A.g:1438:1: ( ';' )
            // InternalT2A.g:1439:2: ';'
            {
             before(grammarAccess.getStyleClassAccess().getSemicolonKeyword_5_2_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStyleClassAccess().getSemicolonKeyword_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__Group_5_2__1__Impl"


    // $ANTLR start "rule__SAttributeAndValue__Group__0"
    // InternalT2A.g:1449:1: rule__SAttributeAndValue__Group__0 : rule__SAttributeAndValue__Group__0__Impl rule__SAttributeAndValue__Group__1 ;
    public final void rule__SAttributeAndValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1453:1: ( rule__SAttributeAndValue__Group__0__Impl rule__SAttributeAndValue__Group__1 )
            // InternalT2A.g:1454:2: rule__SAttributeAndValue__Group__0__Impl rule__SAttributeAndValue__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__SAttributeAndValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAttributeAndValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttributeAndValue__Group__0"


    // $ANTLR start "rule__SAttributeAndValue__Group__0__Impl"
    // InternalT2A.g:1461:1: rule__SAttributeAndValue__Group__0__Impl : ( ( rule__SAttributeAndValue__StnameAssignment_0 ) ) ;
    public final void rule__SAttributeAndValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1465:1: ( ( ( rule__SAttributeAndValue__StnameAssignment_0 ) ) )
            // InternalT2A.g:1466:1: ( ( rule__SAttributeAndValue__StnameAssignment_0 ) )
            {
            // InternalT2A.g:1466:1: ( ( rule__SAttributeAndValue__StnameAssignment_0 ) )
            // InternalT2A.g:1467:2: ( rule__SAttributeAndValue__StnameAssignment_0 )
            {
             before(grammarAccess.getSAttributeAndValueAccess().getStnameAssignment_0()); 
            // InternalT2A.g:1468:2: ( rule__SAttributeAndValue__StnameAssignment_0 )
            // InternalT2A.g:1468:3: rule__SAttributeAndValue__StnameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SAttributeAndValue__StnameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSAttributeAndValueAccess().getStnameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttributeAndValue__Group__0__Impl"


    // $ANTLR start "rule__SAttributeAndValue__Group__1"
    // InternalT2A.g:1476:1: rule__SAttributeAndValue__Group__1 : rule__SAttributeAndValue__Group__1__Impl ;
    public final void rule__SAttributeAndValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1480:1: ( rule__SAttributeAndValue__Group__1__Impl )
            // InternalT2A.g:1481:2: rule__SAttributeAndValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAttributeAndValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttributeAndValue__Group__1"


    // $ANTLR start "rule__SAttributeAndValue__Group__1__Impl"
    // InternalT2A.g:1487:1: rule__SAttributeAndValue__Group__1__Impl : ( ( rule__SAttributeAndValue__ValueAssignment_1 ) ) ;
    public final void rule__SAttributeAndValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1491:1: ( ( ( rule__SAttributeAndValue__ValueAssignment_1 ) ) )
            // InternalT2A.g:1492:1: ( ( rule__SAttributeAndValue__ValueAssignment_1 ) )
            {
            // InternalT2A.g:1492:1: ( ( rule__SAttributeAndValue__ValueAssignment_1 ) )
            // InternalT2A.g:1493:2: ( rule__SAttributeAndValue__ValueAssignment_1 )
            {
             before(grammarAccess.getSAttributeAndValueAccess().getValueAssignment_1()); 
            // InternalT2A.g:1494:2: ( rule__SAttributeAndValue__ValueAssignment_1 )
            // InternalT2A.g:1494:3: rule__SAttributeAndValue__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SAttributeAndValue__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSAttributeAndValueAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttributeAndValue__Group__1__Impl"


    // $ANTLR start "rule__DOM__Group__0"
    // InternalT2A.g:1503:1: rule__DOM__Group__0 : rule__DOM__Group__0__Impl rule__DOM__Group__1 ;
    public final void rule__DOM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1507:1: ( rule__DOM__Group__0__Impl rule__DOM__Group__1 )
            // InternalT2A.g:1508:2: rule__DOM__Group__0__Impl rule__DOM__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DOM__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOM__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group__0"


    // $ANTLR start "rule__DOM__Group__0__Impl"
    // InternalT2A.g:1515:1: rule__DOM__Group__0__Impl : ( 'Dom' ) ;
    public final void rule__DOM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1519:1: ( ( 'Dom' ) )
            // InternalT2A.g:1520:1: ( 'Dom' )
            {
            // InternalT2A.g:1520:1: ( 'Dom' )
            // InternalT2A.g:1521:2: 'Dom'
            {
             before(grammarAccess.getDOMAccess().getDomKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDOMAccess().getDomKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group__0__Impl"


    // $ANTLR start "rule__DOM__Group__1"
    // InternalT2A.g:1530:1: rule__DOM__Group__1 : rule__DOM__Group__1__Impl rule__DOM__Group__2 ;
    public final void rule__DOM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1534:1: ( rule__DOM__Group__1__Impl rule__DOM__Group__2 )
            // InternalT2A.g:1535:2: rule__DOM__Group__1__Impl rule__DOM__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__DOM__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOM__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group__1"


    // $ANTLR start "rule__DOM__Group__1__Impl"
    // InternalT2A.g:1542:1: rule__DOM__Group__1__Impl : ( ( rule__DOM__NameAssignment_1 ) ) ;
    public final void rule__DOM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1546:1: ( ( ( rule__DOM__NameAssignment_1 ) ) )
            // InternalT2A.g:1547:1: ( ( rule__DOM__NameAssignment_1 ) )
            {
            // InternalT2A.g:1547:1: ( ( rule__DOM__NameAssignment_1 ) )
            // InternalT2A.g:1548:2: ( rule__DOM__NameAssignment_1 )
            {
             before(grammarAccess.getDOMAccess().getNameAssignment_1()); 
            // InternalT2A.g:1549:2: ( rule__DOM__NameAssignment_1 )
            // InternalT2A.g:1549:3: rule__DOM__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DOM__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDOMAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group__1__Impl"


    // $ANTLR start "rule__DOM__Group__2"
    // InternalT2A.g:1557:1: rule__DOM__Group__2 : rule__DOM__Group__2__Impl ;
    public final void rule__DOM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1561:1: ( rule__DOM__Group__2__Impl )
            // InternalT2A.g:1562:2: rule__DOM__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOM__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group__2"


    // $ANTLR start "rule__DOM__Group__2__Impl"
    // InternalT2A.g:1568:1: rule__DOM__Group__2__Impl : ( ( rule__DOM__Group_2__0 )? ) ;
    public final void rule__DOM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1572:1: ( ( ( rule__DOM__Group_2__0 )? ) )
            // InternalT2A.g:1573:1: ( ( rule__DOM__Group_2__0 )? )
            {
            // InternalT2A.g:1573:1: ( ( rule__DOM__Group_2__0 )? )
            // InternalT2A.g:1574:2: ( rule__DOM__Group_2__0 )?
            {
             before(grammarAccess.getDOMAccess().getGroup_2()); 
            // InternalT2A.g:1575:2: ( rule__DOM__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalT2A.g:1575:3: rule__DOM__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DOM__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDOMAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group__2__Impl"


    // $ANTLR start "rule__DOM__Group_2__0"
    // InternalT2A.g:1584:1: rule__DOM__Group_2__0 : rule__DOM__Group_2__0__Impl rule__DOM__Group_2__1 ;
    public final void rule__DOM__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1588:1: ( rule__DOM__Group_2__0__Impl rule__DOM__Group_2__1 )
            // InternalT2A.g:1589:2: rule__DOM__Group_2__0__Impl rule__DOM__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__DOM__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOM__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group_2__0"


    // $ANTLR start "rule__DOM__Group_2__0__Impl"
    // InternalT2A.g:1596:1: rule__DOM__Group_2__0__Impl : ( '{' ) ;
    public final void rule__DOM__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1600:1: ( ( '{' ) )
            // InternalT2A.g:1601:1: ( '{' )
            {
            // InternalT2A.g:1601:1: ( '{' )
            // InternalT2A.g:1602:2: '{'
            {
             before(grammarAccess.getDOMAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDOMAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group_2__0__Impl"


    // $ANTLR start "rule__DOM__Group_2__1"
    // InternalT2A.g:1611:1: rule__DOM__Group_2__1 : rule__DOM__Group_2__1__Impl rule__DOM__Group_2__2 ;
    public final void rule__DOM__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1615:1: ( rule__DOM__Group_2__1__Impl rule__DOM__Group_2__2 )
            // InternalT2A.g:1616:2: rule__DOM__Group_2__1__Impl rule__DOM__Group_2__2
            {
            pushFollow(FOLLOW_16);
            rule__DOM__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOM__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group_2__1"


    // $ANTLR start "rule__DOM__Group_2__1__Impl"
    // InternalT2A.g:1623:1: rule__DOM__Group_2__1__Impl : ( ( rule__DOM__Group_2_1__0 )? ) ;
    public final void rule__DOM__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1627:1: ( ( ( rule__DOM__Group_2_1__0 )? ) )
            // InternalT2A.g:1628:1: ( ( rule__DOM__Group_2_1__0 )? )
            {
            // InternalT2A.g:1628:1: ( ( rule__DOM__Group_2_1__0 )? )
            // InternalT2A.g:1629:2: ( rule__DOM__Group_2_1__0 )?
            {
             before(grammarAccess.getDOMAccess().getGroup_2_1()); 
            // InternalT2A.g:1630:2: ( rule__DOM__Group_2_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalT2A.g:1630:3: rule__DOM__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DOM__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDOMAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group_2__1__Impl"


    // $ANTLR start "rule__DOM__Group_2__2"
    // InternalT2A.g:1638:1: rule__DOM__Group_2__2 : rule__DOM__Group_2__2__Impl rule__DOM__Group_2__3 ;
    public final void rule__DOM__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1642:1: ( rule__DOM__Group_2__2__Impl rule__DOM__Group_2__3 )
            // InternalT2A.g:1643:2: rule__DOM__Group_2__2__Impl rule__DOM__Group_2__3
            {
            pushFollow(FOLLOW_16);
            rule__DOM__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOM__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group_2__2"


    // $ANTLR start "rule__DOM__Group_2__2__Impl"
    // InternalT2A.g:1650:1: rule__DOM__Group_2__2__Impl : ( ( rule__DOM__FeaturesAssignment_2_2 )* ) ;
    public final void rule__DOM__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1654:1: ( ( ( rule__DOM__FeaturesAssignment_2_2 )* ) )
            // InternalT2A.g:1655:1: ( ( rule__DOM__FeaturesAssignment_2_2 )* )
            {
            // InternalT2A.g:1655:1: ( ( rule__DOM__FeaturesAssignment_2_2 )* )
            // InternalT2A.g:1656:2: ( rule__DOM__FeaturesAssignment_2_2 )*
            {
             before(grammarAccess.getDOMAccess().getFeaturesAssignment_2_2()); 
            // InternalT2A.g:1657:2: ( rule__DOM__FeaturesAssignment_2_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==RULE_STRING||LA21_0==31) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalT2A.g:1657:3: rule__DOM__FeaturesAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__DOM__FeaturesAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getDOMAccess().getFeaturesAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group_2__2__Impl"


    // $ANTLR start "rule__DOM__Group_2__3"
    // InternalT2A.g:1665:1: rule__DOM__Group_2__3 : rule__DOM__Group_2__3__Impl ;
    public final void rule__DOM__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1669:1: ( rule__DOM__Group_2__3__Impl )
            // InternalT2A.g:1670:2: rule__DOM__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOM__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group_2__3"


    // $ANTLR start "rule__DOM__Group_2__3__Impl"
    // InternalT2A.g:1676:1: rule__DOM__Group_2__3__Impl : ( '}' ) ;
    public final void rule__DOM__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1680:1: ( ( '}' ) )
            // InternalT2A.g:1681:1: ( '}' )
            {
            // InternalT2A.g:1681:1: ( '}' )
            // InternalT2A.g:1682:2: '}'
            {
             before(grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group_2__3__Impl"


    // $ANTLR start "rule__DOM__Group_2_1__0"
    // InternalT2A.g:1692:1: rule__DOM__Group_2_1__0 : rule__DOM__Group_2_1__0__Impl rule__DOM__Group_2_1__1 ;
    public final void rule__DOM__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1696:1: ( rule__DOM__Group_2_1__0__Impl rule__DOM__Group_2_1__1 )
            // InternalT2A.g:1697:2: rule__DOM__Group_2_1__0__Impl rule__DOM__Group_2_1__1
            {
            pushFollow(FOLLOW_6);
            rule__DOM__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOM__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group_2_1__0"


    // $ANTLR start "rule__DOM__Group_2_1__0__Impl"
    // InternalT2A.g:1704:1: rule__DOM__Group_2_1__0__Impl : ( 'sclass' ) ;
    public final void rule__DOM__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1708:1: ( ( 'sclass' ) )
            // InternalT2A.g:1709:1: ( 'sclass' )
            {
            // InternalT2A.g:1709:1: ( 'sclass' )
            // InternalT2A.g:1710:2: 'sclass'
            {
             before(grammarAccess.getDOMAccess().getSclassKeyword_2_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDOMAccess().getSclassKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group_2_1__0__Impl"


    // $ANTLR start "rule__DOM__Group_2_1__1"
    // InternalT2A.g:1719:1: rule__DOM__Group_2_1__1 : rule__DOM__Group_2_1__1__Impl rule__DOM__Group_2_1__2 ;
    public final void rule__DOM__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1723:1: ( rule__DOM__Group_2_1__1__Impl rule__DOM__Group_2_1__2 )
            // InternalT2A.g:1724:2: rule__DOM__Group_2_1__1__Impl rule__DOM__Group_2_1__2
            {
            pushFollow(FOLLOW_9);
            rule__DOM__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOM__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group_2_1__1"


    // $ANTLR start "rule__DOM__Group_2_1__1__Impl"
    // InternalT2A.g:1731:1: rule__DOM__Group_2_1__1__Impl : ( '{' ) ;
    public final void rule__DOM__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1735:1: ( ( '{' ) )
            // InternalT2A.g:1736:1: ( '{' )
            {
            // InternalT2A.g:1736:1: ( '{' )
            // InternalT2A.g:1737:2: '{'
            {
             before(grammarAccess.getDOMAccess().getLeftCurlyBracketKeyword_2_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDOMAccess().getLeftCurlyBracketKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group_2_1__1__Impl"


    // $ANTLR start "rule__DOM__Group_2_1__2"
    // InternalT2A.g:1746:1: rule__DOM__Group_2_1__2 : rule__DOM__Group_2_1__2__Impl rule__DOM__Group_2_1__3 ;
    public final void rule__DOM__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1750:1: ( rule__DOM__Group_2_1__2__Impl rule__DOM__Group_2_1__3 )
            // InternalT2A.g:1751:2: rule__DOM__Group_2_1__2__Impl rule__DOM__Group_2_1__3
            {
            pushFollow(FOLLOW_9);
            rule__DOM__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOM__Group_2_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group_2_1__2"


    // $ANTLR start "rule__DOM__Group_2_1__2__Impl"
    // InternalT2A.g:1758:1: rule__DOM__Group_2_1__2__Impl : ( ( rule__DOM__SclassesAssignment_2_1_2 )* ) ;
    public final void rule__DOM__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1762:1: ( ( ( rule__DOM__SclassesAssignment_2_1_2 )* ) )
            // InternalT2A.g:1763:1: ( ( rule__DOM__SclassesAssignment_2_1_2 )* )
            {
            // InternalT2A.g:1763:1: ( ( rule__DOM__SclassesAssignment_2_1_2 )* )
            // InternalT2A.g:1764:2: ( rule__DOM__SclassesAssignment_2_1_2 )*
            {
             before(grammarAccess.getDOMAccess().getSclassesAssignment_2_1_2()); 
            // InternalT2A.g:1765:2: ( rule__DOM__SclassesAssignment_2_1_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalT2A.g:1765:3: rule__DOM__SclassesAssignment_2_1_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__DOM__SclassesAssignment_2_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getDOMAccess().getSclassesAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group_2_1__2__Impl"


    // $ANTLR start "rule__DOM__Group_2_1__3"
    // InternalT2A.g:1773:1: rule__DOM__Group_2_1__3 : rule__DOM__Group_2_1__3__Impl ;
    public final void rule__DOM__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1777:1: ( rule__DOM__Group_2_1__3__Impl )
            // InternalT2A.g:1778:2: rule__DOM__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOM__Group_2_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group_2_1__3"


    // $ANTLR start "rule__DOM__Group_2_1__3__Impl"
    // InternalT2A.g:1784:1: rule__DOM__Group_2_1__3__Impl : ( '}' ) ;
    public final void rule__DOM__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1788:1: ( ( '}' ) )
            // InternalT2A.g:1789:1: ( '}' )
            {
            // InternalT2A.g:1789:1: ( '}' )
            // InternalT2A.g:1790:2: '}'
            {
             before(grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_1_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group_2_1__3__Impl"


    // $ANTLR start "rule__Comp__Group__0"
    // InternalT2A.g:1800:1: rule__Comp__Group__0 : rule__Comp__Group__0__Impl rule__Comp__Group__1 ;
    public final void rule__Comp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1804:1: ( rule__Comp__Group__0__Impl rule__Comp__Group__1 )
            // InternalT2A.g:1805:2: rule__Comp__Group__0__Impl rule__Comp__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Comp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group__0"


    // $ANTLR start "rule__Comp__Group__0__Impl"
    // InternalT2A.g:1812:1: rule__Comp__Group__0__Impl : ( 'Comp' ) ;
    public final void rule__Comp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1816:1: ( ( 'Comp' ) )
            // InternalT2A.g:1817:1: ( 'Comp' )
            {
            // InternalT2A.g:1817:1: ( 'Comp' )
            // InternalT2A.g:1818:2: 'Comp'
            {
             before(grammarAccess.getCompAccess().getCompKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCompAccess().getCompKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group__0__Impl"


    // $ANTLR start "rule__Comp__Group__1"
    // InternalT2A.g:1827:1: rule__Comp__Group__1 : rule__Comp__Group__1__Impl rule__Comp__Group__2 ;
    public final void rule__Comp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1831:1: ( rule__Comp__Group__1__Impl rule__Comp__Group__2 )
            // InternalT2A.g:1832:2: rule__Comp__Group__1__Impl rule__Comp__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Comp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group__1"


    // $ANTLR start "rule__Comp__Group__1__Impl"
    // InternalT2A.g:1839:1: rule__Comp__Group__1__Impl : ( ( rule__Comp__NameAssignment_1 ) ) ;
    public final void rule__Comp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1843:1: ( ( ( rule__Comp__NameAssignment_1 ) ) )
            // InternalT2A.g:1844:1: ( ( rule__Comp__NameAssignment_1 ) )
            {
            // InternalT2A.g:1844:1: ( ( rule__Comp__NameAssignment_1 ) )
            // InternalT2A.g:1845:2: ( rule__Comp__NameAssignment_1 )
            {
             before(grammarAccess.getCompAccess().getNameAssignment_1()); 
            // InternalT2A.g:1846:2: ( rule__Comp__NameAssignment_1 )
            // InternalT2A.g:1846:3: rule__Comp__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Comp__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group__1__Impl"


    // $ANTLR start "rule__Comp__Group__2"
    // InternalT2A.g:1854:1: rule__Comp__Group__2 : rule__Comp__Group__2__Impl ;
    public final void rule__Comp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1858:1: ( rule__Comp__Group__2__Impl )
            // InternalT2A.g:1859:2: rule__Comp__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comp__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group__2"


    // $ANTLR start "rule__Comp__Group__2__Impl"
    // InternalT2A.g:1865:1: rule__Comp__Group__2__Impl : ( ( rule__Comp__Group_2__0 )? ) ;
    public final void rule__Comp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1869:1: ( ( ( rule__Comp__Group_2__0 )? ) )
            // InternalT2A.g:1870:1: ( ( rule__Comp__Group_2__0 )? )
            {
            // InternalT2A.g:1870:1: ( ( rule__Comp__Group_2__0 )? )
            // InternalT2A.g:1871:2: ( rule__Comp__Group_2__0 )?
            {
             before(grammarAccess.getCompAccess().getGroup_2()); 
            // InternalT2A.g:1872:2: ( rule__Comp__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==20) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalT2A.g:1872:3: rule__Comp__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comp__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group__2__Impl"


    // $ANTLR start "rule__Comp__Group_2__0"
    // InternalT2A.g:1881:1: rule__Comp__Group_2__0 : rule__Comp__Group_2__0__Impl rule__Comp__Group_2__1 ;
    public final void rule__Comp__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1885:1: ( rule__Comp__Group_2__0__Impl rule__Comp__Group_2__1 )
            // InternalT2A.g:1886:2: rule__Comp__Group_2__0__Impl rule__Comp__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__Comp__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comp__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group_2__0"


    // $ANTLR start "rule__Comp__Group_2__0__Impl"
    // InternalT2A.g:1893:1: rule__Comp__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Comp__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1897:1: ( ( '{' ) )
            // InternalT2A.g:1898:1: ( '{' )
            {
            // InternalT2A.g:1898:1: ( '{' )
            // InternalT2A.g:1899:2: '{'
            {
             before(grammarAccess.getCompAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCompAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group_2__0__Impl"


    // $ANTLR start "rule__Comp__Group_2__1"
    // InternalT2A.g:1908:1: rule__Comp__Group_2__1 : rule__Comp__Group_2__1__Impl rule__Comp__Group_2__2 ;
    public final void rule__Comp__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1912:1: ( rule__Comp__Group_2__1__Impl rule__Comp__Group_2__2 )
            // InternalT2A.g:1913:2: rule__Comp__Group_2__1__Impl rule__Comp__Group_2__2
            {
            pushFollow(FOLLOW_16);
            rule__Comp__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comp__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group_2__1"


    // $ANTLR start "rule__Comp__Group_2__1__Impl"
    // InternalT2A.g:1920:1: rule__Comp__Group_2__1__Impl : ( ( rule__Comp__Group_2_1__0 )? ) ;
    public final void rule__Comp__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1924:1: ( ( ( rule__Comp__Group_2_1__0 )? ) )
            // InternalT2A.g:1925:1: ( ( rule__Comp__Group_2_1__0 )? )
            {
            // InternalT2A.g:1925:1: ( ( rule__Comp__Group_2_1__0 )? )
            // InternalT2A.g:1926:2: ( rule__Comp__Group_2_1__0 )?
            {
             before(grammarAccess.getCompAccess().getGroup_2_1()); 
            // InternalT2A.g:1927:2: ( rule__Comp__Group_2_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalT2A.g:1927:3: rule__Comp__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comp__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group_2__1__Impl"


    // $ANTLR start "rule__Comp__Group_2__2"
    // InternalT2A.g:1935:1: rule__Comp__Group_2__2 : rule__Comp__Group_2__2__Impl rule__Comp__Group_2__3 ;
    public final void rule__Comp__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1939:1: ( rule__Comp__Group_2__2__Impl rule__Comp__Group_2__3 )
            // InternalT2A.g:1940:2: rule__Comp__Group_2__2__Impl rule__Comp__Group_2__3
            {
            pushFollow(FOLLOW_16);
            rule__Comp__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comp__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group_2__2"


    // $ANTLR start "rule__Comp__Group_2__2__Impl"
    // InternalT2A.g:1947:1: rule__Comp__Group_2__2__Impl : ( ( rule__Comp__FeaturesAssignment_2_2 )* ) ;
    public final void rule__Comp__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1951:1: ( ( ( rule__Comp__FeaturesAssignment_2_2 )* ) )
            // InternalT2A.g:1952:1: ( ( rule__Comp__FeaturesAssignment_2_2 )* )
            {
            // InternalT2A.g:1952:1: ( ( rule__Comp__FeaturesAssignment_2_2 )* )
            // InternalT2A.g:1953:2: ( rule__Comp__FeaturesAssignment_2_2 )*
            {
             before(grammarAccess.getCompAccess().getFeaturesAssignment_2_2()); 
            // InternalT2A.g:1954:2: ( rule__Comp__FeaturesAssignment_2_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||LA25_0==RULE_STRING||LA25_0==31) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalT2A.g:1954:3: rule__Comp__FeaturesAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Comp__FeaturesAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getCompAccess().getFeaturesAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group_2__2__Impl"


    // $ANTLR start "rule__Comp__Group_2__3"
    // InternalT2A.g:1962:1: rule__Comp__Group_2__3 : rule__Comp__Group_2__3__Impl ;
    public final void rule__Comp__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1966:1: ( rule__Comp__Group_2__3__Impl )
            // InternalT2A.g:1967:2: rule__Comp__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comp__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group_2__3"


    // $ANTLR start "rule__Comp__Group_2__3__Impl"
    // InternalT2A.g:1973:1: rule__Comp__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Comp__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1977:1: ( ( '}' ) )
            // InternalT2A.g:1978:1: ( '}' )
            {
            // InternalT2A.g:1978:1: ( '}' )
            // InternalT2A.g:1979:2: '}'
            {
             before(grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group_2__3__Impl"


    // $ANTLR start "rule__Comp__Group_2_1__0"
    // InternalT2A.g:1989:1: rule__Comp__Group_2_1__0 : rule__Comp__Group_2_1__0__Impl rule__Comp__Group_2_1__1 ;
    public final void rule__Comp__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1993:1: ( rule__Comp__Group_2_1__0__Impl rule__Comp__Group_2_1__1 )
            // InternalT2A.g:1994:2: rule__Comp__Group_2_1__0__Impl rule__Comp__Group_2_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Comp__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comp__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group_2_1__0"


    // $ANTLR start "rule__Comp__Group_2_1__0__Impl"
    // InternalT2A.g:2001:1: rule__Comp__Group_2_1__0__Impl : ( 'sclass' ) ;
    public final void rule__Comp__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2005:1: ( ( 'sclass' ) )
            // InternalT2A.g:2006:1: ( 'sclass' )
            {
            // InternalT2A.g:2006:1: ( 'sclass' )
            // InternalT2A.g:2007:2: 'sclass'
            {
             before(grammarAccess.getCompAccess().getSclassKeyword_2_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCompAccess().getSclassKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group_2_1__0__Impl"


    // $ANTLR start "rule__Comp__Group_2_1__1"
    // InternalT2A.g:2016:1: rule__Comp__Group_2_1__1 : rule__Comp__Group_2_1__1__Impl rule__Comp__Group_2_1__2 ;
    public final void rule__Comp__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2020:1: ( rule__Comp__Group_2_1__1__Impl rule__Comp__Group_2_1__2 )
            // InternalT2A.g:2021:2: rule__Comp__Group_2_1__1__Impl rule__Comp__Group_2_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Comp__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comp__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group_2_1__1"


    // $ANTLR start "rule__Comp__Group_2_1__1__Impl"
    // InternalT2A.g:2028:1: rule__Comp__Group_2_1__1__Impl : ( '{' ) ;
    public final void rule__Comp__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2032:1: ( ( '{' ) )
            // InternalT2A.g:2033:1: ( '{' )
            {
            // InternalT2A.g:2033:1: ( '{' )
            // InternalT2A.g:2034:2: '{'
            {
             before(grammarAccess.getCompAccess().getLeftCurlyBracketKeyword_2_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCompAccess().getLeftCurlyBracketKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group_2_1__1__Impl"


    // $ANTLR start "rule__Comp__Group_2_1__2"
    // InternalT2A.g:2043:1: rule__Comp__Group_2_1__2 : rule__Comp__Group_2_1__2__Impl rule__Comp__Group_2_1__3 ;
    public final void rule__Comp__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2047:1: ( rule__Comp__Group_2_1__2__Impl rule__Comp__Group_2_1__3 )
            // InternalT2A.g:2048:2: rule__Comp__Group_2_1__2__Impl rule__Comp__Group_2_1__3
            {
            pushFollow(FOLLOW_9);
            rule__Comp__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comp__Group_2_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group_2_1__2"


    // $ANTLR start "rule__Comp__Group_2_1__2__Impl"
    // InternalT2A.g:2055:1: rule__Comp__Group_2_1__2__Impl : ( ( rule__Comp__HostclassesAssignment_2_1_2 )* ) ;
    public final void rule__Comp__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2059:1: ( ( ( rule__Comp__HostclassesAssignment_2_1_2 )* ) )
            // InternalT2A.g:2060:1: ( ( rule__Comp__HostclassesAssignment_2_1_2 )* )
            {
            // InternalT2A.g:2060:1: ( ( rule__Comp__HostclassesAssignment_2_1_2 )* )
            // InternalT2A.g:2061:2: ( rule__Comp__HostclassesAssignment_2_1_2 )*
            {
             before(grammarAccess.getCompAccess().getHostclassesAssignment_2_1_2()); 
            // InternalT2A.g:2062:2: ( rule__Comp__HostclassesAssignment_2_1_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalT2A.g:2062:3: rule__Comp__HostclassesAssignment_2_1_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Comp__HostclassesAssignment_2_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getCompAccess().getHostclassesAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group_2_1__2__Impl"


    // $ANTLR start "rule__Comp__Group_2_1__3"
    // InternalT2A.g:2070:1: rule__Comp__Group_2_1__3 : rule__Comp__Group_2_1__3__Impl ;
    public final void rule__Comp__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2074:1: ( rule__Comp__Group_2_1__3__Impl )
            // InternalT2A.g:2075:2: rule__Comp__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comp__Group_2_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group_2_1__3"


    // $ANTLR start "rule__Comp__Group_2_1__3__Impl"
    // InternalT2A.g:2081:1: rule__Comp__Group_2_1__3__Impl : ( '}' ) ;
    public final void rule__Comp__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2085:1: ( ( '}' ) )
            // InternalT2A.g:2086:1: ( '}' )
            {
            // InternalT2A.g:2086:1: ( '}' )
            // InternalT2A.g:2087:2: '}'
            {
             before(grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_1_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group_2_1__3__Impl"


    // $ANTLR start "rule__InstanciaEDOM__Group__0"
    // InternalT2A.g:2097:1: rule__InstanciaEDOM__Group__0 : rule__InstanciaEDOM__Group__0__Impl rule__InstanciaEDOM__Group__1 ;
    public final void rule__InstanciaEDOM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2101:1: ( rule__InstanciaEDOM__Group__0__Impl rule__InstanciaEDOM__Group__1 )
            // InternalT2A.g:2102:2: rule__InstanciaEDOM__Group__0__Impl rule__InstanciaEDOM__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__InstanciaEDOM__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanciaEDOM__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group__0"


    // $ANTLR start "rule__InstanciaEDOM__Group__0__Impl"
    // InternalT2A.g:2109:1: rule__InstanciaEDOM__Group__0__Impl : ( ( rule__InstanciaEDOM__InstanciaAssignment_0 ) ) ;
    public final void rule__InstanciaEDOM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2113:1: ( ( ( rule__InstanciaEDOM__InstanciaAssignment_0 ) ) )
            // InternalT2A.g:2114:1: ( ( rule__InstanciaEDOM__InstanciaAssignment_0 ) )
            {
            // InternalT2A.g:2114:1: ( ( rule__InstanciaEDOM__InstanciaAssignment_0 ) )
            // InternalT2A.g:2115:2: ( rule__InstanciaEDOM__InstanciaAssignment_0 )
            {
             before(grammarAccess.getInstanciaEDOMAccess().getInstanciaAssignment_0()); 
            // InternalT2A.g:2116:2: ( rule__InstanciaEDOM__InstanciaAssignment_0 )
            // InternalT2A.g:2116:3: rule__InstanciaEDOM__InstanciaAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__InstanciaEDOM__InstanciaAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInstanciaEDOMAccess().getInstanciaAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group__0__Impl"


    // $ANTLR start "rule__InstanciaEDOM__Group__1"
    // InternalT2A.g:2124:1: rule__InstanciaEDOM__Group__1 : rule__InstanciaEDOM__Group__1__Impl ;
    public final void rule__InstanciaEDOM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2128:1: ( rule__InstanciaEDOM__Group__1__Impl )
            // InternalT2A.g:2129:2: rule__InstanciaEDOM__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstanciaEDOM__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group__1"


    // $ANTLR start "rule__InstanciaEDOM__Group__1__Impl"
    // InternalT2A.g:2135:1: rule__InstanciaEDOM__Group__1__Impl : ( ( rule__InstanciaEDOM__Group_1__0 )? ) ;
    public final void rule__InstanciaEDOM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2139:1: ( ( ( rule__InstanciaEDOM__Group_1__0 )? ) )
            // InternalT2A.g:2140:1: ( ( rule__InstanciaEDOM__Group_1__0 )? )
            {
            // InternalT2A.g:2140:1: ( ( rule__InstanciaEDOM__Group_1__0 )? )
            // InternalT2A.g:2141:2: ( rule__InstanciaEDOM__Group_1__0 )?
            {
             before(grammarAccess.getInstanciaEDOMAccess().getGroup_1()); 
            // InternalT2A.g:2142:2: ( rule__InstanciaEDOM__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==20) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalT2A.g:2142:3: rule__InstanciaEDOM__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InstanciaEDOM__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstanciaEDOMAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group__1__Impl"


    // $ANTLR start "rule__InstanciaEDOM__Group_1__0"
    // InternalT2A.g:2151:1: rule__InstanciaEDOM__Group_1__0 : rule__InstanciaEDOM__Group_1__0__Impl rule__InstanciaEDOM__Group_1__1 ;
    public final void rule__InstanciaEDOM__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2155:1: ( rule__InstanciaEDOM__Group_1__0__Impl rule__InstanciaEDOM__Group_1__1 )
            // InternalT2A.g:2156:2: rule__InstanciaEDOM__Group_1__0__Impl rule__InstanciaEDOM__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__InstanciaEDOM__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanciaEDOM__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1__0"


    // $ANTLR start "rule__InstanciaEDOM__Group_1__0__Impl"
    // InternalT2A.g:2163:1: rule__InstanciaEDOM__Group_1__0__Impl : ( '{' ) ;
    public final void rule__InstanciaEDOM__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2167:1: ( ( '{' ) )
            // InternalT2A.g:2168:1: ( '{' )
            {
            // InternalT2A.g:2168:1: ( '{' )
            // InternalT2A.g:2169:2: '{'
            {
             before(grammarAccess.getInstanciaEDOMAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInstanciaEDOMAccess().getLeftCurlyBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1__0__Impl"


    // $ANTLR start "rule__InstanciaEDOM__Group_1__1"
    // InternalT2A.g:2178:1: rule__InstanciaEDOM__Group_1__1 : rule__InstanciaEDOM__Group_1__1__Impl rule__InstanciaEDOM__Group_1__2 ;
    public final void rule__InstanciaEDOM__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2182:1: ( rule__InstanciaEDOM__Group_1__1__Impl rule__InstanciaEDOM__Group_1__2 )
            // InternalT2A.g:2183:2: rule__InstanciaEDOM__Group_1__1__Impl rule__InstanciaEDOM__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__InstanciaEDOM__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanciaEDOM__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1__1"


    // $ANTLR start "rule__InstanciaEDOM__Group_1__1__Impl"
    // InternalT2A.g:2190:1: rule__InstanciaEDOM__Group_1__1__Impl : ( ( rule__InstanciaEDOM__Group_1_1__0 )? ) ;
    public final void rule__InstanciaEDOM__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2194:1: ( ( ( rule__InstanciaEDOM__Group_1_1__0 )? ) )
            // InternalT2A.g:2195:1: ( ( rule__InstanciaEDOM__Group_1_1__0 )? )
            {
            // InternalT2A.g:2195:1: ( ( rule__InstanciaEDOM__Group_1_1__0 )? )
            // InternalT2A.g:2196:2: ( rule__InstanciaEDOM__Group_1_1__0 )?
            {
             before(grammarAccess.getInstanciaEDOMAccess().getGroup_1_1()); 
            // InternalT2A.g:2197:2: ( rule__InstanciaEDOM__Group_1_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==22) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalT2A.g:2197:3: rule__InstanciaEDOM__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InstanciaEDOM__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstanciaEDOMAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1__1__Impl"


    // $ANTLR start "rule__InstanciaEDOM__Group_1__2"
    // InternalT2A.g:2205:1: rule__InstanciaEDOM__Group_1__2 : rule__InstanciaEDOM__Group_1__2__Impl rule__InstanciaEDOM__Group_1__3 ;
    public final void rule__InstanciaEDOM__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2209:1: ( rule__InstanciaEDOM__Group_1__2__Impl rule__InstanciaEDOM__Group_1__3 )
            // InternalT2A.g:2210:2: rule__InstanciaEDOM__Group_1__2__Impl rule__InstanciaEDOM__Group_1__3
            {
            pushFollow(FOLLOW_18);
            rule__InstanciaEDOM__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanciaEDOM__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1__2"


    // $ANTLR start "rule__InstanciaEDOM__Group_1__2__Impl"
    // InternalT2A.g:2217:1: rule__InstanciaEDOM__Group_1__2__Impl : ( ( rule__InstanciaEDOM__InsfeaturesAssignment_1_2 )* ) ;
    public final void rule__InstanciaEDOM__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2221:1: ( ( ( rule__InstanciaEDOM__InsfeaturesAssignment_1_2 )* ) )
            // InternalT2A.g:2222:1: ( ( rule__InstanciaEDOM__InsfeaturesAssignment_1_2 )* )
            {
            // InternalT2A.g:2222:1: ( ( rule__InstanciaEDOM__InsfeaturesAssignment_1_2 )* )
            // InternalT2A.g:2223:2: ( rule__InstanciaEDOM__InsfeaturesAssignment_1_2 )*
            {
             before(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesAssignment_1_2()); 
            // InternalT2A.g:2224:2: ( rule__InstanciaEDOM__InsfeaturesAssignment_1_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID||LA29_0==RULE_STRING) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalT2A.g:2224:3: rule__InstanciaEDOM__InsfeaturesAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__InstanciaEDOM__InsfeaturesAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1__2__Impl"


    // $ANTLR start "rule__InstanciaEDOM__Group_1__3"
    // InternalT2A.g:2232:1: rule__InstanciaEDOM__Group_1__3 : rule__InstanciaEDOM__Group_1__3__Impl ;
    public final void rule__InstanciaEDOM__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2236:1: ( rule__InstanciaEDOM__Group_1__3__Impl )
            // InternalT2A.g:2237:2: rule__InstanciaEDOM__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstanciaEDOM__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1__3"


    // $ANTLR start "rule__InstanciaEDOM__Group_1__3__Impl"
    // InternalT2A.g:2243:1: rule__InstanciaEDOM__Group_1__3__Impl : ( '}' ) ;
    public final void rule__InstanciaEDOM__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2247:1: ( ( '}' ) )
            // InternalT2A.g:2248:1: ( '}' )
            {
            // InternalT2A.g:2248:1: ( '}' )
            // InternalT2A.g:2249:2: '}'
            {
             before(grammarAccess.getInstanciaEDOMAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getInstanciaEDOMAccess().getRightCurlyBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1__3__Impl"


    // $ANTLR start "rule__InstanciaEDOM__Group_1_1__0"
    // InternalT2A.g:2259:1: rule__InstanciaEDOM__Group_1_1__0 : rule__InstanciaEDOM__Group_1_1__0__Impl rule__InstanciaEDOM__Group_1_1__1 ;
    public final void rule__InstanciaEDOM__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2263:1: ( rule__InstanciaEDOM__Group_1_1__0__Impl rule__InstanciaEDOM__Group_1_1__1 )
            // InternalT2A.g:2264:2: rule__InstanciaEDOM__Group_1_1__0__Impl rule__InstanciaEDOM__Group_1_1__1
            {
            pushFollow(FOLLOW_6);
            rule__InstanciaEDOM__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanciaEDOM__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1_1__0"


    // $ANTLR start "rule__InstanciaEDOM__Group_1_1__0__Impl"
    // InternalT2A.g:2271:1: rule__InstanciaEDOM__Group_1_1__0__Impl : ( 'sclass' ) ;
    public final void rule__InstanciaEDOM__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2275:1: ( ( 'sclass' ) )
            // InternalT2A.g:2276:1: ( 'sclass' )
            {
            // InternalT2A.g:2276:1: ( 'sclass' )
            // InternalT2A.g:2277:2: 'sclass'
            {
             before(grammarAccess.getInstanciaEDOMAccess().getSclassKeyword_1_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInstanciaEDOMAccess().getSclassKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1_1__0__Impl"


    // $ANTLR start "rule__InstanciaEDOM__Group_1_1__1"
    // InternalT2A.g:2286:1: rule__InstanciaEDOM__Group_1_1__1 : rule__InstanciaEDOM__Group_1_1__1__Impl rule__InstanciaEDOM__Group_1_1__2 ;
    public final void rule__InstanciaEDOM__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2290:1: ( rule__InstanciaEDOM__Group_1_1__1__Impl rule__InstanciaEDOM__Group_1_1__2 )
            // InternalT2A.g:2291:2: rule__InstanciaEDOM__Group_1_1__1__Impl rule__InstanciaEDOM__Group_1_1__2
            {
            pushFollow(FOLLOW_9);
            rule__InstanciaEDOM__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanciaEDOM__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1_1__1"


    // $ANTLR start "rule__InstanciaEDOM__Group_1_1__1__Impl"
    // InternalT2A.g:2298:1: rule__InstanciaEDOM__Group_1_1__1__Impl : ( '{' ) ;
    public final void rule__InstanciaEDOM__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2302:1: ( ( '{' ) )
            // InternalT2A.g:2303:1: ( '{' )
            {
            // InternalT2A.g:2303:1: ( '{' )
            // InternalT2A.g:2304:2: '{'
            {
             before(grammarAccess.getInstanciaEDOMAccess().getLeftCurlyBracketKeyword_1_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInstanciaEDOMAccess().getLeftCurlyBracketKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1_1__1__Impl"


    // $ANTLR start "rule__InstanciaEDOM__Group_1_1__2"
    // InternalT2A.g:2313:1: rule__InstanciaEDOM__Group_1_1__2 : rule__InstanciaEDOM__Group_1_1__2__Impl rule__InstanciaEDOM__Group_1_1__3 ;
    public final void rule__InstanciaEDOM__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2317:1: ( rule__InstanciaEDOM__Group_1_1__2__Impl rule__InstanciaEDOM__Group_1_1__3 )
            // InternalT2A.g:2318:2: rule__InstanciaEDOM__Group_1_1__2__Impl rule__InstanciaEDOM__Group_1_1__3
            {
            pushFollow(FOLLOW_9);
            rule__InstanciaEDOM__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanciaEDOM__Group_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1_1__2"


    // $ANTLR start "rule__InstanciaEDOM__Group_1_1__2__Impl"
    // InternalT2A.g:2325:1: rule__InstanciaEDOM__Group_1_1__2__Impl : ( ( rule__InstanciaEDOM__SclassesAssignment_1_1_2 )* ) ;
    public final void rule__InstanciaEDOM__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2329:1: ( ( ( rule__InstanciaEDOM__SclassesAssignment_1_1_2 )* ) )
            // InternalT2A.g:2330:1: ( ( rule__InstanciaEDOM__SclassesAssignment_1_1_2 )* )
            {
            // InternalT2A.g:2330:1: ( ( rule__InstanciaEDOM__SclassesAssignment_1_1_2 )* )
            // InternalT2A.g:2331:2: ( rule__InstanciaEDOM__SclassesAssignment_1_1_2 )*
            {
             before(grammarAccess.getInstanciaEDOMAccess().getSclassesAssignment_1_1_2()); 
            // InternalT2A.g:2332:2: ( rule__InstanciaEDOM__SclassesAssignment_1_1_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalT2A.g:2332:3: rule__InstanciaEDOM__SclassesAssignment_1_1_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__InstanciaEDOM__SclassesAssignment_1_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getInstanciaEDOMAccess().getSclassesAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1_1__2__Impl"


    // $ANTLR start "rule__InstanciaEDOM__Group_1_1__3"
    // InternalT2A.g:2340:1: rule__InstanciaEDOM__Group_1_1__3 : rule__InstanciaEDOM__Group_1_1__3__Impl ;
    public final void rule__InstanciaEDOM__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2344:1: ( rule__InstanciaEDOM__Group_1_1__3__Impl )
            // InternalT2A.g:2345:2: rule__InstanciaEDOM__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstanciaEDOM__Group_1_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1_1__3"


    // $ANTLR start "rule__InstanciaEDOM__Group_1_1__3__Impl"
    // InternalT2A.g:2351:1: rule__InstanciaEDOM__Group_1_1__3__Impl : ( '}' ) ;
    public final void rule__InstanciaEDOM__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2355:1: ( ( '}' ) )
            // InternalT2A.g:2356:1: ( '}' )
            {
            // InternalT2A.g:2356:1: ( '}' )
            // InternalT2A.g:2357:2: '}'
            {
             before(grammarAccess.getInstanciaEDOMAccess().getRightCurlyBracketKeyword_1_1_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getInstanciaEDOMAccess().getRightCurlyBracketKeyword_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1_1__3__Impl"


    // $ANTLR start "rule__Root__ElementsAssignment"
    // InternalT2A.g:2367:1: rule__Root__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Root__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2371:1: ( ( ruleElement ) )
            // InternalT2A.g:2372:2: ( ruleElement )
            {
            // InternalT2A.g:2372:2: ( ruleElement )
            // InternalT2A.g:2373:3: ruleElement
            {
             before(grammarAccess.getRootAccess().getElementsElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getRootAccess().getElementsElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__ElementsAssignment"


    // $ANTLR start "rule__Page__NameAssignment_1"
    // InternalT2A.g:2382:1: rule__Page__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Page__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2386:1: ( ( RULE_ID ) )
            // InternalT2A.g:2387:2: ( RULE_ID )
            {
            // InternalT2A.g:2387:2: ( RULE_ID )
            // InternalT2A.g:2388:3: RULE_ID
            {
             before(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__NameAssignment_1"


    // $ANTLR start "rule__Page__HostclassesAssignment_3_2"
    // InternalT2A.g:2397:1: rule__Page__HostclassesAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__Page__HostclassesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2401:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:2402:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:2402:2: ( ( RULE_ID ) )
            // InternalT2A.g:2403:3: ( RULE_ID )
            {
             before(grammarAccess.getPageAccess().getHostclassesStyleClassCrossReference_3_2_0()); 
            // InternalT2A.g:2404:3: ( RULE_ID )
            // InternalT2A.g:2405:4: RULE_ID
            {
             before(grammarAccess.getPageAccess().getHostclassesStyleClassIDTerminalRuleCall_3_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getHostclassesStyleClassIDTerminalRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getPageAccess().getHostclassesStyleClassCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__HostclassesAssignment_3_2"


    // $ANTLR start "rule__Page__HomeAssignment_4"
    // InternalT2A.g:2416:1: rule__Page__HomeAssignment_4 : ( ( 'home' ) ) ;
    public final void rule__Page__HomeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2420:1: ( ( ( 'home' ) ) )
            // InternalT2A.g:2421:2: ( ( 'home' ) )
            {
            // InternalT2A.g:2421:2: ( ( 'home' ) )
            // InternalT2A.g:2422:3: ( 'home' )
            {
             before(grammarAccess.getPageAccess().getHomeHomeKeyword_4_0()); 
            // InternalT2A.g:2423:3: ( 'home' )
            // InternalT2A.g:2424:4: 'home'
            {
             before(grammarAccess.getPageAccess().getHomeHomeKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getHomeHomeKeyword_4_0()); 

            }

             after(grammarAccess.getPageAccess().getHomeHomeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__HomeAssignment_4"


    // $ANTLR start "rule__Page__ShowInNavAssignment_5"
    // InternalT2A.g:2435:1: rule__Page__ShowInNavAssignment_5 : ( ( 'showInNav' ) ) ;
    public final void rule__Page__ShowInNavAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2439:1: ( ( ( 'showInNav' ) ) )
            // InternalT2A.g:2440:2: ( ( 'showInNav' ) )
            {
            // InternalT2A.g:2440:2: ( ( 'showInNav' ) )
            // InternalT2A.g:2441:3: ( 'showInNav' )
            {
             before(grammarAccess.getPageAccess().getShowInNavShowInNavKeyword_5_0()); 
            // InternalT2A.g:2442:3: ( 'showInNav' )
            // InternalT2A.g:2443:4: 'showInNav'
            {
             before(grammarAccess.getPageAccess().getShowInNavShowInNavKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getShowInNavShowInNavKeyword_5_0()); 

            }

             after(grammarAccess.getPageAccess().getShowInNavShowInNavKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__ShowInNavAssignment_5"


    // $ANTLR start "rule__Page__PageFeaturesAssignment_6"
    // InternalT2A.g:2454:1: rule__Page__PageFeaturesAssignment_6 : ( rulePageFeature ) ;
    public final void rule__Page__PageFeaturesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2458:1: ( ( rulePageFeature ) )
            // InternalT2A.g:2459:2: ( rulePageFeature )
            {
            // InternalT2A.g:2459:2: ( rulePageFeature )
            // InternalT2A.g:2460:3: rulePageFeature
            {
             before(grammarAccess.getPageAccess().getPageFeaturesPageFeatureParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePageFeature();

            state._fsp--;

             after(grammarAccess.getPageAccess().getPageFeaturesPageFeatureParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__PageFeaturesAssignment_6"


    // $ANTLR start "rule__StyleClass__NameAssignment_1"
    // InternalT2A.g:2469:1: rule__StyleClass__NameAssignment_1 : ( ruleName ) ;
    public final void rule__StyleClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2473:1: ( ( ruleName ) )
            // InternalT2A.g:2474:2: ( ruleName )
            {
            // InternalT2A.g:2474:2: ( ruleName )
            // InternalT2A.g:2475:3: ruleName
            {
             before(grammarAccess.getStyleClassAccess().getNameNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getStyleClassAccess().getNameNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__NameAssignment_1"


    // $ANTLR start "rule__StyleClass__SattributesAssignment_3_0"
    // InternalT2A.g:2484:1: rule__StyleClass__SattributesAssignment_3_0 : ( ruleSAttributeAndValue ) ;
    public final void rule__StyleClass__SattributesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2488:1: ( ( ruleSAttributeAndValue ) )
            // InternalT2A.g:2489:2: ( ruleSAttributeAndValue )
            {
            // InternalT2A.g:2489:2: ( ruleSAttributeAndValue )
            // InternalT2A.g:2490:3: ruleSAttributeAndValue
            {
             before(grammarAccess.getStyleClassAccess().getSattributesSAttributeAndValueParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSAttributeAndValue();

            state._fsp--;

             after(grammarAccess.getStyleClassAccess().getSattributesSAttributeAndValueParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__SattributesAssignment_3_0"


    // $ANTLR start "rule__StyleClass__SattributesAfterAssignment_4_2_0"
    // InternalT2A.g:2499:1: rule__StyleClass__SattributesAfterAssignment_4_2_0 : ( ruleSAttributeAndValue ) ;
    public final void rule__StyleClass__SattributesAfterAssignment_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2503:1: ( ( ruleSAttributeAndValue ) )
            // InternalT2A.g:2504:2: ( ruleSAttributeAndValue )
            {
            // InternalT2A.g:2504:2: ( ruleSAttributeAndValue )
            // InternalT2A.g:2505:3: ruleSAttributeAndValue
            {
             before(grammarAccess.getStyleClassAccess().getSattributesAfterSAttributeAndValueParserRuleCall_4_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSAttributeAndValue();

            state._fsp--;

             after(grammarAccess.getStyleClassAccess().getSattributesAfterSAttributeAndValueParserRuleCall_4_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__SattributesAfterAssignment_4_2_0"


    // $ANTLR start "rule__StyleClass__SattributesActiveAssignment_5_2_0"
    // InternalT2A.g:2514:1: rule__StyleClass__SattributesActiveAssignment_5_2_0 : ( ruleSAttributeAndValue ) ;
    public final void rule__StyleClass__SattributesActiveAssignment_5_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2518:1: ( ( ruleSAttributeAndValue ) )
            // InternalT2A.g:2519:2: ( ruleSAttributeAndValue )
            {
            // InternalT2A.g:2519:2: ( ruleSAttributeAndValue )
            // InternalT2A.g:2520:3: ruleSAttributeAndValue
            {
             before(grammarAccess.getStyleClassAccess().getSattributesActiveSAttributeAndValueParserRuleCall_5_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSAttributeAndValue();

            state._fsp--;

             after(grammarAccess.getStyleClassAccess().getSattributesActiveSAttributeAndValueParserRuleCall_5_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleClass__SattributesActiveAssignment_5_2_0"


    // $ANTLR start "rule__SAttributeAndValue__StnameAssignment_0"
    // InternalT2A.g:2529:1: rule__SAttributeAndValue__StnameAssignment_0 : ( ruleName ) ;
    public final void rule__SAttributeAndValue__StnameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2533:1: ( ( ruleName ) )
            // InternalT2A.g:2534:2: ( ruleName )
            {
            // InternalT2A.g:2534:2: ( ruleName )
            // InternalT2A.g:2535:3: ruleName
            {
             before(grammarAccess.getSAttributeAndValueAccess().getStnameNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getSAttributeAndValueAccess().getStnameNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttributeAndValue__StnameAssignment_0"


    // $ANTLR start "rule__SAttributeAndValue__ValueAssignment_1"
    // InternalT2A.g:2544:1: rule__SAttributeAndValue__ValueAssignment_1 : ( RULE_STRING2 ) ;
    public final void rule__SAttributeAndValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2548:1: ( ( RULE_STRING2 ) )
            // InternalT2A.g:2549:2: ( RULE_STRING2 )
            {
            // InternalT2A.g:2549:2: ( RULE_STRING2 )
            // InternalT2A.g:2550:3: RULE_STRING2
            {
             before(grammarAccess.getSAttributeAndValueAccess().getValueSTRING2TerminalRuleCall_1_0()); 
            match(input,RULE_STRING2,FOLLOW_2); 
             after(grammarAccess.getSAttributeAndValueAccess().getValueSTRING2TerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttributeAndValue__ValueAssignment_1"


    // $ANTLR start "rule__DOM__NameAssignment_1"
    // InternalT2A.g:2559:1: rule__DOM__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DOM__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2563:1: ( ( RULE_ID ) )
            // InternalT2A.g:2564:2: ( RULE_ID )
            {
            // InternalT2A.g:2564:2: ( RULE_ID )
            // InternalT2A.g:2565:3: RULE_ID
            {
             before(grammarAccess.getDOMAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDOMAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__NameAssignment_1"


    // $ANTLR start "rule__DOM__SclassesAssignment_2_1_2"
    // InternalT2A.g:2574:1: rule__DOM__SclassesAssignment_2_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__DOM__SclassesAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2578:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:2579:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:2579:2: ( ( RULE_ID ) )
            // InternalT2A.g:2580:3: ( RULE_ID )
            {
             before(grammarAccess.getDOMAccess().getSclassesStyleClassCrossReference_2_1_2_0()); 
            // InternalT2A.g:2581:3: ( RULE_ID )
            // InternalT2A.g:2582:4: RULE_ID
            {
             before(grammarAccess.getDOMAccess().getSclassesStyleClassIDTerminalRuleCall_2_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDOMAccess().getSclassesStyleClassIDTerminalRuleCall_2_1_2_0_1()); 

            }

             after(grammarAccess.getDOMAccess().getSclassesStyleClassCrossReference_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__SclassesAssignment_2_1_2"


    // $ANTLR start "rule__DOM__FeaturesAssignment_2_2"
    // InternalT2A.g:2593:1: rule__DOM__FeaturesAssignment_2_2 : ( ruleFeature ) ;
    public final void rule__DOM__FeaturesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2597:1: ( ( ruleFeature ) )
            // InternalT2A.g:2598:2: ( ruleFeature )
            {
            // InternalT2A.g:2598:2: ( ruleFeature )
            // InternalT2A.g:2599:3: ruleFeature
            {
             before(grammarAccess.getDOMAccess().getFeaturesFeatureParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getDOMAccess().getFeaturesFeatureParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__FeaturesAssignment_2_2"


    // $ANTLR start "rule__Comp__NameAssignment_1"
    // InternalT2A.g:2608:1: rule__Comp__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Comp__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2612:1: ( ( RULE_ID ) )
            // InternalT2A.g:2613:2: ( RULE_ID )
            {
            // InternalT2A.g:2613:2: ( RULE_ID )
            // InternalT2A.g:2614:3: RULE_ID
            {
             before(grammarAccess.getCompAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__NameAssignment_1"


    // $ANTLR start "rule__Comp__HostclassesAssignment_2_1_2"
    // InternalT2A.g:2623:1: rule__Comp__HostclassesAssignment_2_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Comp__HostclassesAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2627:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:2628:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:2628:2: ( ( RULE_ID ) )
            // InternalT2A.g:2629:3: ( RULE_ID )
            {
             before(grammarAccess.getCompAccess().getHostclassesStyleClassCrossReference_2_1_2_0()); 
            // InternalT2A.g:2630:3: ( RULE_ID )
            // InternalT2A.g:2631:4: RULE_ID
            {
             before(grammarAccess.getCompAccess().getHostclassesStyleClassIDTerminalRuleCall_2_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompAccess().getHostclassesStyleClassIDTerminalRuleCall_2_1_2_0_1()); 

            }

             after(grammarAccess.getCompAccess().getHostclassesStyleClassCrossReference_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__HostclassesAssignment_2_1_2"


    // $ANTLR start "rule__Comp__FeaturesAssignment_2_2"
    // InternalT2A.g:2642:1: rule__Comp__FeaturesAssignment_2_2 : ( ruleFeature ) ;
    public final void rule__Comp__FeaturesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2646:1: ( ( ruleFeature ) )
            // InternalT2A.g:2647:2: ( ruleFeature )
            {
            // InternalT2A.g:2647:2: ( ruleFeature )
            // InternalT2A.g:2648:3: ruleFeature
            {
             before(grammarAccess.getCompAccess().getFeaturesFeatureParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getCompAccess().getFeaturesFeatureParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__FeaturesAssignment_2_2"


    // $ANTLR start "rule__InstanciaEDOM__InstanciaAssignment_0"
    // InternalT2A.g:2657:1: rule__InstanciaEDOM__InstanciaAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__InstanciaEDOM__InstanciaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2661:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:2662:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:2662:2: ( ( RULE_ID ) )
            // InternalT2A.g:2663:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanciaEDOMAccess().getInstanciaEDOMCrossReference_0_0()); 
            // InternalT2A.g:2664:3: ( RULE_ID )
            // InternalT2A.g:2665:4: RULE_ID
            {
             before(grammarAccess.getInstanciaEDOMAccess().getInstanciaEDOMIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanciaEDOMAccess().getInstanciaEDOMIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getInstanciaEDOMAccess().getInstanciaEDOMCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__InstanciaAssignment_0"


    // $ANTLR start "rule__InstanciaEDOM__SclassesAssignment_1_1_2"
    // InternalT2A.g:2676:1: rule__InstanciaEDOM__SclassesAssignment_1_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__InstanciaEDOM__SclassesAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2680:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:2681:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:2681:2: ( ( RULE_ID ) )
            // InternalT2A.g:2682:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanciaEDOMAccess().getSclassesStyleClassCrossReference_1_1_2_0()); 
            // InternalT2A.g:2683:3: ( RULE_ID )
            // InternalT2A.g:2684:4: RULE_ID
            {
             before(grammarAccess.getInstanciaEDOMAccess().getSclassesStyleClassIDTerminalRuleCall_1_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanciaEDOMAccess().getSclassesStyleClassIDTerminalRuleCall_1_1_2_0_1()); 

            }

             after(grammarAccess.getInstanciaEDOMAccess().getSclassesStyleClassCrossReference_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__SclassesAssignment_1_1_2"


    // $ANTLR start "rule__InstanciaEDOM__InsfeaturesAssignment_1_2"
    // InternalT2A.g:2695:1: rule__InstanciaEDOM__InsfeaturesAssignment_1_2 : ( ruleInstanceEDOMFeature ) ;
    public final void rule__InstanciaEDOM__InsfeaturesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2699:1: ( ( ruleInstanceEDOMFeature ) )
            // InternalT2A.g:2700:2: ( ruleInstanceEDOMFeature )
            {
            // InternalT2A.g:2700:2: ( ruleInstanceEDOMFeature )
            // InternalT2A.g:2701:3: ruleInstanceEDOMFeature
            {
             before(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesInstanceEDOMFeatureParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInstanceEDOMFeature();

            state._fsp--;

             after(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesInstanceEDOMFeatureParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__InsfeaturesAssignment_1_2"


    // $ANTLR start "rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0"
    // InternalT2A.g:2710:1: rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 : ( ruleInstanciaEDOM ) ;
    public final void rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2714:1: ( ( ruleInstanciaEDOM ) )
            // InternalT2A.g:2715:2: ( ruleInstanciaEDOM )
            {
            // InternalT2A.g:2715:2: ( ruleInstanciaEDOM )
            // InternalT2A.g:2716:3: ruleInstanciaEDOM
            {
             before(grammarAccess.getInstanceEDOMFeatureAccess().getInstanciaEDOMInstanciaEDOMParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInstanciaEDOM();

            state._fsp--;

             after(grammarAccess.getInstanceEDOMFeatureAccess().getInstanciaEDOMInstanciaEDOMParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0"


    // $ANTLR start "rule__InstanceEDOMFeature__StringAssignment_1"
    // InternalT2A.g:2725:1: rule__InstanceEDOMFeature__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__InstanceEDOMFeature__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2729:1: ( ( RULE_STRING ) )
            // InternalT2A.g:2730:2: ( RULE_STRING )
            {
            // InternalT2A.g:2730:2: ( RULE_STRING )
            // InternalT2A.g:2731:3: RULE_STRING
            {
             before(grammarAccess.getInstanceEDOMFeatureAccess().getStringSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInstanceEDOMFeatureAccess().getStringSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceEDOMFeature__StringAssignment_1"


    // $ANTLR start "rule__PageFeature__InstanciaEDOMAssignment_0"
    // InternalT2A.g:2740:1: rule__PageFeature__InstanciaEDOMAssignment_0 : ( ruleInstanciaEDOM ) ;
    public final void rule__PageFeature__InstanciaEDOMAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2744:1: ( ( ruleInstanciaEDOM ) )
            // InternalT2A.g:2745:2: ( ruleInstanciaEDOM )
            {
            // InternalT2A.g:2745:2: ( ruleInstanciaEDOM )
            // InternalT2A.g:2746:3: ruleInstanciaEDOM
            {
             before(grammarAccess.getPageFeatureAccess().getInstanciaEDOMInstanciaEDOMParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInstanciaEDOM();

            state._fsp--;

             after(grammarAccess.getPageFeatureAccess().getInstanciaEDOMInstanciaEDOMParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageFeature__InstanciaEDOMAssignment_0"


    // $ANTLR start "rule__PageFeature__StringAssignment_1"
    // InternalT2A.g:2755:1: rule__PageFeature__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__PageFeature__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2759:1: ( ( RULE_STRING ) )
            // InternalT2A.g:2760:2: ( RULE_STRING )
            {
            // InternalT2A.g:2760:2: ( RULE_STRING )
            // InternalT2A.g:2761:3: RULE_STRING
            {
             before(grammarAccess.getPageFeatureAccess().getStringSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPageFeatureAccess().getStringSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageFeature__StringAssignment_1"


    // $ANTLR start "rule__Feature__InstanciaEDOMAssignment_0"
    // InternalT2A.g:2770:1: rule__Feature__InstanciaEDOMAssignment_0 : ( ruleInstanciaEDOM ) ;
    public final void rule__Feature__InstanciaEDOMAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2774:1: ( ( ruleInstanciaEDOM ) )
            // InternalT2A.g:2775:2: ( ruleInstanciaEDOM )
            {
            // InternalT2A.g:2775:2: ( ruleInstanciaEDOM )
            // InternalT2A.g:2776:3: ruleInstanciaEDOM
            {
             before(grammarAccess.getFeatureAccess().getInstanciaEDOMInstanciaEDOMParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInstanciaEDOM();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getInstanciaEDOMInstanciaEDOMParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__InstanciaEDOMAssignment_0"


    // $ANTLR start "rule__Feature__AllowSlotAssignment_1"
    // InternalT2A.g:2785:1: rule__Feature__AllowSlotAssignment_1 : ( ( 'AllowSlot' ) ) ;
    public final void rule__Feature__AllowSlotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2789:1: ( ( ( 'AllowSlot' ) ) )
            // InternalT2A.g:2790:2: ( ( 'AllowSlot' ) )
            {
            // InternalT2A.g:2790:2: ( ( 'AllowSlot' ) )
            // InternalT2A.g:2791:3: ( 'AllowSlot' )
            {
             before(grammarAccess.getFeatureAccess().getAllowSlotAllowSlotKeyword_1_0()); 
            // InternalT2A.g:2792:3: ( 'AllowSlot' )
            // InternalT2A.g:2793:4: 'AllowSlot'
            {
             before(grammarAccess.getFeatureAccess().getAllowSlotAllowSlotKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getAllowSlotAllowSlotKeyword_1_0()); 

            }

             after(grammarAccess.getFeatureAccess().getAllowSlotAllowSlotKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__AllowSlotAssignment_1"


    // $ANTLR start "rule__Feature__StringAssignment_2"
    // InternalT2A.g:2804:1: rule__Feature__StringAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Feature__StringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2808:1: ( ( RULE_STRING ) )
            // InternalT2A.g:2809:2: ( RULE_STRING )
            {
            // InternalT2A.g:2809:2: ( RULE_STRING )
            // InternalT2A.g:2810:3: RULE_STRING
            {
             before(grammarAccess.getFeatureAccess().getStringSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getStringSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__StringAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000018880002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000007F012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000060600050L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000007F010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000627F010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000027F010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080600050L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000052L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000600050L});

}