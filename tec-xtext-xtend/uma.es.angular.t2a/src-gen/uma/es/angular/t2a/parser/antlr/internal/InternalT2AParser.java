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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Page'", "'{'", "'SClass:{'", "'}'", "'home'", "'showInNav'", "'StyleClass'", "'SAttri'", "':'", "'Dom'", "'Comp'", "'AllowSlot'"
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

                if ( (LA1_0==11||(LA1_0>=17 && LA1_0<=18)||(LA1_0>=20 && LA1_0<=21)) ) {
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
            else if ( ((LA2_0>=17 && LA2_0<=18)||(LA2_0>=20 && LA2_0<=21)) ) {
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
    // InternalT2A.g:143:1: rulePage returns [EObject current=null] : (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'SClass:{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_home_6_0= 'home' ) )? ( (lv_showInNav_7_0= 'showInNav' ) )? ( (lv_pageFeatures_8_0= rulePageFeature ) )* otherlv_9= '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_home_6_0=null;
        Token lv_showInNav_7_0=null;
        Token otherlv_9=null;
        EObject lv_pageFeatures_8_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:149:2: ( (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'SClass:{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_home_6_0= 'home' ) )? ( (lv_showInNav_7_0= 'showInNav' ) )? ( (lv_pageFeatures_8_0= rulePageFeature ) )* otherlv_9= '}' ) )
            // InternalT2A.g:150:2: (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'SClass:{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_home_6_0= 'home' ) )? ( (lv_showInNav_7_0= 'showInNav' ) )? ( (lv_pageFeatures_8_0= rulePageFeature ) )* otherlv_9= '}' )
            {
            // InternalT2A.g:150:2: (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'SClass:{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_home_6_0= 'home' ) )? ( (lv_showInNav_7_0= 'showInNav' ) )? ( (lv_pageFeatures_8_0= rulePageFeature ) )* otherlv_9= '}' )
            // InternalT2A.g:151:3: otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'SClass:{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_home_6_0= 'home' ) )? ( (lv_showInNav_7_0= 'showInNav' ) )? ( (lv_pageFeatures_8_0= rulePageFeature ) )* otherlv_9= '}'
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
            		
            // InternalT2A.g:177:3: (otherlv_3= 'SClass:{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalT2A.g:178:4: otherlv_3= 'SClass:{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getPageAccess().getSClassKeyword_3_0());
                    			
                    // InternalT2A.g:182:4: ( (otherlv_4= RULE_ID ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalT2A.g:183:5: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalT2A.g:183:5: (otherlv_4= RULE_ID )
                    	    // InternalT2A.g:184:6: otherlv_4= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getPageRule());
                    	    						}
                    	    					
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getPageAccess().getSclassesStyleClassCrossReference_3_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalT2A.g:200:3: ( (lv_home_6_0= 'home' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalT2A.g:201:4: (lv_home_6_0= 'home' )
                    {
                    // InternalT2A.g:201:4: (lv_home_6_0= 'home' )
                    // InternalT2A.g:202:5: lv_home_6_0= 'home'
                    {
                    lv_home_6_0=(Token)match(input,15,FOLLOW_9); 

                    					newLeafNode(lv_home_6_0, grammarAccess.getPageAccess().getHomeHomeKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPageRule());
                    					}
                    					setWithLastConsumed(current, "home", lv_home_6_0 != null, "home");
                    				

                    }


                    }
                    break;

            }

            // InternalT2A.g:214:3: ( (lv_showInNav_7_0= 'showInNav' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalT2A.g:215:4: (lv_showInNav_7_0= 'showInNav' )
                    {
                    // InternalT2A.g:215:4: (lv_showInNav_7_0= 'showInNav' )
                    // InternalT2A.g:216:5: lv_showInNav_7_0= 'showInNav'
                    {
                    lv_showInNav_7_0=(Token)match(input,16,FOLLOW_10); 

                    					newLeafNode(lv_showInNav_7_0, grammarAccess.getPageAccess().getShowInNavShowInNavKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPageRule());
                    					}
                    					setWithLastConsumed(current, "showInNav", lv_showInNav_7_0 != null, "showInNav");
                    				

                    }


                    }
                    break;

            }

            // InternalT2A.g:228:3: ( (lv_pageFeatures_8_0= rulePageFeature ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_STRING)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalT2A.g:229:4: (lv_pageFeatures_8_0= rulePageFeature )
            	    {
            	    // InternalT2A.g:229:4: (lv_pageFeatures_8_0= rulePageFeature )
            	    // InternalT2A.g:230:5: lv_pageFeatures_8_0= rulePageFeature
            	    {

            	    					newCompositeNode(grammarAccess.getPageAccess().getPageFeaturesPageFeatureParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_pageFeatures_8_0=rulePageFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"pageFeatures",
            	    						lv_pageFeatures_8_0,
            	    						"uma.es.angular.t2a.T2A.PageFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalT2A.g:255:1: entryRuleEDOM returns [EObject current=null] : iv_ruleEDOM= ruleEDOM EOF ;
    public final EObject entryRuleEDOM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDOM = null;


        try {
            // InternalT2A.g:255:45: (iv_ruleEDOM= ruleEDOM EOF )
            // InternalT2A.g:256:2: iv_ruleEDOM= ruleEDOM EOF
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
    // InternalT2A.g:262:1: ruleEDOM returns [EObject current=null] : (this_DOM_0= ruleDOM | this_Comp_1= ruleComp | this_StyleClass_2= ruleStyleClass | this_SAttributeName_3= ruleSAttributeName ) ;
    public final EObject ruleEDOM() throws RecognitionException {
        EObject current = null;

        EObject this_DOM_0 = null;

        EObject this_Comp_1 = null;

        EObject this_StyleClass_2 = null;

        EObject this_SAttributeName_3 = null;



        	enterRule();

        try {
            // InternalT2A.g:268:2: ( (this_DOM_0= ruleDOM | this_Comp_1= ruleComp | this_StyleClass_2= ruleStyleClass | this_SAttributeName_3= ruleSAttributeName ) )
            // InternalT2A.g:269:2: (this_DOM_0= ruleDOM | this_Comp_1= ruleComp | this_StyleClass_2= ruleStyleClass | this_SAttributeName_3= ruleSAttributeName )
            {
            // InternalT2A.g:269:2: (this_DOM_0= ruleDOM | this_Comp_1= ruleComp | this_StyleClass_2= ruleStyleClass | this_SAttributeName_3= ruleSAttributeName )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 17:
                {
                alt8=3;
                }
                break;
            case 18:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalT2A.g:270:3: this_DOM_0= ruleDOM
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
                    // InternalT2A.g:279:3: this_Comp_1= ruleComp
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
                    // InternalT2A.g:288:3: this_StyleClass_2= ruleStyleClass
                    {

                    			newCompositeNode(grammarAccess.getEDOMAccess().getStyleClassParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StyleClass_2=ruleStyleClass();

                    state._fsp--;


                    			current = this_StyleClass_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalT2A.g:297:3: this_SAttributeName_3= ruleSAttributeName
                    {

                    			newCompositeNode(grammarAccess.getEDOMAccess().getSAttributeNameParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SAttributeName_3=ruleSAttributeName();

                    state._fsp--;


                    			current = this_SAttributeName_3;
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
    // InternalT2A.g:309:1: entryRuleStyleClass returns [EObject current=null] : iv_ruleStyleClass= ruleStyleClass EOF ;
    public final EObject entryRuleStyleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleClass = null;


        try {
            // InternalT2A.g:309:51: (iv_ruleStyleClass= ruleStyleClass EOF )
            // InternalT2A.g:310:2: iv_ruleStyleClass= ruleStyleClass EOF
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
    // InternalT2A.g:316:1: ruleStyleClass returns [EObject current=null] : (otherlv_0= 'StyleClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sattributes_3_0= ruleSAttributeAndValue ) )* otherlv_4= '}' ) ;
    public final EObject ruleStyleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sattributes_3_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:322:2: ( (otherlv_0= 'StyleClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sattributes_3_0= ruleSAttributeAndValue ) )* otherlv_4= '}' ) )
            // InternalT2A.g:323:2: (otherlv_0= 'StyleClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sattributes_3_0= ruleSAttributeAndValue ) )* otherlv_4= '}' )
            {
            // InternalT2A.g:323:2: (otherlv_0= 'StyleClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sattributes_3_0= ruleSAttributeAndValue ) )* otherlv_4= '}' )
            // InternalT2A.g:324:3: otherlv_0= 'StyleClass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sattributes_3_0= ruleSAttributeAndValue ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStyleClassAccess().getStyleClassKeyword_0());
            		
            // InternalT2A.g:328:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalT2A.g:329:4: (lv_name_1_0= RULE_ID )
            {
            // InternalT2A.g:329:4: (lv_name_1_0= RULE_ID )
            // InternalT2A.g:330:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStyleClassAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStyleClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getStyleClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalT2A.g:350:3: ( (lv_sattributes_3_0= ruleSAttributeAndValue ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalT2A.g:351:4: (lv_sattributes_3_0= ruleSAttributeAndValue )
            	    {
            	    // InternalT2A.g:351:4: (lv_sattributes_3_0= ruleSAttributeAndValue )
            	    // InternalT2A.g:352:5: lv_sattributes_3_0= ruleSAttributeAndValue
            	    {

            	    					newCompositeNode(grammarAccess.getStyleClassAccess().getSattributesSAttributeAndValueParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
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
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStyleClassAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleSAttributeName"
    // InternalT2A.g:377:1: entryRuleSAttributeName returns [EObject current=null] : iv_ruleSAttributeName= ruleSAttributeName EOF ;
    public final EObject entryRuleSAttributeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAttributeName = null;


        try {
            // InternalT2A.g:377:55: (iv_ruleSAttributeName= ruleSAttributeName EOF )
            // InternalT2A.g:378:2: iv_ruleSAttributeName= ruleSAttributeName EOF
            {
             newCompositeNode(grammarAccess.getSAttributeNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSAttributeName=ruleSAttributeName();

            state._fsp--;

             current =iv_ruleSAttributeName; 
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
    // $ANTLR end "entryRuleSAttributeName"


    // $ANTLR start "ruleSAttributeName"
    // InternalT2A.g:384:1: ruleSAttributeName returns [EObject current=null] : (otherlv_0= 'SAttri' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSAttributeName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalT2A.g:390:2: ( (otherlv_0= 'SAttri' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalT2A.g:391:2: (otherlv_0= 'SAttri' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalT2A.g:391:2: (otherlv_0= 'SAttri' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalT2A.g:392:3: otherlv_0= 'SAttri' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSAttributeNameAccess().getSAttriKeyword_0());
            		
            // InternalT2A.g:396:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalT2A.g:397:4: (lv_name_1_0= RULE_ID )
            {
            // InternalT2A.g:397:4: (lv_name_1_0= RULE_ID )
            // InternalT2A.g:398:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSAttributeNameAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSAttributeNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleSAttributeName"


    // $ANTLR start "entryRuleSAttributeAndValue"
    // InternalT2A.g:418:1: entryRuleSAttributeAndValue returns [EObject current=null] : iv_ruleSAttributeAndValue= ruleSAttributeAndValue EOF ;
    public final EObject entryRuleSAttributeAndValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAttributeAndValue = null;


        try {
            // InternalT2A.g:418:59: (iv_ruleSAttributeAndValue= ruleSAttributeAndValue EOF )
            // InternalT2A.g:419:2: iv_ruleSAttributeAndValue= ruleSAttributeAndValue EOF
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
    // InternalT2A.g:425:1: ruleSAttributeAndValue returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSAttributeAndValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalT2A.g:431:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalT2A.g:432:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalT2A.g:432:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalT2A.g:433:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalT2A.g:433:3: ( (otherlv_0= RULE_ID ) )
            // InternalT2A.g:434:4: (otherlv_0= RULE_ID )
            {
            // InternalT2A.g:434:4: (otherlv_0= RULE_ID )
            // InternalT2A.g:435:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSAttributeAndValueRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getSAttributeAndValueAccess().getStnameSAttributeNameCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getSAttributeAndValueAccess().getColonKeyword_1());
            		
            // InternalT2A.g:450:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalT2A.g:451:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalT2A.g:451:4: (lv_value_2_0= RULE_STRING )
            // InternalT2A.g:452:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getSAttributeAndValueAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSAttributeAndValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"uma.es.angular.t2a.T2A.STRING");
            				

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
    // InternalT2A.g:472:1: entryRuleDOM returns [EObject current=null] : iv_ruleDOM= ruleDOM EOF ;
    public final EObject entryRuleDOM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOM = null;


        try {
            // InternalT2A.g:472:44: (iv_ruleDOM= ruleDOM EOF )
            // InternalT2A.g:473:2: iv_ruleDOM= ruleDOM EOF
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
    // InternalT2A.g:479:1: ruleDOM returns [EObject current=null] : (otherlv_0= 'Dom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'SClass:{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleDOM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_features_6_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:485:2: ( (otherlv_0= 'Dom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'SClass:{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' )? ) )
            // InternalT2A.g:486:2: (otherlv_0= 'Dom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'SClass:{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' )? )
            {
            // InternalT2A.g:486:2: (otherlv_0= 'Dom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'SClass:{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' )? )
            // InternalT2A.g:487:3: otherlv_0= 'Dom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'SClass:{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDOMAccess().getDomKeyword_0());
            		
            // InternalT2A.g:491:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalT2A.g:492:4: (lv_name_1_0= RULE_ID )
            {
            // InternalT2A.g:492:4: (lv_name_1_0= RULE_ID )
            // InternalT2A.g:493:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalT2A.g:509:3: (otherlv_2= '{' (otherlv_3= 'SClass:{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==12) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalT2A.g:510:4: otherlv_2= '{' (otherlv_3= 'SClass:{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getDOMAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalT2A.g:514:4: (otherlv_3= 'SClass:{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==13) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalT2A.g:515:5: otherlv_3= 'SClass:{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}'
                            {
                            otherlv_3=(Token)match(input,13,FOLLOW_7); 

                            					newLeafNode(otherlv_3, grammarAccess.getDOMAccess().getSClassKeyword_2_1_0());
                            				
                            // InternalT2A.g:519:5: ( (otherlv_4= RULE_ID ) )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==RULE_ID) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // InternalT2A.g:520:6: (otherlv_4= RULE_ID )
                            	    {
                            	    // InternalT2A.g:520:6: (otherlv_4= RULE_ID )
                            	    // InternalT2A.g:521:7: otherlv_4= RULE_ID
                            	    {

                            	    							if (current==null) {
                            	    								current = createModelElement(grammarAccess.getDOMRule());
                            	    							}
                            	    						
                            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); 

                            	    							newLeafNode(otherlv_4, grammarAccess.getDOMAccess().getSclassesStyleClassCrossReference_2_1_1_0());
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);

                            otherlv_5=(Token)match(input,14,FOLLOW_15); 

                            					newLeafNode(otherlv_5, grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_1_2());
                            				

                            }
                            break;

                    }

                    // InternalT2A.g:537:4: ( (lv_features_6_0= ruleFeature ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_STRING)||LA12_0==22) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalT2A.g:538:5: (lv_features_6_0= ruleFeature )
                    	    {
                    	    // InternalT2A.g:538:5: (lv_features_6_0= ruleFeature )
                    	    // InternalT2A.g:539:6: lv_features_6_0= ruleFeature
                    	    {

                    	    						newCompositeNode(grammarAccess.getDOMAccess().getFeaturesFeatureParserRuleCall_2_2_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_features_6_0=ruleFeature();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDOMRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"features",
                    	    							lv_features_6_0,
                    	    							"uma.es.angular.t2a.T2A.Feature");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_3());
                    			

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
    // InternalT2A.g:565:1: entryRuleComp returns [EObject current=null] : iv_ruleComp= ruleComp EOF ;
    public final EObject entryRuleComp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComp = null;


        try {
            // InternalT2A.g:565:45: (iv_ruleComp= ruleComp EOF )
            // InternalT2A.g:566:2: iv_ruleComp= ruleComp EOF
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
    // InternalT2A.g:572:1: ruleComp returns [EObject current=null] : (otherlv_0= 'Comp' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'SClass:{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleComp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_features_6_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:578:2: ( (otherlv_0= 'Comp' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'SClass:{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' )? ) )
            // InternalT2A.g:579:2: (otherlv_0= 'Comp' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'SClass:{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' )? )
            {
            // InternalT2A.g:579:2: (otherlv_0= 'Comp' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'SClass:{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' )? )
            // InternalT2A.g:580:3: otherlv_0= 'Comp' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'SClass:{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCompAccess().getCompKeyword_0());
            		
            // InternalT2A.g:584:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalT2A.g:585:4: (lv_name_1_0= RULE_ID )
            {
            // InternalT2A.g:585:4: (lv_name_1_0= RULE_ID )
            // InternalT2A.g:586:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalT2A.g:602:3: (otherlv_2= '{' (otherlv_3= 'SClass:{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==12) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalT2A.g:603:4: otherlv_2= '{' (otherlv_3= 'SClass:{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getCompAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalT2A.g:607:4: (otherlv_3= 'SClass:{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==13) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalT2A.g:608:5: otherlv_3= 'SClass:{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}'
                            {
                            otherlv_3=(Token)match(input,13,FOLLOW_7); 

                            					newLeafNode(otherlv_3, grammarAccess.getCompAccess().getSClassKeyword_2_1_0());
                            				
                            // InternalT2A.g:612:5: ( (otherlv_4= RULE_ID ) )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==RULE_ID) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // InternalT2A.g:613:6: (otherlv_4= RULE_ID )
                            	    {
                            	    // InternalT2A.g:613:6: (otherlv_4= RULE_ID )
                            	    // InternalT2A.g:614:7: otherlv_4= RULE_ID
                            	    {

                            	    							if (current==null) {
                            	    								current = createModelElement(grammarAccess.getCompRule());
                            	    							}
                            	    						
                            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); 

                            	    							newLeafNode(otherlv_4, grammarAccess.getCompAccess().getSclassesStyleClassCrossReference_2_1_1_0());
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop14;
                                }
                            } while (true);

                            otherlv_5=(Token)match(input,14,FOLLOW_15); 

                            					newLeafNode(otherlv_5, grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_1_2());
                            				

                            }
                            break;

                    }

                    // InternalT2A.g:630:4: ( (lv_features_6_0= ruleFeature ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)||LA16_0==22) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalT2A.g:631:5: (lv_features_6_0= ruleFeature )
                    	    {
                    	    // InternalT2A.g:631:5: (lv_features_6_0= ruleFeature )
                    	    // InternalT2A.g:632:6: lv_features_6_0= ruleFeature
                    	    {

                    	    						newCompositeNode(grammarAccess.getCompAccess().getFeaturesFeatureParserRuleCall_2_2_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_features_6_0=ruleFeature();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCompRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"features",
                    	    							lv_features_6_0,
                    	    							"uma.es.angular.t2a.T2A.Feature");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_3());
                    			

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
    // InternalT2A.g:658:1: entryRuleInstanciaEDOM returns [EObject current=null] : iv_ruleInstanciaEDOM= ruleInstanciaEDOM EOF ;
    public final EObject entryRuleInstanciaEDOM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanciaEDOM = null;


        try {
            // InternalT2A.g:658:54: (iv_ruleInstanciaEDOM= ruleInstanciaEDOM EOF )
            // InternalT2A.g:659:2: iv_ruleInstanciaEDOM= ruleInstanciaEDOM EOF
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
    // InternalT2A.g:665:1: ruleInstanciaEDOM returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_insfeatures_2_0= ruleInstanceEDOMFeature ) )* otherlv_3= '}' )? ) ;
    public final EObject ruleInstanciaEDOM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_insfeatures_2_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:671:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_insfeatures_2_0= ruleInstanceEDOMFeature ) )* otherlv_3= '}' )? ) )
            // InternalT2A.g:672:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_insfeatures_2_0= ruleInstanceEDOMFeature ) )* otherlv_3= '}' )? )
            {
            // InternalT2A.g:672:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_insfeatures_2_0= ruleInstanceEDOMFeature ) )* otherlv_3= '}' )? )
            // InternalT2A.g:673:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_insfeatures_2_0= ruleInstanceEDOMFeature ) )* otherlv_3= '}' )?
            {
            // InternalT2A.g:673:3: ( (otherlv_0= RULE_ID ) )
            // InternalT2A.g:674:4: (otherlv_0= RULE_ID )
            {
            // InternalT2A.g:674:4: (otherlv_0= RULE_ID )
            // InternalT2A.g:675:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanciaEDOMRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_0, grammarAccess.getInstanciaEDOMAccess().getInstanciaEDOMCrossReference_0_0());
            				

            }


            }

            // InternalT2A.g:686:3: (otherlv_1= '{' ( (lv_insfeatures_2_0= ruleInstanceEDOMFeature ) )* otherlv_3= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==12) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalT2A.g:687:4: otherlv_1= '{' ( (lv_insfeatures_2_0= ruleInstanceEDOMFeature ) )* otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getInstanciaEDOMAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalT2A.g:691:4: ( (lv_insfeatures_2_0= ruleInstanceEDOMFeature ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalT2A.g:692:5: (lv_insfeatures_2_0= ruleInstanceEDOMFeature )
                    	    {
                    	    // InternalT2A.g:692:5: (lv_insfeatures_2_0= ruleInstanceEDOMFeature )
                    	    // InternalT2A.g:693:6: lv_insfeatures_2_0= ruleInstanceEDOMFeature
                    	    {

                    	    						newCompositeNode(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesInstanceEDOMFeatureParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
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
                    	    break loop18;
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
    // InternalT2A.g:719:1: entryRuleInstanceEDOMFeature returns [EObject current=null] : iv_ruleInstanceEDOMFeature= ruleInstanceEDOMFeature EOF ;
    public final EObject entryRuleInstanceEDOMFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceEDOMFeature = null;


        try {
            // InternalT2A.g:719:60: (iv_ruleInstanceEDOMFeature= ruleInstanceEDOMFeature EOF )
            // InternalT2A.g:720:2: iv_ruleInstanceEDOMFeature= ruleInstanceEDOMFeature EOF
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
    // InternalT2A.g:726:1: ruleInstanceEDOMFeature returns [EObject current=null] : ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInstanceEDOMFeature() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;
        EObject lv_instanciaEDOM_0_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:732:2: ( ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // InternalT2A.g:733:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // InternalT2A.g:733:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_STRING) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalT2A.g:734:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    {
                    // InternalT2A.g:734:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    // InternalT2A.g:735:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    {
                    // InternalT2A.g:735:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    // InternalT2A.g:736:5: lv_instanciaEDOM_0_0= ruleInstanciaEDOM
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
                    // InternalT2A.g:754:3: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // InternalT2A.g:754:3: ( (lv_string_1_0= RULE_STRING ) )
                    // InternalT2A.g:755:4: (lv_string_1_0= RULE_STRING )
                    {
                    // InternalT2A.g:755:4: (lv_string_1_0= RULE_STRING )
                    // InternalT2A.g:756:5: lv_string_1_0= RULE_STRING
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
    // InternalT2A.g:776:1: entryRulePageFeature returns [EObject current=null] : iv_rulePageFeature= rulePageFeature EOF ;
    public final EObject entryRulePageFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageFeature = null;


        try {
            // InternalT2A.g:776:52: (iv_rulePageFeature= rulePageFeature EOF )
            // InternalT2A.g:777:2: iv_rulePageFeature= rulePageFeature EOF
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
    // InternalT2A.g:783:1: rulePageFeature returns [EObject current=null] : ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject rulePageFeature() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;
        EObject lv_instanciaEDOM_0_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:789:2: ( ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // InternalT2A.g:790:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // InternalT2A.g:790:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_STRING) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalT2A.g:791:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    {
                    // InternalT2A.g:791:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    // InternalT2A.g:792:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    {
                    // InternalT2A.g:792:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    // InternalT2A.g:793:5: lv_instanciaEDOM_0_0= ruleInstanciaEDOM
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
                    // InternalT2A.g:811:3: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // InternalT2A.g:811:3: ( (lv_string_1_0= RULE_STRING ) )
                    // InternalT2A.g:812:4: (lv_string_1_0= RULE_STRING )
                    {
                    // InternalT2A.g:812:4: (lv_string_1_0= RULE_STRING )
                    // InternalT2A.g:813:5: lv_string_1_0= RULE_STRING
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
    // InternalT2A.g:833:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalT2A.g:833:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalT2A.g:834:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalT2A.g:840:1: ruleFeature returns [EObject current=null] : ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_AllowSlot_1_0= 'AllowSlot' ) ) | ( (lv_string_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_AllowSlot_1_0=null;
        Token lv_string_2_0=null;
        EObject lv_instanciaEDOM_0_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:846:2: ( ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_AllowSlot_1_0= 'AllowSlot' ) ) | ( (lv_string_2_0= RULE_STRING ) ) ) )
            // InternalT2A.g:847:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_AllowSlot_1_0= 'AllowSlot' ) ) | ( (lv_string_2_0= RULE_STRING ) ) )
            {
            // InternalT2A.g:847:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_AllowSlot_1_0= 'AllowSlot' ) ) | ( (lv_string_2_0= RULE_STRING ) ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt22=1;
                }
                break;
            case 22:
                {
                alt22=2;
                }
                break;
            case RULE_STRING:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalT2A.g:848:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    {
                    // InternalT2A.g:848:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    // InternalT2A.g:849:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    {
                    // InternalT2A.g:849:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    // InternalT2A.g:850:5: lv_instanciaEDOM_0_0= ruleInstanciaEDOM
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
                    // InternalT2A.g:868:3: ( (lv_AllowSlot_1_0= 'AllowSlot' ) )
                    {
                    // InternalT2A.g:868:3: ( (lv_AllowSlot_1_0= 'AllowSlot' ) )
                    // InternalT2A.g:869:4: (lv_AllowSlot_1_0= 'AllowSlot' )
                    {
                    // InternalT2A.g:869:4: (lv_AllowSlot_1_0= 'AllowSlot' )
                    // InternalT2A.g:870:5: lv_AllowSlot_1_0= 'AllowSlot'
                    {
                    lv_AllowSlot_1_0=(Token)match(input,22,FOLLOW_2); 

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
                    // InternalT2A.g:883:3: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // InternalT2A.g:883:3: ( (lv_string_2_0= RULE_STRING ) )
                    // InternalT2A.g:884:4: (lv_string_2_0= RULE_STRING )
                    {
                    // InternalT2A.g:884:4: (lv_string_2_0= RULE_STRING )
                    // InternalT2A.g:885:5: lv_string_2_0= RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000360802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001E030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000001C030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000014030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000406030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000404030L});

}