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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalT2AParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Page'", "'{'", "'home'", "'}'", "'Dom'", "'Comp'", "'AllowSlot'"
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




    // $ANTLR start "entryRuleRoot"
    // InternalT2A.g:64:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalT2A.g:64:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalT2A.g:65:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalT2A.g:71:1: ruleRoot returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) )+ ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:77:2: ( ( (lv_elements_0_0= ruleElement ) )+ )
            // InternalT2A.g:78:2: ( (lv_elements_0_0= ruleElement ) )+
            {
            // InternalT2A.g:78:2: ( (lv_elements_0_0= ruleElement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=15 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalT2A.g:79:3: (lv_elements_0_0= ruleElement )
            	    {
            	    // InternalT2A.g:79:3: (lv_elements_0_0= ruleElement )
            	    // InternalT2A.g:80:4: lv_elements_0_0= ruleElement
            	    {

            	    				newCompositeNode(grammarAccess.getRootAccess().getElementsElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getRootRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"uma.es.angular.t2a.T2A.Element");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleElement"
    // InternalT2A.g:100:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalT2A.g:100:48: (iv_ruleElement= ruleElement EOF )
            // InternalT2A.g:101:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalT2A.g:107:1: ruleElement returns [EObject current=null] : (this_Page_0= rulePage | this_EDOM_1= ruleEDOM ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Page_0 = null;

        EObject this_EDOM_1 = null;



        	enterRule();

        try {
            // InternalT2A.g:113:2: ( (this_Page_0= rulePage | this_EDOM_1= ruleEDOM ) )
            // InternalT2A.g:114:2: (this_Page_0= rulePage | this_EDOM_1= ruleEDOM )
            {
            // InternalT2A.g:114:2: (this_Page_0= rulePage | this_EDOM_1= ruleEDOM )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=15 && LA2_0<=16)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalT2A.g:115:3: this_Page_0= rulePage
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getPageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Page_0=rulePage();

                    state._fsp--;


                    			current = this_Page_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalT2A.g:124:3: this_EDOM_1= ruleEDOM
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getEDOMParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EDOM_1=ruleEDOM();

                    state._fsp--;


                    			current = this_EDOM_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRulePage"
    // InternalT2A.g:136:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // InternalT2A.g:136:45: (iv_rulePage= rulePage EOF )
            // InternalT2A.g:137:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // InternalT2A.g:143:1: rulePage returns [EObject current=null] : (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_home_3_0= 'home' ) )? ( (lv_pageFeatures_4_0= rulePageFeature ) )* otherlv_5= '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_home_3_0=null;
        Token otherlv_5=null;
        EObject lv_pageFeatures_4_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:149:2: ( (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_home_3_0= 'home' ) )? ( (lv_pageFeatures_4_0= rulePageFeature ) )* otherlv_5= '}' ) )
            // InternalT2A.g:150:2: (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_home_3_0= 'home' ) )? ( (lv_pageFeatures_4_0= rulePageFeature ) )* otherlv_5= '}' )
            {
            // InternalT2A.g:150:2: (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_home_3_0= 'home' ) )? ( (lv_pageFeatures_4_0= rulePageFeature ) )* otherlv_5= '}' )
            // InternalT2A.g:151:3: otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_home_3_0= 'home' ) )? ( (lv_pageFeatures_4_0= rulePageFeature ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
            		
            // InternalT2A.g:155:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalT2A.g:156:4: (lv_name_1_0= RULE_ID )
            {
            // InternalT2A.g:156:4: (lv_name_1_0= RULE_ID )
            // InternalT2A.g:157:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalT2A.g:177:3: ( (lv_home_3_0= 'home' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalT2A.g:178:4: (lv_home_3_0= 'home' )
                    {
                    // InternalT2A.g:178:4: (lv_home_3_0= 'home' )
                    // InternalT2A.g:179:5: lv_home_3_0= 'home'
                    {
                    lv_home_3_0=(Token)match(input,13,FOLLOW_7); 

                    					newLeafNode(lv_home_3_0, grammarAccess.getPageAccess().getHomeHomeKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPageRule());
                    					}
                    					setWithLastConsumed(current, "home", lv_home_3_0 != null, "home");
                    				

                    }


                    }
                    break;

            }

            // InternalT2A.g:191:3: ( (lv_pageFeatures_4_0= rulePageFeature ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_STRING)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalT2A.g:192:4: (lv_pageFeatures_4_0= rulePageFeature )
            	    {
            	    // InternalT2A.g:192:4: (lv_pageFeatures_4_0= rulePageFeature )
            	    // InternalT2A.g:193:5: lv_pageFeatures_4_0= rulePageFeature
            	    {

            	    					newCompositeNode(grammarAccess.getPageAccess().getPageFeaturesPageFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_pageFeatures_4_0=rulePageFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"pageFeatures",
            	    						lv_pageFeatures_4_0,
            	    						"uma.es.angular.t2a.T2A.PageFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleEDOM"
    // InternalT2A.g:218:1: entryRuleEDOM returns [EObject current=null] : iv_ruleEDOM= ruleEDOM EOF ;
    public final EObject entryRuleEDOM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDOM = null;


        try {
            // InternalT2A.g:218:45: (iv_ruleEDOM= ruleEDOM EOF )
            // InternalT2A.g:219:2: iv_ruleEDOM= ruleEDOM EOF
            {
             newCompositeNode(grammarAccess.getEDOMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDOM=ruleEDOM();

            state._fsp--;

             current =iv_ruleEDOM; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDOM"


    // $ANTLR start "ruleEDOM"
    // InternalT2A.g:225:1: ruleEDOM returns [EObject current=null] : (this_DOM_0= ruleDOM | this_Comp_1= ruleComp ) ;
    public final EObject ruleEDOM() throws RecognitionException {
        EObject current = null;

        EObject this_DOM_0 = null;

        EObject this_Comp_1 = null;



        	enterRule();

        try {
            // InternalT2A.g:231:2: ( (this_DOM_0= ruleDOM | this_Comp_1= ruleComp ) )
            // InternalT2A.g:232:2: (this_DOM_0= ruleDOM | this_Comp_1= ruleComp )
            {
            // InternalT2A.g:232:2: (this_DOM_0= ruleDOM | this_Comp_1= ruleComp )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalT2A.g:233:3: this_DOM_0= ruleDOM
                    {

                    			newCompositeNode(grammarAccess.getEDOMAccess().getDOMParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DOM_0=ruleDOM();

                    state._fsp--;


                    			current = this_DOM_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalT2A.g:242:3: this_Comp_1= ruleComp
                    {

                    			newCompositeNode(grammarAccess.getEDOMAccess().getCompParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comp_1=ruleComp();

                    state._fsp--;


                    			current = this_Comp_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDOM"


    // $ANTLR start "entryRuleDOM"
    // InternalT2A.g:254:1: entryRuleDOM returns [EObject current=null] : iv_ruleDOM= ruleDOM EOF ;
    public final EObject entryRuleDOM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOM = null;


        try {
            // InternalT2A.g:254:44: (iv_ruleDOM= ruleDOM EOF )
            // InternalT2A.g:255:2: iv_ruleDOM= ruleDOM EOF
            {
             newCompositeNode(grammarAccess.getDOMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOM=ruleDOM();

            state._fsp--;

             current =iv_ruleDOM; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOM"


    // $ANTLR start "ruleDOM"
    // InternalT2A.g:261:1: ruleDOM returns [EObject current=null] : (otherlv_0= 'Dom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )? ) ;
    public final EObject ruleDOM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_features_3_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:267:2: ( (otherlv_0= 'Dom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )? ) )
            // InternalT2A.g:268:2: (otherlv_0= 'Dom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )? )
            {
            // InternalT2A.g:268:2: (otherlv_0= 'Dom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )? )
            // InternalT2A.g:269:3: otherlv_0= 'Dom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDOMAccess().getDomKeyword_0());
            		
            // InternalT2A.g:273:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalT2A.g:274:4: (lv_name_1_0= RULE_ID )
            {
            // InternalT2A.g:274:4: (lv_name_1_0= RULE_ID )
            // InternalT2A.g:275:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDOMAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDOMRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalT2A.g:291:3: (otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalT2A.g:292:4: otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getDOMAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalT2A.g:296:4: ( (lv_features_3_0= ruleFeature ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)||LA6_0==17) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalT2A.g:297:5: (lv_features_3_0= ruleFeature )
                    	    {
                    	    // InternalT2A.g:297:5: (lv_features_3_0= ruleFeature )
                    	    // InternalT2A.g:298:6: lv_features_3_0= ruleFeature
                    	    {

                    	    						newCompositeNode(grammarAccess.getDOMAccess().getFeaturesFeatureParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_features_3_0=ruleFeature();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDOMRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"features",
                    	    							lv_features_3_0,
                    	    							"uma.es.angular.t2a.T2A.Feature");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOM"


    // $ANTLR start "entryRuleComp"
    // InternalT2A.g:324:1: entryRuleComp returns [EObject current=null] : iv_ruleComp= ruleComp EOF ;
    public final EObject entryRuleComp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComp = null;


        try {
            // InternalT2A.g:324:45: (iv_ruleComp= ruleComp EOF )
            // InternalT2A.g:325:2: iv_ruleComp= ruleComp EOF
            {
             newCompositeNode(grammarAccess.getCompRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComp=ruleComp();

            state._fsp--;

             current =iv_ruleComp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComp"


    // $ANTLR start "ruleComp"
    // InternalT2A.g:331:1: ruleComp returns [EObject current=null] : (otherlv_0= 'Comp' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )? ) ;
    public final EObject ruleComp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_features_3_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:337:2: ( (otherlv_0= 'Comp' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )? ) )
            // InternalT2A.g:338:2: (otherlv_0= 'Comp' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )? )
            {
            // InternalT2A.g:338:2: (otherlv_0= 'Comp' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )? )
            // InternalT2A.g:339:3: otherlv_0= 'Comp' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCompAccess().getCompKeyword_0());
            		
            // InternalT2A.g:343:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalT2A.g:344:4: (lv_name_1_0= RULE_ID )
            {
            // InternalT2A.g:344:4: (lv_name_1_0= RULE_ID )
            // InternalT2A.g:345:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCompAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalT2A.g:361:3: (otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalT2A.g:362:4: otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getCompAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalT2A.g:366:4: ( (lv_features_3_0= ruleFeature ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_STRING)||LA8_0==17) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalT2A.g:367:5: (lv_features_3_0= ruleFeature )
                    	    {
                    	    // InternalT2A.g:367:5: (lv_features_3_0= ruleFeature )
                    	    // InternalT2A.g:368:6: lv_features_3_0= ruleFeature
                    	    {

                    	    						newCompositeNode(grammarAccess.getCompAccess().getFeaturesFeatureParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_features_3_0=ruleFeature();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCompRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"features",
                    	    							lv_features_3_0,
                    	    							"uma.es.angular.t2a.T2A.Feature");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComp"


    // $ANTLR start "entryRuleInstanciaEDOM"
    // InternalT2A.g:394:1: entryRuleInstanciaEDOM returns [EObject current=null] : iv_ruleInstanciaEDOM= ruleInstanciaEDOM EOF ;
    public final EObject entryRuleInstanciaEDOM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanciaEDOM = null;


        try {
            // InternalT2A.g:394:54: (iv_ruleInstanciaEDOM= ruleInstanciaEDOM EOF )
            // InternalT2A.g:395:2: iv_ruleInstanciaEDOM= ruleInstanciaEDOM EOF
            {
             newCompositeNode(grammarAccess.getInstanciaEDOMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstanciaEDOM=ruleInstanciaEDOM();

            state._fsp--;

             current =iv_ruleInstanciaEDOM; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanciaEDOM"


    // $ANTLR start "ruleInstanciaEDOM"
    // InternalT2A.g:401:1: ruleInstanciaEDOM returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_insfeatures_2_0= ruleInstanceEDOMFeature ) )* otherlv_3= '}' )? ) ;
    public final EObject ruleInstanciaEDOM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_insfeatures_2_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:407:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_insfeatures_2_0= ruleInstanceEDOMFeature ) )* otherlv_3= '}' )? ) )
            // InternalT2A.g:408:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_insfeatures_2_0= ruleInstanceEDOMFeature ) )* otherlv_3= '}' )? )
            {
            // InternalT2A.g:408:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_insfeatures_2_0= ruleInstanceEDOMFeature ) )* otherlv_3= '}' )? )
            // InternalT2A.g:409:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_insfeatures_2_0= ruleInstanceEDOMFeature ) )* otherlv_3= '}' )?
            {
            // InternalT2A.g:409:3: ( (otherlv_0= RULE_ID ) )
            // InternalT2A.g:410:4: (otherlv_0= RULE_ID )
            {
            // InternalT2A.g:410:4: (otherlv_0= RULE_ID )
            // InternalT2A.g:411:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanciaEDOMRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getInstanciaEDOMAccess().getInstanciaEDOMCrossReference_0_0());
            				

            }


            }

            // InternalT2A.g:422:3: (otherlv_1= '{' ( (lv_insfeatures_2_0= ruleInstanceEDOMFeature ) )* otherlv_3= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalT2A.g:423:4: otherlv_1= '{' ( (lv_insfeatures_2_0= ruleInstanceEDOMFeature ) )* otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getInstanciaEDOMAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalT2A.g:427:4: ( (lv_insfeatures_2_0= ruleInstanceEDOMFeature ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalT2A.g:428:5: (lv_insfeatures_2_0= ruleInstanceEDOMFeature )
                    	    {
                    	    // InternalT2A.g:428:5: (lv_insfeatures_2_0= ruleInstanceEDOMFeature )
                    	    // InternalT2A.g:429:6: lv_insfeatures_2_0= ruleInstanceEDOMFeature
                    	    {

                    	    						newCompositeNode(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesInstanceEDOMFeatureParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_insfeatures_2_0=ruleInstanceEDOMFeature();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getInstanciaEDOMRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"insfeatures",
                    	    							lv_insfeatures_2_0,
                    	    							"uma.es.angular.t2a.T2A.InstanceEDOMFeature");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getInstanciaEDOMAccess().getRightCurlyBracketKeyword_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanciaEDOM"


    // $ANTLR start "entryRuleInstanceEDOMFeature"
    // InternalT2A.g:455:1: entryRuleInstanceEDOMFeature returns [EObject current=null] : iv_ruleInstanceEDOMFeature= ruleInstanceEDOMFeature EOF ;
    public final EObject entryRuleInstanceEDOMFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceEDOMFeature = null;


        try {
            // InternalT2A.g:455:60: (iv_ruleInstanceEDOMFeature= ruleInstanceEDOMFeature EOF )
            // InternalT2A.g:456:2: iv_ruleInstanceEDOMFeature= ruleInstanceEDOMFeature EOF
            {
             newCompositeNode(grammarAccess.getInstanceEDOMFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstanceEDOMFeature=ruleInstanceEDOMFeature();

            state._fsp--;

             current =iv_ruleInstanceEDOMFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceEDOMFeature"


    // $ANTLR start "ruleInstanceEDOMFeature"
    // InternalT2A.g:462:1: ruleInstanceEDOMFeature returns [EObject current=null] : ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInstanceEDOMFeature() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;
        EObject lv_instanciaEDOM_0_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:468:2: ( ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // InternalT2A.g:469:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // InternalT2A.g:469:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_STRING) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalT2A.g:470:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    {
                    // InternalT2A.g:470:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    // InternalT2A.g:471:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    {
                    // InternalT2A.g:471:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    // InternalT2A.g:472:5: lv_instanciaEDOM_0_0= ruleInstanciaEDOM
                    {

                    					newCompositeNode(grammarAccess.getInstanceEDOMFeatureAccess().getInstanciaEDOMInstanciaEDOMParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_instanciaEDOM_0_0=ruleInstanciaEDOM();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstanceEDOMFeatureRule());
                    					}
                    					set(
                    						current,
                    						"instanciaEDOM",
                    						lv_instanciaEDOM_0_0,
                    						"uma.es.angular.t2a.T2A.InstanciaEDOM");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalT2A.g:490:3: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // InternalT2A.g:490:3: ( (lv_string_1_0= RULE_STRING ) )
                    // InternalT2A.g:491:4: (lv_string_1_0= RULE_STRING )
                    {
                    // InternalT2A.g:491:4: (lv_string_1_0= RULE_STRING )
                    // InternalT2A.g:492:5: lv_string_1_0= RULE_STRING
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_1_0, grammarAccess.getInstanceEDOMFeatureAccess().getStringSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInstanceEDOMFeatureRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_1_0,
                    						"uma.es.angular.t2a.T2A.STRING");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceEDOMFeature"


    // $ANTLR start "entryRulePageFeature"
    // InternalT2A.g:512:1: entryRulePageFeature returns [EObject current=null] : iv_rulePageFeature= rulePageFeature EOF ;
    public final EObject entryRulePageFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageFeature = null;


        try {
            // InternalT2A.g:512:52: (iv_rulePageFeature= rulePageFeature EOF )
            // InternalT2A.g:513:2: iv_rulePageFeature= rulePageFeature EOF
            {
             newCompositeNode(grammarAccess.getPageFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePageFeature=rulePageFeature();

            state._fsp--;

             current =iv_rulePageFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageFeature"


    // $ANTLR start "rulePageFeature"
    // InternalT2A.g:519:1: rulePageFeature returns [EObject current=null] : ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject rulePageFeature() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;
        EObject lv_instanciaEDOM_0_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:525:2: ( ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // InternalT2A.g:526:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // InternalT2A.g:526:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_STRING) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalT2A.g:527:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    {
                    // InternalT2A.g:527:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    // InternalT2A.g:528:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    {
                    // InternalT2A.g:528:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    // InternalT2A.g:529:5: lv_instanciaEDOM_0_0= ruleInstanciaEDOM
                    {

                    					newCompositeNode(grammarAccess.getPageFeatureAccess().getInstanciaEDOMInstanciaEDOMParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_instanciaEDOM_0_0=ruleInstanciaEDOM();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPageFeatureRule());
                    					}
                    					set(
                    						current,
                    						"instanciaEDOM",
                    						lv_instanciaEDOM_0_0,
                    						"uma.es.angular.t2a.T2A.InstanciaEDOM");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalT2A.g:547:3: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // InternalT2A.g:547:3: ( (lv_string_1_0= RULE_STRING ) )
                    // InternalT2A.g:548:4: (lv_string_1_0= RULE_STRING )
                    {
                    // InternalT2A.g:548:4: (lv_string_1_0= RULE_STRING )
                    // InternalT2A.g:549:5: lv_string_1_0= RULE_STRING
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_1_0, grammarAccess.getPageFeatureAccess().getStringSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPageFeatureRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_1_0,
                    						"uma.es.angular.t2a.T2A.STRING");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageFeature"


    // $ANTLR start "entryRuleFeature"
    // InternalT2A.g:569:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalT2A.g:569:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalT2A.g:570:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalT2A.g:576:1: ruleFeature returns [EObject current=null] : ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_AllowSlot_1_0= 'AllowSlot' ) ) | ( (lv_string_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_AllowSlot_1_0=null;
        Token lv_string_2_0=null;
        EObject lv_instanciaEDOM_0_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:582:2: ( ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_AllowSlot_1_0= 'AllowSlot' ) ) | ( (lv_string_2_0= RULE_STRING ) ) ) )
            // InternalT2A.g:583:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_AllowSlot_1_0= 'AllowSlot' ) ) | ( (lv_string_2_0= RULE_STRING ) ) )
            {
            // InternalT2A.g:583:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_AllowSlot_1_0= 'AllowSlot' ) ) | ( (lv_string_2_0= RULE_STRING ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt14=1;
                }
                break;
            case 17:
                {
                alt14=2;
                }
                break;
            case RULE_STRING:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalT2A.g:584:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    {
                    // InternalT2A.g:584:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    // InternalT2A.g:585:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    {
                    // InternalT2A.g:585:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    // InternalT2A.g:586:5: lv_instanciaEDOM_0_0= ruleInstanciaEDOM
                    {

                    					newCompositeNode(grammarAccess.getFeatureAccess().getInstanciaEDOMInstanciaEDOMParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_instanciaEDOM_0_0=ruleInstanciaEDOM();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFeatureRule());
                    					}
                    					set(
                    						current,
                    						"instanciaEDOM",
                    						lv_instanciaEDOM_0_0,
                    						"uma.es.angular.t2a.T2A.InstanciaEDOM");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalT2A.g:604:3: ( (lv_AllowSlot_1_0= 'AllowSlot' ) )
                    {
                    // InternalT2A.g:604:3: ( (lv_AllowSlot_1_0= 'AllowSlot' ) )
                    // InternalT2A.g:605:4: (lv_AllowSlot_1_0= 'AllowSlot' )
                    {
                    // InternalT2A.g:605:4: (lv_AllowSlot_1_0= 'AllowSlot' )
                    // InternalT2A.g:606:5: lv_AllowSlot_1_0= 'AllowSlot'
                    {
                    lv_AllowSlot_1_0=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_AllowSlot_1_0, grammarAccess.getFeatureAccess().getAllowSlotAllowSlotKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFeatureRule());
                    					}
                    					setWithLastConsumed(current, "AllowSlot", lv_AllowSlot_1_0 != null, "AllowSlot");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalT2A.g:619:3: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // InternalT2A.g:619:3: ( (lv_string_2_0= RULE_STRING ) )
                    // InternalT2A.g:620:4: (lv_string_2_0= RULE_STRING )
                    {
                    // InternalT2A.g:620:4: (lv_string_2_0= RULE_STRING )
                    // InternalT2A.g:621:5: lv_string_2_0= RULE_STRING
                    {
                    lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_2_0, grammarAccess.getFeatureAccess().getStringSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFeatureRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_2_0,
                    						"uma.es.angular.t2a.T2A.STRING");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000018802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000024030L});

}