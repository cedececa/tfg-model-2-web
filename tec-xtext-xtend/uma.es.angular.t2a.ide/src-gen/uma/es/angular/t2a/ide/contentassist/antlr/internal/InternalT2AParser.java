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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING2", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'_'", "'#'", "'-'", "'*'", "'.'", "'::'", "'>'", "'Page'", "'{'", "'}'", "'sclass'", "'StyleGlobal'", "'StyleClass'", "';'", "'after'", "'active'", "'Dom'", "'Comp'", "'home'", "'showInNav'", "'AllowSlot'"
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
    public static final int T__32=32;
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
    // InternalT2A.g:62:1: ruleRoot : ( ( rule__Root__Group__0 ) ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:66:2: ( ( ( rule__Root__Group__0 ) ) )
            // InternalT2A.g:67:2: ( ( rule__Root__Group__0 ) )
            {
            // InternalT2A.g:67:2: ( ( rule__Root__Group__0 ) )
            // InternalT2A.g:68:3: ( rule__Root__Group__0 )
            {
             before(grammarAccess.getRootAccess().getGroup()); 
            // InternalT2A.g:69:3: ( rule__Root__Group__0 )
            // InternalT2A.g:69:4: rule__Root__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getGroup()); 

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
    // InternalT2A.g:78:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalT2A.g:79:1: ( ruleElement EOF )
            // InternalT2A.g:80:1: ruleElement EOF
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
    // InternalT2A.g:87:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:91:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalT2A.g:92:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalT2A.g:92:2: ( ( rule__Element__Alternatives ) )
            // InternalT2A.g:93:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalT2A.g:94:3: ( rule__Element__Alternatives )
            // InternalT2A.g:94:4: rule__Element__Alternatives
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
    // InternalT2A.g:103:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // InternalT2A.g:104:1: ( rulePage EOF )
            // InternalT2A.g:105:1: rulePage EOF
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
    // InternalT2A.g:112:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:116:2: ( ( ( rule__Page__Group__0 ) ) )
            // InternalT2A.g:117:2: ( ( rule__Page__Group__0 ) )
            {
            // InternalT2A.g:117:2: ( ( rule__Page__Group__0 ) )
            // InternalT2A.g:118:3: ( rule__Page__Group__0 )
            {
             before(grammarAccess.getPageAccess().getGroup()); 
            // InternalT2A.g:119:3: ( rule__Page__Group__0 )
            // InternalT2A.g:119:4: rule__Page__Group__0
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
    // InternalT2A.g:128:1: entryRuleEDOM : ruleEDOM EOF ;
    public final void entryRuleEDOM() throws RecognitionException {
        try {
            // InternalT2A.g:129:1: ( ruleEDOM EOF )
            // InternalT2A.g:130:1: ruleEDOM EOF
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
    // InternalT2A.g:137:1: ruleEDOM : ( ( rule__EDOM__Alternatives ) ) ;
    public final void ruleEDOM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:141:2: ( ( ( rule__EDOM__Alternatives ) ) )
            // InternalT2A.g:142:2: ( ( rule__EDOM__Alternatives ) )
            {
            // InternalT2A.g:142:2: ( ( rule__EDOM__Alternatives ) )
            // InternalT2A.g:143:3: ( rule__EDOM__Alternatives )
            {
             before(grammarAccess.getEDOMAccess().getAlternatives()); 
            // InternalT2A.g:144:3: ( rule__EDOM__Alternatives )
            // InternalT2A.g:144:4: rule__EDOM__Alternatives
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


    // $ANTLR start "entryRuleStyleGlobal"
    // InternalT2A.g:153:1: entryRuleStyleGlobal : ruleStyleGlobal EOF ;
    public final void entryRuleStyleGlobal() throws RecognitionException {
        try {
            // InternalT2A.g:154:1: ( ruleStyleGlobal EOF )
            // InternalT2A.g:155:1: ruleStyleGlobal EOF
            {
             before(grammarAccess.getStyleGlobalRule()); 
            pushFollow(FOLLOW_1);
            ruleStyleGlobal();

            state._fsp--;

             after(grammarAccess.getStyleGlobalRule()); 
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
    // $ANTLR end "entryRuleStyleGlobal"


    // $ANTLR start "ruleStyleGlobal"
    // InternalT2A.g:162:1: ruleStyleGlobal : ( ( rule__StyleGlobal__Group__0 ) ) ;
    public final void ruleStyleGlobal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:166:2: ( ( ( rule__StyleGlobal__Group__0 ) ) )
            // InternalT2A.g:167:2: ( ( rule__StyleGlobal__Group__0 ) )
            {
            // InternalT2A.g:167:2: ( ( rule__StyleGlobal__Group__0 ) )
            // InternalT2A.g:168:3: ( rule__StyleGlobal__Group__0 )
            {
             before(grammarAccess.getStyleGlobalAccess().getGroup()); 
            // InternalT2A.g:169:3: ( rule__StyleGlobal__Group__0 )
            // InternalT2A.g:169:4: rule__StyleGlobal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StyleGlobal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStyleGlobalAccess().getGroup()); 

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
    // $ANTLR end "ruleStyleGlobal"


    // $ANTLR start "entryRuleStyleClass"
    // InternalT2A.g:178:1: entryRuleStyleClass : ruleStyleClass EOF ;
    public final void entryRuleStyleClass() throws RecognitionException {
        try {
            // InternalT2A.g:179:1: ( ruleStyleClass EOF )
            // InternalT2A.g:180:1: ruleStyleClass EOF
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
    // InternalT2A.g:187:1: ruleStyleClass : ( ( rule__StyleClass__Group__0 ) ) ;
    public final void ruleStyleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:191:2: ( ( ( rule__StyleClass__Group__0 ) ) )
            // InternalT2A.g:192:2: ( ( rule__StyleClass__Group__0 ) )
            {
            // InternalT2A.g:192:2: ( ( rule__StyleClass__Group__0 ) )
            // InternalT2A.g:193:3: ( rule__StyleClass__Group__0 )
            {
             before(grammarAccess.getStyleClassAccess().getGroup()); 
            // InternalT2A.g:194:3: ( rule__StyleClass__Group__0 )
            // InternalT2A.g:194:4: rule__StyleClass__Group__0
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
    // InternalT2A.g:203:1: entryRuleSAttributeAndValue : ruleSAttributeAndValue EOF ;
    public final void entryRuleSAttributeAndValue() throws RecognitionException {
        try {
            // InternalT2A.g:204:1: ( ruleSAttributeAndValue EOF )
            // InternalT2A.g:205:1: ruleSAttributeAndValue EOF
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
    // InternalT2A.g:212:1: ruleSAttributeAndValue : ( ( rule__SAttributeAndValue__Group__0 ) ) ;
    public final void ruleSAttributeAndValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:216:2: ( ( ( rule__SAttributeAndValue__Group__0 ) ) )
            // InternalT2A.g:217:2: ( ( rule__SAttributeAndValue__Group__0 ) )
            {
            // InternalT2A.g:217:2: ( ( rule__SAttributeAndValue__Group__0 ) )
            // InternalT2A.g:218:3: ( rule__SAttributeAndValue__Group__0 )
            {
             before(grammarAccess.getSAttributeAndValueAccess().getGroup()); 
            // InternalT2A.g:219:3: ( rule__SAttributeAndValue__Group__0 )
            // InternalT2A.g:219:4: rule__SAttributeAndValue__Group__0
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
    // InternalT2A.g:228:1: entryRuleDOM : ruleDOM EOF ;
    public final void entryRuleDOM() throws RecognitionException {
        try {
            // InternalT2A.g:229:1: ( ruleDOM EOF )
            // InternalT2A.g:230:1: ruleDOM EOF
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
    // InternalT2A.g:237:1: ruleDOM : ( ( rule__DOM__Group__0 ) ) ;
    public final void ruleDOM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:241:2: ( ( ( rule__DOM__Group__0 ) ) )
            // InternalT2A.g:242:2: ( ( rule__DOM__Group__0 ) )
            {
            // InternalT2A.g:242:2: ( ( rule__DOM__Group__0 ) )
            // InternalT2A.g:243:3: ( rule__DOM__Group__0 )
            {
             before(grammarAccess.getDOMAccess().getGroup()); 
            // InternalT2A.g:244:3: ( rule__DOM__Group__0 )
            // InternalT2A.g:244:4: rule__DOM__Group__0
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
    // InternalT2A.g:253:1: entryRuleComp : ruleComp EOF ;
    public final void entryRuleComp() throws RecognitionException {
        try {
            // InternalT2A.g:254:1: ( ruleComp EOF )
            // InternalT2A.g:255:1: ruleComp EOF
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
    // InternalT2A.g:262:1: ruleComp : ( ( rule__Comp__Group__0 ) ) ;
    public final void ruleComp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:266:2: ( ( ( rule__Comp__Group__0 ) ) )
            // InternalT2A.g:267:2: ( ( rule__Comp__Group__0 ) )
            {
            // InternalT2A.g:267:2: ( ( rule__Comp__Group__0 ) )
            // InternalT2A.g:268:3: ( rule__Comp__Group__0 )
            {
             before(grammarAccess.getCompAccess().getGroup()); 
            // InternalT2A.g:269:3: ( rule__Comp__Group__0 )
            // InternalT2A.g:269:4: rule__Comp__Group__0
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
    // InternalT2A.g:278:1: entryRuleInstanciaEDOM : ruleInstanciaEDOM EOF ;
    public final void entryRuleInstanciaEDOM() throws RecognitionException {
        try {
            // InternalT2A.g:279:1: ( ruleInstanciaEDOM EOF )
            // InternalT2A.g:280:1: ruleInstanciaEDOM EOF
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
    // InternalT2A.g:287:1: ruleInstanciaEDOM : ( ( rule__InstanciaEDOM__Group__0 ) ) ;
    public final void ruleInstanciaEDOM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:291:2: ( ( ( rule__InstanciaEDOM__Group__0 ) ) )
            // InternalT2A.g:292:2: ( ( rule__InstanciaEDOM__Group__0 ) )
            {
            // InternalT2A.g:292:2: ( ( rule__InstanciaEDOM__Group__0 ) )
            // InternalT2A.g:293:3: ( rule__InstanciaEDOM__Group__0 )
            {
             before(grammarAccess.getInstanciaEDOMAccess().getGroup()); 
            // InternalT2A.g:294:3: ( rule__InstanciaEDOM__Group__0 )
            // InternalT2A.g:294:4: rule__InstanciaEDOM__Group__0
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
    // InternalT2A.g:303:1: entryRuleInstanceEDOMFeature : ruleInstanceEDOMFeature EOF ;
    public final void entryRuleInstanceEDOMFeature() throws RecognitionException {
        try {
            // InternalT2A.g:304:1: ( ruleInstanceEDOMFeature EOF )
            // InternalT2A.g:305:1: ruleInstanceEDOMFeature EOF
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
    // InternalT2A.g:312:1: ruleInstanceEDOMFeature : ( ( rule__InstanceEDOMFeature__Alternatives ) ) ;
    public final void ruleInstanceEDOMFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:316:2: ( ( ( rule__InstanceEDOMFeature__Alternatives ) ) )
            // InternalT2A.g:317:2: ( ( rule__InstanceEDOMFeature__Alternatives ) )
            {
            // InternalT2A.g:317:2: ( ( rule__InstanceEDOMFeature__Alternatives ) )
            // InternalT2A.g:318:3: ( rule__InstanceEDOMFeature__Alternatives )
            {
             before(grammarAccess.getInstanceEDOMFeatureAccess().getAlternatives()); 
            // InternalT2A.g:319:3: ( rule__InstanceEDOMFeature__Alternatives )
            // InternalT2A.g:319:4: rule__InstanceEDOMFeature__Alternatives
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
    // InternalT2A.g:328:1: entryRulePageFeature : rulePageFeature EOF ;
    public final void entryRulePageFeature() throws RecognitionException {
        try {
            // InternalT2A.g:329:1: ( rulePageFeature EOF )
            // InternalT2A.g:330:1: rulePageFeature EOF
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
    // InternalT2A.g:337:1: rulePageFeature : ( ( rule__PageFeature__Alternatives ) ) ;
    public final void rulePageFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:341:2: ( ( ( rule__PageFeature__Alternatives ) ) )
            // InternalT2A.g:342:2: ( ( rule__PageFeature__Alternatives ) )
            {
            // InternalT2A.g:342:2: ( ( rule__PageFeature__Alternatives ) )
            // InternalT2A.g:343:3: ( rule__PageFeature__Alternatives )
            {
             before(grammarAccess.getPageFeatureAccess().getAlternatives()); 
            // InternalT2A.g:344:3: ( rule__PageFeature__Alternatives )
            // InternalT2A.g:344:4: rule__PageFeature__Alternatives
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
    // InternalT2A.g:353:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalT2A.g:354:1: ( ruleFeature EOF )
            // InternalT2A.g:355:1: ruleFeature EOF
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
    // InternalT2A.g:362:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:366:2: ( ( ( rule__Feature__Alternatives ) ) )
            // InternalT2A.g:367:2: ( ( rule__Feature__Alternatives ) )
            {
            // InternalT2A.g:367:2: ( ( rule__Feature__Alternatives ) )
            // InternalT2A.g:368:3: ( rule__Feature__Alternatives )
            {
             before(grammarAccess.getFeatureAccess().getAlternatives()); 
            // InternalT2A.g:369:3: ( rule__Feature__Alternatives )
            // InternalT2A.g:369:4: rule__Feature__Alternatives
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
    // InternalT2A.g:378:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalT2A.g:379:1: ( ruleName EOF )
            // InternalT2A.g:380:1: ruleName EOF
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
    // InternalT2A.g:387:1: ruleName : ( ( rule__Name__Alternatives )* ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:391:2: ( ( ( rule__Name__Alternatives )* ) )
            // InternalT2A.g:392:2: ( ( rule__Name__Alternatives )* )
            {
            // InternalT2A.g:392:2: ( ( rule__Name__Alternatives )* )
            // InternalT2A.g:393:3: ( rule__Name__Alternatives )*
            {
             before(grammarAccess.getNameAccess().getAlternatives()); 
            // InternalT2A.g:394:3: ( rule__Name__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=12 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalT2A.g:394:4: rule__Name__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Name__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // InternalT2A.g:402:1: rule__Element__Alternatives : ( ( rulePage ) | ( ruleEDOM ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:406:1: ( ( rulePage ) | ( ruleEDOM ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==24||(LA2_0>=28 && LA2_0<=29)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalT2A.g:407:2: ( rulePage )
                    {
                    // InternalT2A.g:407:2: ( rulePage )
                    // InternalT2A.g:408:3: rulePage
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
                    // InternalT2A.g:413:2: ( ruleEDOM )
                    {
                    // InternalT2A.g:413:2: ( ruleEDOM )
                    // InternalT2A.g:414:3: ruleEDOM
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
    // InternalT2A.g:423:1: rule__EDOM__Alternatives : ( ( ruleDOM ) | ( ruleComp ) | ( ruleStyleClass ) );
    public final void rule__EDOM__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:427:1: ( ( ruleDOM ) | ( ruleComp ) | ( ruleStyleClass ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                alt3=2;
                }
                break;
            case 24:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalT2A.g:428:2: ( ruleDOM )
                    {
                    // InternalT2A.g:428:2: ( ruleDOM )
                    // InternalT2A.g:429:3: ruleDOM
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
                    // InternalT2A.g:434:2: ( ruleComp )
                    {
                    // InternalT2A.g:434:2: ( ruleComp )
                    // InternalT2A.g:435:3: ruleComp
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
                    // InternalT2A.g:440:2: ( ruleStyleClass )
                    {
                    // InternalT2A.g:440:2: ( ruleStyleClass )
                    // InternalT2A.g:441:3: ruleStyleClass
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
    // InternalT2A.g:450:1: rule__InstanceEDOMFeature__Alternatives : ( ( ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__InstanceEDOMFeature__StringAssignment_1 ) ) );
    public final void rule__InstanceEDOMFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:454:1: ( ( ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__InstanceEDOMFeature__StringAssignment_1 ) ) )
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
                    // InternalT2A.g:455:2: ( ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 ) )
                    {
                    // InternalT2A.g:455:2: ( ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 ) )
                    // InternalT2A.g:456:3: ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 )
                    {
                     before(grammarAccess.getInstanceEDOMFeatureAccess().getInstanciaEDOMAssignment_0()); 
                    // InternalT2A.g:457:3: ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 )
                    // InternalT2A.g:457:4: rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0
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
                    // InternalT2A.g:461:2: ( ( rule__InstanceEDOMFeature__StringAssignment_1 ) )
                    {
                    // InternalT2A.g:461:2: ( ( rule__InstanceEDOMFeature__StringAssignment_1 ) )
                    // InternalT2A.g:462:3: ( rule__InstanceEDOMFeature__StringAssignment_1 )
                    {
                     before(grammarAccess.getInstanceEDOMFeatureAccess().getStringAssignment_1()); 
                    // InternalT2A.g:463:3: ( rule__InstanceEDOMFeature__StringAssignment_1 )
                    // InternalT2A.g:463:4: rule__InstanceEDOMFeature__StringAssignment_1
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
    // InternalT2A.g:471:1: rule__PageFeature__Alternatives : ( ( ( rule__PageFeature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__PageFeature__StringAssignment_1 ) ) );
    public final void rule__PageFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:475:1: ( ( ( rule__PageFeature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__PageFeature__StringAssignment_1 ) ) )
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
                    // InternalT2A.g:476:2: ( ( rule__PageFeature__InstanciaEDOMAssignment_0 ) )
                    {
                    // InternalT2A.g:476:2: ( ( rule__PageFeature__InstanciaEDOMAssignment_0 ) )
                    // InternalT2A.g:477:3: ( rule__PageFeature__InstanciaEDOMAssignment_0 )
                    {
                     before(grammarAccess.getPageFeatureAccess().getInstanciaEDOMAssignment_0()); 
                    // InternalT2A.g:478:3: ( rule__PageFeature__InstanciaEDOMAssignment_0 )
                    // InternalT2A.g:478:4: rule__PageFeature__InstanciaEDOMAssignment_0
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
                    // InternalT2A.g:482:2: ( ( rule__PageFeature__StringAssignment_1 ) )
                    {
                    // InternalT2A.g:482:2: ( ( rule__PageFeature__StringAssignment_1 ) )
                    // InternalT2A.g:483:3: ( rule__PageFeature__StringAssignment_1 )
                    {
                     before(grammarAccess.getPageFeatureAccess().getStringAssignment_1()); 
                    // InternalT2A.g:484:3: ( rule__PageFeature__StringAssignment_1 )
                    // InternalT2A.g:484:4: rule__PageFeature__StringAssignment_1
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
    // InternalT2A.g:492:1: rule__Feature__Alternatives : ( ( ( rule__Feature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__Feature__AllowSlotAssignment_1 ) ) | ( ( rule__Feature__StringAssignment_2 ) ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:496:1: ( ( ( rule__Feature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__Feature__AllowSlotAssignment_1 ) ) | ( ( rule__Feature__StringAssignment_2 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 32:
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
                    // InternalT2A.g:497:2: ( ( rule__Feature__InstanciaEDOMAssignment_0 ) )
                    {
                    // InternalT2A.g:497:2: ( ( rule__Feature__InstanciaEDOMAssignment_0 ) )
                    // InternalT2A.g:498:3: ( rule__Feature__InstanciaEDOMAssignment_0 )
                    {
                     before(grammarAccess.getFeatureAccess().getInstanciaEDOMAssignment_0()); 
                    // InternalT2A.g:499:3: ( rule__Feature__InstanciaEDOMAssignment_0 )
                    // InternalT2A.g:499:4: rule__Feature__InstanciaEDOMAssignment_0
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
                    // InternalT2A.g:503:2: ( ( rule__Feature__AllowSlotAssignment_1 ) )
                    {
                    // InternalT2A.g:503:2: ( ( rule__Feature__AllowSlotAssignment_1 ) )
                    // InternalT2A.g:504:3: ( rule__Feature__AllowSlotAssignment_1 )
                    {
                     before(grammarAccess.getFeatureAccess().getAllowSlotAssignment_1()); 
                    // InternalT2A.g:505:3: ( rule__Feature__AllowSlotAssignment_1 )
                    // InternalT2A.g:505:4: rule__Feature__AllowSlotAssignment_1
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
                    // InternalT2A.g:509:2: ( ( rule__Feature__StringAssignment_2 ) )
                    {
                    // InternalT2A.g:509:2: ( ( rule__Feature__StringAssignment_2 ) )
                    // InternalT2A.g:510:3: ( rule__Feature__StringAssignment_2 )
                    {
                     before(grammarAccess.getFeatureAccess().getStringAssignment_2()); 
                    // InternalT2A.g:511:3: ( rule__Feature__StringAssignment_2 )
                    // InternalT2A.g:511:4: rule__Feature__StringAssignment_2
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
    // InternalT2A.g:519:1: rule__Name__Alternatives : ( ( '_' ) | ( '#' ) | ( '-' ) | ( '*' ) | ( '.' ) | ( '::' ) | ( '>' ) | ( RULE_ID ) );
    public final void rule__Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:523:1: ( ( '_' ) | ( '#' ) | ( '-' ) | ( '*' ) | ( '.' ) | ( '::' ) | ( '>' ) | ( RULE_ID ) )
            int alt7=8;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt7=1;
                }
                break;
            case 13:
                {
                alt7=2;
                }
                break;
            case 14:
                {
                alt7=3;
                }
                break;
            case 15:
                {
                alt7=4;
                }
                break;
            case 16:
                {
                alt7=5;
                }
                break;
            case 17:
                {
                alt7=6;
                }
                break;
            case 18:
                {
                alt7=7;
                }
                break;
            case RULE_ID:
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalT2A.g:524:2: ( '_' )
                    {
                    // InternalT2A.g:524:2: ( '_' )
                    // InternalT2A.g:525:3: '_'
                    {
                     before(grammarAccess.getNameAccess().get_Keyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().get_Keyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT2A.g:530:2: ( '#' )
                    {
                    // InternalT2A.g:530:2: ( '#' )
                    // InternalT2A.g:531:3: '#'
                    {
                     before(grammarAccess.getNameAccess().getNumberSignKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getNumberSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalT2A.g:536:2: ( '-' )
                    {
                    // InternalT2A.g:536:2: ( '-' )
                    // InternalT2A.g:537:3: '-'
                    {
                     before(grammarAccess.getNameAccess().getHyphenMinusKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getHyphenMinusKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalT2A.g:542:2: ( '*' )
                    {
                    // InternalT2A.g:542:2: ( '*' )
                    // InternalT2A.g:543:3: '*'
                    {
                     before(grammarAccess.getNameAccess().getAsteriskKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getAsteriskKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalT2A.g:548:2: ( '.' )
                    {
                    // InternalT2A.g:548:2: ( '.' )
                    // InternalT2A.g:549:3: '.'
                    {
                     before(grammarAccess.getNameAccess().getFullStopKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getFullStopKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalT2A.g:554:2: ( '::' )
                    {
                    // InternalT2A.g:554:2: ( '::' )
                    // InternalT2A.g:555:3: '::'
                    {
                     before(grammarAccess.getNameAccess().getColonColonKeyword_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getColonColonKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalT2A.g:560:2: ( '>' )
                    {
                    // InternalT2A.g:560:2: ( '>' )
                    // InternalT2A.g:561:3: '>'
                    {
                     before(grammarAccess.getNameAccess().getGreaterThanSignKeyword_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getGreaterThanSignKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalT2A.g:566:2: ( RULE_ID )
                    {
                    // InternalT2A.g:566:2: ( RULE_ID )
                    // InternalT2A.g:567:3: RULE_ID
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


    // $ANTLR start "rule__Root__Group__0"
    // InternalT2A.g:576:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:580:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // InternalT2A.g:581:2: rule__Root__Group__0__Impl rule__Root__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Root__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__1();

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
    // $ANTLR end "rule__Root__Group__0"


    // $ANTLR start "rule__Root__Group__0__Impl"
    // InternalT2A.g:588:1: rule__Root__Group__0__Impl : ( ( rule__Root__GlobalStyleAssignment_0 ) ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:592:1: ( ( ( rule__Root__GlobalStyleAssignment_0 ) ) )
            // InternalT2A.g:593:1: ( ( rule__Root__GlobalStyleAssignment_0 ) )
            {
            // InternalT2A.g:593:1: ( ( rule__Root__GlobalStyleAssignment_0 ) )
            // InternalT2A.g:594:2: ( rule__Root__GlobalStyleAssignment_0 )
            {
             before(grammarAccess.getRootAccess().getGlobalStyleAssignment_0()); 
            // InternalT2A.g:595:2: ( rule__Root__GlobalStyleAssignment_0 )
            // InternalT2A.g:595:3: rule__Root__GlobalStyleAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Root__GlobalStyleAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getGlobalStyleAssignment_0()); 

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
    // $ANTLR end "rule__Root__Group__0__Impl"


    // $ANTLR start "rule__Root__Group__1"
    // InternalT2A.g:603:1: rule__Root__Group__1 : rule__Root__Group__1__Impl ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:607:1: ( rule__Root__Group__1__Impl )
            // InternalT2A.g:608:2: rule__Root__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__1__Impl();

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
    // $ANTLR end "rule__Root__Group__1"


    // $ANTLR start "rule__Root__Group__1__Impl"
    // InternalT2A.g:614:1: rule__Root__Group__1__Impl : ( ( ( rule__Root__ElementsAssignment_1 ) ) ( ( rule__Root__ElementsAssignment_1 )* ) ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:618:1: ( ( ( ( rule__Root__ElementsAssignment_1 ) ) ( ( rule__Root__ElementsAssignment_1 )* ) ) )
            // InternalT2A.g:619:1: ( ( ( rule__Root__ElementsAssignment_1 ) ) ( ( rule__Root__ElementsAssignment_1 )* ) )
            {
            // InternalT2A.g:619:1: ( ( ( rule__Root__ElementsAssignment_1 ) ) ( ( rule__Root__ElementsAssignment_1 )* ) )
            // InternalT2A.g:620:2: ( ( rule__Root__ElementsAssignment_1 ) ) ( ( rule__Root__ElementsAssignment_1 )* )
            {
            // InternalT2A.g:620:2: ( ( rule__Root__ElementsAssignment_1 ) )
            // InternalT2A.g:621:3: ( rule__Root__ElementsAssignment_1 )
            {
             before(grammarAccess.getRootAccess().getElementsAssignment_1()); 
            // InternalT2A.g:622:3: ( rule__Root__ElementsAssignment_1 )
            // InternalT2A.g:622:4: rule__Root__ElementsAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__Root__ElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getElementsAssignment_1()); 

            }

            // InternalT2A.g:625:2: ( ( rule__Root__ElementsAssignment_1 )* )
            // InternalT2A.g:626:3: ( rule__Root__ElementsAssignment_1 )*
            {
             before(grammarAccess.getRootAccess().getElementsAssignment_1()); 
            // InternalT2A.g:627:3: ( rule__Root__ElementsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19||LA8_0==24||(LA8_0>=28 && LA8_0<=29)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalT2A.g:627:4: rule__Root__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Root__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRootAccess().getElementsAssignment_1()); 

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
    // $ANTLR end "rule__Root__Group__1__Impl"


    // $ANTLR start "rule__Page__Group__0"
    // InternalT2A.g:637:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:641:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // InternalT2A.g:642:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalT2A.g:649:1: rule__Page__Group__0__Impl : ( 'Page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:653:1: ( ( 'Page' ) )
            // InternalT2A.g:654:1: ( 'Page' )
            {
            // InternalT2A.g:654:1: ( 'Page' )
            // InternalT2A.g:655:2: 'Page'
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
    // InternalT2A.g:664:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:668:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // InternalT2A.g:669:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalT2A.g:676:1: rule__Page__Group__1__Impl : ( ( rule__Page__NameAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:680:1: ( ( ( rule__Page__NameAssignment_1 ) ) )
            // InternalT2A.g:681:1: ( ( rule__Page__NameAssignment_1 ) )
            {
            // InternalT2A.g:681:1: ( ( rule__Page__NameAssignment_1 ) )
            // InternalT2A.g:682:2: ( rule__Page__NameAssignment_1 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_1()); 
            // InternalT2A.g:683:2: ( rule__Page__NameAssignment_1 )
            // InternalT2A.g:683:3: rule__Page__NameAssignment_1
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
    // InternalT2A.g:691:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:695:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // InternalT2A.g:696:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalT2A.g:703:1: rule__Page__Group__2__Impl : ( '{' ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:707:1: ( ( '{' ) )
            // InternalT2A.g:708:1: ( '{' )
            {
            // InternalT2A.g:708:1: ( '{' )
            // InternalT2A.g:709:2: '{'
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
    // InternalT2A.g:718:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:722:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // InternalT2A.g:723:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalT2A.g:730:1: rule__Page__Group__3__Impl : ( ( rule__Page__Group_3__0 )? ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:734:1: ( ( ( rule__Page__Group_3__0 )? ) )
            // InternalT2A.g:735:1: ( ( rule__Page__Group_3__0 )? )
            {
            // InternalT2A.g:735:1: ( ( rule__Page__Group_3__0 )? )
            // InternalT2A.g:736:2: ( rule__Page__Group_3__0 )?
            {
             before(grammarAccess.getPageAccess().getGroup_3()); 
            // InternalT2A.g:737:2: ( rule__Page__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalT2A.g:737:3: rule__Page__Group_3__0
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
    // InternalT2A.g:745:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:749:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // InternalT2A.g:750:2: rule__Page__Group__4__Impl rule__Page__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalT2A.g:757:1: rule__Page__Group__4__Impl : ( ( rule__Page__HomeAssignment_4 )? ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:761:1: ( ( ( rule__Page__HomeAssignment_4 )? ) )
            // InternalT2A.g:762:1: ( ( rule__Page__HomeAssignment_4 )? )
            {
            // InternalT2A.g:762:1: ( ( rule__Page__HomeAssignment_4 )? )
            // InternalT2A.g:763:2: ( rule__Page__HomeAssignment_4 )?
            {
             before(grammarAccess.getPageAccess().getHomeAssignment_4()); 
            // InternalT2A.g:764:2: ( rule__Page__HomeAssignment_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalT2A.g:764:3: rule__Page__HomeAssignment_4
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
    // InternalT2A.g:772:1: rule__Page__Group__5 : rule__Page__Group__5__Impl rule__Page__Group__6 ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:776:1: ( rule__Page__Group__5__Impl rule__Page__Group__6 )
            // InternalT2A.g:777:2: rule__Page__Group__5__Impl rule__Page__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalT2A.g:784:1: rule__Page__Group__5__Impl : ( ( rule__Page__ShowInNavAssignment_5 )? ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:788:1: ( ( ( rule__Page__ShowInNavAssignment_5 )? ) )
            // InternalT2A.g:789:1: ( ( rule__Page__ShowInNavAssignment_5 )? )
            {
            // InternalT2A.g:789:1: ( ( rule__Page__ShowInNavAssignment_5 )? )
            // InternalT2A.g:790:2: ( rule__Page__ShowInNavAssignment_5 )?
            {
             before(grammarAccess.getPageAccess().getShowInNavAssignment_5()); 
            // InternalT2A.g:791:2: ( rule__Page__ShowInNavAssignment_5 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalT2A.g:791:3: rule__Page__ShowInNavAssignment_5
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
    // InternalT2A.g:799:1: rule__Page__Group__6 : rule__Page__Group__6__Impl rule__Page__Group__7 ;
    public final void rule__Page__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:803:1: ( rule__Page__Group__6__Impl rule__Page__Group__7 )
            // InternalT2A.g:804:2: rule__Page__Group__6__Impl rule__Page__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalT2A.g:811:1: rule__Page__Group__6__Impl : ( ( rule__Page__PageFeaturesAssignment_6 )* ) ;
    public final void rule__Page__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:815:1: ( ( ( rule__Page__PageFeaturesAssignment_6 )* ) )
            // InternalT2A.g:816:1: ( ( rule__Page__PageFeaturesAssignment_6 )* )
            {
            // InternalT2A.g:816:1: ( ( rule__Page__PageFeaturesAssignment_6 )* )
            // InternalT2A.g:817:2: ( rule__Page__PageFeaturesAssignment_6 )*
            {
             before(grammarAccess.getPageAccess().getPageFeaturesAssignment_6()); 
            // InternalT2A.g:818:2: ( rule__Page__PageFeaturesAssignment_6 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==RULE_STRING) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalT2A.g:818:3: rule__Page__PageFeaturesAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
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
    // InternalT2A.g:826:1: rule__Page__Group__7 : rule__Page__Group__7__Impl ;
    public final void rule__Page__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:830:1: ( rule__Page__Group__7__Impl )
            // InternalT2A.g:831:2: rule__Page__Group__7__Impl
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
    // InternalT2A.g:837:1: rule__Page__Group__7__Impl : ( '}' ) ;
    public final void rule__Page__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:841:1: ( ( '}' ) )
            // InternalT2A.g:842:1: ( '}' )
            {
            // InternalT2A.g:842:1: ( '}' )
            // InternalT2A.g:843:2: '}'
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
    // InternalT2A.g:853:1: rule__Page__Group_3__0 : rule__Page__Group_3__0__Impl rule__Page__Group_3__1 ;
    public final void rule__Page__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:857:1: ( rule__Page__Group_3__0__Impl rule__Page__Group_3__1 )
            // InternalT2A.g:858:2: rule__Page__Group_3__0__Impl rule__Page__Group_3__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalT2A.g:865:1: rule__Page__Group_3__0__Impl : ( 'sclass' ) ;
    public final void rule__Page__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:869:1: ( ( 'sclass' ) )
            // InternalT2A.g:870:1: ( 'sclass' )
            {
            // InternalT2A.g:870:1: ( 'sclass' )
            // InternalT2A.g:871:2: 'sclass'
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
    // InternalT2A.g:880:1: rule__Page__Group_3__1 : rule__Page__Group_3__1__Impl rule__Page__Group_3__2 ;
    public final void rule__Page__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:884:1: ( rule__Page__Group_3__1__Impl rule__Page__Group_3__2 )
            // InternalT2A.g:885:2: rule__Page__Group_3__1__Impl rule__Page__Group_3__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalT2A.g:892:1: rule__Page__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Page__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:896:1: ( ( '{' ) )
            // InternalT2A.g:897:1: ( '{' )
            {
            // InternalT2A.g:897:1: ( '{' )
            // InternalT2A.g:898:2: '{'
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
    // InternalT2A.g:907:1: rule__Page__Group_3__2 : rule__Page__Group_3__2__Impl rule__Page__Group_3__3 ;
    public final void rule__Page__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:911:1: ( rule__Page__Group_3__2__Impl rule__Page__Group_3__3 )
            // InternalT2A.g:912:2: rule__Page__Group_3__2__Impl rule__Page__Group_3__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalT2A.g:919:1: rule__Page__Group_3__2__Impl : ( ( rule__Page__HostclassesAssignment_3_2 )* ) ;
    public final void rule__Page__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:923:1: ( ( ( rule__Page__HostclassesAssignment_3_2 )* ) )
            // InternalT2A.g:924:1: ( ( rule__Page__HostclassesAssignment_3_2 )* )
            {
            // InternalT2A.g:924:1: ( ( rule__Page__HostclassesAssignment_3_2 )* )
            // InternalT2A.g:925:2: ( rule__Page__HostclassesAssignment_3_2 )*
            {
             before(grammarAccess.getPageAccess().getHostclassesAssignment_3_2()); 
            // InternalT2A.g:926:2: ( rule__Page__HostclassesAssignment_3_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalT2A.g:926:3: rule__Page__HostclassesAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_11);
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
    // InternalT2A.g:934:1: rule__Page__Group_3__3 : rule__Page__Group_3__3__Impl ;
    public final void rule__Page__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:938:1: ( rule__Page__Group_3__3__Impl )
            // InternalT2A.g:939:2: rule__Page__Group_3__3__Impl
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
    // InternalT2A.g:945:1: rule__Page__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Page__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:949:1: ( ( '}' ) )
            // InternalT2A.g:950:1: ( '}' )
            {
            // InternalT2A.g:950:1: ( '}' )
            // InternalT2A.g:951:2: '}'
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


    // $ANTLR start "rule__StyleGlobal__Group__0"
    // InternalT2A.g:961:1: rule__StyleGlobal__Group__0 : rule__StyleGlobal__Group__0__Impl rule__StyleGlobal__Group__1 ;
    public final void rule__StyleGlobal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:965:1: ( rule__StyleGlobal__Group__0__Impl rule__StyleGlobal__Group__1 )
            // InternalT2A.g:966:2: rule__StyleGlobal__Group__0__Impl rule__StyleGlobal__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__StyleGlobal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleGlobal__Group__1();

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
    // $ANTLR end "rule__StyleGlobal__Group__0"


    // $ANTLR start "rule__StyleGlobal__Group__0__Impl"
    // InternalT2A.g:973:1: rule__StyleGlobal__Group__0__Impl : ( () ) ;
    public final void rule__StyleGlobal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:977:1: ( ( () ) )
            // InternalT2A.g:978:1: ( () )
            {
            // InternalT2A.g:978:1: ( () )
            // InternalT2A.g:979:2: ()
            {
             before(grammarAccess.getStyleGlobalAccess().getStyleGlobalAction_0()); 
            // InternalT2A.g:980:2: ()
            // InternalT2A.g:980:3: 
            {
            }

             after(grammarAccess.getStyleGlobalAccess().getStyleGlobalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleGlobal__Group__0__Impl"


    // $ANTLR start "rule__StyleGlobal__Group__1"
    // InternalT2A.g:988:1: rule__StyleGlobal__Group__1 : rule__StyleGlobal__Group__1__Impl rule__StyleGlobal__Group__2 ;
    public final void rule__StyleGlobal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:992:1: ( rule__StyleGlobal__Group__1__Impl rule__StyleGlobal__Group__2 )
            // InternalT2A.g:993:2: rule__StyleGlobal__Group__1__Impl rule__StyleGlobal__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__StyleGlobal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleGlobal__Group__2();

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
    // $ANTLR end "rule__StyleGlobal__Group__1"


    // $ANTLR start "rule__StyleGlobal__Group__1__Impl"
    // InternalT2A.g:1000:1: rule__StyleGlobal__Group__1__Impl : ( 'StyleGlobal' ) ;
    public final void rule__StyleGlobal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1004:1: ( ( 'StyleGlobal' ) )
            // InternalT2A.g:1005:1: ( 'StyleGlobal' )
            {
            // InternalT2A.g:1005:1: ( 'StyleGlobal' )
            // InternalT2A.g:1006:2: 'StyleGlobal'
            {
             before(grammarAccess.getStyleGlobalAccess().getStyleGlobalKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStyleGlobalAccess().getStyleGlobalKeyword_1()); 

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
    // $ANTLR end "rule__StyleGlobal__Group__1__Impl"


    // $ANTLR start "rule__StyleGlobal__Group__2"
    // InternalT2A.g:1015:1: rule__StyleGlobal__Group__2 : rule__StyleGlobal__Group__2__Impl rule__StyleGlobal__Group__3 ;
    public final void rule__StyleGlobal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1019:1: ( rule__StyleGlobal__Group__2__Impl rule__StyleGlobal__Group__3 )
            // InternalT2A.g:1020:2: rule__StyleGlobal__Group__2__Impl rule__StyleGlobal__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__StyleGlobal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleGlobal__Group__3();

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
    // $ANTLR end "rule__StyleGlobal__Group__2"


    // $ANTLR start "rule__StyleGlobal__Group__2__Impl"
    // InternalT2A.g:1027:1: rule__StyleGlobal__Group__2__Impl : ( '{' ) ;
    public final void rule__StyleGlobal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1031:1: ( ( '{' ) )
            // InternalT2A.g:1032:1: ( '{' )
            {
            // InternalT2A.g:1032:1: ( '{' )
            // InternalT2A.g:1033:2: '{'
            {
             before(grammarAccess.getStyleGlobalAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStyleGlobalAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__StyleGlobal__Group__2__Impl"


    // $ANTLR start "rule__StyleGlobal__Group__3"
    // InternalT2A.g:1042:1: rule__StyleGlobal__Group__3 : rule__StyleGlobal__Group__3__Impl rule__StyleGlobal__Group__4 ;
    public final void rule__StyleGlobal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1046:1: ( rule__StyleGlobal__Group__3__Impl rule__StyleGlobal__Group__4 )
            // InternalT2A.g:1047:2: rule__StyleGlobal__Group__3__Impl rule__StyleGlobal__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__StyleGlobal__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleGlobal__Group__4();

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
    // $ANTLR end "rule__StyleGlobal__Group__3"


    // $ANTLR start "rule__StyleGlobal__Group__3__Impl"
    // InternalT2A.g:1054:1: rule__StyleGlobal__Group__3__Impl : ( ( rule__StyleGlobal__StyleclassesAssignment_3 )* ) ;
    public final void rule__StyleGlobal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1058:1: ( ( ( rule__StyleGlobal__StyleclassesAssignment_3 )* ) )
            // InternalT2A.g:1059:1: ( ( rule__StyleGlobal__StyleclassesAssignment_3 )* )
            {
            // InternalT2A.g:1059:1: ( ( rule__StyleGlobal__StyleclassesAssignment_3 )* )
            // InternalT2A.g:1060:2: ( rule__StyleGlobal__StyleclassesAssignment_3 )*
            {
             before(grammarAccess.getStyleGlobalAccess().getStyleclassesAssignment_3()); 
            // InternalT2A.g:1061:2: ( rule__StyleGlobal__StyleclassesAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalT2A.g:1061:3: rule__StyleGlobal__StyleclassesAssignment_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__StyleGlobal__StyleclassesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getStyleGlobalAccess().getStyleclassesAssignment_3()); 

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
    // $ANTLR end "rule__StyleGlobal__Group__3__Impl"


    // $ANTLR start "rule__StyleGlobal__Group__4"
    // InternalT2A.g:1069:1: rule__StyleGlobal__Group__4 : rule__StyleGlobal__Group__4__Impl ;
    public final void rule__StyleGlobal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1073:1: ( rule__StyleGlobal__Group__4__Impl )
            // InternalT2A.g:1074:2: rule__StyleGlobal__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StyleGlobal__Group__4__Impl();

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
    // $ANTLR end "rule__StyleGlobal__Group__4"


    // $ANTLR start "rule__StyleGlobal__Group__4__Impl"
    // InternalT2A.g:1080:1: rule__StyleGlobal__Group__4__Impl : ( '}' ) ;
    public final void rule__StyleGlobal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1084:1: ( ( '}' ) )
            // InternalT2A.g:1085:1: ( '}' )
            {
            // InternalT2A.g:1085:1: ( '}' )
            // InternalT2A.g:1086:2: '}'
            {
             before(grammarAccess.getStyleGlobalAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStyleGlobalAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__StyleGlobal__Group__4__Impl"


    // $ANTLR start "rule__StyleClass__Group__0"
    // InternalT2A.g:1096:1: rule__StyleClass__Group__0 : rule__StyleClass__Group__0__Impl rule__StyleClass__Group__1 ;
    public final void rule__StyleClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1100:1: ( rule__StyleClass__Group__0__Impl rule__StyleClass__Group__1 )
            // InternalT2A.g:1101:2: rule__StyleClass__Group__0__Impl rule__StyleClass__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalT2A.g:1108:1: rule__StyleClass__Group__0__Impl : ( 'StyleClass' ) ;
    public final void rule__StyleClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1112:1: ( ( 'StyleClass' ) )
            // InternalT2A.g:1113:1: ( 'StyleClass' )
            {
            // InternalT2A.g:1113:1: ( 'StyleClass' )
            // InternalT2A.g:1114:2: 'StyleClass'
            {
             before(grammarAccess.getStyleClassAccess().getStyleClassKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalT2A.g:1123:1: rule__StyleClass__Group__1 : rule__StyleClass__Group__1__Impl rule__StyleClass__Group__2 ;
    public final void rule__StyleClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1127:1: ( rule__StyleClass__Group__1__Impl rule__StyleClass__Group__2 )
            // InternalT2A.g:1128:2: rule__StyleClass__Group__1__Impl rule__StyleClass__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalT2A.g:1135:1: rule__StyleClass__Group__1__Impl : ( ( rule__StyleClass__NameAssignment_1 ) ) ;
    public final void rule__StyleClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1139:1: ( ( ( rule__StyleClass__NameAssignment_1 ) ) )
            // InternalT2A.g:1140:1: ( ( rule__StyleClass__NameAssignment_1 ) )
            {
            // InternalT2A.g:1140:1: ( ( rule__StyleClass__NameAssignment_1 ) )
            // InternalT2A.g:1141:2: ( rule__StyleClass__NameAssignment_1 )
            {
             before(grammarAccess.getStyleClassAccess().getNameAssignment_1()); 
            // InternalT2A.g:1142:2: ( rule__StyleClass__NameAssignment_1 )
            // InternalT2A.g:1142:3: rule__StyleClass__NameAssignment_1
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
    // InternalT2A.g:1150:1: rule__StyleClass__Group__2 : rule__StyleClass__Group__2__Impl rule__StyleClass__Group__3 ;
    public final void rule__StyleClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1154:1: ( rule__StyleClass__Group__2__Impl rule__StyleClass__Group__3 )
            // InternalT2A.g:1155:2: rule__StyleClass__Group__2__Impl rule__StyleClass__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalT2A.g:1162:1: rule__StyleClass__Group__2__Impl : ( '{' ) ;
    public final void rule__StyleClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1166:1: ( ( '{' ) )
            // InternalT2A.g:1167:1: ( '{' )
            {
            // InternalT2A.g:1167:1: ( '{' )
            // InternalT2A.g:1168:2: '{'
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
    // InternalT2A.g:1177:1: rule__StyleClass__Group__3 : rule__StyleClass__Group__3__Impl rule__StyleClass__Group__4 ;
    public final void rule__StyleClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1181:1: ( rule__StyleClass__Group__3__Impl rule__StyleClass__Group__4 )
            // InternalT2A.g:1182:2: rule__StyleClass__Group__3__Impl rule__StyleClass__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalT2A.g:1189:1: rule__StyleClass__Group__3__Impl : ( ( rule__StyleClass__Group_3__0 )* ) ;
    public final void rule__StyleClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1193:1: ( ( ( rule__StyleClass__Group_3__0 )* ) )
            // InternalT2A.g:1194:1: ( ( rule__StyleClass__Group_3__0 )* )
            {
            // InternalT2A.g:1194:1: ( ( rule__StyleClass__Group_3__0 )* )
            // InternalT2A.g:1195:2: ( rule__StyleClass__Group_3__0 )*
            {
             before(grammarAccess.getStyleClassAccess().getGroup_3()); 
            // InternalT2A.g:1196:2: ( rule__StyleClass__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==EOF||(LA15_0>=RULE_ID && LA15_0<=RULE_STRING2)||(LA15_0>=12 && LA15_0<=18)||LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalT2A.g:1196:3: rule__StyleClass__Group_3__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__StyleClass__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalT2A.g:1204:1: rule__StyleClass__Group__4 : rule__StyleClass__Group__4__Impl rule__StyleClass__Group__5 ;
    public final void rule__StyleClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1208:1: ( rule__StyleClass__Group__4__Impl rule__StyleClass__Group__5 )
            // InternalT2A.g:1209:2: rule__StyleClass__Group__4__Impl rule__StyleClass__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalT2A.g:1216:1: rule__StyleClass__Group__4__Impl : ( ( rule__StyleClass__Group_4__0 )? ) ;
    public final void rule__StyleClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1220:1: ( ( ( rule__StyleClass__Group_4__0 )? ) )
            // InternalT2A.g:1221:1: ( ( rule__StyleClass__Group_4__0 )? )
            {
            // InternalT2A.g:1221:1: ( ( rule__StyleClass__Group_4__0 )? )
            // InternalT2A.g:1222:2: ( rule__StyleClass__Group_4__0 )?
            {
             before(grammarAccess.getStyleClassAccess().getGroup_4()); 
            // InternalT2A.g:1223:2: ( rule__StyleClass__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalT2A.g:1223:3: rule__StyleClass__Group_4__0
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
    // InternalT2A.g:1231:1: rule__StyleClass__Group__5 : rule__StyleClass__Group__5__Impl rule__StyleClass__Group__6 ;
    public final void rule__StyleClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1235:1: ( rule__StyleClass__Group__5__Impl rule__StyleClass__Group__6 )
            // InternalT2A.g:1236:2: rule__StyleClass__Group__5__Impl rule__StyleClass__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalT2A.g:1243:1: rule__StyleClass__Group__5__Impl : ( ( rule__StyleClass__Group_5__0 )? ) ;
    public final void rule__StyleClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1247:1: ( ( ( rule__StyleClass__Group_5__0 )? ) )
            // InternalT2A.g:1248:1: ( ( rule__StyleClass__Group_5__0 )? )
            {
            // InternalT2A.g:1248:1: ( ( rule__StyleClass__Group_5__0 )? )
            // InternalT2A.g:1249:2: ( rule__StyleClass__Group_5__0 )?
            {
             before(grammarAccess.getStyleClassAccess().getGroup_5()); 
            // InternalT2A.g:1250:2: ( rule__StyleClass__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalT2A.g:1250:3: rule__StyleClass__Group_5__0
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
    // InternalT2A.g:1258:1: rule__StyleClass__Group__6 : rule__StyleClass__Group__6__Impl ;
    public final void rule__StyleClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1262:1: ( rule__StyleClass__Group__6__Impl )
            // InternalT2A.g:1263:2: rule__StyleClass__Group__6__Impl
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
    // InternalT2A.g:1269:1: rule__StyleClass__Group__6__Impl : ( '}' ) ;
    public final void rule__StyleClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1273:1: ( ( '}' ) )
            // InternalT2A.g:1274:1: ( '}' )
            {
            // InternalT2A.g:1274:1: ( '}' )
            // InternalT2A.g:1275:2: '}'
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
    // InternalT2A.g:1285:1: rule__StyleClass__Group_3__0 : rule__StyleClass__Group_3__0__Impl rule__StyleClass__Group_3__1 ;
    public final void rule__StyleClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1289:1: ( rule__StyleClass__Group_3__0__Impl rule__StyleClass__Group_3__1 )
            // InternalT2A.g:1290:2: rule__StyleClass__Group_3__0__Impl rule__StyleClass__Group_3__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalT2A.g:1297:1: rule__StyleClass__Group_3__0__Impl : ( ( rule__StyleClass__SattributesAssignment_3_0 ) ) ;
    public final void rule__StyleClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1301:1: ( ( ( rule__StyleClass__SattributesAssignment_3_0 ) ) )
            // InternalT2A.g:1302:1: ( ( rule__StyleClass__SattributesAssignment_3_0 ) )
            {
            // InternalT2A.g:1302:1: ( ( rule__StyleClass__SattributesAssignment_3_0 ) )
            // InternalT2A.g:1303:2: ( rule__StyleClass__SattributesAssignment_3_0 )
            {
             before(grammarAccess.getStyleClassAccess().getSattributesAssignment_3_0()); 
            // InternalT2A.g:1304:2: ( rule__StyleClass__SattributesAssignment_3_0 )
            // InternalT2A.g:1304:3: rule__StyleClass__SattributesAssignment_3_0
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
    // InternalT2A.g:1312:1: rule__StyleClass__Group_3__1 : rule__StyleClass__Group_3__1__Impl ;
    public final void rule__StyleClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1316:1: ( rule__StyleClass__Group_3__1__Impl )
            // InternalT2A.g:1317:2: rule__StyleClass__Group_3__1__Impl
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
    // InternalT2A.g:1323:1: rule__StyleClass__Group_3__1__Impl : ( ';' ) ;
    public final void rule__StyleClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1327:1: ( ( ';' ) )
            // InternalT2A.g:1328:1: ( ';' )
            {
            // InternalT2A.g:1328:1: ( ';' )
            // InternalT2A.g:1329:2: ';'
            {
             before(grammarAccess.getStyleClassAccess().getSemicolonKeyword_3_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalT2A.g:1339:1: rule__StyleClass__Group_4__0 : rule__StyleClass__Group_4__0__Impl rule__StyleClass__Group_4__1 ;
    public final void rule__StyleClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1343:1: ( rule__StyleClass__Group_4__0__Impl rule__StyleClass__Group_4__1 )
            // InternalT2A.g:1344:2: rule__StyleClass__Group_4__0__Impl rule__StyleClass__Group_4__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalT2A.g:1351:1: rule__StyleClass__Group_4__0__Impl : ( 'after' ) ;
    public final void rule__StyleClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1355:1: ( ( 'after' ) )
            // InternalT2A.g:1356:1: ( 'after' )
            {
            // InternalT2A.g:1356:1: ( 'after' )
            // InternalT2A.g:1357:2: 'after'
            {
             before(grammarAccess.getStyleClassAccess().getAfterKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalT2A.g:1366:1: rule__StyleClass__Group_4__1 : rule__StyleClass__Group_4__1__Impl rule__StyleClass__Group_4__2 ;
    public final void rule__StyleClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1370:1: ( rule__StyleClass__Group_4__1__Impl rule__StyleClass__Group_4__2 )
            // InternalT2A.g:1371:2: rule__StyleClass__Group_4__1__Impl rule__StyleClass__Group_4__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalT2A.g:1378:1: rule__StyleClass__Group_4__1__Impl : ( '{' ) ;
    public final void rule__StyleClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1382:1: ( ( '{' ) )
            // InternalT2A.g:1383:1: ( '{' )
            {
            // InternalT2A.g:1383:1: ( '{' )
            // InternalT2A.g:1384:2: '{'
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
    // InternalT2A.g:1393:1: rule__StyleClass__Group_4__2 : rule__StyleClass__Group_4__2__Impl rule__StyleClass__Group_4__3 ;
    public final void rule__StyleClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1397:1: ( rule__StyleClass__Group_4__2__Impl rule__StyleClass__Group_4__3 )
            // InternalT2A.g:1398:2: rule__StyleClass__Group_4__2__Impl rule__StyleClass__Group_4__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalT2A.g:1405:1: rule__StyleClass__Group_4__2__Impl : ( ( rule__StyleClass__Group_4_2__0 )* ) ;
    public final void rule__StyleClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1409:1: ( ( ( rule__StyleClass__Group_4_2__0 )* ) )
            // InternalT2A.g:1410:1: ( ( rule__StyleClass__Group_4_2__0 )* )
            {
            // InternalT2A.g:1410:1: ( ( rule__StyleClass__Group_4_2__0 )* )
            // InternalT2A.g:1411:2: ( rule__StyleClass__Group_4_2__0 )*
            {
             before(grammarAccess.getStyleClassAccess().getGroup_4_2()); 
            // InternalT2A.g:1412:2: ( rule__StyleClass__Group_4_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==EOF||(LA18_0>=RULE_ID && LA18_0<=RULE_STRING2)||(LA18_0>=12 && LA18_0<=18)||LA18_0==20) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalT2A.g:1412:3: rule__StyleClass__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__StyleClass__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalT2A.g:1420:1: rule__StyleClass__Group_4__3 : rule__StyleClass__Group_4__3__Impl ;
    public final void rule__StyleClass__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1424:1: ( rule__StyleClass__Group_4__3__Impl )
            // InternalT2A.g:1425:2: rule__StyleClass__Group_4__3__Impl
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
    // InternalT2A.g:1431:1: rule__StyleClass__Group_4__3__Impl : ( '}' ) ;
    public final void rule__StyleClass__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1435:1: ( ( '}' ) )
            // InternalT2A.g:1436:1: ( '}' )
            {
            // InternalT2A.g:1436:1: ( '}' )
            // InternalT2A.g:1437:2: '}'
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
    // InternalT2A.g:1447:1: rule__StyleClass__Group_4_2__0 : rule__StyleClass__Group_4_2__0__Impl rule__StyleClass__Group_4_2__1 ;
    public final void rule__StyleClass__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1451:1: ( rule__StyleClass__Group_4_2__0__Impl rule__StyleClass__Group_4_2__1 )
            // InternalT2A.g:1452:2: rule__StyleClass__Group_4_2__0__Impl rule__StyleClass__Group_4_2__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalT2A.g:1459:1: rule__StyleClass__Group_4_2__0__Impl : ( ( rule__StyleClass__SattributesAfterAssignment_4_2_0 ) ) ;
    public final void rule__StyleClass__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1463:1: ( ( ( rule__StyleClass__SattributesAfterAssignment_4_2_0 ) ) )
            // InternalT2A.g:1464:1: ( ( rule__StyleClass__SattributesAfterAssignment_4_2_0 ) )
            {
            // InternalT2A.g:1464:1: ( ( rule__StyleClass__SattributesAfterAssignment_4_2_0 ) )
            // InternalT2A.g:1465:2: ( rule__StyleClass__SattributesAfterAssignment_4_2_0 )
            {
             before(grammarAccess.getStyleClassAccess().getSattributesAfterAssignment_4_2_0()); 
            // InternalT2A.g:1466:2: ( rule__StyleClass__SattributesAfterAssignment_4_2_0 )
            // InternalT2A.g:1466:3: rule__StyleClass__SattributesAfterAssignment_4_2_0
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
    // InternalT2A.g:1474:1: rule__StyleClass__Group_4_2__1 : rule__StyleClass__Group_4_2__1__Impl ;
    public final void rule__StyleClass__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1478:1: ( rule__StyleClass__Group_4_2__1__Impl )
            // InternalT2A.g:1479:2: rule__StyleClass__Group_4_2__1__Impl
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
    // InternalT2A.g:1485:1: rule__StyleClass__Group_4_2__1__Impl : ( ';' ) ;
    public final void rule__StyleClass__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1489:1: ( ( ';' ) )
            // InternalT2A.g:1490:1: ( ';' )
            {
            // InternalT2A.g:1490:1: ( ';' )
            // InternalT2A.g:1491:2: ';'
            {
             before(grammarAccess.getStyleClassAccess().getSemicolonKeyword_4_2_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalT2A.g:1501:1: rule__StyleClass__Group_5__0 : rule__StyleClass__Group_5__0__Impl rule__StyleClass__Group_5__1 ;
    public final void rule__StyleClass__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1505:1: ( rule__StyleClass__Group_5__0__Impl rule__StyleClass__Group_5__1 )
            // InternalT2A.g:1506:2: rule__StyleClass__Group_5__0__Impl rule__StyleClass__Group_5__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalT2A.g:1513:1: rule__StyleClass__Group_5__0__Impl : ( 'active' ) ;
    public final void rule__StyleClass__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1517:1: ( ( 'active' ) )
            // InternalT2A.g:1518:1: ( 'active' )
            {
            // InternalT2A.g:1518:1: ( 'active' )
            // InternalT2A.g:1519:2: 'active'
            {
             before(grammarAccess.getStyleClassAccess().getActiveKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalT2A.g:1528:1: rule__StyleClass__Group_5__1 : rule__StyleClass__Group_5__1__Impl rule__StyleClass__Group_5__2 ;
    public final void rule__StyleClass__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1532:1: ( rule__StyleClass__Group_5__1__Impl rule__StyleClass__Group_5__2 )
            // InternalT2A.g:1533:2: rule__StyleClass__Group_5__1__Impl rule__StyleClass__Group_5__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalT2A.g:1540:1: rule__StyleClass__Group_5__1__Impl : ( '{' ) ;
    public final void rule__StyleClass__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1544:1: ( ( '{' ) )
            // InternalT2A.g:1545:1: ( '{' )
            {
            // InternalT2A.g:1545:1: ( '{' )
            // InternalT2A.g:1546:2: '{'
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
    // InternalT2A.g:1555:1: rule__StyleClass__Group_5__2 : rule__StyleClass__Group_5__2__Impl rule__StyleClass__Group_5__3 ;
    public final void rule__StyleClass__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1559:1: ( rule__StyleClass__Group_5__2__Impl rule__StyleClass__Group_5__3 )
            // InternalT2A.g:1560:2: rule__StyleClass__Group_5__2__Impl rule__StyleClass__Group_5__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalT2A.g:1567:1: rule__StyleClass__Group_5__2__Impl : ( ( rule__StyleClass__Group_5_2__0 )* ) ;
    public final void rule__StyleClass__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1571:1: ( ( ( rule__StyleClass__Group_5_2__0 )* ) )
            // InternalT2A.g:1572:1: ( ( rule__StyleClass__Group_5_2__0 )* )
            {
            // InternalT2A.g:1572:1: ( ( rule__StyleClass__Group_5_2__0 )* )
            // InternalT2A.g:1573:2: ( rule__StyleClass__Group_5_2__0 )*
            {
             before(grammarAccess.getStyleClassAccess().getGroup_5_2()); 
            // InternalT2A.g:1574:2: ( rule__StyleClass__Group_5_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==EOF||(LA19_0>=RULE_ID && LA19_0<=RULE_STRING2)||(LA19_0>=12 && LA19_0<=18)||LA19_0==20) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalT2A.g:1574:3: rule__StyleClass__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__StyleClass__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalT2A.g:1582:1: rule__StyleClass__Group_5__3 : rule__StyleClass__Group_5__3__Impl ;
    public final void rule__StyleClass__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1586:1: ( rule__StyleClass__Group_5__3__Impl )
            // InternalT2A.g:1587:2: rule__StyleClass__Group_5__3__Impl
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
    // InternalT2A.g:1593:1: rule__StyleClass__Group_5__3__Impl : ( '}' ) ;
    public final void rule__StyleClass__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1597:1: ( ( '}' ) )
            // InternalT2A.g:1598:1: ( '}' )
            {
            // InternalT2A.g:1598:1: ( '}' )
            // InternalT2A.g:1599:2: '}'
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
    // InternalT2A.g:1609:1: rule__StyleClass__Group_5_2__0 : rule__StyleClass__Group_5_2__0__Impl rule__StyleClass__Group_5_2__1 ;
    public final void rule__StyleClass__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1613:1: ( rule__StyleClass__Group_5_2__0__Impl rule__StyleClass__Group_5_2__1 )
            // InternalT2A.g:1614:2: rule__StyleClass__Group_5_2__0__Impl rule__StyleClass__Group_5_2__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalT2A.g:1621:1: rule__StyleClass__Group_5_2__0__Impl : ( ( rule__StyleClass__SattributesActiveAssignment_5_2_0 ) ) ;
    public final void rule__StyleClass__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1625:1: ( ( ( rule__StyleClass__SattributesActiveAssignment_5_2_0 ) ) )
            // InternalT2A.g:1626:1: ( ( rule__StyleClass__SattributesActiveAssignment_5_2_0 ) )
            {
            // InternalT2A.g:1626:1: ( ( rule__StyleClass__SattributesActiveAssignment_5_2_0 ) )
            // InternalT2A.g:1627:2: ( rule__StyleClass__SattributesActiveAssignment_5_2_0 )
            {
             before(grammarAccess.getStyleClassAccess().getSattributesActiveAssignment_5_2_0()); 
            // InternalT2A.g:1628:2: ( rule__StyleClass__SattributesActiveAssignment_5_2_0 )
            // InternalT2A.g:1628:3: rule__StyleClass__SattributesActiveAssignment_5_2_0
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
    // InternalT2A.g:1636:1: rule__StyleClass__Group_5_2__1 : rule__StyleClass__Group_5_2__1__Impl ;
    public final void rule__StyleClass__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1640:1: ( rule__StyleClass__Group_5_2__1__Impl )
            // InternalT2A.g:1641:2: rule__StyleClass__Group_5_2__1__Impl
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
    // InternalT2A.g:1647:1: rule__StyleClass__Group_5_2__1__Impl : ( ';' ) ;
    public final void rule__StyleClass__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1651:1: ( ( ';' ) )
            // InternalT2A.g:1652:1: ( ';' )
            {
            // InternalT2A.g:1652:1: ( ';' )
            // InternalT2A.g:1653:2: ';'
            {
             before(grammarAccess.getStyleClassAccess().getSemicolonKeyword_5_2_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalT2A.g:1663:1: rule__SAttributeAndValue__Group__0 : rule__SAttributeAndValue__Group__0__Impl rule__SAttributeAndValue__Group__1 ;
    public final void rule__SAttributeAndValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1667:1: ( rule__SAttributeAndValue__Group__0__Impl rule__SAttributeAndValue__Group__1 )
            // InternalT2A.g:1668:2: rule__SAttributeAndValue__Group__0__Impl rule__SAttributeAndValue__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalT2A.g:1675:1: rule__SAttributeAndValue__Group__0__Impl : ( ( rule__SAttributeAndValue__StnameAssignment_0 ) ) ;
    public final void rule__SAttributeAndValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1679:1: ( ( ( rule__SAttributeAndValue__StnameAssignment_0 ) ) )
            // InternalT2A.g:1680:1: ( ( rule__SAttributeAndValue__StnameAssignment_0 ) )
            {
            // InternalT2A.g:1680:1: ( ( rule__SAttributeAndValue__StnameAssignment_0 ) )
            // InternalT2A.g:1681:2: ( rule__SAttributeAndValue__StnameAssignment_0 )
            {
             before(grammarAccess.getSAttributeAndValueAccess().getStnameAssignment_0()); 
            // InternalT2A.g:1682:2: ( rule__SAttributeAndValue__StnameAssignment_0 )
            // InternalT2A.g:1682:3: rule__SAttributeAndValue__StnameAssignment_0
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
    // InternalT2A.g:1690:1: rule__SAttributeAndValue__Group__1 : rule__SAttributeAndValue__Group__1__Impl ;
    public final void rule__SAttributeAndValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1694:1: ( rule__SAttributeAndValue__Group__1__Impl )
            // InternalT2A.g:1695:2: rule__SAttributeAndValue__Group__1__Impl
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
    // InternalT2A.g:1701:1: rule__SAttributeAndValue__Group__1__Impl : ( ( rule__SAttributeAndValue__ValueAssignment_1 ) ) ;
    public final void rule__SAttributeAndValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1705:1: ( ( ( rule__SAttributeAndValue__ValueAssignment_1 ) ) )
            // InternalT2A.g:1706:1: ( ( rule__SAttributeAndValue__ValueAssignment_1 ) )
            {
            // InternalT2A.g:1706:1: ( ( rule__SAttributeAndValue__ValueAssignment_1 ) )
            // InternalT2A.g:1707:2: ( rule__SAttributeAndValue__ValueAssignment_1 )
            {
             before(grammarAccess.getSAttributeAndValueAccess().getValueAssignment_1()); 
            // InternalT2A.g:1708:2: ( rule__SAttributeAndValue__ValueAssignment_1 )
            // InternalT2A.g:1708:3: rule__SAttributeAndValue__ValueAssignment_1
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
    // InternalT2A.g:1717:1: rule__DOM__Group__0 : rule__DOM__Group__0__Impl rule__DOM__Group__1 ;
    public final void rule__DOM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1721:1: ( rule__DOM__Group__0__Impl rule__DOM__Group__1 )
            // InternalT2A.g:1722:2: rule__DOM__Group__0__Impl rule__DOM__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalT2A.g:1729:1: rule__DOM__Group__0__Impl : ( 'Dom' ) ;
    public final void rule__DOM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1733:1: ( ( 'Dom' ) )
            // InternalT2A.g:1734:1: ( 'Dom' )
            {
            // InternalT2A.g:1734:1: ( 'Dom' )
            // InternalT2A.g:1735:2: 'Dom'
            {
             before(grammarAccess.getDOMAccess().getDomKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalT2A.g:1744:1: rule__DOM__Group__1 : rule__DOM__Group__1__Impl rule__DOM__Group__2 ;
    public final void rule__DOM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1748:1: ( rule__DOM__Group__1__Impl rule__DOM__Group__2 )
            // InternalT2A.g:1749:2: rule__DOM__Group__1__Impl rule__DOM__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalT2A.g:1756:1: rule__DOM__Group__1__Impl : ( ( rule__DOM__NameAssignment_1 ) ) ;
    public final void rule__DOM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1760:1: ( ( ( rule__DOM__NameAssignment_1 ) ) )
            // InternalT2A.g:1761:1: ( ( rule__DOM__NameAssignment_1 ) )
            {
            // InternalT2A.g:1761:1: ( ( rule__DOM__NameAssignment_1 ) )
            // InternalT2A.g:1762:2: ( rule__DOM__NameAssignment_1 )
            {
             before(grammarAccess.getDOMAccess().getNameAssignment_1()); 
            // InternalT2A.g:1763:2: ( rule__DOM__NameAssignment_1 )
            // InternalT2A.g:1763:3: rule__DOM__NameAssignment_1
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
    // InternalT2A.g:1771:1: rule__DOM__Group__2 : rule__DOM__Group__2__Impl ;
    public final void rule__DOM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1775:1: ( rule__DOM__Group__2__Impl )
            // InternalT2A.g:1776:2: rule__DOM__Group__2__Impl
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
    // InternalT2A.g:1782:1: rule__DOM__Group__2__Impl : ( ( rule__DOM__Group_2__0 )? ) ;
    public final void rule__DOM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1786:1: ( ( ( rule__DOM__Group_2__0 )? ) )
            // InternalT2A.g:1787:1: ( ( rule__DOM__Group_2__0 )? )
            {
            // InternalT2A.g:1787:1: ( ( rule__DOM__Group_2__0 )? )
            // InternalT2A.g:1788:2: ( rule__DOM__Group_2__0 )?
            {
             before(grammarAccess.getDOMAccess().getGroup_2()); 
            // InternalT2A.g:1789:2: ( rule__DOM__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalT2A.g:1789:3: rule__DOM__Group_2__0
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
    // InternalT2A.g:1798:1: rule__DOM__Group_2__0 : rule__DOM__Group_2__0__Impl rule__DOM__Group_2__1 ;
    public final void rule__DOM__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1802:1: ( rule__DOM__Group_2__0__Impl rule__DOM__Group_2__1 )
            // InternalT2A.g:1803:2: rule__DOM__Group_2__0__Impl rule__DOM__Group_2__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalT2A.g:1810:1: rule__DOM__Group_2__0__Impl : ( '{' ) ;
    public final void rule__DOM__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1814:1: ( ( '{' ) )
            // InternalT2A.g:1815:1: ( '{' )
            {
            // InternalT2A.g:1815:1: ( '{' )
            // InternalT2A.g:1816:2: '{'
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
    // InternalT2A.g:1825:1: rule__DOM__Group_2__1 : rule__DOM__Group_2__1__Impl rule__DOM__Group_2__2 ;
    public final void rule__DOM__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1829:1: ( rule__DOM__Group_2__1__Impl rule__DOM__Group_2__2 )
            // InternalT2A.g:1830:2: rule__DOM__Group_2__1__Impl rule__DOM__Group_2__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalT2A.g:1837:1: rule__DOM__Group_2__1__Impl : ( ( rule__DOM__Group_2_1__0 )? ) ;
    public final void rule__DOM__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1841:1: ( ( ( rule__DOM__Group_2_1__0 )? ) )
            // InternalT2A.g:1842:1: ( ( rule__DOM__Group_2_1__0 )? )
            {
            // InternalT2A.g:1842:1: ( ( rule__DOM__Group_2_1__0 )? )
            // InternalT2A.g:1843:2: ( rule__DOM__Group_2_1__0 )?
            {
             before(grammarAccess.getDOMAccess().getGroup_2_1()); 
            // InternalT2A.g:1844:2: ( rule__DOM__Group_2_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalT2A.g:1844:3: rule__DOM__Group_2_1__0
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
    // InternalT2A.g:1852:1: rule__DOM__Group_2__2 : rule__DOM__Group_2__2__Impl rule__DOM__Group_2__3 ;
    public final void rule__DOM__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1856:1: ( rule__DOM__Group_2__2__Impl rule__DOM__Group_2__3 )
            // InternalT2A.g:1857:2: rule__DOM__Group_2__2__Impl rule__DOM__Group_2__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalT2A.g:1864:1: rule__DOM__Group_2__2__Impl : ( ( rule__DOM__FeaturesAssignment_2_2 )* ) ;
    public final void rule__DOM__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1868:1: ( ( ( rule__DOM__FeaturesAssignment_2_2 )* ) )
            // InternalT2A.g:1869:1: ( ( rule__DOM__FeaturesAssignment_2_2 )* )
            {
            // InternalT2A.g:1869:1: ( ( rule__DOM__FeaturesAssignment_2_2 )* )
            // InternalT2A.g:1870:2: ( rule__DOM__FeaturesAssignment_2_2 )*
            {
             before(grammarAccess.getDOMAccess().getFeaturesAssignment_2_2()); 
            // InternalT2A.g:1871:2: ( rule__DOM__FeaturesAssignment_2_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||LA22_0==RULE_STRING||LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalT2A.g:1871:3: rule__DOM__FeaturesAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__DOM__FeaturesAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalT2A.g:1879:1: rule__DOM__Group_2__3 : rule__DOM__Group_2__3__Impl ;
    public final void rule__DOM__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1883:1: ( rule__DOM__Group_2__3__Impl )
            // InternalT2A.g:1884:2: rule__DOM__Group_2__3__Impl
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
    // InternalT2A.g:1890:1: rule__DOM__Group_2__3__Impl : ( '}' ) ;
    public final void rule__DOM__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1894:1: ( ( '}' ) )
            // InternalT2A.g:1895:1: ( '}' )
            {
            // InternalT2A.g:1895:1: ( '}' )
            // InternalT2A.g:1896:2: '}'
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
    // InternalT2A.g:1906:1: rule__DOM__Group_2_1__0 : rule__DOM__Group_2_1__0__Impl rule__DOM__Group_2_1__1 ;
    public final void rule__DOM__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1910:1: ( rule__DOM__Group_2_1__0__Impl rule__DOM__Group_2_1__1 )
            // InternalT2A.g:1911:2: rule__DOM__Group_2_1__0__Impl rule__DOM__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalT2A.g:1918:1: rule__DOM__Group_2_1__0__Impl : ( 'sclass' ) ;
    public final void rule__DOM__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1922:1: ( ( 'sclass' ) )
            // InternalT2A.g:1923:1: ( 'sclass' )
            {
            // InternalT2A.g:1923:1: ( 'sclass' )
            // InternalT2A.g:1924:2: 'sclass'
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
    // InternalT2A.g:1933:1: rule__DOM__Group_2_1__1 : rule__DOM__Group_2_1__1__Impl rule__DOM__Group_2_1__2 ;
    public final void rule__DOM__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1937:1: ( rule__DOM__Group_2_1__1__Impl rule__DOM__Group_2_1__2 )
            // InternalT2A.g:1938:2: rule__DOM__Group_2_1__1__Impl rule__DOM__Group_2_1__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalT2A.g:1945:1: rule__DOM__Group_2_1__1__Impl : ( '{' ) ;
    public final void rule__DOM__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1949:1: ( ( '{' ) )
            // InternalT2A.g:1950:1: ( '{' )
            {
            // InternalT2A.g:1950:1: ( '{' )
            // InternalT2A.g:1951:2: '{'
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
    // InternalT2A.g:1960:1: rule__DOM__Group_2_1__2 : rule__DOM__Group_2_1__2__Impl rule__DOM__Group_2_1__3 ;
    public final void rule__DOM__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1964:1: ( rule__DOM__Group_2_1__2__Impl rule__DOM__Group_2_1__3 )
            // InternalT2A.g:1965:2: rule__DOM__Group_2_1__2__Impl rule__DOM__Group_2_1__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalT2A.g:1972:1: rule__DOM__Group_2_1__2__Impl : ( ( rule__DOM__SclassesAssignment_2_1_2 )* ) ;
    public final void rule__DOM__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1976:1: ( ( ( rule__DOM__SclassesAssignment_2_1_2 )* ) )
            // InternalT2A.g:1977:1: ( ( rule__DOM__SclassesAssignment_2_1_2 )* )
            {
            // InternalT2A.g:1977:1: ( ( rule__DOM__SclassesAssignment_2_1_2 )* )
            // InternalT2A.g:1978:2: ( rule__DOM__SclassesAssignment_2_1_2 )*
            {
             before(grammarAccess.getDOMAccess().getSclassesAssignment_2_1_2()); 
            // InternalT2A.g:1979:2: ( rule__DOM__SclassesAssignment_2_1_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalT2A.g:1979:3: rule__DOM__SclassesAssignment_2_1_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DOM__SclassesAssignment_2_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalT2A.g:1987:1: rule__DOM__Group_2_1__3 : rule__DOM__Group_2_1__3__Impl ;
    public final void rule__DOM__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1991:1: ( rule__DOM__Group_2_1__3__Impl )
            // InternalT2A.g:1992:2: rule__DOM__Group_2_1__3__Impl
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
    // InternalT2A.g:1998:1: rule__DOM__Group_2_1__3__Impl : ( '}' ) ;
    public final void rule__DOM__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2002:1: ( ( '}' ) )
            // InternalT2A.g:2003:1: ( '}' )
            {
            // InternalT2A.g:2003:1: ( '}' )
            // InternalT2A.g:2004:2: '}'
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
    // InternalT2A.g:2014:1: rule__Comp__Group__0 : rule__Comp__Group__0__Impl rule__Comp__Group__1 ;
    public final void rule__Comp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2018:1: ( rule__Comp__Group__0__Impl rule__Comp__Group__1 )
            // InternalT2A.g:2019:2: rule__Comp__Group__0__Impl rule__Comp__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalT2A.g:2026:1: rule__Comp__Group__0__Impl : ( 'Comp' ) ;
    public final void rule__Comp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2030:1: ( ( 'Comp' ) )
            // InternalT2A.g:2031:1: ( 'Comp' )
            {
            // InternalT2A.g:2031:1: ( 'Comp' )
            // InternalT2A.g:2032:2: 'Comp'
            {
             before(grammarAccess.getCompAccess().getCompKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalT2A.g:2041:1: rule__Comp__Group__1 : rule__Comp__Group__1__Impl rule__Comp__Group__2 ;
    public final void rule__Comp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2045:1: ( rule__Comp__Group__1__Impl rule__Comp__Group__2 )
            // InternalT2A.g:2046:2: rule__Comp__Group__1__Impl rule__Comp__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalT2A.g:2053:1: rule__Comp__Group__1__Impl : ( ( rule__Comp__NameAssignment_1 ) ) ;
    public final void rule__Comp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2057:1: ( ( ( rule__Comp__NameAssignment_1 ) ) )
            // InternalT2A.g:2058:1: ( ( rule__Comp__NameAssignment_1 ) )
            {
            // InternalT2A.g:2058:1: ( ( rule__Comp__NameAssignment_1 ) )
            // InternalT2A.g:2059:2: ( rule__Comp__NameAssignment_1 )
            {
             before(grammarAccess.getCompAccess().getNameAssignment_1()); 
            // InternalT2A.g:2060:2: ( rule__Comp__NameAssignment_1 )
            // InternalT2A.g:2060:3: rule__Comp__NameAssignment_1
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
    // InternalT2A.g:2068:1: rule__Comp__Group__2 : rule__Comp__Group__2__Impl ;
    public final void rule__Comp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2072:1: ( rule__Comp__Group__2__Impl )
            // InternalT2A.g:2073:2: rule__Comp__Group__2__Impl
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
    // InternalT2A.g:2079:1: rule__Comp__Group__2__Impl : ( ( rule__Comp__Group_2__0 )? ) ;
    public final void rule__Comp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2083:1: ( ( ( rule__Comp__Group_2__0 )? ) )
            // InternalT2A.g:2084:1: ( ( rule__Comp__Group_2__0 )? )
            {
            // InternalT2A.g:2084:1: ( ( rule__Comp__Group_2__0 )? )
            // InternalT2A.g:2085:2: ( rule__Comp__Group_2__0 )?
            {
             before(grammarAccess.getCompAccess().getGroup_2()); 
            // InternalT2A.g:2086:2: ( rule__Comp__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalT2A.g:2086:3: rule__Comp__Group_2__0
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
    // InternalT2A.g:2095:1: rule__Comp__Group_2__0 : rule__Comp__Group_2__0__Impl rule__Comp__Group_2__1 ;
    public final void rule__Comp__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2099:1: ( rule__Comp__Group_2__0__Impl rule__Comp__Group_2__1 )
            // InternalT2A.g:2100:2: rule__Comp__Group_2__0__Impl rule__Comp__Group_2__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalT2A.g:2107:1: rule__Comp__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Comp__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2111:1: ( ( '{' ) )
            // InternalT2A.g:2112:1: ( '{' )
            {
            // InternalT2A.g:2112:1: ( '{' )
            // InternalT2A.g:2113:2: '{'
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
    // InternalT2A.g:2122:1: rule__Comp__Group_2__1 : rule__Comp__Group_2__1__Impl rule__Comp__Group_2__2 ;
    public final void rule__Comp__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2126:1: ( rule__Comp__Group_2__1__Impl rule__Comp__Group_2__2 )
            // InternalT2A.g:2127:2: rule__Comp__Group_2__1__Impl rule__Comp__Group_2__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalT2A.g:2134:1: rule__Comp__Group_2__1__Impl : ( ( rule__Comp__Group_2_1__0 )? ) ;
    public final void rule__Comp__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2138:1: ( ( ( rule__Comp__Group_2_1__0 )? ) )
            // InternalT2A.g:2139:1: ( ( rule__Comp__Group_2_1__0 )? )
            {
            // InternalT2A.g:2139:1: ( ( rule__Comp__Group_2_1__0 )? )
            // InternalT2A.g:2140:2: ( rule__Comp__Group_2_1__0 )?
            {
             before(grammarAccess.getCompAccess().getGroup_2_1()); 
            // InternalT2A.g:2141:2: ( rule__Comp__Group_2_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==22) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalT2A.g:2141:3: rule__Comp__Group_2_1__0
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
    // InternalT2A.g:2149:1: rule__Comp__Group_2__2 : rule__Comp__Group_2__2__Impl rule__Comp__Group_2__3 ;
    public final void rule__Comp__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2153:1: ( rule__Comp__Group_2__2__Impl rule__Comp__Group_2__3 )
            // InternalT2A.g:2154:2: rule__Comp__Group_2__2__Impl rule__Comp__Group_2__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalT2A.g:2161:1: rule__Comp__Group_2__2__Impl : ( ( rule__Comp__FeaturesAssignment_2_2 )* ) ;
    public final void rule__Comp__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2165:1: ( ( ( rule__Comp__FeaturesAssignment_2_2 )* ) )
            // InternalT2A.g:2166:1: ( ( rule__Comp__FeaturesAssignment_2_2 )* )
            {
            // InternalT2A.g:2166:1: ( ( rule__Comp__FeaturesAssignment_2_2 )* )
            // InternalT2A.g:2167:2: ( rule__Comp__FeaturesAssignment_2_2 )*
            {
             before(grammarAccess.getCompAccess().getFeaturesAssignment_2_2()); 
            // InternalT2A.g:2168:2: ( rule__Comp__FeaturesAssignment_2_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==RULE_STRING||LA26_0==32) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalT2A.g:2168:3: rule__Comp__FeaturesAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Comp__FeaturesAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalT2A.g:2176:1: rule__Comp__Group_2__3 : rule__Comp__Group_2__3__Impl ;
    public final void rule__Comp__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2180:1: ( rule__Comp__Group_2__3__Impl )
            // InternalT2A.g:2181:2: rule__Comp__Group_2__3__Impl
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
    // InternalT2A.g:2187:1: rule__Comp__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Comp__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2191:1: ( ( '}' ) )
            // InternalT2A.g:2192:1: ( '}' )
            {
            // InternalT2A.g:2192:1: ( '}' )
            // InternalT2A.g:2193:2: '}'
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
    // InternalT2A.g:2203:1: rule__Comp__Group_2_1__0 : rule__Comp__Group_2_1__0__Impl rule__Comp__Group_2_1__1 ;
    public final void rule__Comp__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2207:1: ( rule__Comp__Group_2_1__0__Impl rule__Comp__Group_2_1__1 )
            // InternalT2A.g:2208:2: rule__Comp__Group_2_1__0__Impl rule__Comp__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalT2A.g:2215:1: rule__Comp__Group_2_1__0__Impl : ( 'sclass' ) ;
    public final void rule__Comp__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2219:1: ( ( 'sclass' ) )
            // InternalT2A.g:2220:1: ( 'sclass' )
            {
            // InternalT2A.g:2220:1: ( 'sclass' )
            // InternalT2A.g:2221:2: 'sclass'
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
    // InternalT2A.g:2230:1: rule__Comp__Group_2_1__1 : rule__Comp__Group_2_1__1__Impl rule__Comp__Group_2_1__2 ;
    public final void rule__Comp__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2234:1: ( rule__Comp__Group_2_1__1__Impl rule__Comp__Group_2_1__2 )
            // InternalT2A.g:2235:2: rule__Comp__Group_2_1__1__Impl rule__Comp__Group_2_1__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalT2A.g:2242:1: rule__Comp__Group_2_1__1__Impl : ( '{' ) ;
    public final void rule__Comp__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2246:1: ( ( '{' ) )
            // InternalT2A.g:2247:1: ( '{' )
            {
            // InternalT2A.g:2247:1: ( '{' )
            // InternalT2A.g:2248:2: '{'
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
    // InternalT2A.g:2257:1: rule__Comp__Group_2_1__2 : rule__Comp__Group_2_1__2__Impl rule__Comp__Group_2_1__3 ;
    public final void rule__Comp__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2261:1: ( rule__Comp__Group_2_1__2__Impl rule__Comp__Group_2_1__3 )
            // InternalT2A.g:2262:2: rule__Comp__Group_2_1__2__Impl rule__Comp__Group_2_1__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalT2A.g:2269:1: rule__Comp__Group_2_1__2__Impl : ( ( rule__Comp__HostclassesAssignment_2_1_2 )* ) ;
    public final void rule__Comp__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2273:1: ( ( ( rule__Comp__HostclassesAssignment_2_1_2 )* ) )
            // InternalT2A.g:2274:1: ( ( rule__Comp__HostclassesAssignment_2_1_2 )* )
            {
            // InternalT2A.g:2274:1: ( ( rule__Comp__HostclassesAssignment_2_1_2 )* )
            // InternalT2A.g:2275:2: ( rule__Comp__HostclassesAssignment_2_1_2 )*
            {
             before(grammarAccess.getCompAccess().getHostclassesAssignment_2_1_2()); 
            // InternalT2A.g:2276:2: ( rule__Comp__HostclassesAssignment_2_1_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalT2A.g:2276:3: rule__Comp__HostclassesAssignment_2_1_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Comp__HostclassesAssignment_2_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalT2A.g:2284:1: rule__Comp__Group_2_1__3 : rule__Comp__Group_2_1__3__Impl ;
    public final void rule__Comp__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2288:1: ( rule__Comp__Group_2_1__3__Impl )
            // InternalT2A.g:2289:2: rule__Comp__Group_2_1__3__Impl
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
    // InternalT2A.g:2295:1: rule__Comp__Group_2_1__3__Impl : ( '}' ) ;
    public final void rule__Comp__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2299:1: ( ( '}' ) )
            // InternalT2A.g:2300:1: ( '}' )
            {
            // InternalT2A.g:2300:1: ( '}' )
            // InternalT2A.g:2301:2: '}'
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
    // InternalT2A.g:2311:1: rule__InstanciaEDOM__Group__0 : rule__InstanciaEDOM__Group__0__Impl rule__InstanciaEDOM__Group__1 ;
    public final void rule__InstanciaEDOM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2315:1: ( rule__InstanciaEDOM__Group__0__Impl rule__InstanciaEDOM__Group__1 )
            // InternalT2A.g:2316:2: rule__InstanciaEDOM__Group__0__Impl rule__InstanciaEDOM__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalT2A.g:2323:1: rule__InstanciaEDOM__Group__0__Impl : ( ( rule__InstanciaEDOM__InstanciaAssignment_0 ) ) ;
    public final void rule__InstanciaEDOM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2327:1: ( ( ( rule__InstanciaEDOM__InstanciaAssignment_0 ) ) )
            // InternalT2A.g:2328:1: ( ( rule__InstanciaEDOM__InstanciaAssignment_0 ) )
            {
            // InternalT2A.g:2328:1: ( ( rule__InstanciaEDOM__InstanciaAssignment_0 ) )
            // InternalT2A.g:2329:2: ( rule__InstanciaEDOM__InstanciaAssignment_0 )
            {
             before(grammarAccess.getInstanciaEDOMAccess().getInstanciaAssignment_0()); 
            // InternalT2A.g:2330:2: ( rule__InstanciaEDOM__InstanciaAssignment_0 )
            // InternalT2A.g:2330:3: rule__InstanciaEDOM__InstanciaAssignment_0
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
    // InternalT2A.g:2338:1: rule__InstanciaEDOM__Group__1 : rule__InstanciaEDOM__Group__1__Impl ;
    public final void rule__InstanciaEDOM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2342:1: ( rule__InstanciaEDOM__Group__1__Impl )
            // InternalT2A.g:2343:2: rule__InstanciaEDOM__Group__1__Impl
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
    // InternalT2A.g:2349:1: rule__InstanciaEDOM__Group__1__Impl : ( ( rule__InstanciaEDOM__Group_1__0 )? ) ;
    public final void rule__InstanciaEDOM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2353:1: ( ( ( rule__InstanciaEDOM__Group_1__0 )? ) )
            // InternalT2A.g:2354:1: ( ( rule__InstanciaEDOM__Group_1__0 )? )
            {
            // InternalT2A.g:2354:1: ( ( rule__InstanciaEDOM__Group_1__0 )? )
            // InternalT2A.g:2355:2: ( rule__InstanciaEDOM__Group_1__0 )?
            {
             before(grammarAccess.getInstanciaEDOMAccess().getGroup_1()); 
            // InternalT2A.g:2356:2: ( rule__InstanciaEDOM__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==20) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalT2A.g:2356:3: rule__InstanciaEDOM__Group_1__0
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
    // InternalT2A.g:2365:1: rule__InstanciaEDOM__Group_1__0 : rule__InstanciaEDOM__Group_1__0__Impl rule__InstanciaEDOM__Group_1__1 ;
    public final void rule__InstanciaEDOM__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2369:1: ( rule__InstanciaEDOM__Group_1__0__Impl rule__InstanciaEDOM__Group_1__1 )
            // InternalT2A.g:2370:2: rule__InstanciaEDOM__Group_1__0__Impl rule__InstanciaEDOM__Group_1__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalT2A.g:2377:1: rule__InstanciaEDOM__Group_1__0__Impl : ( '{' ) ;
    public final void rule__InstanciaEDOM__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2381:1: ( ( '{' ) )
            // InternalT2A.g:2382:1: ( '{' )
            {
            // InternalT2A.g:2382:1: ( '{' )
            // InternalT2A.g:2383:2: '{'
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
    // InternalT2A.g:2392:1: rule__InstanciaEDOM__Group_1__1 : rule__InstanciaEDOM__Group_1__1__Impl rule__InstanciaEDOM__Group_1__2 ;
    public final void rule__InstanciaEDOM__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2396:1: ( rule__InstanciaEDOM__Group_1__1__Impl rule__InstanciaEDOM__Group_1__2 )
            // InternalT2A.g:2397:2: rule__InstanciaEDOM__Group_1__1__Impl rule__InstanciaEDOM__Group_1__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalT2A.g:2404:1: rule__InstanciaEDOM__Group_1__1__Impl : ( ( rule__InstanciaEDOM__Group_1_1__0 )? ) ;
    public final void rule__InstanciaEDOM__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2408:1: ( ( ( rule__InstanciaEDOM__Group_1_1__0 )? ) )
            // InternalT2A.g:2409:1: ( ( rule__InstanciaEDOM__Group_1_1__0 )? )
            {
            // InternalT2A.g:2409:1: ( ( rule__InstanciaEDOM__Group_1_1__0 )? )
            // InternalT2A.g:2410:2: ( rule__InstanciaEDOM__Group_1_1__0 )?
            {
             before(grammarAccess.getInstanciaEDOMAccess().getGroup_1_1()); 
            // InternalT2A.g:2411:2: ( rule__InstanciaEDOM__Group_1_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==22) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalT2A.g:2411:3: rule__InstanciaEDOM__Group_1_1__0
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
    // InternalT2A.g:2419:1: rule__InstanciaEDOM__Group_1__2 : rule__InstanciaEDOM__Group_1__2__Impl rule__InstanciaEDOM__Group_1__3 ;
    public final void rule__InstanciaEDOM__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2423:1: ( rule__InstanciaEDOM__Group_1__2__Impl rule__InstanciaEDOM__Group_1__3 )
            // InternalT2A.g:2424:2: rule__InstanciaEDOM__Group_1__2__Impl rule__InstanciaEDOM__Group_1__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalT2A.g:2431:1: rule__InstanciaEDOM__Group_1__2__Impl : ( ( rule__InstanciaEDOM__InsfeaturesAssignment_1_2 )* ) ;
    public final void rule__InstanciaEDOM__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2435:1: ( ( ( rule__InstanciaEDOM__InsfeaturesAssignment_1_2 )* ) )
            // InternalT2A.g:2436:1: ( ( rule__InstanciaEDOM__InsfeaturesAssignment_1_2 )* )
            {
            // InternalT2A.g:2436:1: ( ( rule__InstanciaEDOM__InsfeaturesAssignment_1_2 )* )
            // InternalT2A.g:2437:2: ( rule__InstanciaEDOM__InsfeaturesAssignment_1_2 )*
            {
             before(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesAssignment_1_2()); 
            // InternalT2A.g:2438:2: ( rule__InstanciaEDOM__InsfeaturesAssignment_1_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||LA30_0==RULE_STRING) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalT2A.g:2438:3: rule__InstanciaEDOM__InsfeaturesAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__InstanciaEDOM__InsfeaturesAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalT2A.g:2446:1: rule__InstanciaEDOM__Group_1__3 : rule__InstanciaEDOM__Group_1__3__Impl ;
    public final void rule__InstanciaEDOM__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2450:1: ( rule__InstanciaEDOM__Group_1__3__Impl )
            // InternalT2A.g:2451:2: rule__InstanciaEDOM__Group_1__3__Impl
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
    // InternalT2A.g:2457:1: rule__InstanciaEDOM__Group_1__3__Impl : ( '}' ) ;
    public final void rule__InstanciaEDOM__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2461:1: ( ( '}' ) )
            // InternalT2A.g:2462:1: ( '}' )
            {
            // InternalT2A.g:2462:1: ( '}' )
            // InternalT2A.g:2463:2: '}'
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
    // InternalT2A.g:2473:1: rule__InstanciaEDOM__Group_1_1__0 : rule__InstanciaEDOM__Group_1_1__0__Impl rule__InstanciaEDOM__Group_1_1__1 ;
    public final void rule__InstanciaEDOM__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2477:1: ( rule__InstanciaEDOM__Group_1_1__0__Impl rule__InstanciaEDOM__Group_1_1__1 )
            // InternalT2A.g:2478:2: rule__InstanciaEDOM__Group_1_1__0__Impl rule__InstanciaEDOM__Group_1_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalT2A.g:2485:1: rule__InstanciaEDOM__Group_1_1__0__Impl : ( 'sclass' ) ;
    public final void rule__InstanciaEDOM__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2489:1: ( ( 'sclass' ) )
            // InternalT2A.g:2490:1: ( 'sclass' )
            {
            // InternalT2A.g:2490:1: ( 'sclass' )
            // InternalT2A.g:2491:2: 'sclass'
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
    // InternalT2A.g:2500:1: rule__InstanciaEDOM__Group_1_1__1 : rule__InstanciaEDOM__Group_1_1__1__Impl rule__InstanciaEDOM__Group_1_1__2 ;
    public final void rule__InstanciaEDOM__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2504:1: ( rule__InstanciaEDOM__Group_1_1__1__Impl rule__InstanciaEDOM__Group_1_1__2 )
            // InternalT2A.g:2505:2: rule__InstanciaEDOM__Group_1_1__1__Impl rule__InstanciaEDOM__Group_1_1__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalT2A.g:2512:1: rule__InstanciaEDOM__Group_1_1__1__Impl : ( '{' ) ;
    public final void rule__InstanciaEDOM__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2516:1: ( ( '{' ) )
            // InternalT2A.g:2517:1: ( '{' )
            {
            // InternalT2A.g:2517:1: ( '{' )
            // InternalT2A.g:2518:2: '{'
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
    // InternalT2A.g:2527:1: rule__InstanciaEDOM__Group_1_1__2 : rule__InstanciaEDOM__Group_1_1__2__Impl rule__InstanciaEDOM__Group_1_1__3 ;
    public final void rule__InstanciaEDOM__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2531:1: ( rule__InstanciaEDOM__Group_1_1__2__Impl rule__InstanciaEDOM__Group_1_1__3 )
            // InternalT2A.g:2532:2: rule__InstanciaEDOM__Group_1_1__2__Impl rule__InstanciaEDOM__Group_1_1__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalT2A.g:2539:1: rule__InstanciaEDOM__Group_1_1__2__Impl : ( ( rule__InstanciaEDOM__SclassesAssignment_1_1_2 )* ) ;
    public final void rule__InstanciaEDOM__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2543:1: ( ( ( rule__InstanciaEDOM__SclassesAssignment_1_1_2 )* ) )
            // InternalT2A.g:2544:1: ( ( rule__InstanciaEDOM__SclassesAssignment_1_1_2 )* )
            {
            // InternalT2A.g:2544:1: ( ( rule__InstanciaEDOM__SclassesAssignment_1_1_2 )* )
            // InternalT2A.g:2545:2: ( rule__InstanciaEDOM__SclassesAssignment_1_1_2 )*
            {
             before(grammarAccess.getInstanciaEDOMAccess().getSclassesAssignment_1_1_2()); 
            // InternalT2A.g:2546:2: ( rule__InstanciaEDOM__SclassesAssignment_1_1_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalT2A.g:2546:3: rule__InstanciaEDOM__SclassesAssignment_1_1_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__InstanciaEDOM__SclassesAssignment_1_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalT2A.g:2554:1: rule__InstanciaEDOM__Group_1_1__3 : rule__InstanciaEDOM__Group_1_1__3__Impl ;
    public final void rule__InstanciaEDOM__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2558:1: ( rule__InstanciaEDOM__Group_1_1__3__Impl )
            // InternalT2A.g:2559:2: rule__InstanciaEDOM__Group_1_1__3__Impl
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
    // InternalT2A.g:2565:1: rule__InstanciaEDOM__Group_1_1__3__Impl : ( '}' ) ;
    public final void rule__InstanciaEDOM__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2569:1: ( ( '}' ) )
            // InternalT2A.g:2570:1: ( '}' )
            {
            // InternalT2A.g:2570:1: ( '}' )
            // InternalT2A.g:2571:2: '}'
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


    // $ANTLR start "rule__Root__GlobalStyleAssignment_0"
    // InternalT2A.g:2581:1: rule__Root__GlobalStyleAssignment_0 : ( ruleStyleGlobal ) ;
    public final void rule__Root__GlobalStyleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2585:1: ( ( ruleStyleGlobal ) )
            // InternalT2A.g:2586:2: ( ruleStyleGlobal )
            {
            // InternalT2A.g:2586:2: ( ruleStyleGlobal )
            // InternalT2A.g:2587:3: ruleStyleGlobal
            {
             before(grammarAccess.getRootAccess().getGlobalStyleStyleGlobalParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStyleGlobal();

            state._fsp--;

             after(grammarAccess.getRootAccess().getGlobalStyleStyleGlobalParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Root__GlobalStyleAssignment_0"


    // $ANTLR start "rule__Root__ElementsAssignment_1"
    // InternalT2A.g:2596:1: rule__Root__ElementsAssignment_1 : ( ruleElement ) ;
    public final void rule__Root__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2600:1: ( ( ruleElement ) )
            // InternalT2A.g:2601:2: ( ruleElement )
            {
            // InternalT2A.g:2601:2: ( ruleElement )
            // InternalT2A.g:2602:3: ruleElement
            {
             before(grammarAccess.getRootAccess().getElementsElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getRootAccess().getElementsElementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Root__ElementsAssignment_1"


    // $ANTLR start "rule__Page__NameAssignment_1"
    // InternalT2A.g:2611:1: rule__Page__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Page__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2615:1: ( ( RULE_ID ) )
            // InternalT2A.g:2616:2: ( RULE_ID )
            {
            // InternalT2A.g:2616:2: ( RULE_ID )
            // InternalT2A.g:2617:3: RULE_ID
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
    // InternalT2A.g:2626:1: rule__Page__HostclassesAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__Page__HostclassesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2630:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:2631:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:2631:2: ( ( RULE_ID ) )
            // InternalT2A.g:2632:3: ( RULE_ID )
            {
             before(grammarAccess.getPageAccess().getHostclassesStyleClassCrossReference_3_2_0()); 
            // InternalT2A.g:2633:3: ( RULE_ID )
            // InternalT2A.g:2634:4: RULE_ID
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
    // InternalT2A.g:2645:1: rule__Page__HomeAssignment_4 : ( ( 'home' ) ) ;
    public final void rule__Page__HomeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2649:1: ( ( ( 'home' ) ) )
            // InternalT2A.g:2650:2: ( ( 'home' ) )
            {
            // InternalT2A.g:2650:2: ( ( 'home' ) )
            // InternalT2A.g:2651:3: ( 'home' )
            {
             before(grammarAccess.getPageAccess().getHomeHomeKeyword_4_0()); 
            // InternalT2A.g:2652:3: ( 'home' )
            // InternalT2A.g:2653:4: 'home'
            {
             before(grammarAccess.getPageAccess().getHomeHomeKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalT2A.g:2664:1: rule__Page__ShowInNavAssignment_5 : ( ( 'showInNav' ) ) ;
    public final void rule__Page__ShowInNavAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2668:1: ( ( ( 'showInNav' ) ) )
            // InternalT2A.g:2669:2: ( ( 'showInNav' ) )
            {
            // InternalT2A.g:2669:2: ( ( 'showInNav' ) )
            // InternalT2A.g:2670:3: ( 'showInNav' )
            {
             before(grammarAccess.getPageAccess().getShowInNavShowInNavKeyword_5_0()); 
            // InternalT2A.g:2671:3: ( 'showInNav' )
            // InternalT2A.g:2672:4: 'showInNav'
            {
             before(grammarAccess.getPageAccess().getShowInNavShowInNavKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalT2A.g:2683:1: rule__Page__PageFeaturesAssignment_6 : ( rulePageFeature ) ;
    public final void rule__Page__PageFeaturesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2687:1: ( ( rulePageFeature ) )
            // InternalT2A.g:2688:2: ( rulePageFeature )
            {
            // InternalT2A.g:2688:2: ( rulePageFeature )
            // InternalT2A.g:2689:3: rulePageFeature
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


    // $ANTLR start "rule__StyleGlobal__StyleclassesAssignment_3"
    // InternalT2A.g:2698:1: rule__StyleGlobal__StyleclassesAssignment_3 : ( ruleStyleClass ) ;
    public final void rule__StyleGlobal__StyleclassesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2702:1: ( ( ruleStyleClass ) )
            // InternalT2A.g:2703:2: ( ruleStyleClass )
            {
            // InternalT2A.g:2703:2: ( ruleStyleClass )
            // InternalT2A.g:2704:3: ruleStyleClass
            {
             before(grammarAccess.getStyleGlobalAccess().getStyleclassesStyleClassParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStyleClass();

            state._fsp--;

             after(grammarAccess.getStyleGlobalAccess().getStyleclassesStyleClassParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__StyleGlobal__StyleclassesAssignment_3"


    // $ANTLR start "rule__StyleClass__NameAssignment_1"
    // InternalT2A.g:2713:1: rule__StyleClass__NameAssignment_1 : ( ruleName ) ;
    public final void rule__StyleClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2717:1: ( ( ruleName ) )
            // InternalT2A.g:2718:2: ( ruleName )
            {
            // InternalT2A.g:2718:2: ( ruleName )
            // InternalT2A.g:2719:3: ruleName
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
    // InternalT2A.g:2728:1: rule__StyleClass__SattributesAssignment_3_0 : ( ruleSAttributeAndValue ) ;
    public final void rule__StyleClass__SattributesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2732:1: ( ( ruleSAttributeAndValue ) )
            // InternalT2A.g:2733:2: ( ruleSAttributeAndValue )
            {
            // InternalT2A.g:2733:2: ( ruleSAttributeAndValue )
            // InternalT2A.g:2734:3: ruleSAttributeAndValue
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
    // InternalT2A.g:2743:1: rule__StyleClass__SattributesAfterAssignment_4_2_0 : ( ruleSAttributeAndValue ) ;
    public final void rule__StyleClass__SattributesAfterAssignment_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2747:1: ( ( ruleSAttributeAndValue ) )
            // InternalT2A.g:2748:2: ( ruleSAttributeAndValue )
            {
            // InternalT2A.g:2748:2: ( ruleSAttributeAndValue )
            // InternalT2A.g:2749:3: ruleSAttributeAndValue
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
    // InternalT2A.g:2758:1: rule__StyleClass__SattributesActiveAssignment_5_2_0 : ( ruleSAttributeAndValue ) ;
    public final void rule__StyleClass__SattributesActiveAssignment_5_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2762:1: ( ( ruleSAttributeAndValue ) )
            // InternalT2A.g:2763:2: ( ruleSAttributeAndValue )
            {
            // InternalT2A.g:2763:2: ( ruleSAttributeAndValue )
            // InternalT2A.g:2764:3: ruleSAttributeAndValue
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
    // InternalT2A.g:2773:1: rule__SAttributeAndValue__StnameAssignment_0 : ( ruleName ) ;
    public final void rule__SAttributeAndValue__StnameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2777:1: ( ( ruleName ) )
            // InternalT2A.g:2778:2: ( ruleName )
            {
            // InternalT2A.g:2778:2: ( ruleName )
            // InternalT2A.g:2779:3: ruleName
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
    // InternalT2A.g:2788:1: rule__SAttributeAndValue__ValueAssignment_1 : ( RULE_STRING2 ) ;
    public final void rule__SAttributeAndValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2792:1: ( ( RULE_STRING2 ) )
            // InternalT2A.g:2793:2: ( RULE_STRING2 )
            {
            // InternalT2A.g:2793:2: ( RULE_STRING2 )
            // InternalT2A.g:2794:3: RULE_STRING2
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
    // InternalT2A.g:2803:1: rule__DOM__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DOM__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2807:1: ( ( RULE_ID ) )
            // InternalT2A.g:2808:2: ( RULE_ID )
            {
            // InternalT2A.g:2808:2: ( RULE_ID )
            // InternalT2A.g:2809:3: RULE_ID
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
    // InternalT2A.g:2818:1: rule__DOM__SclassesAssignment_2_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__DOM__SclassesAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2822:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:2823:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:2823:2: ( ( RULE_ID ) )
            // InternalT2A.g:2824:3: ( RULE_ID )
            {
             before(grammarAccess.getDOMAccess().getSclassesStyleClassCrossReference_2_1_2_0()); 
            // InternalT2A.g:2825:3: ( RULE_ID )
            // InternalT2A.g:2826:4: RULE_ID
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
    // InternalT2A.g:2837:1: rule__DOM__FeaturesAssignment_2_2 : ( ruleFeature ) ;
    public final void rule__DOM__FeaturesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2841:1: ( ( ruleFeature ) )
            // InternalT2A.g:2842:2: ( ruleFeature )
            {
            // InternalT2A.g:2842:2: ( ruleFeature )
            // InternalT2A.g:2843:3: ruleFeature
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
    // InternalT2A.g:2852:1: rule__Comp__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Comp__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2856:1: ( ( RULE_ID ) )
            // InternalT2A.g:2857:2: ( RULE_ID )
            {
            // InternalT2A.g:2857:2: ( RULE_ID )
            // InternalT2A.g:2858:3: RULE_ID
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
    // InternalT2A.g:2867:1: rule__Comp__HostclassesAssignment_2_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Comp__HostclassesAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2871:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:2872:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:2872:2: ( ( RULE_ID ) )
            // InternalT2A.g:2873:3: ( RULE_ID )
            {
             before(grammarAccess.getCompAccess().getHostclassesStyleClassCrossReference_2_1_2_0()); 
            // InternalT2A.g:2874:3: ( RULE_ID )
            // InternalT2A.g:2875:4: RULE_ID
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
    // InternalT2A.g:2886:1: rule__Comp__FeaturesAssignment_2_2 : ( ruleFeature ) ;
    public final void rule__Comp__FeaturesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2890:1: ( ( ruleFeature ) )
            // InternalT2A.g:2891:2: ( ruleFeature )
            {
            // InternalT2A.g:2891:2: ( ruleFeature )
            // InternalT2A.g:2892:3: ruleFeature
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
    // InternalT2A.g:2901:1: rule__InstanciaEDOM__InstanciaAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__InstanciaEDOM__InstanciaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2905:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:2906:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:2906:2: ( ( RULE_ID ) )
            // InternalT2A.g:2907:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanciaEDOMAccess().getInstanciaEDOMCrossReference_0_0()); 
            // InternalT2A.g:2908:3: ( RULE_ID )
            // InternalT2A.g:2909:4: RULE_ID
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
    // InternalT2A.g:2920:1: rule__InstanciaEDOM__SclassesAssignment_1_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__InstanciaEDOM__SclassesAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2924:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:2925:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:2925:2: ( ( RULE_ID ) )
            // InternalT2A.g:2926:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanciaEDOMAccess().getSclassesStyleClassCrossReference_1_1_2_0()); 
            // InternalT2A.g:2927:3: ( RULE_ID )
            // InternalT2A.g:2928:4: RULE_ID
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
    // InternalT2A.g:2939:1: rule__InstanciaEDOM__InsfeaturesAssignment_1_2 : ( ruleInstanceEDOMFeature ) ;
    public final void rule__InstanciaEDOM__InsfeaturesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2943:1: ( ( ruleInstanceEDOMFeature ) )
            // InternalT2A.g:2944:2: ( ruleInstanceEDOMFeature )
            {
            // InternalT2A.g:2944:2: ( ruleInstanceEDOMFeature )
            // InternalT2A.g:2945:3: ruleInstanceEDOMFeature
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
    // InternalT2A.g:2954:1: rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 : ( ruleInstanciaEDOM ) ;
    public final void rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2958:1: ( ( ruleInstanciaEDOM ) )
            // InternalT2A.g:2959:2: ( ruleInstanciaEDOM )
            {
            // InternalT2A.g:2959:2: ( ruleInstanciaEDOM )
            // InternalT2A.g:2960:3: ruleInstanciaEDOM
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
    // InternalT2A.g:2969:1: rule__InstanceEDOMFeature__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__InstanceEDOMFeature__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2973:1: ( ( RULE_STRING ) )
            // InternalT2A.g:2974:2: ( RULE_STRING )
            {
            // InternalT2A.g:2974:2: ( RULE_STRING )
            // InternalT2A.g:2975:3: RULE_STRING
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
    // InternalT2A.g:2984:1: rule__PageFeature__InstanciaEDOMAssignment_0 : ( ruleInstanciaEDOM ) ;
    public final void rule__PageFeature__InstanciaEDOMAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2988:1: ( ( ruleInstanciaEDOM ) )
            // InternalT2A.g:2989:2: ( ruleInstanciaEDOM )
            {
            // InternalT2A.g:2989:2: ( ruleInstanciaEDOM )
            // InternalT2A.g:2990:3: ruleInstanciaEDOM
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
    // InternalT2A.g:2999:1: rule__PageFeature__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__PageFeature__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3003:1: ( ( RULE_STRING ) )
            // InternalT2A.g:3004:2: ( RULE_STRING )
            {
            // InternalT2A.g:3004:2: ( RULE_STRING )
            // InternalT2A.g:3005:3: RULE_STRING
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
    // InternalT2A.g:3014:1: rule__Feature__InstanciaEDOMAssignment_0 : ( ruleInstanciaEDOM ) ;
    public final void rule__Feature__InstanciaEDOMAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3018:1: ( ( ruleInstanciaEDOM ) )
            // InternalT2A.g:3019:2: ( ruleInstanciaEDOM )
            {
            // InternalT2A.g:3019:2: ( ruleInstanciaEDOM )
            // InternalT2A.g:3020:3: ruleInstanciaEDOM
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
    // InternalT2A.g:3029:1: rule__Feature__AllowSlotAssignment_1 : ( ( 'AllowSlot' ) ) ;
    public final void rule__Feature__AllowSlotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3033:1: ( ( ( 'AllowSlot' ) ) )
            // InternalT2A.g:3034:2: ( ( 'AllowSlot' ) )
            {
            // InternalT2A.g:3034:2: ( ( 'AllowSlot' ) )
            // InternalT2A.g:3035:3: ( 'AllowSlot' )
            {
             before(grammarAccess.getFeatureAccess().getAllowSlotAllowSlotKeyword_1_0()); 
            // InternalT2A.g:3036:3: ( 'AllowSlot' )
            // InternalT2A.g:3037:4: 'AllowSlot'
            {
             before(grammarAccess.getFeatureAccess().getAllowSlotAllowSlotKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalT2A.g:3048:1: rule__Feature__StringAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Feature__StringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3052:1: ( ( RULE_STRING ) )
            // InternalT2A.g:3053:2: ( RULE_STRING )
            {
            // InternalT2A.g:3053:2: ( RULE_STRING )
            // InternalT2A.g:3054:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000007F012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000031080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000031080002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000C0600050L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000031280000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000007F010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000C27F010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000027F010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100600050L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000052L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000600050L});

}