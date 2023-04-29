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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Page'", "'{'", "'}'", "'SClass:{'", "'StyleClass'", "'SAttri'", "':'", "'Dom'", "'Comp'", "'home'", "'showInNav'", "'AllowSlot'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
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

                if ( (LA1_0==11||(LA1_0>=15 && LA1_0<=16)||(LA1_0>=18 && LA1_0<=19)) ) {
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


    // $ANTLR start "entryRuleSAttributeName"
    // InternalT2A.g:185:1: entryRuleSAttributeName : ruleSAttributeName EOF ;
    public final void entryRuleSAttributeName() throws RecognitionException {
        try {
            // InternalT2A.g:186:1: ( ruleSAttributeName EOF )
            // InternalT2A.g:187:1: ruleSAttributeName EOF
            {
             before(grammarAccess.getSAttributeNameRule()); 
            pushFollow(FOLLOW_1);
            ruleSAttributeName();

            state._fsp--;

             after(grammarAccess.getSAttributeNameRule()); 
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
    // $ANTLR end "entryRuleSAttributeName"


    // $ANTLR start "ruleSAttributeName"
    // InternalT2A.g:194:1: ruleSAttributeName : ( ( rule__SAttributeName__Group__0 ) ) ;
    public final void ruleSAttributeName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:198:2: ( ( ( rule__SAttributeName__Group__0 ) ) )
            // InternalT2A.g:199:2: ( ( rule__SAttributeName__Group__0 ) )
            {
            // InternalT2A.g:199:2: ( ( rule__SAttributeName__Group__0 ) )
            // InternalT2A.g:200:3: ( rule__SAttributeName__Group__0 )
            {
             before(grammarAccess.getSAttributeNameAccess().getGroup()); 
            // InternalT2A.g:201:3: ( rule__SAttributeName__Group__0 )
            // InternalT2A.g:201:4: rule__SAttributeName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SAttributeName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSAttributeNameAccess().getGroup()); 

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
    // $ANTLR end "ruleSAttributeName"


    // $ANTLR start "entryRuleSAttributeAndValue"
    // InternalT2A.g:210:1: entryRuleSAttributeAndValue : ruleSAttributeAndValue EOF ;
    public final void entryRuleSAttributeAndValue() throws RecognitionException {
        try {
            // InternalT2A.g:211:1: ( ruleSAttributeAndValue EOF )
            // InternalT2A.g:212:1: ruleSAttributeAndValue EOF
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
    // InternalT2A.g:219:1: ruleSAttributeAndValue : ( ( rule__SAttributeAndValue__Group__0 ) ) ;
    public final void ruleSAttributeAndValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:223:2: ( ( ( rule__SAttributeAndValue__Group__0 ) ) )
            // InternalT2A.g:224:2: ( ( rule__SAttributeAndValue__Group__0 ) )
            {
            // InternalT2A.g:224:2: ( ( rule__SAttributeAndValue__Group__0 ) )
            // InternalT2A.g:225:3: ( rule__SAttributeAndValue__Group__0 )
            {
             before(grammarAccess.getSAttributeAndValueAccess().getGroup()); 
            // InternalT2A.g:226:3: ( rule__SAttributeAndValue__Group__0 )
            // InternalT2A.g:226:4: rule__SAttributeAndValue__Group__0
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
    // InternalT2A.g:235:1: entryRuleDOM : ruleDOM EOF ;
    public final void entryRuleDOM() throws RecognitionException {
        try {
            // InternalT2A.g:236:1: ( ruleDOM EOF )
            // InternalT2A.g:237:1: ruleDOM EOF
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
    // InternalT2A.g:244:1: ruleDOM : ( ( rule__DOM__Group__0 ) ) ;
    public final void ruleDOM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:248:2: ( ( ( rule__DOM__Group__0 ) ) )
            // InternalT2A.g:249:2: ( ( rule__DOM__Group__0 ) )
            {
            // InternalT2A.g:249:2: ( ( rule__DOM__Group__0 ) )
            // InternalT2A.g:250:3: ( rule__DOM__Group__0 )
            {
             before(grammarAccess.getDOMAccess().getGroup()); 
            // InternalT2A.g:251:3: ( rule__DOM__Group__0 )
            // InternalT2A.g:251:4: rule__DOM__Group__0
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
    // InternalT2A.g:260:1: entryRuleComp : ruleComp EOF ;
    public final void entryRuleComp() throws RecognitionException {
        try {
            // InternalT2A.g:261:1: ( ruleComp EOF )
            // InternalT2A.g:262:1: ruleComp EOF
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
    // InternalT2A.g:269:1: ruleComp : ( ( rule__Comp__Group__0 ) ) ;
    public final void ruleComp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:273:2: ( ( ( rule__Comp__Group__0 ) ) )
            // InternalT2A.g:274:2: ( ( rule__Comp__Group__0 ) )
            {
            // InternalT2A.g:274:2: ( ( rule__Comp__Group__0 ) )
            // InternalT2A.g:275:3: ( rule__Comp__Group__0 )
            {
             before(grammarAccess.getCompAccess().getGroup()); 
            // InternalT2A.g:276:3: ( rule__Comp__Group__0 )
            // InternalT2A.g:276:4: rule__Comp__Group__0
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
    // InternalT2A.g:285:1: entryRuleInstanciaEDOM : ruleInstanciaEDOM EOF ;
    public final void entryRuleInstanciaEDOM() throws RecognitionException {
        try {
            // InternalT2A.g:286:1: ( ruleInstanciaEDOM EOF )
            // InternalT2A.g:287:1: ruleInstanciaEDOM EOF
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
    // InternalT2A.g:294:1: ruleInstanciaEDOM : ( ( rule__InstanciaEDOM__Group__0 ) ) ;
    public final void ruleInstanciaEDOM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:298:2: ( ( ( rule__InstanciaEDOM__Group__0 ) ) )
            // InternalT2A.g:299:2: ( ( rule__InstanciaEDOM__Group__0 ) )
            {
            // InternalT2A.g:299:2: ( ( rule__InstanciaEDOM__Group__0 ) )
            // InternalT2A.g:300:3: ( rule__InstanciaEDOM__Group__0 )
            {
             before(grammarAccess.getInstanciaEDOMAccess().getGroup()); 
            // InternalT2A.g:301:3: ( rule__InstanciaEDOM__Group__0 )
            // InternalT2A.g:301:4: rule__InstanciaEDOM__Group__0
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
    // InternalT2A.g:310:1: entryRuleInstanceEDOMFeature : ruleInstanceEDOMFeature EOF ;
    public final void entryRuleInstanceEDOMFeature() throws RecognitionException {
        try {
            // InternalT2A.g:311:1: ( ruleInstanceEDOMFeature EOF )
            // InternalT2A.g:312:1: ruleInstanceEDOMFeature EOF
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
    // InternalT2A.g:319:1: ruleInstanceEDOMFeature : ( ( rule__InstanceEDOMFeature__Alternatives ) ) ;
    public final void ruleInstanceEDOMFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:323:2: ( ( ( rule__InstanceEDOMFeature__Alternatives ) ) )
            // InternalT2A.g:324:2: ( ( rule__InstanceEDOMFeature__Alternatives ) )
            {
            // InternalT2A.g:324:2: ( ( rule__InstanceEDOMFeature__Alternatives ) )
            // InternalT2A.g:325:3: ( rule__InstanceEDOMFeature__Alternatives )
            {
             before(grammarAccess.getInstanceEDOMFeatureAccess().getAlternatives()); 
            // InternalT2A.g:326:3: ( rule__InstanceEDOMFeature__Alternatives )
            // InternalT2A.g:326:4: rule__InstanceEDOMFeature__Alternatives
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
    // InternalT2A.g:335:1: entryRulePageFeature : rulePageFeature EOF ;
    public final void entryRulePageFeature() throws RecognitionException {
        try {
            // InternalT2A.g:336:1: ( rulePageFeature EOF )
            // InternalT2A.g:337:1: rulePageFeature EOF
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
    // InternalT2A.g:344:1: rulePageFeature : ( ( rule__PageFeature__Alternatives ) ) ;
    public final void rulePageFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:348:2: ( ( ( rule__PageFeature__Alternatives ) ) )
            // InternalT2A.g:349:2: ( ( rule__PageFeature__Alternatives ) )
            {
            // InternalT2A.g:349:2: ( ( rule__PageFeature__Alternatives ) )
            // InternalT2A.g:350:3: ( rule__PageFeature__Alternatives )
            {
             before(grammarAccess.getPageFeatureAccess().getAlternatives()); 
            // InternalT2A.g:351:3: ( rule__PageFeature__Alternatives )
            // InternalT2A.g:351:4: rule__PageFeature__Alternatives
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
    // InternalT2A.g:360:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalT2A.g:361:1: ( ruleFeature EOF )
            // InternalT2A.g:362:1: ruleFeature EOF
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
    // InternalT2A.g:369:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:373:2: ( ( ( rule__Feature__Alternatives ) ) )
            // InternalT2A.g:374:2: ( ( rule__Feature__Alternatives ) )
            {
            // InternalT2A.g:374:2: ( ( rule__Feature__Alternatives ) )
            // InternalT2A.g:375:3: ( rule__Feature__Alternatives )
            {
             before(grammarAccess.getFeatureAccess().getAlternatives()); 
            // InternalT2A.g:376:3: ( rule__Feature__Alternatives )
            // InternalT2A.g:376:4: rule__Feature__Alternatives
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


    // $ANTLR start "rule__Element__Alternatives"
    // InternalT2A.g:384:1: rule__Element__Alternatives : ( ( rulePage ) | ( ruleEDOM ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:388:1: ( ( rulePage ) | ( ruleEDOM ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=15 && LA2_0<=16)||(LA2_0>=18 && LA2_0<=19)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
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
    // InternalT2A.g:405:1: rule__EDOM__Alternatives : ( ( ruleDOM ) | ( ruleComp ) | ( ruleStyleClass ) | ( ruleSAttributeName ) );
    public final void rule__EDOM__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:409:1: ( ( ruleDOM ) | ( ruleComp ) | ( ruleStyleClass ) | ( ruleSAttributeName ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
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
                case 4 :
                    // InternalT2A.g:428:2: ( ruleSAttributeName )
                    {
                    // InternalT2A.g:428:2: ( ruleSAttributeName )
                    // InternalT2A.g:429:3: ruleSAttributeName
                    {
                     before(grammarAccess.getEDOMAccess().getSAttributeNameParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSAttributeName();

                    state._fsp--;

                     after(grammarAccess.getEDOMAccess().getSAttributeNameParserRuleCall_3()); 

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
    // InternalT2A.g:438:1: rule__InstanceEDOMFeature__Alternatives : ( ( ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__InstanceEDOMFeature__StringAssignment_1 ) ) );
    public final void rule__InstanceEDOMFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:442:1: ( ( ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__InstanceEDOMFeature__StringAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalT2A.g:443:2: ( ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 ) )
                    {
                    // InternalT2A.g:443:2: ( ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 ) )
                    // InternalT2A.g:444:3: ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 )
                    {
                     before(grammarAccess.getInstanceEDOMFeatureAccess().getInstanciaEDOMAssignment_0()); 
                    // InternalT2A.g:445:3: ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 )
                    // InternalT2A.g:445:4: rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0
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
                    // InternalT2A.g:449:2: ( ( rule__InstanceEDOMFeature__StringAssignment_1 ) )
                    {
                    // InternalT2A.g:449:2: ( ( rule__InstanceEDOMFeature__StringAssignment_1 ) )
                    // InternalT2A.g:450:3: ( rule__InstanceEDOMFeature__StringAssignment_1 )
                    {
                     before(grammarAccess.getInstanceEDOMFeatureAccess().getStringAssignment_1()); 
                    // InternalT2A.g:451:3: ( rule__InstanceEDOMFeature__StringAssignment_1 )
                    // InternalT2A.g:451:4: rule__InstanceEDOMFeature__StringAssignment_1
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
    // InternalT2A.g:459:1: rule__PageFeature__Alternatives : ( ( ( rule__PageFeature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__PageFeature__StringAssignment_1 ) ) );
    public final void rule__PageFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:463:1: ( ( ( rule__PageFeature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__PageFeature__StringAssignment_1 ) ) )
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
                    // InternalT2A.g:464:2: ( ( rule__PageFeature__InstanciaEDOMAssignment_0 ) )
                    {
                    // InternalT2A.g:464:2: ( ( rule__PageFeature__InstanciaEDOMAssignment_0 ) )
                    // InternalT2A.g:465:3: ( rule__PageFeature__InstanciaEDOMAssignment_0 )
                    {
                     before(grammarAccess.getPageFeatureAccess().getInstanciaEDOMAssignment_0()); 
                    // InternalT2A.g:466:3: ( rule__PageFeature__InstanciaEDOMAssignment_0 )
                    // InternalT2A.g:466:4: rule__PageFeature__InstanciaEDOMAssignment_0
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
                    // InternalT2A.g:470:2: ( ( rule__PageFeature__StringAssignment_1 ) )
                    {
                    // InternalT2A.g:470:2: ( ( rule__PageFeature__StringAssignment_1 ) )
                    // InternalT2A.g:471:3: ( rule__PageFeature__StringAssignment_1 )
                    {
                     before(grammarAccess.getPageFeatureAccess().getStringAssignment_1()); 
                    // InternalT2A.g:472:3: ( rule__PageFeature__StringAssignment_1 )
                    // InternalT2A.g:472:4: rule__PageFeature__StringAssignment_1
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
    // InternalT2A.g:480:1: rule__Feature__Alternatives : ( ( ( rule__Feature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__Feature__AllowSlotAssignment_1 ) ) | ( ( rule__Feature__StringAssignment_2 ) ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:484:1: ( ( ( rule__Feature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__Feature__AllowSlotAssignment_1 ) ) | ( ( rule__Feature__StringAssignment_2 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 22:
                {
                alt6=2;
                }
                break;
            case RULE_STRING:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalT2A.g:485:2: ( ( rule__Feature__InstanciaEDOMAssignment_0 ) )
                    {
                    // InternalT2A.g:485:2: ( ( rule__Feature__InstanciaEDOMAssignment_0 ) )
                    // InternalT2A.g:486:3: ( rule__Feature__InstanciaEDOMAssignment_0 )
                    {
                     before(grammarAccess.getFeatureAccess().getInstanciaEDOMAssignment_0()); 
                    // InternalT2A.g:487:3: ( rule__Feature__InstanciaEDOMAssignment_0 )
                    // InternalT2A.g:487:4: rule__Feature__InstanciaEDOMAssignment_0
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
                    // InternalT2A.g:491:2: ( ( rule__Feature__AllowSlotAssignment_1 ) )
                    {
                    // InternalT2A.g:491:2: ( ( rule__Feature__AllowSlotAssignment_1 ) )
                    // InternalT2A.g:492:3: ( rule__Feature__AllowSlotAssignment_1 )
                    {
                     before(grammarAccess.getFeatureAccess().getAllowSlotAssignment_1()); 
                    // InternalT2A.g:493:3: ( rule__Feature__AllowSlotAssignment_1 )
                    // InternalT2A.g:493:4: rule__Feature__AllowSlotAssignment_1
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
                    // InternalT2A.g:497:2: ( ( rule__Feature__StringAssignment_2 ) )
                    {
                    // InternalT2A.g:497:2: ( ( rule__Feature__StringAssignment_2 ) )
                    // InternalT2A.g:498:3: ( rule__Feature__StringAssignment_2 )
                    {
                     before(grammarAccess.getFeatureAccess().getStringAssignment_2()); 
                    // InternalT2A.g:499:3: ( rule__Feature__StringAssignment_2 )
                    // InternalT2A.g:499:4: rule__Feature__StringAssignment_2
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


    // $ANTLR start "rule__Page__Group__0"
    // InternalT2A.g:507:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:511:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // InternalT2A.g:512:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalT2A.g:519:1: rule__Page__Group__0__Impl : ( 'Page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:523:1: ( ( 'Page' ) )
            // InternalT2A.g:524:1: ( 'Page' )
            {
            // InternalT2A.g:524:1: ( 'Page' )
            // InternalT2A.g:525:2: 'Page'
            {
             before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalT2A.g:534:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:538:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // InternalT2A.g:539:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalT2A.g:546:1: rule__Page__Group__1__Impl : ( ( rule__Page__NameAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:550:1: ( ( ( rule__Page__NameAssignment_1 ) ) )
            // InternalT2A.g:551:1: ( ( rule__Page__NameAssignment_1 ) )
            {
            // InternalT2A.g:551:1: ( ( rule__Page__NameAssignment_1 ) )
            // InternalT2A.g:552:2: ( rule__Page__NameAssignment_1 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_1()); 
            // InternalT2A.g:553:2: ( rule__Page__NameAssignment_1 )
            // InternalT2A.g:553:3: rule__Page__NameAssignment_1
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
    // InternalT2A.g:561:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:565:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // InternalT2A.g:566:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalT2A.g:573:1: rule__Page__Group__2__Impl : ( '{' ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:577:1: ( ( '{' ) )
            // InternalT2A.g:578:1: ( '{' )
            {
            // InternalT2A.g:578:1: ( '{' )
            // InternalT2A.g:579:2: '{'
            {
             before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalT2A.g:588:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:592:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // InternalT2A.g:593:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalT2A.g:600:1: rule__Page__Group__3__Impl : ( ( rule__Page__Group_3__0 )? ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:604:1: ( ( ( rule__Page__Group_3__0 )? ) )
            // InternalT2A.g:605:1: ( ( rule__Page__Group_3__0 )? )
            {
            // InternalT2A.g:605:1: ( ( rule__Page__Group_3__0 )? )
            // InternalT2A.g:606:2: ( rule__Page__Group_3__0 )?
            {
             before(grammarAccess.getPageAccess().getGroup_3()); 
            // InternalT2A.g:607:2: ( rule__Page__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalT2A.g:607:3: rule__Page__Group_3__0
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
    // InternalT2A.g:615:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:619:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // InternalT2A.g:620:2: rule__Page__Group__4__Impl rule__Page__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalT2A.g:627:1: rule__Page__Group__4__Impl : ( ( rule__Page__HomeAssignment_4 )? ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:631:1: ( ( ( rule__Page__HomeAssignment_4 )? ) )
            // InternalT2A.g:632:1: ( ( rule__Page__HomeAssignment_4 )? )
            {
            // InternalT2A.g:632:1: ( ( rule__Page__HomeAssignment_4 )? )
            // InternalT2A.g:633:2: ( rule__Page__HomeAssignment_4 )?
            {
             before(grammarAccess.getPageAccess().getHomeAssignment_4()); 
            // InternalT2A.g:634:2: ( rule__Page__HomeAssignment_4 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalT2A.g:634:3: rule__Page__HomeAssignment_4
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
    // InternalT2A.g:642:1: rule__Page__Group__5 : rule__Page__Group__5__Impl rule__Page__Group__6 ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:646:1: ( rule__Page__Group__5__Impl rule__Page__Group__6 )
            // InternalT2A.g:647:2: rule__Page__Group__5__Impl rule__Page__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalT2A.g:654:1: rule__Page__Group__5__Impl : ( ( rule__Page__ShowInNavAssignment_5 )? ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:658:1: ( ( ( rule__Page__ShowInNavAssignment_5 )? ) )
            // InternalT2A.g:659:1: ( ( rule__Page__ShowInNavAssignment_5 )? )
            {
            // InternalT2A.g:659:1: ( ( rule__Page__ShowInNavAssignment_5 )? )
            // InternalT2A.g:660:2: ( rule__Page__ShowInNavAssignment_5 )?
            {
             before(grammarAccess.getPageAccess().getShowInNavAssignment_5()); 
            // InternalT2A.g:661:2: ( rule__Page__ShowInNavAssignment_5 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalT2A.g:661:3: rule__Page__ShowInNavAssignment_5
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
    // InternalT2A.g:669:1: rule__Page__Group__6 : rule__Page__Group__6__Impl rule__Page__Group__7 ;
    public final void rule__Page__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:673:1: ( rule__Page__Group__6__Impl rule__Page__Group__7 )
            // InternalT2A.g:674:2: rule__Page__Group__6__Impl rule__Page__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalT2A.g:681:1: rule__Page__Group__6__Impl : ( ( rule__Page__PageFeaturesAssignment_6 )* ) ;
    public final void rule__Page__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:685:1: ( ( ( rule__Page__PageFeaturesAssignment_6 )* ) )
            // InternalT2A.g:686:1: ( ( rule__Page__PageFeaturesAssignment_6 )* )
            {
            // InternalT2A.g:686:1: ( ( rule__Page__PageFeaturesAssignment_6 )* )
            // InternalT2A.g:687:2: ( rule__Page__PageFeaturesAssignment_6 )*
            {
             before(grammarAccess.getPageAccess().getPageFeaturesAssignment_6()); 
            // InternalT2A.g:688:2: ( rule__Page__PageFeaturesAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalT2A.g:688:3: rule__Page__PageFeaturesAssignment_6
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Page__PageFeaturesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalT2A.g:696:1: rule__Page__Group__7 : rule__Page__Group__7__Impl ;
    public final void rule__Page__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:700:1: ( rule__Page__Group__7__Impl )
            // InternalT2A.g:701:2: rule__Page__Group__7__Impl
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
    // InternalT2A.g:707:1: rule__Page__Group__7__Impl : ( '}' ) ;
    public final void rule__Page__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:711:1: ( ( '}' ) )
            // InternalT2A.g:712:1: ( '}' )
            {
            // InternalT2A.g:712:1: ( '}' )
            // InternalT2A.g:713:2: '}'
            {
             before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
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
    // InternalT2A.g:723:1: rule__Page__Group_3__0 : rule__Page__Group_3__0__Impl rule__Page__Group_3__1 ;
    public final void rule__Page__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:727:1: ( rule__Page__Group_3__0__Impl rule__Page__Group_3__1 )
            // InternalT2A.g:728:2: rule__Page__Group_3__0__Impl rule__Page__Group_3__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalT2A.g:735:1: rule__Page__Group_3__0__Impl : ( 'SClass:{' ) ;
    public final void rule__Page__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:739:1: ( ( 'SClass:{' ) )
            // InternalT2A.g:740:1: ( 'SClass:{' )
            {
            // InternalT2A.g:740:1: ( 'SClass:{' )
            // InternalT2A.g:741:2: 'SClass:{'
            {
             before(grammarAccess.getPageAccess().getSClassKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getSClassKeyword_3_0()); 

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
    // InternalT2A.g:750:1: rule__Page__Group_3__1 : rule__Page__Group_3__1__Impl rule__Page__Group_3__2 ;
    public final void rule__Page__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:754:1: ( rule__Page__Group_3__1__Impl rule__Page__Group_3__2 )
            // InternalT2A.g:755:2: rule__Page__Group_3__1__Impl rule__Page__Group_3__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalT2A.g:762:1: rule__Page__Group_3__1__Impl : ( ( rule__Page__SclassesAssignment_3_1 )* ) ;
    public final void rule__Page__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:766:1: ( ( ( rule__Page__SclassesAssignment_3_1 )* ) )
            // InternalT2A.g:767:1: ( ( rule__Page__SclassesAssignment_3_1 )* )
            {
            // InternalT2A.g:767:1: ( ( rule__Page__SclassesAssignment_3_1 )* )
            // InternalT2A.g:768:2: ( rule__Page__SclassesAssignment_3_1 )*
            {
             before(grammarAccess.getPageAccess().getSclassesAssignment_3_1()); 
            // InternalT2A.g:769:2: ( rule__Page__SclassesAssignment_3_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalT2A.g:769:3: rule__Page__SclassesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Page__SclassesAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPageAccess().getSclassesAssignment_3_1()); 

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
    // InternalT2A.g:777:1: rule__Page__Group_3__2 : rule__Page__Group_3__2__Impl ;
    public final void rule__Page__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:781:1: ( rule__Page__Group_3__2__Impl )
            // InternalT2A.g:782:2: rule__Page__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group_3__2__Impl();

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
    // InternalT2A.g:788:1: rule__Page__Group_3__2__Impl : ( '}' ) ;
    public final void rule__Page__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:792:1: ( ( '}' ) )
            // InternalT2A.g:793:1: ( '}' )
            {
            // InternalT2A.g:793:1: ( '}' )
            // InternalT2A.g:794:2: '}'
            {
             before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_3_2()); 

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


    // $ANTLR start "rule__StyleClass__Group__0"
    // InternalT2A.g:804:1: rule__StyleClass__Group__0 : rule__StyleClass__Group__0__Impl rule__StyleClass__Group__1 ;
    public final void rule__StyleClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:808:1: ( rule__StyleClass__Group__0__Impl rule__StyleClass__Group__1 )
            // InternalT2A.g:809:2: rule__StyleClass__Group__0__Impl rule__StyleClass__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalT2A.g:816:1: rule__StyleClass__Group__0__Impl : ( 'StyleClass' ) ;
    public final void rule__StyleClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:820:1: ( ( 'StyleClass' ) )
            // InternalT2A.g:821:1: ( 'StyleClass' )
            {
            // InternalT2A.g:821:1: ( 'StyleClass' )
            // InternalT2A.g:822:2: 'StyleClass'
            {
             before(grammarAccess.getStyleClassAccess().getStyleClassKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalT2A.g:831:1: rule__StyleClass__Group__1 : rule__StyleClass__Group__1__Impl rule__StyleClass__Group__2 ;
    public final void rule__StyleClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:835:1: ( rule__StyleClass__Group__1__Impl rule__StyleClass__Group__2 )
            // InternalT2A.g:836:2: rule__StyleClass__Group__1__Impl rule__StyleClass__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalT2A.g:843:1: rule__StyleClass__Group__1__Impl : ( ( rule__StyleClass__NameAssignment_1 ) ) ;
    public final void rule__StyleClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:847:1: ( ( ( rule__StyleClass__NameAssignment_1 ) ) )
            // InternalT2A.g:848:1: ( ( rule__StyleClass__NameAssignment_1 ) )
            {
            // InternalT2A.g:848:1: ( ( rule__StyleClass__NameAssignment_1 ) )
            // InternalT2A.g:849:2: ( rule__StyleClass__NameAssignment_1 )
            {
             before(grammarAccess.getStyleClassAccess().getNameAssignment_1()); 
            // InternalT2A.g:850:2: ( rule__StyleClass__NameAssignment_1 )
            // InternalT2A.g:850:3: rule__StyleClass__NameAssignment_1
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
    // InternalT2A.g:858:1: rule__StyleClass__Group__2 : rule__StyleClass__Group__2__Impl rule__StyleClass__Group__3 ;
    public final void rule__StyleClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:862:1: ( rule__StyleClass__Group__2__Impl rule__StyleClass__Group__3 )
            // InternalT2A.g:863:2: rule__StyleClass__Group__2__Impl rule__StyleClass__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalT2A.g:870:1: rule__StyleClass__Group__2__Impl : ( '{' ) ;
    public final void rule__StyleClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:874:1: ( ( '{' ) )
            // InternalT2A.g:875:1: ( '{' )
            {
            // InternalT2A.g:875:1: ( '{' )
            // InternalT2A.g:876:2: '{'
            {
             before(grammarAccess.getStyleClassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalT2A.g:885:1: rule__StyleClass__Group__3 : rule__StyleClass__Group__3__Impl rule__StyleClass__Group__4 ;
    public final void rule__StyleClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:889:1: ( rule__StyleClass__Group__3__Impl rule__StyleClass__Group__4 )
            // InternalT2A.g:890:2: rule__StyleClass__Group__3__Impl rule__StyleClass__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalT2A.g:897:1: rule__StyleClass__Group__3__Impl : ( ( rule__StyleClass__SattributesAssignment_3 )* ) ;
    public final void rule__StyleClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:901:1: ( ( ( rule__StyleClass__SattributesAssignment_3 )* ) )
            // InternalT2A.g:902:1: ( ( rule__StyleClass__SattributesAssignment_3 )* )
            {
            // InternalT2A.g:902:1: ( ( rule__StyleClass__SattributesAssignment_3 )* )
            // InternalT2A.g:903:2: ( rule__StyleClass__SattributesAssignment_3 )*
            {
             before(grammarAccess.getStyleClassAccess().getSattributesAssignment_3()); 
            // InternalT2A.g:904:2: ( rule__StyleClass__SattributesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalT2A.g:904:3: rule__StyleClass__SattributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__StyleClass__SattributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getStyleClassAccess().getSattributesAssignment_3()); 

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
    // InternalT2A.g:912:1: rule__StyleClass__Group__4 : rule__StyleClass__Group__4__Impl ;
    public final void rule__StyleClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:916:1: ( rule__StyleClass__Group__4__Impl )
            // InternalT2A.g:917:2: rule__StyleClass__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StyleClass__Group__4__Impl();

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
    // InternalT2A.g:923:1: rule__StyleClass__Group__4__Impl : ( '}' ) ;
    public final void rule__StyleClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:927:1: ( ( '}' ) )
            // InternalT2A.g:928:1: ( '}' )
            {
            // InternalT2A.g:928:1: ( '}' )
            // InternalT2A.g:929:2: '}'
            {
             before(grammarAccess.getStyleClassAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStyleClassAccess().getRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__SAttributeName__Group__0"
    // InternalT2A.g:939:1: rule__SAttributeName__Group__0 : rule__SAttributeName__Group__0__Impl rule__SAttributeName__Group__1 ;
    public final void rule__SAttributeName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:943:1: ( rule__SAttributeName__Group__0__Impl rule__SAttributeName__Group__1 )
            // InternalT2A.g:944:2: rule__SAttributeName__Group__0__Impl rule__SAttributeName__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SAttributeName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAttributeName__Group__1();

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
    // $ANTLR end "rule__SAttributeName__Group__0"


    // $ANTLR start "rule__SAttributeName__Group__0__Impl"
    // InternalT2A.g:951:1: rule__SAttributeName__Group__0__Impl : ( 'SAttri' ) ;
    public final void rule__SAttributeName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:955:1: ( ( 'SAttri' ) )
            // InternalT2A.g:956:1: ( 'SAttri' )
            {
            // InternalT2A.g:956:1: ( 'SAttri' )
            // InternalT2A.g:957:2: 'SAttri'
            {
             before(grammarAccess.getSAttributeNameAccess().getSAttriKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSAttributeNameAccess().getSAttriKeyword_0()); 

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
    // $ANTLR end "rule__SAttributeName__Group__0__Impl"


    // $ANTLR start "rule__SAttributeName__Group__1"
    // InternalT2A.g:966:1: rule__SAttributeName__Group__1 : rule__SAttributeName__Group__1__Impl ;
    public final void rule__SAttributeName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:970:1: ( rule__SAttributeName__Group__1__Impl )
            // InternalT2A.g:971:2: rule__SAttributeName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAttributeName__Group__1__Impl();

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
    // $ANTLR end "rule__SAttributeName__Group__1"


    // $ANTLR start "rule__SAttributeName__Group__1__Impl"
    // InternalT2A.g:977:1: rule__SAttributeName__Group__1__Impl : ( ( rule__SAttributeName__NameAssignment_1 ) ) ;
    public final void rule__SAttributeName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:981:1: ( ( ( rule__SAttributeName__NameAssignment_1 ) ) )
            // InternalT2A.g:982:1: ( ( rule__SAttributeName__NameAssignment_1 ) )
            {
            // InternalT2A.g:982:1: ( ( rule__SAttributeName__NameAssignment_1 ) )
            // InternalT2A.g:983:2: ( rule__SAttributeName__NameAssignment_1 )
            {
             before(grammarAccess.getSAttributeNameAccess().getNameAssignment_1()); 
            // InternalT2A.g:984:2: ( rule__SAttributeName__NameAssignment_1 )
            // InternalT2A.g:984:3: rule__SAttributeName__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SAttributeName__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSAttributeNameAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SAttributeName__Group__1__Impl"


    // $ANTLR start "rule__SAttributeAndValue__Group__0"
    // InternalT2A.g:993:1: rule__SAttributeAndValue__Group__0 : rule__SAttributeAndValue__Group__0__Impl rule__SAttributeAndValue__Group__1 ;
    public final void rule__SAttributeAndValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:997:1: ( rule__SAttributeAndValue__Group__0__Impl rule__SAttributeAndValue__Group__1 )
            // InternalT2A.g:998:2: rule__SAttributeAndValue__Group__0__Impl rule__SAttributeAndValue__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalT2A.g:1005:1: rule__SAttributeAndValue__Group__0__Impl : ( ( rule__SAttributeAndValue__StnameAssignment_0 ) ) ;
    public final void rule__SAttributeAndValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1009:1: ( ( ( rule__SAttributeAndValue__StnameAssignment_0 ) ) )
            // InternalT2A.g:1010:1: ( ( rule__SAttributeAndValue__StnameAssignment_0 ) )
            {
            // InternalT2A.g:1010:1: ( ( rule__SAttributeAndValue__StnameAssignment_0 ) )
            // InternalT2A.g:1011:2: ( rule__SAttributeAndValue__StnameAssignment_0 )
            {
             before(grammarAccess.getSAttributeAndValueAccess().getStnameAssignment_0()); 
            // InternalT2A.g:1012:2: ( rule__SAttributeAndValue__StnameAssignment_0 )
            // InternalT2A.g:1012:3: rule__SAttributeAndValue__StnameAssignment_0
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
    // InternalT2A.g:1020:1: rule__SAttributeAndValue__Group__1 : rule__SAttributeAndValue__Group__1__Impl rule__SAttributeAndValue__Group__2 ;
    public final void rule__SAttributeAndValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1024:1: ( rule__SAttributeAndValue__Group__1__Impl rule__SAttributeAndValue__Group__2 )
            // InternalT2A.g:1025:2: rule__SAttributeAndValue__Group__1__Impl rule__SAttributeAndValue__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__SAttributeAndValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAttributeAndValue__Group__2();

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
    // InternalT2A.g:1032:1: rule__SAttributeAndValue__Group__1__Impl : ( ':' ) ;
    public final void rule__SAttributeAndValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1036:1: ( ( ':' ) )
            // InternalT2A.g:1037:1: ( ':' )
            {
            // InternalT2A.g:1037:1: ( ':' )
            // InternalT2A.g:1038:2: ':'
            {
             before(grammarAccess.getSAttributeAndValueAccess().getColonKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSAttributeAndValueAccess().getColonKeyword_1()); 

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


    // $ANTLR start "rule__SAttributeAndValue__Group__2"
    // InternalT2A.g:1047:1: rule__SAttributeAndValue__Group__2 : rule__SAttributeAndValue__Group__2__Impl ;
    public final void rule__SAttributeAndValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1051:1: ( rule__SAttributeAndValue__Group__2__Impl )
            // InternalT2A.g:1052:2: rule__SAttributeAndValue__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAttributeAndValue__Group__2__Impl();

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
    // $ANTLR end "rule__SAttributeAndValue__Group__2"


    // $ANTLR start "rule__SAttributeAndValue__Group__2__Impl"
    // InternalT2A.g:1058:1: rule__SAttributeAndValue__Group__2__Impl : ( ( rule__SAttributeAndValue__ValueAssignment_2 ) ) ;
    public final void rule__SAttributeAndValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1062:1: ( ( ( rule__SAttributeAndValue__ValueAssignment_2 ) ) )
            // InternalT2A.g:1063:1: ( ( rule__SAttributeAndValue__ValueAssignment_2 ) )
            {
            // InternalT2A.g:1063:1: ( ( rule__SAttributeAndValue__ValueAssignment_2 ) )
            // InternalT2A.g:1064:2: ( rule__SAttributeAndValue__ValueAssignment_2 )
            {
             before(grammarAccess.getSAttributeAndValueAccess().getValueAssignment_2()); 
            // InternalT2A.g:1065:2: ( rule__SAttributeAndValue__ValueAssignment_2 )
            // InternalT2A.g:1065:3: rule__SAttributeAndValue__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SAttributeAndValue__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSAttributeAndValueAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__SAttributeAndValue__Group__2__Impl"


    // $ANTLR start "rule__DOM__Group__0"
    // InternalT2A.g:1074:1: rule__DOM__Group__0 : rule__DOM__Group__0__Impl rule__DOM__Group__1 ;
    public final void rule__DOM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1078:1: ( rule__DOM__Group__0__Impl rule__DOM__Group__1 )
            // InternalT2A.g:1079:2: rule__DOM__Group__0__Impl rule__DOM__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalT2A.g:1086:1: rule__DOM__Group__0__Impl : ( 'Dom' ) ;
    public final void rule__DOM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1090:1: ( ( 'Dom' ) )
            // InternalT2A.g:1091:1: ( 'Dom' )
            {
            // InternalT2A.g:1091:1: ( 'Dom' )
            // InternalT2A.g:1092:2: 'Dom'
            {
             before(grammarAccess.getDOMAccess().getDomKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalT2A.g:1101:1: rule__DOM__Group__1 : rule__DOM__Group__1__Impl rule__DOM__Group__2 ;
    public final void rule__DOM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1105:1: ( rule__DOM__Group__1__Impl rule__DOM__Group__2 )
            // InternalT2A.g:1106:2: rule__DOM__Group__1__Impl rule__DOM__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalT2A.g:1113:1: rule__DOM__Group__1__Impl : ( ( rule__DOM__NameAssignment_1 ) ) ;
    public final void rule__DOM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1117:1: ( ( ( rule__DOM__NameAssignment_1 ) ) )
            // InternalT2A.g:1118:1: ( ( rule__DOM__NameAssignment_1 ) )
            {
            // InternalT2A.g:1118:1: ( ( rule__DOM__NameAssignment_1 ) )
            // InternalT2A.g:1119:2: ( rule__DOM__NameAssignment_1 )
            {
             before(grammarAccess.getDOMAccess().getNameAssignment_1()); 
            // InternalT2A.g:1120:2: ( rule__DOM__NameAssignment_1 )
            // InternalT2A.g:1120:3: rule__DOM__NameAssignment_1
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
    // InternalT2A.g:1128:1: rule__DOM__Group__2 : rule__DOM__Group__2__Impl ;
    public final void rule__DOM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1132:1: ( rule__DOM__Group__2__Impl )
            // InternalT2A.g:1133:2: rule__DOM__Group__2__Impl
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
    // InternalT2A.g:1139:1: rule__DOM__Group__2__Impl : ( ( rule__DOM__Group_2__0 )? ) ;
    public final void rule__DOM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1143:1: ( ( ( rule__DOM__Group_2__0 )? ) )
            // InternalT2A.g:1144:1: ( ( rule__DOM__Group_2__0 )? )
            {
            // InternalT2A.g:1144:1: ( ( rule__DOM__Group_2__0 )? )
            // InternalT2A.g:1145:2: ( rule__DOM__Group_2__0 )?
            {
             before(grammarAccess.getDOMAccess().getGroup_2()); 
            // InternalT2A.g:1146:2: ( rule__DOM__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==12) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalT2A.g:1146:3: rule__DOM__Group_2__0
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
    // InternalT2A.g:1155:1: rule__DOM__Group_2__0 : rule__DOM__Group_2__0__Impl rule__DOM__Group_2__1 ;
    public final void rule__DOM__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1159:1: ( rule__DOM__Group_2__0__Impl rule__DOM__Group_2__1 )
            // InternalT2A.g:1160:2: rule__DOM__Group_2__0__Impl rule__DOM__Group_2__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalT2A.g:1167:1: rule__DOM__Group_2__0__Impl : ( '{' ) ;
    public final void rule__DOM__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1171:1: ( ( '{' ) )
            // InternalT2A.g:1172:1: ( '{' )
            {
            // InternalT2A.g:1172:1: ( '{' )
            // InternalT2A.g:1173:2: '{'
            {
             before(grammarAccess.getDOMAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalT2A.g:1182:1: rule__DOM__Group_2__1 : rule__DOM__Group_2__1__Impl rule__DOM__Group_2__2 ;
    public final void rule__DOM__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1186:1: ( rule__DOM__Group_2__1__Impl rule__DOM__Group_2__2 )
            // InternalT2A.g:1187:2: rule__DOM__Group_2__1__Impl rule__DOM__Group_2__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalT2A.g:1194:1: rule__DOM__Group_2__1__Impl : ( ( rule__DOM__Group_2_1__0 )? ) ;
    public final void rule__DOM__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1198:1: ( ( ( rule__DOM__Group_2_1__0 )? ) )
            // InternalT2A.g:1199:1: ( ( rule__DOM__Group_2_1__0 )? )
            {
            // InternalT2A.g:1199:1: ( ( rule__DOM__Group_2_1__0 )? )
            // InternalT2A.g:1200:2: ( rule__DOM__Group_2_1__0 )?
            {
             before(grammarAccess.getDOMAccess().getGroup_2_1()); 
            // InternalT2A.g:1201:2: ( rule__DOM__Group_2_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalT2A.g:1201:3: rule__DOM__Group_2_1__0
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
    // InternalT2A.g:1209:1: rule__DOM__Group_2__2 : rule__DOM__Group_2__2__Impl rule__DOM__Group_2__3 ;
    public final void rule__DOM__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1213:1: ( rule__DOM__Group_2__2__Impl rule__DOM__Group_2__3 )
            // InternalT2A.g:1214:2: rule__DOM__Group_2__2__Impl rule__DOM__Group_2__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalT2A.g:1221:1: rule__DOM__Group_2__2__Impl : ( ( rule__DOM__FeaturesAssignment_2_2 )* ) ;
    public final void rule__DOM__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1225:1: ( ( ( rule__DOM__FeaturesAssignment_2_2 )* ) )
            // InternalT2A.g:1226:1: ( ( rule__DOM__FeaturesAssignment_2_2 )* )
            {
            // InternalT2A.g:1226:1: ( ( rule__DOM__FeaturesAssignment_2_2 )* )
            // InternalT2A.g:1227:2: ( rule__DOM__FeaturesAssignment_2_2 )*
            {
             before(grammarAccess.getDOMAccess().getFeaturesAssignment_2_2()); 
            // InternalT2A.g:1228:2: ( rule__DOM__FeaturesAssignment_2_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_STRING)||LA15_0==22) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalT2A.g:1228:3: rule__DOM__FeaturesAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__DOM__FeaturesAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalT2A.g:1236:1: rule__DOM__Group_2__3 : rule__DOM__Group_2__3__Impl ;
    public final void rule__DOM__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1240:1: ( rule__DOM__Group_2__3__Impl )
            // InternalT2A.g:1241:2: rule__DOM__Group_2__3__Impl
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
    // InternalT2A.g:1247:1: rule__DOM__Group_2__3__Impl : ( '}' ) ;
    public final void rule__DOM__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1251:1: ( ( '}' ) )
            // InternalT2A.g:1252:1: ( '}' )
            {
            // InternalT2A.g:1252:1: ( '}' )
            // InternalT2A.g:1253:2: '}'
            {
             before(grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,13,FOLLOW_2); 
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
    // InternalT2A.g:1263:1: rule__DOM__Group_2_1__0 : rule__DOM__Group_2_1__0__Impl rule__DOM__Group_2_1__1 ;
    public final void rule__DOM__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1267:1: ( rule__DOM__Group_2_1__0__Impl rule__DOM__Group_2_1__1 )
            // InternalT2A.g:1268:2: rule__DOM__Group_2_1__0__Impl rule__DOM__Group_2_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalT2A.g:1275:1: rule__DOM__Group_2_1__0__Impl : ( 'SClass:{' ) ;
    public final void rule__DOM__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1279:1: ( ( 'SClass:{' ) )
            // InternalT2A.g:1280:1: ( 'SClass:{' )
            {
            // InternalT2A.g:1280:1: ( 'SClass:{' )
            // InternalT2A.g:1281:2: 'SClass:{'
            {
             before(grammarAccess.getDOMAccess().getSClassKeyword_2_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDOMAccess().getSClassKeyword_2_1_0()); 

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
    // InternalT2A.g:1290:1: rule__DOM__Group_2_1__1 : rule__DOM__Group_2_1__1__Impl rule__DOM__Group_2_1__2 ;
    public final void rule__DOM__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1294:1: ( rule__DOM__Group_2_1__1__Impl rule__DOM__Group_2_1__2 )
            // InternalT2A.g:1295:2: rule__DOM__Group_2_1__1__Impl rule__DOM__Group_2_1__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalT2A.g:1302:1: rule__DOM__Group_2_1__1__Impl : ( ( rule__DOM__SclassesAssignment_2_1_1 )* ) ;
    public final void rule__DOM__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1306:1: ( ( ( rule__DOM__SclassesAssignment_2_1_1 )* ) )
            // InternalT2A.g:1307:1: ( ( rule__DOM__SclassesAssignment_2_1_1 )* )
            {
            // InternalT2A.g:1307:1: ( ( rule__DOM__SclassesAssignment_2_1_1 )* )
            // InternalT2A.g:1308:2: ( rule__DOM__SclassesAssignment_2_1_1 )*
            {
             before(grammarAccess.getDOMAccess().getSclassesAssignment_2_1_1()); 
            // InternalT2A.g:1309:2: ( rule__DOM__SclassesAssignment_2_1_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalT2A.g:1309:3: rule__DOM__SclassesAssignment_2_1_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DOM__SclassesAssignment_2_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getDOMAccess().getSclassesAssignment_2_1_1()); 

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
    // InternalT2A.g:1317:1: rule__DOM__Group_2_1__2 : rule__DOM__Group_2_1__2__Impl ;
    public final void rule__DOM__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1321:1: ( rule__DOM__Group_2_1__2__Impl )
            // InternalT2A.g:1322:2: rule__DOM__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOM__Group_2_1__2__Impl();

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
    // InternalT2A.g:1328:1: rule__DOM__Group_2_1__2__Impl : ( '}' ) ;
    public final void rule__DOM__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1332:1: ( ( '}' ) )
            // InternalT2A.g:1333:1: ( '}' )
            {
            // InternalT2A.g:1333:1: ( '}' )
            // InternalT2A.g:1334:2: '}'
            {
             before(grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_1_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_1_2()); 

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


    // $ANTLR start "rule__Comp__Group__0"
    // InternalT2A.g:1344:1: rule__Comp__Group__0 : rule__Comp__Group__0__Impl rule__Comp__Group__1 ;
    public final void rule__Comp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1348:1: ( rule__Comp__Group__0__Impl rule__Comp__Group__1 )
            // InternalT2A.g:1349:2: rule__Comp__Group__0__Impl rule__Comp__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalT2A.g:1356:1: rule__Comp__Group__0__Impl : ( 'Comp' ) ;
    public final void rule__Comp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1360:1: ( ( 'Comp' ) )
            // InternalT2A.g:1361:1: ( 'Comp' )
            {
            // InternalT2A.g:1361:1: ( 'Comp' )
            // InternalT2A.g:1362:2: 'Comp'
            {
             before(grammarAccess.getCompAccess().getCompKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalT2A.g:1371:1: rule__Comp__Group__1 : rule__Comp__Group__1__Impl rule__Comp__Group__2 ;
    public final void rule__Comp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1375:1: ( rule__Comp__Group__1__Impl rule__Comp__Group__2 )
            // InternalT2A.g:1376:2: rule__Comp__Group__1__Impl rule__Comp__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalT2A.g:1383:1: rule__Comp__Group__1__Impl : ( ( rule__Comp__NameAssignment_1 ) ) ;
    public final void rule__Comp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1387:1: ( ( ( rule__Comp__NameAssignment_1 ) ) )
            // InternalT2A.g:1388:1: ( ( rule__Comp__NameAssignment_1 ) )
            {
            // InternalT2A.g:1388:1: ( ( rule__Comp__NameAssignment_1 ) )
            // InternalT2A.g:1389:2: ( rule__Comp__NameAssignment_1 )
            {
             before(grammarAccess.getCompAccess().getNameAssignment_1()); 
            // InternalT2A.g:1390:2: ( rule__Comp__NameAssignment_1 )
            // InternalT2A.g:1390:3: rule__Comp__NameAssignment_1
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
    // InternalT2A.g:1398:1: rule__Comp__Group__2 : rule__Comp__Group__2__Impl ;
    public final void rule__Comp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1402:1: ( rule__Comp__Group__2__Impl )
            // InternalT2A.g:1403:2: rule__Comp__Group__2__Impl
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
    // InternalT2A.g:1409:1: rule__Comp__Group__2__Impl : ( ( rule__Comp__Group_2__0 )? ) ;
    public final void rule__Comp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1413:1: ( ( ( rule__Comp__Group_2__0 )? ) )
            // InternalT2A.g:1414:1: ( ( rule__Comp__Group_2__0 )? )
            {
            // InternalT2A.g:1414:1: ( ( rule__Comp__Group_2__0 )? )
            // InternalT2A.g:1415:2: ( rule__Comp__Group_2__0 )?
            {
             before(grammarAccess.getCompAccess().getGroup_2()); 
            // InternalT2A.g:1416:2: ( rule__Comp__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==12) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalT2A.g:1416:3: rule__Comp__Group_2__0
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
    // InternalT2A.g:1425:1: rule__Comp__Group_2__0 : rule__Comp__Group_2__0__Impl rule__Comp__Group_2__1 ;
    public final void rule__Comp__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1429:1: ( rule__Comp__Group_2__0__Impl rule__Comp__Group_2__1 )
            // InternalT2A.g:1430:2: rule__Comp__Group_2__0__Impl rule__Comp__Group_2__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalT2A.g:1437:1: rule__Comp__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Comp__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1441:1: ( ( '{' ) )
            // InternalT2A.g:1442:1: ( '{' )
            {
            // InternalT2A.g:1442:1: ( '{' )
            // InternalT2A.g:1443:2: '{'
            {
             before(grammarAccess.getCompAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalT2A.g:1452:1: rule__Comp__Group_2__1 : rule__Comp__Group_2__1__Impl rule__Comp__Group_2__2 ;
    public final void rule__Comp__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1456:1: ( rule__Comp__Group_2__1__Impl rule__Comp__Group_2__2 )
            // InternalT2A.g:1457:2: rule__Comp__Group_2__1__Impl rule__Comp__Group_2__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalT2A.g:1464:1: rule__Comp__Group_2__1__Impl : ( ( rule__Comp__Group_2_1__0 )? ) ;
    public final void rule__Comp__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1468:1: ( ( ( rule__Comp__Group_2_1__0 )? ) )
            // InternalT2A.g:1469:1: ( ( rule__Comp__Group_2_1__0 )? )
            {
            // InternalT2A.g:1469:1: ( ( rule__Comp__Group_2_1__0 )? )
            // InternalT2A.g:1470:2: ( rule__Comp__Group_2_1__0 )?
            {
             before(grammarAccess.getCompAccess().getGroup_2_1()); 
            // InternalT2A.g:1471:2: ( rule__Comp__Group_2_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalT2A.g:1471:3: rule__Comp__Group_2_1__0
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
    // InternalT2A.g:1479:1: rule__Comp__Group_2__2 : rule__Comp__Group_2__2__Impl rule__Comp__Group_2__3 ;
    public final void rule__Comp__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1483:1: ( rule__Comp__Group_2__2__Impl rule__Comp__Group_2__3 )
            // InternalT2A.g:1484:2: rule__Comp__Group_2__2__Impl rule__Comp__Group_2__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalT2A.g:1491:1: rule__Comp__Group_2__2__Impl : ( ( rule__Comp__FeaturesAssignment_2_2 )* ) ;
    public final void rule__Comp__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1495:1: ( ( ( rule__Comp__FeaturesAssignment_2_2 )* ) )
            // InternalT2A.g:1496:1: ( ( rule__Comp__FeaturesAssignment_2_2 )* )
            {
            // InternalT2A.g:1496:1: ( ( rule__Comp__FeaturesAssignment_2_2 )* )
            // InternalT2A.g:1497:2: ( rule__Comp__FeaturesAssignment_2_2 )*
            {
             before(grammarAccess.getCompAccess().getFeaturesAssignment_2_2()); 
            // InternalT2A.g:1498:2: ( rule__Comp__FeaturesAssignment_2_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)||LA19_0==22) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalT2A.g:1498:3: rule__Comp__FeaturesAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Comp__FeaturesAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalT2A.g:1506:1: rule__Comp__Group_2__3 : rule__Comp__Group_2__3__Impl ;
    public final void rule__Comp__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1510:1: ( rule__Comp__Group_2__3__Impl )
            // InternalT2A.g:1511:2: rule__Comp__Group_2__3__Impl
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
    // InternalT2A.g:1517:1: rule__Comp__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Comp__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1521:1: ( ( '}' ) )
            // InternalT2A.g:1522:1: ( '}' )
            {
            // InternalT2A.g:1522:1: ( '}' )
            // InternalT2A.g:1523:2: '}'
            {
             before(grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,13,FOLLOW_2); 
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
    // InternalT2A.g:1533:1: rule__Comp__Group_2_1__0 : rule__Comp__Group_2_1__0__Impl rule__Comp__Group_2_1__1 ;
    public final void rule__Comp__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1537:1: ( rule__Comp__Group_2_1__0__Impl rule__Comp__Group_2_1__1 )
            // InternalT2A.g:1538:2: rule__Comp__Group_2_1__0__Impl rule__Comp__Group_2_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalT2A.g:1545:1: rule__Comp__Group_2_1__0__Impl : ( 'SClass:{' ) ;
    public final void rule__Comp__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1549:1: ( ( 'SClass:{' ) )
            // InternalT2A.g:1550:1: ( 'SClass:{' )
            {
            // InternalT2A.g:1550:1: ( 'SClass:{' )
            // InternalT2A.g:1551:2: 'SClass:{'
            {
             before(grammarAccess.getCompAccess().getSClassKeyword_2_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompAccess().getSClassKeyword_2_1_0()); 

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
    // InternalT2A.g:1560:1: rule__Comp__Group_2_1__1 : rule__Comp__Group_2_1__1__Impl rule__Comp__Group_2_1__2 ;
    public final void rule__Comp__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1564:1: ( rule__Comp__Group_2_1__1__Impl rule__Comp__Group_2_1__2 )
            // InternalT2A.g:1565:2: rule__Comp__Group_2_1__1__Impl rule__Comp__Group_2_1__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalT2A.g:1572:1: rule__Comp__Group_2_1__1__Impl : ( ( rule__Comp__SclassesAssignment_2_1_1 )* ) ;
    public final void rule__Comp__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1576:1: ( ( ( rule__Comp__SclassesAssignment_2_1_1 )* ) )
            // InternalT2A.g:1577:1: ( ( rule__Comp__SclassesAssignment_2_1_1 )* )
            {
            // InternalT2A.g:1577:1: ( ( rule__Comp__SclassesAssignment_2_1_1 )* )
            // InternalT2A.g:1578:2: ( rule__Comp__SclassesAssignment_2_1_1 )*
            {
             before(grammarAccess.getCompAccess().getSclassesAssignment_2_1_1()); 
            // InternalT2A.g:1579:2: ( rule__Comp__SclassesAssignment_2_1_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalT2A.g:1579:3: rule__Comp__SclassesAssignment_2_1_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Comp__SclassesAssignment_2_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getCompAccess().getSclassesAssignment_2_1_1()); 

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
    // InternalT2A.g:1587:1: rule__Comp__Group_2_1__2 : rule__Comp__Group_2_1__2__Impl ;
    public final void rule__Comp__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1591:1: ( rule__Comp__Group_2_1__2__Impl )
            // InternalT2A.g:1592:2: rule__Comp__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comp__Group_2_1__2__Impl();

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
    // InternalT2A.g:1598:1: rule__Comp__Group_2_1__2__Impl : ( '}' ) ;
    public final void rule__Comp__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1602:1: ( ( '}' ) )
            // InternalT2A.g:1603:1: ( '}' )
            {
            // InternalT2A.g:1603:1: ( '}' )
            // InternalT2A.g:1604:2: '}'
            {
             before(grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_1_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_1_2()); 

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


    // $ANTLR start "rule__InstanciaEDOM__Group__0"
    // InternalT2A.g:1614:1: rule__InstanciaEDOM__Group__0 : rule__InstanciaEDOM__Group__0__Impl rule__InstanciaEDOM__Group__1 ;
    public final void rule__InstanciaEDOM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1618:1: ( rule__InstanciaEDOM__Group__0__Impl rule__InstanciaEDOM__Group__1 )
            // InternalT2A.g:1619:2: rule__InstanciaEDOM__Group__0__Impl rule__InstanciaEDOM__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalT2A.g:1626:1: rule__InstanciaEDOM__Group__0__Impl : ( ( rule__InstanciaEDOM__InstanciaAssignment_0 ) ) ;
    public final void rule__InstanciaEDOM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1630:1: ( ( ( rule__InstanciaEDOM__InstanciaAssignment_0 ) ) )
            // InternalT2A.g:1631:1: ( ( rule__InstanciaEDOM__InstanciaAssignment_0 ) )
            {
            // InternalT2A.g:1631:1: ( ( rule__InstanciaEDOM__InstanciaAssignment_0 ) )
            // InternalT2A.g:1632:2: ( rule__InstanciaEDOM__InstanciaAssignment_0 )
            {
             before(grammarAccess.getInstanciaEDOMAccess().getInstanciaAssignment_0()); 
            // InternalT2A.g:1633:2: ( rule__InstanciaEDOM__InstanciaAssignment_0 )
            // InternalT2A.g:1633:3: rule__InstanciaEDOM__InstanciaAssignment_0
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
    // InternalT2A.g:1641:1: rule__InstanciaEDOM__Group__1 : rule__InstanciaEDOM__Group__1__Impl ;
    public final void rule__InstanciaEDOM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1645:1: ( rule__InstanciaEDOM__Group__1__Impl )
            // InternalT2A.g:1646:2: rule__InstanciaEDOM__Group__1__Impl
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
    // InternalT2A.g:1652:1: rule__InstanciaEDOM__Group__1__Impl : ( ( rule__InstanciaEDOM__Group_1__0 )? ) ;
    public final void rule__InstanciaEDOM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1656:1: ( ( ( rule__InstanciaEDOM__Group_1__0 )? ) )
            // InternalT2A.g:1657:1: ( ( rule__InstanciaEDOM__Group_1__0 )? )
            {
            // InternalT2A.g:1657:1: ( ( rule__InstanciaEDOM__Group_1__0 )? )
            // InternalT2A.g:1658:2: ( rule__InstanciaEDOM__Group_1__0 )?
            {
             before(grammarAccess.getInstanciaEDOMAccess().getGroup_1()); 
            // InternalT2A.g:1659:2: ( rule__InstanciaEDOM__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==12) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalT2A.g:1659:3: rule__InstanciaEDOM__Group_1__0
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
    // InternalT2A.g:1668:1: rule__InstanciaEDOM__Group_1__0 : rule__InstanciaEDOM__Group_1__0__Impl rule__InstanciaEDOM__Group_1__1 ;
    public final void rule__InstanciaEDOM__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1672:1: ( rule__InstanciaEDOM__Group_1__0__Impl rule__InstanciaEDOM__Group_1__1 )
            // InternalT2A.g:1673:2: rule__InstanciaEDOM__Group_1__0__Impl rule__InstanciaEDOM__Group_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalT2A.g:1680:1: rule__InstanciaEDOM__Group_1__0__Impl : ( '{' ) ;
    public final void rule__InstanciaEDOM__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1684:1: ( ( '{' ) )
            // InternalT2A.g:1685:1: ( '{' )
            {
            // InternalT2A.g:1685:1: ( '{' )
            // InternalT2A.g:1686:2: '{'
            {
             before(grammarAccess.getInstanciaEDOMAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalT2A.g:1695:1: rule__InstanciaEDOM__Group_1__1 : rule__InstanciaEDOM__Group_1__1__Impl rule__InstanciaEDOM__Group_1__2 ;
    public final void rule__InstanciaEDOM__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1699:1: ( rule__InstanciaEDOM__Group_1__1__Impl rule__InstanciaEDOM__Group_1__2 )
            // InternalT2A.g:1700:2: rule__InstanciaEDOM__Group_1__1__Impl rule__InstanciaEDOM__Group_1__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalT2A.g:1707:1: rule__InstanciaEDOM__Group_1__1__Impl : ( ( rule__InstanciaEDOM__InsfeaturesAssignment_1_1 )* ) ;
    public final void rule__InstanciaEDOM__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1711:1: ( ( ( rule__InstanciaEDOM__InsfeaturesAssignment_1_1 )* ) )
            // InternalT2A.g:1712:1: ( ( rule__InstanciaEDOM__InsfeaturesAssignment_1_1 )* )
            {
            // InternalT2A.g:1712:1: ( ( rule__InstanciaEDOM__InsfeaturesAssignment_1_1 )* )
            // InternalT2A.g:1713:2: ( rule__InstanciaEDOM__InsfeaturesAssignment_1_1 )*
            {
             before(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesAssignment_1_1()); 
            // InternalT2A.g:1714:2: ( rule__InstanciaEDOM__InsfeaturesAssignment_1_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_STRING)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalT2A.g:1714:3: rule__InstanciaEDOM__InsfeaturesAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__InstanciaEDOM__InsfeaturesAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesAssignment_1_1()); 

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
    // InternalT2A.g:1722:1: rule__InstanciaEDOM__Group_1__2 : rule__InstanciaEDOM__Group_1__2__Impl ;
    public final void rule__InstanciaEDOM__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1726:1: ( rule__InstanciaEDOM__Group_1__2__Impl )
            // InternalT2A.g:1727:2: rule__InstanciaEDOM__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstanciaEDOM__Group_1__2__Impl();

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
    // InternalT2A.g:1733:1: rule__InstanciaEDOM__Group_1__2__Impl : ( '}' ) ;
    public final void rule__InstanciaEDOM__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1737:1: ( ( '}' ) )
            // InternalT2A.g:1738:1: ( '}' )
            {
            // InternalT2A.g:1738:1: ( '}' )
            // InternalT2A.g:1739:2: '}'
            {
             before(grammarAccess.getInstanciaEDOMAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInstanciaEDOMAccess().getRightCurlyBracketKeyword_1_2()); 

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


    // $ANTLR start "rule__Root__ElementsAssignment"
    // InternalT2A.g:1749:1: rule__Root__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Root__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1753:1: ( ( ruleElement ) )
            // InternalT2A.g:1754:2: ( ruleElement )
            {
            // InternalT2A.g:1754:2: ( ruleElement )
            // InternalT2A.g:1755:3: ruleElement
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
    // InternalT2A.g:1764:1: rule__Page__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Page__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1768:1: ( ( RULE_ID ) )
            // InternalT2A.g:1769:2: ( RULE_ID )
            {
            // InternalT2A.g:1769:2: ( RULE_ID )
            // InternalT2A.g:1770:3: RULE_ID
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


    // $ANTLR start "rule__Page__SclassesAssignment_3_1"
    // InternalT2A.g:1779:1: rule__Page__SclassesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Page__SclassesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1783:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:1784:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:1784:2: ( ( RULE_ID ) )
            // InternalT2A.g:1785:3: ( RULE_ID )
            {
             before(grammarAccess.getPageAccess().getSclassesStyleClassCrossReference_3_1_0()); 
            // InternalT2A.g:1786:3: ( RULE_ID )
            // InternalT2A.g:1787:4: RULE_ID
            {
             before(grammarAccess.getPageAccess().getSclassesStyleClassIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getSclassesStyleClassIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getPageAccess().getSclassesStyleClassCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Page__SclassesAssignment_3_1"


    // $ANTLR start "rule__Page__HomeAssignment_4"
    // InternalT2A.g:1798:1: rule__Page__HomeAssignment_4 : ( ( 'home' ) ) ;
    public final void rule__Page__HomeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1802:1: ( ( ( 'home' ) ) )
            // InternalT2A.g:1803:2: ( ( 'home' ) )
            {
            // InternalT2A.g:1803:2: ( ( 'home' ) )
            // InternalT2A.g:1804:3: ( 'home' )
            {
             before(grammarAccess.getPageAccess().getHomeHomeKeyword_4_0()); 
            // InternalT2A.g:1805:3: ( 'home' )
            // InternalT2A.g:1806:4: 'home'
            {
             before(grammarAccess.getPageAccess().getHomeHomeKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalT2A.g:1817:1: rule__Page__ShowInNavAssignment_5 : ( ( 'showInNav' ) ) ;
    public final void rule__Page__ShowInNavAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1821:1: ( ( ( 'showInNav' ) ) )
            // InternalT2A.g:1822:2: ( ( 'showInNav' ) )
            {
            // InternalT2A.g:1822:2: ( ( 'showInNav' ) )
            // InternalT2A.g:1823:3: ( 'showInNav' )
            {
             before(grammarAccess.getPageAccess().getShowInNavShowInNavKeyword_5_0()); 
            // InternalT2A.g:1824:3: ( 'showInNav' )
            // InternalT2A.g:1825:4: 'showInNav'
            {
             before(grammarAccess.getPageAccess().getShowInNavShowInNavKeyword_5_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalT2A.g:1836:1: rule__Page__PageFeaturesAssignment_6 : ( rulePageFeature ) ;
    public final void rule__Page__PageFeaturesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1840:1: ( ( rulePageFeature ) )
            // InternalT2A.g:1841:2: ( rulePageFeature )
            {
            // InternalT2A.g:1841:2: ( rulePageFeature )
            // InternalT2A.g:1842:3: rulePageFeature
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
    // InternalT2A.g:1851:1: rule__StyleClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StyleClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1855:1: ( ( RULE_ID ) )
            // InternalT2A.g:1856:2: ( RULE_ID )
            {
            // InternalT2A.g:1856:2: ( RULE_ID )
            // InternalT2A.g:1857:3: RULE_ID
            {
             before(grammarAccess.getStyleClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStyleClassAccess().getNameIDTerminalRuleCall_1_0()); 

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


    // $ANTLR start "rule__StyleClass__SattributesAssignment_3"
    // InternalT2A.g:1866:1: rule__StyleClass__SattributesAssignment_3 : ( ruleSAttributeAndValue ) ;
    public final void rule__StyleClass__SattributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1870:1: ( ( ruleSAttributeAndValue ) )
            // InternalT2A.g:1871:2: ( ruleSAttributeAndValue )
            {
            // InternalT2A.g:1871:2: ( ruleSAttributeAndValue )
            // InternalT2A.g:1872:3: ruleSAttributeAndValue
            {
             before(grammarAccess.getStyleClassAccess().getSattributesSAttributeAndValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSAttributeAndValue();

            state._fsp--;

             after(grammarAccess.getStyleClassAccess().getSattributesSAttributeAndValueParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__StyleClass__SattributesAssignment_3"


    // $ANTLR start "rule__SAttributeName__NameAssignment_1"
    // InternalT2A.g:1881:1: rule__SAttributeName__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SAttributeName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1885:1: ( ( RULE_ID ) )
            // InternalT2A.g:1886:2: ( RULE_ID )
            {
            // InternalT2A.g:1886:2: ( RULE_ID )
            // InternalT2A.g:1887:3: RULE_ID
            {
             before(grammarAccess.getSAttributeNameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSAttributeNameAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SAttributeName__NameAssignment_1"


    // $ANTLR start "rule__SAttributeAndValue__StnameAssignment_0"
    // InternalT2A.g:1896:1: rule__SAttributeAndValue__StnameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SAttributeAndValue__StnameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1900:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:1901:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:1901:2: ( ( RULE_ID ) )
            // InternalT2A.g:1902:3: ( RULE_ID )
            {
             before(grammarAccess.getSAttributeAndValueAccess().getStnameSAttributeNameCrossReference_0_0()); 
            // InternalT2A.g:1903:3: ( RULE_ID )
            // InternalT2A.g:1904:4: RULE_ID
            {
             before(grammarAccess.getSAttributeAndValueAccess().getStnameSAttributeNameIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSAttributeAndValueAccess().getStnameSAttributeNameIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSAttributeAndValueAccess().getStnameSAttributeNameCrossReference_0_0()); 

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


    // $ANTLR start "rule__SAttributeAndValue__ValueAssignment_2"
    // InternalT2A.g:1915:1: rule__SAttributeAndValue__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SAttributeAndValue__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1919:1: ( ( RULE_STRING ) )
            // InternalT2A.g:1920:2: ( RULE_STRING )
            {
            // InternalT2A.g:1920:2: ( RULE_STRING )
            // InternalT2A.g:1921:3: RULE_STRING
            {
             before(grammarAccess.getSAttributeAndValueAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSAttributeAndValueAccess().getValueSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__SAttributeAndValue__ValueAssignment_2"


    // $ANTLR start "rule__DOM__NameAssignment_1"
    // InternalT2A.g:1930:1: rule__DOM__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DOM__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1934:1: ( ( RULE_ID ) )
            // InternalT2A.g:1935:2: ( RULE_ID )
            {
            // InternalT2A.g:1935:2: ( RULE_ID )
            // InternalT2A.g:1936:3: RULE_ID
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


    // $ANTLR start "rule__DOM__SclassesAssignment_2_1_1"
    // InternalT2A.g:1945:1: rule__DOM__SclassesAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__DOM__SclassesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1949:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:1950:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:1950:2: ( ( RULE_ID ) )
            // InternalT2A.g:1951:3: ( RULE_ID )
            {
             before(grammarAccess.getDOMAccess().getSclassesStyleClassCrossReference_2_1_1_0()); 
            // InternalT2A.g:1952:3: ( RULE_ID )
            // InternalT2A.g:1953:4: RULE_ID
            {
             before(grammarAccess.getDOMAccess().getSclassesStyleClassIDTerminalRuleCall_2_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDOMAccess().getSclassesStyleClassIDTerminalRuleCall_2_1_1_0_1()); 

            }

             after(grammarAccess.getDOMAccess().getSclassesStyleClassCrossReference_2_1_1_0()); 

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
    // $ANTLR end "rule__DOM__SclassesAssignment_2_1_1"


    // $ANTLR start "rule__DOM__FeaturesAssignment_2_2"
    // InternalT2A.g:1964:1: rule__DOM__FeaturesAssignment_2_2 : ( ruleFeature ) ;
    public final void rule__DOM__FeaturesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1968:1: ( ( ruleFeature ) )
            // InternalT2A.g:1969:2: ( ruleFeature )
            {
            // InternalT2A.g:1969:2: ( ruleFeature )
            // InternalT2A.g:1970:3: ruleFeature
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
    // InternalT2A.g:1979:1: rule__Comp__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Comp__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1983:1: ( ( RULE_ID ) )
            // InternalT2A.g:1984:2: ( RULE_ID )
            {
            // InternalT2A.g:1984:2: ( RULE_ID )
            // InternalT2A.g:1985:3: RULE_ID
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


    // $ANTLR start "rule__Comp__SclassesAssignment_2_1_1"
    // InternalT2A.g:1994:1: rule__Comp__SclassesAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Comp__SclassesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1998:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:1999:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:1999:2: ( ( RULE_ID ) )
            // InternalT2A.g:2000:3: ( RULE_ID )
            {
             before(grammarAccess.getCompAccess().getSclassesStyleClassCrossReference_2_1_1_0()); 
            // InternalT2A.g:2001:3: ( RULE_ID )
            // InternalT2A.g:2002:4: RULE_ID
            {
             before(grammarAccess.getCompAccess().getSclassesStyleClassIDTerminalRuleCall_2_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompAccess().getSclassesStyleClassIDTerminalRuleCall_2_1_1_0_1()); 

            }

             after(grammarAccess.getCompAccess().getSclassesStyleClassCrossReference_2_1_1_0()); 

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
    // $ANTLR end "rule__Comp__SclassesAssignment_2_1_1"


    // $ANTLR start "rule__Comp__FeaturesAssignment_2_2"
    // InternalT2A.g:2013:1: rule__Comp__FeaturesAssignment_2_2 : ( ruleFeature ) ;
    public final void rule__Comp__FeaturesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2017:1: ( ( ruleFeature ) )
            // InternalT2A.g:2018:2: ( ruleFeature )
            {
            // InternalT2A.g:2018:2: ( ruleFeature )
            // InternalT2A.g:2019:3: ruleFeature
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
    // InternalT2A.g:2028:1: rule__InstanciaEDOM__InstanciaAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__InstanciaEDOM__InstanciaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2032:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:2033:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:2033:2: ( ( RULE_ID ) )
            // InternalT2A.g:2034:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanciaEDOMAccess().getInstanciaEDOMCrossReference_0_0()); 
            // InternalT2A.g:2035:3: ( RULE_ID )
            // InternalT2A.g:2036:4: RULE_ID
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


    // $ANTLR start "rule__InstanciaEDOM__InsfeaturesAssignment_1_1"
    // InternalT2A.g:2047:1: rule__InstanciaEDOM__InsfeaturesAssignment_1_1 : ( ruleInstanceEDOMFeature ) ;
    public final void rule__InstanciaEDOM__InsfeaturesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2051:1: ( ( ruleInstanceEDOMFeature ) )
            // InternalT2A.g:2052:2: ( ruleInstanceEDOMFeature )
            {
            // InternalT2A.g:2052:2: ( ruleInstanceEDOMFeature )
            // InternalT2A.g:2053:3: ruleInstanceEDOMFeature
            {
             before(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesInstanceEDOMFeatureParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInstanceEDOMFeature();

            state._fsp--;

             after(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesInstanceEDOMFeatureParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__InstanciaEDOM__InsfeaturesAssignment_1_1"


    // $ANTLR start "rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0"
    // InternalT2A.g:2062:1: rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 : ( ruleInstanciaEDOM ) ;
    public final void rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2066:1: ( ( ruleInstanciaEDOM ) )
            // InternalT2A.g:2067:2: ( ruleInstanciaEDOM )
            {
            // InternalT2A.g:2067:2: ( ruleInstanciaEDOM )
            // InternalT2A.g:2068:3: ruleInstanciaEDOM
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
    // InternalT2A.g:2077:1: rule__InstanceEDOMFeature__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__InstanceEDOMFeature__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2081:1: ( ( RULE_STRING ) )
            // InternalT2A.g:2082:2: ( RULE_STRING )
            {
            // InternalT2A.g:2082:2: ( RULE_STRING )
            // InternalT2A.g:2083:3: RULE_STRING
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
    // InternalT2A.g:2092:1: rule__PageFeature__InstanciaEDOMAssignment_0 : ( ruleInstanciaEDOM ) ;
    public final void rule__PageFeature__InstanciaEDOMAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2096:1: ( ( ruleInstanciaEDOM ) )
            // InternalT2A.g:2097:2: ( ruleInstanciaEDOM )
            {
            // InternalT2A.g:2097:2: ( ruleInstanciaEDOM )
            // InternalT2A.g:2098:3: ruleInstanciaEDOM
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
    // InternalT2A.g:2107:1: rule__PageFeature__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__PageFeature__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2111:1: ( ( RULE_STRING ) )
            // InternalT2A.g:2112:2: ( RULE_STRING )
            {
            // InternalT2A.g:2112:2: ( RULE_STRING )
            // InternalT2A.g:2113:3: RULE_STRING
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
    // InternalT2A.g:2122:1: rule__Feature__InstanciaEDOMAssignment_0 : ( ruleInstanciaEDOM ) ;
    public final void rule__Feature__InstanciaEDOMAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2126:1: ( ( ruleInstanciaEDOM ) )
            // InternalT2A.g:2127:2: ( ruleInstanciaEDOM )
            {
            // InternalT2A.g:2127:2: ( ruleInstanciaEDOM )
            // InternalT2A.g:2128:3: ruleInstanciaEDOM
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
    // InternalT2A.g:2137:1: rule__Feature__AllowSlotAssignment_1 : ( ( 'AllowSlot' ) ) ;
    public final void rule__Feature__AllowSlotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2141:1: ( ( ( 'AllowSlot' ) ) )
            // InternalT2A.g:2142:2: ( ( 'AllowSlot' ) )
            {
            // InternalT2A.g:2142:2: ( ( 'AllowSlot' ) )
            // InternalT2A.g:2143:3: ( 'AllowSlot' )
            {
             before(grammarAccess.getFeatureAccess().getAllowSlotAllowSlotKeyword_1_0()); 
            // InternalT2A.g:2144:3: ( 'AllowSlot' )
            // InternalT2A.g:2145:4: 'AllowSlot'
            {
             before(grammarAccess.getFeatureAccess().getAllowSlotAllowSlotKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalT2A.g:2156:1: rule__Feature__StringAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Feature__StringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2160:1: ( ( RULE_STRING ) )
            // InternalT2A.g:2161:2: ( RULE_STRING )
            {
            // InternalT2A.g:2161:2: ( RULE_STRING )
            // InternalT2A.g:2162:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000D8802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000306030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000406030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400032L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002030L});

}