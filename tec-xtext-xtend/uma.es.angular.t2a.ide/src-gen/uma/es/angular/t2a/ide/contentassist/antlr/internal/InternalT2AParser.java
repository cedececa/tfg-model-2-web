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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_STRING2", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'_'", "'#'", "'-'", "'*'", "'.'", "'::'", "'>'", "'AppName:'", "'Page'", "'{'", "'}'", "'sclass'", "'StyleGlobal'", "'StyleOnline'", "'JSOnline'", "'StyleClass'", "';'", "'after'", "'active'", "'Dom'", "'sclassString'", "'Comp'", "'home'", "'showInNav'", "'AllowSlot'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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
    public static final int RULE_STRING2=6;
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


    // $ANTLR start "entryRuleStyleOnline"
    // InternalT2A.g:178:1: entryRuleStyleOnline : ruleStyleOnline EOF ;
    public final void entryRuleStyleOnline() throws RecognitionException {
        try {
            // InternalT2A.g:179:1: ( ruleStyleOnline EOF )
            // InternalT2A.g:180:1: ruleStyleOnline EOF
            {
             before(grammarAccess.getStyleOnlineRule()); 
            pushFollow(FOLLOW_1);
            ruleStyleOnline();

            state._fsp--;

             after(grammarAccess.getStyleOnlineRule()); 
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
    // $ANTLR end "entryRuleStyleOnline"


    // $ANTLR start "ruleStyleOnline"
    // InternalT2A.g:187:1: ruleStyleOnline : ( ( rule__StyleOnline__Group__0 ) ) ;
    public final void ruleStyleOnline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:191:2: ( ( ( rule__StyleOnline__Group__0 ) ) )
            // InternalT2A.g:192:2: ( ( rule__StyleOnline__Group__0 ) )
            {
            // InternalT2A.g:192:2: ( ( rule__StyleOnline__Group__0 ) )
            // InternalT2A.g:193:3: ( rule__StyleOnline__Group__0 )
            {
             before(grammarAccess.getStyleOnlineAccess().getGroup()); 
            // InternalT2A.g:194:3: ( rule__StyleOnline__Group__0 )
            // InternalT2A.g:194:4: rule__StyleOnline__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StyleOnline__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStyleOnlineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStyleOnline"


    // $ANTLR start "entryRuleJSOnline"
    // InternalT2A.g:203:1: entryRuleJSOnline : ruleJSOnline EOF ;
    public final void entryRuleJSOnline() throws RecognitionException {
        try {
            // InternalT2A.g:204:1: ( ruleJSOnline EOF )
            // InternalT2A.g:205:1: ruleJSOnline EOF
            {
             before(grammarAccess.getJSOnlineRule()); 
            pushFollow(FOLLOW_1);
            ruleJSOnline();

            state._fsp--;

             after(grammarAccess.getJSOnlineRule()); 
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
    // $ANTLR end "entryRuleJSOnline"


    // $ANTLR start "ruleJSOnline"
    // InternalT2A.g:212:1: ruleJSOnline : ( ( rule__JSOnline__Group__0 ) ) ;
    public final void ruleJSOnline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:216:2: ( ( ( rule__JSOnline__Group__0 ) ) )
            // InternalT2A.g:217:2: ( ( rule__JSOnline__Group__0 ) )
            {
            // InternalT2A.g:217:2: ( ( rule__JSOnline__Group__0 ) )
            // InternalT2A.g:218:3: ( rule__JSOnline__Group__0 )
            {
             before(grammarAccess.getJSOnlineAccess().getGroup()); 
            // InternalT2A.g:219:3: ( rule__JSOnline__Group__0 )
            // InternalT2A.g:219:4: rule__JSOnline__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JSOnline__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJSOnlineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJSOnline"


    // $ANTLR start "entryRuleStyleClass"
    // InternalT2A.g:228:1: entryRuleStyleClass : ruleStyleClass EOF ;
    public final void entryRuleStyleClass() throws RecognitionException {
        try {
            // InternalT2A.g:229:1: ( ruleStyleClass EOF )
            // InternalT2A.g:230:1: ruleStyleClass EOF
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
    // InternalT2A.g:237:1: ruleStyleClass : ( ( rule__StyleClass__Group__0 ) ) ;
    public final void ruleStyleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:241:2: ( ( ( rule__StyleClass__Group__0 ) ) )
            // InternalT2A.g:242:2: ( ( rule__StyleClass__Group__0 ) )
            {
            // InternalT2A.g:242:2: ( ( rule__StyleClass__Group__0 ) )
            // InternalT2A.g:243:3: ( rule__StyleClass__Group__0 )
            {
             before(grammarAccess.getStyleClassAccess().getGroup()); 
            // InternalT2A.g:244:3: ( rule__StyleClass__Group__0 )
            // InternalT2A.g:244:4: rule__StyleClass__Group__0
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
    // InternalT2A.g:253:1: entryRuleSAttributeAndValue : ruleSAttributeAndValue EOF ;
    public final void entryRuleSAttributeAndValue() throws RecognitionException {
        try {
            // InternalT2A.g:254:1: ( ruleSAttributeAndValue EOF )
            // InternalT2A.g:255:1: ruleSAttributeAndValue EOF
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
    // InternalT2A.g:262:1: ruleSAttributeAndValue : ( ( rule__SAttributeAndValue__Group__0 ) ) ;
    public final void ruleSAttributeAndValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:266:2: ( ( ( rule__SAttributeAndValue__Group__0 ) ) )
            // InternalT2A.g:267:2: ( ( rule__SAttributeAndValue__Group__0 ) )
            {
            // InternalT2A.g:267:2: ( ( rule__SAttributeAndValue__Group__0 ) )
            // InternalT2A.g:268:3: ( rule__SAttributeAndValue__Group__0 )
            {
             before(grammarAccess.getSAttributeAndValueAccess().getGroup()); 
            // InternalT2A.g:269:3: ( rule__SAttributeAndValue__Group__0 )
            // InternalT2A.g:269:4: rule__SAttributeAndValue__Group__0
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
    // InternalT2A.g:278:1: entryRuleDOM : ruleDOM EOF ;
    public final void entryRuleDOM() throws RecognitionException {
        try {
            // InternalT2A.g:279:1: ( ruleDOM EOF )
            // InternalT2A.g:280:1: ruleDOM EOF
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
    // InternalT2A.g:287:1: ruleDOM : ( ( rule__DOM__Group__0 ) ) ;
    public final void ruleDOM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:291:2: ( ( ( rule__DOM__Group__0 ) ) )
            // InternalT2A.g:292:2: ( ( rule__DOM__Group__0 ) )
            {
            // InternalT2A.g:292:2: ( ( rule__DOM__Group__0 ) )
            // InternalT2A.g:293:3: ( rule__DOM__Group__0 )
            {
             before(grammarAccess.getDOMAccess().getGroup()); 
            // InternalT2A.g:294:3: ( rule__DOM__Group__0 )
            // InternalT2A.g:294:4: rule__DOM__Group__0
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
    // InternalT2A.g:303:1: entryRuleComp : ruleComp EOF ;
    public final void entryRuleComp() throws RecognitionException {
        try {
            // InternalT2A.g:304:1: ( ruleComp EOF )
            // InternalT2A.g:305:1: ruleComp EOF
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
    // InternalT2A.g:312:1: ruleComp : ( ( rule__Comp__Group__0 ) ) ;
    public final void ruleComp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:316:2: ( ( ( rule__Comp__Group__0 ) ) )
            // InternalT2A.g:317:2: ( ( rule__Comp__Group__0 ) )
            {
            // InternalT2A.g:317:2: ( ( rule__Comp__Group__0 ) )
            // InternalT2A.g:318:3: ( rule__Comp__Group__0 )
            {
             before(grammarAccess.getCompAccess().getGroup()); 
            // InternalT2A.g:319:3: ( rule__Comp__Group__0 )
            // InternalT2A.g:319:4: rule__Comp__Group__0
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
    // InternalT2A.g:328:1: entryRuleInstanciaEDOM : ruleInstanciaEDOM EOF ;
    public final void entryRuleInstanciaEDOM() throws RecognitionException {
        try {
            // InternalT2A.g:329:1: ( ruleInstanciaEDOM EOF )
            // InternalT2A.g:330:1: ruleInstanciaEDOM EOF
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
    // InternalT2A.g:337:1: ruleInstanciaEDOM : ( ( rule__InstanciaEDOM__Group__0 ) ) ;
    public final void ruleInstanciaEDOM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:341:2: ( ( ( rule__InstanciaEDOM__Group__0 ) ) )
            // InternalT2A.g:342:2: ( ( rule__InstanciaEDOM__Group__0 ) )
            {
            // InternalT2A.g:342:2: ( ( rule__InstanciaEDOM__Group__0 ) )
            // InternalT2A.g:343:3: ( rule__InstanciaEDOM__Group__0 )
            {
             before(grammarAccess.getInstanciaEDOMAccess().getGroup()); 
            // InternalT2A.g:344:3: ( rule__InstanciaEDOM__Group__0 )
            // InternalT2A.g:344:4: rule__InstanciaEDOM__Group__0
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
    // InternalT2A.g:353:1: entryRuleInstanceEDOMFeature : ruleInstanceEDOMFeature EOF ;
    public final void entryRuleInstanceEDOMFeature() throws RecognitionException {
        try {
            // InternalT2A.g:354:1: ( ruleInstanceEDOMFeature EOF )
            // InternalT2A.g:355:1: ruleInstanceEDOMFeature EOF
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
    // InternalT2A.g:362:1: ruleInstanceEDOMFeature : ( ( rule__InstanceEDOMFeature__Alternatives ) ) ;
    public final void ruleInstanceEDOMFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:366:2: ( ( ( rule__InstanceEDOMFeature__Alternatives ) ) )
            // InternalT2A.g:367:2: ( ( rule__InstanceEDOMFeature__Alternatives ) )
            {
            // InternalT2A.g:367:2: ( ( rule__InstanceEDOMFeature__Alternatives ) )
            // InternalT2A.g:368:3: ( rule__InstanceEDOMFeature__Alternatives )
            {
             before(grammarAccess.getInstanceEDOMFeatureAccess().getAlternatives()); 
            // InternalT2A.g:369:3: ( rule__InstanceEDOMFeature__Alternatives )
            // InternalT2A.g:369:4: rule__InstanceEDOMFeature__Alternatives
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
    // InternalT2A.g:378:1: entryRulePageFeature : rulePageFeature EOF ;
    public final void entryRulePageFeature() throws RecognitionException {
        try {
            // InternalT2A.g:379:1: ( rulePageFeature EOF )
            // InternalT2A.g:380:1: rulePageFeature EOF
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
    // InternalT2A.g:387:1: rulePageFeature : ( ( rule__PageFeature__Alternatives ) ) ;
    public final void rulePageFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:391:2: ( ( ( rule__PageFeature__Alternatives ) ) )
            // InternalT2A.g:392:2: ( ( rule__PageFeature__Alternatives ) )
            {
            // InternalT2A.g:392:2: ( ( rule__PageFeature__Alternatives ) )
            // InternalT2A.g:393:3: ( rule__PageFeature__Alternatives )
            {
             before(grammarAccess.getPageFeatureAccess().getAlternatives()); 
            // InternalT2A.g:394:3: ( rule__PageFeature__Alternatives )
            // InternalT2A.g:394:4: rule__PageFeature__Alternatives
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
    // InternalT2A.g:403:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalT2A.g:404:1: ( ruleFeature EOF )
            // InternalT2A.g:405:1: ruleFeature EOF
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
    // InternalT2A.g:412:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:416:2: ( ( ( rule__Feature__Alternatives ) ) )
            // InternalT2A.g:417:2: ( ( rule__Feature__Alternatives ) )
            {
            // InternalT2A.g:417:2: ( ( rule__Feature__Alternatives ) )
            // InternalT2A.g:418:3: ( rule__Feature__Alternatives )
            {
             before(grammarAccess.getFeatureAccess().getAlternatives()); 
            // InternalT2A.g:419:3: ( rule__Feature__Alternatives )
            // InternalT2A.g:419:4: rule__Feature__Alternatives
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
    // InternalT2A.g:428:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalT2A.g:429:1: ( ruleName EOF )
            // InternalT2A.g:430:1: ruleName EOF
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
    // InternalT2A.g:437:1: ruleName : ( ( rule__Name__Alternatives )* ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:441:2: ( ( ( rule__Name__Alternatives )* ) )
            // InternalT2A.g:442:2: ( ( rule__Name__Alternatives )* )
            {
            // InternalT2A.g:442:2: ( ( rule__Name__Alternatives )* )
            // InternalT2A.g:443:3: ( rule__Name__Alternatives )*
            {
             before(grammarAccess.getNameAccess().getAlternatives()); 
            // InternalT2A.g:444:3: ( rule__Name__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=12 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalT2A.g:444:4: rule__Name__Alternatives
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
    // InternalT2A.g:452:1: rule__Element__Alternatives : ( ( rulePage ) | ( ruleEDOM ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:456:1: ( ( rulePage ) | ( ruleEDOM ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==27||LA2_0==31||LA2_0==33) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalT2A.g:457:2: ( rulePage )
                    {
                    // InternalT2A.g:457:2: ( rulePage )
                    // InternalT2A.g:458:3: rulePage
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
                    // InternalT2A.g:463:2: ( ruleEDOM )
                    {
                    // InternalT2A.g:463:2: ( ruleEDOM )
                    // InternalT2A.g:464:3: ruleEDOM
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
    // InternalT2A.g:473:1: rule__EDOM__Alternatives : ( ( ruleDOM ) | ( ruleComp ) | ( ruleStyleClass ) );
    public final void rule__EDOM__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:477:1: ( ( ruleDOM ) | ( ruleComp ) | ( ruleStyleClass ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt3=1;
                }
                break;
            case 33:
                {
                alt3=2;
                }
                break;
            case 27:
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
                    // InternalT2A.g:478:2: ( ruleDOM )
                    {
                    // InternalT2A.g:478:2: ( ruleDOM )
                    // InternalT2A.g:479:3: ruleDOM
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
                    // InternalT2A.g:484:2: ( ruleComp )
                    {
                    // InternalT2A.g:484:2: ( ruleComp )
                    // InternalT2A.g:485:3: ruleComp
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
                    // InternalT2A.g:490:2: ( ruleStyleClass )
                    {
                    // InternalT2A.g:490:2: ( ruleStyleClass )
                    // InternalT2A.g:491:3: ruleStyleClass
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
    // InternalT2A.g:500:1: rule__InstanceEDOMFeature__Alternatives : ( ( ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__InstanceEDOMFeature__StringAssignment_1 ) ) );
    public final void rule__InstanceEDOMFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:504:1: ( ( ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__InstanceEDOMFeature__StringAssignment_1 ) ) )
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
                    // InternalT2A.g:505:2: ( ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 ) )
                    {
                    // InternalT2A.g:505:2: ( ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 ) )
                    // InternalT2A.g:506:3: ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 )
                    {
                     before(grammarAccess.getInstanceEDOMFeatureAccess().getInstanciaEDOMAssignment_0()); 
                    // InternalT2A.g:507:3: ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 )
                    // InternalT2A.g:507:4: rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0
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
                    // InternalT2A.g:511:2: ( ( rule__InstanceEDOMFeature__StringAssignment_1 ) )
                    {
                    // InternalT2A.g:511:2: ( ( rule__InstanceEDOMFeature__StringAssignment_1 ) )
                    // InternalT2A.g:512:3: ( rule__InstanceEDOMFeature__StringAssignment_1 )
                    {
                     before(grammarAccess.getInstanceEDOMFeatureAccess().getStringAssignment_1()); 
                    // InternalT2A.g:513:3: ( rule__InstanceEDOMFeature__StringAssignment_1 )
                    // InternalT2A.g:513:4: rule__InstanceEDOMFeature__StringAssignment_1
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
    // InternalT2A.g:521:1: rule__PageFeature__Alternatives : ( ( ( rule__PageFeature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__PageFeature__StringAssignment_1 ) ) );
    public final void rule__PageFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:525:1: ( ( ( rule__PageFeature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__PageFeature__StringAssignment_1 ) ) )
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
                    // InternalT2A.g:526:2: ( ( rule__PageFeature__InstanciaEDOMAssignment_0 ) )
                    {
                    // InternalT2A.g:526:2: ( ( rule__PageFeature__InstanciaEDOMAssignment_0 ) )
                    // InternalT2A.g:527:3: ( rule__PageFeature__InstanciaEDOMAssignment_0 )
                    {
                     before(grammarAccess.getPageFeatureAccess().getInstanciaEDOMAssignment_0()); 
                    // InternalT2A.g:528:3: ( rule__PageFeature__InstanciaEDOMAssignment_0 )
                    // InternalT2A.g:528:4: rule__PageFeature__InstanciaEDOMAssignment_0
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
                    // InternalT2A.g:532:2: ( ( rule__PageFeature__StringAssignment_1 ) )
                    {
                    // InternalT2A.g:532:2: ( ( rule__PageFeature__StringAssignment_1 ) )
                    // InternalT2A.g:533:3: ( rule__PageFeature__StringAssignment_1 )
                    {
                     before(grammarAccess.getPageFeatureAccess().getStringAssignment_1()); 
                    // InternalT2A.g:534:3: ( rule__PageFeature__StringAssignment_1 )
                    // InternalT2A.g:534:4: rule__PageFeature__StringAssignment_1
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
    // InternalT2A.g:542:1: rule__Feature__Alternatives : ( ( ( rule__Feature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__Feature__AllowSlotAssignment_1 ) ) | ( ( rule__Feature__StringAssignment_2 ) ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:546:1: ( ( ( rule__Feature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__Feature__AllowSlotAssignment_1 ) ) | ( ( rule__Feature__StringAssignment_2 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 36:
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
                    // InternalT2A.g:547:2: ( ( rule__Feature__InstanciaEDOMAssignment_0 ) )
                    {
                    // InternalT2A.g:547:2: ( ( rule__Feature__InstanciaEDOMAssignment_0 ) )
                    // InternalT2A.g:548:3: ( rule__Feature__InstanciaEDOMAssignment_0 )
                    {
                     before(grammarAccess.getFeatureAccess().getInstanciaEDOMAssignment_0()); 
                    // InternalT2A.g:549:3: ( rule__Feature__InstanciaEDOMAssignment_0 )
                    // InternalT2A.g:549:4: rule__Feature__InstanciaEDOMAssignment_0
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
                    // InternalT2A.g:553:2: ( ( rule__Feature__AllowSlotAssignment_1 ) )
                    {
                    // InternalT2A.g:553:2: ( ( rule__Feature__AllowSlotAssignment_1 ) )
                    // InternalT2A.g:554:3: ( rule__Feature__AllowSlotAssignment_1 )
                    {
                     before(grammarAccess.getFeatureAccess().getAllowSlotAssignment_1()); 
                    // InternalT2A.g:555:3: ( rule__Feature__AllowSlotAssignment_1 )
                    // InternalT2A.g:555:4: rule__Feature__AllowSlotAssignment_1
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
                    // InternalT2A.g:559:2: ( ( rule__Feature__StringAssignment_2 ) )
                    {
                    // InternalT2A.g:559:2: ( ( rule__Feature__StringAssignment_2 ) )
                    // InternalT2A.g:560:3: ( rule__Feature__StringAssignment_2 )
                    {
                     before(grammarAccess.getFeatureAccess().getStringAssignment_2()); 
                    // InternalT2A.g:561:3: ( rule__Feature__StringAssignment_2 )
                    // InternalT2A.g:561:4: rule__Feature__StringAssignment_2
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
    // InternalT2A.g:569:1: rule__Name__Alternatives : ( ( '_' ) | ( '#' ) | ( '-' ) | ( '*' ) | ( '.' ) | ( '::' ) | ( '>' ) | ( RULE_ID ) );
    public final void rule__Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:573:1: ( ( '_' ) | ( '#' ) | ( '-' ) | ( '*' ) | ( '.' ) | ( '::' ) | ( '>' ) | ( RULE_ID ) )
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
                    // InternalT2A.g:574:2: ( '_' )
                    {
                    // InternalT2A.g:574:2: ( '_' )
                    // InternalT2A.g:575:3: '_'
                    {
                     before(grammarAccess.getNameAccess().get_Keyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().get_Keyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT2A.g:580:2: ( '#' )
                    {
                    // InternalT2A.g:580:2: ( '#' )
                    // InternalT2A.g:581:3: '#'
                    {
                     before(grammarAccess.getNameAccess().getNumberSignKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getNumberSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalT2A.g:586:2: ( '-' )
                    {
                    // InternalT2A.g:586:2: ( '-' )
                    // InternalT2A.g:587:3: '-'
                    {
                     before(grammarAccess.getNameAccess().getHyphenMinusKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getHyphenMinusKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalT2A.g:592:2: ( '*' )
                    {
                    // InternalT2A.g:592:2: ( '*' )
                    // InternalT2A.g:593:3: '*'
                    {
                     before(grammarAccess.getNameAccess().getAsteriskKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getAsteriskKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalT2A.g:598:2: ( '.' )
                    {
                    // InternalT2A.g:598:2: ( '.' )
                    // InternalT2A.g:599:3: '.'
                    {
                     before(grammarAccess.getNameAccess().getFullStopKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getFullStopKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalT2A.g:604:2: ( '::' )
                    {
                    // InternalT2A.g:604:2: ( '::' )
                    // InternalT2A.g:605:3: '::'
                    {
                     before(grammarAccess.getNameAccess().getColonColonKeyword_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getColonColonKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalT2A.g:610:2: ( '>' )
                    {
                    // InternalT2A.g:610:2: ( '>' )
                    // InternalT2A.g:611:3: '>'
                    {
                     before(grammarAccess.getNameAccess().getGreaterThanSignKeyword_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getGreaterThanSignKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalT2A.g:616:2: ( RULE_ID )
                    {
                    // InternalT2A.g:616:2: ( RULE_ID )
                    // InternalT2A.g:617:3: RULE_ID
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
    // InternalT2A.g:626:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:630:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // InternalT2A.g:631:2: rule__Root__Group__0__Impl rule__Root__Group__1
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
    // InternalT2A.g:638:1: rule__Root__Group__0__Impl : ( 'AppName:' ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:642:1: ( ( 'AppName:' ) )
            // InternalT2A.g:643:1: ( 'AppName:' )
            {
            // InternalT2A.g:643:1: ( 'AppName:' )
            // InternalT2A.g:644:2: 'AppName:'
            {
             before(grammarAccess.getRootAccess().getAppNameKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getAppNameKeyword_0()); 

            }


            }

        }
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
    // InternalT2A.g:653:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:657:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // InternalT2A.g:658:2: rule__Root__Group__1__Impl rule__Root__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Root__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__2();

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
    // InternalT2A.g:665:1: rule__Root__Group__1__Impl : ( ( rule__Root__AppNameAssignment_1 ) ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:669:1: ( ( ( rule__Root__AppNameAssignment_1 ) ) )
            // InternalT2A.g:670:1: ( ( rule__Root__AppNameAssignment_1 ) )
            {
            // InternalT2A.g:670:1: ( ( rule__Root__AppNameAssignment_1 ) )
            // InternalT2A.g:671:2: ( rule__Root__AppNameAssignment_1 )
            {
             before(grammarAccess.getRootAccess().getAppNameAssignment_1()); 
            // InternalT2A.g:672:2: ( rule__Root__AppNameAssignment_1 )
            // InternalT2A.g:672:3: rule__Root__AppNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Root__AppNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getAppNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Root__Group__2"
    // InternalT2A.g:680:1: rule__Root__Group__2 : rule__Root__Group__2__Impl rule__Root__Group__3 ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:684:1: ( rule__Root__Group__2__Impl rule__Root__Group__3 )
            // InternalT2A.g:685:2: rule__Root__Group__2__Impl rule__Root__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Root__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__3();

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
    // $ANTLR end "rule__Root__Group__2"


    // $ANTLR start "rule__Root__Group__2__Impl"
    // InternalT2A.g:692:1: rule__Root__Group__2__Impl : ( ( rule__Root__GlobalStyleAssignment_2 )? ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:696:1: ( ( ( rule__Root__GlobalStyleAssignment_2 )? ) )
            // InternalT2A.g:697:1: ( ( rule__Root__GlobalStyleAssignment_2 )? )
            {
            // InternalT2A.g:697:1: ( ( rule__Root__GlobalStyleAssignment_2 )? )
            // InternalT2A.g:698:2: ( rule__Root__GlobalStyleAssignment_2 )?
            {
             before(grammarAccess.getRootAccess().getGlobalStyleAssignment_2()); 
            // InternalT2A.g:699:2: ( rule__Root__GlobalStyleAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalT2A.g:699:3: rule__Root__GlobalStyleAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Root__GlobalStyleAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRootAccess().getGlobalStyleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__2__Impl"


    // $ANTLR start "rule__Root__Group__3"
    // InternalT2A.g:707:1: rule__Root__Group__3 : rule__Root__Group__3__Impl rule__Root__Group__4 ;
    public final void rule__Root__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:711:1: ( rule__Root__Group__3__Impl rule__Root__Group__4 )
            // InternalT2A.g:712:2: rule__Root__Group__3__Impl rule__Root__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Root__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__4();

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
    // $ANTLR end "rule__Root__Group__3"


    // $ANTLR start "rule__Root__Group__3__Impl"
    // InternalT2A.g:719:1: rule__Root__Group__3__Impl : ( ( rule__Root__StyleOnlineAssignment_3 )? ) ;
    public final void rule__Root__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:723:1: ( ( ( rule__Root__StyleOnlineAssignment_3 )? ) )
            // InternalT2A.g:724:1: ( ( rule__Root__StyleOnlineAssignment_3 )? )
            {
            // InternalT2A.g:724:1: ( ( rule__Root__StyleOnlineAssignment_3 )? )
            // InternalT2A.g:725:2: ( rule__Root__StyleOnlineAssignment_3 )?
            {
             before(grammarAccess.getRootAccess().getStyleOnlineAssignment_3()); 
            // InternalT2A.g:726:2: ( rule__Root__StyleOnlineAssignment_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalT2A.g:726:3: rule__Root__StyleOnlineAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Root__StyleOnlineAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRootAccess().getStyleOnlineAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__3__Impl"


    // $ANTLR start "rule__Root__Group__4"
    // InternalT2A.g:734:1: rule__Root__Group__4 : rule__Root__Group__4__Impl rule__Root__Group__5 ;
    public final void rule__Root__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:738:1: ( rule__Root__Group__4__Impl rule__Root__Group__5 )
            // InternalT2A.g:739:2: rule__Root__Group__4__Impl rule__Root__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Root__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__5();

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
    // $ANTLR end "rule__Root__Group__4"


    // $ANTLR start "rule__Root__Group__4__Impl"
    // InternalT2A.g:746:1: rule__Root__Group__4__Impl : ( ( rule__Root__JsOnlineAssignment_4 )? ) ;
    public final void rule__Root__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:750:1: ( ( ( rule__Root__JsOnlineAssignment_4 )? ) )
            // InternalT2A.g:751:1: ( ( rule__Root__JsOnlineAssignment_4 )? )
            {
            // InternalT2A.g:751:1: ( ( rule__Root__JsOnlineAssignment_4 )? )
            // InternalT2A.g:752:2: ( rule__Root__JsOnlineAssignment_4 )?
            {
             before(grammarAccess.getRootAccess().getJsOnlineAssignment_4()); 
            // InternalT2A.g:753:2: ( rule__Root__JsOnlineAssignment_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalT2A.g:753:3: rule__Root__JsOnlineAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Root__JsOnlineAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRootAccess().getJsOnlineAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__4__Impl"


    // $ANTLR start "rule__Root__Group__5"
    // InternalT2A.g:761:1: rule__Root__Group__5 : rule__Root__Group__5__Impl ;
    public final void rule__Root__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:765:1: ( rule__Root__Group__5__Impl )
            // InternalT2A.g:766:2: rule__Root__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__5__Impl();

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
    // $ANTLR end "rule__Root__Group__5"


    // $ANTLR start "rule__Root__Group__5__Impl"
    // InternalT2A.g:772:1: rule__Root__Group__5__Impl : ( ( ( rule__Root__ElementsAssignment_5 ) ) ( ( rule__Root__ElementsAssignment_5 )* ) ) ;
    public final void rule__Root__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:776:1: ( ( ( ( rule__Root__ElementsAssignment_5 ) ) ( ( rule__Root__ElementsAssignment_5 )* ) ) )
            // InternalT2A.g:777:1: ( ( ( rule__Root__ElementsAssignment_5 ) ) ( ( rule__Root__ElementsAssignment_5 )* ) )
            {
            // InternalT2A.g:777:1: ( ( ( rule__Root__ElementsAssignment_5 ) ) ( ( rule__Root__ElementsAssignment_5 )* ) )
            // InternalT2A.g:778:2: ( ( rule__Root__ElementsAssignment_5 ) ) ( ( rule__Root__ElementsAssignment_5 )* )
            {
            // InternalT2A.g:778:2: ( ( rule__Root__ElementsAssignment_5 ) )
            // InternalT2A.g:779:3: ( rule__Root__ElementsAssignment_5 )
            {
             before(grammarAccess.getRootAccess().getElementsAssignment_5()); 
            // InternalT2A.g:780:3: ( rule__Root__ElementsAssignment_5 )
            // InternalT2A.g:780:4: rule__Root__ElementsAssignment_5
            {
            pushFollow(FOLLOW_6);
            rule__Root__ElementsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getElementsAssignment_5()); 

            }

            // InternalT2A.g:783:2: ( ( rule__Root__ElementsAssignment_5 )* )
            // InternalT2A.g:784:3: ( rule__Root__ElementsAssignment_5 )*
            {
             before(grammarAccess.getRootAccess().getElementsAssignment_5()); 
            // InternalT2A.g:785:3: ( rule__Root__ElementsAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20||LA11_0==27||LA11_0==31||LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalT2A.g:785:4: rule__Root__ElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Root__ElementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getRootAccess().getElementsAssignment_5()); 

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
    // $ANTLR end "rule__Root__Group__5__Impl"


    // $ANTLR start "rule__Page__Group__0"
    // InternalT2A.g:795:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:799:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // InternalT2A.g:800:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalT2A.g:807:1: rule__Page__Group__0__Impl : ( 'Page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:811:1: ( ( 'Page' ) )
            // InternalT2A.g:812:1: ( 'Page' )
            {
            // InternalT2A.g:812:1: ( 'Page' )
            // InternalT2A.g:813:2: 'Page'
            {
             before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalT2A.g:822:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:826:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // InternalT2A.g:827:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalT2A.g:834:1: rule__Page__Group__1__Impl : ( ( rule__Page__NameAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:838:1: ( ( ( rule__Page__NameAssignment_1 ) ) )
            // InternalT2A.g:839:1: ( ( rule__Page__NameAssignment_1 ) )
            {
            // InternalT2A.g:839:1: ( ( rule__Page__NameAssignment_1 ) )
            // InternalT2A.g:840:2: ( rule__Page__NameAssignment_1 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_1()); 
            // InternalT2A.g:841:2: ( rule__Page__NameAssignment_1 )
            // InternalT2A.g:841:3: rule__Page__NameAssignment_1
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
    // InternalT2A.g:849:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:853:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // InternalT2A.g:854:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalT2A.g:861:1: rule__Page__Group__2__Impl : ( '{' ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:865:1: ( ( '{' ) )
            // InternalT2A.g:866:1: ( '{' )
            {
            // InternalT2A.g:866:1: ( '{' )
            // InternalT2A.g:867:2: '{'
            {
             before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalT2A.g:876:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:880:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // InternalT2A.g:881:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalT2A.g:888:1: rule__Page__Group__3__Impl : ( ( rule__Page__Group_3__0 )? ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:892:1: ( ( ( rule__Page__Group_3__0 )? ) )
            // InternalT2A.g:893:1: ( ( rule__Page__Group_3__0 )? )
            {
            // InternalT2A.g:893:1: ( ( rule__Page__Group_3__0 )? )
            // InternalT2A.g:894:2: ( rule__Page__Group_3__0 )?
            {
             before(grammarAccess.getPageAccess().getGroup_3()); 
            // InternalT2A.g:895:2: ( rule__Page__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalT2A.g:895:3: rule__Page__Group_3__0
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
    // InternalT2A.g:903:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:907:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // InternalT2A.g:908:2: rule__Page__Group__4__Impl rule__Page__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalT2A.g:915:1: rule__Page__Group__4__Impl : ( ( rule__Page__HomeAssignment_4 )? ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:919:1: ( ( ( rule__Page__HomeAssignment_4 )? ) )
            // InternalT2A.g:920:1: ( ( rule__Page__HomeAssignment_4 )? )
            {
            // InternalT2A.g:920:1: ( ( rule__Page__HomeAssignment_4 )? )
            // InternalT2A.g:921:2: ( rule__Page__HomeAssignment_4 )?
            {
             before(grammarAccess.getPageAccess().getHomeAssignment_4()); 
            // InternalT2A.g:922:2: ( rule__Page__HomeAssignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalT2A.g:922:3: rule__Page__HomeAssignment_4
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
    // InternalT2A.g:930:1: rule__Page__Group__5 : rule__Page__Group__5__Impl rule__Page__Group__6 ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:934:1: ( rule__Page__Group__5__Impl rule__Page__Group__6 )
            // InternalT2A.g:935:2: rule__Page__Group__5__Impl rule__Page__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalT2A.g:942:1: rule__Page__Group__5__Impl : ( ( rule__Page__ShowInNavAssignment_5 )? ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:946:1: ( ( ( rule__Page__ShowInNavAssignment_5 )? ) )
            // InternalT2A.g:947:1: ( ( rule__Page__ShowInNavAssignment_5 )? )
            {
            // InternalT2A.g:947:1: ( ( rule__Page__ShowInNavAssignment_5 )? )
            // InternalT2A.g:948:2: ( rule__Page__ShowInNavAssignment_5 )?
            {
             before(grammarAccess.getPageAccess().getShowInNavAssignment_5()); 
            // InternalT2A.g:949:2: ( rule__Page__ShowInNavAssignment_5 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalT2A.g:949:3: rule__Page__ShowInNavAssignment_5
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
    // InternalT2A.g:957:1: rule__Page__Group__6 : rule__Page__Group__6__Impl rule__Page__Group__7 ;
    public final void rule__Page__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:961:1: ( rule__Page__Group__6__Impl rule__Page__Group__7 )
            // InternalT2A.g:962:2: rule__Page__Group__6__Impl rule__Page__Group__7
            {
            pushFollow(FOLLOW_9);
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
    // InternalT2A.g:969:1: rule__Page__Group__6__Impl : ( ( rule__Page__PageFeaturesAssignment_6 )* ) ;
    public final void rule__Page__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:973:1: ( ( ( rule__Page__PageFeaturesAssignment_6 )* ) )
            // InternalT2A.g:974:1: ( ( rule__Page__PageFeaturesAssignment_6 )* )
            {
            // InternalT2A.g:974:1: ( ( rule__Page__PageFeaturesAssignment_6 )* )
            // InternalT2A.g:975:2: ( rule__Page__PageFeaturesAssignment_6 )*
            {
             before(grammarAccess.getPageAccess().getPageFeaturesAssignment_6()); 
            // InternalT2A.g:976:2: ( rule__Page__PageFeaturesAssignment_6 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_STRING)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalT2A.g:976:3: rule__Page__PageFeaturesAssignment_6
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Page__PageFeaturesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalT2A.g:984:1: rule__Page__Group__7 : rule__Page__Group__7__Impl ;
    public final void rule__Page__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:988:1: ( rule__Page__Group__7__Impl )
            // InternalT2A.g:989:2: rule__Page__Group__7__Impl
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
    // InternalT2A.g:995:1: rule__Page__Group__7__Impl : ( '}' ) ;
    public final void rule__Page__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:999:1: ( ( '}' ) )
            // InternalT2A.g:1000:1: ( '}' )
            {
            // InternalT2A.g:1000:1: ( '}' )
            // InternalT2A.g:1001:2: '}'
            {
             before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
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
    // InternalT2A.g:1011:1: rule__Page__Group_3__0 : rule__Page__Group_3__0__Impl rule__Page__Group_3__1 ;
    public final void rule__Page__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1015:1: ( rule__Page__Group_3__0__Impl rule__Page__Group_3__1 )
            // InternalT2A.g:1016:2: rule__Page__Group_3__0__Impl rule__Page__Group_3__1
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
    // InternalT2A.g:1023:1: rule__Page__Group_3__0__Impl : ( 'sclass' ) ;
    public final void rule__Page__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1027:1: ( ( 'sclass' ) )
            // InternalT2A.g:1028:1: ( 'sclass' )
            {
            // InternalT2A.g:1028:1: ( 'sclass' )
            // InternalT2A.g:1029:2: 'sclass'
            {
             before(grammarAccess.getPageAccess().getSclassKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalT2A.g:1038:1: rule__Page__Group_3__1 : rule__Page__Group_3__1__Impl rule__Page__Group_3__2 ;
    public final void rule__Page__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1042:1: ( rule__Page__Group_3__1__Impl rule__Page__Group_3__2 )
            // InternalT2A.g:1043:2: rule__Page__Group_3__1__Impl rule__Page__Group_3__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalT2A.g:1050:1: rule__Page__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Page__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1054:1: ( ( '{' ) )
            // InternalT2A.g:1055:1: ( '{' )
            {
            // InternalT2A.g:1055:1: ( '{' )
            // InternalT2A.g:1056:2: '{'
            {
             before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalT2A.g:1065:1: rule__Page__Group_3__2 : rule__Page__Group_3__2__Impl rule__Page__Group_3__3 ;
    public final void rule__Page__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1069:1: ( rule__Page__Group_3__2__Impl rule__Page__Group_3__3 )
            // InternalT2A.g:1070:2: rule__Page__Group_3__2__Impl rule__Page__Group_3__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalT2A.g:1077:1: rule__Page__Group_3__2__Impl : ( ( rule__Page__HostclassesAssignment_3_2 )* ) ;
    public final void rule__Page__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1081:1: ( ( ( rule__Page__HostclassesAssignment_3_2 )* ) )
            // InternalT2A.g:1082:1: ( ( rule__Page__HostclassesAssignment_3_2 )* )
            {
            // InternalT2A.g:1082:1: ( ( rule__Page__HostclassesAssignment_3_2 )* )
            // InternalT2A.g:1083:2: ( rule__Page__HostclassesAssignment_3_2 )*
            {
             before(grammarAccess.getPageAccess().getHostclassesAssignment_3_2()); 
            // InternalT2A.g:1084:2: ( rule__Page__HostclassesAssignment_3_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalT2A.g:1084:3: rule__Page__HostclassesAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Page__HostclassesAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalT2A.g:1092:1: rule__Page__Group_3__3 : rule__Page__Group_3__3__Impl ;
    public final void rule__Page__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1096:1: ( rule__Page__Group_3__3__Impl )
            // InternalT2A.g:1097:2: rule__Page__Group_3__3__Impl
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
    // InternalT2A.g:1103:1: rule__Page__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Page__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1107:1: ( ( '}' ) )
            // InternalT2A.g:1108:1: ( '}' )
            {
            // InternalT2A.g:1108:1: ( '}' )
            // InternalT2A.g:1109:2: '}'
            {
             before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalT2A.g:1119:1: rule__StyleGlobal__Group__0 : rule__StyleGlobal__Group__0__Impl rule__StyleGlobal__Group__1 ;
    public final void rule__StyleGlobal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1123:1: ( rule__StyleGlobal__Group__0__Impl rule__StyleGlobal__Group__1 )
            // InternalT2A.g:1124:2: rule__StyleGlobal__Group__0__Impl rule__StyleGlobal__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalT2A.g:1131:1: rule__StyleGlobal__Group__0__Impl : ( () ) ;
    public final void rule__StyleGlobal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1135:1: ( ( () ) )
            // InternalT2A.g:1136:1: ( () )
            {
            // InternalT2A.g:1136:1: ( () )
            // InternalT2A.g:1137:2: ()
            {
             before(grammarAccess.getStyleGlobalAccess().getStyleGlobalAction_0()); 
            // InternalT2A.g:1138:2: ()
            // InternalT2A.g:1138:3: 
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
    // InternalT2A.g:1146:1: rule__StyleGlobal__Group__1 : rule__StyleGlobal__Group__1__Impl rule__StyleGlobal__Group__2 ;
    public final void rule__StyleGlobal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1150:1: ( rule__StyleGlobal__Group__1__Impl rule__StyleGlobal__Group__2 )
            // InternalT2A.g:1151:2: rule__StyleGlobal__Group__1__Impl rule__StyleGlobal__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalT2A.g:1158:1: rule__StyleGlobal__Group__1__Impl : ( 'StyleGlobal' ) ;
    public final void rule__StyleGlobal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1162:1: ( ( 'StyleGlobal' ) )
            // InternalT2A.g:1163:1: ( 'StyleGlobal' )
            {
            // InternalT2A.g:1163:1: ( 'StyleGlobal' )
            // InternalT2A.g:1164:2: 'StyleGlobal'
            {
             before(grammarAccess.getStyleGlobalAccess().getStyleGlobalKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalT2A.g:1173:1: rule__StyleGlobal__Group__2 : rule__StyleGlobal__Group__2__Impl rule__StyleGlobal__Group__3 ;
    public final void rule__StyleGlobal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1177:1: ( rule__StyleGlobal__Group__2__Impl rule__StyleGlobal__Group__3 )
            // InternalT2A.g:1178:2: rule__StyleGlobal__Group__2__Impl rule__StyleGlobal__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalT2A.g:1185:1: rule__StyleGlobal__Group__2__Impl : ( '{' ) ;
    public final void rule__StyleGlobal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1189:1: ( ( '{' ) )
            // InternalT2A.g:1190:1: ( '{' )
            {
            // InternalT2A.g:1190:1: ( '{' )
            // InternalT2A.g:1191:2: '{'
            {
             before(grammarAccess.getStyleGlobalAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalT2A.g:1200:1: rule__StyleGlobal__Group__3 : rule__StyleGlobal__Group__3__Impl rule__StyleGlobal__Group__4 ;
    public final void rule__StyleGlobal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1204:1: ( rule__StyleGlobal__Group__3__Impl rule__StyleGlobal__Group__4 )
            // InternalT2A.g:1205:2: rule__StyleGlobal__Group__3__Impl rule__StyleGlobal__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalT2A.g:1212:1: rule__StyleGlobal__Group__3__Impl : ( ( rule__StyleGlobal__StyleclassesAssignment_3 )* ) ;
    public final void rule__StyleGlobal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1216:1: ( ( ( rule__StyleGlobal__StyleclassesAssignment_3 )* ) )
            // InternalT2A.g:1217:1: ( ( rule__StyleGlobal__StyleclassesAssignment_3 )* )
            {
            // InternalT2A.g:1217:1: ( ( rule__StyleGlobal__StyleclassesAssignment_3 )* )
            // InternalT2A.g:1218:2: ( rule__StyleGlobal__StyleclassesAssignment_3 )*
            {
             before(grammarAccess.getStyleGlobalAccess().getStyleclassesAssignment_3()); 
            // InternalT2A.g:1219:2: ( rule__StyleGlobal__StyleclassesAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalT2A.g:1219:3: rule__StyleGlobal__StyleclassesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__StyleGlobal__StyleclassesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalT2A.g:1227:1: rule__StyleGlobal__Group__4 : rule__StyleGlobal__Group__4__Impl ;
    public final void rule__StyleGlobal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1231:1: ( rule__StyleGlobal__Group__4__Impl )
            // InternalT2A.g:1232:2: rule__StyleGlobal__Group__4__Impl
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
    // InternalT2A.g:1238:1: rule__StyleGlobal__Group__4__Impl : ( '}' ) ;
    public final void rule__StyleGlobal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1242:1: ( ( '}' ) )
            // InternalT2A.g:1243:1: ( '}' )
            {
            // InternalT2A.g:1243:1: ( '}' )
            // InternalT2A.g:1244:2: '}'
            {
             before(grammarAccess.getStyleGlobalAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
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


    // $ANTLR start "rule__StyleOnline__Group__0"
    // InternalT2A.g:1254:1: rule__StyleOnline__Group__0 : rule__StyleOnline__Group__0__Impl rule__StyleOnline__Group__1 ;
    public final void rule__StyleOnline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1258:1: ( rule__StyleOnline__Group__0__Impl rule__StyleOnline__Group__1 )
            // InternalT2A.g:1259:2: rule__StyleOnline__Group__0__Impl rule__StyleOnline__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__StyleOnline__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleOnline__Group__1();

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
    // $ANTLR end "rule__StyleOnline__Group__0"


    // $ANTLR start "rule__StyleOnline__Group__0__Impl"
    // InternalT2A.g:1266:1: rule__StyleOnline__Group__0__Impl : ( () ) ;
    public final void rule__StyleOnline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1270:1: ( ( () ) )
            // InternalT2A.g:1271:1: ( () )
            {
            // InternalT2A.g:1271:1: ( () )
            // InternalT2A.g:1272:2: ()
            {
             before(grammarAccess.getStyleOnlineAccess().getStyleOnlineAction_0()); 
            // InternalT2A.g:1273:2: ()
            // InternalT2A.g:1273:3: 
            {
            }

             after(grammarAccess.getStyleOnlineAccess().getStyleOnlineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleOnline__Group__0__Impl"


    // $ANTLR start "rule__StyleOnline__Group__1"
    // InternalT2A.g:1281:1: rule__StyleOnline__Group__1 : rule__StyleOnline__Group__1__Impl rule__StyleOnline__Group__2 ;
    public final void rule__StyleOnline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1285:1: ( rule__StyleOnline__Group__1__Impl rule__StyleOnline__Group__2 )
            // InternalT2A.g:1286:2: rule__StyleOnline__Group__1__Impl rule__StyleOnline__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__StyleOnline__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleOnline__Group__2();

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
    // $ANTLR end "rule__StyleOnline__Group__1"


    // $ANTLR start "rule__StyleOnline__Group__1__Impl"
    // InternalT2A.g:1293:1: rule__StyleOnline__Group__1__Impl : ( 'StyleOnline' ) ;
    public final void rule__StyleOnline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1297:1: ( ( 'StyleOnline' ) )
            // InternalT2A.g:1298:1: ( 'StyleOnline' )
            {
            // InternalT2A.g:1298:1: ( 'StyleOnline' )
            // InternalT2A.g:1299:2: 'StyleOnline'
            {
             before(grammarAccess.getStyleOnlineAccess().getStyleOnlineKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStyleOnlineAccess().getStyleOnlineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleOnline__Group__1__Impl"


    // $ANTLR start "rule__StyleOnline__Group__2"
    // InternalT2A.g:1308:1: rule__StyleOnline__Group__2 : rule__StyleOnline__Group__2__Impl rule__StyleOnline__Group__3 ;
    public final void rule__StyleOnline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1312:1: ( rule__StyleOnline__Group__2__Impl rule__StyleOnline__Group__3 )
            // InternalT2A.g:1313:2: rule__StyleOnline__Group__2__Impl rule__StyleOnline__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__StyleOnline__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleOnline__Group__3();

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
    // $ANTLR end "rule__StyleOnline__Group__2"


    // $ANTLR start "rule__StyleOnline__Group__2__Impl"
    // InternalT2A.g:1320:1: rule__StyleOnline__Group__2__Impl : ( '{' ) ;
    public final void rule__StyleOnline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1324:1: ( ( '{' ) )
            // InternalT2A.g:1325:1: ( '{' )
            {
            // InternalT2A.g:1325:1: ( '{' )
            // InternalT2A.g:1326:2: '{'
            {
             before(grammarAccess.getStyleOnlineAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStyleOnlineAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleOnline__Group__2__Impl"


    // $ANTLR start "rule__StyleOnline__Group__3"
    // InternalT2A.g:1335:1: rule__StyleOnline__Group__3 : rule__StyleOnline__Group__3__Impl rule__StyleOnline__Group__4 ;
    public final void rule__StyleOnline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1339:1: ( rule__StyleOnline__Group__3__Impl rule__StyleOnline__Group__4 )
            // InternalT2A.g:1340:2: rule__StyleOnline__Group__3__Impl rule__StyleOnline__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__StyleOnline__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StyleOnline__Group__4();

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
    // $ANTLR end "rule__StyleOnline__Group__3"


    // $ANTLR start "rule__StyleOnline__Group__3__Impl"
    // InternalT2A.g:1347:1: rule__StyleOnline__Group__3__Impl : ( ( rule__StyleOnline__FullTagsAssignment_3 )* ) ;
    public final void rule__StyleOnline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1351:1: ( ( ( rule__StyleOnline__FullTagsAssignment_3 )* ) )
            // InternalT2A.g:1352:1: ( ( rule__StyleOnline__FullTagsAssignment_3 )* )
            {
            // InternalT2A.g:1352:1: ( ( rule__StyleOnline__FullTagsAssignment_3 )* )
            // InternalT2A.g:1353:2: ( rule__StyleOnline__FullTagsAssignment_3 )*
            {
             before(grammarAccess.getStyleOnlineAccess().getFullTagsAssignment_3()); 
            // InternalT2A.g:1354:2: ( rule__StyleOnline__FullTagsAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_STRING) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalT2A.g:1354:3: rule__StyleOnline__FullTagsAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__StyleOnline__FullTagsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getStyleOnlineAccess().getFullTagsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleOnline__Group__3__Impl"


    // $ANTLR start "rule__StyleOnline__Group__4"
    // InternalT2A.g:1362:1: rule__StyleOnline__Group__4 : rule__StyleOnline__Group__4__Impl ;
    public final void rule__StyleOnline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1366:1: ( rule__StyleOnline__Group__4__Impl )
            // InternalT2A.g:1367:2: rule__StyleOnline__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StyleOnline__Group__4__Impl();

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
    // $ANTLR end "rule__StyleOnline__Group__4"


    // $ANTLR start "rule__StyleOnline__Group__4__Impl"
    // InternalT2A.g:1373:1: rule__StyleOnline__Group__4__Impl : ( '}' ) ;
    public final void rule__StyleOnline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1377:1: ( ( '}' ) )
            // InternalT2A.g:1378:1: ( '}' )
            {
            // InternalT2A.g:1378:1: ( '}' )
            // InternalT2A.g:1379:2: '}'
            {
             before(grammarAccess.getStyleOnlineAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStyleOnlineAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleOnline__Group__4__Impl"


    // $ANTLR start "rule__JSOnline__Group__0"
    // InternalT2A.g:1389:1: rule__JSOnline__Group__0 : rule__JSOnline__Group__0__Impl rule__JSOnline__Group__1 ;
    public final void rule__JSOnline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1393:1: ( rule__JSOnline__Group__0__Impl rule__JSOnline__Group__1 )
            // InternalT2A.g:1394:2: rule__JSOnline__Group__0__Impl rule__JSOnline__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__JSOnline__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSOnline__Group__1();

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
    // $ANTLR end "rule__JSOnline__Group__0"


    // $ANTLR start "rule__JSOnline__Group__0__Impl"
    // InternalT2A.g:1401:1: rule__JSOnline__Group__0__Impl : ( () ) ;
    public final void rule__JSOnline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1405:1: ( ( () ) )
            // InternalT2A.g:1406:1: ( () )
            {
            // InternalT2A.g:1406:1: ( () )
            // InternalT2A.g:1407:2: ()
            {
             before(grammarAccess.getJSOnlineAccess().getJSOnlineAction_0()); 
            // InternalT2A.g:1408:2: ()
            // InternalT2A.g:1408:3: 
            {
            }

             after(grammarAccess.getJSOnlineAccess().getJSOnlineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSOnline__Group__0__Impl"


    // $ANTLR start "rule__JSOnline__Group__1"
    // InternalT2A.g:1416:1: rule__JSOnline__Group__1 : rule__JSOnline__Group__1__Impl rule__JSOnline__Group__2 ;
    public final void rule__JSOnline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1420:1: ( rule__JSOnline__Group__1__Impl rule__JSOnline__Group__2 )
            // InternalT2A.g:1421:2: rule__JSOnline__Group__1__Impl rule__JSOnline__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__JSOnline__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSOnline__Group__2();

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
    // $ANTLR end "rule__JSOnline__Group__1"


    // $ANTLR start "rule__JSOnline__Group__1__Impl"
    // InternalT2A.g:1428:1: rule__JSOnline__Group__1__Impl : ( 'JSOnline' ) ;
    public final void rule__JSOnline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1432:1: ( ( 'JSOnline' ) )
            // InternalT2A.g:1433:1: ( 'JSOnline' )
            {
            // InternalT2A.g:1433:1: ( 'JSOnline' )
            // InternalT2A.g:1434:2: 'JSOnline'
            {
             before(grammarAccess.getJSOnlineAccess().getJSOnlineKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getJSOnlineAccess().getJSOnlineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSOnline__Group__1__Impl"


    // $ANTLR start "rule__JSOnline__Group__2"
    // InternalT2A.g:1443:1: rule__JSOnline__Group__2 : rule__JSOnline__Group__2__Impl rule__JSOnline__Group__3 ;
    public final void rule__JSOnline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1447:1: ( rule__JSOnline__Group__2__Impl rule__JSOnline__Group__3 )
            // InternalT2A.g:1448:2: rule__JSOnline__Group__2__Impl rule__JSOnline__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__JSOnline__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSOnline__Group__3();

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
    // $ANTLR end "rule__JSOnline__Group__2"


    // $ANTLR start "rule__JSOnline__Group__2__Impl"
    // InternalT2A.g:1455:1: rule__JSOnline__Group__2__Impl : ( '{' ) ;
    public final void rule__JSOnline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1459:1: ( ( '{' ) )
            // InternalT2A.g:1460:1: ( '{' )
            {
            // InternalT2A.g:1460:1: ( '{' )
            // InternalT2A.g:1461:2: '{'
            {
             before(grammarAccess.getJSOnlineAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getJSOnlineAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSOnline__Group__2__Impl"


    // $ANTLR start "rule__JSOnline__Group__3"
    // InternalT2A.g:1470:1: rule__JSOnline__Group__3 : rule__JSOnline__Group__3__Impl rule__JSOnline__Group__4 ;
    public final void rule__JSOnline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1474:1: ( rule__JSOnline__Group__3__Impl rule__JSOnline__Group__4 )
            // InternalT2A.g:1475:2: rule__JSOnline__Group__3__Impl rule__JSOnline__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__JSOnline__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSOnline__Group__4();

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
    // $ANTLR end "rule__JSOnline__Group__3"


    // $ANTLR start "rule__JSOnline__Group__3__Impl"
    // InternalT2A.g:1482:1: rule__JSOnline__Group__3__Impl : ( ( rule__JSOnline__FullTagsAssignment_3 )* ) ;
    public final void rule__JSOnline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1486:1: ( ( ( rule__JSOnline__FullTagsAssignment_3 )* ) )
            // InternalT2A.g:1487:1: ( ( rule__JSOnline__FullTagsAssignment_3 )* )
            {
            // InternalT2A.g:1487:1: ( ( rule__JSOnline__FullTagsAssignment_3 )* )
            // InternalT2A.g:1488:2: ( rule__JSOnline__FullTagsAssignment_3 )*
            {
             before(grammarAccess.getJSOnlineAccess().getFullTagsAssignment_3()); 
            // InternalT2A.g:1489:2: ( rule__JSOnline__FullTagsAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_STRING) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalT2A.g:1489:3: rule__JSOnline__FullTagsAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__JSOnline__FullTagsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getJSOnlineAccess().getFullTagsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSOnline__Group__3__Impl"


    // $ANTLR start "rule__JSOnline__Group__4"
    // InternalT2A.g:1497:1: rule__JSOnline__Group__4 : rule__JSOnline__Group__4__Impl ;
    public final void rule__JSOnline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1501:1: ( rule__JSOnline__Group__4__Impl )
            // InternalT2A.g:1502:2: rule__JSOnline__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JSOnline__Group__4__Impl();

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
    // $ANTLR end "rule__JSOnline__Group__4"


    // $ANTLR start "rule__JSOnline__Group__4__Impl"
    // InternalT2A.g:1508:1: rule__JSOnline__Group__4__Impl : ( '}' ) ;
    public final void rule__JSOnline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1512:1: ( ( '}' ) )
            // InternalT2A.g:1513:1: ( '}' )
            {
            // InternalT2A.g:1513:1: ( '}' )
            // InternalT2A.g:1514:2: '}'
            {
             before(grammarAccess.getJSOnlineAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getJSOnlineAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSOnline__Group__4__Impl"


    // $ANTLR start "rule__StyleClass__Group__0"
    // InternalT2A.g:1524:1: rule__StyleClass__Group__0 : rule__StyleClass__Group__0__Impl rule__StyleClass__Group__1 ;
    public final void rule__StyleClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1528:1: ( rule__StyleClass__Group__0__Impl rule__StyleClass__Group__1 )
            // InternalT2A.g:1529:2: rule__StyleClass__Group__0__Impl rule__StyleClass__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalT2A.g:1536:1: rule__StyleClass__Group__0__Impl : ( 'StyleClass' ) ;
    public final void rule__StyleClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1540:1: ( ( 'StyleClass' ) )
            // InternalT2A.g:1541:1: ( 'StyleClass' )
            {
            // InternalT2A.g:1541:1: ( 'StyleClass' )
            // InternalT2A.g:1542:2: 'StyleClass'
            {
             before(grammarAccess.getStyleClassAccess().getStyleClassKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalT2A.g:1551:1: rule__StyleClass__Group__1 : rule__StyleClass__Group__1__Impl rule__StyleClass__Group__2 ;
    public final void rule__StyleClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1555:1: ( rule__StyleClass__Group__1__Impl rule__StyleClass__Group__2 )
            // InternalT2A.g:1556:2: rule__StyleClass__Group__1__Impl rule__StyleClass__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalT2A.g:1563:1: rule__StyleClass__Group__1__Impl : ( ( rule__StyleClass__NameAssignment_1 ) ) ;
    public final void rule__StyleClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1567:1: ( ( ( rule__StyleClass__NameAssignment_1 ) ) )
            // InternalT2A.g:1568:1: ( ( rule__StyleClass__NameAssignment_1 ) )
            {
            // InternalT2A.g:1568:1: ( ( rule__StyleClass__NameAssignment_1 ) )
            // InternalT2A.g:1569:2: ( rule__StyleClass__NameAssignment_1 )
            {
             before(grammarAccess.getStyleClassAccess().getNameAssignment_1()); 
            // InternalT2A.g:1570:2: ( rule__StyleClass__NameAssignment_1 )
            // InternalT2A.g:1570:3: rule__StyleClass__NameAssignment_1
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
    // InternalT2A.g:1578:1: rule__StyleClass__Group__2 : rule__StyleClass__Group__2__Impl rule__StyleClass__Group__3 ;
    public final void rule__StyleClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1582:1: ( rule__StyleClass__Group__2__Impl rule__StyleClass__Group__3 )
            // InternalT2A.g:1583:2: rule__StyleClass__Group__2__Impl rule__StyleClass__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalT2A.g:1590:1: rule__StyleClass__Group__2__Impl : ( '{' ) ;
    public final void rule__StyleClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1594:1: ( ( '{' ) )
            // InternalT2A.g:1595:1: ( '{' )
            {
            // InternalT2A.g:1595:1: ( '{' )
            // InternalT2A.g:1596:2: '{'
            {
             before(grammarAccess.getStyleClassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalT2A.g:1605:1: rule__StyleClass__Group__3 : rule__StyleClass__Group__3__Impl rule__StyleClass__Group__4 ;
    public final void rule__StyleClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1609:1: ( rule__StyleClass__Group__3__Impl rule__StyleClass__Group__4 )
            // InternalT2A.g:1610:2: rule__StyleClass__Group__3__Impl rule__StyleClass__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalT2A.g:1617:1: rule__StyleClass__Group__3__Impl : ( ( rule__StyleClass__Group_3__0 )* ) ;
    public final void rule__StyleClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1621:1: ( ( ( rule__StyleClass__Group_3__0 )* ) )
            // InternalT2A.g:1622:1: ( ( rule__StyleClass__Group_3__0 )* )
            {
            // InternalT2A.g:1622:1: ( ( rule__StyleClass__Group_3__0 )* )
            // InternalT2A.g:1623:2: ( rule__StyleClass__Group_3__0 )*
            {
             before(grammarAccess.getStyleClassAccess().getGroup_3()); 
            // InternalT2A.g:1624:2: ( rule__StyleClass__Group_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==EOF||LA20_0==RULE_ID||LA20_0==RULE_STRING2||(LA20_0>=12 && LA20_0<=18)||LA20_0==21) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalT2A.g:1624:3: rule__StyleClass__Group_3__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__StyleClass__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalT2A.g:1632:1: rule__StyleClass__Group__4 : rule__StyleClass__Group__4__Impl rule__StyleClass__Group__5 ;
    public final void rule__StyleClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1636:1: ( rule__StyleClass__Group__4__Impl rule__StyleClass__Group__5 )
            // InternalT2A.g:1637:2: rule__StyleClass__Group__4__Impl rule__StyleClass__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalT2A.g:1644:1: rule__StyleClass__Group__4__Impl : ( ( rule__StyleClass__Group_4__0 )? ) ;
    public final void rule__StyleClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1648:1: ( ( ( rule__StyleClass__Group_4__0 )? ) )
            // InternalT2A.g:1649:1: ( ( rule__StyleClass__Group_4__0 )? )
            {
            // InternalT2A.g:1649:1: ( ( rule__StyleClass__Group_4__0 )? )
            // InternalT2A.g:1650:2: ( rule__StyleClass__Group_4__0 )?
            {
             before(grammarAccess.getStyleClassAccess().getGroup_4()); 
            // InternalT2A.g:1651:2: ( rule__StyleClass__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalT2A.g:1651:3: rule__StyleClass__Group_4__0
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
    // InternalT2A.g:1659:1: rule__StyleClass__Group__5 : rule__StyleClass__Group__5__Impl rule__StyleClass__Group__6 ;
    public final void rule__StyleClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1663:1: ( rule__StyleClass__Group__5__Impl rule__StyleClass__Group__6 )
            // InternalT2A.g:1664:2: rule__StyleClass__Group__5__Impl rule__StyleClass__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalT2A.g:1671:1: rule__StyleClass__Group__5__Impl : ( ( rule__StyleClass__Group_5__0 )? ) ;
    public final void rule__StyleClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1675:1: ( ( ( rule__StyleClass__Group_5__0 )? ) )
            // InternalT2A.g:1676:1: ( ( rule__StyleClass__Group_5__0 )? )
            {
            // InternalT2A.g:1676:1: ( ( rule__StyleClass__Group_5__0 )? )
            // InternalT2A.g:1677:2: ( rule__StyleClass__Group_5__0 )?
            {
             before(grammarAccess.getStyleClassAccess().getGroup_5()); 
            // InternalT2A.g:1678:2: ( rule__StyleClass__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalT2A.g:1678:3: rule__StyleClass__Group_5__0
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
    // InternalT2A.g:1686:1: rule__StyleClass__Group__6 : rule__StyleClass__Group__6__Impl ;
    public final void rule__StyleClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1690:1: ( rule__StyleClass__Group__6__Impl )
            // InternalT2A.g:1691:2: rule__StyleClass__Group__6__Impl
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
    // InternalT2A.g:1697:1: rule__StyleClass__Group__6__Impl : ( '}' ) ;
    public final void rule__StyleClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1701:1: ( ( '}' ) )
            // InternalT2A.g:1702:1: ( '}' )
            {
            // InternalT2A.g:1702:1: ( '}' )
            // InternalT2A.g:1703:2: '}'
            {
             before(grammarAccess.getStyleClassAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
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
    // InternalT2A.g:1713:1: rule__StyleClass__Group_3__0 : rule__StyleClass__Group_3__0__Impl rule__StyleClass__Group_3__1 ;
    public final void rule__StyleClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1717:1: ( rule__StyleClass__Group_3__0__Impl rule__StyleClass__Group_3__1 )
            // InternalT2A.g:1718:2: rule__StyleClass__Group_3__0__Impl rule__StyleClass__Group_3__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalT2A.g:1725:1: rule__StyleClass__Group_3__0__Impl : ( ( rule__StyleClass__SattributesAssignment_3_0 ) ) ;
    public final void rule__StyleClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1729:1: ( ( ( rule__StyleClass__SattributesAssignment_3_0 ) ) )
            // InternalT2A.g:1730:1: ( ( rule__StyleClass__SattributesAssignment_3_0 ) )
            {
            // InternalT2A.g:1730:1: ( ( rule__StyleClass__SattributesAssignment_3_0 ) )
            // InternalT2A.g:1731:2: ( rule__StyleClass__SattributesAssignment_3_0 )
            {
             before(grammarAccess.getStyleClassAccess().getSattributesAssignment_3_0()); 
            // InternalT2A.g:1732:2: ( rule__StyleClass__SattributesAssignment_3_0 )
            // InternalT2A.g:1732:3: rule__StyleClass__SattributesAssignment_3_0
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
    // InternalT2A.g:1740:1: rule__StyleClass__Group_3__1 : rule__StyleClass__Group_3__1__Impl ;
    public final void rule__StyleClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1744:1: ( rule__StyleClass__Group_3__1__Impl )
            // InternalT2A.g:1745:2: rule__StyleClass__Group_3__1__Impl
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
    // InternalT2A.g:1751:1: rule__StyleClass__Group_3__1__Impl : ( ';' ) ;
    public final void rule__StyleClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1755:1: ( ( ';' ) )
            // InternalT2A.g:1756:1: ( ';' )
            {
            // InternalT2A.g:1756:1: ( ';' )
            // InternalT2A.g:1757:2: ';'
            {
             before(grammarAccess.getStyleClassAccess().getSemicolonKeyword_3_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalT2A.g:1767:1: rule__StyleClass__Group_4__0 : rule__StyleClass__Group_4__0__Impl rule__StyleClass__Group_4__1 ;
    public final void rule__StyleClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1771:1: ( rule__StyleClass__Group_4__0__Impl rule__StyleClass__Group_4__1 )
            // InternalT2A.g:1772:2: rule__StyleClass__Group_4__0__Impl rule__StyleClass__Group_4__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalT2A.g:1779:1: rule__StyleClass__Group_4__0__Impl : ( 'after' ) ;
    public final void rule__StyleClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1783:1: ( ( 'after' ) )
            // InternalT2A.g:1784:1: ( 'after' )
            {
            // InternalT2A.g:1784:1: ( 'after' )
            // InternalT2A.g:1785:2: 'after'
            {
             before(grammarAccess.getStyleClassAccess().getAfterKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalT2A.g:1794:1: rule__StyleClass__Group_4__1 : rule__StyleClass__Group_4__1__Impl rule__StyleClass__Group_4__2 ;
    public final void rule__StyleClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1798:1: ( rule__StyleClass__Group_4__1__Impl rule__StyleClass__Group_4__2 )
            // InternalT2A.g:1799:2: rule__StyleClass__Group_4__1__Impl rule__StyleClass__Group_4__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalT2A.g:1806:1: rule__StyleClass__Group_4__1__Impl : ( '{' ) ;
    public final void rule__StyleClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1810:1: ( ( '{' ) )
            // InternalT2A.g:1811:1: ( '{' )
            {
            // InternalT2A.g:1811:1: ( '{' )
            // InternalT2A.g:1812:2: '{'
            {
             before(grammarAccess.getStyleClassAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalT2A.g:1821:1: rule__StyleClass__Group_4__2 : rule__StyleClass__Group_4__2__Impl rule__StyleClass__Group_4__3 ;
    public final void rule__StyleClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1825:1: ( rule__StyleClass__Group_4__2__Impl rule__StyleClass__Group_4__3 )
            // InternalT2A.g:1826:2: rule__StyleClass__Group_4__2__Impl rule__StyleClass__Group_4__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalT2A.g:1833:1: rule__StyleClass__Group_4__2__Impl : ( ( rule__StyleClass__Group_4_2__0 )* ) ;
    public final void rule__StyleClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1837:1: ( ( ( rule__StyleClass__Group_4_2__0 )* ) )
            // InternalT2A.g:1838:1: ( ( rule__StyleClass__Group_4_2__0 )* )
            {
            // InternalT2A.g:1838:1: ( ( rule__StyleClass__Group_4_2__0 )* )
            // InternalT2A.g:1839:2: ( rule__StyleClass__Group_4_2__0 )*
            {
             before(grammarAccess.getStyleClassAccess().getGroup_4_2()); 
            // InternalT2A.g:1840:2: ( rule__StyleClass__Group_4_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==EOF||LA23_0==RULE_ID||LA23_0==RULE_STRING2||(LA23_0>=12 && LA23_0<=18)||LA23_0==21) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalT2A.g:1840:3: rule__StyleClass__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__StyleClass__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalT2A.g:1848:1: rule__StyleClass__Group_4__3 : rule__StyleClass__Group_4__3__Impl ;
    public final void rule__StyleClass__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1852:1: ( rule__StyleClass__Group_4__3__Impl )
            // InternalT2A.g:1853:2: rule__StyleClass__Group_4__3__Impl
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
    // InternalT2A.g:1859:1: rule__StyleClass__Group_4__3__Impl : ( '}' ) ;
    public final void rule__StyleClass__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1863:1: ( ( '}' ) )
            // InternalT2A.g:1864:1: ( '}' )
            {
            // InternalT2A.g:1864:1: ( '}' )
            // InternalT2A.g:1865:2: '}'
            {
             before(grammarAccess.getStyleClassAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalT2A.g:1875:1: rule__StyleClass__Group_4_2__0 : rule__StyleClass__Group_4_2__0__Impl rule__StyleClass__Group_4_2__1 ;
    public final void rule__StyleClass__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1879:1: ( rule__StyleClass__Group_4_2__0__Impl rule__StyleClass__Group_4_2__1 )
            // InternalT2A.g:1880:2: rule__StyleClass__Group_4_2__0__Impl rule__StyleClass__Group_4_2__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalT2A.g:1887:1: rule__StyleClass__Group_4_2__0__Impl : ( ( rule__StyleClass__SattributesAfterAssignment_4_2_0 ) ) ;
    public final void rule__StyleClass__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1891:1: ( ( ( rule__StyleClass__SattributesAfterAssignment_4_2_0 ) ) )
            // InternalT2A.g:1892:1: ( ( rule__StyleClass__SattributesAfterAssignment_4_2_0 ) )
            {
            // InternalT2A.g:1892:1: ( ( rule__StyleClass__SattributesAfterAssignment_4_2_0 ) )
            // InternalT2A.g:1893:2: ( rule__StyleClass__SattributesAfterAssignment_4_2_0 )
            {
             before(grammarAccess.getStyleClassAccess().getSattributesAfterAssignment_4_2_0()); 
            // InternalT2A.g:1894:2: ( rule__StyleClass__SattributesAfterAssignment_4_2_0 )
            // InternalT2A.g:1894:3: rule__StyleClass__SattributesAfterAssignment_4_2_0
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
    // InternalT2A.g:1902:1: rule__StyleClass__Group_4_2__1 : rule__StyleClass__Group_4_2__1__Impl ;
    public final void rule__StyleClass__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1906:1: ( rule__StyleClass__Group_4_2__1__Impl )
            // InternalT2A.g:1907:2: rule__StyleClass__Group_4_2__1__Impl
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
    // InternalT2A.g:1913:1: rule__StyleClass__Group_4_2__1__Impl : ( ';' ) ;
    public final void rule__StyleClass__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1917:1: ( ( ';' ) )
            // InternalT2A.g:1918:1: ( ';' )
            {
            // InternalT2A.g:1918:1: ( ';' )
            // InternalT2A.g:1919:2: ';'
            {
             before(grammarAccess.getStyleClassAccess().getSemicolonKeyword_4_2_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalT2A.g:1929:1: rule__StyleClass__Group_5__0 : rule__StyleClass__Group_5__0__Impl rule__StyleClass__Group_5__1 ;
    public final void rule__StyleClass__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1933:1: ( rule__StyleClass__Group_5__0__Impl rule__StyleClass__Group_5__1 )
            // InternalT2A.g:1934:2: rule__StyleClass__Group_5__0__Impl rule__StyleClass__Group_5__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalT2A.g:1941:1: rule__StyleClass__Group_5__0__Impl : ( 'active' ) ;
    public final void rule__StyleClass__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1945:1: ( ( 'active' ) )
            // InternalT2A.g:1946:1: ( 'active' )
            {
            // InternalT2A.g:1946:1: ( 'active' )
            // InternalT2A.g:1947:2: 'active'
            {
             before(grammarAccess.getStyleClassAccess().getActiveKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalT2A.g:1956:1: rule__StyleClass__Group_5__1 : rule__StyleClass__Group_5__1__Impl rule__StyleClass__Group_5__2 ;
    public final void rule__StyleClass__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1960:1: ( rule__StyleClass__Group_5__1__Impl rule__StyleClass__Group_5__2 )
            // InternalT2A.g:1961:2: rule__StyleClass__Group_5__1__Impl rule__StyleClass__Group_5__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalT2A.g:1968:1: rule__StyleClass__Group_5__1__Impl : ( '{' ) ;
    public final void rule__StyleClass__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1972:1: ( ( '{' ) )
            // InternalT2A.g:1973:1: ( '{' )
            {
            // InternalT2A.g:1973:1: ( '{' )
            // InternalT2A.g:1974:2: '{'
            {
             before(grammarAccess.getStyleClassAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalT2A.g:1983:1: rule__StyleClass__Group_5__2 : rule__StyleClass__Group_5__2__Impl rule__StyleClass__Group_5__3 ;
    public final void rule__StyleClass__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1987:1: ( rule__StyleClass__Group_5__2__Impl rule__StyleClass__Group_5__3 )
            // InternalT2A.g:1988:2: rule__StyleClass__Group_5__2__Impl rule__StyleClass__Group_5__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalT2A.g:1995:1: rule__StyleClass__Group_5__2__Impl : ( ( rule__StyleClass__Group_5_2__0 )* ) ;
    public final void rule__StyleClass__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1999:1: ( ( ( rule__StyleClass__Group_5_2__0 )* ) )
            // InternalT2A.g:2000:1: ( ( rule__StyleClass__Group_5_2__0 )* )
            {
            // InternalT2A.g:2000:1: ( ( rule__StyleClass__Group_5_2__0 )* )
            // InternalT2A.g:2001:2: ( rule__StyleClass__Group_5_2__0 )*
            {
             before(grammarAccess.getStyleClassAccess().getGroup_5_2()); 
            // InternalT2A.g:2002:2: ( rule__StyleClass__Group_5_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==EOF||LA24_0==RULE_ID||LA24_0==RULE_STRING2||(LA24_0>=12 && LA24_0<=18)||LA24_0==21) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalT2A.g:2002:3: rule__StyleClass__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__StyleClass__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalT2A.g:2010:1: rule__StyleClass__Group_5__3 : rule__StyleClass__Group_5__3__Impl ;
    public final void rule__StyleClass__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2014:1: ( rule__StyleClass__Group_5__3__Impl )
            // InternalT2A.g:2015:2: rule__StyleClass__Group_5__3__Impl
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
    // InternalT2A.g:2021:1: rule__StyleClass__Group_5__3__Impl : ( '}' ) ;
    public final void rule__StyleClass__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2025:1: ( ( '}' ) )
            // InternalT2A.g:2026:1: ( '}' )
            {
            // InternalT2A.g:2026:1: ( '}' )
            // InternalT2A.g:2027:2: '}'
            {
             before(grammarAccess.getStyleClassAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalT2A.g:2037:1: rule__StyleClass__Group_5_2__0 : rule__StyleClass__Group_5_2__0__Impl rule__StyleClass__Group_5_2__1 ;
    public final void rule__StyleClass__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2041:1: ( rule__StyleClass__Group_5_2__0__Impl rule__StyleClass__Group_5_2__1 )
            // InternalT2A.g:2042:2: rule__StyleClass__Group_5_2__0__Impl rule__StyleClass__Group_5_2__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalT2A.g:2049:1: rule__StyleClass__Group_5_2__0__Impl : ( ( rule__StyleClass__SattributesActiveAssignment_5_2_0 ) ) ;
    public final void rule__StyleClass__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2053:1: ( ( ( rule__StyleClass__SattributesActiveAssignment_5_2_0 ) ) )
            // InternalT2A.g:2054:1: ( ( rule__StyleClass__SattributesActiveAssignment_5_2_0 ) )
            {
            // InternalT2A.g:2054:1: ( ( rule__StyleClass__SattributesActiveAssignment_5_2_0 ) )
            // InternalT2A.g:2055:2: ( rule__StyleClass__SattributesActiveAssignment_5_2_0 )
            {
             before(grammarAccess.getStyleClassAccess().getSattributesActiveAssignment_5_2_0()); 
            // InternalT2A.g:2056:2: ( rule__StyleClass__SattributesActiveAssignment_5_2_0 )
            // InternalT2A.g:2056:3: rule__StyleClass__SattributesActiveAssignment_5_2_0
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
    // InternalT2A.g:2064:1: rule__StyleClass__Group_5_2__1 : rule__StyleClass__Group_5_2__1__Impl ;
    public final void rule__StyleClass__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2068:1: ( rule__StyleClass__Group_5_2__1__Impl )
            // InternalT2A.g:2069:2: rule__StyleClass__Group_5_2__1__Impl
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
    // InternalT2A.g:2075:1: rule__StyleClass__Group_5_2__1__Impl : ( ';' ) ;
    public final void rule__StyleClass__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2079:1: ( ( ';' ) )
            // InternalT2A.g:2080:1: ( ';' )
            {
            // InternalT2A.g:2080:1: ( ';' )
            // InternalT2A.g:2081:2: ';'
            {
             before(grammarAccess.getStyleClassAccess().getSemicolonKeyword_5_2_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalT2A.g:2091:1: rule__SAttributeAndValue__Group__0 : rule__SAttributeAndValue__Group__0__Impl rule__SAttributeAndValue__Group__1 ;
    public final void rule__SAttributeAndValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2095:1: ( rule__SAttributeAndValue__Group__0__Impl rule__SAttributeAndValue__Group__1 )
            // InternalT2A.g:2096:2: rule__SAttributeAndValue__Group__0__Impl rule__SAttributeAndValue__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalT2A.g:2103:1: rule__SAttributeAndValue__Group__0__Impl : ( ( rule__SAttributeAndValue__StnameAssignment_0 ) ) ;
    public final void rule__SAttributeAndValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2107:1: ( ( ( rule__SAttributeAndValue__StnameAssignment_0 ) ) )
            // InternalT2A.g:2108:1: ( ( rule__SAttributeAndValue__StnameAssignment_0 ) )
            {
            // InternalT2A.g:2108:1: ( ( rule__SAttributeAndValue__StnameAssignment_0 ) )
            // InternalT2A.g:2109:2: ( rule__SAttributeAndValue__StnameAssignment_0 )
            {
             before(grammarAccess.getSAttributeAndValueAccess().getStnameAssignment_0()); 
            // InternalT2A.g:2110:2: ( rule__SAttributeAndValue__StnameAssignment_0 )
            // InternalT2A.g:2110:3: rule__SAttributeAndValue__StnameAssignment_0
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
    // InternalT2A.g:2118:1: rule__SAttributeAndValue__Group__1 : rule__SAttributeAndValue__Group__1__Impl ;
    public final void rule__SAttributeAndValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2122:1: ( rule__SAttributeAndValue__Group__1__Impl )
            // InternalT2A.g:2123:2: rule__SAttributeAndValue__Group__1__Impl
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
    // InternalT2A.g:2129:1: rule__SAttributeAndValue__Group__1__Impl : ( ( rule__SAttributeAndValue__ValueAssignment_1 ) ) ;
    public final void rule__SAttributeAndValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2133:1: ( ( ( rule__SAttributeAndValue__ValueAssignment_1 ) ) )
            // InternalT2A.g:2134:1: ( ( rule__SAttributeAndValue__ValueAssignment_1 ) )
            {
            // InternalT2A.g:2134:1: ( ( rule__SAttributeAndValue__ValueAssignment_1 ) )
            // InternalT2A.g:2135:2: ( rule__SAttributeAndValue__ValueAssignment_1 )
            {
             before(grammarAccess.getSAttributeAndValueAccess().getValueAssignment_1()); 
            // InternalT2A.g:2136:2: ( rule__SAttributeAndValue__ValueAssignment_1 )
            // InternalT2A.g:2136:3: rule__SAttributeAndValue__ValueAssignment_1
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
    // InternalT2A.g:2145:1: rule__DOM__Group__0 : rule__DOM__Group__0__Impl rule__DOM__Group__1 ;
    public final void rule__DOM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2149:1: ( rule__DOM__Group__0__Impl rule__DOM__Group__1 )
            // InternalT2A.g:2150:2: rule__DOM__Group__0__Impl rule__DOM__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalT2A.g:2157:1: rule__DOM__Group__0__Impl : ( 'Dom' ) ;
    public final void rule__DOM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2161:1: ( ( 'Dom' ) )
            // InternalT2A.g:2162:1: ( 'Dom' )
            {
            // InternalT2A.g:2162:1: ( 'Dom' )
            // InternalT2A.g:2163:2: 'Dom'
            {
             before(grammarAccess.getDOMAccess().getDomKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalT2A.g:2172:1: rule__DOM__Group__1 : rule__DOM__Group__1__Impl rule__DOM__Group__2 ;
    public final void rule__DOM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2176:1: ( rule__DOM__Group__1__Impl rule__DOM__Group__2 )
            // InternalT2A.g:2177:2: rule__DOM__Group__1__Impl rule__DOM__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalT2A.g:2184:1: rule__DOM__Group__1__Impl : ( ( rule__DOM__NameAssignment_1 ) ) ;
    public final void rule__DOM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2188:1: ( ( ( rule__DOM__NameAssignment_1 ) ) )
            // InternalT2A.g:2189:1: ( ( rule__DOM__NameAssignment_1 ) )
            {
            // InternalT2A.g:2189:1: ( ( rule__DOM__NameAssignment_1 ) )
            // InternalT2A.g:2190:2: ( rule__DOM__NameAssignment_1 )
            {
             before(grammarAccess.getDOMAccess().getNameAssignment_1()); 
            // InternalT2A.g:2191:2: ( rule__DOM__NameAssignment_1 )
            // InternalT2A.g:2191:3: rule__DOM__NameAssignment_1
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
    // InternalT2A.g:2199:1: rule__DOM__Group__2 : rule__DOM__Group__2__Impl ;
    public final void rule__DOM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2203:1: ( rule__DOM__Group__2__Impl )
            // InternalT2A.g:2204:2: rule__DOM__Group__2__Impl
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
    // InternalT2A.g:2210:1: rule__DOM__Group__2__Impl : ( ( rule__DOM__Group_2__0 )? ) ;
    public final void rule__DOM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2214:1: ( ( ( rule__DOM__Group_2__0 )? ) )
            // InternalT2A.g:2215:1: ( ( rule__DOM__Group_2__0 )? )
            {
            // InternalT2A.g:2215:1: ( ( rule__DOM__Group_2__0 )? )
            // InternalT2A.g:2216:2: ( rule__DOM__Group_2__0 )?
            {
             before(grammarAccess.getDOMAccess().getGroup_2()); 
            // InternalT2A.g:2217:2: ( rule__DOM__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==21) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalT2A.g:2217:3: rule__DOM__Group_2__0
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
    // InternalT2A.g:2226:1: rule__DOM__Group_2__0 : rule__DOM__Group_2__0__Impl rule__DOM__Group_2__1 ;
    public final void rule__DOM__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2230:1: ( rule__DOM__Group_2__0__Impl rule__DOM__Group_2__1 )
            // InternalT2A.g:2231:2: rule__DOM__Group_2__0__Impl rule__DOM__Group_2__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalT2A.g:2238:1: rule__DOM__Group_2__0__Impl : ( '{' ) ;
    public final void rule__DOM__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2242:1: ( ( '{' ) )
            // InternalT2A.g:2243:1: ( '{' )
            {
            // InternalT2A.g:2243:1: ( '{' )
            // InternalT2A.g:2244:2: '{'
            {
             before(grammarAccess.getDOMAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalT2A.g:2253:1: rule__DOM__Group_2__1 : rule__DOM__Group_2__1__Impl rule__DOM__Group_2__2 ;
    public final void rule__DOM__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2257:1: ( rule__DOM__Group_2__1__Impl rule__DOM__Group_2__2 )
            // InternalT2A.g:2258:2: rule__DOM__Group_2__1__Impl rule__DOM__Group_2__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalT2A.g:2265:1: rule__DOM__Group_2__1__Impl : ( ( rule__DOM__Group_2_1__0 )? ) ;
    public final void rule__DOM__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2269:1: ( ( ( rule__DOM__Group_2_1__0 )? ) )
            // InternalT2A.g:2270:1: ( ( rule__DOM__Group_2_1__0 )? )
            {
            // InternalT2A.g:2270:1: ( ( rule__DOM__Group_2_1__0 )? )
            // InternalT2A.g:2271:2: ( rule__DOM__Group_2_1__0 )?
            {
             before(grammarAccess.getDOMAccess().getGroup_2_1()); 
            // InternalT2A.g:2272:2: ( rule__DOM__Group_2_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalT2A.g:2272:3: rule__DOM__Group_2_1__0
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
    // InternalT2A.g:2280:1: rule__DOM__Group_2__2 : rule__DOM__Group_2__2__Impl rule__DOM__Group_2__3 ;
    public final void rule__DOM__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2284:1: ( rule__DOM__Group_2__2__Impl rule__DOM__Group_2__3 )
            // InternalT2A.g:2285:2: rule__DOM__Group_2__2__Impl rule__DOM__Group_2__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalT2A.g:2292:1: rule__DOM__Group_2__2__Impl : ( ( rule__DOM__Group_2_2__0 )? ) ;
    public final void rule__DOM__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2296:1: ( ( ( rule__DOM__Group_2_2__0 )? ) )
            // InternalT2A.g:2297:1: ( ( rule__DOM__Group_2_2__0 )? )
            {
            // InternalT2A.g:2297:1: ( ( rule__DOM__Group_2_2__0 )? )
            // InternalT2A.g:2298:2: ( rule__DOM__Group_2_2__0 )?
            {
             before(grammarAccess.getDOMAccess().getGroup_2_2()); 
            // InternalT2A.g:2299:2: ( rule__DOM__Group_2_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalT2A.g:2299:3: rule__DOM__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DOM__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDOMAccess().getGroup_2_2()); 

            }


            }

        }
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
    // InternalT2A.g:2307:1: rule__DOM__Group_2__3 : rule__DOM__Group_2__3__Impl rule__DOM__Group_2__4 ;
    public final void rule__DOM__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2311:1: ( rule__DOM__Group_2__3__Impl rule__DOM__Group_2__4 )
            // InternalT2A.g:2312:2: rule__DOM__Group_2__3__Impl rule__DOM__Group_2__4
            {
            pushFollow(FOLLOW_24);
            rule__DOM__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOM__Group_2__4();

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
    // InternalT2A.g:2319:1: rule__DOM__Group_2__3__Impl : ( ( rule__DOM__FeaturesAssignment_2_3 )* ) ;
    public final void rule__DOM__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2323:1: ( ( ( rule__DOM__FeaturesAssignment_2_3 )* ) )
            // InternalT2A.g:2324:1: ( ( rule__DOM__FeaturesAssignment_2_3 )* )
            {
            // InternalT2A.g:2324:1: ( ( rule__DOM__FeaturesAssignment_2_3 )* )
            // InternalT2A.g:2325:2: ( rule__DOM__FeaturesAssignment_2_3 )*
            {
             before(grammarAccess.getDOMAccess().getFeaturesAssignment_2_3()); 
            // InternalT2A.g:2326:2: ( rule__DOM__FeaturesAssignment_2_3 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_STRING)||LA28_0==36) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalT2A.g:2326:3: rule__DOM__FeaturesAssignment_2_3
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__DOM__FeaturesAssignment_2_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getDOMAccess().getFeaturesAssignment_2_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__DOM__Group_2__4"
    // InternalT2A.g:2334:1: rule__DOM__Group_2__4 : rule__DOM__Group_2__4__Impl ;
    public final void rule__DOM__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2338:1: ( rule__DOM__Group_2__4__Impl )
            // InternalT2A.g:2339:2: rule__DOM__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOM__Group_2__4__Impl();

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
    // $ANTLR end "rule__DOM__Group_2__4"


    // $ANTLR start "rule__DOM__Group_2__4__Impl"
    // InternalT2A.g:2345:1: rule__DOM__Group_2__4__Impl : ( '}' ) ;
    public final void rule__DOM__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2349:1: ( ( '}' ) )
            // InternalT2A.g:2350:1: ( '}' )
            {
            // InternalT2A.g:2350:1: ( '}' )
            // InternalT2A.g:2351:2: '}'
            {
             before(grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group_2__4__Impl"


    // $ANTLR start "rule__DOM__Group_2_1__0"
    // InternalT2A.g:2361:1: rule__DOM__Group_2_1__0 : rule__DOM__Group_2_1__0__Impl rule__DOM__Group_2_1__1 ;
    public final void rule__DOM__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2365:1: ( rule__DOM__Group_2_1__0__Impl rule__DOM__Group_2_1__1 )
            // InternalT2A.g:2366:2: rule__DOM__Group_2_1__0__Impl rule__DOM__Group_2_1__1
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
    // InternalT2A.g:2373:1: rule__DOM__Group_2_1__0__Impl : ( 'sclass' ) ;
    public final void rule__DOM__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2377:1: ( ( 'sclass' ) )
            // InternalT2A.g:2378:1: ( 'sclass' )
            {
            // InternalT2A.g:2378:1: ( 'sclass' )
            // InternalT2A.g:2379:2: 'sclass'
            {
             before(grammarAccess.getDOMAccess().getSclassKeyword_2_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalT2A.g:2388:1: rule__DOM__Group_2_1__1 : rule__DOM__Group_2_1__1__Impl rule__DOM__Group_2_1__2 ;
    public final void rule__DOM__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2392:1: ( rule__DOM__Group_2_1__1__Impl rule__DOM__Group_2_1__2 )
            // InternalT2A.g:2393:2: rule__DOM__Group_2_1__1__Impl rule__DOM__Group_2_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalT2A.g:2400:1: rule__DOM__Group_2_1__1__Impl : ( '{' ) ;
    public final void rule__DOM__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2404:1: ( ( '{' ) )
            // InternalT2A.g:2405:1: ( '{' )
            {
            // InternalT2A.g:2405:1: ( '{' )
            // InternalT2A.g:2406:2: '{'
            {
             before(grammarAccess.getDOMAccess().getLeftCurlyBracketKeyword_2_1_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalT2A.g:2415:1: rule__DOM__Group_2_1__2 : rule__DOM__Group_2_1__2__Impl rule__DOM__Group_2_1__3 ;
    public final void rule__DOM__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2419:1: ( rule__DOM__Group_2_1__2__Impl rule__DOM__Group_2_1__3 )
            // InternalT2A.g:2420:2: rule__DOM__Group_2_1__2__Impl rule__DOM__Group_2_1__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalT2A.g:2427:1: rule__DOM__Group_2_1__2__Impl : ( ( rule__DOM__SclassesAssignment_2_1_2 )* ) ;
    public final void rule__DOM__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2431:1: ( ( ( rule__DOM__SclassesAssignment_2_1_2 )* ) )
            // InternalT2A.g:2432:1: ( ( rule__DOM__SclassesAssignment_2_1_2 )* )
            {
            // InternalT2A.g:2432:1: ( ( rule__DOM__SclassesAssignment_2_1_2 )* )
            // InternalT2A.g:2433:2: ( rule__DOM__SclassesAssignment_2_1_2 )*
            {
             before(grammarAccess.getDOMAccess().getSclassesAssignment_2_1_2()); 
            // InternalT2A.g:2434:2: ( rule__DOM__SclassesAssignment_2_1_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalT2A.g:2434:3: rule__DOM__SclassesAssignment_2_1_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__DOM__SclassesAssignment_2_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalT2A.g:2442:1: rule__DOM__Group_2_1__3 : rule__DOM__Group_2_1__3__Impl ;
    public final void rule__DOM__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2446:1: ( rule__DOM__Group_2_1__3__Impl )
            // InternalT2A.g:2447:2: rule__DOM__Group_2_1__3__Impl
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
    // InternalT2A.g:2453:1: rule__DOM__Group_2_1__3__Impl : ( '}' ) ;
    public final void rule__DOM__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2457:1: ( ( '}' ) )
            // InternalT2A.g:2458:1: ( '}' )
            {
            // InternalT2A.g:2458:1: ( '}' )
            // InternalT2A.g:2459:2: '}'
            {
             before(grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_1_3()); 
            match(input,22,FOLLOW_2); 
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


    // $ANTLR start "rule__DOM__Group_2_2__0"
    // InternalT2A.g:2469:1: rule__DOM__Group_2_2__0 : rule__DOM__Group_2_2__0__Impl rule__DOM__Group_2_2__1 ;
    public final void rule__DOM__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2473:1: ( rule__DOM__Group_2_2__0__Impl rule__DOM__Group_2_2__1 )
            // InternalT2A.g:2474:2: rule__DOM__Group_2_2__0__Impl rule__DOM__Group_2_2__1
            {
            pushFollow(FOLLOW_8);
            rule__DOM__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOM__Group_2_2__1();

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
    // $ANTLR end "rule__DOM__Group_2_2__0"


    // $ANTLR start "rule__DOM__Group_2_2__0__Impl"
    // InternalT2A.g:2481:1: rule__DOM__Group_2_2__0__Impl : ( 'sclassString' ) ;
    public final void rule__DOM__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2485:1: ( ( 'sclassString' ) )
            // InternalT2A.g:2486:1: ( 'sclassString' )
            {
            // InternalT2A.g:2486:1: ( 'sclassString' )
            // InternalT2A.g:2487:2: 'sclassString'
            {
             before(grammarAccess.getDOMAccess().getSclassStringKeyword_2_2_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDOMAccess().getSclassStringKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group_2_2__0__Impl"


    // $ANTLR start "rule__DOM__Group_2_2__1"
    // InternalT2A.g:2496:1: rule__DOM__Group_2_2__1 : rule__DOM__Group_2_2__1__Impl rule__DOM__Group_2_2__2 ;
    public final void rule__DOM__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2500:1: ( rule__DOM__Group_2_2__1__Impl rule__DOM__Group_2_2__2 )
            // InternalT2A.g:2501:2: rule__DOM__Group_2_2__1__Impl rule__DOM__Group_2_2__2
            {
            pushFollow(FOLLOW_16);
            rule__DOM__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOM__Group_2_2__2();

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
    // $ANTLR end "rule__DOM__Group_2_2__1"


    // $ANTLR start "rule__DOM__Group_2_2__1__Impl"
    // InternalT2A.g:2508:1: rule__DOM__Group_2_2__1__Impl : ( '{' ) ;
    public final void rule__DOM__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2512:1: ( ( '{' ) )
            // InternalT2A.g:2513:1: ( '{' )
            {
            // InternalT2A.g:2513:1: ( '{' )
            // InternalT2A.g:2514:2: '{'
            {
             before(grammarAccess.getDOMAccess().getLeftCurlyBracketKeyword_2_2_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDOMAccess().getLeftCurlyBracketKeyword_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group_2_2__1__Impl"


    // $ANTLR start "rule__DOM__Group_2_2__2"
    // InternalT2A.g:2523:1: rule__DOM__Group_2_2__2 : rule__DOM__Group_2_2__2__Impl rule__DOM__Group_2_2__3 ;
    public final void rule__DOM__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2527:1: ( rule__DOM__Group_2_2__2__Impl rule__DOM__Group_2_2__3 )
            // InternalT2A.g:2528:2: rule__DOM__Group_2_2__2__Impl rule__DOM__Group_2_2__3
            {
            pushFollow(FOLLOW_16);
            rule__DOM__Group_2_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOM__Group_2_2__3();

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
    // $ANTLR end "rule__DOM__Group_2_2__2"


    // $ANTLR start "rule__DOM__Group_2_2__2__Impl"
    // InternalT2A.g:2535:1: rule__DOM__Group_2_2__2__Impl : ( ( rule__DOM__SclassesOnlineAssignment_2_2_2 )* ) ;
    public final void rule__DOM__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2539:1: ( ( ( rule__DOM__SclassesOnlineAssignment_2_2_2 )* ) )
            // InternalT2A.g:2540:1: ( ( rule__DOM__SclassesOnlineAssignment_2_2_2 )* )
            {
            // InternalT2A.g:2540:1: ( ( rule__DOM__SclassesOnlineAssignment_2_2_2 )* )
            // InternalT2A.g:2541:2: ( rule__DOM__SclassesOnlineAssignment_2_2_2 )*
            {
             before(grammarAccess.getDOMAccess().getSclassesOnlineAssignment_2_2_2()); 
            // InternalT2A.g:2542:2: ( rule__DOM__SclassesOnlineAssignment_2_2_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_STRING) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalT2A.g:2542:3: rule__DOM__SclassesOnlineAssignment_2_2_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__DOM__SclassesOnlineAssignment_2_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getDOMAccess().getSclassesOnlineAssignment_2_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group_2_2__2__Impl"


    // $ANTLR start "rule__DOM__Group_2_2__3"
    // InternalT2A.g:2550:1: rule__DOM__Group_2_2__3 : rule__DOM__Group_2_2__3__Impl ;
    public final void rule__DOM__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2554:1: ( rule__DOM__Group_2_2__3__Impl )
            // InternalT2A.g:2555:2: rule__DOM__Group_2_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOM__Group_2_2__3__Impl();

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
    // $ANTLR end "rule__DOM__Group_2_2__3"


    // $ANTLR start "rule__DOM__Group_2_2__3__Impl"
    // InternalT2A.g:2561:1: rule__DOM__Group_2_2__3__Impl : ( '}' ) ;
    public final void rule__DOM__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2565:1: ( ( '}' ) )
            // InternalT2A.g:2566:1: ( '}' )
            {
            // InternalT2A.g:2566:1: ( '}' )
            // InternalT2A.g:2567:2: '}'
            {
             before(grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_2_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__Group_2_2__3__Impl"


    // $ANTLR start "rule__Comp__Group__0"
    // InternalT2A.g:2577:1: rule__Comp__Group__0 : rule__Comp__Group__0__Impl rule__Comp__Group__1 ;
    public final void rule__Comp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2581:1: ( rule__Comp__Group__0__Impl rule__Comp__Group__1 )
            // InternalT2A.g:2582:2: rule__Comp__Group__0__Impl rule__Comp__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalT2A.g:2589:1: rule__Comp__Group__0__Impl : ( 'Comp' ) ;
    public final void rule__Comp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2593:1: ( ( 'Comp' ) )
            // InternalT2A.g:2594:1: ( 'Comp' )
            {
            // InternalT2A.g:2594:1: ( 'Comp' )
            // InternalT2A.g:2595:2: 'Comp'
            {
             before(grammarAccess.getCompAccess().getCompKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalT2A.g:2604:1: rule__Comp__Group__1 : rule__Comp__Group__1__Impl rule__Comp__Group__2 ;
    public final void rule__Comp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2608:1: ( rule__Comp__Group__1__Impl rule__Comp__Group__2 )
            // InternalT2A.g:2609:2: rule__Comp__Group__1__Impl rule__Comp__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalT2A.g:2616:1: rule__Comp__Group__1__Impl : ( ( rule__Comp__NameAssignment_1 ) ) ;
    public final void rule__Comp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2620:1: ( ( ( rule__Comp__NameAssignment_1 ) ) )
            // InternalT2A.g:2621:1: ( ( rule__Comp__NameAssignment_1 ) )
            {
            // InternalT2A.g:2621:1: ( ( rule__Comp__NameAssignment_1 ) )
            // InternalT2A.g:2622:2: ( rule__Comp__NameAssignment_1 )
            {
             before(grammarAccess.getCompAccess().getNameAssignment_1()); 
            // InternalT2A.g:2623:2: ( rule__Comp__NameAssignment_1 )
            // InternalT2A.g:2623:3: rule__Comp__NameAssignment_1
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
    // InternalT2A.g:2631:1: rule__Comp__Group__2 : rule__Comp__Group__2__Impl ;
    public final void rule__Comp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2635:1: ( rule__Comp__Group__2__Impl )
            // InternalT2A.g:2636:2: rule__Comp__Group__2__Impl
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
    // InternalT2A.g:2642:1: rule__Comp__Group__2__Impl : ( ( rule__Comp__Group_2__0 )? ) ;
    public final void rule__Comp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2646:1: ( ( ( rule__Comp__Group_2__0 )? ) )
            // InternalT2A.g:2647:1: ( ( rule__Comp__Group_2__0 )? )
            {
            // InternalT2A.g:2647:1: ( ( rule__Comp__Group_2__0 )? )
            // InternalT2A.g:2648:2: ( rule__Comp__Group_2__0 )?
            {
             before(grammarAccess.getCompAccess().getGroup_2()); 
            // InternalT2A.g:2649:2: ( rule__Comp__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==21) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalT2A.g:2649:3: rule__Comp__Group_2__0
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
    // InternalT2A.g:2658:1: rule__Comp__Group_2__0 : rule__Comp__Group_2__0__Impl rule__Comp__Group_2__1 ;
    public final void rule__Comp__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2662:1: ( rule__Comp__Group_2__0__Impl rule__Comp__Group_2__1 )
            // InternalT2A.g:2663:2: rule__Comp__Group_2__0__Impl rule__Comp__Group_2__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalT2A.g:2670:1: rule__Comp__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Comp__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2674:1: ( ( '{' ) )
            // InternalT2A.g:2675:1: ( '{' )
            {
            // InternalT2A.g:2675:1: ( '{' )
            // InternalT2A.g:2676:2: '{'
            {
             before(grammarAccess.getCompAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalT2A.g:2685:1: rule__Comp__Group_2__1 : rule__Comp__Group_2__1__Impl rule__Comp__Group_2__2 ;
    public final void rule__Comp__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2689:1: ( rule__Comp__Group_2__1__Impl rule__Comp__Group_2__2 )
            // InternalT2A.g:2690:2: rule__Comp__Group_2__1__Impl rule__Comp__Group_2__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalT2A.g:2697:1: rule__Comp__Group_2__1__Impl : ( ( rule__Comp__Group_2_1__0 )? ) ;
    public final void rule__Comp__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2701:1: ( ( ( rule__Comp__Group_2_1__0 )? ) )
            // InternalT2A.g:2702:1: ( ( rule__Comp__Group_2_1__0 )? )
            {
            // InternalT2A.g:2702:1: ( ( rule__Comp__Group_2_1__0 )? )
            // InternalT2A.g:2703:2: ( rule__Comp__Group_2_1__0 )?
            {
             before(grammarAccess.getCompAccess().getGroup_2_1()); 
            // InternalT2A.g:2704:2: ( rule__Comp__Group_2_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==23) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalT2A.g:2704:3: rule__Comp__Group_2_1__0
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
    // InternalT2A.g:2712:1: rule__Comp__Group_2__2 : rule__Comp__Group_2__2__Impl rule__Comp__Group_2__3 ;
    public final void rule__Comp__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2716:1: ( rule__Comp__Group_2__2__Impl rule__Comp__Group_2__3 )
            // InternalT2A.g:2717:2: rule__Comp__Group_2__2__Impl rule__Comp__Group_2__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalT2A.g:2724:1: rule__Comp__Group_2__2__Impl : ( ( rule__Comp__Group_2_2__0 )? ) ;
    public final void rule__Comp__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2728:1: ( ( ( rule__Comp__Group_2_2__0 )? ) )
            // InternalT2A.g:2729:1: ( ( rule__Comp__Group_2_2__0 )? )
            {
            // InternalT2A.g:2729:1: ( ( rule__Comp__Group_2_2__0 )? )
            // InternalT2A.g:2730:2: ( rule__Comp__Group_2_2__0 )?
            {
             before(grammarAccess.getCompAccess().getGroup_2_2()); 
            // InternalT2A.g:2731:2: ( rule__Comp__Group_2_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalT2A.g:2731:3: rule__Comp__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comp__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompAccess().getGroup_2_2()); 

            }


            }

        }
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
    // InternalT2A.g:2739:1: rule__Comp__Group_2__3 : rule__Comp__Group_2__3__Impl rule__Comp__Group_2__4 ;
    public final void rule__Comp__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2743:1: ( rule__Comp__Group_2__3__Impl rule__Comp__Group_2__4 )
            // InternalT2A.g:2744:2: rule__Comp__Group_2__3__Impl rule__Comp__Group_2__4
            {
            pushFollow(FOLLOW_24);
            rule__Comp__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comp__Group_2__4();

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
    // InternalT2A.g:2751:1: rule__Comp__Group_2__3__Impl : ( ( rule__Comp__FeaturesAssignment_2_3 )* ) ;
    public final void rule__Comp__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2755:1: ( ( ( rule__Comp__FeaturesAssignment_2_3 )* ) )
            // InternalT2A.g:2756:1: ( ( rule__Comp__FeaturesAssignment_2_3 )* )
            {
            // InternalT2A.g:2756:1: ( ( rule__Comp__FeaturesAssignment_2_3 )* )
            // InternalT2A.g:2757:2: ( rule__Comp__FeaturesAssignment_2_3 )*
            {
             before(grammarAccess.getCompAccess().getFeaturesAssignment_2_3()); 
            // InternalT2A.g:2758:2: ( rule__Comp__FeaturesAssignment_2_3 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_STRING)||LA34_0==36) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalT2A.g:2758:3: rule__Comp__FeaturesAssignment_2_3
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Comp__FeaturesAssignment_2_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getCompAccess().getFeaturesAssignment_2_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Comp__Group_2__4"
    // InternalT2A.g:2766:1: rule__Comp__Group_2__4 : rule__Comp__Group_2__4__Impl ;
    public final void rule__Comp__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2770:1: ( rule__Comp__Group_2__4__Impl )
            // InternalT2A.g:2771:2: rule__Comp__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comp__Group_2__4__Impl();

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
    // $ANTLR end "rule__Comp__Group_2__4"


    // $ANTLR start "rule__Comp__Group_2__4__Impl"
    // InternalT2A.g:2777:1: rule__Comp__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Comp__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2781:1: ( ( '}' ) )
            // InternalT2A.g:2782:1: ( '}' )
            {
            // InternalT2A.g:2782:1: ( '}' )
            // InternalT2A.g:2783:2: '}'
            {
             before(grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group_2__4__Impl"


    // $ANTLR start "rule__Comp__Group_2_1__0"
    // InternalT2A.g:2793:1: rule__Comp__Group_2_1__0 : rule__Comp__Group_2_1__0__Impl rule__Comp__Group_2_1__1 ;
    public final void rule__Comp__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2797:1: ( rule__Comp__Group_2_1__0__Impl rule__Comp__Group_2_1__1 )
            // InternalT2A.g:2798:2: rule__Comp__Group_2_1__0__Impl rule__Comp__Group_2_1__1
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
    // InternalT2A.g:2805:1: rule__Comp__Group_2_1__0__Impl : ( 'sclass' ) ;
    public final void rule__Comp__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2809:1: ( ( 'sclass' ) )
            // InternalT2A.g:2810:1: ( 'sclass' )
            {
            // InternalT2A.g:2810:1: ( 'sclass' )
            // InternalT2A.g:2811:2: 'sclass'
            {
             before(grammarAccess.getCompAccess().getSclassKeyword_2_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalT2A.g:2820:1: rule__Comp__Group_2_1__1 : rule__Comp__Group_2_1__1__Impl rule__Comp__Group_2_1__2 ;
    public final void rule__Comp__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2824:1: ( rule__Comp__Group_2_1__1__Impl rule__Comp__Group_2_1__2 )
            // InternalT2A.g:2825:2: rule__Comp__Group_2_1__1__Impl rule__Comp__Group_2_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalT2A.g:2832:1: rule__Comp__Group_2_1__1__Impl : ( '{' ) ;
    public final void rule__Comp__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2836:1: ( ( '{' ) )
            // InternalT2A.g:2837:1: ( '{' )
            {
            // InternalT2A.g:2837:1: ( '{' )
            // InternalT2A.g:2838:2: '{'
            {
             before(grammarAccess.getCompAccess().getLeftCurlyBracketKeyword_2_1_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalT2A.g:2847:1: rule__Comp__Group_2_1__2 : rule__Comp__Group_2_1__2__Impl rule__Comp__Group_2_1__3 ;
    public final void rule__Comp__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2851:1: ( rule__Comp__Group_2_1__2__Impl rule__Comp__Group_2_1__3 )
            // InternalT2A.g:2852:2: rule__Comp__Group_2_1__2__Impl rule__Comp__Group_2_1__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalT2A.g:2859:1: rule__Comp__Group_2_1__2__Impl : ( ( rule__Comp__HostclassesAssignment_2_1_2 )* ) ;
    public final void rule__Comp__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2863:1: ( ( ( rule__Comp__HostclassesAssignment_2_1_2 )* ) )
            // InternalT2A.g:2864:1: ( ( rule__Comp__HostclassesAssignment_2_1_2 )* )
            {
            // InternalT2A.g:2864:1: ( ( rule__Comp__HostclassesAssignment_2_1_2 )* )
            // InternalT2A.g:2865:2: ( rule__Comp__HostclassesAssignment_2_1_2 )*
            {
             before(grammarAccess.getCompAccess().getHostclassesAssignment_2_1_2()); 
            // InternalT2A.g:2866:2: ( rule__Comp__HostclassesAssignment_2_1_2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalT2A.g:2866:3: rule__Comp__HostclassesAssignment_2_1_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Comp__HostclassesAssignment_2_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalT2A.g:2874:1: rule__Comp__Group_2_1__3 : rule__Comp__Group_2_1__3__Impl ;
    public final void rule__Comp__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2878:1: ( rule__Comp__Group_2_1__3__Impl )
            // InternalT2A.g:2879:2: rule__Comp__Group_2_1__3__Impl
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
    // InternalT2A.g:2885:1: rule__Comp__Group_2_1__3__Impl : ( '}' ) ;
    public final void rule__Comp__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2889:1: ( ( '}' ) )
            // InternalT2A.g:2890:1: ( '}' )
            {
            // InternalT2A.g:2890:1: ( '}' )
            // InternalT2A.g:2891:2: '}'
            {
             before(grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_1_3()); 
            match(input,22,FOLLOW_2); 
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


    // $ANTLR start "rule__Comp__Group_2_2__0"
    // InternalT2A.g:2901:1: rule__Comp__Group_2_2__0 : rule__Comp__Group_2_2__0__Impl rule__Comp__Group_2_2__1 ;
    public final void rule__Comp__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2905:1: ( rule__Comp__Group_2_2__0__Impl rule__Comp__Group_2_2__1 )
            // InternalT2A.g:2906:2: rule__Comp__Group_2_2__0__Impl rule__Comp__Group_2_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Comp__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comp__Group_2_2__1();

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
    // $ANTLR end "rule__Comp__Group_2_2__0"


    // $ANTLR start "rule__Comp__Group_2_2__0__Impl"
    // InternalT2A.g:2913:1: rule__Comp__Group_2_2__0__Impl : ( 'sclassString' ) ;
    public final void rule__Comp__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2917:1: ( ( 'sclassString' ) )
            // InternalT2A.g:2918:1: ( 'sclassString' )
            {
            // InternalT2A.g:2918:1: ( 'sclassString' )
            // InternalT2A.g:2919:2: 'sclassString'
            {
             before(grammarAccess.getCompAccess().getSclassStringKeyword_2_2_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCompAccess().getSclassStringKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group_2_2__0__Impl"


    // $ANTLR start "rule__Comp__Group_2_2__1"
    // InternalT2A.g:2928:1: rule__Comp__Group_2_2__1 : rule__Comp__Group_2_2__1__Impl rule__Comp__Group_2_2__2 ;
    public final void rule__Comp__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2932:1: ( rule__Comp__Group_2_2__1__Impl rule__Comp__Group_2_2__2 )
            // InternalT2A.g:2933:2: rule__Comp__Group_2_2__1__Impl rule__Comp__Group_2_2__2
            {
            pushFollow(FOLLOW_16);
            rule__Comp__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comp__Group_2_2__2();

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
    // $ANTLR end "rule__Comp__Group_2_2__1"


    // $ANTLR start "rule__Comp__Group_2_2__1__Impl"
    // InternalT2A.g:2940:1: rule__Comp__Group_2_2__1__Impl : ( '{' ) ;
    public final void rule__Comp__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2944:1: ( ( '{' ) )
            // InternalT2A.g:2945:1: ( '{' )
            {
            // InternalT2A.g:2945:1: ( '{' )
            // InternalT2A.g:2946:2: '{'
            {
             before(grammarAccess.getCompAccess().getLeftCurlyBracketKeyword_2_2_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCompAccess().getLeftCurlyBracketKeyword_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group_2_2__1__Impl"


    // $ANTLR start "rule__Comp__Group_2_2__2"
    // InternalT2A.g:2955:1: rule__Comp__Group_2_2__2 : rule__Comp__Group_2_2__2__Impl rule__Comp__Group_2_2__3 ;
    public final void rule__Comp__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2959:1: ( rule__Comp__Group_2_2__2__Impl rule__Comp__Group_2_2__3 )
            // InternalT2A.g:2960:2: rule__Comp__Group_2_2__2__Impl rule__Comp__Group_2_2__3
            {
            pushFollow(FOLLOW_16);
            rule__Comp__Group_2_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comp__Group_2_2__3();

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
    // $ANTLR end "rule__Comp__Group_2_2__2"


    // $ANTLR start "rule__Comp__Group_2_2__2__Impl"
    // InternalT2A.g:2967:1: rule__Comp__Group_2_2__2__Impl : ( ( rule__Comp__SclassesOnlineAssignment_2_2_2 )* ) ;
    public final void rule__Comp__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2971:1: ( ( ( rule__Comp__SclassesOnlineAssignment_2_2_2 )* ) )
            // InternalT2A.g:2972:1: ( ( rule__Comp__SclassesOnlineAssignment_2_2_2 )* )
            {
            // InternalT2A.g:2972:1: ( ( rule__Comp__SclassesOnlineAssignment_2_2_2 )* )
            // InternalT2A.g:2973:2: ( rule__Comp__SclassesOnlineAssignment_2_2_2 )*
            {
             before(grammarAccess.getCompAccess().getSclassesOnlineAssignment_2_2_2()); 
            // InternalT2A.g:2974:2: ( rule__Comp__SclassesOnlineAssignment_2_2_2 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_STRING) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalT2A.g:2974:3: rule__Comp__SclassesOnlineAssignment_2_2_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Comp__SclassesOnlineAssignment_2_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getCompAccess().getSclassesOnlineAssignment_2_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group_2_2__2__Impl"


    // $ANTLR start "rule__Comp__Group_2_2__3"
    // InternalT2A.g:2982:1: rule__Comp__Group_2_2__3 : rule__Comp__Group_2_2__3__Impl ;
    public final void rule__Comp__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2986:1: ( rule__Comp__Group_2_2__3__Impl )
            // InternalT2A.g:2987:2: rule__Comp__Group_2_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comp__Group_2_2__3__Impl();

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
    // $ANTLR end "rule__Comp__Group_2_2__3"


    // $ANTLR start "rule__Comp__Group_2_2__3__Impl"
    // InternalT2A.g:2993:1: rule__Comp__Group_2_2__3__Impl : ( '}' ) ;
    public final void rule__Comp__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2997:1: ( ( '}' ) )
            // InternalT2A.g:2998:1: ( '}' )
            {
            // InternalT2A.g:2998:1: ( '}' )
            // InternalT2A.g:2999:2: '}'
            {
             before(grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_2_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Group_2_2__3__Impl"


    // $ANTLR start "rule__InstanciaEDOM__Group__0"
    // InternalT2A.g:3009:1: rule__InstanciaEDOM__Group__0 : rule__InstanciaEDOM__Group__0__Impl rule__InstanciaEDOM__Group__1 ;
    public final void rule__InstanciaEDOM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3013:1: ( rule__InstanciaEDOM__Group__0__Impl rule__InstanciaEDOM__Group__1 )
            // InternalT2A.g:3014:2: rule__InstanciaEDOM__Group__0__Impl rule__InstanciaEDOM__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalT2A.g:3021:1: rule__InstanciaEDOM__Group__0__Impl : ( ( rule__InstanciaEDOM__InstanciaAssignment_0 ) ) ;
    public final void rule__InstanciaEDOM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3025:1: ( ( ( rule__InstanciaEDOM__InstanciaAssignment_0 ) ) )
            // InternalT2A.g:3026:1: ( ( rule__InstanciaEDOM__InstanciaAssignment_0 ) )
            {
            // InternalT2A.g:3026:1: ( ( rule__InstanciaEDOM__InstanciaAssignment_0 ) )
            // InternalT2A.g:3027:2: ( rule__InstanciaEDOM__InstanciaAssignment_0 )
            {
             before(grammarAccess.getInstanciaEDOMAccess().getInstanciaAssignment_0()); 
            // InternalT2A.g:3028:2: ( rule__InstanciaEDOM__InstanciaAssignment_0 )
            // InternalT2A.g:3028:3: rule__InstanciaEDOM__InstanciaAssignment_0
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
    // InternalT2A.g:3036:1: rule__InstanciaEDOM__Group__1 : rule__InstanciaEDOM__Group__1__Impl ;
    public final void rule__InstanciaEDOM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3040:1: ( rule__InstanciaEDOM__Group__1__Impl )
            // InternalT2A.g:3041:2: rule__InstanciaEDOM__Group__1__Impl
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
    // InternalT2A.g:3047:1: rule__InstanciaEDOM__Group__1__Impl : ( ( rule__InstanciaEDOM__Group_1__0 )? ) ;
    public final void rule__InstanciaEDOM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3051:1: ( ( ( rule__InstanciaEDOM__Group_1__0 )? ) )
            // InternalT2A.g:3052:1: ( ( rule__InstanciaEDOM__Group_1__0 )? )
            {
            // InternalT2A.g:3052:1: ( ( rule__InstanciaEDOM__Group_1__0 )? )
            // InternalT2A.g:3053:2: ( rule__InstanciaEDOM__Group_1__0 )?
            {
             before(grammarAccess.getInstanciaEDOMAccess().getGroup_1()); 
            // InternalT2A.g:3054:2: ( rule__InstanciaEDOM__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==21) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalT2A.g:3054:3: rule__InstanciaEDOM__Group_1__0
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
    // InternalT2A.g:3063:1: rule__InstanciaEDOM__Group_1__0 : rule__InstanciaEDOM__Group_1__0__Impl rule__InstanciaEDOM__Group_1__1 ;
    public final void rule__InstanciaEDOM__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3067:1: ( rule__InstanciaEDOM__Group_1__0__Impl rule__InstanciaEDOM__Group_1__1 )
            // InternalT2A.g:3068:2: rule__InstanciaEDOM__Group_1__0__Impl rule__InstanciaEDOM__Group_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalT2A.g:3075:1: rule__InstanciaEDOM__Group_1__0__Impl : ( '{' ) ;
    public final void rule__InstanciaEDOM__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3079:1: ( ( '{' ) )
            // InternalT2A.g:3080:1: ( '{' )
            {
            // InternalT2A.g:3080:1: ( '{' )
            // InternalT2A.g:3081:2: '{'
            {
             before(grammarAccess.getInstanciaEDOMAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalT2A.g:3090:1: rule__InstanciaEDOM__Group_1__1 : rule__InstanciaEDOM__Group_1__1__Impl rule__InstanciaEDOM__Group_1__2 ;
    public final void rule__InstanciaEDOM__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3094:1: ( rule__InstanciaEDOM__Group_1__1__Impl rule__InstanciaEDOM__Group_1__2 )
            // InternalT2A.g:3095:2: rule__InstanciaEDOM__Group_1__1__Impl rule__InstanciaEDOM__Group_1__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalT2A.g:3102:1: rule__InstanciaEDOM__Group_1__1__Impl : ( ( rule__InstanciaEDOM__Group_1_1__0 )? ) ;
    public final void rule__InstanciaEDOM__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3106:1: ( ( ( rule__InstanciaEDOM__Group_1_1__0 )? ) )
            // InternalT2A.g:3107:1: ( ( rule__InstanciaEDOM__Group_1_1__0 )? )
            {
            // InternalT2A.g:3107:1: ( ( rule__InstanciaEDOM__Group_1_1__0 )? )
            // InternalT2A.g:3108:2: ( rule__InstanciaEDOM__Group_1_1__0 )?
            {
             before(grammarAccess.getInstanciaEDOMAccess().getGroup_1_1()); 
            // InternalT2A.g:3109:2: ( rule__InstanciaEDOM__Group_1_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==23) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalT2A.g:3109:3: rule__InstanciaEDOM__Group_1_1__0
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
    // InternalT2A.g:3117:1: rule__InstanciaEDOM__Group_1__2 : rule__InstanciaEDOM__Group_1__2__Impl rule__InstanciaEDOM__Group_1__3 ;
    public final void rule__InstanciaEDOM__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3121:1: ( rule__InstanciaEDOM__Group_1__2__Impl rule__InstanciaEDOM__Group_1__3 )
            // InternalT2A.g:3122:2: rule__InstanciaEDOM__Group_1__2__Impl rule__InstanciaEDOM__Group_1__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalT2A.g:3129:1: rule__InstanciaEDOM__Group_1__2__Impl : ( ( rule__InstanciaEDOM__Group_1_2__0 )? ) ;
    public final void rule__InstanciaEDOM__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3133:1: ( ( ( rule__InstanciaEDOM__Group_1_2__0 )? ) )
            // InternalT2A.g:3134:1: ( ( rule__InstanciaEDOM__Group_1_2__0 )? )
            {
            // InternalT2A.g:3134:1: ( ( rule__InstanciaEDOM__Group_1_2__0 )? )
            // InternalT2A.g:3135:2: ( rule__InstanciaEDOM__Group_1_2__0 )?
            {
             before(grammarAccess.getInstanciaEDOMAccess().getGroup_1_2()); 
            // InternalT2A.g:3136:2: ( rule__InstanciaEDOM__Group_1_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==32) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalT2A.g:3136:3: rule__InstanciaEDOM__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InstanciaEDOM__Group_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstanciaEDOMAccess().getGroup_1_2()); 

            }


            }

        }
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
    // InternalT2A.g:3144:1: rule__InstanciaEDOM__Group_1__3 : rule__InstanciaEDOM__Group_1__3__Impl rule__InstanciaEDOM__Group_1__4 ;
    public final void rule__InstanciaEDOM__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3148:1: ( rule__InstanciaEDOM__Group_1__3__Impl rule__InstanciaEDOM__Group_1__4 )
            // InternalT2A.g:3149:2: rule__InstanciaEDOM__Group_1__3__Impl rule__InstanciaEDOM__Group_1__4
            {
            pushFollow(FOLLOW_26);
            rule__InstanciaEDOM__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanciaEDOM__Group_1__4();

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
    // InternalT2A.g:3156:1: rule__InstanciaEDOM__Group_1__3__Impl : ( ( rule__InstanciaEDOM__InsfeaturesAssignment_1_3 )* ) ;
    public final void rule__InstanciaEDOM__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3160:1: ( ( ( rule__InstanciaEDOM__InsfeaturesAssignment_1_3 )* ) )
            // InternalT2A.g:3161:1: ( ( rule__InstanciaEDOM__InsfeaturesAssignment_1_3 )* )
            {
            // InternalT2A.g:3161:1: ( ( rule__InstanciaEDOM__InsfeaturesAssignment_1_3 )* )
            // InternalT2A.g:3162:2: ( rule__InstanciaEDOM__InsfeaturesAssignment_1_3 )*
            {
             before(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesAssignment_1_3()); 
            // InternalT2A.g:3163:2: ( rule__InstanciaEDOM__InsfeaturesAssignment_1_3 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_STRING)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalT2A.g:3163:3: rule__InstanciaEDOM__InsfeaturesAssignment_1_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__InstanciaEDOM__InsfeaturesAssignment_1_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesAssignment_1_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__InstanciaEDOM__Group_1__4"
    // InternalT2A.g:3171:1: rule__InstanciaEDOM__Group_1__4 : rule__InstanciaEDOM__Group_1__4__Impl ;
    public final void rule__InstanciaEDOM__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3175:1: ( rule__InstanciaEDOM__Group_1__4__Impl )
            // InternalT2A.g:3176:2: rule__InstanciaEDOM__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstanciaEDOM__Group_1__4__Impl();

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
    // $ANTLR end "rule__InstanciaEDOM__Group_1__4"


    // $ANTLR start "rule__InstanciaEDOM__Group_1__4__Impl"
    // InternalT2A.g:3182:1: rule__InstanciaEDOM__Group_1__4__Impl : ( '}' ) ;
    public final void rule__InstanciaEDOM__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3186:1: ( ( '}' ) )
            // InternalT2A.g:3187:1: ( '}' )
            {
            // InternalT2A.g:3187:1: ( '}' )
            // InternalT2A.g:3188:2: '}'
            {
             before(grammarAccess.getInstanciaEDOMAccess().getRightCurlyBracketKeyword_1_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInstanciaEDOMAccess().getRightCurlyBracketKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1__4__Impl"


    // $ANTLR start "rule__InstanciaEDOM__Group_1_1__0"
    // InternalT2A.g:3198:1: rule__InstanciaEDOM__Group_1_1__0 : rule__InstanciaEDOM__Group_1_1__0__Impl rule__InstanciaEDOM__Group_1_1__1 ;
    public final void rule__InstanciaEDOM__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3202:1: ( rule__InstanciaEDOM__Group_1_1__0__Impl rule__InstanciaEDOM__Group_1_1__1 )
            // InternalT2A.g:3203:2: rule__InstanciaEDOM__Group_1_1__0__Impl rule__InstanciaEDOM__Group_1_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalT2A.g:3210:1: rule__InstanciaEDOM__Group_1_1__0__Impl : ( 'sclass' ) ;
    public final void rule__InstanciaEDOM__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3214:1: ( ( 'sclass' ) )
            // InternalT2A.g:3215:1: ( 'sclass' )
            {
            // InternalT2A.g:3215:1: ( 'sclass' )
            // InternalT2A.g:3216:2: 'sclass'
            {
             before(grammarAccess.getInstanciaEDOMAccess().getSclassKeyword_1_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalT2A.g:3225:1: rule__InstanciaEDOM__Group_1_1__1 : rule__InstanciaEDOM__Group_1_1__1__Impl rule__InstanciaEDOM__Group_1_1__2 ;
    public final void rule__InstanciaEDOM__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3229:1: ( rule__InstanciaEDOM__Group_1_1__1__Impl rule__InstanciaEDOM__Group_1_1__2 )
            // InternalT2A.g:3230:2: rule__InstanciaEDOM__Group_1_1__1__Impl rule__InstanciaEDOM__Group_1_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalT2A.g:3237:1: rule__InstanciaEDOM__Group_1_1__1__Impl : ( '{' ) ;
    public final void rule__InstanciaEDOM__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3241:1: ( ( '{' ) )
            // InternalT2A.g:3242:1: ( '{' )
            {
            // InternalT2A.g:3242:1: ( '{' )
            // InternalT2A.g:3243:2: '{'
            {
             before(grammarAccess.getInstanciaEDOMAccess().getLeftCurlyBracketKeyword_1_1_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalT2A.g:3252:1: rule__InstanciaEDOM__Group_1_1__2 : rule__InstanciaEDOM__Group_1_1__2__Impl rule__InstanciaEDOM__Group_1_1__3 ;
    public final void rule__InstanciaEDOM__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3256:1: ( rule__InstanciaEDOM__Group_1_1__2__Impl rule__InstanciaEDOM__Group_1_1__3 )
            // InternalT2A.g:3257:2: rule__InstanciaEDOM__Group_1_1__2__Impl rule__InstanciaEDOM__Group_1_1__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalT2A.g:3264:1: rule__InstanciaEDOM__Group_1_1__2__Impl : ( ( rule__InstanciaEDOM__SclassesAssignment_1_1_2 )* ) ;
    public final void rule__InstanciaEDOM__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3268:1: ( ( ( rule__InstanciaEDOM__SclassesAssignment_1_1_2 )* ) )
            // InternalT2A.g:3269:1: ( ( rule__InstanciaEDOM__SclassesAssignment_1_1_2 )* )
            {
            // InternalT2A.g:3269:1: ( ( rule__InstanciaEDOM__SclassesAssignment_1_1_2 )* )
            // InternalT2A.g:3270:2: ( rule__InstanciaEDOM__SclassesAssignment_1_1_2 )*
            {
             before(grammarAccess.getInstanciaEDOMAccess().getSclassesAssignment_1_1_2()); 
            // InternalT2A.g:3271:2: ( rule__InstanciaEDOM__SclassesAssignment_1_1_2 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalT2A.g:3271:3: rule__InstanciaEDOM__SclassesAssignment_1_1_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__InstanciaEDOM__SclassesAssignment_1_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalT2A.g:3279:1: rule__InstanciaEDOM__Group_1_1__3 : rule__InstanciaEDOM__Group_1_1__3__Impl ;
    public final void rule__InstanciaEDOM__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3283:1: ( rule__InstanciaEDOM__Group_1_1__3__Impl )
            // InternalT2A.g:3284:2: rule__InstanciaEDOM__Group_1_1__3__Impl
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
    // InternalT2A.g:3290:1: rule__InstanciaEDOM__Group_1_1__3__Impl : ( '}' ) ;
    public final void rule__InstanciaEDOM__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3294:1: ( ( '}' ) )
            // InternalT2A.g:3295:1: ( '}' )
            {
            // InternalT2A.g:3295:1: ( '}' )
            // InternalT2A.g:3296:2: '}'
            {
             before(grammarAccess.getInstanciaEDOMAccess().getRightCurlyBracketKeyword_1_1_3()); 
            match(input,22,FOLLOW_2); 
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


    // $ANTLR start "rule__InstanciaEDOM__Group_1_2__0"
    // InternalT2A.g:3306:1: rule__InstanciaEDOM__Group_1_2__0 : rule__InstanciaEDOM__Group_1_2__0__Impl rule__InstanciaEDOM__Group_1_2__1 ;
    public final void rule__InstanciaEDOM__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3310:1: ( rule__InstanciaEDOM__Group_1_2__0__Impl rule__InstanciaEDOM__Group_1_2__1 )
            // InternalT2A.g:3311:2: rule__InstanciaEDOM__Group_1_2__0__Impl rule__InstanciaEDOM__Group_1_2__1
            {
            pushFollow(FOLLOW_8);
            rule__InstanciaEDOM__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanciaEDOM__Group_1_2__1();

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
    // $ANTLR end "rule__InstanciaEDOM__Group_1_2__0"


    // $ANTLR start "rule__InstanciaEDOM__Group_1_2__0__Impl"
    // InternalT2A.g:3318:1: rule__InstanciaEDOM__Group_1_2__0__Impl : ( 'sclassString' ) ;
    public final void rule__InstanciaEDOM__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3322:1: ( ( 'sclassString' ) )
            // InternalT2A.g:3323:1: ( 'sclassString' )
            {
            // InternalT2A.g:3323:1: ( 'sclassString' )
            // InternalT2A.g:3324:2: 'sclassString'
            {
             before(grammarAccess.getInstanciaEDOMAccess().getSclassStringKeyword_1_2_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getInstanciaEDOMAccess().getSclassStringKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1_2__0__Impl"


    // $ANTLR start "rule__InstanciaEDOM__Group_1_2__1"
    // InternalT2A.g:3333:1: rule__InstanciaEDOM__Group_1_2__1 : rule__InstanciaEDOM__Group_1_2__1__Impl rule__InstanciaEDOM__Group_1_2__2 ;
    public final void rule__InstanciaEDOM__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3337:1: ( rule__InstanciaEDOM__Group_1_2__1__Impl rule__InstanciaEDOM__Group_1_2__2 )
            // InternalT2A.g:3338:2: rule__InstanciaEDOM__Group_1_2__1__Impl rule__InstanciaEDOM__Group_1_2__2
            {
            pushFollow(FOLLOW_16);
            rule__InstanciaEDOM__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanciaEDOM__Group_1_2__2();

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
    // $ANTLR end "rule__InstanciaEDOM__Group_1_2__1"


    // $ANTLR start "rule__InstanciaEDOM__Group_1_2__1__Impl"
    // InternalT2A.g:3345:1: rule__InstanciaEDOM__Group_1_2__1__Impl : ( '{' ) ;
    public final void rule__InstanciaEDOM__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3349:1: ( ( '{' ) )
            // InternalT2A.g:3350:1: ( '{' )
            {
            // InternalT2A.g:3350:1: ( '{' )
            // InternalT2A.g:3351:2: '{'
            {
             before(grammarAccess.getInstanciaEDOMAccess().getLeftCurlyBracketKeyword_1_2_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getInstanciaEDOMAccess().getLeftCurlyBracketKeyword_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1_2__1__Impl"


    // $ANTLR start "rule__InstanciaEDOM__Group_1_2__2"
    // InternalT2A.g:3360:1: rule__InstanciaEDOM__Group_1_2__2 : rule__InstanciaEDOM__Group_1_2__2__Impl rule__InstanciaEDOM__Group_1_2__3 ;
    public final void rule__InstanciaEDOM__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3364:1: ( rule__InstanciaEDOM__Group_1_2__2__Impl rule__InstanciaEDOM__Group_1_2__3 )
            // InternalT2A.g:3365:2: rule__InstanciaEDOM__Group_1_2__2__Impl rule__InstanciaEDOM__Group_1_2__3
            {
            pushFollow(FOLLOW_16);
            rule__InstanciaEDOM__Group_1_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanciaEDOM__Group_1_2__3();

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
    // $ANTLR end "rule__InstanciaEDOM__Group_1_2__2"


    // $ANTLR start "rule__InstanciaEDOM__Group_1_2__2__Impl"
    // InternalT2A.g:3372:1: rule__InstanciaEDOM__Group_1_2__2__Impl : ( ( rule__InstanciaEDOM__SclassesOnlineAssignment_1_2_2 )* ) ;
    public final void rule__InstanciaEDOM__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3376:1: ( ( ( rule__InstanciaEDOM__SclassesOnlineAssignment_1_2_2 )* ) )
            // InternalT2A.g:3377:1: ( ( rule__InstanciaEDOM__SclassesOnlineAssignment_1_2_2 )* )
            {
            // InternalT2A.g:3377:1: ( ( rule__InstanciaEDOM__SclassesOnlineAssignment_1_2_2 )* )
            // InternalT2A.g:3378:2: ( rule__InstanciaEDOM__SclassesOnlineAssignment_1_2_2 )*
            {
             before(grammarAccess.getInstanciaEDOMAccess().getSclassesOnlineAssignment_1_2_2()); 
            // InternalT2A.g:3379:2: ( rule__InstanciaEDOM__SclassesOnlineAssignment_1_2_2 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_STRING) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalT2A.g:3379:3: rule__InstanciaEDOM__SclassesOnlineAssignment_1_2_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__InstanciaEDOM__SclassesOnlineAssignment_1_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getInstanciaEDOMAccess().getSclassesOnlineAssignment_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1_2__2__Impl"


    // $ANTLR start "rule__InstanciaEDOM__Group_1_2__3"
    // InternalT2A.g:3387:1: rule__InstanciaEDOM__Group_1_2__3 : rule__InstanciaEDOM__Group_1_2__3__Impl ;
    public final void rule__InstanciaEDOM__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3391:1: ( rule__InstanciaEDOM__Group_1_2__3__Impl )
            // InternalT2A.g:3392:2: rule__InstanciaEDOM__Group_1_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstanciaEDOM__Group_1_2__3__Impl();

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
    // $ANTLR end "rule__InstanciaEDOM__Group_1_2__3"


    // $ANTLR start "rule__InstanciaEDOM__Group_1_2__3__Impl"
    // InternalT2A.g:3398:1: rule__InstanciaEDOM__Group_1_2__3__Impl : ( '}' ) ;
    public final void rule__InstanciaEDOM__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3402:1: ( ( '}' ) )
            // InternalT2A.g:3403:1: ( '}' )
            {
            // InternalT2A.g:3403:1: ( '}' )
            // InternalT2A.g:3404:2: '}'
            {
             before(grammarAccess.getInstanciaEDOMAccess().getRightCurlyBracketKeyword_1_2_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInstanciaEDOMAccess().getRightCurlyBracketKeyword_1_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1_2__3__Impl"


    // $ANTLR start "rule__Root__AppNameAssignment_1"
    // InternalT2A.g:3414:1: rule__Root__AppNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Root__AppNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3418:1: ( ( RULE_STRING ) )
            // InternalT2A.g:3419:2: ( RULE_STRING )
            {
            // InternalT2A.g:3419:2: ( RULE_STRING )
            // InternalT2A.g:3420:3: RULE_STRING
            {
             before(grammarAccess.getRootAccess().getAppNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getAppNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__AppNameAssignment_1"


    // $ANTLR start "rule__Root__GlobalStyleAssignment_2"
    // InternalT2A.g:3429:1: rule__Root__GlobalStyleAssignment_2 : ( ruleStyleGlobal ) ;
    public final void rule__Root__GlobalStyleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3433:1: ( ( ruleStyleGlobal ) )
            // InternalT2A.g:3434:2: ( ruleStyleGlobal )
            {
            // InternalT2A.g:3434:2: ( ruleStyleGlobal )
            // InternalT2A.g:3435:3: ruleStyleGlobal
            {
             before(grammarAccess.getRootAccess().getGlobalStyleStyleGlobalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStyleGlobal();

            state._fsp--;

             after(grammarAccess.getRootAccess().getGlobalStyleStyleGlobalParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__GlobalStyleAssignment_2"


    // $ANTLR start "rule__Root__StyleOnlineAssignment_3"
    // InternalT2A.g:3444:1: rule__Root__StyleOnlineAssignment_3 : ( ruleStyleOnline ) ;
    public final void rule__Root__StyleOnlineAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3448:1: ( ( ruleStyleOnline ) )
            // InternalT2A.g:3449:2: ( ruleStyleOnline )
            {
            // InternalT2A.g:3449:2: ( ruleStyleOnline )
            // InternalT2A.g:3450:3: ruleStyleOnline
            {
             before(grammarAccess.getRootAccess().getStyleOnlineStyleOnlineParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStyleOnline();

            state._fsp--;

             after(grammarAccess.getRootAccess().getStyleOnlineStyleOnlineParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__StyleOnlineAssignment_3"


    // $ANTLR start "rule__Root__JsOnlineAssignment_4"
    // InternalT2A.g:3459:1: rule__Root__JsOnlineAssignment_4 : ( ruleJSOnline ) ;
    public final void rule__Root__JsOnlineAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3463:1: ( ( ruleJSOnline ) )
            // InternalT2A.g:3464:2: ( ruleJSOnline )
            {
            // InternalT2A.g:3464:2: ( ruleJSOnline )
            // InternalT2A.g:3465:3: ruleJSOnline
            {
             before(grammarAccess.getRootAccess().getJsOnlineJSOnlineParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleJSOnline();

            state._fsp--;

             after(grammarAccess.getRootAccess().getJsOnlineJSOnlineParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__JsOnlineAssignment_4"


    // $ANTLR start "rule__Root__ElementsAssignment_5"
    // InternalT2A.g:3474:1: rule__Root__ElementsAssignment_5 : ( ruleElement ) ;
    public final void rule__Root__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3478:1: ( ( ruleElement ) )
            // InternalT2A.g:3479:2: ( ruleElement )
            {
            // InternalT2A.g:3479:2: ( ruleElement )
            // InternalT2A.g:3480:3: ruleElement
            {
             before(grammarAccess.getRootAccess().getElementsElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getRootAccess().getElementsElementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__ElementsAssignment_5"


    // $ANTLR start "rule__Page__NameAssignment_1"
    // InternalT2A.g:3489:1: rule__Page__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Page__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3493:1: ( ( RULE_ID ) )
            // InternalT2A.g:3494:2: ( RULE_ID )
            {
            // InternalT2A.g:3494:2: ( RULE_ID )
            // InternalT2A.g:3495:3: RULE_ID
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
    // InternalT2A.g:3504:1: rule__Page__HostclassesAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__Page__HostclassesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3508:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:3509:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:3509:2: ( ( RULE_ID ) )
            // InternalT2A.g:3510:3: ( RULE_ID )
            {
             before(grammarAccess.getPageAccess().getHostclassesStyleClassCrossReference_3_2_0()); 
            // InternalT2A.g:3511:3: ( RULE_ID )
            // InternalT2A.g:3512:4: RULE_ID
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
    // InternalT2A.g:3523:1: rule__Page__HomeAssignment_4 : ( ( 'home' ) ) ;
    public final void rule__Page__HomeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3527:1: ( ( ( 'home' ) ) )
            // InternalT2A.g:3528:2: ( ( 'home' ) )
            {
            // InternalT2A.g:3528:2: ( ( 'home' ) )
            // InternalT2A.g:3529:3: ( 'home' )
            {
             before(grammarAccess.getPageAccess().getHomeHomeKeyword_4_0()); 
            // InternalT2A.g:3530:3: ( 'home' )
            // InternalT2A.g:3531:4: 'home'
            {
             before(grammarAccess.getPageAccess().getHomeHomeKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalT2A.g:3542:1: rule__Page__ShowInNavAssignment_5 : ( ( 'showInNav' ) ) ;
    public final void rule__Page__ShowInNavAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3546:1: ( ( ( 'showInNav' ) ) )
            // InternalT2A.g:3547:2: ( ( 'showInNav' ) )
            {
            // InternalT2A.g:3547:2: ( ( 'showInNav' ) )
            // InternalT2A.g:3548:3: ( 'showInNav' )
            {
             before(grammarAccess.getPageAccess().getShowInNavShowInNavKeyword_5_0()); 
            // InternalT2A.g:3549:3: ( 'showInNav' )
            // InternalT2A.g:3550:4: 'showInNav'
            {
             before(grammarAccess.getPageAccess().getShowInNavShowInNavKeyword_5_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalT2A.g:3561:1: rule__Page__PageFeaturesAssignment_6 : ( rulePageFeature ) ;
    public final void rule__Page__PageFeaturesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3565:1: ( ( rulePageFeature ) )
            // InternalT2A.g:3566:2: ( rulePageFeature )
            {
            // InternalT2A.g:3566:2: ( rulePageFeature )
            // InternalT2A.g:3567:3: rulePageFeature
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
    // InternalT2A.g:3576:1: rule__StyleGlobal__StyleclassesAssignment_3 : ( ruleStyleClass ) ;
    public final void rule__StyleGlobal__StyleclassesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3580:1: ( ( ruleStyleClass ) )
            // InternalT2A.g:3581:2: ( ruleStyleClass )
            {
            // InternalT2A.g:3581:2: ( ruleStyleClass )
            // InternalT2A.g:3582:3: ruleStyleClass
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


    // $ANTLR start "rule__StyleOnline__FullTagsAssignment_3"
    // InternalT2A.g:3591:1: rule__StyleOnline__FullTagsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__StyleOnline__FullTagsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3595:1: ( ( RULE_STRING ) )
            // InternalT2A.g:3596:2: ( RULE_STRING )
            {
            // InternalT2A.g:3596:2: ( RULE_STRING )
            // InternalT2A.g:3597:3: RULE_STRING
            {
             before(grammarAccess.getStyleOnlineAccess().getFullTagsSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStyleOnlineAccess().getFullTagsSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StyleOnline__FullTagsAssignment_3"


    // $ANTLR start "rule__JSOnline__FullTagsAssignment_3"
    // InternalT2A.g:3606:1: rule__JSOnline__FullTagsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__JSOnline__FullTagsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3610:1: ( ( RULE_STRING ) )
            // InternalT2A.g:3611:2: ( RULE_STRING )
            {
            // InternalT2A.g:3611:2: ( RULE_STRING )
            // InternalT2A.g:3612:3: RULE_STRING
            {
             before(grammarAccess.getJSOnlineAccess().getFullTagsSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJSOnlineAccess().getFullTagsSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSOnline__FullTagsAssignment_3"


    // $ANTLR start "rule__StyleClass__NameAssignment_1"
    // InternalT2A.g:3621:1: rule__StyleClass__NameAssignment_1 : ( ruleName ) ;
    public final void rule__StyleClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3625:1: ( ( ruleName ) )
            // InternalT2A.g:3626:2: ( ruleName )
            {
            // InternalT2A.g:3626:2: ( ruleName )
            // InternalT2A.g:3627:3: ruleName
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
    // InternalT2A.g:3636:1: rule__StyleClass__SattributesAssignment_3_0 : ( ruleSAttributeAndValue ) ;
    public final void rule__StyleClass__SattributesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3640:1: ( ( ruleSAttributeAndValue ) )
            // InternalT2A.g:3641:2: ( ruleSAttributeAndValue )
            {
            // InternalT2A.g:3641:2: ( ruleSAttributeAndValue )
            // InternalT2A.g:3642:3: ruleSAttributeAndValue
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
    // InternalT2A.g:3651:1: rule__StyleClass__SattributesAfterAssignment_4_2_0 : ( ruleSAttributeAndValue ) ;
    public final void rule__StyleClass__SattributesAfterAssignment_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3655:1: ( ( ruleSAttributeAndValue ) )
            // InternalT2A.g:3656:2: ( ruleSAttributeAndValue )
            {
            // InternalT2A.g:3656:2: ( ruleSAttributeAndValue )
            // InternalT2A.g:3657:3: ruleSAttributeAndValue
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
    // InternalT2A.g:3666:1: rule__StyleClass__SattributesActiveAssignment_5_2_0 : ( ruleSAttributeAndValue ) ;
    public final void rule__StyleClass__SattributesActiveAssignment_5_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3670:1: ( ( ruleSAttributeAndValue ) )
            // InternalT2A.g:3671:2: ( ruleSAttributeAndValue )
            {
            // InternalT2A.g:3671:2: ( ruleSAttributeAndValue )
            // InternalT2A.g:3672:3: ruleSAttributeAndValue
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
    // InternalT2A.g:3681:1: rule__SAttributeAndValue__StnameAssignment_0 : ( ruleName ) ;
    public final void rule__SAttributeAndValue__StnameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3685:1: ( ( ruleName ) )
            // InternalT2A.g:3686:2: ( ruleName )
            {
            // InternalT2A.g:3686:2: ( ruleName )
            // InternalT2A.g:3687:3: ruleName
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
    // InternalT2A.g:3696:1: rule__SAttributeAndValue__ValueAssignment_1 : ( RULE_STRING2 ) ;
    public final void rule__SAttributeAndValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3700:1: ( ( RULE_STRING2 ) )
            // InternalT2A.g:3701:2: ( RULE_STRING2 )
            {
            // InternalT2A.g:3701:2: ( RULE_STRING2 )
            // InternalT2A.g:3702:3: RULE_STRING2
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
    // InternalT2A.g:3711:1: rule__DOM__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DOM__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3715:1: ( ( RULE_ID ) )
            // InternalT2A.g:3716:2: ( RULE_ID )
            {
            // InternalT2A.g:3716:2: ( RULE_ID )
            // InternalT2A.g:3717:3: RULE_ID
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
    // InternalT2A.g:3726:1: rule__DOM__SclassesAssignment_2_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__DOM__SclassesAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3730:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:3731:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:3731:2: ( ( RULE_ID ) )
            // InternalT2A.g:3732:3: ( RULE_ID )
            {
             before(grammarAccess.getDOMAccess().getSclassesStyleClassCrossReference_2_1_2_0()); 
            // InternalT2A.g:3733:3: ( RULE_ID )
            // InternalT2A.g:3734:4: RULE_ID
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


    // $ANTLR start "rule__DOM__SclassesOnlineAssignment_2_2_2"
    // InternalT2A.g:3745:1: rule__DOM__SclassesOnlineAssignment_2_2_2 : ( RULE_STRING ) ;
    public final void rule__DOM__SclassesOnlineAssignment_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3749:1: ( ( RULE_STRING ) )
            // InternalT2A.g:3750:2: ( RULE_STRING )
            {
            // InternalT2A.g:3750:2: ( RULE_STRING )
            // InternalT2A.g:3751:3: RULE_STRING
            {
             before(grammarAccess.getDOMAccess().getSclassesOnlineSTRINGTerminalRuleCall_2_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDOMAccess().getSclassesOnlineSTRINGTerminalRuleCall_2_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__SclassesOnlineAssignment_2_2_2"


    // $ANTLR start "rule__DOM__FeaturesAssignment_2_3"
    // InternalT2A.g:3760:1: rule__DOM__FeaturesAssignment_2_3 : ( ruleFeature ) ;
    public final void rule__DOM__FeaturesAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3764:1: ( ( ruleFeature ) )
            // InternalT2A.g:3765:2: ( ruleFeature )
            {
            // InternalT2A.g:3765:2: ( ruleFeature )
            // InternalT2A.g:3766:3: ruleFeature
            {
             before(grammarAccess.getDOMAccess().getFeaturesFeatureParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getDOMAccess().getFeaturesFeatureParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOM__FeaturesAssignment_2_3"


    // $ANTLR start "rule__Comp__NameAssignment_1"
    // InternalT2A.g:3775:1: rule__Comp__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Comp__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3779:1: ( ( RULE_ID ) )
            // InternalT2A.g:3780:2: ( RULE_ID )
            {
            // InternalT2A.g:3780:2: ( RULE_ID )
            // InternalT2A.g:3781:3: RULE_ID
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
    // InternalT2A.g:3790:1: rule__Comp__HostclassesAssignment_2_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Comp__HostclassesAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3794:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:3795:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:3795:2: ( ( RULE_ID ) )
            // InternalT2A.g:3796:3: ( RULE_ID )
            {
             before(grammarAccess.getCompAccess().getHostclassesStyleClassCrossReference_2_1_2_0()); 
            // InternalT2A.g:3797:3: ( RULE_ID )
            // InternalT2A.g:3798:4: RULE_ID
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


    // $ANTLR start "rule__Comp__SclassesOnlineAssignment_2_2_2"
    // InternalT2A.g:3809:1: rule__Comp__SclassesOnlineAssignment_2_2_2 : ( RULE_STRING ) ;
    public final void rule__Comp__SclassesOnlineAssignment_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3813:1: ( ( RULE_STRING ) )
            // InternalT2A.g:3814:2: ( RULE_STRING )
            {
            // InternalT2A.g:3814:2: ( RULE_STRING )
            // InternalT2A.g:3815:3: RULE_STRING
            {
             before(grammarAccess.getCompAccess().getSclassesOnlineSTRINGTerminalRuleCall_2_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCompAccess().getSclassesOnlineSTRINGTerminalRuleCall_2_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__SclassesOnlineAssignment_2_2_2"


    // $ANTLR start "rule__Comp__FeaturesAssignment_2_3"
    // InternalT2A.g:3824:1: rule__Comp__FeaturesAssignment_2_3 : ( ruleFeature ) ;
    public final void rule__Comp__FeaturesAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3828:1: ( ( ruleFeature ) )
            // InternalT2A.g:3829:2: ( ruleFeature )
            {
            // InternalT2A.g:3829:2: ( ruleFeature )
            // InternalT2A.g:3830:3: ruleFeature
            {
             before(grammarAccess.getCompAccess().getFeaturesFeatureParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getCompAccess().getFeaturesFeatureParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__FeaturesAssignment_2_3"


    // $ANTLR start "rule__InstanciaEDOM__InstanciaAssignment_0"
    // InternalT2A.g:3839:1: rule__InstanciaEDOM__InstanciaAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__InstanciaEDOM__InstanciaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3843:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:3844:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:3844:2: ( ( RULE_ID ) )
            // InternalT2A.g:3845:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanciaEDOMAccess().getInstanciaEDOMCrossReference_0_0()); 
            // InternalT2A.g:3846:3: ( RULE_ID )
            // InternalT2A.g:3847:4: RULE_ID
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
    // InternalT2A.g:3858:1: rule__InstanciaEDOM__SclassesAssignment_1_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__InstanciaEDOM__SclassesAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3862:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:3863:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:3863:2: ( ( RULE_ID ) )
            // InternalT2A.g:3864:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanciaEDOMAccess().getSclassesStyleClassCrossReference_1_1_2_0()); 
            // InternalT2A.g:3865:3: ( RULE_ID )
            // InternalT2A.g:3866:4: RULE_ID
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


    // $ANTLR start "rule__InstanciaEDOM__SclassesOnlineAssignment_1_2_2"
    // InternalT2A.g:3877:1: rule__InstanciaEDOM__SclassesOnlineAssignment_1_2_2 : ( RULE_STRING ) ;
    public final void rule__InstanciaEDOM__SclassesOnlineAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3881:1: ( ( RULE_STRING ) )
            // InternalT2A.g:3882:2: ( RULE_STRING )
            {
            // InternalT2A.g:3882:2: ( RULE_STRING )
            // InternalT2A.g:3883:3: RULE_STRING
            {
             before(grammarAccess.getInstanciaEDOMAccess().getSclassesOnlineSTRINGTerminalRuleCall_1_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInstanciaEDOMAccess().getSclassesOnlineSTRINGTerminalRuleCall_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__SclassesOnlineAssignment_1_2_2"


    // $ANTLR start "rule__InstanciaEDOM__InsfeaturesAssignment_1_3"
    // InternalT2A.g:3892:1: rule__InstanciaEDOM__InsfeaturesAssignment_1_3 : ( ruleInstanceEDOMFeature ) ;
    public final void rule__InstanciaEDOM__InsfeaturesAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3896:1: ( ( ruleInstanceEDOMFeature ) )
            // InternalT2A.g:3897:2: ( ruleInstanceEDOMFeature )
            {
            // InternalT2A.g:3897:2: ( ruleInstanceEDOMFeature )
            // InternalT2A.g:3898:3: ruleInstanceEDOMFeature
            {
             before(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesInstanceEDOMFeatureParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInstanceEDOMFeature();

            state._fsp--;

             after(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesInstanceEDOMFeatureParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__InsfeaturesAssignment_1_3"


    // $ANTLR start "rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0"
    // InternalT2A.g:3907:1: rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 : ( ruleInstanciaEDOM ) ;
    public final void rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3911:1: ( ( ruleInstanciaEDOM ) )
            // InternalT2A.g:3912:2: ( ruleInstanciaEDOM )
            {
            // InternalT2A.g:3912:2: ( ruleInstanciaEDOM )
            // InternalT2A.g:3913:3: ruleInstanciaEDOM
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
    // InternalT2A.g:3922:1: rule__InstanceEDOMFeature__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__InstanceEDOMFeature__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3926:1: ( ( RULE_STRING ) )
            // InternalT2A.g:3927:2: ( RULE_STRING )
            {
            // InternalT2A.g:3927:2: ( RULE_STRING )
            // InternalT2A.g:3928:3: RULE_STRING
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
    // InternalT2A.g:3937:1: rule__PageFeature__InstanciaEDOMAssignment_0 : ( ruleInstanciaEDOM ) ;
    public final void rule__PageFeature__InstanciaEDOMAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3941:1: ( ( ruleInstanciaEDOM ) )
            // InternalT2A.g:3942:2: ( ruleInstanciaEDOM )
            {
            // InternalT2A.g:3942:2: ( ruleInstanciaEDOM )
            // InternalT2A.g:3943:3: ruleInstanciaEDOM
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
    // InternalT2A.g:3952:1: rule__PageFeature__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__PageFeature__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3956:1: ( ( RULE_STRING ) )
            // InternalT2A.g:3957:2: ( RULE_STRING )
            {
            // InternalT2A.g:3957:2: ( RULE_STRING )
            // InternalT2A.g:3958:3: RULE_STRING
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
    // InternalT2A.g:3967:1: rule__Feature__InstanciaEDOMAssignment_0 : ( ruleInstanciaEDOM ) ;
    public final void rule__Feature__InstanciaEDOMAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3971:1: ( ( ruleInstanciaEDOM ) )
            // InternalT2A.g:3972:2: ( ruleInstanciaEDOM )
            {
            // InternalT2A.g:3972:2: ( ruleInstanciaEDOM )
            // InternalT2A.g:3973:3: ruleInstanciaEDOM
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
    // InternalT2A.g:3982:1: rule__Feature__AllowSlotAssignment_1 : ( ( 'AllowSlot' ) ) ;
    public final void rule__Feature__AllowSlotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3986:1: ( ( ( 'AllowSlot' ) ) )
            // InternalT2A.g:3987:2: ( ( 'AllowSlot' ) )
            {
            // InternalT2A.g:3987:2: ( ( 'AllowSlot' ) )
            // InternalT2A.g:3988:3: ( 'AllowSlot' )
            {
             before(grammarAccess.getFeatureAccess().getAllowSlotAllowSlotKeyword_1_0()); 
            // InternalT2A.g:3989:3: ( 'AllowSlot' )
            // InternalT2A.g:3990:4: 'AllowSlot'
            {
             before(grammarAccess.getFeatureAccess().getAllowSlotAllowSlotKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalT2A.g:4001:1: rule__Feature__StringAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Feature__StringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:4005:1: ( ( RULE_STRING ) )
            // InternalT2A.g:4006:2: ( RULE_STRING )
            {
            // InternalT2A.g:4006:2: ( RULE_STRING )
            // InternalT2A.g:4007:3: RULE_STRING
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000028F100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000028F100002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000C00C00030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000028F500000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000007F010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000006047F010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000047F010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001100C00030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000032L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100C00030L});

}