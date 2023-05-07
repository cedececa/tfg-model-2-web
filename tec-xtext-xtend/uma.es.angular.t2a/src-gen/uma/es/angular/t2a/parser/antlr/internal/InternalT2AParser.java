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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING2", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Page'", "'{'", "'sclass'", "'}'", "'home'", "'showInNav'", "'StyleClass'", "';'", "'after'", "'active'", "'Dom'", "'Comp'", "'AllowSlot'", "'_'", "'#'", "'-'", "'*'", "'.'", "'::'", "'>'"
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

                if ( (LA1_0==12||LA1_0==18||(LA1_0>=22 && LA1_0<=23)) ) {
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

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==18||(LA2_0>=22 && LA2_0<=23)) ) {
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
    // InternalT2A.g:143:1: rulePage returns [EObject current=null] : (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_home_7_0= 'home' ) )? ( (lv_showInNav_8_0= 'showInNav' ) )? ( (lv_pageFeatures_9_0= rulePageFeature ) )* otherlv_10= '}' ) ;
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
            // InternalT2A.g:149:2: ( (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_home_7_0= 'home' ) )? ( (lv_showInNav_8_0= 'showInNav' ) )? ( (lv_pageFeatures_9_0= rulePageFeature ) )* otherlv_10= '}' ) )
            // InternalT2A.g:150:2: (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_home_7_0= 'home' ) )? ( (lv_showInNav_8_0= 'showInNav' ) )? ( (lv_pageFeatures_9_0= rulePageFeature ) )* otherlv_10= '}' )
            {
            // InternalT2A.g:150:2: (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_home_7_0= 'home' ) )? ( (lv_showInNav_8_0= 'showInNav' ) )? ( (lv_pageFeatures_9_0= rulePageFeature ) )* otherlv_10= '}' )
            // InternalT2A.g:151:3: otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_home_7_0= 'home' ) )? ( (lv_showInNav_8_0= 'showInNav' ) )? ( (lv_pageFeatures_9_0= rulePageFeature ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalT2A.g:177:3: (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalT2A.g:178:4: otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getPageAccess().getSclassKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalT2A.g:186:4: ( (otherlv_5= RULE_ID ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalT2A.g:187:5: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalT2A.g:187:5: (otherlv_5= RULE_ID )
                    	    // InternalT2A.g:188:6: otherlv_5= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getPageRule());
                    	    						}
                    	    					
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_7); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getPageAccess().getHostclassesStyleClassCrossReference_3_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalT2A.g:204:3: ( (lv_home_7_0= 'home' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalT2A.g:205:4: (lv_home_7_0= 'home' )
                    {
                    // InternalT2A.g:205:4: (lv_home_7_0= 'home' )
                    // InternalT2A.g:206:5: lv_home_7_0= 'home'
                    {
                    lv_home_7_0=(Token)match(input,16,FOLLOW_9); 

                    					newLeafNode(lv_home_7_0, grammarAccess.getPageAccess().getHomeHomeKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPageRule());
                    					}
                    					setWithLastConsumed(current, "home", lv_home_7_0 != null, "home");
                    				

                    }


                    }
                    break;

            }

            // InternalT2A.g:218:3: ( (lv_showInNav_8_0= 'showInNav' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalT2A.g:219:4: (lv_showInNav_8_0= 'showInNav' )
                    {
                    // InternalT2A.g:219:4: (lv_showInNav_8_0= 'showInNav' )
                    // InternalT2A.g:220:5: lv_showInNav_8_0= 'showInNav'
                    {
                    lv_showInNav_8_0=(Token)match(input,17,FOLLOW_10); 

                    					newLeafNode(lv_showInNav_8_0, grammarAccess.getPageAccess().getShowInNavShowInNavKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPageRule());
                    					}
                    					setWithLastConsumed(current, "showInNav", lv_showInNav_8_0 != null, "showInNav");
                    				

                    }


                    }
                    break;

            }

            // InternalT2A.g:232:3: ( (lv_pageFeatures_9_0= rulePageFeature ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==RULE_STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalT2A.g:233:4: (lv_pageFeatures_9_0= rulePageFeature )
            	    {
            	    // InternalT2A.g:233:4: (lv_pageFeatures_9_0= rulePageFeature )
            	    // InternalT2A.g:234:5: lv_pageFeatures_9_0= rulePageFeature
            	    {

            	    					newCompositeNode(grammarAccess.getPageAccess().getPageFeaturesPageFeatureParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_10);
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
    // InternalT2A.g:259:1: entryRuleEDOM returns [EObject current=null] : iv_ruleEDOM= ruleEDOM EOF ;
    public final EObject entryRuleEDOM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDOM = null;


        try {
            // InternalT2A.g:259:45: (iv_ruleEDOM= ruleEDOM EOF )
            // InternalT2A.g:260:2: iv_ruleEDOM= ruleEDOM EOF
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
    // InternalT2A.g:266:1: ruleEDOM returns [EObject current=null] : (this_DOM_0= ruleDOM | this_Comp_1= ruleComp | this_StyleClass_2= ruleStyleClass ) ;
    public final EObject ruleEDOM() throws RecognitionException {
        EObject current = null;

        EObject this_DOM_0 = null;

        EObject this_Comp_1 = null;

        EObject this_StyleClass_2 = null;



        	enterRule();

        try {
            // InternalT2A.g:272:2: ( (this_DOM_0= ruleDOM | this_Comp_1= ruleComp | this_StyleClass_2= ruleStyleClass ) )
            // InternalT2A.g:273:2: (this_DOM_0= ruleDOM | this_Comp_1= ruleComp | this_StyleClass_2= ruleStyleClass )
            {
            // InternalT2A.g:273:2: (this_DOM_0= ruleDOM | this_Comp_1= ruleComp | this_StyleClass_2= ruleStyleClass )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 18:
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
                    // InternalT2A.g:274:3: this_DOM_0= ruleDOM
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
                    // InternalT2A.g:283:3: this_Comp_1= ruleComp
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
                    // InternalT2A.g:292:3: this_StyleClass_2= ruleStyleClass
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


    // $ANTLR start "entryRuleStyleClass"
    // InternalT2A.g:304:1: entryRuleStyleClass returns [EObject current=null] : iv_ruleStyleClass= ruleStyleClass EOF ;
    public final EObject entryRuleStyleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleClass = null;


        try {
            // InternalT2A.g:304:51: (iv_ruleStyleClass= ruleStyleClass EOF )
            // InternalT2A.g:305:2: iv_ruleStyleClass= ruleStyleClass EOF
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
    // InternalT2A.g:311:1: ruleStyleClass returns [EObject current=null] : (otherlv_0= 'StyleClass' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_sattributes_3_0= ruleSAttributeAndValue ) ) otherlv_4= ';' )* (otherlv_5= 'after' otherlv_6= '{' ( ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';' )* otherlv_9= '}' )? (otherlv_10= 'active' otherlv_11= '{' ( ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';' )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // InternalT2A.g:317:2: ( (otherlv_0= 'StyleClass' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_sattributes_3_0= ruleSAttributeAndValue ) ) otherlv_4= ';' )* (otherlv_5= 'after' otherlv_6= '{' ( ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';' )* otherlv_9= '}' )? (otherlv_10= 'active' otherlv_11= '{' ( ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';' )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalT2A.g:318:2: (otherlv_0= 'StyleClass' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_sattributes_3_0= ruleSAttributeAndValue ) ) otherlv_4= ';' )* (otherlv_5= 'after' otherlv_6= '{' ( ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';' )* otherlv_9= '}' )? (otherlv_10= 'active' otherlv_11= '{' ( ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';' )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalT2A.g:318:2: (otherlv_0= 'StyleClass' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_sattributes_3_0= ruleSAttributeAndValue ) ) otherlv_4= ';' )* (otherlv_5= 'after' otherlv_6= '{' ( ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';' )* otherlv_9= '}' )? (otherlv_10= 'active' otherlv_11= '{' ( ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';' )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalT2A.g:319:3: otherlv_0= 'StyleClass' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_sattributes_3_0= ruleSAttributeAndValue ) ) otherlv_4= ';' )* (otherlv_5= 'after' otherlv_6= '{' ( ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';' )* otherlv_9= '}' )? (otherlv_10= 'active' otherlv_11= '{' ( ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';' )* otherlv_14= '}' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getStyleClassAccess().getStyleClassKeyword_0());
            		
            // InternalT2A.g:323:3: ( (lv_name_1_0= ruleName ) )
            // InternalT2A.g:324:4: (lv_name_1_0= ruleName )
            {
            // InternalT2A.g:324:4: (lv_name_1_0= ruleName )
            // InternalT2A.g:325:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getStyleClassAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_2=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getStyleClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalT2A.g:346:3: ( ( (lv_sattributes_3_0= ruleSAttributeAndValue ) ) otherlv_4= ';' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==EOF||(LA9_0>=RULE_ID && LA9_0<=RULE_STRING2)||LA9_0==13||(LA9_0>=25 && LA9_0<=31)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalT2A.g:347:4: ( (lv_sattributes_3_0= ruleSAttributeAndValue ) ) otherlv_4= ';'
            	    {
            	    // InternalT2A.g:347:4: ( (lv_sattributes_3_0= ruleSAttributeAndValue ) )
            	    // InternalT2A.g:348:5: (lv_sattributes_3_0= ruleSAttributeAndValue )
            	    {
            	    // InternalT2A.g:348:5: (lv_sattributes_3_0= ruleSAttributeAndValue )
            	    // InternalT2A.g:349:6: lv_sattributes_3_0= ruleSAttributeAndValue
            	    {

            	    						newCompositeNode(grammarAccess.getStyleClassAccess().getSattributesSAttributeAndValueParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_13);
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

            	    otherlv_4=(Token)match(input,19,FOLLOW_12); 

            	    				newLeafNode(otherlv_4, grammarAccess.getStyleClassAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalT2A.g:371:3: (otherlv_5= 'after' otherlv_6= '{' ( ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';' )* otherlv_9= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalT2A.g:372:4: otherlv_5= 'after' otherlv_6= '{' ( ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';' )* otherlv_9= '}'
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getStyleClassAccess().getAfterKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,13,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getStyleClassAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalT2A.g:380:4: ( ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';' )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==EOF||(LA10_0>=RULE_ID && LA10_0<=RULE_STRING2)||LA10_0==13||(LA10_0>=25 && LA10_0<=31)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalT2A.g:381:5: ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';'
                    	    {
                    	    // InternalT2A.g:381:5: ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) )
                    	    // InternalT2A.g:382:6: (lv_sattributesAfter_7_0= ruleSAttributeAndValue )
                    	    {
                    	    // InternalT2A.g:382:6: (lv_sattributesAfter_7_0= ruleSAttributeAndValue )
                    	    // InternalT2A.g:383:7: lv_sattributesAfter_7_0= ruleSAttributeAndValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getStyleClassAccess().getSattributesAfterSAttributeAndValueParserRuleCall_4_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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

                    	    otherlv_8=(Token)match(input,19,FOLLOW_14); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getStyleClassAccess().getSemicolonKeyword_4_2_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getStyleClassAccess().getRightCurlyBracketKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalT2A.g:410:3: (otherlv_10= 'active' otherlv_11= '{' ( ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';' )* otherlv_14= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalT2A.g:411:4: otherlv_10= 'active' otherlv_11= '{' ( ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';' )* otherlv_14= '}'
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getStyleClassAccess().getActiveKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,13,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getStyleClassAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalT2A.g:419:4: ( ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';' )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==EOF||(LA12_0>=RULE_ID && LA12_0<=RULE_STRING2)||LA12_0==13||(LA12_0>=25 && LA12_0<=31)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalT2A.g:420:5: ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';'
                    	    {
                    	    // InternalT2A.g:420:5: ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) )
                    	    // InternalT2A.g:421:6: (lv_sattributesActive_12_0= ruleSAttributeAndValue )
                    	    {
                    	    // InternalT2A.g:421:6: (lv_sattributesActive_12_0= ruleSAttributeAndValue )
                    	    // InternalT2A.g:422:7: lv_sattributesActive_12_0= ruleSAttributeAndValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getStyleClassAccess().getSattributesActiveSAttributeAndValueParserRuleCall_5_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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

                    	    otherlv_13=(Token)match(input,19,FOLLOW_14); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getStyleClassAccess().getSemicolonKeyword_5_2_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_16); 

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
    // InternalT2A.g:457:1: entryRuleSAttributeAndValue returns [EObject current=null] : iv_ruleSAttributeAndValue= ruleSAttributeAndValue EOF ;
    public final EObject entryRuleSAttributeAndValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAttributeAndValue = null;


        try {
            // InternalT2A.g:457:59: (iv_ruleSAttributeAndValue= ruleSAttributeAndValue EOF )
            // InternalT2A.g:458:2: iv_ruleSAttributeAndValue= ruleSAttributeAndValue EOF
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
    // InternalT2A.g:464:1: ruleSAttributeAndValue returns [EObject current=null] : ( ( (lv_stname_0_0= ruleName ) ) ( (lv_value_1_0= RULE_STRING2 ) ) ) ;
    public final EObject ruleSAttributeAndValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        AntlrDatatypeRuleToken lv_stname_0_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:470:2: ( ( ( (lv_stname_0_0= ruleName ) ) ( (lv_value_1_0= RULE_STRING2 ) ) ) )
            // InternalT2A.g:471:2: ( ( (lv_stname_0_0= ruleName ) ) ( (lv_value_1_0= RULE_STRING2 ) ) )
            {
            // InternalT2A.g:471:2: ( ( (lv_stname_0_0= ruleName ) ) ( (lv_value_1_0= RULE_STRING2 ) ) )
            // InternalT2A.g:472:3: ( (lv_stname_0_0= ruleName ) ) ( (lv_value_1_0= RULE_STRING2 ) )
            {
            // InternalT2A.g:472:3: ( (lv_stname_0_0= ruleName ) )
            // InternalT2A.g:473:4: (lv_stname_0_0= ruleName )
            {
            // InternalT2A.g:473:4: (lv_stname_0_0= ruleName )
            // InternalT2A.g:474:5: lv_stname_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getSAttributeAndValueAccess().getStnameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalT2A.g:491:3: ( (lv_value_1_0= RULE_STRING2 ) )
            // InternalT2A.g:492:4: (lv_value_1_0= RULE_STRING2 )
            {
            // InternalT2A.g:492:4: (lv_value_1_0= RULE_STRING2 )
            // InternalT2A.g:493:5: lv_value_1_0= RULE_STRING2
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
    // InternalT2A.g:513:1: entryRuleDOM returns [EObject current=null] : iv_ruleDOM= ruleDOM EOF ;
    public final EObject entryRuleDOM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOM = null;


        try {
            // InternalT2A.g:513:44: (iv_ruleDOM= ruleDOM EOF )
            // InternalT2A.g:514:2: iv_ruleDOM= ruleDOM EOF
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
    // InternalT2A.g:520:1: ruleDOM returns [EObject current=null] : (otherlv_0= 'Dom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' )? ) ;
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
            // InternalT2A.g:526:2: ( (otherlv_0= 'Dom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' )? ) )
            // InternalT2A.g:527:2: (otherlv_0= 'Dom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' )? )
            {
            // InternalT2A.g:527:2: (otherlv_0= 'Dom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' )? )
            // InternalT2A.g:528:3: otherlv_0= 'Dom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDOMAccess().getDomKeyword_0());
            		
            // InternalT2A.g:532:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalT2A.g:533:4: (lv_name_1_0= RULE_ID )
            {
            // InternalT2A.g:533:4: (lv_name_1_0= RULE_ID )
            // InternalT2A.g:534:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            // InternalT2A.g:550:3: (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalT2A.g:551:4: otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getDOMAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalT2A.g:555:4: (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==14) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalT2A.g:556:5: otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}'
                            {
                            otherlv_3=(Token)match(input,14,FOLLOW_5); 

                            					newLeafNode(otherlv_3, grammarAccess.getDOMAccess().getSclassKeyword_2_1_0());
                            				
                            otherlv_4=(Token)match(input,13,FOLLOW_7); 

                            					newLeafNode(otherlv_4, grammarAccess.getDOMAccess().getLeftCurlyBracketKeyword_2_1_1());
                            				
                            // InternalT2A.g:564:5: ( (otherlv_5= RULE_ID ) )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==RULE_ID) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // InternalT2A.g:565:6: (otherlv_5= RULE_ID )
                            	    {
                            	    // InternalT2A.g:565:6: (otherlv_5= RULE_ID )
                            	    // InternalT2A.g:566:7: otherlv_5= RULE_ID
                            	    {

                            	    							if (current==null) {
                            	    								current = createModelElement(grammarAccess.getDOMRule());
                            	    							}
                            	    						
                            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_7); 

                            	    							newLeafNode(otherlv_5, grammarAccess.getDOMAccess().getSclassesStyleClassCrossReference_2_1_2_0());
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop14;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,15,FOLLOW_20); 

                            					newLeafNode(otherlv_6, grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_1_3());
                            				

                            }
                            break;

                    }

                    // InternalT2A.g:582:4: ( (lv_features_7_0= ruleFeature ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID||LA16_0==RULE_STRING||LA16_0==24) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalT2A.g:583:5: (lv_features_7_0= ruleFeature )
                    	    {
                    	    // InternalT2A.g:583:5: (lv_features_7_0= ruleFeature )
                    	    // InternalT2A.g:584:6: lv_features_7_0= ruleFeature
                    	    {

                    	    						newCompositeNode(grammarAccess.getDOMAccess().getFeaturesFeatureParserRuleCall_2_2_0());
                    	    					
                    	    pushFollow(FOLLOW_20);
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
                    	    break loop16;
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
    // InternalT2A.g:610:1: entryRuleComp returns [EObject current=null] : iv_ruleComp= ruleComp EOF ;
    public final EObject entryRuleComp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComp = null;


        try {
            // InternalT2A.g:610:45: (iv_ruleComp= ruleComp EOF )
            // InternalT2A.g:611:2: iv_ruleComp= ruleComp EOF
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
    // InternalT2A.g:617:1: ruleComp returns [EObject current=null] : (otherlv_0= 'Comp' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' )? ) ;
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
            // InternalT2A.g:623:2: ( (otherlv_0= 'Comp' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' )? ) )
            // InternalT2A.g:624:2: (otherlv_0= 'Comp' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' )? )
            {
            // InternalT2A.g:624:2: (otherlv_0= 'Comp' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' )? )
            // InternalT2A.g:625:3: otherlv_0= 'Comp' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCompAccess().getCompKeyword_0());
            		
            // InternalT2A.g:629:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalT2A.g:630:4: (lv_name_1_0= RULE_ID )
            {
            // InternalT2A.g:630:4: (lv_name_1_0= RULE_ID )
            // InternalT2A.g:631:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            // InternalT2A.g:647:3: (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==13) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalT2A.g:648:4: otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getCompAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalT2A.g:652:4: (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==14) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalT2A.g:653:5: otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}'
                            {
                            otherlv_3=(Token)match(input,14,FOLLOW_5); 

                            					newLeafNode(otherlv_3, grammarAccess.getCompAccess().getSclassKeyword_2_1_0());
                            				
                            otherlv_4=(Token)match(input,13,FOLLOW_7); 

                            					newLeafNode(otherlv_4, grammarAccess.getCompAccess().getLeftCurlyBracketKeyword_2_1_1());
                            				
                            // InternalT2A.g:661:5: ( (otherlv_5= RULE_ID ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==RULE_ID) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // InternalT2A.g:662:6: (otherlv_5= RULE_ID )
                            	    {
                            	    // InternalT2A.g:662:6: (otherlv_5= RULE_ID )
                            	    // InternalT2A.g:663:7: otherlv_5= RULE_ID
                            	    {

                            	    							if (current==null) {
                            	    								current = createModelElement(grammarAccess.getCompRule());
                            	    							}
                            	    						
                            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_7); 

                            	    							newLeafNode(otherlv_5, grammarAccess.getCompAccess().getHostclassesStyleClassCrossReference_2_1_2_0());
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop18;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,15,FOLLOW_20); 

                            					newLeafNode(otherlv_6, grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_1_3());
                            				

                            }
                            break;

                    }

                    // InternalT2A.g:679:4: ( (lv_features_7_0= ruleFeature ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID||LA20_0==RULE_STRING||LA20_0==24) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalT2A.g:680:5: (lv_features_7_0= ruleFeature )
                    	    {
                    	    // InternalT2A.g:680:5: (lv_features_7_0= ruleFeature )
                    	    // InternalT2A.g:681:6: lv_features_7_0= ruleFeature
                    	    {

                    	    						newCompositeNode(grammarAccess.getCompAccess().getFeaturesFeatureParserRuleCall_2_2_0());
                    	    					
                    	    pushFollow(FOLLOW_20);
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
                    	    break loop20;
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
    // InternalT2A.g:707:1: entryRuleInstanciaEDOM returns [EObject current=null] : iv_ruleInstanciaEDOM= ruleInstanciaEDOM EOF ;
    public final EObject entryRuleInstanciaEDOM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanciaEDOM = null;


        try {
            // InternalT2A.g:707:54: (iv_ruleInstanciaEDOM= ruleInstanciaEDOM EOF )
            // InternalT2A.g:708:2: iv_ruleInstanciaEDOM= ruleInstanciaEDOM EOF
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
    // InternalT2A.g:714:1: ruleInstanciaEDOM returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_insfeatures_6_0= ruleInstanceEDOMFeature ) )* otherlv_7= '}' )? ) ;
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
            // InternalT2A.g:720:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_insfeatures_6_0= ruleInstanceEDOMFeature ) )* otherlv_7= '}' )? ) )
            // InternalT2A.g:721:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_insfeatures_6_0= ruleInstanceEDOMFeature ) )* otherlv_7= '}' )? )
            {
            // InternalT2A.g:721:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_insfeatures_6_0= ruleInstanceEDOMFeature ) )* otherlv_7= '}' )? )
            // InternalT2A.g:722:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_insfeatures_6_0= ruleInstanceEDOMFeature ) )* otherlv_7= '}' )?
            {
            // InternalT2A.g:722:3: ( (otherlv_0= RULE_ID ) )
            // InternalT2A.g:723:4: (otherlv_0= RULE_ID )
            {
            // InternalT2A.g:723:4: (otherlv_0= RULE_ID )
            // InternalT2A.g:724:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanciaEDOMRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getInstanciaEDOMAccess().getInstanciaEDOMCrossReference_0_0());
            				

            }


            }

            // InternalT2A.g:735:3: (otherlv_1= '{' (otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_insfeatures_6_0= ruleInstanceEDOMFeature ) )* otherlv_7= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalT2A.g:736:4: otherlv_1= '{' (otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_insfeatures_6_0= ruleInstanceEDOMFeature ) )* otherlv_7= '}'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getInstanciaEDOMAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalT2A.g:740:4: (otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==14) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalT2A.g:741:5: otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}'
                            {
                            otherlv_2=(Token)match(input,14,FOLLOW_5); 

                            					newLeafNode(otherlv_2, grammarAccess.getInstanciaEDOMAccess().getSclassKeyword_1_1_0());
                            				
                            otherlv_3=(Token)match(input,13,FOLLOW_7); 

                            					newLeafNode(otherlv_3, grammarAccess.getInstanciaEDOMAccess().getLeftCurlyBracketKeyword_1_1_1());
                            				
                            // InternalT2A.g:749:5: ( (otherlv_4= RULE_ID ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==RULE_ID) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // InternalT2A.g:750:6: (otherlv_4= RULE_ID )
                            	    {
                            	    // InternalT2A.g:750:6: (otherlv_4= RULE_ID )
                            	    // InternalT2A.g:751:7: otherlv_4= RULE_ID
                            	    {

                            	    							if (current==null) {
                            	    								current = createModelElement(grammarAccess.getInstanciaEDOMRule());
                            	    							}
                            	    						
                            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); 

                            	    							newLeafNode(otherlv_4, grammarAccess.getInstanciaEDOMAccess().getSclassesStyleClassCrossReference_1_1_2_0());
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop22;
                                }
                            } while (true);

                            otherlv_5=(Token)match(input,15,FOLLOW_10); 

                            					newLeafNode(otherlv_5, grammarAccess.getInstanciaEDOMAccess().getRightCurlyBracketKeyword_1_1_3());
                            				

                            }
                            break;

                    }

                    // InternalT2A.g:767:4: ( (lv_insfeatures_6_0= ruleInstanceEDOMFeature ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_ID||LA24_0==RULE_STRING) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalT2A.g:768:5: (lv_insfeatures_6_0= ruleInstanceEDOMFeature )
                    	    {
                    	    // InternalT2A.g:768:5: (lv_insfeatures_6_0= ruleInstanceEDOMFeature )
                    	    // InternalT2A.g:769:6: lv_insfeatures_6_0= ruleInstanceEDOMFeature
                    	    {

                    	    						newCompositeNode(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesInstanceEDOMFeatureParserRuleCall_1_2_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
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
                    	    break loop24;
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
    // InternalT2A.g:795:1: entryRuleInstanceEDOMFeature returns [EObject current=null] : iv_ruleInstanceEDOMFeature= ruleInstanceEDOMFeature EOF ;
    public final EObject entryRuleInstanceEDOMFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceEDOMFeature = null;


        try {
            // InternalT2A.g:795:60: (iv_ruleInstanceEDOMFeature= ruleInstanceEDOMFeature EOF )
            // InternalT2A.g:796:2: iv_ruleInstanceEDOMFeature= ruleInstanceEDOMFeature EOF
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
    // InternalT2A.g:802:1: ruleInstanceEDOMFeature returns [EObject current=null] : ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInstanceEDOMFeature() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;
        EObject lv_instanciaEDOM_0_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:808:2: ( ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // InternalT2A.g:809:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // InternalT2A.g:809:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_STRING) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalT2A.g:810:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    {
                    // InternalT2A.g:810:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    // InternalT2A.g:811:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    {
                    // InternalT2A.g:811:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    // InternalT2A.g:812:5: lv_instanciaEDOM_0_0= ruleInstanciaEDOM
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
                    // InternalT2A.g:830:3: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // InternalT2A.g:830:3: ( (lv_string_1_0= RULE_STRING ) )
                    // InternalT2A.g:831:4: (lv_string_1_0= RULE_STRING )
                    {
                    // InternalT2A.g:831:4: (lv_string_1_0= RULE_STRING )
                    // InternalT2A.g:832:5: lv_string_1_0= RULE_STRING
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
    // InternalT2A.g:852:1: entryRulePageFeature returns [EObject current=null] : iv_rulePageFeature= rulePageFeature EOF ;
    public final EObject entryRulePageFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageFeature = null;


        try {
            // InternalT2A.g:852:52: (iv_rulePageFeature= rulePageFeature EOF )
            // InternalT2A.g:853:2: iv_rulePageFeature= rulePageFeature EOF
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
    // InternalT2A.g:859:1: rulePageFeature returns [EObject current=null] : ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject rulePageFeature() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;
        EObject lv_instanciaEDOM_0_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:865:2: ( ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // InternalT2A.g:866:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // InternalT2A.g:866:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
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
                    // InternalT2A.g:867:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    {
                    // InternalT2A.g:867:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    // InternalT2A.g:868:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    {
                    // InternalT2A.g:868:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    // InternalT2A.g:869:5: lv_instanciaEDOM_0_0= ruleInstanciaEDOM
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
                    // InternalT2A.g:887:3: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // InternalT2A.g:887:3: ( (lv_string_1_0= RULE_STRING ) )
                    // InternalT2A.g:888:4: (lv_string_1_0= RULE_STRING )
                    {
                    // InternalT2A.g:888:4: (lv_string_1_0= RULE_STRING )
                    // InternalT2A.g:889:5: lv_string_1_0= RULE_STRING
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
    // InternalT2A.g:909:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalT2A.g:909:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalT2A.g:910:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalT2A.g:916:1: ruleFeature returns [EObject current=null] : ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_AllowSlot_1_0= 'AllowSlot' ) ) | ( (lv_string_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_AllowSlot_1_0=null;
        Token lv_string_2_0=null;
        EObject lv_instanciaEDOM_0_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:922:2: ( ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_AllowSlot_1_0= 'AllowSlot' ) ) | ( (lv_string_2_0= RULE_STRING ) ) ) )
            // InternalT2A.g:923:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_AllowSlot_1_0= 'AllowSlot' ) ) | ( (lv_string_2_0= RULE_STRING ) ) )
            {
            // InternalT2A.g:923:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_AllowSlot_1_0= 'AllowSlot' ) ) | ( (lv_string_2_0= RULE_STRING ) ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt28=1;
                }
                break;
            case 24:
                {
                alt28=2;
                }
                break;
            case RULE_STRING:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalT2A.g:924:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    {
                    // InternalT2A.g:924:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    // InternalT2A.g:925:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    {
                    // InternalT2A.g:925:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    // InternalT2A.g:926:5: lv_instanciaEDOM_0_0= ruleInstanciaEDOM
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
                    // InternalT2A.g:944:3: ( (lv_AllowSlot_1_0= 'AllowSlot' ) )
                    {
                    // InternalT2A.g:944:3: ( (lv_AllowSlot_1_0= 'AllowSlot' ) )
                    // InternalT2A.g:945:4: (lv_AllowSlot_1_0= 'AllowSlot' )
                    {
                    // InternalT2A.g:945:4: (lv_AllowSlot_1_0= 'AllowSlot' )
                    // InternalT2A.g:946:5: lv_AllowSlot_1_0= 'AllowSlot'
                    {
                    lv_AllowSlot_1_0=(Token)match(input,24,FOLLOW_2); 

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
                    // InternalT2A.g:959:3: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // InternalT2A.g:959:3: ( (lv_string_2_0= RULE_STRING ) )
                    // InternalT2A.g:960:4: (lv_string_2_0= RULE_STRING )
                    {
                    // InternalT2A.g:960:4: (lv_string_2_0= RULE_STRING )
                    // InternalT2A.g:961:5: lv_string_2_0= RULE_STRING
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
    // InternalT2A.g:981:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalT2A.g:981:44: (iv_ruleName= ruleName EOF )
            // InternalT2A.g:982:2: iv_ruleName= ruleName EOF
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
    // InternalT2A.g:988:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '_' | kw= '#' | kw= '-' | kw= '*' | kw= '.' | kw= '::' | kw= '>' | this_ID_7= RULE_ID )* ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_7=null;


        	enterRule();

        try {
            // InternalT2A.g:994:2: ( (kw= '_' | kw= '#' | kw= '-' | kw= '*' | kw= '.' | kw= '::' | kw= '>' | this_ID_7= RULE_ID )* )
            // InternalT2A.g:995:2: (kw= '_' | kw= '#' | kw= '-' | kw= '*' | kw= '.' | kw= '::' | kw= '>' | this_ID_7= RULE_ID )*
            {
            // InternalT2A.g:995:2: (kw= '_' | kw= '#' | kw= '-' | kw= '*' | kw= '.' | kw= '::' | kw= '>' | this_ID_7= RULE_ID )*
            loop29:
            do {
                int alt29=9;
                switch ( input.LA(1) ) {
                case 25:
                    {
                    alt29=1;
                    }
                    break;
                case 26:
                    {
                    alt29=2;
                    }
                    break;
                case 27:
                    {
                    alt29=3;
                    }
                    break;
                case 28:
                    {
                    alt29=4;
                    }
                    break;
                case 29:
                    {
                    alt29=5;
                    }
                    break;
                case 30:
                    {
                    alt29=6;
                    }
                    break;
                case 31:
                    {
                    alt29=7;
                    }
                    break;
                case RULE_ID:
                    {
                    alt29=8;
                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // InternalT2A.g:996:3: kw= '_'
            	    {
            	    kw=(Token)match(input,25,FOLLOW_22); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getNameAccess().get_Keyword_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalT2A.g:1002:3: kw= '#'
            	    {
            	    kw=(Token)match(input,26,FOLLOW_22); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getNameAccess().getNumberSignKeyword_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalT2A.g:1008:3: kw= '-'
            	    {
            	    kw=(Token)match(input,27,FOLLOW_22); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getNameAccess().getHyphenMinusKeyword_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalT2A.g:1014:3: kw= '*'
            	    {
            	    kw=(Token)match(input,28,FOLLOW_22); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getNameAccess().getAsteriskKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalT2A.g:1020:3: kw= '.'
            	    {
            	    kw=(Token)match(input,29,FOLLOW_22); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getNameAccess().getFullStopKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalT2A.g:1026:3: kw= '::'
            	    {
            	    kw=(Token)match(input,30,FOLLOW_22); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getNameAccess().getColonColonKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalT2A.g:1032:3: kw= '>'
            	    {
            	    kw=(Token)match(input,31,FOLLOW_22); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getNameAccess().getGreaterThanSignKeyword_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalT2A.g:1038:3: this_ID_7= RULE_ID
            	    {
            	    this_ID_7=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    			current.merge(this_ID_7);
            	    		

            	    			newLeafNode(this_ID_7, grammarAccess.getNameAccess().getIDTerminalRuleCall_7());
            	    		

            	    }
            	    break;

            	default :
            	    break loop29;
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000C41002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003C050L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000038050L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000028050L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008050L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000FE002010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000FE308030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000FE008030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000100C050L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001008050L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000000C050L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000FE000012L});

}