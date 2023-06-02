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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_STRING2", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'_'", "'#'", "'-'", "'*'", "'.'", "'::'", "'>'", "'AppName:'", "'Page'", "'{'", "'}'", "'sclass'", "'StyleGlobal'", "'StyleOnline'", "'JSOnline'", "'StyleClass'", "';'", "'after'", "'active'", "'Dom'", "'sclassString'", "'Comp'", "'GoTo'", "'('", "')'", "'click::'", "'home'", "'showInNav'", "'AllowSlot'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
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
    public static final int T__40=40;
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


    // $ANTLR start "entryRuleGoTo"
    // InternalT2A.g:328:1: entryRuleGoTo : ruleGoTo EOF ;
    public final void entryRuleGoTo() throws RecognitionException {
        try {
            // InternalT2A.g:329:1: ( ruleGoTo EOF )
            // InternalT2A.g:330:1: ruleGoTo EOF
            {
             before(grammarAccess.getGoToRule()); 
            pushFollow(FOLLOW_1);
            ruleGoTo();

            state._fsp--;

             after(grammarAccess.getGoToRule()); 
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
    // $ANTLR end "entryRuleGoTo"


    // $ANTLR start "ruleGoTo"
    // InternalT2A.g:337:1: ruleGoTo : ( ( rule__GoTo__Group__0 ) ) ;
    public final void ruleGoTo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:341:2: ( ( ( rule__GoTo__Group__0 ) ) )
            // InternalT2A.g:342:2: ( ( rule__GoTo__Group__0 ) )
            {
            // InternalT2A.g:342:2: ( ( rule__GoTo__Group__0 ) )
            // InternalT2A.g:343:3: ( rule__GoTo__Group__0 )
            {
             before(grammarAccess.getGoToAccess().getGroup()); 
            // InternalT2A.g:344:3: ( rule__GoTo__Group__0 )
            // InternalT2A.g:344:4: rule__GoTo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoToAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoTo"


    // $ANTLR start "entryRuleInstanciaEDOM"
    // InternalT2A.g:353:1: entryRuleInstanciaEDOM : ruleInstanciaEDOM EOF ;
    public final void entryRuleInstanciaEDOM() throws RecognitionException {
        try {
            // InternalT2A.g:354:1: ( ruleInstanciaEDOM EOF )
            // InternalT2A.g:355:1: ruleInstanciaEDOM EOF
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
    // InternalT2A.g:362:1: ruleInstanciaEDOM : ( ( rule__InstanciaEDOM__Group__0 ) ) ;
    public final void ruleInstanciaEDOM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:366:2: ( ( ( rule__InstanciaEDOM__Group__0 ) ) )
            // InternalT2A.g:367:2: ( ( rule__InstanciaEDOM__Group__0 ) )
            {
            // InternalT2A.g:367:2: ( ( rule__InstanciaEDOM__Group__0 ) )
            // InternalT2A.g:368:3: ( rule__InstanciaEDOM__Group__0 )
            {
             before(grammarAccess.getInstanciaEDOMAccess().getGroup()); 
            // InternalT2A.g:369:3: ( rule__InstanciaEDOM__Group__0 )
            // InternalT2A.g:369:4: rule__InstanciaEDOM__Group__0
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
    // InternalT2A.g:378:1: entryRuleInstanceEDOMFeature : ruleInstanceEDOMFeature EOF ;
    public final void entryRuleInstanceEDOMFeature() throws RecognitionException {
        try {
            // InternalT2A.g:379:1: ( ruleInstanceEDOMFeature EOF )
            // InternalT2A.g:380:1: ruleInstanceEDOMFeature EOF
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
    // InternalT2A.g:387:1: ruleInstanceEDOMFeature : ( ( rule__InstanceEDOMFeature__Alternatives ) ) ;
    public final void ruleInstanceEDOMFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:391:2: ( ( ( rule__InstanceEDOMFeature__Alternatives ) ) )
            // InternalT2A.g:392:2: ( ( rule__InstanceEDOMFeature__Alternatives ) )
            {
            // InternalT2A.g:392:2: ( ( rule__InstanceEDOMFeature__Alternatives ) )
            // InternalT2A.g:393:3: ( rule__InstanceEDOMFeature__Alternatives )
            {
             before(grammarAccess.getInstanceEDOMFeatureAccess().getAlternatives()); 
            // InternalT2A.g:394:3: ( rule__InstanceEDOMFeature__Alternatives )
            // InternalT2A.g:394:4: rule__InstanceEDOMFeature__Alternatives
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
    // InternalT2A.g:403:1: entryRulePageFeature : rulePageFeature EOF ;
    public final void entryRulePageFeature() throws RecognitionException {
        try {
            // InternalT2A.g:404:1: ( rulePageFeature EOF )
            // InternalT2A.g:405:1: rulePageFeature EOF
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
    // InternalT2A.g:412:1: rulePageFeature : ( ( rule__PageFeature__Alternatives ) ) ;
    public final void rulePageFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:416:2: ( ( ( rule__PageFeature__Alternatives ) ) )
            // InternalT2A.g:417:2: ( ( rule__PageFeature__Alternatives ) )
            {
            // InternalT2A.g:417:2: ( ( rule__PageFeature__Alternatives ) )
            // InternalT2A.g:418:3: ( rule__PageFeature__Alternatives )
            {
             before(grammarAccess.getPageFeatureAccess().getAlternatives()); 
            // InternalT2A.g:419:3: ( rule__PageFeature__Alternatives )
            // InternalT2A.g:419:4: rule__PageFeature__Alternatives
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
    // InternalT2A.g:428:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalT2A.g:429:1: ( ruleFeature EOF )
            // InternalT2A.g:430:1: ruleFeature EOF
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
    // InternalT2A.g:437:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:441:2: ( ( ( rule__Feature__Alternatives ) ) )
            // InternalT2A.g:442:2: ( ( rule__Feature__Alternatives ) )
            {
            // InternalT2A.g:442:2: ( ( rule__Feature__Alternatives ) )
            // InternalT2A.g:443:3: ( rule__Feature__Alternatives )
            {
             before(grammarAccess.getFeatureAccess().getAlternatives()); 
            // InternalT2A.g:444:3: ( rule__Feature__Alternatives )
            // InternalT2A.g:444:4: rule__Feature__Alternatives
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
    // InternalT2A.g:453:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalT2A.g:454:1: ( ruleName EOF )
            // InternalT2A.g:455:1: ruleName EOF
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
    // InternalT2A.g:462:1: ruleName : ( ( rule__Name__Alternatives )* ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:466:2: ( ( ( rule__Name__Alternatives )* ) )
            // InternalT2A.g:467:2: ( ( rule__Name__Alternatives )* )
            {
            // InternalT2A.g:467:2: ( ( rule__Name__Alternatives )* )
            // InternalT2A.g:468:3: ( rule__Name__Alternatives )*
            {
             before(grammarAccess.getNameAccess().getAlternatives()); 
            // InternalT2A.g:469:3: ( rule__Name__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=12 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalT2A.g:469:4: rule__Name__Alternatives
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
    // InternalT2A.g:477:1: rule__Element__Alternatives : ( ( rulePage ) | ( ruleEDOM ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:481:1: ( ( rulePage ) | ( ruleEDOM ) )
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
                    // InternalT2A.g:482:2: ( rulePage )
                    {
                    // InternalT2A.g:482:2: ( rulePage )
                    // InternalT2A.g:483:3: rulePage
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
                    // InternalT2A.g:488:2: ( ruleEDOM )
                    {
                    // InternalT2A.g:488:2: ( ruleEDOM )
                    // InternalT2A.g:489:3: ruleEDOM
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
    // InternalT2A.g:498:1: rule__EDOM__Alternatives : ( ( ruleDOM ) | ( ruleComp ) | ( ruleStyleClass ) );
    public final void rule__EDOM__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:502:1: ( ( ruleDOM ) | ( ruleComp ) | ( ruleStyleClass ) )
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
                    // InternalT2A.g:503:2: ( ruleDOM )
                    {
                    // InternalT2A.g:503:2: ( ruleDOM )
                    // InternalT2A.g:504:3: ruleDOM
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
                    // InternalT2A.g:509:2: ( ruleComp )
                    {
                    // InternalT2A.g:509:2: ( ruleComp )
                    // InternalT2A.g:510:3: ruleComp
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
                    // InternalT2A.g:515:2: ( ruleStyleClass )
                    {
                    // InternalT2A.g:515:2: ( ruleStyleClass )
                    // InternalT2A.g:516:3: ruleStyleClass
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
    // InternalT2A.g:525:1: rule__InstanceEDOMFeature__Alternatives : ( ( ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__InstanceEDOMFeature__StringAssignment_1 ) ) );
    public final void rule__InstanceEDOMFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:529:1: ( ( ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__InstanceEDOMFeature__StringAssignment_1 ) ) )
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
                    // InternalT2A.g:530:2: ( ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 ) )
                    {
                    // InternalT2A.g:530:2: ( ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 ) )
                    // InternalT2A.g:531:3: ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 )
                    {
                     before(grammarAccess.getInstanceEDOMFeatureAccess().getInstanciaEDOMAssignment_0()); 
                    // InternalT2A.g:532:3: ( rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 )
                    // InternalT2A.g:532:4: rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0
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
                    // InternalT2A.g:536:2: ( ( rule__InstanceEDOMFeature__StringAssignment_1 ) )
                    {
                    // InternalT2A.g:536:2: ( ( rule__InstanceEDOMFeature__StringAssignment_1 ) )
                    // InternalT2A.g:537:3: ( rule__InstanceEDOMFeature__StringAssignment_1 )
                    {
                     before(grammarAccess.getInstanceEDOMFeatureAccess().getStringAssignment_1()); 
                    // InternalT2A.g:538:3: ( rule__InstanceEDOMFeature__StringAssignment_1 )
                    // InternalT2A.g:538:4: rule__InstanceEDOMFeature__StringAssignment_1
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
    // InternalT2A.g:546:1: rule__PageFeature__Alternatives : ( ( ( rule__PageFeature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__PageFeature__StringAssignment_1 ) ) );
    public final void rule__PageFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:550:1: ( ( ( rule__PageFeature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__PageFeature__StringAssignment_1 ) ) )
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
                    // InternalT2A.g:551:2: ( ( rule__PageFeature__InstanciaEDOMAssignment_0 ) )
                    {
                    // InternalT2A.g:551:2: ( ( rule__PageFeature__InstanciaEDOMAssignment_0 ) )
                    // InternalT2A.g:552:3: ( rule__PageFeature__InstanciaEDOMAssignment_0 )
                    {
                     before(grammarAccess.getPageFeatureAccess().getInstanciaEDOMAssignment_0()); 
                    // InternalT2A.g:553:3: ( rule__PageFeature__InstanciaEDOMAssignment_0 )
                    // InternalT2A.g:553:4: rule__PageFeature__InstanciaEDOMAssignment_0
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
                    // InternalT2A.g:557:2: ( ( rule__PageFeature__StringAssignment_1 ) )
                    {
                    // InternalT2A.g:557:2: ( ( rule__PageFeature__StringAssignment_1 ) )
                    // InternalT2A.g:558:3: ( rule__PageFeature__StringAssignment_1 )
                    {
                     before(grammarAccess.getPageFeatureAccess().getStringAssignment_1()); 
                    // InternalT2A.g:559:3: ( rule__PageFeature__StringAssignment_1 )
                    // InternalT2A.g:559:4: rule__PageFeature__StringAssignment_1
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
    // InternalT2A.g:567:1: rule__Feature__Alternatives : ( ( ( rule__Feature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__Feature__AllowSlotAssignment_1 ) ) | ( ( rule__Feature__StringAssignment_2 ) ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:571:1: ( ( ( rule__Feature__InstanciaEDOMAssignment_0 ) ) | ( ( rule__Feature__AllowSlotAssignment_1 ) ) | ( ( rule__Feature__StringAssignment_2 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 40:
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
                    // InternalT2A.g:572:2: ( ( rule__Feature__InstanciaEDOMAssignment_0 ) )
                    {
                    // InternalT2A.g:572:2: ( ( rule__Feature__InstanciaEDOMAssignment_0 ) )
                    // InternalT2A.g:573:3: ( rule__Feature__InstanciaEDOMAssignment_0 )
                    {
                     before(grammarAccess.getFeatureAccess().getInstanciaEDOMAssignment_0()); 
                    // InternalT2A.g:574:3: ( rule__Feature__InstanciaEDOMAssignment_0 )
                    // InternalT2A.g:574:4: rule__Feature__InstanciaEDOMAssignment_0
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
                    // InternalT2A.g:578:2: ( ( rule__Feature__AllowSlotAssignment_1 ) )
                    {
                    // InternalT2A.g:578:2: ( ( rule__Feature__AllowSlotAssignment_1 ) )
                    // InternalT2A.g:579:3: ( rule__Feature__AllowSlotAssignment_1 )
                    {
                     before(grammarAccess.getFeatureAccess().getAllowSlotAssignment_1()); 
                    // InternalT2A.g:580:3: ( rule__Feature__AllowSlotAssignment_1 )
                    // InternalT2A.g:580:4: rule__Feature__AllowSlotAssignment_1
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
                    // InternalT2A.g:584:2: ( ( rule__Feature__StringAssignment_2 ) )
                    {
                    // InternalT2A.g:584:2: ( ( rule__Feature__StringAssignment_2 ) )
                    // InternalT2A.g:585:3: ( rule__Feature__StringAssignment_2 )
                    {
                     before(grammarAccess.getFeatureAccess().getStringAssignment_2()); 
                    // InternalT2A.g:586:3: ( rule__Feature__StringAssignment_2 )
                    // InternalT2A.g:586:4: rule__Feature__StringAssignment_2
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
    // InternalT2A.g:594:1: rule__Name__Alternatives : ( ( '_' ) | ( '#' ) | ( '-' ) | ( '*' ) | ( '.' ) | ( '::' ) | ( '>' ) | ( RULE_ID ) );
    public final void rule__Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:598:1: ( ( '_' ) | ( '#' ) | ( '-' ) | ( '*' ) | ( '.' ) | ( '::' ) | ( '>' ) | ( RULE_ID ) )
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
                    // InternalT2A.g:599:2: ( '_' )
                    {
                    // InternalT2A.g:599:2: ( '_' )
                    // InternalT2A.g:600:3: '_'
                    {
                     before(grammarAccess.getNameAccess().get_Keyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().get_Keyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT2A.g:605:2: ( '#' )
                    {
                    // InternalT2A.g:605:2: ( '#' )
                    // InternalT2A.g:606:3: '#'
                    {
                     before(grammarAccess.getNameAccess().getNumberSignKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getNumberSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalT2A.g:611:2: ( '-' )
                    {
                    // InternalT2A.g:611:2: ( '-' )
                    // InternalT2A.g:612:3: '-'
                    {
                     before(grammarAccess.getNameAccess().getHyphenMinusKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getHyphenMinusKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalT2A.g:617:2: ( '*' )
                    {
                    // InternalT2A.g:617:2: ( '*' )
                    // InternalT2A.g:618:3: '*'
                    {
                     before(grammarAccess.getNameAccess().getAsteriskKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getAsteriskKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalT2A.g:623:2: ( '.' )
                    {
                    // InternalT2A.g:623:2: ( '.' )
                    // InternalT2A.g:624:3: '.'
                    {
                     before(grammarAccess.getNameAccess().getFullStopKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getFullStopKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalT2A.g:629:2: ( '::' )
                    {
                    // InternalT2A.g:629:2: ( '::' )
                    // InternalT2A.g:630:3: '::'
                    {
                     before(grammarAccess.getNameAccess().getColonColonKeyword_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getColonColonKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalT2A.g:635:2: ( '>' )
                    {
                    // InternalT2A.g:635:2: ( '>' )
                    // InternalT2A.g:636:3: '>'
                    {
                     before(grammarAccess.getNameAccess().getGreaterThanSignKeyword_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getGreaterThanSignKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalT2A.g:641:2: ( RULE_ID )
                    {
                    // InternalT2A.g:641:2: ( RULE_ID )
                    // InternalT2A.g:642:3: RULE_ID
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
    // InternalT2A.g:651:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:655:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // InternalT2A.g:656:2: rule__Root__Group__0__Impl rule__Root__Group__1
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
    // InternalT2A.g:663:1: rule__Root__Group__0__Impl : ( 'AppName:' ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:667:1: ( ( 'AppName:' ) )
            // InternalT2A.g:668:1: ( 'AppName:' )
            {
            // InternalT2A.g:668:1: ( 'AppName:' )
            // InternalT2A.g:669:2: 'AppName:'
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
    // InternalT2A.g:678:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:682:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // InternalT2A.g:683:2: rule__Root__Group__1__Impl rule__Root__Group__2
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
    // InternalT2A.g:690:1: rule__Root__Group__1__Impl : ( ( rule__Root__AppNameAssignment_1 ) ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:694:1: ( ( ( rule__Root__AppNameAssignment_1 ) ) )
            // InternalT2A.g:695:1: ( ( rule__Root__AppNameAssignment_1 ) )
            {
            // InternalT2A.g:695:1: ( ( rule__Root__AppNameAssignment_1 ) )
            // InternalT2A.g:696:2: ( rule__Root__AppNameAssignment_1 )
            {
             before(grammarAccess.getRootAccess().getAppNameAssignment_1()); 
            // InternalT2A.g:697:2: ( rule__Root__AppNameAssignment_1 )
            // InternalT2A.g:697:3: rule__Root__AppNameAssignment_1
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
    // InternalT2A.g:705:1: rule__Root__Group__2 : rule__Root__Group__2__Impl rule__Root__Group__3 ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:709:1: ( rule__Root__Group__2__Impl rule__Root__Group__3 )
            // InternalT2A.g:710:2: rule__Root__Group__2__Impl rule__Root__Group__3
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
    // InternalT2A.g:717:1: rule__Root__Group__2__Impl : ( ( rule__Root__GlobalStyleAssignment_2 )? ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:721:1: ( ( ( rule__Root__GlobalStyleAssignment_2 )? ) )
            // InternalT2A.g:722:1: ( ( rule__Root__GlobalStyleAssignment_2 )? )
            {
            // InternalT2A.g:722:1: ( ( rule__Root__GlobalStyleAssignment_2 )? )
            // InternalT2A.g:723:2: ( rule__Root__GlobalStyleAssignment_2 )?
            {
             before(grammarAccess.getRootAccess().getGlobalStyleAssignment_2()); 
            // InternalT2A.g:724:2: ( rule__Root__GlobalStyleAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalT2A.g:724:3: rule__Root__GlobalStyleAssignment_2
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
    // InternalT2A.g:732:1: rule__Root__Group__3 : rule__Root__Group__3__Impl rule__Root__Group__4 ;
    public final void rule__Root__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:736:1: ( rule__Root__Group__3__Impl rule__Root__Group__4 )
            // InternalT2A.g:737:2: rule__Root__Group__3__Impl rule__Root__Group__4
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
    // InternalT2A.g:744:1: rule__Root__Group__3__Impl : ( ( rule__Root__StyleOnlineAssignment_3 )? ) ;
    public final void rule__Root__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:748:1: ( ( ( rule__Root__StyleOnlineAssignment_3 )? ) )
            // InternalT2A.g:749:1: ( ( rule__Root__StyleOnlineAssignment_3 )? )
            {
            // InternalT2A.g:749:1: ( ( rule__Root__StyleOnlineAssignment_3 )? )
            // InternalT2A.g:750:2: ( rule__Root__StyleOnlineAssignment_3 )?
            {
             before(grammarAccess.getRootAccess().getStyleOnlineAssignment_3()); 
            // InternalT2A.g:751:2: ( rule__Root__StyleOnlineAssignment_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalT2A.g:751:3: rule__Root__StyleOnlineAssignment_3
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
    // InternalT2A.g:759:1: rule__Root__Group__4 : rule__Root__Group__4__Impl rule__Root__Group__5 ;
    public final void rule__Root__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:763:1: ( rule__Root__Group__4__Impl rule__Root__Group__5 )
            // InternalT2A.g:764:2: rule__Root__Group__4__Impl rule__Root__Group__5
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
    // InternalT2A.g:771:1: rule__Root__Group__4__Impl : ( ( rule__Root__JsOnlineAssignment_4 )? ) ;
    public final void rule__Root__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:775:1: ( ( ( rule__Root__JsOnlineAssignment_4 )? ) )
            // InternalT2A.g:776:1: ( ( rule__Root__JsOnlineAssignment_4 )? )
            {
            // InternalT2A.g:776:1: ( ( rule__Root__JsOnlineAssignment_4 )? )
            // InternalT2A.g:777:2: ( rule__Root__JsOnlineAssignment_4 )?
            {
             before(grammarAccess.getRootAccess().getJsOnlineAssignment_4()); 
            // InternalT2A.g:778:2: ( rule__Root__JsOnlineAssignment_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalT2A.g:778:3: rule__Root__JsOnlineAssignment_4
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
    // InternalT2A.g:786:1: rule__Root__Group__5 : rule__Root__Group__5__Impl ;
    public final void rule__Root__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:790:1: ( rule__Root__Group__5__Impl )
            // InternalT2A.g:791:2: rule__Root__Group__5__Impl
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
    // InternalT2A.g:797:1: rule__Root__Group__5__Impl : ( ( ( rule__Root__ElementsAssignment_5 ) ) ( ( rule__Root__ElementsAssignment_5 )* ) ) ;
    public final void rule__Root__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:801:1: ( ( ( ( rule__Root__ElementsAssignment_5 ) ) ( ( rule__Root__ElementsAssignment_5 )* ) ) )
            // InternalT2A.g:802:1: ( ( ( rule__Root__ElementsAssignment_5 ) ) ( ( rule__Root__ElementsAssignment_5 )* ) )
            {
            // InternalT2A.g:802:1: ( ( ( rule__Root__ElementsAssignment_5 ) ) ( ( rule__Root__ElementsAssignment_5 )* ) )
            // InternalT2A.g:803:2: ( ( rule__Root__ElementsAssignment_5 ) ) ( ( rule__Root__ElementsAssignment_5 )* )
            {
            // InternalT2A.g:803:2: ( ( rule__Root__ElementsAssignment_5 ) )
            // InternalT2A.g:804:3: ( rule__Root__ElementsAssignment_5 )
            {
             before(grammarAccess.getRootAccess().getElementsAssignment_5()); 
            // InternalT2A.g:805:3: ( rule__Root__ElementsAssignment_5 )
            // InternalT2A.g:805:4: rule__Root__ElementsAssignment_5
            {
            pushFollow(FOLLOW_6);
            rule__Root__ElementsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getElementsAssignment_5()); 

            }

            // InternalT2A.g:808:2: ( ( rule__Root__ElementsAssignment_5 )* )
            // InternalT2A.g:809:3: ( rule__Root__ElementsAssignment_5 )*
            {
             before(grammarAccess.getRootAccess().getElementsAssignment_5()); 
            // InternalT2A.g:810:3: ( rule__Root__ElementsAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20||LA11_0==27||LA11_0==31||LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalT2A.g:810:4: rule__Root__ElementsAssignment_5
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
    // InternalT2A.g:820:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:824:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // InternalT2A.g:825:2: rule__Page__Group__0__Impl rule__Page__Group__1
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
    // InternalT2A.g:832:1: rule__Page__Group__0__Impl : ( 'Page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:836:1: ( ( 'Page' ) )
            // InternalT2A.g:837:1: ( 'Page' )
            {
            // InternalT2A.g:837:1: ( 'Page' )
            // InternalT2A.g:838:2: 'Page'
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
    // InternalT2A.g:847:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:851:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // InternalT2A.g:852:2: rule__Page__Group__1__Impl rule__Page__Group__2
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
    // InternalT2A.g:859:1: rule__Page__Group__1__Impl : ( ( rule__Page__NameAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:863:1: ( ( ( rule__Page__NameAssignment_1 ) ) )
            // InternalT2A.g:864:1: ( ( rule__Page__NameAssignment_1 ) )
            {
            // InternalT2A.g:864:1: ( ( rule__Page__NameAssignment_1 ) )
            // InternalT2A.g:865:2: ( rule__Page__NameAssignment_1 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_1()); 
            // InternalT2A.g:866:2: ( rule__Page__NameAssignment_1 )
            // InternalT2A.g:866:3: rule__Page__NameAssignment_1
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
    // InternalT2A.g:874:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:878:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // InternalT2A.g:879:2: rule__Page__Group__2__Impl rule__Page__Group__3
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
    // InternalT2A.g:886:1: rule__Page__Group__2__Impl : ( '{' ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:890:1: ( ( '{' ) )
            // InternalT2A.g:891:1: ( '{' )
            {
            // InternalT2A.g:891:1: ( '{' )
            // InternalT2A.g:892:2: '{'
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
    // InternalT2A.g:901:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:905:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // InternalT2A.g:906:2: rule__Page__Group__3__Impl rule__Page__Group__4
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
    // InternalT2A.g:913:1: rule__Page__Group__3__Impl : ( ( rule__Page__Group_3__0 )? ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:917:1: ( ( ( rule__Page__Group_3__0 )? ) )
            // InternalT2A.g:918:1: ( ( rule__Page__Group_3__0 )? )
            {
            // InternalT2A.g:918:1: ( ( rule__Page__Group_3__0 )? )
            // InternalT2A.g:919:2: ( rule__Page__Group_3__0 )?
            {
             before(grammarAccess.getPageAccess().getGroup_3()); 
            // InternalT2A.g:920:2: ( rule__Page__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalT2A.g:920:3: rule__Page__Group_3__0
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
    // InternalT2A.g:928:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:932:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // InternalT2A.g:933:2: rule__Page__Group__4__Impl rule__Page__Group__5
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
    // InternalT2A.g:940:1: rule__Page__Group__4__Impl : ( ( rule__Page__HomeAssignment_4 )? ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:944:1: ( ( ( rule__Page__HomeAssignment_4 )? ) )
            // InternalT2A.g:945:1: ( ( rule__Page__HomeAssignment_4 )? )
            {
            // InternalT2A.g:945:1: ( ( rule__Page__HomeAssignment_4 )? )
            // InternalT2A.g:946:2: ( rule__Page__HomeAssignment_4 )?
            {
             before(grammarAccess.getPageAccess().getHomeAssignment_4()); 
            // InternalT2A.g:947:2: ( rule__Page__HomeAssignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==38) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalT2A.g:947:3: rule__Page__HomeAssignment_4
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
    // InternalT2A.g:955:1: rule__Page__Group__5 : rule__Page__Group__5__Impl rule__Page__Group__6 ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:959:1: ( rule__Page__Group__5__Impl rule__Page__Group__6 )
            // InternalT2A.g:960:2: rule__Page__Group__5__Impl rule__Page__Group__6
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
    // InternalT2A.g:967:1: rule__Page__Group__5__Impl : ( ( rule__Page__ShowInNavAssignment_5 )? ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:971:1: ( ( ( rule__Page__ShowInNavAssignment_5 )? ) )
            // InternalT2A.g:972:1: ( ( rule__Page__ShowInNavAssignment_5 )? )
            {
            // InternalT2A.g:972:1: ( ( rule__Page__ShowInNavAssignment_5 )? )
            // InternalT2A.g:973:2: ( rule__Page__ShowInNavAssignment_5 )?
            {
             before(grammarAccess.getPageAccess().getShowInNavAssignment_5()); 
            // InternalT2A.g:974:2: ( rule__Page__ShowInNavAssignment_5 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalT2A.g:974:3: rule__Page__ShowInNavAssignment_5
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
    // InternalT2A.g:982:1: rule__Page__Group__6 : rule__Page__Group__6__Impl rule__Page__Group__7 ;
    public final void rule__Page__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:986:1: ( rule__Page__Group__6__Impl rule__Page__Group__7 )
            // InternalT2A.g:987:2: rule__Page__Group__6__Impl rule__Page__Group__7
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
    // InternalT2A.g:994:1: rule__Page__Group__6__Impl : ( ( rule__Page__PageFeaturesAssignment_6 )* ) ;
    public final void rule__Page__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:998:1: ( ( ( rule__Page__PageFeaturesAssignment_6 )* ) )
            // InternalT2A.g:999:1: ( ( rule__Page__PageFeaturesAssignment_6 )* )
            {
            // InternalT2A.g:999:1: ( ( rule__Page__PageFeaturesAssignment_6 )* )
            // InternalT2A.g:1000:2: ( rule__Page__PageFeaturesAssignment_6 )*
            {
             before(grammarAccess.getPageAccess().getPageFeaturesAssignment_6()); 
            // InternalT2A.g:1001:2: ( rule__Page__PageFeaturesAssignment_6 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_STRING)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalT2A.g:1001:3: rule__Page__PageFeaturesAssignment_6
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
    // InternalT2A.g:1009:1: rule__Page__Group__7 : rule__Page__Group__7__Impl ;
    public final void rule__Page__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1013:1: ( rule__Page__Group__7__Impl )
            // InternalT2A.g:1014:2: rule__Page__Group__7__Impl
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
    // InternalT2A.g:1020:1: rule__Page__Group__7__Impl : ( '}' ) ;
    public final void rule__Page__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1024:1: ( ( '}' ) )
            // InternalT2A.g:1025:1: ( '}' )
            {
            // InternalT2A.g:1025:1: ( '}' )
            // InternalT2A.g:1026:2: '}'
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
    // InternalT2A.g:1036:1: rule__Page__Group_3__0 : rule__Page__Group_3__0__Impl rule__Page__Group_3__1 ;
    public final void rule__Page__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1040:1: ( rule__Page__Group_3__0__Impl rule__Page__Group_3__1 )
            // InternalT2A.g:1041:2: rule__Page__Group_3__0__Impl rule__Page__Group_3__1
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
    // InternalT2A.g:1048:1: rule__Page__Group_3__0__Impl : ( 'sclass' ) ;
    public final void rule__Page__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1052:1: ( ( 'sclass' ) )
            // InternalT2A.g:1053:1: ( 'sclass' )
            {
            // InternalT2A.g:1053:1: ( 'sclass' )
            // InternalT2A.g:1054:2: 'sclass'
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
    // InternalT2A.g:1063:1: rule__Page__Group_3__1 : rule__Page__Group_3__1__Impl rule__Page__Group_3__2 ;
    public final void rule__Page__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1067:1: ( rule__Page__Group_3__1__Impl rule__Page__Group_3__2 )
            // InternalT2A.g:1068:2: rule__Page__Group_3__1__Impl rule__Page__Group_3__2
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
    // InternalT2A.g:1075:1: rule__Page__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Page__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1079:1: ( ( '{' ) )
            // InternalT2A.g:1080:1: ( '{' )
            {
            // InternalT2A.g:1080:1: ( '{' )
            // InternalT2A.g:1081:2: '{'
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
    // InternalT2A.g:1090:1: rule__Page__Group_3__2 : rule__Page__Group_3__2__Impl rule__Page__Group_3__3 ;
    public final void rule__Page__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1094:1: ( rule__Page__Group_3__2__Impl rule__Page__Group_3__3 )
            // InternalT2A.g:1095:2: rule__Page__Group_3__2__Impl rule__Page__Group_3__3
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
    // InternalT2A.g:1102:1: rule__Page__Group_3__2__Impl : ( ( rule__Page__HostclassesAssignment_3_2 )* ) ;
    public final void rule__Page__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1106:1: ( ( ( rule__Page__HostclassesAssignment_3_2 )* ) )
            // InternalT2A.g:1107:1: ( ( rule__Page__HostclassesAssignment_3_2 )* )
            {
            // InternalT2A.g:1107:1: ( ( rule__Page__HostclassesAssignment_3_2 )* )
            // InternalT2A.g:1108:2: ( rule__Page__HostclassesAssignment_3_2 )*
            {
             before(grammarAccess.getPageAccess().getHostclassesAssignment_3_2()); 
            // InternalT2A.g:1109:2: ( rule__Page__HostclassesAssignment_3_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalT2A.g:1109:3: rule__Page__HostclassesAssignment_3_2
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
    // InternalT2A.g:1117:1: rule__Page__Group_3__3 : rule__Page__Group_3__3__Impl ;
    public final void rule__Page__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1121:1: ( rule__Page__Group_3__3__Impl )
            // InternalT2A.g:1122:2: rule__Page__Group_3__3__Impl
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
    // InternalT2A.g:1128:1: rule__Page__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Page__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1132:1: ( ( '}' ) )
            // InternalT2A.g:1133:1: ( '}' )
            {
            // InternalT2A.g:1133:1: ( '}' )
            // InternalT2A.g:1134:2: '}'
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
    // InternalT2A.g:1144:1: rule__StyleGlobal__Group__0 : rule__StyleGlobal__Group__0__Impl rule__StyleGlobal__Group__1 ;
    public final void rule__StyleGlobal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1148:1: ( rule__StyleGlobal__Group__0__Impl rule__StyleGlobal__Group__1 )
            // InternalT2A.g:1149:2: rule__StyleGlobal__Group__0__Impl rule__StyleGlobal__Group__1
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
    // InternalT2A.g:1156:1: rule__StyleGlobal__Group__0__Impl : ( () ) ;
    public final void rule__StyleGlobal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1160:1: ( ( () ) )
            // InternalT2A.g:1161:1: ( () )
            {
            // InternalT2A.g:1161:1: ( () )
            // InternalT2A.g:1162:2: ()
            {
             before(grammarAccess.getStyleGlobalAccess().getStyleGlobalAction_0()); 
            // InternalT2A.g:1163:2: ()
            // InternalT2A.g:1163:3: 
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
    // InternalT2A.g:1171:1: rule__StyleGlobal__Group__1 : rule__StyleGlobal__Group__1__Impl rule__StyleGlobal__Group__2 ;
    public final void rule__StyleGlobal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1175:1: ( rule__StyleGlobal__Group__1__Impl rule__StyleGlobal__Group__2 )
            // InternalT2A.g:1176:2: rule__StyleGlobal__Group__1__Impl rule__StyleGlobal__Group__2
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
    // InternalT2A.g:1183:1: rule__StyleGlobal__Group__1__Impl : ( 'StyleGlobal' ) ;
    public final void rule__StyleGlobal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1187:1: ( ( 'StyleGlobal' ) )
            // InternalT2A.g:1188:1: ( 'StyleGlobal' )
            {
            // InternalT2A.g:1188:1: ( 'StyleGlobal' )
            // InternalT2A.g:1189:2: 'StyleGlobal'
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
    // InternalT2A.g:1198:1: rule__StyleGlobal__Group__2 : rule__StyleGlobal__Group__2__Impl rule__StyleGlobal__Group__3 ;
    public final void rule__StyleGlobal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1202:1: ( rule__StyleGlobal__Group__2__Impl rule__StyleGlobal__Group__3 )
            // InternalT2A.g:1203:2: rule__StyleGlobal__Group__2__Impl rule__StyleGlobal__Group__3
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
    // InternalT2A.g:1210:1: rule__StyleGlobal__Group__2__Impl : ( '{' ) ;
    public final void rule__StyleGlobal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1214:1: ( ( '{' ) )
            // InternalT2A.g:1215:1: ( '{' )
            {
            // InternalT2A.g:1215:1: ( '{' )
            // InternalT2A.g:1216:2: '{'
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
    // InternalT2A.g:1225:1: rule__StyleGlobal__Group__3 : rule__StyleGlobal__Group__3__Impl rule__StyleGlobal__Group__4 ;
    public final void rule__StyleGlobal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1229:1: ( rule__StyleGlobal__Group__3__Impl rule__StyleGlobal__Group__4 )
            // InternalT2A.g:1230:2: rule__StyleGlobal__Group__3__Impl rule__StyleGlobal__Group__4
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
    // InternalT2A.g:1237:1: rule__StyleGlobal__Group__3__Impl : ( ( rule__StyleGlobal__StyleclassesAssignment_3 )* ) ;
    public final void rule__StyleGlobal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1241:1: ( ( ( rule__StyleGlobal__StyleclassesAssignment_3 )* ) )
            // InternalT2A.g:1242:1: ( ( rule__StyleGlobal__StyleclassesAssignment_3 )* )
            {
            // InternalT2A.g:1242:1: ( ( rule__StyleGlobal__StyleclassesAssignment_3 )* )
            // InternalT2A.g:1243:2: ( rule__StyleGlobal__StyleclassesAssignment_3 )*
            {
             before(grammarAccess.getStyleGlobalAccess().getStyleclassesAssignment_3()); 
            // InternalT2A.g:1244:2: ( rule__StyleGlobal__StyleclassesAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalT2A.g:1244:3: rule__StyleGlobal__StyleclassesAssignment_3
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
    // InternalT2A.g:1252:1: rule__StyleGlobal__Group__4 : rule__StyleGlobal__Group__4__Impl ;
    public final void rule__StyleGlobal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1256:1: ( rule__StyleGlobal__Group__4__Impl )
            // InternalT2A.g:1257:2: rule__StyleGlobal__Group__4__Impl
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
    // InternalT2A.g:1263:1: rule__StyleGlobal__Group__4__Impl : ( '}' ) ;
    public final void rule__StyleGlobal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1267:1: ( ( '}' ) )
            // InternalT2A.g:1268:1: ( '}' )
            {
            // InternalT2A.g:1268:1: ( '}' )
            // InternalT2A.g:1269:2: '}'
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
    // InternalT2A.g:1279:1: rule__StyleOnline__Group__0 : rule__StyleOnline__Group__0__Impl rule__StyleOnline__Group__1 ;
    public final void rule__StyleOnline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1283:1: ( rule__StyleOnline__Group__0__Impl rule__StyleOnline__Group__1 )
            // InternalT2A.g:1284:2: rule__StyleOnline__Group__0__Impl rule__StyleOnline__Group__1
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
    // InternalT2A.g:1291:1: rule__StyleOnline__Group__0__Impl : ( () ) ;
    public final void rule__StyleOnline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1295:1: ( ( () ) )
            // InternalT2A.g:1296:1: ( () )
            {
            // InternalT2A.g:1296:1: ( () )
            // InternalT2A.g:1297:2: ()
            {
             before(grammarAccess.getStyleOnlineAccess().getStyleOnlineAction_0()); 
            // InternalT2A.g:1298:2: ()
            // InternalT2A.g:1298:3: 
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
    // InternalT2A.g:1306:1: rule__StyleOnline__Group__1 : rule__StyleOnline__Group__1__Impl rule__StyleOnline__Group__2 ;
    public final void rule__StyleOnline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1310:1: ( rule__StyleOnline__Group__1__Impl rule__StyleOnline__Group__2 )
            // InternalT2A.g:1311:2: rule__StyleOnline__Group__1__Impl rule__StyleOnline__Group__2
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
    // InternalT2A.g:1318:1: rule__StyleOnline__Group__1__Impl : ( 'StyleOnline' ) ;
    public final void rule__StyleOnline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1322:1: ( ( 'StyleOnline' ) )
            // InternalT2A.g:1323:1: ( 'StyleOnline' )
            {
            // InternalT2A.g:1323:1: ( 'StyleOnline' )
            // InternalT2A.g:1324:2: 'StyleOnline'
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
    // InternalT2A.g:1333:1: rule__StyleOnline__Group__2 : rule__StyleOnline__Group__2__Impl rule__StyleOnline__Group__3 ;
    public final void rule__StyleOnline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1337:1: ( rule__StyleOnline__Group__2__Impl rule__StyleOnline__Group__3 )
            // InternalT2A.g:1338:2: rule__StyleOnline__Group__2__Impl rule__StyleOnline__Group__3
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
    // InternalT2A.g:1345:1: rule__StyleOnline__Group__2__Impl : ( '{' ) ;
    public final void rule__StyleOnline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1349:1: ( ( '{' ) )
            // InternalT2A.g:1350:1: ( '{' )
            {
            // InternalT2A.g:1350:1: ( '{' )
            // InternalT2A.g:1351:2: '{'
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
    // InternalT2A.g:1360:1: rule__StyleOnline__Group__3 : rule__StyleOnline__Group__3__Impl rule__StyleOnline__Group__4 ;
    public final void rule__StyleOnline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1364:1: ( rule__StyleOnline__Group__3__Impl rule__StyleOnline__Group__4 )
            // InternalT2A.g:1365:2: rule__StyleOnline__Group__3__Impl rule__StyleOnline__Group__4
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
    // InternalT2A.g:1372:1: rule__StyleOnline__Group__3__Impl : ( ( rule__StyleOnline__FullTagsAssignment_3 )* ) ;
    public final void rule__StyleOnline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1376:1: ( ( ( rule__StyleOnline__FullTagsAssignment_3 )* ) )
            // InternalT2A.g:1377:1: ( ( rule__StyleOnline__FullTagsAssignment_3 )* )
            {
            // InternalT2A.g:1377:1: ( ( rule__StyleOnline__FullTagsAssignment_3 )* )
            // InternalT2A.g:1378:2: ( rule__StyleOnline__FullTagsAssignment_3 )*
            {
             before(grammarAccess.getStyleOnlineAccess().getFullTagsAssignment_3()); 
            // InternalT2A.g:1379:2: ( rule__StyleOnline__FullTagsAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_STRING) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalT2A.g:1379:3: rule__StyleOnline__FullTagsAssignment_3
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
    // InternalT2A.g:1387:1: rule__StyleOnline__Group__4 : rule__StyleOnline__Group__4__Impl ;
    public final void rule__StyleOnline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1391:1: ( rule__StyleOnline__Group__4__Impl )
            // InternalT2A.g:1392:2: rule__StyleOnline__Group__4__Impl
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
    // InternalT2A.g:1398:1: rule__StyleOnline__Group__4__Impl : ( '}' ) ;
    public final void rule__StyleOnline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1402:1: ( ( '}' ) )
            // InternalT2A.g:1403:1: ( '}' )
            {
            // InternalT2A.g:1403:1: ( '}' )
            // InternalT2A.g:1404:2: '}'
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
    // InternalT2A.g:1414:1: rule__JSOnline__Group__0 : rule__JSOnline__Group__0__Impl rule__JSOnline__Group__1 ;
    public final void rule__JSOnline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1418:1: ( rule__JSOnline__Group__0__Impl rule__JSOnline__Group__1 )
            // InternalT2A.g:1419:2: rule__JSOnline__Group__0__Impl rule__JSOnline__Group__1
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
    // InternalT2A.g:1426:1: rule__JSOnline__Group__0__Impl : ( () ) ;
    public final void rule__JSOnline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1430:1: ( ( () ) )
            // InternalT2A.g:1431:1: ( () )
            {
            // InternalT2A.g:1431:1: ( () )
            // InternalT2A.g:1432:2: ()
            {
             before(grammarAccess.getJSOnlineAccess().getJSOnlineAction_0()); 
            // InternalT2A.g:1433:2: ()
            // InternalT2A.g:1433:3: 
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
    // InternalT2A.g:1441:1: rule__JSOnline__Group__1 : rule__JSOnline__Group__1__Impl rule__JSOnline__Group__2 ;
    public final void rule__JSOnline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1445:1: ( rule__JSOnline__Group__1__Impl rule__JSOnline__Group__2 )
            // InternalT2A.g:1446:2: rule__JSOnline__Group__1__Impl rule__JSOnline__Group__2
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
    // InternalT2A.g:1453:1: rule__JSOnline__Group__1__Impl : ( 'JSOnline' ) ;
    public final void rule__JSOnline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1457:1: ( ( 'JSOnline' ) )
            // InternalT2A.g:1458:1: ( 'JSOnline' )
            {
            // InternalT2A.g:1458:1: ( 'JSOnline' )
            // InternalT2A.g:1459:2: 'JSOnline'
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
    // InternalT2A.g:1468:1: rule__JSOnline__Group__2 : rule__JSOnline__Group__2__Impl rule__JSOnline__Group__3 ;
    public final void rule__JSOnline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1472:1: ( rule__JSOnline__Group__2__Impl rule__JSOnline__Group__3 )
            // InternalT2A.g:1473:2: rule__JSOnline__Group__2__Impl rule__JSOnline__Group__3
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
    // InternalT2A.g:1480:1: rule__JSOnline__Group__2__Impl : ( '{' ) ;
    public final void rule__JSOnline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1484:1: ( ( '{' ) )
            // InternalT2A.g:1485:1: ( '{' )
            {
            // InternalT2A.g:1485:1: ( '{' )
            // InternalT2A.g:1486:2: '{'
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
    // InternalT2A.g:1495:1: rule__JSOnline__Group__3 : rule__JSOnline__Group__3__Impl rule__JSOnline__Group__4 ;
    public final void rule__JSOnline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1499:1: ( rule__JSOnline__Group__3__Impl rule__JSOnline__Group__4 )
            // InternalT2A.g:1500:2: rule__JSOnline__Group__3__Impl rule__JSOnline__Group__4
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
    // InternalT2A.g:1507:1: rule__JSOnline__Group__3__Impl : ( ( rule__JSOnline__FullTagsAssignment_3 )* ) ;
    public final void rule__JSOnline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1511:1: ( ( ( rule__JSOnline__FullTagsAssignment_3 )* ) )
            // InternalT2A.g:1512:1: ( ( rule__JSOnline__FullTagsAssignment_3 )* )
            {
            // InternalT2A.g:1512:1: ( ( rule__JSOnline__FullTagsAssignment_3 )* )
            // InternalT2A.g:1513:2: ( rule__JSOnline__FullTagsAssignment_3 )*
            {
             before(grammarAccess.getJSOnlineAccess().getFullTagsAssignment_3()); 
            // InternalT2A.g:1514:2: ( rule__JSOnline__FullTagsAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_STRING) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalT2A.g:1514:3: rule__JSOnline__FullTagsAssignment_3
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
    // InternalT2A.g:1522:1: rule__JSOnline__Group__4 : rule__JSOnline__Group__4__Impl ;
    public final void rule__JSOnline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1526:1: ( rule__JSOnline__Group__4__Impl )
            // InternalT2A.g:1527:2: rule__JSOnline__Group__4__Impl
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
    // InternalT2A.g:1533:1: rule__JSOnline__Group__4__Impl : ( '}' ) ;
    public final void rule__JSOnline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1537:1: ( ( '}' ) )
            // InternalT2A.g:1538:1: ( '}' )
            {
            // InternalT2A.g:1538:1: ( '}' )
            // InternalT2A.g:1539:2: '}'
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
    // InternalT2A.g:1549:1: rule__StyleClass__Group__0 : rule__StyleClass__Group__0__Impl rule__StyleClass__Group__1 ;
    public final void rule__StyleClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1553:1: ( rule__StyleClass__Group__0__Impl rule__StyleClass__Group__1 )
            // InternalT2A.g:1554:2: rule__StyleClass__Group__0__Impl rule__StyleClass__Group__1
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
    // InternalT2A.g:1561:1: rule__StyleClass__Group__0__Impl : ( 'StyleClass' ) ;
    public final void rule__StyleClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1565:1: ( ( 'StyleClass' ) )
            // InternalT2A.g:1566:1: ( 'StyleClass' )
            {
            // InternalT2A.g:1566:1: ( 'StyleClass' )
            // InternalT2A.g:1567:2: 'StyleClass'
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
    // InternalT2A.g:1576:1: rule__StyleClass__Group__1 : rule__StyleClass__Group__1__Impl rule__StyleClass__Group__2 ;
    public final void rule__StyleClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1580:1: ( rule__StyleClass__Group__1__Impl rule__StyleClass__Group__2 )
            // InternalT2A.g:1581:2: rule__StyleClass__Group__1__Impl rule__StyleClass__Group__2
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
    // InternalT2A.g:1588:1: rule__StyleClass__Group__1__Impl : ( ( rule__StyleClass__NameAssignment_1 ) ) ;
    public final void rule__StyleClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1592:1: ( ( ( rule__StyleClass__NameAssignment_1 ) ) )
            // InternalT2A.g:1593:1: ( ( rule__StyleClass__NameAssignment_1 ) )
            {
            // InternalT2A.g:1593:1: ( ( rule__StyleClass__NameAssignment_1 ) )
            // InternalT2A.g:1594:2: ( rule__StyleClass__NameAssignment_1 )
            {
             before(grammarAccess.getStyleClassAccess().getNameAssignment_1()); 
            // InternalT2A.g:1595:2: ( rule__StyleClass__NameAssignment_1 )
            // InternalT2A.g:1595:3: rule__StyleClass__NameAssignment_1
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
    // InternalT2A.g:1603:1: rule__StyleClass__Group__2 : rule__StyleClass__Group__2__Impl rule__StyleClass__Group__3 ;
    public final void rule__StyleClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1607:1: ( rule__StyleClass__Group__2__Impl rule__StyleClass__Group__3 )
            // InternalT2A.g:1608:2: rule__StyleClass__Group__2__Impl rule__StyleClass__Group__3
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
    // InternalT2A.g:1615:1: rule__StyleClass__Group__2__Impl : ( '{' ) ;
    public final void rule__StyleClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1619:1: ( ( '{' ) )
            // InternalT2A.g:1620:1: ( '{' )
            {
            // InternalT2A.g:1620:1: ( '{' )
            // InternalT2A.g:1621:2: '{'
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
    // InternalT2A.g:1630:1: rule__StyleClass__Group__3 : rule__StyleClass__Group__3__Impl rule__StyleClass__Group__4 ;
    public final void rule__StyleClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1634:1: ( rule__StyleClass__Group__3__Impl rule__StyleClass__Group__4 )
            // InternalT2A.g:1635:2: rule__StyleClass__Group__3__Impl rule__StyleClass__Group__4
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
    // InternalT2A.g:1642:1: rule__StyleClass__Group__3__Impl : ( ( rule__StyleClass__Group_3__0 )* ) ;
    public final void rule__StyleClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1646:1: ( ( ( rule__StyleClass__Group_3__0 )* ) )
            // InternalT2A.g:1647:1: ( ( rule__StyleClass__Group_3__0 )* )
            {
            // InternalT2A.g:1647:1: ( ( rule__StyleClass__Group_3__0 )* )
            // InternalT2A.g:1648:2: ( rule__StyleClass__Group_3__0 )*
            {
             before(grammarAccess.getStyleClassAccess().getGroup_3()); 
            // InternalT2A.g:1649:2: ( rule__StyleClass__Group_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==EOF||LA20_0==RULE_ID||LA20_0==RULE_STRING2||(LA20_0>=12 && LA20_0<=18)||LA20_0==21) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalT2A.g:1649:3: rule__StyleClass__Group_3__0
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
    // InternalT2A.g:1657:1: rule__StyleClass__Group__4 : rule__StyleClass__Group__4__Impl rule__StyleClass__Group__5 ;
    public final void rule__StyleClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1661:1: ( rule__StyleClass__Group__4__Impl rule__StyleClass__Group__5 )
            // InternalT2A.g:1662:2: rule__StyleClass__Group__4__Impl rule__StyleClass__Group__5
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
    // InternalT2A.g:1669:1: rule__StyleClass__Group__4__Impl : ( ( rule__StyleClass__Group_4__0 )? ) ;
    public final void rule__StyleClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1673:1: ( ( ( rule__StyleClass__Group_4__0 )? ) )
            // InternalT2A.g:1674:1: ( ( rule__StyleClass__Group_4__0 )? )
            {
            // InternalT2A.g:1674:1: ( ( rule__StyleClass__Group_4__0 )? )
            // InternalT2A.g:1675:2: ( rule__StyleClass__Group_4__0 )?
            {
             before(grammarAccess.getStyleClassAccess().getGroup_4()); 
            // InternalT2A.g:1676:2: ( rule__StyleClass__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalT2A.g:1676:3: rule__StyleClass__Group_4__0
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
    // InternalT2A.g:1684:1: rule__StyleClass__Group__5 : rule__StyleClass__Group__5__Impl rule__StyleClass__Group__6 ;
    public final void rule__StyleClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1688:1: ( rule__StyleClass__Group__5__Impl rule__StyleClass__Group__6 )
            // InternalT2A.g:1689:2: rule__StyleClass__Group__5__Impl rule__StyleClass__Group__6
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
    // InternalT2A.g:1696:1: rule__StyleClass__Group__5__Impl : ( ( rule__StyleClass__Group_5__0 )? ) ;
    public final void rule__StyleClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1700:1: ( ( ( rule__StyleClass__Group_5__0 )? ) )
            // InternalT2A.g:1701:1: ( ( rule__StyleClass__Group_5__0 )? )
            {
            // InternalT2A.g:1701:1: ( ( rule__StyleClass__Group_5__0 )? )
            // InternalT2A.g:1702:2: ( rule__StyleClass__Group_5__0 )?
            {
             before(grammarAccess.getStyleClassAccess().getGroup_5()); 
            // InternalT2A.g:1703:2: ( rule__StyleClass__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalT2A.g:1703:3: rule__StyleClass__Group_5__0
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
    // InternalT2A.g:1711:1: rule__StyleClass__Group__6 : rule__StyleClass__Group__6__Impl ;
    public final void rule__StyleClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1715:1: ( rule__StyleClass__Group__6__Impl )
            // InternalT2A.g:1716:2: rule__StyleClass__Group__6__Impl
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
    // InternalT2A.g:1722:1: rule__StyleClass__Group__6__Impl : ( '}' ) ;
    public final void rule__StyleClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1726:1: ( ( '}' ) )
            // InternalT2A.g:1727:1: ( '}' )
            {
            // InternalT2A.g:1727:1: ( '}' )
            // InternalT2A.g:1728:2: '}'
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
    // InternalT2A.g:1738:1: rule__StyleClass__Group_3__0 : rule__StyleClass__Group_3__0__Impl rule__StyleClass__Group_3__1 ;
    public final void rule__StyleClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1742:1: ( rule__StyleClass__Group_3__0__Impl rule__StyleClass__Group_3__1 )
            // InternalT2A.g:1743:2: rule__StyleClass__Group_3__0__Impl rule__StyleClass__Group_3__1
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
    // InternalT2A.g:1750:1: rule__StyleClass__Group_3__0__Impl : ( ( rule__StyleClass__SattributesAssignment_3_0 ) ) ;
    public final void rule__StyleClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1754:1: ( ( ( rule__StyleClass__SattributesAssignment_3_0 ) ) )
            // InternalT2A.g:1755:1: ( ( rule__StyleClass__SattributesAssignment_3_0 ) )
            {
            // InternalT2A.g:1755:1: ( ( rule__StyleClass__SattributesAssignment_3_0 ) )
            // InternalT2A.g:1756:2: ( rule__StyleClass__SattributesAssignment_3_0 )
            {
             before(grammarAccess.getStyleClassAccess().getSattributesAssignment_3_0()); 
            // InternalT2A.g:1757:2: ( rule__StyleClass__SattributesAssignment_3_0 )
            // InternalT2A.g:1757:3: rule__StyleClass__SattributesAssignment_3_0
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
    // InternalT2A.g:1765:1: rule__StyleClass__Group_3__1 : rule__StyleClass__Group_3__1__Impl ;
    public final void rule__StyleClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1769:1: ( rule__StyleClass__Group_3__1__Impl )
            // InternalT2A.g:1770:2: rule__StyleClass__Group_3__1__Impl
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
    // InternalT2A.g:1776:1: rule__StyleClass__Group_3__1__Impl : ( ';' ) ;
    public final void rule__StyleClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1780:1: ( ( ';' ) )
            // InternalT2A.g:1781:1: ( ';' )
            {
            // InternalT2A.g:1781:1: ( ';' )
            // InternalT2A.g:1782:2: ';'
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
    // InternalT2A.g:1792:1: rule__StyleClass__Group_4__0 : rule__StyleClass__Group_4__0__Impl rule__StyleClass__Group_4__1 ;
    public final void rule__StyleClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1796:1: ( rule__StyleClass__Group_4__0__Impl rule__StyleClass__Group_4__1 )
            // InternalT2A.g:1797:2: rule__StyleClass__Group_4__0__Impl rule__StyleClass__Group_4__1
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
    // InternalT2A.g:1804:1: rule__StyleClass__Group_4__0__Impl : ( 'after' ) ;
    public final void rule__StyleClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1808:1: ( ( 'after' ) )
            // InternalT2A.g:1809:1: ( 'after' )
            {
            // InternalT2A.g:1809:1: ( 'after' )
            // InternalT2A.g:1810:2: 'after'
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
    // InternalT2A.g:1819:1: rule__StyleClass__Group_4__1 : rule__StyleClass__Group_4__1__Impl rule__StyleClass__Group_4__2 ;
    public final void rule__StyleClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1823:1: ( rule__StyleClass__Group_4__1__Impl rule__StyleClass__Group_4__2 )
            // InternalT2A.g:1824:2: rule__StyleClass__Group_4__1__Impl rule__StyleClass__Group_4__2
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
    // InternalT2A.g:1831:1: rule__StyleClass__Group_4__1__Impl : ( '{' ) ;
    public final void rule__StyleClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1835:1: ( ( '{' ) )
            // InternalT2A.g:1836:1: ( '{' )
            {
            // InternalT2A.g:1836:1: ( '{' )
            // InternalT2A.g:1837:2: '{'
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
    // InternalT2A.g:1846:1: rule__StyleClass__Group_4__2 : rule__StyleClass__Group_4__2__Impl rule__StyleClass__Group_4__3 ;
    public final void rule__StyleClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1850:1: ( rule__StyleClass__Group_4__2__Impl rule__StyleClass__Group_4__3 )
            // InternalT2A.g:1851:2: rule__StyleClass__Group_4__2__Impl rule__StyleClass__Group_4__3
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
    // InternalT2A.g:1858:1: rule__StyleClass__Group_4__2__Impl : ( ( rule__StyleClass__Group_4_2__0 )* ) ;
    public final void rule__StyleClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1862:1: ( ( ( rule__StyleClass__Group_4_2__0 )* ) )
            // InternalT2A.g:1863:1: ( ( rule__StyleClass__Group_4_2__0 )* )
            {
            // InternalT2A.g:1863:1: ( ( rule__StyleClass__Group_4_2__0 )* )
            // InternalT2A.g:1864:2: ( rule__StyleClass__Group_4_2__0 )*
            {
             before(grammarAccess.getStyleClassAccess().getGroup_4_2()); 
            // InternalT2A.g:1865:2: ( rule__StyleClass__Group_4_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==EOF||LA23_0==RULE_ID||LA23_0==RULE_STRING2||(LA23_0>=12 && LA23_0<=18)||LA23_0==21) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalT2A.g:1865:3: rule__StyleClass__Group_4_2__0
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
    // InternalT2A.g:1873:1: rule__StyleClass__Group_4__3 : rule__StyleClass__Group_4__3__Impl ;
    public final void rule__StyleClass__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1877:1: ( rule__StyleClass__Group_4__3__Impl )
            // InternalT2A.g:1878:2: rule__StyleClass__Group_4__3__Impl
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
    // InternalT2A.g:1884:1: rule__StyleClass__Group_4__3__Impl : ( '}' ) ;
    public final void rule__StyleClass__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1888:1: ( ( '}' ) )
            // InternalT2A.g:1889:1: ( '}' )
            {
            // InternalT2A.g:1889:1: ( '}' )
            // InternalT2A.g:1890:2: '}'
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
    // InternalT2A.g:1900:1: rule__StyleClass__Group_4_2__0 : rule__StyleClass__Group_4_2__0__Impl rule__StyleClass__Group_4_2__1 ;
    public final void rule__StyleClass__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1904:1: ( rule__StyleClass__Group_4_2__0__Impl rule__StyleClass__Group_4_2__1 )
            // InternalT2A.g:1905:2: rule__StyleClass__Group_4_2__0__Impl rule__StyleClass__Group_4_2__1
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
    // InternalT2A.g:1912:1: rule__StyleClass__Group_4_2__0__Impl : ( ( rule__StyleClass__SattributesAfterAssignment_4_2_0 ) ) ;
    public final void rule__StyleClass__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1916:1: ( ( ( rule__StyleClass__SattributesAfterAssignment_4_2_0 ) ) )
            // InternalT2A.g:1917:1: ( ( rule__StyleClass__SattributesAfterAssignment_4_2_0 ) )
            {
            // InternalT2A.g:1917:1: ( ( rule__StyleClass__SattributesAfterAssignment_4_2_0 ) )
            // InternalT2A.g:1918:2: ( rule__StyleClass__SattributesAfterAssignment_4_2_0 )
            {
             before(grammarAccess.getStyleClassAccess().getSattributesAfterAssignment_4_2_0()); 
            // InternalT2A.g:1919:2: ( rule__StyleClass__SattributesAfterAssignment_4_2_0 )
            // InternalT2A.g:1919:3: rule__StyleClass__SattributesAfterAssignment_4_2_0
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
    // InternalT2A.g:1927:1: rule__StyleClass__Group_4_2__1 : rule__StyleClass__Group_4_2__1__Impl ;
    public final void rule__StyleClass__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1931:1: ( rule__StyleClass__Group_4_2__1__Impl )
            // InternalT2A.g:1932:2: rule__StyleClass__Group_4_2__1__Impl
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
    // InternalT2A.g:1938:1: rule__StyleClass__Group_4_2__1__Impl : ( ';' ) ;
    public final void rule__StyleClass__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1942:1: ( ( ';' ) )
            // InternalT2A.g:1943:1: ( ';' )
            {
            // InternalT2A.g:1943:1: ( ';' )
            // InternalT2A.g:1944:2: ';'
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
    // InternalT2A.g:1954:1: rule__StyleClass__Group_5__0 : rule__StyleClass__Group_5__0__Impl rule__StyleClass__Group_5__1 ;
    public final void rule__StyleClass__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1958:1: ( rule__StyleClass__Group_5__0__Impl rule__StyleClass__Group_5__1 )
            // InternalT2A.g:1959:2: rule__StyleClass__Group_5__0__Impl rule__StyleClass__Group_5__1
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
    // InternalT2A.g:1966:1: rule__StyleClass__Group_5__0__Impl : ( 'active' ) ;
    public final void rule__StyleClass__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1970:1: ( ( 'active' ) )
            // InternalT2A.g:1971:1: ( 'active' )
            {
            // InternalT2A.g:1971:1: ( 'active' )
            // InternalT2A.g:1972:2: 'active'
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
    // InternalT2A.g:1981:1: rule__StyleClass__Group_5__1 : rule__StyleClass__Group_5__1__Impl rule__StyleClass__Group_5__2 ;
    public final void rule__StyleClass__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1985:1: ( rule__StyleClass__Group_5__1__Impl rule__StyleClass__Group_5__2 )
            // InternalT2A.g:1986:2: rule__StyleClass__Group_5__1__Impl rule__StyleClass__Group_5__2
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
    // InternalT2A.g:1993:1: rule__StyleClass__Group_5__1__Impl : ( '{' ) ;
    public final void rule__StyleClass__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:1997:1: ( ( '{' ) )
            // InternalT2A.g:1998:1: ( '{' )
            {
            // InternalT2A.g:1998:1: ( '{' )
            // InternalT2A.g:1999:2: '{'
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
    // InternalT2A.g:2008:1: rule__StyleClass__Group_5__2 : rule__StyleClass__Group_5__2__Impl rule__StyleClass__Group_5__3 ;
    public final void rule__StyleClass__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2012:1: ( rule__StyleClass__Group_5__2__Impl rule__StyleClass__Group_5__3 )
            // InternalT2A.g:2013:2: rule__StyleClass__Group_5__2__Impl rule__StyleClass__Group_5__3
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
    // InternalT2A.g:2020:1: rule__StyleClass__Group_5__2__Impl : ( ( rule__StyleClass__Group_5_2__0 )* ) ;
    public final void rule__StyleClass__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2024:1: ( ( ( rule__StyleClass__Group_5_2__0 )* ) )
            // InternalT2A.g:2025:1: ( ( rule__StyleClass__Group_5_2__0 )* )
            {
            // InternalT2A.g:2025:1: ( ( rule__StyleClass__Group_5_2__0 )* )
            // InternalT2A.g:2026:2: ( rule__StyleClass__Group_5_2__0 )*
            {
             before(grammarAccess.getStyleClassAccess().getGroup_5_2()); 
            // InternalT2A.g:2027:2: ( rule__StyleClass__Group_5_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==EOF||LA24_0==RULE_ID||LA24_0==RULE_STRING2||(LA24_0>=12 && LA24_0<=18)||LA24_0==21) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalT2A.g:2027:3: rule__StyleClass__Group_5_2__0
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
    // InternalT2A.g:2035:1: rule__StyleClass__Group_5__3 : rule__StyleClass__Group_5__3__Impl ;
    public final void rule__StyleClass__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2039:1: ( rule__StyleClass__Group_5__3__Impl )
            // InternalT2A.g:2040:2: rule__StyleClass__Group_5__3__Impl
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
    // InternalT2A.g:2046:1: rule__StyleClass__Group_5__3__Impl : ( '}' ) ;
    public final void rule__StyleClass__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2050:1: ( ( '}' ) )
            // InternalT2A.g:2051:1: ( '}' )
            {
            // InternalT2A.g:2051:1: ( '}' )
            // InternalT2A.g:2052:2: '}'
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
    // InternalT2A.g:2062:1: rule__StyleClass__Group_5_2__0 : rule__StyleClass__Group_5_2__0__Impl rule__StyleClass__Group_5_2__1 ;
    public final void rule__StyleClass__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2066:1: ( rule__StyleClass__Group_5_2__0__Impl rule__StyleClass__Group_5_2__1 )
            // InternalT2A.g:2067:2: rule__StyleClass__Group_5_2__0__Impl rule__StyleClass__Group_5_2__1
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
    // InternalT2A.g:2074:1: rule__StyleClass__Group_5_2__0__Impl : ( ( rule__StyleClass__SattributesActiveAssignment_5_2_0 ) ) ;
    public final void rule__StyleClass__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2078:1: ( ( ( rule__StyleClass__SattributesActiveAssignment_5_2_0 ) ) )
            // InternalT2A.g:2079:1: ( ( rule__StyleClass__SattributesActiveAssignment_5_2_0 ) )
            {
            // InternalT2A.g:2079:1: ( ( rule__StyleClass__SattributesActiveAssignment_5_2_0 ) )
            // InternalT2A.g:2080:2: ( rule__StyleClass__SattributesActiveAssignment_5_2_0 )
            {
             before(grammarAccess.getStyleClassAccess().getSattributesActiveAssignment_5_2_0()); 
            // InternalT2A.g:2081:2: ( rule__StyleClass__SattributesActiveAssignment_5_2_0 )
            // InternalT2A.g:2081:3: rule__StyleClass__SattributesActiveAssignment_5_2_0
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
    // InternalT2A.g:2089:1: rule__StyleClass__Group_5_2__1 : rule__StyleClass__Group_5_2__1__Impl ;
    public final void rule__StyleClass__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2093:1: ( rule__StyleClass__Group_5_2__1__Impl )
            // InternalT2A.g:2094:2: rule__StyleClass__Group_5_2__1__Impl
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
    // InternalT2A.g:2100:1: rule__StyleClass__Group_5_2__1__Impl : ( ';' ) ;
    public final void rule__StyleClass__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2104:1: ( ( ';' ) )
            // InternalT2A.g:2105:1: ( ';' )
            {
            // InternalT2A.g:2105:1: ( ';' )
            // InternalT2A.g:2106:2: ';'
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
    // InternalT2A.g:2116:1: rule__SAttributeAndValue__Group__0 : rule__SAttributeAndValue__Group__0__Impl rule__SAttributeAndValue__Group__1 ;
    public final void rule__SAttributeAndValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2120:1: ( rule__SAttributeAndValue__Group__0__Impl rule__SAttributeAndValue__Group__1 )
            // InternalT2A.g:2121:2: rule__SAttributeAndValue__Group__0__Impl rule__SAttributeAndValue__Group__1
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
    // InternalT2A.g:2128:1: rule__SAttributeAndValue__Group__0__Impl : ( ( rule__SAttributeAndValue__StnameAssignment_0 ) ) ;
    public final void rule__SAttributeAndValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2132:1: ( ( ( rule__SAttributeAndValue__StnameAssignment_0 ) ) )
            // InternalT2A.g:2133:1: ( ( rule__SAttributeAndValue__StnameAssignment_0 ) )
            {
            // InternalT2A.g:2133:1: ( ( rule__SAttributeAndValue__StnameAssignment_0 ) )
            // InternalT2A.g:2134:2: ( rule__SAttributeAndValue__StnameAssignment_0 )
            {
             before(grammarAccess.getSAttributeAndValueAccess().getStnameAssignment_0()); 
            // InternalT2A.g:2135:2: ( rule__SAttributeAndValue__StnameAssignment_0 )
            // InternalT2A.g:2135:3: rule__SAttributeAndValue__StnameAssignment_0
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
    // InternalT2A.g:2143:1: rule__SAttributeAndValue__Group__1 : rule__SAttributeAndValue__Group__1__Impl ;
    public final void rule__SAttributeAndValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2147:1: ( rule__SAttributeAndValue__Group__1__Impl )
            // InternalT2A.g:2148:2: rule__SAttributeAndValue__Group__1__Impl
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
    // InternalT2A.g:2154:1: rule__SAttributeAndValue__Group__1__Impl : ( ( rule__SAttributeAndValue__ValueAssignment_1 ) ) ;
    public final void rule__SAttributeAndValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2158:1: ( ( ( rule__SAttributeAndValue__ValueAssignment_1 ) ) )
            // InternalT2A.g:2159:1: ( ( rule__SAttributeAndValue__ValueAssignment_1 ) )
            {
            // InternalT2A.g:2159:1: ( ( rule__SAttributeAndValue__ValueAssignment_1 ) )
            // InternalT2A.g:2160:2: ( rule__SAttributeAndValue__ValueAssignment_1 )
            {
             before(grammarAccess.getSAttributeAndValueAccess().getValueAssignment_1()); 
            // InternalT2A.g:2161:2: ( rule__SAttributeAndValue__ValueAssignment_1 )
            // InternalT2A.g:2161:3: rule__SAttributeAndValue__ValueAssignment_1
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
    // InternalT2A.g:2170:1: rule__DOM__Group__0 : rule__DOM__Group__0__Impl rule__DOM__Group__1 ;
    public final void rule__DOM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2174:1: ( rule__DOM__Group__0__Impl rule__DOM__Group__1 )
            // InternalT2A.g:2175:2: rule__DOM__Group__0__Impl rule__DOM__Group__1
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
    // InternalT2A.g:2182:1: rule__DOM__Group__0__Impl : ( 'Dom' ) ;
    public final void rule__DOM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2186:1: ( ( 'Dom' ) )
            // InternalT2A.g:2187:1: ( 'Dom' )
            {
            // InternalT2A.g:2187:1: ( 'Dom' )
            // InternalT2A.g:2188:2: 'Dom'
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
    // InternalT2A.g:2197:1: rule__DOM__Group__1 : rule__DOM__Group__1__Impl rule__DOM__Group__2 ;
    public final void rule__DOM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2201:1: ( rule__DOM__Group__1__Impl rule__DOM__Group__2 )
            // InternalT2A.g:2202:2: rule__DOM__Group__1__Impl rule__DOM__Group__2
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
    // InternalT2A.g:2209:1: rule__DOM__Group__1__Impl : ( ( rule__DOM__NameAssignment_1 ) ) ;
    public final void rule__DOM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2213:1: ( ( ( rule__DOM__NameAssignment_1 ) ) )
            // InternalT2A.g:2214:1: ( ( rule__DOM__NameAssignment_1 ) )
            {
            // InternalT2A.g:2214:1: ( ( rule__DOM__NameAssignment_1 ) )
            // InternalT2A.g:2215:2: ( rule__DOM__NameAssignment_1 )
            {
             before(grammarAccess.getDOMAccess().getNameAssignment_1()); 
            // InternalT2A.g:2216:2: ( rule__DOM__NameAssignment_1 )
            // InternalT2A.g:2216:3: rule__DOM__NameAssignment_1
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
    // InternalT2A.g:2224:1: rule__DOM__Group__2 : rule__DOM__Group__2__Impl ;
    public final void rule__DOM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2228:1: ( rule__DOM__Group__2__Impl )
            // InternalT2A.g:2229:2: rule__DOM__Group__2__Impl
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
    // InternalT2A.g:2235:1: rule__DOM__Group__2__Impl : ( ( rule__DOM__Group_2__0 )? ) ;
    public final void rule__DOM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2239:1: ( ( ( rule__DOM__Group_2__0 )? ) )
            // InternalT2A.g:2240:1: ( ( rule__DOM__Group_2__0 )? )
            {
            // InternalT2A.g:2240:1: ( ( rule__DOM__Group_2__0 )? )
            // InternalT2A.g:2241:2: ( rule__DOM__Group_2__0 )?
            {
             before(grammarAccess.getDOMAccess().getGroup_2()); 
            // InternalT2A.g:2242:2: ( rule__DOM__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==21) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalT2A.g:2242:3: rule__DOM__Group_2__0
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
    // InternalT2A.g:2251:1: rule__DOM__Group_2__0 : rule__DOM__Group_2__0__Impl rule__DOM__Group_2__1 ;
    public final void rule__DOM__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2255:1: ( rule__DOM__Group_2__0__Impl rule__DOM__Group_2__1 )
            // InternalT2A.g:2256:2: rule__DOM__Group_2__0__Impl rule__DOM__Group_2__1
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
    // InternalT2A.g:2263:1: rule__DOM__Group_2__0__Impl : ( '{' ) ;
    public final void rule__DOM__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2267:1: ( ( '{' ) )
            // InternalT2A.g:2268:1: ( '{' )
            {
            // InternalT2A.g:2268:1: ( '{' )
            // InternalT2A.g:2269:2: '{'
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
    // InternalT2A.g:2278:1: rule__DOM__Group_2__1 : rule__DOM__Group_2__1__Impl rule__DOM__Group_2__2 ;
    public final void rule__DOM__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2282:1: ( rule__DOM__Group_2__1__Impl rule__DOM__Group_2__2 )
            // InternalT2A.g:2283:2: rule__DOM__Group_2__1__Impl rule__DOM__Group_2__2
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
    // InternalT2A.g:2290:1: rule__DOM__Group_2__1__Impl : ( ( rule__DOM__Group_2_1__0 )? ) ;
    public final void rule__DOM__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2294:1: ( ( ( rule__DOM__Group_2_1__0 )? ) )
            // InternalT2A.g:2295:1: ( ( rule__DOM__Group_2_1__0 )? )
            {
            // InternalT2A.g:2295:1: ( ( rule__DOM__Group_2_1__0 )? )
            // InternalT2A.g:2296:2: ( rule__DOM__Group_2_1__0 )?
            {
             before(grammarAccess.getDOMAccess().getGroup_2_1()); 
            // InternalT2A.g:2297:2: ( rule__DOM__Group_2_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalT2A.g:2297:3: rule__DOM__Group_2_1__0
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
    // InternalT2A.g:2305:1: rule__DOM__Group_2__2 : rule__DOM__Group_2__2__Impl rule__DOM__Group_2__3 ;
    public final void rule__DOM__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2309:1: ( rule__DOM__Group_2__2__Impl rule__DOM__Group_2__3 )
            // InternalT2A.g:2310:2: rule__DOM__Group_2__2__Impl rule__DOM__Group_2__3
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
    // InternalT2A.g:2317:1: rule__DOM__Group_2__2__Impl : ( ( rule__DOM__Group_2_2__0 )? ) ;
    public final void rule__DOM__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2321:1: ( ( ( rule__DOM__Group_2_2__0 )? ) )
            // InternalT2A.g:2322:1: ( ( rule__DOM__Group_2_2__0 )? )
            {
            // InternalT2A.g:2322:1: ( ( rule__DOM__Group_2_2__0 )? )
            // InternalT2A.g:2323:2: ( rule__DOM__Group_2_2__0 )?
            {
             before(grammarAccess.getDOMAccess().getGroup_2_2()); 
            // InternalT2A.g:2324:2: ( rule__DOM__Group_2_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalT2A.g:2324:3: rule__DOM__Group_2_2__0
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
    // InternalT2A.g:2332:1: rule__DOM__Group_2__3 : rule__DOM__Group_2__3__Impl rule__DOM__Group_2__4 ;
    public final void rule__DOM__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2336:1: ( rule__DOM__Group_2__3__Impl rule__DOM__Group_2__4 )
            // InternalT2A.g:2337:2: rule__DOM__Group_2__3__Impl rule__DOM__Group_2__4
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
    // InternalT2A.g:2344:1: rule__DOM__Group_2__3__Impl : ( ( rule__DOM__FeaturesAssignment_2_3 )* ) ;
    public final void rule__DOM__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2348:1: ( ( ( rule__DOM__FeaturesAssignment_2_3 )* ) )
            // InternalT2A.g:2349:1: ( ( rule__DOM__FeaturesAssignment_2_3 )* )
            {
            // InternalT2A.g:2349:1: ( ( rule__DOM__FeaturesAssignment_2_3 )* )
            // InternalT2A.g:2350:2: ( rule__DOM__FeaturesAssignment_2_3 )*
            {
             before(grammarAccess.getDOMAccess().getFeaturesAssignment_2_3()); 
            // InternalT2A.g:2351:2: ( rule__DOM__FeaturesAssignment_2_3 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_STRING)||LA28_0==40) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalT2A.g:2351:3: rule__DOM__FeaturesAssignment_2_3
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
    // InternalT2A.g:2359:1: rule__DOM__Group_2__4 : rule__DOM__Group_2__4__Impl ;
    public final void rule__DOM__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2363:1: ( rule__DOM__Group_2__4__Impl )
            // InternalT2A.g:2364:2: rule__DOM__Group_2__4__Impl
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
    // InternalT2A.g:2370:1: rule__DOM__Group_2__4__Impl : ( '}' ) ;
    public final void rule__DOM__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2374:1: ( ( '}' ) )
            // InternalT2A.g:2375:1: ( '}' )
            {
            // InternalT2A.g:2375:1: ( '}' )
            // InternalT2A.g:2376:2: '}'
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
    // InternalT2A.g:2386:1: rule__DOM__Group_2_1__0 : rule__DOM__Group_2_1__0__Impl rule__DOM__Group_2_1__1 ;
    public final void rule__DOM__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2390:1: ( rule__DOM__Group_2_1__0__Impl rule__DOM__Group_2_1__1 )
            // InternalT2A.g:2391:2: rule__DOM__Group_2_1__0__Impl rule__DOM__Group_2_1__1
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
    // InternalT2A.g:2398:1: rule__DOM__Group_2_1__0__Impl : ( 'sclass' ) ;
    public final void rule__DOM__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2402:1: ( ( 'sclass' ) )
            // InternalT2A.g:2403:1: ( 'sclass' )
            {
            // InternalT2A.g:2403:1: ( 'sclass' )
            // InternalT2A.g:2404:2: 'sclass'
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
    // InternalT2A.g:2413:1: rule__DOM__Group_2_1__1 : rule__DOM__Group_2_1__1__Impl rule__DOM__Group_2_1__2 ;
    public final void rule__DOM__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2417:1: ( rule__DOM__Group_2_1__1__Impl rule__DOM__Group_2_1__2 )
            // InternalT2A.g:2418:2: rule__DOM__Group_2_1__1__Impl rule__DOM__Group_2_1__2
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
    // InternalT2A.g:2425:1: rule__DOM__Group_2_1__1__Impl : ( '{' ) ;
    public final void rule__DOM__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2429:1: ( ( '{' ) )
            // InternalT2A.g:2430:1: ( '{' )
            {
            // InternalT2A.g:2430:1: ( '{' )
            // InternalT2A.g:2431:2: '{'
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
    // InternalT2A.g:2440:1: rule__DOM__Group_2_1__2 : rule__DOM__Group_2_1__2__Impl rule__DOM__Group_2_1__3 ;
    public final void rule__DOM__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2444:1: ( rule__DOM__Group_2_1__2__Impl rule__DOM__Group_2_1__3 )
            // InternalT2A.g:2445:2: rule__DOM__Group_2_1__2__Impl rule__DOM__Group_2_1__3
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
    // InternalT2A.g:2452:1: rule__DOM__Group_2_1__2__Impl : ( ( rule__DOM__SclassesAssignment_2_1_2 )* ) ;
    public final void rule__DOM__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2456:1: ( ( ( rule__DOM__SclassesAssignment_2_1_2 )* ) )
            // InternalT2A.g:2457:1: ( ( rule__DOM__SclassesAssignment_2_1_2 )* )
            {
            // InternalT2A.g:2457:1: ( ( rule__DOM__SclassesAssignment_2_1_2 )* )
            // InternalT2A.g:2458:2: ( rule__DOM__SclassesAssignment_2_1_2 )*
            {
             before(grammarAccess.getDOMAccess().getSclassesAssignment_2_1_2()); 
            // InternalT2A.g:2459:2: ( rule__DOM__SclassesAssignment_2_1_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalT2A.g:2459:3: rule__DOM__SclassesAssignment_2_1_2
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
    // InternalT2A.g:2467:1: rule__DOM__Group_2_1__3 : rule__DOM__Group_2_1__3__Impl ;
    public final void rule__DOM__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2471:1: ( rule__DOM__Group_2_1__3__Impl )
            // InternalT2A.g:2472:2: rule__DOM__Group_2_1__3__Impl
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
    // InternalT2A.g:2478:1: rule__DOM__Group_2_1__3__Impl : ( '}' ) ;
    public final void rule__DOM__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2482:1: ( ( '}' ) )
            // InternalT2A.g:2483:1: ( '}' )
            {
            // InternalT2A.g:2483:1: ( '}' )
            // InternalT2A.g:2484:2: '}'
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
    // InternalT2A.g:2494:1: rule__DOM__Group_2_2__0 : rule__DOM__Group_2_2__0__Impl rule__DOM__Group_2_2__1 ;
    public final void rule__DOM__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2498:1: ( rule__DOM__Group_2_2__0__Impl rule__DOM__Group_2_2__1 )
            // InternalT2A.g:2499:2: rule__DOM__Group_2_2__0__Impl rule__DOM__Group_2_2__1
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
    // InternalT2A.g:2506:1: rule__DOM__Group_2_2__0__Impl : ( 'sclassString' ) ;
    public final void rule__DOM__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2510:1: ( ( 'sclassString' ) )
            // InternalT2A.g:2511:1: ( 'sclassString' )
            {
            // InternalT2A.g:2511:1: ( 'sclassString' )
            // InternalT2A.g:2512:2: 'sclassString'
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
    // InternalT2A.g:2521:1: rule__DOM__Group_2_2__1 : rule__DOM__Group_2_2__1__Impl rule__DOM__Group_2_2__2 ;
    public final void rule__DOM__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2525:1: ( rule__DOM__Group_2_2__1__Impl rule__DOM__Group_2_2__2 )
            // InternalT2A.g:2526:2: rule__DOM__Group_2_2__1__Impl rule__DOM__Group_2_2__2
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
    // InternalT2A.g:2533:1: rule__DOM__Group_2_2__1__Impl : ( '{' ) ;
    public final void rule__DOM__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2537:1: ( ( '{' ) )
            // InternalT2A.g:2538:1: ( '{' )
            {
            // InternalT2A.g:2538:1: ( '{' )
            // InternalT2A.g:2539:2: '{'
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
    // InternalT2A.g:2548:1: rule__DOM__Group_2_2__2 : rule__DOM__Group_2_2__2__Impl rule__DOM__Group_2_2__3 ;
    public final void rule__DOM__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2552:1: ( rule__DOM__Group_2_2__2__Impl rule__DOM__Group_2_2__3 )
            // InternalT2A.g:2553:2: rule__DOM__Group_2_2__2__Impl rule__DOM__Group_2_2__3
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
    // InternalT2A.g:2560:1: rule__DOM__Group_2_2__2__Impl : ( ( rule__DOM__SclassesOnlineAssignment_2_2_2 )* ) ;
    public final void rule__DOM__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2564:1: ( ( ( rule__DOM__SclassesOnlineAssignment_2_2_2 )* ) )
            // InternalT2A.g:2565:1: ( ( rule__DOM__SclassesOnlineAssignment_2_2_2 )* )
            {
            // InternalT2A.g:2565:1: ( ( rule__DOM__SclassesOnlineAssignment_2_2_2 )* )
            // InternalT2A.g:2566:2: ( rule__DOM__SclassesOnlineAssignment_2_2_2 )*
            {
             before(grammarAccess.getDOMAccess().getSclassesOnlineAssignment_2_2_2()); 
            // InternalT2A.g:2567:2: ( rule__DOM__SclassesOnlineAssignment_2_2_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_STRING) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalT2A.g:2567:3: rule__DOM__SclassesOnlineAssignment_2_2_2
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
    // InternalT2A.g:2575:1: rule__DOM__Group_2_2__3 : rule__DOM__Group_2_2__3__Impl ;
    public final void rule__DOM__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2579:1: ( rule__DOM__Group_2_2__3__Impl )
            // InternalT2A.g:2580:2: rule__DOM__Group_2_2__3__Impl
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
    // InternalT2A.g:2586:1: rule__DOM__Group_2_2__3__Impl : ( '}' ) ;
    public final void rule__DOM__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2590:1: ( ( '}' ) )
            // InternalT2A.g:2591:1: ( '}' )
            {
            // InternalT2A.g:2591:1: ( '}' )
            // InternalT2A.g:2592:2: '}'
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
    // InternalT2A.g:2602:1: rule__Comp__Group__0 : rule__Comp__Group__0__Impl rule__Comp__Group__1 ;
    public final void rule__Comp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2606:1: ( rule__Comp__Group__0__Impl rule__Comp__Group__1 )
            // InternalT2A.g:2607:2: rule__Comp__Group__0__Impl rule__Comp__Group__1
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
    // InternalT2A.g:2614:1: rule__Comp__Group__0__Impl : ( 'Comp' ) ;
    public final void rule__Comp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2618:1: ( ( 'Comp' ) )
            // InternalT2A.g:2619:1: ( 'Comp' )
            {
            // InternalT2A.g:2619:1: ( 'Comp' )
            // InternalT2A.g:2620:2: 'Comp'
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
    // InternalT2A.g:2629:1: rule__Comp__Group__1 : rule__Comp__Group__1__Impl rule__Comp__Group__2 ;
    public final void rule__Comp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2633:1: ( rule__Comp__Group__1__Impl rule__Comp__Group__2 )
            // InternalT2A.g:2634:2: rule__Comp__Group__1__Impl rule__Comp__Group__2
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
    // InternalT2A.g:2641:1: rule__Comp__Group__1__Impl : ( ( rule__Comp__NameAssignment_1 ) ) ;
    public final void rule__Comp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2645:1: ( ( ( rule__Comp__NameAssignment_1 ) ) )
            // InternalT2A.g:2646:1: ( ( rule__Comp__NameAssignment_1 ) )
            {
            // InternalT2A.g:2646:1: ( ( rule__Comp__NameAssignment_1 ) )
            // InternalT2A.g:2647:2: ( rule__Comp__NameAssignment_1 )
            {
             before(grammarAccess.getCompAccess().getNameAssignment_1()); 
            // InternalT2A.g:2648:2: ( rule__Comp__NameAssignment_1 )
            // InternalT2A.g:2648:3: rule__Comp__NameAssignment_1
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
    // InternalT2A.g:2656:1: rule__Comp__Group__2 : rule__Comp__Group__2__Impl ;
    public final void rule__Comp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2660:1: ( rule__Comp__Group__2__Impl )
            // InternalT2A.g:2661:2: rule__Comp__Group__2__Impl
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
    // InternalT2A.g:2667:1: rule__Comp__Group__2__Impl : ( ( rule__Comp__Group_2__0 )? ) ;
    public final void rule__Comp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2671:1: ( ( ( rule__Comp__Group_2__0 )? ) )
            // InternalT2A.g:2672:1: ( ( rule__Comp__Group_2__0 )? )
            {
            // InternalT2A.g:2672:1: ( ( rule__Comp__Group_2__0 )? )
            // InternalT2A.g:2673:2: ( rule__Comp__Group_2__0 )?
            {
             before(grammarAccess.getCompAccess().getGroup_2()); 
            // InternalT2A.g:2674:2: ( rule__Comp__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==21) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalT2A.g:2674:3: rule__Comp__Group_2__0
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
    // InternalT2A.g:2683:1: rule__Comp__Group_2__0 : rule__Comp__Group_2__0__Impl rule__Comp__Group_2__1 ;
    public final void rule__Comp__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2687:1: ( rule__Comp__Group_2__0__Impl rule__Comp__Group_2__1 )
            // InternalT2A.g:2688:2: rule__Comp__Group_2__0__Impl rule__Comp__Group_2__1
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
    // InternalT2A.g:2695:1: rule__Comp__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Comp__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2699:1: ( ( '{' ) )
            // InternalT2A.g:2700:1: ( '{' )
            {
            // InternalT2A.g:2700:1: ( '{' )
            // InternalT2A.g:2701:2: '{'
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
    // InternalT2A.g:2710:1: rule__Comp__Group_2__1 : rule__Comp__Group_2__1__Impl rule__Comp__Group_2__2 ;
    public final void rule__Comp__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2714:1: ( rule__Comp__Group_2__1__Impl rule__Comp__Group_2__2 )
            // InternalT2A.g:2715:2: rule__Comp__Group_2__1__Impl rule__Comp__Group_2__2
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
    // InternalT2A.g:2722:1: rule__Comp__Group_2__1__Impl : ( ( rule__Comp__Group_2_1__0 )? ) ;
    public final void rule__Comp__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2726:1: ( ( ( rule__Comp__Group_2_1__0 )? ) )
            // InternalT2A.g:2727:1: ( ( rule__Comp__Group_2_1__0 )? )
            {
            // InternalT2A.g:2727:1: ( ( rule__Comp__Group_2_1__0 )? )
            // InternalT2A.g:2728:2: ( rule__Comp__Group_2_1__0 )?
            {
             before(grammarAccess.getCompAccess().getGroup_2_1()); 
            // InternalT2A.g:2729:2: ( rule__Comp__Group_2_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==23) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalT2A.g:2729:3: rule__Comp__Group_2_1__0
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
    // InternalT2A.g:2737:1: rule__Comp__Group_2__2 : rule__Comp__Group_2__2__Impl rule__Comp__Group_2__3 ;
    public final void rule__Comp__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2741:1: ( rule__Comp__Group_2__2__Impl rule__Comp__Group_2__3 )
            // InternalT2A.g:2742:2: rule__Comp__Group_2__2__Impl rule__Comp__Group_2__3
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
    // InternalT2A.g:2749:1: rule__Comp__Group_2__2__Impl : ( ( rule__Comp__Group_2_2__0 )? ) ;
    public final void rule__Comp__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2753:1: ( ( ( rule__Comp__Group_2_2__0 )? ) )
            // InternalT2A.g:2754:1: ( ( rule__Comp__Group_2_2__0 )? )
            {
            // InternalT2A.g:2754:1: ( ( rule__Comp__Group_2_2__0 )? )
            // InternalT2A.g:2755:2: ( rule__Comp__Group_2_2__0 )?
            {
             before(grammarAccess.getCompAccess().getGroup_2_2()); 
            // InternalT2A.g:2756:2: ( rule__Comp__Group_2_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalT2A.g:2756:3: rule__Comp__Group_2_2__0
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
    // InternalT2A.g:2764:1: rule__Comp__Group_2__3 : rule__Comp__Group_2__3__Impl rule__Comp__Group_2__4 ;
    public final void rule__Comp__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2768:1: ( rule__Comp__Group_2__3__Impl rule__Comp__Group_2__4 )
            // InternalT2A.g:2769:2: rule__Comp__Group_2__3__Impl rule__Comp__Group_2__4
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
    // InternalT2A.g:2776:1: rule__Comp__Group_2__3__Impl : ( ( rule__Comp__FeaturesAssignment_2_3 )* ) ;
    public final void rule__Comp__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2780:1: ( ( ( rule__Comp__FeaturesAssignment_2_3 )* ) )
            // InternalT2A.g:2781:1: ( ( rule__Comp__FeaturesAssignment_2_3 )* )
            {
            // InternalT2A.g:2781:1: ( ( rule__Comp__FeaturesAssignment_2_3 )* )
            // InternalT2A.g:2782:2: ( rule__Comp__FeaturesAssignment_2_3 )*
            {
             before(grammarAccess.getCompAccess().getFeaturesAssignment_2_3()); 
            // InternalT2A.g:2783:2: ( rule__Comp__FeaturesAssignment_2_3 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_STRING)||LA34_0==40) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalT2A.g:2783:3: rule__Comp__FeaturesAssignment_2_3
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
    // InternalT2A.g:2791:1: rule__Comp__Group_2__4 : rule__Comp__Group_2__4__Impl ;
    public final void rule__Comp__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2795:1: ( rule__Comp__Group_2__4__Impl )
            // InternalT2A.g:2796:2: rule__Comp__Group_2__4__Impl
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
    // InternalT2A.g:2802:1: rule__Comp__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Comp__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2806:1: ( ( '}' ) )
            // InternalT2A.g:2807:1: ( '}' )
            {
            // InternalT2A.g:2807:1: ( '}' )
            // InternalT2A.g:2808:2: '}'
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
    // InternalT2A.g:2818:1: rule__Comp__Group_2_1__0 : rule__Comp__Group_2_1__0__Impl rule__Comp__Group_2_1__1 ;
    public final void rule__Comp__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2822:1: ( rule__Comp__Group_2_1__0__Impl rule__Comp__Group_2_1__1 )
            // InternalT2A.g:2823:2: rule__Comp__Group_2_1__0__Impl rule__Comp__Group_2_1__1
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
    // InternalT2A.g:2830:1: rule__Comp__Group_2_1__0__Impl : ( 'sclass' ) ;
    public final void rule__Comp__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2834:1: ( ( 'sclass' ) )
            // InternalT2A.g:2835:1: ( 'sclass' )
            {
            // InternalT2A.g:2835:1: ( 'sclass' )
            // InternalT2A.g:2836:2: 'sclass'
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
    // InternalT2A.g:2845:1: rule__Comp__Group_2_1__1 : rule__Comp__Group_2_1__1__Impl rule__Comp__Group_2_1__2 ;
    public final void rule__Comp__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2849:1: ( rule__Comp__Group_2_1__1__Impl rule__Comp__Group_2_1__2 )
            // InternalT2A.g:2850:2: rule__Comp__Group_2_1__1__Impl rule__Comp__Group_2_1__2
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
    // InternalT2A.g:2857:1: rule__Comp__Group_2_1__1__Impl : ( '{' ) ;
    public final void rule__Comp__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2861:1: ( ( '{' ) )
            // InternalT2A.g:2862:1: ( '{' )
            {
            // InternalT2A.g:2862:1: ( '{' )
            // InternalT2A.g:2863:2: '{'
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
    // InternalT2A.g:2872:1: rule__Comp__Group_2_1__2 : rule__Comp__Group_2_1__2__Impl rule__Comp__Group_2_1__3 ;
    public final void rule__Comp__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2876:1: ( rule__Comp__Group_2_1__2__Impl rule__Comp__Group_2_1__3 )
            // InternalT2A.g:2877:2: rule__Comp__Group_2_1__2__Impl rule__Comp__Group_2_1__3
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
    // InternalT2A.g:2884:1: rule__Comp__Group_2_1__2__Impl : ( ( rule__Comp__HostclassesAssignment_2_1_2 )* ) ;
    public final void rule__Comp__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2888:1: ( ( ( rule__Comp__HostclassesAssignment_2_1_2 )* ) )
            // InternalT2A.g:2889:1: ( ( rule__Comp__HostclassesAssignment_2_1_2 )* )
            {
            // InternalT2A.g:2889:1: ( ( rule__Comp__HostclassesAssignment_2_1_2 )* )
            // InternalT2A.g:2890:2: ( rule__Comp__HostclassesAssignment_2_1_2 )*
            {
             before(grammarAccess.getCompAccess().getHostclassesAssignment_2_1_2()); 
            // InternalT2A.g:2891:2: ( rule__Comp__HostclassesAssignment_2_1_2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalT2A.g:2891:3: rule__Comp__HostclassesAssignment_2_1_2
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
    // InternalT2A.g:2899:1: rule__Comp__Group_2_1__3 : rule__Comp__Group_2_1__3__Impl ;
    public final void rule__Comp__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2903:1: ( rule__Comp__Group_2_1__3__Impl )
            // InternalT2A.g:2904:2: rule__Comp__Group_2_1__3__Impl
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
    // InternalT2A.g:2910:1: rule__Comp__Group_2_1__3__Impl : ( '}' ) ;
    public final void rule__Comp__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2914:1: ( ( '}' ) )
            // InternalT2A.g:2915:1: ( '}' )
            {
            // InternalT2A.g:2915:1: ( '}' )
            // InternalT2A.g:2916:2: '}'
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
    // InternalT2A.g:2926:1: rule__Comp__Group_2_2__0 : rule__Comp__Group_2_2__0__Impl rule__Comp__Group_2_2__1 ;
    public final void rule__Comp__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2930:1: ( rule__Comp__Group_2_2__0__Impl rule__Comp__Group_2_2__1 )
            // InternalT2A.g:2931:2: rule__Comp__Group_2_2__0__Impl rule__Comp__Group_2_2__1
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
    // InternalT2A.g:2938:1: rule__Comp__Group_2_2__0__Impl : ( 'sclassString' ) ;
    public final void rule__Comp__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2942:1: ( ( 'sclassString' ) )
            // InternalT2A.g:2943:1: ( 'sclassString' )
            {
            // InternalT2A.g:2943:1: ( 'sclassString' )
            // InternalT2A.g:2944:2: 'sclassString'
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
    // InternalT2A.g:2953:1: rule__Comp__Group_2_2__1 : rule__Comp__Group_2_2__1__Impl rule__Comp__Group_2_2__2 ;
    public final void rule__Comp__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2957:1: ( rule__Comp__Group_2_2__1__Impl rule__Comp__Group_2_2__2 )
            // InternalT2A.g:2958:2: rule__Comp__Group_2_2__1__Impl rule__Comp__Group_2_2__2
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
    // InternalT2A.g:2965:1: rule__Comp__Group_2_2__1__Impl : ( '{' ) ;
    public final void rule__Comp__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2969:1: ( ( '{' ) )
            // InternalT2A.g:2970:1: ( '{' )
            {
            // InternalT2A.g:2970:1: ( '{' )
            // InternalT2A.g:2971:2: '{'
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
    // InternalT2A.g:2980:1: rule__Comp__Group_2_2__2 : rule__Comp__Group_2_2__2__Impl rule__Comp__Group_2_2__3 ;
    public final void rule__Comp__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2984:1: ( rule__Comp__Group_2_2__2__Impl rule__Comp__Group_2_2__3 )
            // InternalT2A.g:2985:2: rule__Comp__Group_2_2__2__Impl rule__Comp__Group_2_2__3
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
    // InternalT2A.g:2992:1: rule__Comp__Group_2_2__2__Impl : ( ( rule__Comp__SclassesOnlineAssignment_2_2_2 )* ) ;
    public final void rule__Comp__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:2996:1: ( ( ( rule__Comp__SclassesOnlineAssignment_2_2_2 )* ) )
            // InternalT2A.g:2997:1: ( ( rule__Comp__SclassesOnlineAssignment_2_2_2 )* )
            {
            // InternalT2A.g:2997:1: ( ( rule__Comp__SclassesOnlineAssignment_2_2_2 )* )
            // InternalT2A.g:2998:2: ( rule__Comp__SclassesOnlineAssignment_2_2_2 )*
            {
             before(grammarAccess.getCompAccess().getSclassesOnlineAssignment_2_2_2()); 
            // InternalT2A.g:2999:2: ( rule__Comp__SclassesOnlineAssignment_2_2_2 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_STRING) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalT2A.g:2999:3: rule__Comp__SclassesOnlineAssignment_2_2_2
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
    // InternalT2A.g:3007:1: rule__Comp__Group_2_2__3 : rule__Comp__Group_2_2__3__Impl ;
    public final void rule__Comp__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3011:1: ( rule__Comp__Group_2_2__3__Impl )
            // InternalT2A.g:3012:2: rule__Comp__Group_2_2__3__Impl
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
    // InternalT2A.g:3018:1: rule__Comp__Group_2_2__3__Impl : ( '}' ) ;
    public final void rule__Comp__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3022:1: ( ( '}' ) )
            // InternalT2A.g:3023:1: ( '}' )
            {
            // InternalT2A.g:3023:1: ( '}' )
            // InternalT2A.g:3024:2: '}'
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


    // $ANTLR start "rule__GoTo__Group__0"
    // InternalT2A.g:3034:1: rule__GoTo__Group__0 : rule__GoTo__Group__0__Impl rule__GoTo__Group__1 ;
    public final void rule__GoTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3038:1: ( rule__GoTo__Group__0__Impl rule__GoTo__Group__1 )
            // InternalT2A.g:3039:2: rule__GoTo__Group__0__Impl rule__GoTo__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__GoTo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoTo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__0"


    // $ANTLR start "rule__GoTo__Group__0__Impl"
    // InternalT2A.g:3046:1: rule__GoTo__Group__0__Impl : ( () ) ;
    public final void rule__GoTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3050:1: ( ( () ) )
            // InternalT2A.g:3051:1: ( () )
            {
            // InternalT2A.g:3051:1: ( () )
            // InternalT2A.g:3052:2: ()
            {
             before(grammarAccess.getGoToAccess().getGoToAction_0()); 
            // InternalT2A.g:3053:2: ()
            // InternalT2A.g:3053:3: 
            {
            }

             after(grammarAccess.getGoToAccess().getGoToAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__0__Impl"


    // $ANTLR start "rule__GoTo__Group__1"
    // InternalT2A.g:3061:1: rule__GoTo__Group__1 : rule__GoTo__Group__1__Impl rule__GoTo__Group__2 ;
    public final void rule__GoTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3065:1: ( rule__GoTo__Group__1__Impl rule__GoTo__Group__2 )
            // InternalT2A.g:3066:2: rule__GoTo__Group__1__Impl rule__GoTo__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__GoTo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoTo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__1"


    // $ANTLR start "rule__GoTo__Group__1__Impl"
    // InternalT2A.g:3073:1: rule__GoTo__Group__1__Impl : ( 'GoTo' ) ;
    public final void rule__GoTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3077:1: ( ( 'GoTo' ) )
            // InternalT2A.g:3078:1: ( 'GoTo' )
            {
            // InternalT2A.g:3078:1: ( 'GoTo' )
            // InternalT2A.g:3079:2: 'GoTo'
            {
             before(grammarAccess.getGoToAccess().getGoToKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGoToAccess().getGoToKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__1__Impl"


    // $ANTLR start "rule__GoTo__Group__2"
    // InternalT2A.g:3088:1: rule__GoTo__Group__2 : rule__GoTo__Group__2__Impl rule__GoTo__Group__3 ;
    public final void rule__GoTo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3092:1: ( rule__GoTo__Group__2__Impl rule__GoTo__Group__3 )
            // InternalT2A.g:3093:2: rule__GoTo__Group__2__Impl rule__GoTo__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__GoTo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoTo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__2"


    // $ANTLR start "rule__GoTo__Group__2__Impl"
    // InternalT2A.g:3100:1: rule__GoTo__Group__2__Impl : ( '(' ) ;
    public final void rule__GoTo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3104:1: ( ( '(' ) )
            // InternalT2A.g:3105:1: ( '(' )
            {
            // InternalT2A.g:3105:1: ( '(' )
            // InternalT2A.g:3106:2: '('
            {
             before(grammarAccess.getGoToAccess().getLeftParenthesisKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getGoToAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__2__Impl"


    // $ANTLR start "rule__GoTo__Group__3"
    // InternalT2A.g:3115:1: rule__GoTo__Group__3 : rule__GoTo__Group__3__Impl rule__GoTo__Group__4 ;
    public final void rule__GoTo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3119:1: ( rule__GoTo__Group__3__Impl rule__GoTo__Group__4 )
            // InternalT2A.g:3120:2: rule__GoTo__Group__3__Impl rule__GoTo__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__GoTo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoTo__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__3"


    // $ANTLR start "rule__GoTo__Group__3__Impl"
    // InternalT2A.g:3127:1: rule__GoTo__Group__3__Impl : ( ( rule__GoTo__PageAssignment_3 ) ) ;
    public final void rule__GoTo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3131:1: ( ( ( rule__GoTo__PageAssignment_3 ) ) )
            // InternalT2A.g:3132:1: ( ( rule__GoTo__PageAssignment_3 ) )
            {
            // InternalT2A.g:3132:1: ( ( rule__GoTo__PageAssignment_3 ) )
            // InternalT2A.g:3133:2: ( rule__GoTo__PageAssignment_3 )
            {
             before(grammarAccess.getGoToAccess().getPageAssignment_3()); 
            // InternalT2A.g:3134:2: ( rule__GoTo__PageAssignment_3 )
            // InternalT2A.g:3134:3: rule__GoTo__PageAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__PageAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGoToAccess().getPageAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__3__Impl"


    // $ANTLR start "rule__GoTo__Group__4"
    // InternalT2A.g:3142:1: rule__GoTo__Group__4 : rule__GoTo__Group__4__Impl ;
    public final void rule__GoTo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3146:1: ( rule__GoTo__Group__4__Impl )
            // InternalT2A.g:3147:2: rule__GoTo__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__4"


    // $ANTLR start "rule__GoTo__Group__4__Impl"
    // InternalT2A.g:3153:1: rule__GoTo__Group__4__Impl : ( ')' ) ;
    public final void rule__GoTo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3157:1: ( ( ')' ) )
            // InternalT2A.g:3158:1: ( ')' )
            {
            // InternalT2A.g:3158:1: ( ')' )
            // InternalT2A.g:3159:2: ')'
            {
             before(grammarAccess.getGoToAccess().getRightParenthesisKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getGoToAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__4__Impl"


    // $ANTLR start "rule__InstanciaEDOM__Group__0"
    // InternalT2A.g:3169:1: rule__InstanciaEDOM__Group__0 : rule__InstanciaEDOM__Group__0__Impl rule__InstanciaEDOM__Group__1 ;
    public final void rule__InstanciaEDOM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3173:1: ( rule__InstanciaEDOM__Group__0__Impl rule__InstanciaEDOM__Group__1 )
            // InternalT2A.g:3174:2: rule__InstanciaEDOM__Group__0__Impl rule__InstanciaEDOM__Group__1
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
    // InternalT2A.g:3181:1: rule__InstanciaEDOM__Group__0__Impl : ( ( rule__InstanciaEDOM__InstanciaAssignment_0 ) ) ;
    public final void rule__InstanciaEDOM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3185:1: ( ( ( rule__InstanciaEDOM__InstanciaAssignment_0 ) ) )
            // InternalT2A.g:3186:1: ( ( rule__InstanciaEDOM__InstanciaAssignment_0 ) )
            {
            // InternalT2A.g:3186:1: ( ( rule__InstanciaEDOM__InstanciaAssignment_0 ) )
            // InternalT2A.g:3187:2: ( rule__InstanciaEDOM__InstanciaAssignment_0 )
            {
             before(grammarAccess.getInstanciaEDOMAccess().getInstanciaAssignment_0()); 
            // InternalT2A.g:3188:2: ( rule__InstanciaEDOM__InstanciaAssignment_0 )
            // InternalT2A.g:3188:3: rule__InstanciaEDOM__InstanciaAssignment_0
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
    // InternalT2A.g:3196:1: rule__InstanciaEDOM__Group__1 : rule__InstanciaEDOM__Group__1__Impl ;
    public final void rule__InstanciaEDOM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3200:1: ( rule__InstanciaEDOM__Group__1__Impl )
            // InternalT2A.g:3201:2: rule__InstanciaEDOM__Group__1__Impl
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
    // InternalT2A.g:3207:1: rule__InstanciaEDOM__Group__1__Impl : ( ( rule__InstanciaEDOM__Group_1__0 )? ) ;
    public final void rule__InstanciaEDOM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3211:1: ( ( ( rule__InstanciaEDOM__Group_1__0 )? ) )
            // InternalT2A.g:3212:1: ( ( rule__InstanciaEDOM__Group_1__0 )? )
            {
            // InternalT2A.g:3212:1: ( ( rule__InstanciaEDOM__Group_1__0 )? )
            // InternalT2A.g:3213:2: ( rule__InstanciaEDOM__Group_1__0 )?
            {
             before(grammarAccess.getInstanciaEDOMAccess().getGroup_1()); 
            // InternalT2A.g:3214:2: ( rule__InstanciaEDOM__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==21) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalT2A.g:3214:3: rule__InstanciaEDOM__Group_1__0
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
    // InternalT2A.g:3223:1: rule__InstanciaEDOM__Group_1__0 : rule__InstanciaEDOM__Group_1__0__Impl rule__InstanciaEDOM__Group_1__1 ;
    public final void rule__InstanciaEDOM__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3227:1: ( rule__InstanciaEDOM__Group_1__0__Impl rule__InstanciaEDOM__Group_1__1 )
            // InternalT2A.g:3228:2: rule__InstanciaEDOM__Group_1__0__Impl rule__InstanciaEDOM__Group_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalT2A.g:3235:1: rule__InstanciaEDOM__Group_1__0__Impl : ( '{' ) ;
    public final void rule__InstanciaEDOM__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3239:1: ( ( '{' ) )
            // InternalT2A.g:3240:1: ( '{' )
            {
            // InternalT2A.g:3240:1: ( '{' )
            // InternalT2A.g:3241:2: '{'
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
    // InternalT2A.g:3250:1: rule__InstanciaEDOM__Group_1__1 : rule__InstanciaEDOM__Group_1__1__Impl rule__InstanciaEDOM__Group_1__2 ;
    public final void rule__InstanciaEDOM__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3254:1: ( rule__InstanciaEDOM__Group_1__1__Impl rule__InstanciaEDOM__Group_1__2 )
            // InternalT2A.g:3255:2: rule__InstanciaEDOM__Group_1__1__Impl rule__InstanciaEDOM__Group_1__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalT2A.g:3262:1: rule__InstanciaEDOM__Group_1__1__Impl : ( ( rule__InstanciaEDOM__Group_1_1__0 )? ) ;
    public final void rule__InstanciaEDOM__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3266:1: ( ( ( rule__InstanciaEDOM__Group_1_1__0 )? ) )
            // InternalT2A.g:3267:1: ( ( rule__InstanciaEDOM__Group_1_1__0 )? )
            {
            // InternalT2A.g:3267:1: ( ( rule__InstanciaEDOM__Group_1_1__0 )? )
            // InternalT2A.g:3268:2: ( rule__InstanciaEDOM__Group_1_1__0 )?
            {
             before(grammarAccess.getInstanciaEDOMAccess().getGroup_1_1()); 
            // InternalT2A.g:3269:2: ( rule__InstanciaEDOM__Group_1_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==23) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalT2A.g:3269:3: rule__InstanciaEDOM__Group_1_1__0
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
    // InternalT2A.g:3277:1: rule__InstanciaEDOM__Group_1__2 : rule__InstanciaEDOM__Group_1__2__Impl rule__InstanciaEDOM__Group_1__3 ;
    public final void rule__InstanciaEDOM__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3281:1: ( rule__InstanciaEDOM__Group_1__2__Impl rule__InstanciaEDOM__Group_1__3 )
            // InternalT2A.g:3282:2: rule__InstanciaEDOM__Group_1__2__Impl rule__InstanciaEDOM__Group_1__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalT2A.g:3289:1: rule__InstanciaEDOM__Group_1__2__Impl : ( ( rule__InstanciaEDOM__Group_1_2__0 )? ) ;
    public final void rule__InstanciaEDOM__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3293:1: ( ( ( rule__InstanciaEDOM__Group_1_2__0 )? ) )
            // InternalT2A.g:3294:1: ( ( rule__InstanciaEDOM__Group_1_2__0 )? )
            {
            // InternalT2A.g:3294:1: ( ( rule__InstanciaEDOM__Group_1_2__0 )? )
            // InternalT2A.g:3295:2: ( rule__InstanciaEDOM__Group_1_2__0 )?
            {
             before(grammarAccess.getInstanciaEDOMAccess().getGroup_1_2()); 
            // InternalT2A.g:3296:2: ( rule__InstanciaEDOM__Group_1_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==32) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalT2A.g:3296:3: rule__InstanciaEDOM__Group_1_2__0
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
    // InternalT2A.g:3304:1: rule__InstanciaEDOM__Group_1__3 : rule__InstanciaEDOM__Group_1__3__Impl rule__InstanciaEDOM__Group_1__4 ;
    public final void rule__InstanciaEDOM__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3308:1: ( rule__InstanciaEDOM__Group_1__3__Impl rule__InstanciaEDOM__Group_1__4 )
            // InternalT2A.g:3309:2: rule__InstanciaEDOM__Group_1__3__Impl rule__InstanciaEDOM__Group_1__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalT2A.g:3316:1: rule__InstanciaEDOM__Group_1__3__Impl : ( ( rule__InstanciaEDOM__Group_1_3__0 )? ) ;
    public final void rule__InstanciaEDOM__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3320:1: ( ( ( rule__InstanciaEDOM__Group_1_3__0 )? ) )
            // InternalT2A.g:3321:1: ( ( rule__InstanciaEDOM__Group_1_3__0 )? )
            {
            // InternalT2A.g:3321:1: ( ( rule__InstanciaEDOM__Group_1_3__0 )? )
            // InternalT2A.g:3322:2: ( rule__InstanciaEDOM__Group_1_3__0 )?
            {
             before(grammarAccess.getInstanciaEDOMAccess().getGroup_1_3()); 
            // InternalT2A.g:3323:2: ( rule__InstanciaEDOM__Group_1_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==37) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalT2A.g:3323:3: rule__InstanciaEDOM__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InstanciaEDOM__Group_1_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstanciaEDOMAccess().getGroup_1_3()); 

            }


            }

        }
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
    // InternalT2A.g:3331:1: rule__InstanciaEDOM__Group_1__4 : rule__InstanciaEDOM__Group_1__4__Impl rule__InstanciaEDOM__Group_1__5 ;
    public final void rule__InstanciaEDOM__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3335:1: ( rule__InstanciaEDOM__Group_1__4__Impl rule__InstanciaEDOM__Group_1__5 )
            // InternalT2A.g:3336:2: rule__InstanciaEDOM__Group_1__4__Impl rule__InstanciaEDOM__Group_1__5
            {
            pushFollow(FOLLOW_29);
            rule__InstanciaEDOM__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanciaEDOM__Group_1__5();

            state._fsp--;


            }

        }
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
    // InternalT2A.g:3343:1: rule__InstanciaEDOM__Group_1__4__Impl : ( ( rule__InstanciaEDOM__InsfeaturesAssignment_1_4 )* ) ;
    public final void rule__InstanciaEDOM__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3347:1: ( ( ( rule__InstanciaEDOM__InsfeaturesAssignment_1_4 )* ) )
            // InternalT2A.g:3348:1: ( ( rule__InstanciaEDOM__InsfeaturesAssignment_1_4 )* )
            {
            // InternalT2A.g:3348:1: ( ( rule__InstanciaEDOM__InsfeaturesAssignment_1_4 )* )
            // InternalT2A.g:3349:2: ( rule__InstanciaEDOM__InsfeaturesAssignment_1_4 )*
            {
             before(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesAssignment_1_4()); 
            // InternalT2A.g:3350:2: ( rule__InstanciaEDOM__InsfeaturesAssignment_1_4 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_STRING)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalT2A.g:3350:3: rule__InstanciaEDOM__InsfeaturesAssignment_1_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__InstanciaEDOM__InsfeaturesAssignment_1_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesAssignment_1_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__InstanciaEDOM__Group_1__5"
    // InternalT2A.g:3358:1: rule__InstanciaEDOM__Group_1__5 : rule__InstanciaEDOM__Group_1__5__Impl ;
    public final void rule__InstanciaEDOM__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3362:1: ( rule__InstanciaEDOM__Group_1__5__Impl )
            // InternalT2A.g:3363:2: rule__InstanciaEDOM__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstanciaEDOM__Group_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1__5"


    // $ANTLR start "rule__InstanciaEDOM__Group_1__5__Impl"
    // InternalT2A.g:3369:1: rule__InstanciaEDOM__Group_1__5__Impl : ( '}' ) ;
    public final void rule__InstanciaEDOM__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3373:1: ( ( '}' ) )
            // InternalT2A.g:3374:1: ( '}' )
            {
            // InternalT2A.g:3374:1: ( '}' )
            // InternalT2A.g:3375:2: '}'
            {
             before(grammarAccess.getInstanciaEDOMAccess().getRightCurlyBracketKeyword_1_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInstanciaEDOMAccess().getRightCurlyBracketKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1__5__Impl"


    // $ANTLR start "rule__InstanciaEDOM__Group_1_1__0"
    // InternalT2A.g:3385:1: rule__InstanciaEDOM__Group_1_1__0 : rule__InstanciaEDOM__Group_1_1__0__Impl rule__InstanciaEDOM__Group_1_1__1 ;
    public final void rule__InstanciaEDOM__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3389:1: ( rule__InstanciaEDOM__Group_1_1__0__Impl rule__InstanciaEDOM__Group_1_1__1 )
            // InternalT2A.g:3390:2: rule__InstanciaEDOM__Group_1_1__0__Impl rule__InstanciaEDOM__Group_1_1__1
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
    // InternalT2A.g:3397:1: rule__InstanciaEDOM__Group_1_1__0__Impl : ( 'sclass' ) ;
    public final void rule__InstanciaEDOM__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3401:1: ( ( 'sclass' ) )
            // InternalT2A.g:3402:1: ( 'sclass' )
            {
            // InternalT2A.g:3402:1: ( 'sclass' )
            // InternalT2A.g:3403:2: 'sclass'
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
    // InternalT2A.g:3412:1: rule__InstanciaEDOM__Group_1_1__1 : rule__InstanciaEDOM__Group_1_1__1__Impl rule__InstanciaEDOM__Group_1_1__2 ;
    public final void rule__InstanciaEDOM__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3416:1: ( rule__InstanciaEDOM__Group_1_1__1__Impl rule__InstanciaEDOM__Group_1_1__2 )
            // InternalT2A.g:3417:2: rule__InstanciaEDOM__Group_1_1__1__Impl rule__InstanciaEDOM__Group_1_1__2
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
    // InternalT2A.g:3424:1: rule__InstanciaEDOM__Group_1_1__1__Impl : ( '{' ) ;
    public final void rule__InstanciaEDOM__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3428:1: ( ( '{' ) )
            // InternalT2A.g:3429:1: ( '{' )
            {
            // InternalT2A.g:3429:1: ( '{' )
            // InternalT2A.g:3430:2: '{'
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
    // InternalT2A.g:3439:1: rule__InstanciaEDOM__Group_1_1__2 : rule__InstanciaEDOM__Group_1_1__2__Impl rule__InstanciaEDOM__Group_1_1__3 ;
    public final void rule__InstanciaEDOM__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3443:1: ( rule__InstanciaEDOM__Group_1_1__2__Impl rule__InstanciaEDOM__Group_1_1__3 )
            // InternalT2A.g:3444:2: rule__InstanciaEDOM__Group_1_1__2__Impl rule__InstanciaEDOM__Group_1_1__3
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
    // InternalT2A.g:3451:1: rule__InstanciaEDOM__Group_1_1__2__Impl : ( ( rule__InstanciaEDOM__SclassesAssignment_1_1_2 )* ) ;
    public final void rule__InstanciaEDOM__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3455:1: ( ( ( rule__InstanciaEDOM__SclassesAssignment_1_1_2 )* ) )
            // InternalT2A.g:3456:1: ( ( rule__InstanciaEDOM__SclassesAssignment_1_1_2 )* )
            {
            // InternalT2A.g:3456:1: ( ( rule__InstanciaEDOM__SclassesAssignment_1_1_2 )* )
            // InternalT2A.g:3457:2: ( rule__InstanciaEDOM__SclassesAssignment_1_1_2 )*
            {
             before(grammarAccess.getInstanciaEDOMAccess().getSclassesAssignment_1_1_2()); 
            // InternalT2A.g:3458:2: ( rule__InstanciaEDOM__SclassesAssignment_1_1_2 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalT2A.g:3458:3: rule__InstanciaEDOM__SclassesAssignment_1_1_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__InstanciaEDOM__SclassesAssignment_1_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalT2A.g:3466:1: rule__InstanciaEDOM__Group_1_1__3 : rule__InstanciaEDOM__Group_1_1__3__Impl ;
    public final void rule__InstanciaEDOM__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3470:1: ( rule__InstanciaEDOM__Group_1_1__3__Impl )
            // InternalT2A.g:3471:2: rule__InstanciaEDOM__Group_1_1__3__Impl
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
    // InternalT2A.g:3477:1: rule__InstanciaEDOM__Group_1_1__3__Impl : ( '}' ) ;
    public final void rule__InstanciaEDOM__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3481:1: ( ( '}' ) )
            // InternalT2A.g:3482:1: ( '}' )
            {
            // InternalT2A.g:3482:1: ( '}' )
            // InternalT2A.g:3483:2: '}'
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
    // InternalT2A.g:3493:1: rule__InstanciaEDOM__Group_1_2__0 : rule__InstanciaEDOM__Group_1_2__0__Impl rule__InstanciaEDOM__Group_1_2__1 ;
    public final void rule__InstanciaEDOM__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3497:1: ( rule__InstanciaEDOM__Group_1_2__0__Impl rule__InstanciaEDOM__Group_1_2__1 )
            // InternalT2A.g:3498:2: rule__InstanciaEDOM__Group_1_2__0__Impl rule__InstanciaEDOM__Group_1_2__1
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
    // InternalT2A.g:3505:1: rule__InstanciaEDOM__Group_1_2__0__Impl : ( 'sclassString' ) ;
    public final void rule__InstanciaEDOM__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3509:1: ( ( 'sclassString' ) )
            // InternalT2A.g:3510:1: ( 'sclassString' )
            {
            // InternalT2A.g:3510:1: ( 'sclassString' )
            // InternalT2A.g:3511:2: 'sclassString'
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
    // InternalT2A.g:3520:1: rule__InstanciaEDOM__Group_1_2__1 : rule__InstanciaEDOM__Group_1_2__1__Impl rule__InstanciaEDOM__Group_1_2__2 ;
    public final void rule__InstanciaEDOM__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3524:1: ( rule__InstanciaEDOM__Group_1_2__1__Impl rule__InstanciaEDOM__Group_1_2__2 )
            // InternalT2A.g:3525:2: rule__InstanciaEDOM__Group_1_2__1__Impl rule__InstanciaEDOM__Group_1_2__2
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
    // InternalT2A.g:3532:1: rule__InstanciaEDOM__Group_1_2__1__Impl : ( '{' ) ;
    public final void rule__InstanciaEDOM__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3536:1: ( ( '{' ) )
            // InternalT2A.g:3537:1: ( '{' )
            {
            // InternalT2A.g:3537:1: ( '{' )
            // InternalT2A.g:3538:2: '{'
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
    // InternalT2A.g:3547:1: rule__InstanciaEDOM__Group_1_2__2 : rule__InstanciaEDOM__Group_1_2__2__Impl rule__InstanciaEDOM__Group_1_2__3 ;
    public final void rule__InstanciaEDOM__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3551:1: ( rule__InstanciaEDOM__Group_1_2__2__Impl rule__InstanciaEDOM__Group_1_2__3 )
            // InternalT2A.g:3552:2: rule__InstanciaEDOM__Group_1_2__2__Impl rule__InstanciaEDOM__Group_1_2__3
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
    // InternalT2A.g:3559:1: rule__InstanciaEDOM__Group_1_2__2__Impl : ( ( rule__InstanciaEDOM__SclassesOnlineAssignment_1_2_2 )* ) ;
    public final void rule__InstanciaEDOM__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3563:1: ( ( ( rule__InstanciaEDOM__SclassesOnlineAssignment_1_2_2 )* ) )
            // InternalT2A.g:3564:1: ( ( rule__InstanciaEDOM__SclassesOnlineAssignment_1_2_2 )* )
            {
            // InternalT2A.g:3564:1: ( ( rule__InstanciaEDOM__SclassesOnlineAssignment_1_2_2 )* )
            // InternalT2A.g:3565:2: ( rule__InstanciaEDOM__SclassesOnlineAssignment_1_2_2 )*
            {
             before(grammarAccess.getInstanciaEDOMAccess().getSclassesOnlineAssignment_1_2_2()); 
            // InternalT2A.g:3566:2: ( rule__InstanciaEDOM__SclassesOnlineAssignment_1_2_2 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_STRING) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalT2A.g:3566:3: rule__InstanciaEDOM__SclassesOnlineAssignment_1_2_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__InstanciaEDOM__SclassesOnlineAssignment_1_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalT2A.g:3574:1: rule__InstanciaEDOM__Group_1_2__3 : rule__InstanciaEDOM__Group_1_2__3__Impl ;
    public final void rule__InstanciaEDOM__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3578:1: ( rule__InstanciaEDOM__Group_1_2__3__Impl )
            // InternalT2A.g:3579:2: rule__InstanciaEDOM__Group_1_2__3__Impl
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
    // InternalT2A.g:3585:1: rule__InstanciaEDOM__Group_1_2__3__Impl : ( '}' ) ;
    public final void rule__InstanciaEDOM__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3589:1: ( ( '}' ) )
            // InternalT2A.g:3590:1: ( '}' )
            {
            // InternalT2A.g:3590:1: ( '}' )
            // InternalT2A.g:3591:2: '}'
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


    // $ANTLR start "rule__InstanciaEDOM__Group_1_3__0"
    // InternalT2A.g:3601:1: rule__InstanciaEDOM__Group_1_3__0 : rule__InstanciaEDOM__Group_1_3__0__Impl rule__InstanciaEDOM__Group_1_3__1 ;
    public final void rule__InstanciaEDOM__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3605:1: ( rule__InstanciaEDOM__Group_1_3__0__Impl rule__InstanciaEDOM__Group_1_3__1 )
            // InternalT2A.g:3606:2: rule__InstanciaEDOM__Group_1_3__0__Impl rule__InstanciaEDOM__Group_1_3__1
            {
            pushFollow(FOLLOW_26);
            rule__InstanciaEDOM__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanciaEDOM__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1_3__0"


    // $ANTLR start "rule__InstanciaEDOM__Group_1_3__0__Impl"
    // InternalT2A.g:3613:1: rule__InstanciaEDOM__Group_1_3__0__Impl : ( 'click::' ) ;
    public final void rule__InstanciaEDOM__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3617:1: ( ( 'click::' ) )
            // InternalT2A.g:3618:1: ( 'click::' )
            {
            // InternalT2A.g:3618:1: ( 'click::' )
            // InternalT2A.g:3619:2: 'click::'
            {
             before(grammarAccess.getInstanciaEDOMAccess().getClickKeyword_1_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getInstanciaEDOMAccess().getClickKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1_3__0__Impl"


    // $ANTLR start "rule__InstanciaEDOM__Group_1_3__1"
    // InternalT2A.g:3628:1: rule__InstanciaEDOM__Group_1_3__1 : rule__InstanciaEDOM__Group_1_3__1__Impl ;
    public final void rule__InstanciaEDOM__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3632:1: ( rule__InstanciaEDOM__Group_1_3__1__Impl )
            // InternalT2A.g:3633:2: rule__InstanciaEDOM__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstanciaEDOM__Group_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1_3__1"


    // $ANTLR start "rule__InstanciaEDOM__Group_1_3__1__Impl"
    // InternalT2A.g:3639:1: rule__InstanciaEDOM__Group_1_3__1__Impl : ( ( rule__InstanciaEDOM__GoToAssignment_1_3_1 ) ) ;
    public final void rule__InstanciaEDOM__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3643:1: ( ( ( rule__InstanciaEDOM__GoToAssignment_1_3_1 ) ) )
            // InternalT2A.g:3644:1: ( ( rule__InstanciaEDOM__GoToAssignment_1_3_1 ) )
            {
            // InternalT2A.g:3644:1: ( ( rule__InstanciaEDOM__GoToAssignment_1_3_1 ) )
            // InternalT2A.g:3645:2: ( rule__InstanciaEDOM__GoToAssignment_1_3_1 )
            {
             before(grammarAccess.getInstanciaEDOMAccess().getGoToAssignment_1_3_1()); 
            // InternalT2A.g:3646:2: ( rule__InstanciaEDOM__GoToAssignment_1_3_1 )
            // InternalT2A.g:3646:3: rule__InstanciaEDOM__GoToAssignment_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__InstanciaEDOM__GoToAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanciaEDOMAccess().getGoToAssignment_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__Group_1_3__1__Impl"


    // $ANTLR start "rule__Root__AppNameAssignment_1"
    // InternalT2A.g:3655:1: rule__Root__AppNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Root__AppNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3659:1: ( ( RULE_STRING ) )
            // InternalT2A.g:3660:2: ( RULE_STRING )
            {
            // InternalT2A.g:3660:2: ( RULE_STRING )
            // InternalT2A.g:3661:3: RULE_STRING
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
    // InternalT2A.g:3670:1: rule__Root__GlobalStyleAssignment_2 : ( ruleStyleGlobal ) ;
    public final void rule__Root__GlobalStyleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3674:1: ( ( ruleStyleGlobal ) )
            // InternalT2A.g:3675:2: ( ruleStyleGlobal )
            {
            // InternalT2A.g:3675:2: ( ruleStyleGlobal )
            // InternalT2A.g:3676:3: ruleStyleGlobal
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
    // InternalT2A.g:3685:1: rule__Root__StyleOnlineAssignment_3 : ( ruleStyleOnline ) ;
    public final void rule__Root__StyleOnlineAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3689:1: ( ( ruleStyleOnline ) )
            // InternalT2A.g:3690:2: ( ruleStyleOnline )
            {
            // InternalT2A.g:3690:2: ( ruleStyleOnline )
            // InternalT2A.g:3691:3: ruleStyleOnline
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
    // InternalT2A.g:3700:1: rule__Root__JsOnlineAssignment_4 : ( ruleJSOnline ) ;
    public final void rule__Root__JsOnlineAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3704:1: ( ( ruleJSOnline ) )
            // InternalT2A.g:3705:2: ( ruleJSOnline )
            {
            // InternalT2A.g:3705:2: ( ruleJSOnline )
            // InternalT2A.g:3706:3: ruleJSOnline
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
    // InternalT2A.g:3715:1: rule__Root__ElementsAssignment_5 : ( ruleElement ) ;
    public final void rule__Root__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3719:1: ( ( ruleElement ) )
            // InternalT2A.g:3720:2: ( ruleElement )
            {
            // InternalT2A.g:3720:2: ( ruleElement )
            // InternalT2A.g:3721:3: ruleElement
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
    // InternalT2A.g:3730:1: rule__Page__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Page__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3734:1: ( ( RULE_ID ) )
            // InternalT2A.g:3735:2: ( RULE_ID )
            {
            // InternalT2A.g:3735:2: ( RULE_ID )
            // InternalT2A.g:3736:3: RULE_ID
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
    // InternalT2A.g:3745:1: rule__Page__HostclassesAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__Page__HostclassesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3749:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:3750:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:3750:2: ( ( RULE_ID ) )
            // InternalT2A.g:3751:3: ( RULE_ID )
            {
             before(grammarAccess.getPageAccess().getHostclassesStyleClassCrossReference_3_2_0()); 
            // InternalT2A.g:3752:3: ( RULE_ID )
            // InternalT2A.g:3753:4: RULE_ID
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
    // InternalT2A.g:3764:1: rule__Page__HomeAssignment_4 : ( ( 'home' ) ) ;
    public final void rule__Page__HomeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3768:1: ( ( ( 'home' ) ) )
            // InternalT2A.g:3769:2: ( ( 'home' ) )
            {
            // InternalT2A.g:3769:2: ( ( 'home' ) )
            // InternalT2A.g:3770:3: ( 'home' )
            {
             before(grammarAccess.getPageAccess().getHomeHomeKeyword_4_0()); 
            // InternalT2A.g:3771:3: ( 'home' )
            // InternalT2A.g:3772:4: 'home'
            {
             before(grammarAccess.getPageAccess().getHomeHomeKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalT2A.g:3783:1: rule__Page__ShowInNavAssignment_5 : ( ( 'showInNav' ) ) ;
    public final void rule__Page__ShowInNavAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3787:1: ( ( ( 'showInNav' ) ) )
            // InternalT2A.g:3788:2: ( ( 'showInNav' ) )
            {
            // InternalT2A.g:3788:2: ( ( 'showInNav' ) )
            // InternalT2A.g:3789:3: ( 'showInNav' )
            {
             before(grammarAccess.getPageAccess().getShowInNavShowInNavKeyword_5_0()); 
            // InternalT2A.g:3790:3: ( 'showInNav' )
            // InternalT2A.g:3791:4: 'showInNav'
            {
             before(grammarAccess.getPageAccess().getShowInNavShowInNavKeyword_5_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalT2A.g:3802:1: rule__Page__PageFeaturesAssignment_6 : ( rulePageFeature ) ;
    public final void rule__Page__PageFeaturesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3806:1: ( ( rulePageFeature ) )
            // InternalT2A.g:3807:2: ( rulePageFeature )
            {
            // InternalT2A.g:3807:2: ( rulePageFeature )
            // InternalT2A.g:3808:3: rulePageFeature
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
    // InternalT2A.g:3817:1: rule__StyleGlobal__StyleclassesAssignment_3 : ( ruleStyleClass ) ;
    public final void rule__StyleGlobal__StyleclassesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3821:1: ( ( ruleStyleClass ) )
            // InternalT2A.g:3822:2: ( ruleStyleClass )
            {
            // InternalT2A.g:3822:2: ( ruleStyleClass )
            // InternalT2A.g:3823:3: ruleStyleClass
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
    // InternalT2A.g:3832:1: rule__StyleOnline__FullTagsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__StyleOnline__FullTagsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3836:1: ( ( RULE_STRING ) )
            // InternalT2A.g:3837:2: ( RULE_STRING )
            {
            // InternalT2A.g:3837:2: ( RULE_STRING )
            // InternalT2A.g:3838:3: RULE_STRING
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
    // InternalT2A.g:3847:1: rule__JSOnline__FullTagsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__JSOnline__FullTagsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3851:1: ( ( RULE_STRING ) )
            // InternalT2A.g:3852:2: ( RULE_STRING )
            {
            // InternalT2A.g:3852:2: ( RULE_STRING )
            // InternalT2A.g:3853:3: RULE_STRING
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
    // InternalT2A.g:3862:1: rule__StyleClass__NameAssignment_1 : ( ruleName ) ;
    public final void rule__StyleClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3866:1: ( ( ruleName ) )
            // InternalT2A.g:3867:2: ( ruleName )
            {
            // InternalT2A.g:3867:2: ( ruleName )
            // InternalT2A.g:3868:3: ruleName
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
    // InternalT2A.g:3877:1: rule__StyleClass__SattributesAssignment_3_0 : ( ruleSAttributeAndValue ) ;
    public final void rule__StyleClass__SattributesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3881:1: ( ( ruleSAttributeAndValue ) )
            // InternalT2A.g:3882:2: ( ruleSAttributeAndValue )
            {
            // InternalT2A.g:3882:2: ( ruleSAttributeAndValue )
            // InternalT2A.g:3883:3: ruleSAttributeAndValue
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
    // InternalT2A.g:3892:1: rule__StyleClass__SattributesAfterAssignment_4_2_0 : ( ruleSAttributeAndValue ) ;
    public final void rule__StyleClass__SattributesAfterAssignment_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3896:1: ( ( ruleSAttributeAndValue ) )
            // InternalT2A.g:3897:2: ( ruleSAttributeAndValue )
            {
            // InternalT2A.g:3897:2: ( ruleSAttributeAndValue )
            // InternalT2A.g:3898:3: ruleSAttributeAndValue
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
    // InternalT2A.g:3907:1: rule__StyleClass__SattributesActiveAssignment_5_2_0 : ( ruleSAttributeAndValue ) ;
    public final void rule__StyleClass__SattributesActiveAssignment_5_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3911:1: ( ( ruleSAttributeAndValue ) )
            // InternalT2A.g:3912:2: ( ruleSAttributeAndValue )
            {
            // InternalT2A.g:3912:2: ( ruleSAttributeAndValue )
            // InternalT2A.g:3913:3: ruleSAttributeAndValue
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
    // InternalT2A.g:3922:1: rule__SAttributeAndValue__StnameAssignment_0 : ( ruleName ) ;
    public final void rule__SAttributeAndValue__StnameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3926:1: ( ( ruleName ) )
            // InternalT2A.g:3927:2: ( ruleName )
            {
            // InternalT2A.g:3927:2: ( ruleName )
            // InternalT2A.g:3928:3: ruleName
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
    // InternalT2A.g:3937:1: rule__SAttributeAndValue__ValueAssignment_1 : ( RULE_STRING2 ) ;
    public final void rule__SAttributeAndValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3941:1: ( ( RULE_STRING2 ) )
            // InternalT2A.g:3942:2: ( RULE_STRING2 )
            {
            // InternalT2A.g:3942:2: ( RULE_STRING2 )
            // InternalT2A.g:3943:3: RULE_STRING2
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
    // InternalT2A.g:3952:1: rule__DOM__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DOM__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3956:1: ( ( RULE_ID ) )
            // InternalT2A.g:3957:2: ( RULE_ID )
            {
            // InternalT2A.g:3957:2: ( RULE_ID )
            // InternalT2A.g:3958:3: RULE_ID
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
    // InternalT2A.g:3967:1: rule__DOM__SclassesAssignment_2_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__DOM__SclassesAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3971:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:3972:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:3972:2: ( ( RULE_ID ) )
            // InternalT2A.g:3973:3: ( RULE_ID )
            {
             before(grammarAccess.getDOMAccess().getSclassesStyleClassCrossReference_2_1_2_0()); 
            // InternalT2A.g:3974:3: ( RULE_ID )
            // InternalT2A.g:3975:4: RULE_ID
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
    // InternalT2A.g:3986:1: rule__DOM__SclassesOnlineAssignment_2_2_2 : ( RULE_STRING ) ;
    public final void rule__DOM__SclassesOnlineAssignment_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:3990:1: ( ( RULE_STRING ) )
            // InternalT2A.g:3991:2: ( RULE_STRING )
            {
            // InternalT2A.g:3991:2: ( RULE_STRING )
            // InternalT2A.g:3992:3: RULE_STRING
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
    // InternalT2A.g:4001:1: rule__DOM__FeaturesAssignment_2_3 : ( ruleFeature ) ;
    public final void rule__DOM__FeaturesAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:4005:1: ( ( ruleFeature ) )
            // InternalT2A.g:4006:2: ( ruleFeature )
            {
            // InternalT2A.g:4006:2: ( ruleFeature )
            // InternalT2A.g:4007:3: ruleFeature
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
    // InternalT2A.g:4016:1: rule__Comp__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Comp__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:4020:1: ( ( RULE_ID ) )
            // InternalT2A.g:4021:2: ( RULE_ID )
            {
            // InternalT2A.g:4021:2: ( RULE_ID )
            // InternalT2A.g:4022:3: RULE_ID
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
    // InternalT2A.g:4031:1: rule__Comp__HostclassesAssignment_2_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Comp__HostclassesAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:4035:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:4036:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:4036:2: ( ( RULE_ID ) )
            // InternalT2A.g:4037:3: ( RULE_ID )
            {
             before(grammarAccess.getCompAccess().getHostclassesStyleClassCrossReference_2_1_2_0()); 
            // InternalT2A.g:4038:3: ( RULE_ID )
            // InternalT2A.g:4039:4: RULE_ID
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
    // InternalT2A.g:4050:1: rule__Comp__SclassesOnlineAssignment_2_2_2 : ( RULE_STRING ) ;
    public final void rule__Comp__SclassesOnlineAssignment_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:4054:1: ( ( RULE_STRING ) )
            // InternalT2A.g:4055:2: ( RULE_STRING )
            {
            // InternalT2A.g:4055:2: ( RULE_STRING )
            // InternalT2A.g:4056:3: RULE_STRING
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
    // InternalT2A.g:4065:1: rule__Comp__FeaturesAssignment_2_3 : ( ruleFeature ) ;
    public final void rule__Comp__FeaturesAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:4069:1: ( ( ruleFeature ) )
            // InternalT2A.g:4070:2: ( ruleFeature )
            {
            // InternalT2A.g:4070:2: ( ruleFeature )
            // InternalT2A.g:4071:3: ruleFeature
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


    // $ANTLR start "rule__GoTo__PageAssignment_3"
    // InternalT2A.g:4080:1: rule__GoTo__PageAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__GoTo__PageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:4084:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:4085:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:4085:2: ( ( RULE_ID ) )
            // InternalT2A.g:4086:3: ( RULE_ID )
            {
             before(grammarAccess.getGoToAccess().getPagePageCrossReference_3_0()); 
            // InternalT2A.g:4087:3: ( RULE_ID )
            // InternalT2A.g:4088:4: RULE_ID
            {
             before(grammarAccess.getGoToAccess().getPagePageIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGoToAccess().getPagePageIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getGoToAccess().getPagePageCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__PageAssignment_3"


    // $ANTLR start "rule__InstanciaEDOM__InstanciaAssignment_0"
    // InternalT2A.g:4099:1: rule__InstanciaEDOM__InstanciaAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__InstanciaEDOM__InstanciaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:4103:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:4104:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:4104:2: ( ( RULE_ID ) )
            // InternalT2A.g:4105:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanciaEDOMAccess().getInstanciaEDOMCrossReference_0_0()); 
            // InternalT2A.g:4106:3: ( RULE_ID )
            // InternalT2A.g:4107:4: RULE_ID
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
    // InternalT2A.g:4118:1: rule__InstanciaEDOM__SclassesAssignment_1_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__InstanciaEDOM__SclassesAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:4122:1: ( ( ( RULE_ID ) ) )
            // InternalT2A.g:4123:2: ( ( RULE_ID ) )
            {
            // InternalT2A.g:4123:2: ( ( RULE_ID ) )
            // InternalT2A.g:4124:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanciaEDOMAccess().getSclassesStyleClassCrossReference_1_1_2_0()); 
            // InternalT2A.g:4125:3: ( RULE_ID )
            // InternalT2A.g:4126:4: RULE_ID
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
    // InternalT2A.g:4137:1: rule__InstanciaEDOM__SclassesOnlineAssignment_1_2_2 : ( RULE_STRING ) ;
    public final void rule__InstanciaEDOM__SclassesOnlineAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:4141:1: ( ( RULE_STRING ) )
            // InternalT2A.g:4142:2: ( RULE_STRING )
            {
            // InternalT2A.g:4142:2: ( RULE_STRING )
            // InternalT2A.g:4143:3: RULE_STRING
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


    // $ANTLR start "rule__InstanciaEDOM__GoToAssignment_1_3_1"
    // InternalT2A.g:4152:1: rule__InstanciaEDOM__GoToAssignment_1_3_1 : ( ruleGoTo ) ;
    public final void rule__InstanciaEDOM__GoToAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:4156:1: ( ( ruleGoTo ) )
            // InternalT2A.g:4157:2: ( ruleGoTo )
            {
            // InternalT2A.g:4157:2: ( ruleGoTo )
            // InternalT2A.g:4158:3: ruleGoTo
            {
             before(grammarAccess.getInstanciaEDOMAccess().getGoToGoToParserRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGoTo();

            state._fsp--;

             after(grammarAccess.getInstanciaEDOMAccess().getGoToGoToParserRuleCall_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__GoToAssignment_1_3_1"


    // $ANTLR start "rule__InstanciaEDOM__InsfeaturesAssignment_1_4"
    // InternalT2A.g:4167:1: rule__InstanciaEDOM__InsfeaturesAssignment_1_4 : ( ruleInstanceEDOMFeature ) ;
    public final void rule__InstanciaEDOM__InsfeaturesAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:4171:1: ( ( ruleInstanceEDOMFeature ) )
            // InternalT2A.g:4172:2: ( ruleInstanceEDOMFeature )
            {
            // InternalT2A.g:4172:2: ( ruleInstanceEDOMFeature )
            // InternalT2A.g:4173:3: ruleInstanceEDOMFeature
            {
             before(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesInstanceEDOMFeatureParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInstanceEDOMFeature();

            state._fsp--;

             after(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesInstanceEDOMFeatureParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanciaEDOM__InsfeaturesAssignment_1_4"


    // $ANTLR start "rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0"
    // InternalT2A.g:4182:1: rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0 : ( ruleInstanciaEDOM ) ;
    public final void rule__InstanceEDOMFeature__InstanciaEDOMAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:4186:1: ( ( ruleInstanciaEDOM ) )
            // InternalT2A.g:4187:2: ( ruleInstanciaEDOM )
            {
            // InternalT2A.g:4187:2: ( ruleInstanciaEDOM )
            // InternalT2A.g:4188:3: ruleInstanciaEDOM
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
    // InternalT2A.g:4197:1: rule__InstanceEDOMFeature__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__InstanceEDOMFeature__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:4201:1: ( ( RULE_STRING ) )
            // InternalT2A.g:4202:2: ( RULE_STRING )
            {
            // InternalT2A.g:4202:2: ( RULE_STRING )
            // InternalT2A.g:4203:3: RULE_STRING
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
    // InternalT2A.g:4212:1: rule__PageFeature__InstanciaEDOMAssignment_0 : ( ruleInstanciaEDOM ) ;
    public final void rule__PageFeature__InstanciaEDOMAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:4216:1: ( ( ruleInstanciaEDOM ) )
            // InternalT2A.g:4217:2: ( ruleInstanciaEDOM )
            {
            // InternalT2A.g:4217:2: ( ruleInstanciaEDOM )
            // InternalT2A.g:4218:3: ruleInstanciaEDOM
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
    // InternalT2A.g:4227:1: rule__PageFeature__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__PageFeature__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:4231:1: ( ( RULE_STRING ) )
            // InternalT2A.g:4232:2: ( RULE_STRING )
            {
            // InternalT2A.g:4232:2: ( RULE_STRING )
            // InternalT2A.g:4233:3: RULE_STRING
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
    // InternalT2A.g:4242:1: rule__Feature__InstanciaEDOMAssignment_0 : ( ruleInstanciaEDOM ) ;
    public final void rule__Feature__InstanciaEDOMAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:4246:1: ( ( ruleInstanciaEDOM ) )
            // InternalT2A.g:4247:2: ( ruleInstanciaEDOM )
            {
            // InternalT2A.g:4247:2: ( ruleInstanciaEDOM )
            // InternalT2A.g:4248:3: ruleInstanciaEDOM
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
    // InternalT2A.g:4257:1: rule__Feature__AllowSlotAssignment_1 : ( ( 'AllowSlot' ) ) ;
    public final void rule__Feature__AllowSlotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:4261:1: ( ( ( 'AllowSlot' ) ) )
            // InternalT2A.g:4262:2: ( ( 'AllowSlot' ) )
            {
            // InternalT2A.g:4262:2: ( ( 'AllowSlot' ) )
            // InternalT2A.g:4263:3: ( 'AllowSlot' )
            {
             before(grammarAccess.getFeatureAccess().getAllowSlotAllowSlotKeyword_1_0()); 
            // InternalT2A.g:4264:3: ( 'AllowSlot' )
            // InternalT2A.g:4265:4: 'AllowSlot'
            {
             before(grammarAccess.getFeatureAccess().getAllowSlotAllowSlotKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalT2A.g:4276:1: rule__Feature__StringAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Feature__StringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2A.g:4280:1: ( ( RULE_STRING ) )
            // InternalT2A.g:4281:2: ( RULE_STRING )
            {
            // InternalT2A.g:4281:2: ( RULE_STRING )
            // InternalT2A.g:4282:3: RULE_STRING
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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000C000C00030L});
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
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010100C00030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000032L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002100C00030L});

}