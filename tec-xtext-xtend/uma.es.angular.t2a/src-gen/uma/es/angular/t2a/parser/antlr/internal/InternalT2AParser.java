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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING2", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Page'", "'{'", "'sclass'", "'}'", "'home'", "'showInNav'", "'StyleGlobal'", "'StyleClass'", "';'", "'after'", "'active'", "'Dom'", "'Comp'", "'AllowSlot'", "'_'", "'#'", "'-'", "'*'", "'.'", "'::'", "'>'"
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
    // InternalT2A.g:71:1: ruleRoot returns [EObject current=null] : ( ( (lv_globalStyle_0_0= ruleStyleGlobal ) ) ( (lv_elements_1_0= ruleElement ) )+ ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_globalStyle_0_0 = null;

        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:77:2: ( ( ( (lv_globalStyle_0_0= ruleStyleGlobal ) ) ( (lv_elements_1_0= ruleElement ) )+ ) )
            // InternalT2A.g:78:2: ( ( (lv_globalStyle_0_0= ruleStyleGlobal ) ) ( (lv_elements_1_0= ruleElement ) )+ )
            {
            // InternalT2A.g:78:2: ( ( (lv_globalStyle_0_0= ruleStyleGlobal ) ) ( (lv_elements_1_0= ruleElement ) )+ )
            // InternalT2A.g:79:3: ( (lv_globalStyle_0_0= ruleStyleGlobal ) ) ( (lv_elements_1_0= ruleElement ) )+
            {
            // InternalT2A.g:79:3: ( (lv_globalStyle_0_0= ruleStyleGlobal ) )
            // InternalT2A.g:80:4: (lv_globalStyle_0_0= ruleStyleGlobal )
            {
            // InternalT2A.g:80:4: (lv_globalStyle_0_0= ruleStyleGlobal )
            // InternalT2A.g:81:5: lv_globalStyle_0_0= ruleStyleGlobal
            {

            					newCompositeNode(grammarAccess.getRootAccess().getGlobalStyleStyleGlobalParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_globalStyle_0_0=ruleStyleGlobal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootRule());
            					}
            					set(
            						current,
            						"globalStyle",
            						lv_globalStyle_0_0,
            						"uma.es.angular.t2a.T2A.StyleGlobal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalT2A.g:98:3: ( (lv_elements_1_0= ruleElement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==19||(LA1_0>=23 && LA1_0<=24)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalT2A.g:99:4: (lv_elements_1_0= ruleElement )
            	    {
            	    // InternalT2A.g:99:4: (lv_elements_1_0= ruleElement )
            	    // InternalT2A.g:100:5: lv_elements_1_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getRootAccess().getElementsElementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_elements_1_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
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
    // InternalT2A.g:121:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalT2A.g:121:48: (iv_ruleElement= ruleElement EOF )
            // InternalT2A.g:122:2: iv_ruleElement= ruleElement EOF
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
    // InternalT2A.g:128:1: ruleElement returns [EObject current=null] : (this_Page_0= rulePage | this_EDOM_1= ruleEDOM ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Page_0 = null;

        EObject this_EDOM_1 = null;



        	enterRule();

        try {
            // InternalT2A.g:134:2: ( (this_Page_0= rulePage | this_EDOM_1= ruleEDOM ) )
            // InternalT2A.g:135:2: (this_Page_0= rulePage | this_EDOM_1= ruleEDOM )
            {
            // InternalT2A.g:135:2: (this_Page_0= rulePage | this_EDOM_1= ruleEDOM )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==19||(LA2_0>=23 && LA2_0<=24)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalT2A.g:136:3: this_Page_0= rulePage
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
                    // InternalT2A.g:145:3: this_EDOM_1= ruleEDOM
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
    // InternalT2A.g:157:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // InternalT2A.g:157:45: (iv_rulePage= rulePage EOF )
            // InternalT2A.g:158:2: iv_rulePage= rulePage EOF
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
    // InternalT2A.g:164:1: rulePage returns [EObject current=null] : (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_home_7_0= 'home' ) )? ( (lv_showInNav_8_0= 'showInNav' ) )? ( (lv_pageFeatures_9_0= rulePageFeature ) )* otherlv_10= '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_home_7_0=null;
        Token lv_showInNav_8_0=null;
        Token otherlv_10=null;
        EObject lv_pageFeatures_9_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:170:2: ( (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_home_7_0= 'home' ) )? ( (lv_showInNav_8_0= 'showInNav' ) )? ( (lv_pageFeatures_9_0= rulePageFeature ) )* otherlv_10= '}' ) )
            // InternalT2A.g:171:2: (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_home_7_0= 'home' ) )? ( (lv_showInNav_8_0= 'showInNav' ) )? ( (lv_pageFeatures_9_0= rulePageFeature ) )* otherlv_10= '}' )
            {
            // InternalT2A.g:171:2: (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_home_7_0= 'home' ) )? ( (lv_showInNav_8_0= 'showInNav' ) )? ( (lv_pageFeatures_9_0= rulePageFeature ) )* otherlv_10= '}' )
            // InternalT2A.g:172:3: otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_home_7_0= 'home' ) )? ( (lv_showInNav_8_0= 'showInNav' ) )? ( (lv_pageFeatures_9_0= rulePageFeature ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
            		
            // InternalT2A.g:176:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalT2A.g:177:4: (lv_name_1_0= RULE_ID )
            {
            // InternalT2A.g:177:4: (lv_name_1_0= RULE_ID )
            // InternalT2A.g:178:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalT2A.g:198:3: (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalT2A.g:199:4: otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getPageAccess().getSclassKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalT2A.g:207:4: ( (otherlv_5= RULE_ID ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalT2A.g:208:5: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalT2A.g:208:5: (otherlv_5= RULE_ID )
                    	    // InternalT2A.g:209:6: otherlv_5= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getPageRule());
                    	    						}
                    	    					
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_8); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getPageAccess().getHostclassesStyleClassCrossReference_3_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalT2A.g:225:3: ( (lv_home_7_0= 'home' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalT2A.g:226:4: (lv_home_7_0= 'home' )
                    {
                    // InternalT2A.g:226:4: (lv_home_7_0= 'home' )
                    // InternalT2A.g:227:5: lv_home_7_0= 'home'
                    {
                    lv_home_7_0=(Token)match(input,16,FOLLOW_10); 

                    					newLeafNode(lv_home_7_0, grammarAccess.getPageAccess().getHomeHomeKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPageRule());
                    					}
                    					setWithLastConsumed(current, "home", lv_home_7_0 != null, "home");
                    				

                    }


                    }
                    break;

            }

            // InternalT2A.g:239:3: ( (lv_showInNav_8_0= 'showInNav' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalT2A.g:240:4: (lv_showInNav_8_0= 'showInNav' )
                    {
                    // InternalT2A.g:240:4: (lv_showInNav_8_0= 'showInNav' )
                    // InternalT2A.g:241:5: lv_showInNav_8_0= 'showInNav'
                    {
                    lv_showInNav_8_0=(Token)match(input,17,FOLLOW_11); 

                    					newLeafNode(lv_showInNav_8_0, grammarAccess.getPageAccess().getShowInNavShowInNavKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPageRule());
                    					}
                    					setWithLastConsumed(current, "showInNav", lv_showInNav_8_0 != null, "showInNav");
                    				

                    }


                    }
                    break;

            }

            // InternalT2A.g:253:3: ( (lv_pageFeatures_9_0= rulePageFeature ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==RULE_STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalT2A.g:254:4: (lv_pageFeatures_9_0= rulePageFeature )
            	    {
            	    // InternalT2A.g:254:4: (lv_pageFeatures_9_0= rulePageFeature )
            	    // InternalT2A.g:255:5: lv_pageFeatures_9_0= rulePageFeature
            	    {

            	    					newCompositeNode(grammarAccess.getPageAccess().getPageFeaturesPageFeatureParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_pageFeatures_9_0=rulePageFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"pageFeatures",
            	    						lv_pageFeatures_9_0,
            	    						"uma.es.angular.t2a.T2A.PageFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalT2A.g:280:1: entryRuleEDOM returns [EObject current=null] : iv_ruleEDOM= ruleEDOM EOF ;
    public final EObject entryRuleEDOM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDOM = null;


        try {
            // InternalT2A.g:280:45: (iv_ruleEDOM= ruleEDOM EOF )
            // InternalT2A.g:281:2: iv_ruleEDOM= ruleEDOM EOF
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
    // InternalT2A.g:287:1: ruleEDOM returns [EObject current=null] : (this_DOM_0= ruleDOM | this_Comp_1= ruleComp | this_StyleClass_2= ruleStyleClass ) ;
    public final EObject ruleEDOM() throws RecognitionException {
        EObject current = null;

        EObject this_DOM_0 = null;

        EObject this_Comp_1 = null;

        EObject this_StyleClass_2 = null;



        	enterRule();

        try {
            // InternalT2A.g:293:2: ( (this_DOM_0= ruleDOM | this_Comp_1= ruleComp | this_StyleClass_2= ruleStyleClass ) )
            // InternalT2A.g:294:2: (this_DOM_0= ruleDOM | this_Comp_1= ruleComp | this_StyleClass_2= ruleStyleClass )
            {
            // InternalT2A.g:294:2: (this_DOM_0= ruleDOM | this_Comp_1= ruleComp | this_StyleClass_2= ruleStyleClass )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 19:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalT2A.g:295:3: this_DOM_0= ruleDOM
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
                    // InternalT2A.g:304:3: this_Comp_1= ruleComp
                    {

                    			newCompositeNode(grammarAccess.getEDOMAccess().getCompParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comp_1=ruleComp();

                    state._fsp--;


                    			current = this_Comp_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalT2A.g:313:3: this_StyleClass_2= ruleStyleClass
                    {

                    			newCompositeNode(grammarAccess.getEDOMAccess().getStyleClassParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StyleClass_2=ruleStyleClass();

                    state._fsp--;


                    			current = this_StyleClass_2;
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


    // $ANTLR start "entryRuleStyleGlobal"
    // InternalT2A.g:325:1: entryRuleStyleGlobal returns [EObject current=null] : iv_ruleStyleGlobal= ruleStyleGlobal EOF ;
    public final EObject entryRuleStyleGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleGlobal = null;


        try {
            // InternalT2A.g:325:52: (iv_ruleStyleGlobal= ruleStyleGlobal EOF )
            // InternalT2A.g:326:2: iv_ruleStyleGlobal= ruleStyleGlobal EOF
            {
             newCompositeNode(grammarAccess.getStyleGlobalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStyleGlobal=ruleStyleGlobal();

            state._fsp--;

             current =iv_ruleStyleGlobal; 
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
    // $ANTLR end "entryRuleStyleGlobal"


    // $ANTLR start "ruleStyleGlobal"
    // InternalT2A.g:332:1: ruleStyleGlobal returns [EObject current=null] : ( () otherlv_1= 'StyleGlobal' otherlv_2= '{' ( (lv_styleclasses_3_0= ruleStyleClass ) )* otherlv_4= '}' ) ;
    public final EObject ruleStyleGlobal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_styleclasses_3_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:338:2: ( ( () otherlv_1= 'StyleGlobal' otherlv_2= '{' ( (lv_styleclasses_3_0= ruleStyleClass ) )* otherlv_4= '}' ) )
            // InternalT2A.g:339:2: ( () otherlv_1= 'StyleGlobal' otherlv_2= '{' ( (lv_styleclasses_3_0= ruleStyleClass ) )* otherlv_4= '}' )
            {
            // InternalT2A.g:339:2: ( () otherlv_1= 'StyleGlobal' otherlv_2= '{' ( (lv_styleclasses_3_0= ruleStyleClass ) )* otherlv_4= '}' )
            // InternalT2A.g:340:3: () otherlv_1= 'StyleGlobal' otherlv_2= '{' ( (lv_styleclasses_3_0= ruleStyleClass ) )* otherlv_4= '}'
            {
            // InternalT2A.g:340:3: ()
            // InternalT2A.g:341:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStyleGlobalAccess().getStyleGlobalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getStyleGlobalAccess().getStyleGlobalKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getStyleGlobalAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalT2A.g:355:3: ( (lv_styleclasses_3_0= ruleStyleClass ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalT2A.g:356:4: (lv_styleclasses_3_0= ruleStyleClass )
            	    {
            	    // InternalT2A.g:356:4: (lv_styleclasses_3_0= ruleStyleClass )
            	    // InternalT2A.g:357:5: lv_styleclasses_3_0= ruleStyleClass
            	    {

            	    					newCompositeNode(grammarAccess.getStyleGlobalAccess().getStyleclassesStyleClassParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_styleclasses_3_0=ruleStyleClass();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStyleGlobalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"styleclasses",
            	    						lv_styleclasses_3_0,
            	    						"uma.es.angular.t2a.T2A.StyleClass");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStyleGlobalAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleStyleGlobal"


    // $ANTLR start "entryRuleStyleClass"
    // InternalT2A.g:382:1: entryRuleStyleClass returns [EObject current=null] : iv_ruleStyleClass= ruleStyleClass EOF ;
    public final EObject entryRuleStyleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleClass = null;


        try {
            // InternalT2A.g:382:51: (iv_ruleStyleClass= ruleStyleClass EOF )
            // InternalT2A.g:383:2: iv_ruleStyleClass= ruleStyleClass EOF
            {
             newCompositeNode(grammarAccess.getStyleClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStyleClass=ruleStyleClass();

            state._fsp--;

             current =iv_ruleStyleClass; 
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
    // $ANTLR end "entryRuleStyleClass"


    // $ANTLR start "ruleStyleClass"
    // InternalT2A.g:389:1: ruleStyleClass returns [EObject current=null] : (otherlv_0= 'StyleClass' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_sattributes_3_0= ruleSAttributeAndValue ) ) otherlv_4= ';' )* (otherlv_5= 'after' otherlv_6= '{' ( ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';' )* otherlv_9= '}' )? (otherlv_10= 'active' otherlv_11= '{' ( ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';' )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleStyleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_sattributes_3_0 = null;

        EObject lv_sattributesAfter_7_0 = null;

        EObject lv_sattributesActive_12_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:395:2: ( (otherlv_0= 'StyleClass' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_sattributes_3_0= ruleSAttributeAndValue ) ) otherlv_4= ';' )* (otherlv_5= 'after' otherlv_6= '{' ( ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';' )* otherlv_9= '}' )? (otherlv_10= 'active' otherlv_11= '{' ( ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';' )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalT2A.g:396:2: (otherlv_0= 'StyleClass' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_sattributes_3_0= ruleSAttributeAndValue ) ) otherlv_4= ';' )* (otherlv_5= 'after' otherlv_6= '{' ( ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';' )* otherlv_9= '}' )? (otherlv_10= 'active' otherlv_11= '{' ( ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';' )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalT2A.g:396:2: (otherlv_0= 'StyleClass' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_sattributes_3_0= ruleSAttributeAndValue ) ) otherlv_4= ';' )* (otherlv_5= 'after' otherlv_6= '{' ( ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';' )* otherlv_9= '}' )? (otherlv_10= 'active' otherlv_11= '{' ( ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';' )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalT2A.g:397:3: otherlv_0= 'StyleClass' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_sattributes_3_0= ruleSAttributeAndValue ) ) otherlv_4= ';' )* (otherlv_5= 'after' otherlv_6= '{' ( ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';' )* otherlv_9= '}' )? (otherlv_10= 'active' otherlv_11= '{' ( ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';' )* otherlv_14= '}' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getStyleClassAccess().getStyleClassKeyword_0());
            		
            // InternalT2A.g:401:3: ( (lv_name_1_0= ruleName ) )
            // InternalT2A.g:402:4: (lv_name_1_0= ruleName )
            {
            // InternalT2A.g:402:4: (lv_name_1_0= ruleName )
            // InternalT2A.g:403:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getStyleClassAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStyleClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uma.es.angular.t2a.T2A.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getStyleClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalT2A.g:424:3: ( ( (lv_sattributes_3_0= ruleSAttributeAndValue ) ) otherlv_4= ';' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==EOF||(LA10_0>=RULE_ID && LA10_0<=RULE_STRING2)||LA10_0==13||(LA10_0>=26 && LA10_0<=32)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalT2A.g:425:4: ( (lv_sattributes_3_0= ruleSAttributeAndValue ) ) otherlv_4= ';'
            	    {
            	    // InternalT2A.g:425:4: ( (lv_sattributes_3_0= ruleSAttributeAndValue ) )
            	    // InternalT2A.g:426:5: (lv_sattributes_3_0= ruleSAttributeAndValue )
            	    {
            	    // InternalT2A.g:426:5: (lv_sattributes_3_0= ruleSAttributeAndValue )
            	    // InternalT2A.g:427:6: lv_sattributes_3_0= ruleSAttributeAndValue
            	    {

            	    						newCompositeNode(grammarAccess.getStyleClassAccess().getSattributesSAttributeAndValueParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_sattributes_3_0=ruleSAttributeAndValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStyleClassRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sattributes",
            	    							lv_sattributes_3_0,
            	    							"uma.es.angular.t2a.T2A.SAttributeAndValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,20,FOLLOW_14); 

            	    				newLeafNode(otherlv_4, grammarAccess.getStyleClassAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalT2A.g:449:3: (otherlv_5= 'after' otherlv_6= '{' ( ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';' )* otherlv_9= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalT2A.g:450:4: otherlv_5= 'after' otherlv_6= '{' ( ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';' )* otherlv_9= '}'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getStyleClassAccess().getAfterKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,13,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getStyleClassAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalT2A.g:458:4: ( ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';' )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==EOF||(LA11_0>=RULE_ID && LA11_0<=RULE_STRING2)||LA11_0==13||(LA11_0>=26 && LA11_0<=32)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalT2A.g:459:5: ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';'
                    	    {
                    	    // InternalT2A.g:459:5: ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) )
                    	    // InternalT2A.g:460:6: (lv_sattributesAfter_7_0= ruleSAttributeAndValue )
                    	    {
                    	    // InternalT2A.g:460:6: (lv_sattributesAfter_7_0= ruleSAttributeAndValue )
                    	    // InternalT2A.g:461:7: lv_sattributesAfter_7_0= ruleSAttributeAndValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getStyleClassAccess().getSattributesAfterSAttributeAndValueParserRuleCall_4_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_sattributesAfter_7_0=ruleSAttributeAndValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStyleClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sattributesAfter",
                    	    								lv_sattributesAfter_7_0,
                    	    								"uma.es.angular.t2a.T2A.SAttributeAndValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_8=(Token)match(input,20,FOLLOW_16); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getStyleClassAccess().getSemicolonKeyword_4_2_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getStyleClassAccess().getRightCurlyBracketKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalT2A.g:488:3: (otherlv_10= 'active' otherlv_11= '{' ( ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';' )* otherlv_14= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalT2A.g:489:4: otherlv_10= 'active' otherlv_11= '{' ( ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';' )* otherlv_14= '}'
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getStyleClassAccess().getActiveKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,13,FOLLOW_16); 

                    				newLeafNode(otherlv_11, grammarAccess.getStyleClassAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalT2A.g:497:4: ( ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';' )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==EOF||(LA13_0>=RULE_ID && LA13_0<=RULE_STRING2)||LA13_0==13||(LA13_0>=26 && LA13_0<=32)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalT2A.g:498:5: ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';'
                    	    {
                    	    // InternalT2A.g:498:5: ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) )
                    	    // InternalT2A.g:499:6: (lv_sattributesActive_12_0= ruleSAttributeAndValue )
                    	    {
                    	    // InternalT2A.g:499:6: (lv_sattributesActive_12_0= ruleSAttributeAndValue )
                    	    // InternalT2A.g:500:7: lv_sattributesActive_12_0= ruleSAttributeAndValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getStyleClassAccess().getSattributesActiveSAttributeAndValueParserRuleCall_5_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_sattributesActive_12_0=ruleSAttributeAndValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStyleClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sattributesActive",
                    	    								lv_sattributesActive_12_0,
                    	    								"uma.es.angular.t2a.T2A.SAttributeAndValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_13=(Token)match(input,20,FOLLOW_16); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getStyleClassAccess().getSemicolonKeyword_5_2_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_14, grammarAccess.getStyleClassAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getStyleClassAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleStyleClass"


    // $ANTLR start "entryRuleSAttributeAndValue"
    // InternalT2A.g:535:1: entryRuleSAttributeAndValue returns [EObject current=null] : iv_ruleSAttributeAndValue= ruleSAttributeAndValue EOF ;
    public final EObject entryRuleSAttributeAndValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAttributeAndValue = null;


        try {
            // InternalT2A.g:535:59: (iv_ruleSAttributeAndValue= ruleSAttributeAndValue EOF )
            // InternalT2A.g:536:2: iv_ruleSAttributeAndValue= ruleSAttributeAndValue EOF
            {
             newCompositeNode(grammarAccess.getSAttributeAndValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSAttributeAndValue=ruleSAttributeAndValue();

            state._fsp--;

             current =iv_ruleSAttributeAndValue; 
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
    // $ANTLR end "entryRuleSAttributeAndValue"


    // $ANTLR start "ruleSAttributeAndValue"
    // InternalT2A.g:542:1: ruleSAttributeAndValue returns [EObject current=null] : ( ( (lv_stname_0_0= ruleName ) ) ( (lv_value_1_0= RULE_STRING2 ) ) ) ;
    public final EObject ruleSAttributeAndValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        AntlrDatatypeRuleToken lv_stname_0_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:548:2: ( ( ( (lv_stname_0_0= ruleName ) ) ( (lv_value_1_0= RULE_STRING2 ) ) ) )
            // InternalT2A.g:549:2: ( ( (lv_stname_0_0= ruleName ) ) ( (lv_value_1_0= RULE_STRING2 ) ) )
            {
            // InternalT2A.g:549:2: ( ( (lv_stname_0_0= ruleName ) ) ( (lv_value_1_0= RULE_STRING2 ) ) )
            // InternalT2A.g:550:3: ( (lv_stname_0_0= ruleName ) ) ( (lv_value_1_0= RULE_STRING2 ) )
            {
            // InternalT2A.g:550:3: ( (lv_stname_0_0= ruleName ) )
            // InternalT2A.g:551:4: (lv_stname_0_0= ruleName )
            {
            // InternalT2A.g:551:4: (lv_stname_0_0= ruleName )
            // InternalT2A.g:552:5: lv_stname_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getSAttributeAndValueAccess().getStnameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_stname_0_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSAttributeAndValueRule());
            					}
            					set(
            						current,
            						"stname",
            						lv_stname_0_0,
            						"uma.es.angular.t2a.T2A.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalT2A.g:569:3: ( (lv_value_1_0= RULE_STRING2 ) )
            // InternalT2A.g:570:4: (lv_value_1_0= RULE_STRING2 )
            {
            // InternalT2A.g:570:4: (lv_value_1_0= RULE_STRING2 )
            // InternalT2A.g:571:5: lv_value_1_0= RULE_STRING2
            {
            lv_value_1_0=(Token)match(input,RULE_STRING2,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getSAttributeAndValueAccess().getValueSTRING2TerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSAttributeAndValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"uma.es.angular.t2a.T2A.STRING2");
            				

            }


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
    // $ANTLR end "ruleSAttributeAndValue"


    // $ANTLR start "entryRuleDOM"
    // InternalT2A.g:591:1: entryRuleDOM returns [EObject current=null] : iv_ruleDOM= ruleDOM EOF ;
    public final EObject entryRuleDOM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOM = null;


        try {
            // InternalT2A.g:591:44: (iv_ruleDOM= ruleDOM EOF )
            // InternalT2A.g:592:2: iv_ruleDOM= ruleDOM EOF
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
    // InternalT2A.g:598:1: ruleDOM returns [EObject current=null] : (otherlv_0= 'Dom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleDOM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_features_7_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:604:2: ( (otherlv_0= 'Dom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' )? ) )
            // InternalT2A.g:605:2: (otherlv_0= 'Dom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' )? )
            {
            // InternalT2A.g:605:2: (otherlv_0= 'Dom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' )? )
            // InternalT2A.g:606:3: otherlv_0= 'Dom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDOMAccess().getDomKeyword_0());
            		
            // InternalT2A.g:610:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalT2A.g:611:4: (lv_name_1_0= RULE_ID )
            {
            // InternalT2A.g:611:4: (lv_name_1_0= RULE_ID )
            // InternalT2A.g:612:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            // InternalT2A.g:628:3: (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==13) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalT2A.g:629:4: otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getDOMAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalT2A.g:633:4: (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==14) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalT2A.g:634:5: otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}'
                            {
                            otherlv_3=(Token)match(input,14,FOLLOW_6); 

                            					newLeafNode(otherlv_3, grammarAccess.getDOMAccess().getSclassKeyword_2_1_0());
                            				
                            otherlv_4=(Token)match(input,13,FOLLOW_8); 

                            					newLeafNode(otherlv_4, grammarAccess.getDOMAccess().getLeftCurlyBracketKeyword_2_1_1());
                            				
                            // InternalT2A.g:642:5: ( (otherlv_5= RULE_ID ) )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==RULE_ID) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // InternalT2A.g:643:6: (otherlv_5= RULE_ID )
                            	    {
                            	    // InternalT2A.g:643:6: (otherlv_5= RULE_ID )
                            	    // InternalT2A.g:644:7: otherlv_5= RULE_ID
                            	    {

                            	    							if (current==null) {
                            	    								current = createModelElement(grammarAccess.getDOMRule());
                            	    							}
                            	    						
                            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_8); 

                            	    							newLeafNode(otherlv_5, grammarAccess.getDOMAccess().getSclassesStyleClassCrossReference_2_1_2_0());
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop15;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,15,FOLLOW_22); 

                            					newLeafNode(otherlv_6, grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_1_3());
                            				

                            }
                            break;

                    }

                    // InternalT2A.g:660:4: ( (lv_features_7_0= ruleFeature ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_ID||LA17_0==RULE_STRING||LA17_0==25) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalT2A.g:661:5: (lv_features_7_0= ruleFeature )
                    	    {
                    	    // InternalT2A.g:661:5: (lv_features_7_0= ruleFeature )
                    	    // InternalT2A.g:662:6: lv_features_7_0= ruleFeature
                    	    {

                    	    						newCompositeNode(grammarAccess.getDOMAccess().getFeaturesFeatureParserRuleCall_2_2_0());
                    	    					
                    	    pushFollow(FOLLOW_22);
                    	    lv_features_7_0=ruleFeature();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDOMRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"features",
                    	    							lv_features_7_0,
                    	    							"uma.es.angular.t2a.T2A.Feature");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_3());
                    			

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
    // InternalT2A.g:688:1: entryRuleComp returns [EObject current=null] : iv_ruleComp= ruleComp EOF ;
    public final EObject entryRuleComp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComp = null;


        try {
            // InternalT2A.g:688:45: (iv_ruleComp= ruleComp EOF )
            // InternalT2A.g:689:2: iv_ruleComp= ruleComp EOF
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
    // InternalT2A.g:695:1: ruleComp returns [EObject current=null] : (otherlv_0= 'Comp' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleComp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_features_7_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:701:2: ( (otherlv_0= 'Comp' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' )? ) )
            // InternalT2A.g:702:2: (otherlv_0= 'Comp' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' )? )
            {
            // InternalT2A.g:702:2: (otherlv_0= 'Comp' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' )? )
            // InternalT2A.g:703:3: otherlv_0= 'Comp' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCompAccess().getCompKeyword_0());
            		
            // InternalT2A.g:707:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalT2A.g:708:4: (lv_name_1_0= RULE_ID )
            {
            // InternalT2A.g:708:4: (lv_name_1_0= RULE_ID )
            // InternalT2A.g:709:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            // InternalT2A.g:725:3: (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==13) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalT2A.g:726:4: otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getCompAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalT2A.g:730:4: (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==14) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalT2A.g:731:5: otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}'
                            {
                            otherlv_3=(Token)match(input,14,FOLLOW_6); 

                            					newLeafNode(otherlv_3, grammarAccess.getCompAccess().getSclassKeyword_2_1_0());
                            				
                            otherlv_4=(Token)match(input,13,FOLLOW_8); 

                            					newLeafNode(otherlv_4, grammarAccess.getCompAccess().getLeftCurlyBracketKeyword_2_1_1());
                            				
                            // InternalT2A.g:739:5: ( (otherlv_5= RULE_ID ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==RULE_ID) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // InternalT2A.g:740:6: (otherlv_5= RULE_ID )
                            	    {
                            	    // InternalT2A.g:740:6: (otherlv_5= RULE_ID )
                            	    // InternalT2A.g:741:7: otherlv_5= RULE_ID
                            	    {

                            	    							if (current==null) {
                            	    								current = createModelElement(grammarAccess.getCompRule());
                            	    							}
                            	    						
                            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_8); 

                            	    							newLeafNode(otherlv_5, grammarAccess.getCompAccess().getHostclassesStyleClassCrossReference_2_1_2_0());
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop19;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,15,FOLLOW_22); 

                            					newLeafNode(otherlv_6, grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_1_3());
                            				

                            }
                            break;

                    }

                    // InternalT2A.g:757:4: ( (lv_features_7_0= ruleFeature ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_ID||LA21_0==RULE_STRING||LA21_0==25) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalT2A.g:758:5: (lv_features_7_0= ruleFeature )
                    	    {
                    	    // InternalT2A.g:758:5: (lv_features_7_0= ruleFeature )
                    	    // InternalT2A.g:759:6: lv_features_7_0= ruleFeature
                    	    {

                    	    						newCompositeNode(grammarAccess.getCompAccess().getFeaturesFeatureParserRuleCall_2_2_0());
                    	    					
                    	    pushFollow(FOLLOW_22);
                    	    lv_features_7_0=ruleFeature();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCompRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"features",
                    	    							lv_features_7_0,
                    	    							"uma.es.angular.t2a.T2A.Feature");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_3());
                    			

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
    // InternalT2A.g:785:1: entryRuleInstanciaEDOM returns [EObject current=null] : iv_ruleInstanciaEDOM= ruleInstanciaEDOM EOF ;
    public final EObject entryRuleInstanciaEDOM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanciaEDOM = null;


        try {
            // InternalT2A.g:785:54: (iv_ruleInstanciaEDOM= ruleInstanciaEDOM EOF )
            // InternalT2A.g:786:2: iv_ruleInstanciaEDOM= ruleInstanciaEDOM EOF
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
    // InternalT2A.g:792:1: ruleInstanciaEDOM returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_insfeatures_6_0= ruleInstanceEDOMFeature ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleInstanciaEDOM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_insfeatures_6_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:798:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_insfeatures_6_0= ruleInstanceEDOMFeature ) )* otherlv_7= '}' )? ) )
            // InternalT2A.g:799:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_insfeatures_6_0= ruleInstanceEDOMFeature ) )* otherlv_7= '}' )? )
            {
            // InternalT2A.g:799:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_insfeatures_6_0= ruleInstanceEDOMFeature ) )* otherlv_7= '}' )? )
            // InternalT2A.g:800:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_insfeatures_6_0= ruleInstanceEDOMFeature ) )* otherlv_7= '}' )?
            {
            // InternalT2A.g:800:3: ( (otherlv_0= RULE_ID ) )
            // InternalT2A.g:801:4: (otherlv_0= RULE_ID )
            {
            // InternalT2A.g:801:4: (otherlv_0= RULE_ID )
            // InternalT2A.g:802:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanciaEDOMRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_0, grammarAccess.getInstanciaEDOMAccess().getInstanciaEDOMCrossReference_0_0());
            				

            }


            }

            // InternalT2A.g:813:3: (otherlv_1= '{' (otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_insfeatures_6_0= ruleInstanceEDOMFeature ) )* otherlv_7= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==13) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalT2A.g:814:4: otherlv_1= '{' (otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_insfeatures_6_0= ruleInstanceEDOMFeature ) )* otherlv_7= '}'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getInstanciaEDOMAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalT2A.g:818:4: (otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==14) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalT2A.g:819:5: otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}'
                            {
                            otherlv_2=(Token)match(input,14,FOLLOW_6); 

                            					newLeafNode(otherlv_2, grammarAccess.getInstanciaEDOMAccess().getSclassKeyword_1_1_0());
                            				
                            otherlv_3=(Token)match(input,13,FOLLOW_8); 

                            					newLeafNode(otherlv_3, grammarAccess.getInstanciaEDOMAccess().getLeftCurlyBracketKeyword_1_1_1());
                            				
                            // InternalT2A.g:827:5: ( (otherlv_4= RULE_ID ) )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==RULE_ID) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // InternalT2A.g:828:6: (otherlv_4= RULE_ID )
                            	    {
                            	    // InternalT2A.g:828:6: (otherlv_4= RULE_ID )
                            	    // InternalT2A.g:829:7: otherlv_4= RULE_ID
                            	    {

                            	    							if (current==null) {
                            	    								current = createModelElement(grammarAccess.getInstanciaEDOMRule());
                            	    							}
                            	    						
                            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_8); 

                            	    							newLeafNode(otherlv_4, grammarAccess.getInstanciaEDOMAccess().getSclassesStyleClassCrossReference_1_1_2_0());
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop23;
                                }
                            } while (true);

                            otherlv_5=(Token)match(input,15,FOLLOW_11); 

                            					newLeafNode(otherlv_5, grammarAccess.getInstanciaEDOMAccess().getRightCurlyBracketKeyword_1_1_3());
                            				

                            }
                            break;

                    }

                    // InternalT2A.g:845:4: ( (lv_insfeatures_6_0= ruleInstanceEDOMFeature ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_ID||LA25_0==RULE_STRING) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalT2A.g:846:5: (lv_insfeatures_6_0= ruleInstanceEDOMFeature )
                    	    {
                    	    // InternalT2A.g:846:5: (lv_insfeatures_6_0= ruleInstanceEDOMFeature )
                    	    // InternalT2A.g:847:6: lv_insfeatures_6_0= ruleInstanceEDOMFeature
                    	    {

                    	    						newCompositeNode(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesInstanceEDOMFeatureParserRuleCall_1_2_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_insfeatures_6_0=ruleInstanceEDOMFeature();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getInstanciaEDOMRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"insfeatures",
                    	    							lv_insfeatures_6_0,
                    	    							"uma.es.angular.t2a.T2A.InstanceEDOMFeature");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getInstanciaEDOMAccess().getRightCurlyBracketKeyword_1_3());
                    			

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
    // InternalT2A.g:873:1: entryRuleInstanceEDOMFeature returns [EObject current=null] : iv_ruleInstanceEDOMFeature= ruleInstanceEDOMFeature EOF ;
    public final EObject entryRuleInstanceEDOMFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceEDOMFeature = null;


        try {
            // InternalT2A.g:873:60: (iv_ruleInstanceEDOMFeature= ruleInstanceEDOMFeature EOF )
            // InternalT2A.g:874:2: iv_ruleInstanceEDOMFeature= ruleInstanceEDOMFeature EOF
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
    // InternalT2A.g:880:1: ruleInstanceEDOMFeature returns [EObject current=null] : ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInstanceEDOMFeature() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;
        EObject lv_instanciaEDOM_0_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:886:2: ( ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // InternalT2A.g:887:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // InternalT2A.g:887:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_STRING) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalT2A.g:888:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    {
                    // InternalT2A.g:888:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    // InternalT2A.g:889:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    {
                    // InternalT2A.g:889:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    // InternalT2A.g:890:5: lv_instanciaEDOM_0_0= ruleInstanciaEDOM
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
                    // InternalT2A.g:908:3: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // InternalT2A.g:908:3: ( (lv_string_1_0= RULE_STRING ) )
                    // InternalT2A.g:909:4: (lv_string_1_0= RULE_STRING )
                    {
                    // InternalT2A.g:909:4: (lv_string_1_0= RULE_STRING )
                    // InternalT2A.g:910:5: lv_string_1_0= RULE_STRING
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
    // InternalT2A.g:930:1: entryRulePageFeature returns [EObject current=null] : iv_rulePageFeature= rulePageFeature EOF ;
    public final EObject entryRulePageFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageFeature = null;


        try {
            // InternalT2A.g:930:52: (iv_rulePageFeature= rulePageFeature EOF )
            // InternalT2A.g:931:2: iv_rulePageFeature= rulePageFeature EOF
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
    // InternalT2A.g:937:1: rulePageFeature returns [EObject current=null] : ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject rulePageFeature() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;
        EObject lv_instanciaEDOM_0_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:943:2: ( ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // InternalT2A.g:944:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // InternalT2A.g:944:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_STRING) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalT2A.g:945:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    {
                    // InternalT2A.g:945:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    // InternalT2A.g:946:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    {
                    // InternalT2A.g:946:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    // InternalT2A.g:947:5: lv_instanciaEDOM_0_0= ruleInstanciaEDOM
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
                    // InternalT2A.g:965:3: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // InternalT2A.g:965:3: ( (lv_string_1_0= RULE_STRING ) )
                    // InternalT2A.g:966:4: (lv_string_1_0= RULE_STRING )
                    {
                    // InternalT2A.g:966:4: (lv_string_1_0= RULE_STRING )
                    // InternalT2A.g:967:5: lv_string_1_0= RULE_STRING
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
    // InternalT2A.g:987:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalT2A.g:987:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalT2A.g:988:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalT2A.g:994:1: ruleFeature returns [EObject current=null] : ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_AllowSlot_1_0= 'AllowSlot' ) ) | ( (lv_string_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_AllowSlot_1_0=null;
        Token lv_string_2_0=null;
        EObject lv_instanciaEDOM_0_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:1000:2: ( ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_AllowSlot_1_0= 'AllowSlot' ) ) | ( (lv_string_2_0= RULE_STRING ) ) ) )
            // InternalT2A.g:1001:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_AllowSlot_1_0= 'AllowSlot' ) ) | ( (lv_string_2_0= RULE_STRING ) ) )
            {
            // InternalT2A.g:1001:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_AllowSlot_1_0= 'AllowSlot' ) ) | ( (lv_string_2_0= RULE_STRING ) ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt29=1;
                }
                break;
            case 25:
                {
                alt29=2;
                }
                break;
            case RULE_STRING:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalT2A.g:1002:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    {
                    // InternalT2A.g:1002:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    // InternalT2A.g:1003:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    {
                    // InternalT2A.g:1003:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    // InternalT2A.g:1004:5: lv_instanciaEDOM_0_0= ruleInstanciaEDOM
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
                    // InternalT2A.g:1022:3: ( (lv_AllowSlot_1_0= 'AllowSlot' ) )
                    {
                    // InternalT2A.g:1022:3: ( (lv_AllowSlot_1_0= 'AllowSlot' ) )
                    // InternalT2A.g:1023:4: (lv_AllowSlot_1_0= 'AllowSlot' )
                    {
                    // InternalT2A.g:1023:4: (lv_AllowSlot_1_0= 'AllowSlot' )
                    // InternalT2A.g:1024:5: lv_AllowSlot_1_0= 'AllowSlot'
                    {
                    lv_AllowSlot_1_0=(Token)match(input,25,FOLLOW_2); 

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
                    // InternalT2A.g:1037:3: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // InternalT2A.g:1037:3: ( (lv_string_2_0= RULE_STRING ) )
                    // InternalT2A.g:1038:4: (lv_string_2_0= RULE_STRING )
                    {
                    // InternalT2A.g:1038:4: (lv_string_2_0= RULE_STRING )
                    // InternalT2A.g:1039:5: lv_string_2_0= RULE_STRING
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


    // $ANTLR start "entryRuleName"
    // InternalT2A.g:1059:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalT2A.g:1059:44: (iv_ruleName= ruleName EOF )
            // InternalT2A.g:1060:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName.getText(); 
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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalT2A.g:1066:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '_' | kw= '#' | kw= '-' | kw= '*' | kw= '.' | kw= '::' | kw= '>' | this_ID_7= RULE_ID )* ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_7=null;


        	enterRule();

        try {
            // InternalT2A.g:1072:2: ( (kw= '_' | kw= '#' | kw= '-' | kw= '*' | kw= '.' | kw= '::' | kw= '>' | this_ID_7= RULE_ID )* )
            // InternalT2A.g:1073:2: (kw= '_' | kw= '#' | kw= '-' | kw= '*' | kw= '.' | kw= '::' | kw= '>' | this_ID_7= RULE_ID )*
            {
            // InternalT2A.g:1073:2: (kw= '_' | kw= '#' | kw= '-' | kw= '*' | kw= '.' | kw= '::' | kw= '>' | this_ID_7= RULE_ID )*
            loop30:
            do {
                int alt30=9;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    alt30=1;
                    }
                    break;
                case 27:
                    {
                    alt30=2;
                    }
                    break;
                case 28:
                    {
                    alt30=3;
                    }
                    break;
                case 29:
                    {
                    alt30=4;
                    }
                    break;
                case 30:
                    {
                    alt30=5;
                    }
                    break;
                case 31:
                    {
                    alt30=6;
                    }
                    break;
                case 32:
                    {
                    alt30=7;
                    }
                    break;
                case RULE_ID:
                    {
                    alt30=8;
                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // InternalT2A.g:1074:3: kw= '_'
            	    {
            	    kw=(Token)match(input,26,FOLLOW_24); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getNameAccess().get_Keyword_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalT2A.g:1080:3: kw= '#'
            	    {
            	    kw=(Token)match(input,27,FOLLOW_24); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getNameAccess().getNumberSignKeyword_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalT2A.g:1086:3: kw= '-'
            	    {
            	    kw=(Token)match(input,28,FOLLOW_24); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getNameAccess().getHyphenMinusKeyword_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalT2A.g:1092:3: kw= '*'
            	    {
            	    kw=(Token)match(input,29,FOLLOW_24); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getNameAccess().getAsteriskKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalT2A.g:1098:3: kw= '.'
            	    {
            	    kw=(Token)match(input,30,FOLLOW_24); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getNameAccess().getFullStopKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalT2A.g:1104:3: kw= '::'
            	    {
            	    kw=(Token)match(input,31,FOLLOW_24); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getNameAccess().getColonColonKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalT2A.g:1110:3: kw= '>'
            	    {
            	    kw=(Token)match(input,32,FOLLOW_24); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getNameAccess().getGreaterThanSignKeyword_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalT2A.g:1116:3: this_ID_7= RULE_ID
            	    {
            	    this_ID_7=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    			current.merge(this_ID_7);
            	    		

            	    			newLeafNode(this_ID_7, grammarAccess.getNameAccess().getIDTerminalRuleCall_7());
            	    		

            	    }
            	    break;

            	default :
            	    break loop30;
                }
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
    // $ANTLR end "ruleName"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001881000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001881002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000003C050L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000038050L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000028050L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008050L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001889000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000001FC002010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000001FC608030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000001FC008030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000200C050L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002008050L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000000C050L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000001FC000012L});

}