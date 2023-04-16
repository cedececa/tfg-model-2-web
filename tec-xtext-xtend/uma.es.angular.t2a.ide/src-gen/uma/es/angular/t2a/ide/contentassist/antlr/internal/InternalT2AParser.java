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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Page'", "'{'", "'}'", "'Dom'", "'Comp'", "'home'", "'AllowSlot'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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

                if ( (LA1_0==11||(LA1_0>=14 && LA1_0<=15)) ) {
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


    // $ANTLR start "entryRuleDOM"
    // InternalT2A.g:160:1: entryRuleDOM : ruleDOM EOF ;
    public final void entryRuleDOM() throws RecognitionException {
        try {
            // InternalT2A.g:161:1: ( ruleDOM EOF )
            // InternalT2A.g:162:1: ruleDOM EOF
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
    // InternalT2A.g:169:1: ruleDOM : ( ( rule__DOM__Group__0 ) ) ;
    public final void ruleDOM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:173:2: ( ( ( rule__DOM__Group__0 ) ) )
            // InternalT2A.g:174:2: ( ( rule__DOM__Group__0 ) )
            {
            // InternalT2A.g:174:2: ( ( rule__DOM__Group__0 ) )
            // InternalT2A.g:175:3: ( rule__DOM__Group__0 )
            {
             before(grammarAccess.getDOMAccess().getGroup()); 
            // InternalT2A.g:176:3: ( rule__DOM__Group__0 )
            // InternalT2A.g:176:4: rule__DOM__Group__0
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
    // InternalT2A.g:185:1: entryRuleComp : ruleComp EOF ;
    public final void entryRuleComp() throws RecognitionException {
        try {
            // InternalT2A.g:186:1: ( ruleComp EOF )
            // InternalT2A.g:187:1: ruleComp EOF
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
    // InternalT2A.g:194:1: ruleComp : ( ( rule__Comp__Group__0 ) ) ;
    public final void ruleComp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:198:2: ( ( ( rule__Comp__Group__0 ) ) )
            // InternalT2A.g:199:2: ( ( rule__Comp__Group__0 ) )
            {
            // InternalT2A.g:199:2: ( ( rule__Comp__Group__0 ) )
            // InternalT2A.g:200:3: ( rule__Comp__Group__0 )
            {
             before(grammarAccess.getCompAccess().getGroup()); 
            // InternalT2A.g:201:3: ( rule__Comp__Group__0 )
            // InternalT2A.g:201:4: rule__Comp__Group__0
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
    // InternalT2A.g:210:1: entryRuleInstanciaEDOM : ruleInstanciaEDOM EOF ;
    public final void entryRuleInstanciaEDOM() throws RecognitionException {
        try {
            // InternalT2A.g:211:1: ( ruleInstanciaEDOM EOF )
            // InternalT2A.g:212:1: ruleInstanciaEDOM EOF
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
    // InternalT2A.g:219:1: ruleInstanciaEDOM : ( ( rule__InstanciaEDOM__Group__0 ) ) ;
    public final void ruleInstanciaEDOM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:223:2: ( ( ( rule__InstanciaEDOM__Group__0 ) ) )
            // InternalT2A.g:224:2: ( ( rule__InstanciaEDOM__Group__0 ) )
            {
            // InternalT2A.g:224:2: ( ( rule__InstanciaEDOM__Group__0 ) )
            // InternalT2A.g:225:3: ( rule__InstanciaEDOM__Group__0 )
            {
             before(grammarAccess.getInstanciaEDOMAccess().getGroup()); 
            // InternalT2A.g:226:3: ( rule__InstanciaEDOM__Group__0 )
            // InternalT2A.g:226:4: rule__InstanciaEDOM__Group__0
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
    // InternalT2A.g:235:1: entryRuleInstanceEDOMFeature : ruleInstanceEDOMFeature EOF ;
    public final void entryRuleInstanceEDOMFeature() throws RecognitionException {
        try {
            // InternalT2A.g:236:1: ( ruleInstanceEDOMFeature EOF )
            // InternalT2A.g:237:1: ruleInstanceEDOMFeature EOF
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
    // InternalT2A.g:244:1: ruleInstanceEDOMFeature : ( ( rule__InstanceEDOMFeature__Alternatives ) ) ;
    public final void ruleInstanceEDOMFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:248:2: ( ( ( rule__InstanceEDOMFeature__Alternatives ) ) )
            // InternalT2A.g:249:2: ( ( rule__InstanceEDOMFeature__Alternatives ) )
            {
            // InternalT2A.g:249:2: ( ( rule__InstanceEDOMFeature__Alternatives ) )
            // InternalT2A.g:250:3: ( rule__InstanceEDOMFeature__Alternatives )
            {
             before(grammarAccess.getInstanceEDOMFeatureAccess().getAlternatives()); 
            // InternalT2A.g:251:3: ( rule__InstanceEDOMFeature__Alternatives )
            // InternalT2A.g:251:4: rule__InstanceEDOMFeature__Alternatives
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
    // InternalT2A.g:260:1: entryRulePageFeature : rulePageFeature EOF ;
    public final void entryRulePageFeature() throws RecognitionException {
        try {
            // InternalT2A.g:261:1: ( rulePageFeature EOF )
            // InternalT2A.g:262:1: rulePageFeature EOF
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
    // InternalT2A.g:269:1: rulePageFeature : ( ( rule__PageFeature__Alternatives ) ) ;
    public final void rulePageFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:273:2: ( ( ( rule__PageFeature__Alternatives ) ) )
            // InternalT2A.g:274:2: ( ( rule__PageFeature__Alternatives ) )
            {
            // InternalT2A.g:274:2: ( ( rule__PageFeature__Alternatives ) )
            // InternalT2A.g:275:3: ( rule__PageFeature__Alternatives )
            {
             before(grammarAccess.getPageFeatureAccess().getAlternatives()); 
            // InternalT2A.g:276:3: ( rule__PageFeature__Alternatives )
            // InternalT2A.g:276:4: rule__PageFeature__Alternatives
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
    // InternalT2A.g:285:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalT2A.g:286:1: ( ruleFeature EOF )
            // InternalT2A.g:287:1: ruleFeature EOF
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
    // InternalT2A.g:294:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:298:2: ( ( ( rule__Feature__Alternatives ) ) )
            // InternalT2A.g:299:2: ( ( rule__Feature__Alternatives ) )
            {
            // InternalT2A.g:299:2: ( ( rule__Feature__Alternatives ) )
            // InternalT2A.g:300:3: ( rule__Feature__Alternatives )
            {
             before(grammarAccess.getFeatureAccess().getAlternatives()); 
            // InternalT2A.g:301:3: ( rule__Feature__Alternatives )
            // InternalT2A.g:301:4: rule__Feature__Alternatives
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
    // InternalT2A.g:309:1: rule__Element__Alternatives : ( ( rulePage ) | ( ruleEDOM ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:313:1: ( ( rulePage ) | ( ruleEDOM ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=14 && LA2_0<=15)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalT2A.g:314:2: ( rulePage )
                    {
                    // InternalT2A.g:314:2: ( rulePage )
                    // InternalT2A.g:315:3: rulePage
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
                    // InternalT2A.g:320:2: ( ruleEDOM )
                    {
                    // InternalT2A.g:320:2: ( ruleEDOM )
                    // InternalT2A.g:321:3: ruleEDOM
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
    // InternalT2A.g:330:1: rule__EDOM__Alternatives : ( ( ruleDOM ) | ( ruleComp ) );
    public final void rule__EDOM__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:334:1: ( ( ruleDOM ) | ( ruleComp ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalT2A.g:335:2: ( ruleDOM )
                    {
                    // InternalT2A.g:335:2: ( ruleDOM )
                    // InternalT2A.g:336:3: ruleDOM
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
                    // InternalT2A.g:341:2: ( ruleComp )
                    {
                    // InternalT2A.g:341:2: ( ruleComp )
                    // InternalT2A.g:342:3: ruleComp
                    {
                     before(grammarAccess.getEDOMAccess().getCompParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComp();

                    state._fsp--;

                     after(grammarAccess.getEDOMAccess().getCompParserRuleCall_1()); 

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
    // InternalT2A.g:351:1: rule__InstanceEDOMFeature__Alternatives : ( ( ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__InstanceEDOMFeature__StringAssignment_1 ) ) );
    public final void rule__InstanceEDOMFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:355:1: ( ( ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__InstanceEDOMFeature__StringAssignment_1 ) ) )
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
                    // InternalT2A.g:356:2: ( ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 ) )
                    {
                    // InternalT2A.g:356:2: ( ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 ) )
                    // InternalT2A.g:357:3: ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 )
                    {
                     before(grammarAccess.getInstanceEDOMFeatureAccess().getInstanciaEDOMAssignment_0()); 
                    // InternalT2A.g:358:3: ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 )
                    // InternalT2A.g:358:4: rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0
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
                    // InternalT2A.g:362:2: ( ( rule__InstanceEDOMFeature__StringAssignment_1 ) )
                    {
                    // InternalT2A.g:362:2: ( ( rule__InstanceEDOMFeature__StringAssignment_1 ) )
                    // InternalT2A.g:363:3: ( rule__InstanceEDOMFeature__StringAssignment_1 )
                    {
                     before(grammarAccess.getInstanceEDOMFeatureAccess().getStringAssignment_1()); 
                    // InternalT2A.g:364:3: ( rule__InstanceEDOMFeature__StringAssignment_1 )
                    // InternalT2A.g:364:4: rule__InstanceEDOMFeature__StringAssignment_1
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
    // InternalT2A.g:372:1: rule__PageFeature__Alternatives : ( ( ( rule__PageFeature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__PageFeature__StringAssignment_1 ) ) );
    public final void rule__PageFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:376:1: ( ( ( rule__PageFeature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__PageFeature__StringAssignment_1 ) ) )
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
                    // InternalT2A.g:377:2: ( ( rule__PageFeature__InstanciaEDOMAssignment_0 ) )
                    {
                    // InternalT2A.g:377:2: ( ( rule__PageFeature__InstanciaEDOMAssignment_0 ) )
                    // InternalT2A.g:378:3: ( rule__PageFeature__InstanciaEDOMAssignment_0 )
                    {
                     before(grammarAccess.getPageFeatureAccess().getInstanciaEDOMAssignment_0()); 
                    // InternalT2A.g:379:3: ( rule__PageFeature__InstanciaEDOMAssignment_0 )
                    // InternalT2A.g:379:4: rule__PageFeature__InstanciaEDOMAssignment_0
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
                    // InternalT2A.g:383:2: ( ( rule__PageFeature__StringAssignment_1 ) )
                    {
                    // InternalT2A.g:383:2: ( ( rule__PageFeature__StringAssignment_1 ) )
                    // InternalT2A.g:384:3: ( rule__PageFeature__StringAssignment_1 )
                    {
                     before(grammarAccess.getPageFeatureAccess().getStringAssignment_1()); 
                    // InternalT2A.g:385:3: ( rule__PageFeature__StringAssignment_1 )
                    // InternalT2A.g:385:4: rule__PageFeature__StringAssignment_1
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
    // InternalT2A.g:393:1: rule__Feature__Alternatives : ( ( ( rule__Feature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__Feature__AllowSlotAssignment_1 ) ) | ( ( rule__Feature__StringAssignment_2 ) ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:397:1: ( ( ( rule__Feature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__Feature__AllowSlotAssignment_1 ) ) | ( ( rule__Feature__StringAssignment_2 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 17:
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
                    // InternalT2A.g:398:2: ( ( rule__Feature__InstanciaEDOMAssignment_0 ) )
                    {
                    // InternalT2A.g:398:2: ( ( rule__Feature__InstanciaEDOMAssignment_0 ) )
                    // InternalT2A.g:399:3: ( rule__Feature__InstanciaEDOMAssignment_0 )
                    {
                     before(grammarAccess.getFeatureAccess().getInstanciaEDOMAssignment_0()); 
                    // InternalT2A.g:400:3: ( rule__Feature__InstanciaEDOMAssignment_0 )
                    // InternalT2A.g:400:4: rule__Feature__InstanciaEDOMAssignment_0
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
                    // InternalT2A.g:404:2: ( ( rule__Feature__AllowSlotAssignment_1 ) )
                    {
                    // InternalT2A.g:404:2: ( ( rule__Feature__AllowSlotAssignment_1 ) )
                    // InternalT2A.g:405:3: ( rule__Feature__AllowSlotAssignment_1 )
                    {
                     before(grammarAccess.getFeatureAccess().getAllowSlotAssignment_1()); 
                    // InternalT2A.g:406:3: ( rule__Feature__AllowSlotAssignment_1 )
                    // InternalT2A.g:406:4: rule__Feature__AllowSlotAssignment_1
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
                    // InternalT2A.g:410:2: ( ( rule__Feature__StringAssignment_2 ) )
                    {
                    // InternalT2A.g:410:2: ( ( rule__Feature__StringAssignment_2 ) )
                    // InternalT2A.g:411:3: ( rule__Feature__StringAssignment_2 )
                    {
                     before(grammarAccess.getFeatureAccess().getStringAssignment_2()); 
                    // InternalT2A.g:412:3: ( rule__Feature__StringAssignment_2 )
                    // InternalT2A.g:412:4: rule__Feature__StringAssignment_2
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
    // InternalT2A.g:420:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:424:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // InternalT2A.g:425:2: rule__Page__Group__0__Impl rule__Page__Group__1
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
    // InternalT2A.g:432:1: rule__Page__Group__0__Impl : ( 'Page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:436:1: ( ( 'Page' ) )
            // InternalT2A.g:437:1: ( 'Page' )
            {
            // InternalT2A.g:437:1: ( 'Page' )
            // InternalT2A.g:438:2: 'Page'
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
    // InternalT2A.g:447:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:451:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // InternalT2A.g:452:2: rule__Page__Group__1__Impl rule__Page__Group__2
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
    // InternalT2A.g:459:1: rule__Page__Group__1__Impl : ( ( rule__Page__NameAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:463:1: ( ( ( rule__Page__NameAssignment_1 ) ) )
            // InternalT2A.g:464:1: ( ( rule__Page__NameAssignment_1 ) )
            {
            // InternalT2A.g:464:1: ( ( rule__Page__NameAssignment_1 ) )
            // InternalT2A.g:465:2: ( rule__Page__NameAssignment_1 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_1()); 
            // InternalT2A.g:466:2: ( rule__Page__NameAssignment_1 )
            // InternalT2A.g:466:3: rule__Page__NameAssignment_1
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
    // InternalT2A.g:474:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:478:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // InternalT2A.g:479:2: rule__Page__Group__2__Impl rule__Page__Group__3
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
    // InternalT2A.g:486:1: rule__Page__Group__2__Impl : ( '{' ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:490:1: ( ( '{' ) )
            // InternalT2A.g:491:1: ( '{' )
            {
            // InternalT2A.g:491:1: ( '{' )
            // InternalT2A.g:492:2: '{'
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
    // InternalT2A.g:501:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:505:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // InternalT2A.g:506:2: rule__Page__Group__3__Impl rule__Page__Group__4
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
    // InternalT2A.g:513:1: rule__Page__Group__3__Impl : ( ( rule__Page__HomeAssignment_3 )? ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:517:1: ( ( ( rule__Page__HomeAssignment_3 )? ) )
            // InternalT2A.g:518:1: ( ( rule__Page__HomeAssignment_3 )? )
            {
            // InternalT2A.g:518:1: ( ( rule__Page__HomeAssignment_3 )? )
            // InternalT2A.g:519:2: ( rule__Page__HomeAssignment_3 )?
            {
             before(grammarAccess.getPageAccess().getHomeAssignment_3()); 
            // InternalT2A.g:520:2: ( rule__Page__HomeAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalT2A.g:520:3: rule__Page__HomeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__HomeAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPageAccess().getHomeAssignment_3()); 

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
    // InternalT2A.g:528:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:532:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // InternalT2A.g:533:2: rule__Page__Group__4__Impl rule__Page__Group__5
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
    // InternalT2A.g:540:1: rule__Page__Group__4__Impl : ( ( rule__Page__PageFeaturesAssignment_4 )* ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:544:1: ( ( ( rule__Page__PageFeaturesAssignment_4 )* ) )
            // InternalT2A.g:545:1: ( ( rule__Page__PageFeaturesAssignment_4 )* )
            {
            // InternalT2A.g:545:1: ( ( rule__Page__PageFeaturesAssignment_4 )* )
            // InternalT2A.g:546:2: ( rule__Page__PageFeaturesAssignment_4 )*
            {
             before(grammarAccess.getPageAccess().getPageFeaturesAssignment_4()); 
            // InternalT2A.g:547:2: ( rule__Page__PageFeaturesAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_STRING)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalT2A.g:547:3: rule__Page__PageFeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Page__PageFeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPageAccess().getPageFeaturesAssignment_4()); 

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
    // InternalT2A.g:555:1: rule__Page__Group__5 : rule__Page__Group__5__Impl ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:559:1: ( rule__Page__Group__5__Impl )
            // InternalT2A.g:560:2: rule__Page__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group__5__Impl();

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
    // InternalT2A.g:566:1: rule__Page__Group__5__Impl : ( '}' ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:570:1: ( ( '}' ) )
            // InternalT2A.g:571:1: ( '}' )
            {
            // InternalT2A.g:571:1: ( '}' )
            // InternalT2A.g:572:2: '}'
            {
             before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__DOM__Group__0"
    // InternalT2A.g:582:1: rule__DOM__Group__0 : rule__DOM__Group__0__Impl rule__DOM__Group__1 ;
    public final void rule__DOM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:586:1: ( rule__DOM__Group__0__Impl rule__DOM__Group__1 )
            // InternalT2A.g:587:2: rule__DOM__Group__0__Impl rule__DOM__Group__1
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
    // InternalT2A.g:594:1: rule__DOM__Group__0__Impl : ( 'Dom' ) ;
    public final void rule__DOM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:598:1: ( ( 'Dom' ) )
            // InternalT2A.g:599:1: ( 'Dom' )
            {
            // InternalT2A.g:599:1: ( 'Dom' )
            // InternalT2A.g:600:2: 'Dom'
            {
             before(grammarAccess.getDOMAccess().getDomKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalT2A.g:609:1: rule__DOM__Group__1 : rule__DOM__Group__1__Impl rule__DOM__Group__2 ;
    public final void rule__DOM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:613:1: ( rule__DOM__Group__1__Impl rule__DOM__Group__2 )
            // InternalT2A.g:614:2: rule__DOM__Group__1__Impl rule__DOM__Group__2
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
    // InternalT2A.g:621:1: rule__DOM__Group__1__Impl : ( ( rule__DOM__NameAssignment_1 ) ) ;
    public final void rule__DOM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:625:1: ( ( ( rule__DOM__NameAssignment_1 ) ) )
            // InternalT2A.g:626:1: ( ( rule__DOM__NameAssignment_1 ) )
            {
            // InternalT2A.g:626:1: ( ( rule__DOM__NameAssignment_1 ) )
            // InternalT2A.g:627:2: ( rule__DOM__NameAssignment_1 )
            {
             before(grammarAccess.getDOMAccess().getNameAssignment_1()); 
            // InternalT2A.g:628:2: ( rule__DOM__NameAssignment_1 )
            // InternalT2A.g:628:3: rule__DOM__NameAssignment_1
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
    // InternalT2A.g:636:1: rule__DOM__Group__2 : rule__DOM__Group__2__Impl ;
    public final void rule__DOM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:640:1: ( rule__DOM__Group__2__Impl )
            // InternalT2A.g:641:2: rule__DOM__Group__2__Impl
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
    // InternalT2A.g:647:1: rule__DOM__Group__2__Impl : ( ( rule__DOM__Group_2__0 )? ) ;
    public final void rule__DOM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:651:1: ( ( ( rule__DOM__Group_2__0 )? ) )
            // InternalT2A.g:652:1: ( ( rule__DOM__Group_2__0 )? )
            {
            // InternalT2A.g:652:1: ( ( rule__DOM__Group_2__0 )? )
            // InternalT2A.g:653:2: ( rule__DOM__Group_2__0 )?
            {
             before(grammarAccess.getDOMAccess().getGroup_2()); 
            // InternalT2A.g:654:2: ( rule__DOM__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalT2A.g:654:3: rule__DOM__Group_2__0
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
    // InternalT2A.g:663:1: rule__DOM__Group_2__0 : rule__DOM__Group_2__0__Impl rule__DOM__Group_2__1 ;
    public final void rule__DOM__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:667:1: ( rule__DOM__Group_2__0__Impl rule__DOM__Group_2__1 )
            // InternalT2A.g:668:2: rule__DOM__Group_2__0__Impl rule__DOM__Group_2__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalT2A.g:675:1: rule__DOM__Group_2__0__Impl : ( '{' ) ;
    public final void rule__DOM__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:679:1: ( ( '{' ) )
            // InternalT2A.g:680:1: ( '{' )
            {
            // InternalT2A.g:680:1: ( '{' )
            // InternalT2A.g:681:2: '{'
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
    // InternalT2A.g:690:1: rule__DOM__Group_2__1 : rule__DOM__Group_2__1__Impl rule__DOM__Group_2__2 ;
    public final void rule__DOM__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:694:1: ( rule__DOM__Group_2__1__Impl rule__DOM__Group_2__2 )
            // InternalT2A.g:695:2: rule__DOM__Group_2__1__Impl rule__DOM__Group_2__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalT2A.g:702:1: rule__DOM__Group_2__1__Impl : ( ( rule__DOM__FeaturesAssignment_2_1 )* ) ;
    public final void rule__DOM__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:706:1: ( ( ( rule__DOM__FeaturesAssignment_2_1 )* ) )
            // InternalT2A.g:707:1: ( ( rule__DOM__FeaturesAssignment_2_1 )* )
            {
            // InternalT2A.g:707:1: ( ( rule__DOM__FeaturesAssignment_2_1 )* )
            // InternalT2A.g:708:2: ( rule__DOM__FeaturesAssignment_2_1 )*
            {
             before(grammarAccess.getDOMAccess().getFeaturesAssignment_2_1()); 
            // InternalT2A.g:709:2: ( rule__DOM__FeaturesAssignment_2_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)||LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalT2A.g:709:3: rule__DOM__FeaturesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DOM__FeaturesAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDOMAccess().getFeaturesAssignment_2_1()); 

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
    // InternalT2A.g:717:1: rule__DOM__Group_2__2 : rule__DOM__Group_2__2__Impl ;
    public final void rule__DOM__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:721:1: ( rule__DOM__Group_2__2__Impl )
            // InternalT2A.g:722:2: rule__DOM__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOM__Group_2__2__Impl();

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
    // InternalT2A.g:728:1: rule__DOM__Group_2__2__Impl : ( '}' ) ;
    public final void rule__DOM__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:732:1: ( ( '}' ) )
            // InternalT2A.g:733:1: ( '}' )
            {
            // InternalT2A.g:733:1: ( '}' )
            // InternalT2A.g:734:2: '}'
            {
             before(grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_2()); 

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


    // $ANTLR start "rule__Comp__Group__0"
    // InternalT2A.g:744:1: rule__Comp__Group__0 : rule__Comp__Group__0__Impl rule__Comp__Group__1 ;
    public final void rule__Comp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:748:1: ( rule__Comp__Group__0__Impl rule__Comp__Group__1 )
            // InternalT2A.g:749:2: rule__Comp__Group__0__Impl rule__Comp__Group__1
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
    // InternalT2A.g:756:1: rule__Comp__Group__0__Impl : ( 'Comp' ) ;
    public final void rule__Comp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:760:1: ( ( 'Comp' ) )
            // InternalT2A.g:761:1: ( 'Comp' )
            {
            // InternalT2A.g:761:1: ( 'Comp' )
            // InternalT2A.g:762:2: 'Comp'
            {
             before(grammarAccess.getCompAccess().getCompKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalT2A.g:771:1: rule__Comp__Group__1 : rule__Comp__Group__1__Impl rule__Comp__Group__2 ;
    public final void rule__Comp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:775:1: ( rule__Comp__Group__1__Impl rule__Comp__Group__2 )
            // InternalT2A.g:776:2: rule__Comp__Group__1__Impl rule__Comp__Group__2
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
    // InternalT2A.g:783:1: rule__Comp__Group__1__Impl : ( ( rule__Comp__NameAssignment_1 ) ) ;
    public final void rule__Comp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:787:1: ( ( ( rule__Comp__NameAssignment_1 ) ) )
            // InternalT2A.g:788:1: ( ( rule__Comp__NameAssignment_1 ) )
            {
            // InternalT2A.g:788:1: ( ( rule__Comp__NameAssignment_1 ) )
            // InternalT2A.g:789:2: ( rule__Comp__NameAssignment_1 )
            {
             before(grammarAccess.getCompAccess().getNameAssignment_1()); 
            // InternalT2A.g:790:2: ( rule__Comp__NameAssignment_1 )
            // InternalT2A.g:790:3: rule__Comp__NameAssignment_1
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
    // InternalT2A.g:798:1: rule__Comp__Group__2 : rule__Comp__Group__2__Impl ;
    public final void rule__Comp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:802:1: ( rule__Comp__Group__2__Impl )
            // InternalT2A.g:803:2: rule__Comp__Group__2__Impl
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
    // InternalT2A.g:809:1: rule__Comp__Group__2__Impl : ( ( rule__Comp__Group_2__0 )? ) ;
    public final void rule__Comp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:813:1: ( ( ( rule__Comp__Group_2__0 )? ) )
            // InternalT2A.g:814:1: ( ( rule__Comp__Group_2__0 )? )
            {
            // InternalT2A.g:814:1: ( ( rule__Comp__Group_2__0 )? )
            // InternalT2A.g:815:2: ( rule__Comp__Group_2__0 )?
            {
             before(grammarAccess.getCompAccess().getGroup_2()); 
            // InternalT2A.g:816:2: ( rule__Comp__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalT2A.g:816:3: rule__Comp__Group_2__0
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
    // InternalT2A.g:825:1: rule__Comp__Group_2__0 : rule__Comp__Group_2__0__Impl rule__Comp__Group_2__1 ;
    public final void rule__Comp__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:829:1: ( rule__Comp__Group_2__0__Impl rule__Comp__Group_2__1 )
            // InternalT2A.g:830:2: rule__Comp__Group_2__0__Impl rule__Comp__Group_2__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalT2A.g:837:1: rule__Comp__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Comp__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:841:1: ( ( '{' ) )
            // InternalT2A.g:842:1: ( '{' )
            {
            // InternalT2A.g:842:1: ( '{' )
            // InternalT2A.g:843:2: '{'
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
    // InternalT2A.g:852:1: rule__Comp__Group_2__1 : rule__Comp__Group_2__1__Impl rule__Comp__Group_2__2 ;
    public final void rule__Comp__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:856:1: ( rule__Comp__Group_2__1__Impl rule__Comp__Group_2__2 )
            // InternalT2A.g:857:2: rule__Comp__Group_2__1__Impl rule__Comp__Group_2__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalT2A.g:864:1: rule__Comp__Group_2__1__Impl : ( ( rule__Comp__FeaturesAssignment_2_1 )* ) ;
    public final void rule__Comp__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:868:1: ( ( ( rule__Comp__FeaturesAssignment_2_1 )* ) )
            // InternalT2A.g:869:1: ( ( rule__Comp__FeaturesAssignment_2_1 )* )
            {
            // InternalT2A.g:869:1: ( ( rule__Comp__FeaturesAssignment_2_1 )* )
            // InternalT2A.g:870:2: ( rule__Comp__FeaturesAssignment_2_1 )*
            {
             before(grammarAccess.getCompAccess().getFeaturesAssignment_2_1()); 
            // InternalT2A.g:871:2: ( rule__Comp__FeaturesAssignment_2_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_STRING)||LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalT2A.g:871:3: rule__Comp__FeaturesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Comp__FeaturesAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getCompAccess().getFeaturesAssignment_2_1()); 

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
    // InternalT2A.g:879:1: rule__Comp__Group_2__2 : rule__Comp__Group_2__2__Impl ;
    public final void rule__Comp__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:883:1: ( rule__Comp__Group_2__2__Impl )
            // InternalT2A.g:884:2: rule__Comp__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comp__Group_2__2__Impl();

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
    // InternalT2A.g:890:1: rule__Comp__Group_2__2__Impl : ( '}' ) ;
    public final void rule__Comp__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:894:1: ( ( '}' ) )
            // InternalT2A.g:895:1: ( '}' )
            {
            // InternalT2A.g:895:1: ( '}' )
            // InternalT2A.g:896:2: '}'
            {
             before(grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_2()); 

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


    // $ANTLR start "rule__InstanciaEDOM__Group__0"
    // InternalT2A.g:906:1: rule__InstanciaEDOM__Group__0 : rule__InstanciaEDOM__Group__0__Impl rule__InstanciaEDOM__Group__1 ;
    public final void rule__InstanciaEDOM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:910:1: ( rule__InstanciaEDOM__Group__0__Impl rule__InstanciaEDOM__Group__1 )
            // InternalT2A.g:911:2: rule__InstanciaEDOM__Group__0__Impl rule__InstanciaEDOM__Group__1
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
    // InternalT2A.g:918:1: rule__InstanciaEDOM__Group__0__Impl : ( ( rule__InstanciaEDOM__InstanciaAssignment_0 ) ) ;
    public final void rule__InstanciaEDOM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:922:1: ( ( ( rule__InstanciaEDOM__InstanciaAssignment_0 ) ) )
            // InternalT2A.g:923:1: ( ( rule__InstanciaEDOM__InstanciaAssignment_0 ) )
            {
            // InternalT2A.g:923:1: ( ( rule__InstanciaEDOM__InstanciaAssignment_0 ) )
            // InternalT2A.g:924:2: ( rule__InstanciaEDOM__InstanciaAssignment_0 )
            {
             before(grammarAccess.getInstanciaEDOMAccess().getInstanciaAssignment_0()); 
            // InternalT2A.g:925:2: ( rule__InstanciaEDOM__InstanciaAssignment_0 )
            // InternalT2A.g:925:3: rule__InstanciaEDOM__InstanciaAssignment_0
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
    // InternalT2A.g:933:1: rule__InstanciaEDOM__Group__1 : rule__InstanciaEDOM__Group__1__Impl ;
    public final void rule__InstanciaEDOM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:937:1: ( rule__InstanciaEDOM__Group__1__Impl )
            // InternalT2A.g:938:2: rule__InstanciaEDOM__Group__1__Impl
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
    // InternalT2A.g:944:1: rule__InstanciaEDOM__Group__1__Impl : ( ( rule__InstanciaEDOM__Group_1__0 )? ) ;
    public final void rule__InstanciaEDOM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:948:1: ( ( ( rule__InstanciaEDOM__Group_1__0 )? ) )
            // InternalT2A.g:949:1: ( ( rule__InstanciaEDOM__Group_1__0 )? )
            {
            // InternalT2A.g:949:1: ( ( rule__InstanciaEDOM__Group_1__0 )? )
            // InternalT2A.g:950:2: ( rule__InstanciaEDOM__Group_1__0 )?
            {
             before(grammarAccess.getInstanciaEDOMAccess().getGroup_1()); 
            // InternalT2A.g:951:2: ( rule__InstanciaEDOM__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==12) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalT2A.g:951:3: rule__InstanciaEDOM__Group_1__0
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
    // InternalT2A.g:960:1: rule__InstanciaEDOM__Group_1__0 : rule__InstanciaEDOM__Group_1__0__Impl rule__InstanciaEDOM__Group_1__1 ;
    public final void rule__InstanciaEDOM__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:964:1: ( rule__InstanciaEDOM__Group_1__0__Impl rule__InstanciaEDOM__Group_1__1 )
            // InternalT2A.g:965:2: rule__InstanciaEDOM__Group_1__0__Impl rule__InstanciaEDOM__Group_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalT2A.g:972:1: rule__InstanciaEDOM__Group_1__0__Impl : ( '{' ) ;
    public final void rule__InstanciaEDOM__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:976:1: ( ( '{' ) )
            // InternalT2A.g:977:1: ( '{' )
            {
            // InternalT2A.g:977:1: ( '{' )
            // InternalT2A.g:978:2: '{'
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
    // InternalT2A.g:987:1: rule__InstanciaEDOM__Group_1__1 : rule__InstanciaEDOM__Group_1__1__Impl rule__InstanciaEDOM__Group_1__2 ;
    public final void rule__InstanciaEDOM__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:991:1: ( rule__InstanciaEDOM__Group_1__1__Impl rule__InstanciaEDOM__Group_1__2 )
            // InternalT2A.g:992:2: rule__InstanciaEDOM__Group_1__1__Impl rule__InstanciaEDOM__Group_1__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalT2A.g:999:1: rule__InstanciaEDOM__Group_1__1__Impl : ( ( rule__InstanciaEDOM__InsfeaturesAssignment_1_1 )* ) ;
    public final void rule__InstanciaEDOM__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1003:1: ( ( ( rule__InstanciaEDOM__InsfeaturesAssignment_1_1 )* ) )
            // InternalT2A.g:1004:1: ( ( rule__InstanciaEDOM__InsfeaturesAssignment_1_1 )* )
            {
            // InternalT2A.g:1004:1: ( ( rule__InstanciaEDOM__InsfeaturesAssignment_1_1 )* )
            // InternalT2A.g:1005:2: ( rule__InstanciaEDOM__InsfeaturesAssignment_1_1 )*
            {
             before(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesAssignment_1_1()); 
            // InternalT2A.g:1006:2: ( rule__InstanciaEDOM__InsfeaturesAssignment_1_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalT2A.g:1006:3: rule__InstanciaEDOM__InsfeaturesAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__InstanciaEDOM__InsfeaturesAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalT2A.g:1014:1: rule__InstanciaEDOM__Group_1__2 : rule__InstanciaEDOM__Group_1__2__Impl ;
    public final void rule__InstanciaEDOM__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1018:1: ( rule__InstanciaEDOM__Group_1__2__Impl )
            // InternalT2A.g:1019:2: rule__InstanciaEDOM__Group_1__2__Impl
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
    // InternalT2A.g:1025:1: rule__InstanciaEDOM__Group_1__2__Impl : ( '}' ) ;
    public final void rule__InstanciaEDOM__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1029:1: ( ( '}' ) )
            // InternalT2A.g:1030:1: ( '}' )
            {
            // InternalT2A.g:1030:1: ( '}' )
            // InternalT2A.g:1031:2: '}'
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
    // InternalT2A.g:1041:1: rule__Root__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Root__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1045:1: ( ( ruleElement ) )
            // InternalT2A.g:1046:2: ( ruleElement )
            {
            // InternalT2A.g:1046:2: ( ruleElement )
            // InternalT2A.g:1047:3: ruleElement
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
    // InternalT2A.g:1056:1: rule__Page__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Page__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1060:1: ( ( RULE_ID ) )
            // InternalT2A.g:1061:2: ( RULE_ID )
            {
            // InternalT2A.g:1061:2: ( RULE_ID )
            // InternalT2A.g:1062:3: RULE_ID
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


    // $ANTLR start "rule__Page__HomeAssignment_3"
    // InternalT2A.g:1071:1: rule__Page__HomeAssignment_3 : ( ( 'home' ) ) ;
    public final void rule__Page__HomeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1075:1: ( ( ( 'home' ) ) )
            // InternalT2A.g:1076:2: ( ( 'home' ) )
            {
            // InternalT2A.g:1076:2: ( ( 'home' ) )
            // InternalT2A.g:1077:3: ( 'home' )
            {
             before(grammarAccess.getPageAccess().getHomeHomeKeyword_3_0()); 
            // InternalT2A.g:1078:3: ( 'home' )
            // InternalT2A.g:1079:4: 'home'
            {
             before(grammarAccess.getPageAccess().getHomeHomeKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getHomeHomeKeyword_3_0()); 

            }

             after(grammarAccess.getPageAccess().getHomeHomeKeyword_3_0()); 

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
    // $ANTLR end "rule__Page__HomeAssignment_3"


    // $ANTLR start "rule__Page__PageFeaturesAssignment_4"
    // InternalT2A.g:1090:1: rule__Page__PageFeaturesAssignment_4 : ( rulePageFeature ) ;
    public final void rule__Page__PageFeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1094:1: ( ( rulePageFeature ) )
            // InternalT2A.g:1095:2: ( rulePageFeature )
            {
            // InternalT2A.g:1095:2: ( rulePageFeature )
            // InternalT2A.g:1096:3: rulePageFeature
            {
             before(grammarAccess.getPageAccess().getPageFeaturesPageFeatureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePageFeature();

            state._fsp--;

             after(grammarAccess.getPageAccess().getPageFeaturesPageFeatureParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Page__PageFeaturesAssignment_4"


    // $ANTLR start "rule__DOM__NameAssignment_1"
    // InternalT2A.g:1105:1: rule__DOM__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DOM__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1109:1: ( ( RULE_ID ) )
            // InternalT2A.g:1110:2: ( RULE_ID )
            {
            // InternalT2A.g:1110:2: ( RULE_ID )
            // InternalT2A.g:1111:3: RULE_ID
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


    // $ANTLR start "rule__DOM__FeaturesAssignment_2_1"
    // InternalT2A.g:1120:1: rule__DOM__FeaturesAssignment_2_1 : ( ruleFeature ) ;
    public final void rule__DOM__FeaturesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1124:1: ( ( ruleFeature ) )
            // InternalT2A.g:1125:2: ( ruleFeature )
            {
            // InternalT2A.g:1125:2: ( ruleFeature )
            // InternalT2A.g:1126:3: ruleFeature
            {
             before(grammarAccess.getDOMAccess().getFeaturesFeatureParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getDOMAccess().getFeaturesFeatureParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__DOM__FeaturesAssignment_2_1"


    // $ANTLR start "rule__Comp__NameAssignment_1"
    // InternalT2A.g:1135:1: rule__Comp__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Comp__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1139:1: ( ( RULE_ID ) )
            // InternalT2A.g:1140:2: ( RULE_ID )
            {
            // InternalT2A.g:1140:2: ( RULE_ID )
            // InternalT2A.g:1141:3: RULE_ID
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


    // $ANTLR start "rule__Comp__FeaturesAssignment_2_1"
    // InternalT2A.g:1150:1: rule__Comp__FeaturesAssignment_2_1 : ( ruleFeature ) ;
    public final void rule__Comp__FeaturesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1154:1: ( ( ruleFeature ) )
            // InternalT2A.g:1155:2: ( ruleFeature )
            {
            // InternalT2A.g:1155:2: ( ruleFeature )
            // InternalT2A.g:1156:3: ruleFeature
            {
             before(grammarAccess.getCompAccess().getFeaturesFeatureParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getCompAccess().getFeaturesFeatureParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Comp__FeaturesAssignment_2_1"


    // $ANTLR start "rule__InstanciaEDOM__InstanciaAssignment_0"
    // InternalT2A.g:1165:1: rule__InstanciaEDOM__InstanciaAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__InstanciaEDOM__InstanciaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1169:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:1170:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:1170:2: ( ( RULE_ID ) )
            // InternalT2A.g:1171:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanciaEDOMAccess().getInstanciaEDOMCrossReference_0_0()); 
            // InternalT2A.g:1172:3: ( RULE_ID )
            // InternalT2A.g:1173:4: RULE_ID
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
    // InternalT2A.g:1184:1: rule__InstanciaEDOM__InsfeaturesAssignment_1_1 : ( ruleInstanceEDOMFeature ) ;
    public final void rule__InstanciaEDOM__InsfeaturesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1188:1: ( ( ruleInstanceEDOMFeature ) )
            // InternalT2A.g:1189:2: ( ruleInstanceEDOMFeature )
            {
            // InternalT2A.g:1189:2: ( ruleInstanceEDOMFeature )
            // InternalT2A.g:1190:3: ruleInstanceEDOMFeature
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
    // InternalT2A.g:1199:1: rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 : ( ruleInstanciaEDOM ) ;
    public final void rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1203:1: ( ( ruleInstanciaEDOM ) )
            // InternalT2A.g:1204:2: ( ruleInstanciaEDOM )
            {
            // InternalT2A.g:1204:2: ( ruleInstanciaEDOM )
            // InternalT2A.g:1205:3: ruleInstanciaEDOM
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
    // InternalT2A.g:1214:1: rule__InstanceEDOMFeature__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__InstanceEDOMFeature__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1218:1: ( ( RULE_STRING ) )
            // InternalT2A.g:1219:2: ( RULE_STRING )
            {
            // InternalT2A.g:1219:2: ( RULE_STRING )
            // InternalT2A.g:1220:3: RULE_STRING
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
    // InternalT2A.g:1229:1: rule__PageFeature__InstanciaEDOMAssignment_0 : ( ruleInstanciaEDOM ) ;
    public final void rule__PageFeature__InstanciaEDOMAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1233:1: ( ( ruleInstanciaEDOM ) )
            // InternalT2A.g:1234:2: ( ruleInstanciaEDOM )
            {
            // InternalT2A.g:1234:2: ( ruleInstanciaEDOM )
            // InternalT2A.g:1235:3: ruleInstanciaEDOM
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
    // InternalT2A.g:1244:1: rule__PageFeature__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__PageFeature__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1248:1: ( ( RULE_STRING ) )
            // InternalT2A.g:1249:2: ( RULE_STRING )
            {
            // InternalT2A.g:1249:2: ( RULE_STRING )
            // InternalT2A.g:1250:3: RULE_STRING
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
    // InternalT2A.g:1259:1: rule__Feature__InstanciaEDOMAssignment_0 : ( ruleInstanciaEDOM ) ;
    public final void rule__Feature__InstanciaEDOMAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1263:1: ( ( ruleInstanciaEDOM ) )
            // InternalT2A.g:1264:2: ( ruleInstanciaEDOM )
            {
            // InternalT2A.g:1264:2: ( ruleInstanciaEDOM )
            // InternalT2A.g:1265:3: ruleInstanciaEDOM
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
    // InternalT2A.g:1274:1: rule__Feature__AllowSlotAssignment_1 : ( ( 'AllowSlot' ) ) ;
    public final void rule__Feature__AllowSlotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1278:1: ( ( ( 'AllowSlot' ) ) )
            // InternalT2A.g:1279:2: ( ( 'AllowSlot' ) )
            {
            // InternalT2A.g:1279:2: ( ( 'AllowSlot' ) )
            // InternalT2A.g:1280:3: ( 'AllowSlot' )
            {
             before(grammarAccess.getFeatureAccess().getAllowSlotAllowSlotKeyword_1_0()); 
            // InternalT2A.g:1281:3: ( 'AllowSlot' )
            // InternalT2A.g:1282:4: 'AllowSlot'
            {
             before(grammarAccess.getFeatureAccess().getAllowSlotAllowSlotKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalT2A.g:1293:1: rule__Feature__StringAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Feature__StringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1297:1: ( ( RULE_STRING ) )
            // InternalT2A.g:1298:2: ( RULE_STRING )
            {
            // InternalT2A.g:1298:2: ( RULE_STRING )
            // InternalT2A.g:1299:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000C802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000012030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000022030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020032L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002030L});

}