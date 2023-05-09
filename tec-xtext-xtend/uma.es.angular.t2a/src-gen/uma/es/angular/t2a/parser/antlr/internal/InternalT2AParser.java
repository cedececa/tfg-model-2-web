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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_STRING2", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AppName:'", "'Page'", "'{'", "'sclass'", "'}'", "'home'", "'showInNav'", "'StyleGlobal'", "'StyleOnline'", "'JSOnline'", "'StyleClass'", "';'", "'after'", "'active'", "'Dom'", "'sclassString'", "'Comp'", "'AllowSlot'", "'_'", "'#'", "'-'", "'*'", "'.'", "'::'", "'>'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
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
    // InternalT2A.g:71:1: ruleRoot returns [EObject current=null] : (otherlv_0= 'AppName:' ( (lv_appName_1_0= RULE_STRING ) ) ( (lv_globalStyle_2_0= ruleStyleGlobal ) )? ( (lv_styleOnline_3_0= ruleStyleOnline ) )? ( (lv_jsOnline_4_0= ruleJSOnline ) )? ( (lv_elements_5_0= ruleElement ) )+ ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_appName_1_0=null;
        EObject lv_globalStyle_2_0 = null;

        EObject lv_styleOnline_3_0 = null;

        EObject lv_jsOnline_4_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:77:2: ( (otherlv_0= 'AppName:' ( (lv_appName_1_0= RULE_STRING ) ) ( (lv_globalStyle_2_0= ruleStyleGlobal ) )? ( (lv_styleOnline_3_0= ruleStyleOnline ) )? ( (lv_jsOnline_4_0= ruleJSOnline ) )? ( (lv_elements_5_0= ruleElement ) )+ ) )
            // InternalT2A.g:78:2: (otherlv_0= 'AppName:' ( (lv_appName_1_0= RULE_STRING ) ) ( (lv_globalStyle_2_0= ruleStyleGlobal ) )? ( (lv_styleOnline_3_0= ruleStyleOnline ) )? ( (lv_jsOnline_4_0= ruleJSOnline ) )? ( (lv_elements_5_0= ruleElement ) )+ )
            {
            // InternalT2A.g:78:2: (otherlv_0= 'AppName:' ( (lv_appName_1_0= RULE_STRING ) ) ( (lv_globalStyle_2_0= ruleStyleGlobal ) )? ( (lv_styleOnline_3_0= ruleStyleOnline ) )? ( (lv_jsOnline_4_0= ruleJSOnline ) )? ( (lv_elements_5_0= ruleElement ) )+ )
            // InternalT2A.g:79:3: otherlv_0= 'AppName:' ( (lv_appName_1_0= RULE_STRING ) ) ( (lv_globalStyle_2_0= ruleStyleGlobal ) )? ( (lv_styleOnline_3_0= ruleStyleOnline ) )? ( (lv_jsOnline_4_0= ruleJSOnline ) )? ( (lv_elements_5_0= ruleElement ) )+
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRootAccess().getAppNameKeyword_0());
            		
            // InternalT2A.g:83:3: ( (lv_appName_1_0= RULE_STRING ) )
            // InternalT2A.g:84:4: (lv_appName_1_0= RULE_STRING )
            {
            // InternalT2A.g:84:4: (lv_appName_1_0= RULE_STRING )
            // InternalT2A.g:85:5: lv_appName_1_0= RULE_STRING
            {
            lv_appName_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_appName_1_0, grammarAccess.getRootAccess().getAppNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRootRule());
            					}
            					setWithLastConsumed(
            						current,
            						"appName",
            						lv_appName_1_0,
            						"uma.es.angular.t2a.T2A.STRING");
            				

            }


            }

            // InternalT2A.g:101:3: ( (lv_globalStyle_2_0= ruleStyleGlobal ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalT2A.g:102:4: (lv_globalStyle_2_0= ruleStyleGlobal )
                    {
                    // InternalT2A.g:102:4: (lv_globalStyle_2_0= ruleStyleGlobal )
                    // InternalT2A.g:103:5: lv_globalStyle_2_0= ruleStyleGlobal
                    {

                    					newCompositeNode(grammarAccess.getRootAccess().getGlobalStyleStyleGlobalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_globalStyle_2_0=ruleStyleGlobal();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRootRule());
                    					}
                    					set(
                    						current,
                    						"globalStyle",
                    						lv_globalStyle_2_0,
                    						"uma.es.angular.t2a.T2A.StyleGlobal");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalT2A.g:120:3: ( (lv_styleOnline_3_0= ruleStyleOnline ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalT2A.g:121:4: (lv_styleOnline_3_0= ruleStyleOnline )
                    {
                    // InternalT2A.g:121:4: (lv_styleOnline_3_0= ruleStyleOnline )
                    // InternalT2A.g:122:5: lv_styleOnline_3_0= ruleStyleOnline
                    {

                    					newCompositeNode(grammarAccess.getRootAccess().getStyleOnlineStyleOnlineParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_styleOnline_3_0=ruleStyleOnline();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRootRule());
                    					}
                    					set(
                    						current,
                    						"styleOnline",
                    						lv_styleOnline_3_0,
                    						"uma.es.angular.t2a.T2A.StyleOnline");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalT2A.g:139:3: ( (lv_jsOnline_4_0= ruleJSOnline ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalT2A.g:140:4: (lv_jsOnline_4_0= ruleJSOnline )
                    {
                    // InternalT2A.g:140:4: (lv_jsOnline_4_0= ruleJSOnline )
                    // InternalT2A.g:141:5: lv_jsOnline_4_0= ruleJSOnline
                    {

                    					newCompositeNode(grammarAccess.getRootAccess().getJsOnlineJSOnlineParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_jsOnline_4_0=ruleJSOnline();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRootRule());
                    					}
                    					set(
                    						current,
                    						"jsOnline",
                    						lv_jsOnline_4_0,
                    						"uma.es.angular.t2a.T2A.JSOnline");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalT2A.g:158:3: ( (lv_elements_5_0= ruleElement ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13||LA4_0==22||LA4_0==26||LA4_0==28) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalT2A.g:159:4: (lv_elements_5_0= ruleElement )
            	    {
            	    // InternalT2A.g:159:4: (lv_elements_5_0= ruleElement )
            	    // InternalT2A.g:160:5: lv_elements_5_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getRootAccess().getElementsElementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_elements_5_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_5_0,
            	    						"uma.es.angular.t2a.T2A.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // InternalT2A.g:181:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalT2A.g:181:48: (iv_ruleElement= ruleElement EOF )
            // InternalT2A.g:182:2: iv_ruleElement= ruleElement EOF
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
    // InternalT2A.g:188:1: ruleElement returns [EObject current=null] : (this_Page_0= rulePage | this_EDOM_1= ruleEDOM ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Page_0 = null;

        EObject this_EDOM_1 = null;



        	enterRule();

        try {
            // InternalT2A.g:194:2: ( (this_Page_0= rulePage | this_EDOM_1= ruleEDOM ) )
            // InternalT2A.g:195:2: (this_Page_0= rulePage | this_EDOM_1= ruleEDOM )
            {
            // InternalT2A.g:195:2: (this_Page_0= rulePage | this_EDOM_1= ruleEDOM )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==22||LA5_0==26||LA5_0==28) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalT2A.g:196:3: this_Page_0= rulePage
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
                    // InternalT2A.g:205:3: this_EDOM_1= ruleEDOM
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
    // InternalT2A.g:217:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // InternalT2A.g:217:45: (iv_rulePage= rulePage EOF )
            // InternalT2A.g:218:2: iv_rulePage= rulePage EOF
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
    // InternalT2A.g:224:1: rulePage returns [EObject current=null] : (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_home_7_0= 'home' ) )? ( (lv_showInNav_8_0= 'showInNav' ) )? ( (lv_pageFeatures_9_0= rulePageFeature ) )* otherlv_10= '}' ) ;
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
            // InternalT2A.g:230:2: ( (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_home_7_0= 'home' ) )? ( (lv_showInNav_8_0= 'showInNav' ) )? ( (lv_pageFeatures_9_0= rulePageFeature ) )* otherlv_10= '}' ) )
            // InternalT2A.g:231:2: (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_home_7_0= 'home' ) )? ( (lv_showInNav_8_0= 'showInNav' ) )? ( (lv_pageFeatures_9_0= rulePageFeature ) )* otherlv_10= '}' )
            {
            // InternalT2A.g:231:2: (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_home_7_0= 'home' ) )? ( (lv_showInNav_8_0= 'showInNav' ) )? ( (lv_pageFeatures_9_0= rulePageFeature ) )* otherlv_10= '}' )
            // InternalT2A.g:232:3: otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? ( (lv_home_7_0= 'home' ) )? ( (lv_showInNav_8_0= 'showInNav' ) )? ( (lv_pageFeatures_9_0= rulePageFeature ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
            		
            // InternalT2A.g:236:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalT2A.g:237:4: (lv_name_1_0= RULE_ID )
            {
            // InternalT2A.g:237:4: (lv_name_1_0= RULE_ID )
            // InternalT2A.g:238:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalT2A.g:258:3: (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalT2A.g:259:4: otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getPageAccess().getSclassKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalT2A.g:267:4: ( (otherlv_5= RULE_ID ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalT2A.g:268:5: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalT2A.g:268:5: (otherlv_5= RULE_ID )
                    	    // InternalT2A.g:269:6: otherlv_5= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getPageRule());
                    	    						}
                    	    					
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_9); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getPageAccess().getHostclassesStyleClassCrossReference_3_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalT2A.g:285:3: ( (lv_home_7_0= 'home' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalT2A.g:286:4: (lv_home_7_0= 'home' )
                    {
                    // InternalT2A.g:286:4: (lv_home_7_0= 'home' )
                    // InternalT2A.g:287:5: lv_home_7_0= 'home'
                    {
                    lv_home_7_0=(Token)match(input,17,FOLLOW_11); 

                    					newLeafNode(lv_home_7_0, grammarAccess.getPageAccess().getHomeHomeKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPageRule());
                    					}
                    					setWithLastConsumed(current, "home", lv_home_7_0 != null, "home");
                    				

                    }


                    }
                    break;

            }

            // InternalT2A.g:299:3: ( (lv_showInNav_8_0= 'showInNav' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalT2A.g:300:4: (lv_showInNav_8_0= 'showInNav' )
                    {
                    // InternalT2A.g:300:4: (lv_showInNav_8_0= 'showInNav' )
                    // InternalT2A.g:301:5: lv_showInNav_8_0= 'showInNav'
                    {
                    lv_showInNav_8_0=(Token)match(input,18,FOLLOW_12); 

                    					newLeafNode(lv_showInNav_8_0, grammarAccess.getPageAccess().getShowInNavShowInNavKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPageRule());
                    					}
                    					setWithLastConsumed(current, "showInNav", lv_showInNav_8_0 != null, "showInNav");
                    				

                    }


                    }
                    break;

            }

            // InternalT2A.g:313:3: ( (lv_pageFeatures_9_0= rulePageFeature ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalT2A.g:314:4: (lv_pageFeatures_9_0= rulePageFeature )
            	    {
            	    // InternalT2A.g:314:4: (lv_pageFeatures_9_0= rulePageFeature )
            	    // InternalT2A.g:315:5: lv_pageFeatures_9_0= rulePageFeature
            	    {

            	    					newCompositeNode(grammarAccess.getPageAccess().getPageFeaturesPageFeatureParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
            	    break loop10;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

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
    // InternalT2A.g:340:1: entryRuleEDOM returns [EObject current=null] : iv_ruleEDOM= ruleEDOM EOF ;
    public final EObject entryRuleEDOM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDOM = null;


        try {
            // InternalT2A.g:340:45: (iv_ruleEDOM= ruleEDOM EOF )
            // InternalT2A.g:341:2: iv_ruleEDOM= ruleEDOM EOF
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
    // InternalT2A.g:347:1: ruleEDOM returns [EObject current=null] : (this_DOM_0= ruleDOM | this_Comp_1= ruleComp | this_StyleClass_2= ruleStyleClass ) ;
    public final EObject ruleEDOM() throws RecognitionException {
        EObject current = null;

        EObject this_DOM_0 = null;

        EObject this_Comp_1 = null;

        EObject this_StyleClass_2 = null;



        	enterRule();

        try {
            // InternalT2A.g:353:2: ( (this_DOM_0= ruleDOM | this_Comp_1= ruleComp | this_StyleClass_2= ruleStyleClass ) )
            // InternalT2A.g:354:2: (this_DOM_0= ruleDOM | this_Comp_1= ruleComp | this_StyleClass_2= ruleStyleClass )
            {
            // InternalT2A.g:354:2: (this_DOM_0= ruleDOM | this_Comp_1= ruleComp | this_StyleClass_2= ruleStyleClass )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt11=1;
                }
                break;
            case 28:
                {
                alt11=2;
                }
                break;
            case 22:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalT2A.g:355:3: this_DOM_0= ruleDOM
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
                    // InternalT2A.g:364:3: this_Comp_1= ruleComp
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
                    // InternalT2A.g:373:3: this_StyleClass_2= ruleStyleClass
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
    // InternalT2A.g:385:1: entryRuleStyleGlobal returns [EObject current=null] : iv_ruleStyleGlobal= ruleStyleGlobal EOF ;
    public final EObject entryRuleStyleGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleGlobal = null;


        try {
            // InternalT2A.g:385:52: (iv_ruleStyleGlobal= ruleStyleGlobal EOF )
            // InternalT2A.g:386:2: iv_ruleStyleGlobal= ruleStyleGlobal EOF
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
    // InternalT2A.g:392:1: ruleStyleGlobal returns [EObject current=null] : ( () otherlv_1= 'StyleGlobal' otherlv_2= '{' ( (lv_styleclasses_3_0= ruleStyleClass ) )* otherlv_4= '}' ) ;
    public final EObject ruleStyleGlobal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_styleclasses_3_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:398:2: ( ( () otherlv_1= 'StyleGlobal' otherlv_2= '{' ( (lv_styleclasses_3_0= ruleStyleClass ) )* otherlv_4= '}' ) )
            // InternalT2A.g:399:2: ( () otherlv_1= 'StyleGlobal' otherlv_2= '{' ( (lv_styleclasses_3_0= ruleStyleClass ) )* otherlv_4= '}' )
            {
            // InternalT2A.g:399:2: ( () otherlv_1= 'StyleGlobal' otherlv_2= '{' ( (lv_styleclasses_3_0= ruleStyleClass ) )* otherlv_4= '}' )
            // InternalT2A.g:400:3: () otherlv_1= 'StyleGlobal' otherlv_2= '{' ( (lv_styleclasses_3_0= ruleStyleClass ) )* otherlv_4= '}'
            {
            // InternalT2A.g:400:3: ()
            // InternalT2A.g:401:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStyleGlobalAccess().getStyleGlobalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getStyleGlobalAccess().getStyleGlobalKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getStyleGlobalAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalT2A.g:415:3: ( (lv_styleclasses_3_0= ruleStyleClass ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalT2A.g:416:4: (lv_styleclasses_3_0= ruleStyleClass )
            	    {
            	    // InternalT2A.g:416:4: (lv_styleclasses_3_0= ruleStyleClass )
            	    // InternalT2A.g:417:5: lv_styleclasses_3_0= ruleStyleClass
            	    {

            	    					newCompositeNode(grammarAccess.getStyleGlobalAccess().getStyleclassesStyleClassParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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


    // $ANTLR start "entryRuleStyleOnline"
    // InternalT2A.g:442:1: entryRuleStyleOnline returns [EObject current=null] : iv_ruleStyleOnline= ruleStyleOnline EOF ;
    public final EObject entryRuleStyleOnline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleOnline = null;


        try {
            // InternalT2A.g:442:52: (iv_ruleStyleOnline= ruleStyleOnline EOF )
            // InternalT2A.g:443:2: iv_ruleStyleOnline= ruleStyleOnline EOF
            {
             newCompositeNode(grammarAccess.getStyleOnlineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStyleOnline=ruleStyleOnline();

            state._fsp--;

             current =iv_ruleStyleOnline; 
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
    // $ANTLR end "entryRuleStyleOnline"


    // $ANTLR start "ruleStyleOnline"
    // InternalT2A.g:449:1: ruleStyleOnline returns [EObject current=null] : ( () otherlv_1= 'StyleOnline' otherlv_2= '{' ( (lv_fullTags_3_0= RULE_STRING ) )* otherlv_4= '}' ) ;
    public final EObject ruleStyleOnline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_fullTags_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalT2A.g:455:2: ( ( () otherlv_1= 'StyleOnline' otherlv_2= '{' ( (lv_fullTags_3_0= RULE_STRING ) )* otherlv_4= '}' ) )
            // InternalT2A.g:456:2: ( () otherlv_1= 'StyleOnline' otherlv_2= '{' ( (lv_fullTags_3_0= RULE_STRING ) )* otherlv_4= '}' )
            {
            // InternalT2A.g:456:2: ( () otherlv_1= 'StyleOnline' otherlv_2= '{' ( (lv_fullTags_3_0= RULE_STRING ) )* otherlv_4= '}' )
            // InternalT2A.g:457:3: () otherlv_1= 'StyleOnline' otherlv_2= '{' ( (lv_fullTags_3_0= RULE_STRING ) )* otherlv_4= '}'
            {
            // InternalT2A.g:457:3: ()
            // InternalT2A.g:458:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStyleOnlineAccess().getStyleOnlineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getStyleOnlineAccess().getStyleOnlineKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getStyleOnlineAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalT2A.g:472:3: ( (lv_fullTags_3_0= RULE_STRING ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalT2A.g:473:4: (lv_fullTags_3_0= RULE_STRING )
            	    {
            	    // InternalT2A.g:473:4: (lv_fullTags_3_0= RULE_STRING )
            	    // InternalT2A.g:474:5: lv_fullTags_3_0= RULE_STRING
            	    {
            	    lv_fullTags_3_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            	    					newLeafNode(lv_fullTags_3_0, grammarAccess.getStyleOnlineAccess().getFullTagsSTRINGTerminalRuleCall_3_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getStyleOnlineRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"fullTags",
            	    						lv_fullTags_3_0,
            	    						"uma.es.angular.t2a.T2A.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStyleOnlineAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleStyleOnline"


    // $ANTLR start "entryRuleJSOnline"
    // InternalT2A.g:498:1: entryRuleJSOnline returns [EObject current=null] : iv_ruleJSOnline= ruleJSOnline EOF ;
    public final EObject entryRuleJSOnline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSOnline = null;


        try {
            // InternalT2A.g:498:49: (iv_ruleJSOnline= ruleJSOnline EOF )
            // InternalT2A.g:499:2: iv_ruleJSOnline= ruleJSOnline EOF
            {
             newCompositeNode(grammarAccess.getJSOnlineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSOnline=ruleJSOnline();

            state._fsp--;

             current =iv_ruleJSOnline; 
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
    // $ANTLR end "entryRuleJSOnline"


    // $ANTLR start "ruleJSOnline"
    // InternalT2A.g:505:1: ruleJSOnline returns [EObject current=null] : ( () otherlv_1= 'JSOnline' otherlv_2= '{' ( (lv_fullTags_3_0= RULE_STRING ) )* otherlv_4= '}' ) ;
    public final EObject ruleJSOnline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_fullTags_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalT2A.g:511:2: ( ( () otherlv_1= 'JSOnline' otherlv_2= '{' ( (lv_fullTags_3_0= RULE_STRING ) )* otherlv_4= '}' ) )
            // InternalT2A.g:512:2: ( () otherlv_1= 'JSOnline' otherlv_2= '{' ( (lv_fullTags_3_0= RULE_STRING ) )* otherlv_4= '}' )
            {
            // InternalT2A.g:512:2: ( () otherlv_1= 'JSOnline' otherlv_2= '{' ( (lv_fullTags_3_0= RULE_STRING ) )* otherlv_4= '}' )
            // InternalT2A.g:513:3: () otherlv_1= 'JSOnline' otherlv_2= '{' ( (lv_fullTags_3_0= RULE_STRING ) )* otherlv_4= '}'
            {
            // InternalT2A.g:513:3: ()
            // InternalT2A.g:514:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJSOnlineAccess().getJSOnlineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getJSOnlineAccess().getJSOnlineKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getJSOnlineAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalT2A.g:528:3: ( (lv_fullTags_3_0= RULE_STRING ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_STRING) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalT2A.g:529:4: (lv_fullTags_3_0= RULE_STRING )
            	    {
            	    // InternalT2A.g:529:4: (lv_fullTags_3_0= RULE_STRING )
            	    // InternalT2A.g:530:5: lv_fullTags_3_0= RULE_STRING
            	    {
            	    lv_fullTags_3_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            	    					newLeafNode(lv_fullTags_3_0, grammarAccess.getJSOnlineAccess().getFullTagsSTRINGTerminalRuleCall_3_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getJSOnlineRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"fullTags",
            	    						lv_fullTags_3_0,
            	    						"uma.es.angular.t2a.T2A.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getJSOnlineAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleJSOnline"


    // $ANTLR start "entryRuleStyleClass"
    // InternalT2A.g:554:1: entryRuleStyleClass returns [EObject current=null] : iv_ruleStyleClass= ruleStyleClass EOF ;
    public final EObject entryRuleStyleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleClass = null;


        try {
            // InternalT2A.g:554:51: (iv_ruleStyleClass= ruleStyleClass EOF )
            // InternalT2A.g:555:2: iv_ruleStyleClass= ruleStyleClass EOF
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
    // InternalT2A.g:561:1: ruleStyleClass returns [EObject current=null] : (otherlv_0= 'StyleClass' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_sattributes_3_0= ruleSAttributeAndValue ) ) otherlv_4= ';' )* (otherlv_5= 'after' otherlv_6= '{' ( ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';' )* otherlv_9= '}' )? (otherlv_10= 'active' otherlv_11= '{' ( ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';' )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // InternalT2A.g:567:2: ( (otherlv_0= 'StyleClass' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_sattributes_3_0= ruleSAttributeAndValue ) ) otherlv_4= ';' )* (otherlv_5= 'after' otherlv_6= '{' ( ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';' )* otherlv_9= '}' )? (otherlv_10= 'active' otherlv_11= '{' ( ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';' )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalT2A.g:568:2: (otherlv_0= 'StyleClass' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_sattributes_3_0= ruleSAttributeAndValue ) ) otherlv_4= ';' )* (otherlv_5= 'after' otherlv_6= '{' ( ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';' )* otherlv_9= '}' )? (otherlv_10= 'active' otherlv_11= '{' ( ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';' )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalT2A.g:568:2: (otherlv_0= 'StyleClass' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_sattributes_3_0= ruleSAttributeAndValue ) ) otherlv_4= ';' )* (otherlv_5= 'after' otherlv_6= '{' ( ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';' )* otherlv_9= '}' )? (otherlv_10= 'active' otherlv_11= '{' ( ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';' )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalT2A.g:569:3: otherlv_0= 'StyleClass' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_sattributes_3_0= ruleSAttributeAndValue ) ) otherlv_4= ';' )* (otherlv_5= 'after' otherlv_6= '{' ( ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';' )* otherlv_9= '}' )? (otherlv_10= 'active' otherlv_11= '{' ( ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';' )* otherlv_14= '}' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getStyleClassAccess().getStyleClassKeyword_0());
            		
            // InternalT2A.g:573:3: ( (lv_name_1_0= ruleName ) )
            // InternalT2A.g:574:4: (lv_name_1_0= ruleName )
            {
            // InternalT2A.g:574:4: (lv_name_1_0= ruleName )
            // InternalT2A.g:575:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getStyleClassAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_2=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getStyleClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalT2A.g:596:3: ( ( (lv_sattributes_3_0= ruleSAttributeAndValue ) ) otherlv_4= ';' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==EOF||(LA15_0>=RULE_ID && LA15_0<=RULE_STRING2)||LA15_0==14||(LA15_0>=30 && LA15_0<=36)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalT2A.g:597:4: ( (lv_sattributes_3_0= ruleSAttributeAndValue ) ) otherlv_4= ';'
            	    {
            	    // InternalT2A.g:597:4: ( (lv_sattributes_3_0= ruleSAttributeAndValue ) )
            	    // InternalT2A.g:598:5: (lv_sattributes_3_0= ruleSAttributeAndValue )
            	    {
            	    // InternalT2A.g:598:5: (lv_sattributes_3_0= ruleSAttributeAndValue )
            	    // InternalT2A.g:599:6: lv_sattributes_3_0= ruleSAttributeAndValue
            	    {

            	    						newCompositeNode(grammarAccess.getStyleClassAccess().getSattributesSAttributeAndValueParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_17);
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

            	    otherlv_4=(Token)match(input,23,FOLLOW_16); 

            	    				newLeafNode(otherlv_4, grammarAccess.getStyleClassAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalT2A.g:621:3: (otherlv_5= 'after' otherlv_6= '{' ( ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';' )* otherlv_9= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalT2A.g:622:4: otherlv_5= 'after' otherlv_6= '{' ( ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';' )* otherlv_9= '}'
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getStyleClassAccess().getAfterKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,14,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getStyleClassAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalT2A.g:630:4: ( ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';' )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==EOF||(LA16_0>=RULE_ID && LA16_0<=RULE_STRING2)||LA16_0==14||(LA16_0>=30 && LA16_0<=36)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalT2A.g:631:5: ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) ) otherlv_8= ';'
                    	    {
                    	    // InternalT2A.g:631:5: ( (lv_sattributesAfter_7_0= ruleSAttributeAndValue ) )
                    	    // InternalT2A.g:632:6: (lv_sattributesAfter_7_0= ruleSAttributeAndValue )
                    	    {
                    	    // InternalT2A.g:632:6: (lv_sattributesAfter_7_0= ruleSAttributeAndValue )
                    	    // InternalT2A.g:633:7: lv_sattributesAfter_7_0= ruleSAttributeAndValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getStyleClassAccess().getSattributesAfterSAttributeAndValueParserRuleCall_4_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
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

                    	    otherlv_8=(Token)match(input,23,FOLLOW_18); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getStyleClassAccess().getSemicolonKeyword_4_2_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_19); 

                    				newLeafNode(otherlv_9, grammarAccess.getStyleClassAccess().getRightCurlyBracketKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalT2A.g:660:3: (otherlv_10= 'active' otherlv_11= '{' ( ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';' )* otherlv_14= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalT2A.g:661:4: otherlv_10= 'active' otherlv_11= '{' ( ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';' )* otherlv_14= '}'
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getStyleClassAccess().getActiveKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,14,FOLLOW_18); 

                    				newLeafNode(otherlv_11, grammarAccess.getStyleClassAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalT2A.g:669:4: ( ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';' )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==EOF||(LA18_0>=RULE_ID && LA18_0<=RULE_STRING2)||LA18_0==14||(LA18_0>=30 && LA18_0<=36)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalT2A.g:670:5: ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) ) otherlv_13= ';'
                    	    {
                    	    // InternalT2A.g:670:5: ( (lv_sattributesActive_12_0= ruleSAttributeAndValue ) )
                    	    // InternalT2A.g:671:6: (lv_sattributesActive_12_0= ruleSAttributeAndValue )
                    	    {
                    	    // InternalT2A.g:671:6: (lv_sattributesActive_12_0= ruleSAttributeAndValue )
                    	    // InternalT2A.g:672:7: lv_sattributesActive_12_0= ruleSAttributeAndValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getStyleClassAccess().getSattributesActiveSAttributeAndValueParserRuleCall_5_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
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

                    	    otherlv_13=(Token)match(input,23,FOLLOW_18); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getStyleClassAccess().getSemicolonKeyword_5_2_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FOLLOW_20); 

                    				newLeafNode(otherlv_14, grammarAccess.getStyleClassAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,16,FOLLOW_2); 

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
    // InternalT2A.g:707:1: entryRuleSAttributeAndValue returns [EObject current=null] : iv_ruleSAttributeAndValue= ruleSAttributeAndValue EOF ;
    public final EObject entryRuleSAttributeAndValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAttributeAndValue = null;


        try {
            // InternalT2A.g:707:59: (iv_ruleSAttributeAndValue= ruleSAttributeAndValue EOF )
            // InternalT2A.g:708:2: iv_ruleSAttributeAndValue= ruleSAttributeAndValue EOF
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
    // InternalT2A.g:714:1: ruleSAttributeAndValue returns [EObject current=null] : ( ( (lv_stname_0_0= ruleName ) ) ( (lv_value_1_0= RULE_STRING2 ) ) ) ;
    public final EObject ruleSAttributeAndValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        AntlrDatatypeRuleToken lv_stname_0_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:720:2: ( ( ( (lv_stname_0_0= ruleName ) ) ( (lv_value_1_0= RULE_STRING2 ) ) ) )
            // InternalT2A.g:721:2: ( ( (lv_stname_0_0= ruleName ) ) ( (lv_value_1_0= RULE_STRING2 ) ) )
            {
            // InternalT2A.g:721:2: ( ( (lv_stname_0_0= ruleName ) ) ( (lv_value_1_0= RULE_STRING2 ) ) )
            // InternalT2A.g:722:3: ( (lv_stname_0_0= ruleName ) ) ( (lv_value_1_0= RULE_STRING2 ) )
            {
            // InternalT2A.g:722:3: ( (lv_stname_0_0= ruleName ) )
            // InternalT2A.g:723:4: (lv_stname_0_0= ruleName )
            {
            // InternalT2A.g:723:4: (lv_stname_0_0= ruleName )
            // InternalT2A.g:724:5: lv_stname_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getSAttributeAndValueAccess().getStnameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalT2A.g:741:3: ( (lv_value_1_0= RULE_STRING2 ) )
            // InternalT2A.g:742:4: (lv_value_1_0= RULE_STRING2 )
            {
            // InternalT2A.g:742:4: (lv_value_1_0= RULE_STRING2 )
            // InternalT2A.g:743:5: lv_value_1_0= RULE_STRING2
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
    // InternalT2A.g:763:1: entryRuleDOM returns [EObject current=null] : iv_ruleDOM= ruleDOM EOF ;
    public final EObject entryRuleDOM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOM = null;


        try {
            // InternalT2A.g:763:44: (iv_ruleDOM= ruleDOM EOF )
            // InternalT2A.g:764:2: iv_ruleDOM= ruleDOM EOF
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
    // InternalT2A.g:770:1: ruleDOM returns [EObject current=null] : (otherlv_0= 'Dom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? (otherlv_7= 'sclassString' otherlv_8= '{' ( (lv_sclassesOnline_9_0= RULE_STRING ) )* otherlv_10= '}' )? ( (lv_features_11_0= ruleFeature ) )* otherlv_12= '}' )? ) ;
    public final EObject ruleDOM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_sclassesOnline_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_features_11_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:776:2: ( (otherlv_0= 'Dom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? (otherlv_7= 'sclassString' otherlv_8= '{' ( (lv_sclassesOnline_9_0= RULE_STRING ) )* otherlv_10= '}' )? ( (lv_features_11_0= ruleFeature ) )* otherlv_12= '}' )? ) )
            // InternalT2A.g:777:2: (otherlv_0= 'Dom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? (otherlv_7= 'sclassString' otherlv_8= '{' ( (lv_sclassesOnline_9_0= RULE_STRING ) )* otherlv_10= '}' )? ( (lv_features_11_0= ruleFeature ) )* otherlv_12= '}' )? )
            {
            // InternalT2A.g:777:2: (otherlv_0= 'Dom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? (otherlv_7= 'sclassString' otherlv_8= '{' ( (lv_sclassesOnline_9_0= RULE_STRING ) )* otherlv_10= '}' )? ( (lv_features_11_0= ruleFeature ) )* otherlv_12= '}' )? )
            // InternalT2A.g:778:3: otherlv_0= 'Dom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? (otherlv_7= 'sclassString' otherlv_8= '{' ( (lv_sclassesOnline_9_0= RULE_STRING ) )* otherlv_10= '}' )? ( (lv_features_11_0= ruleFeature ) )* otherlv_12= '}' )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDOMAccess().getDomKeyword_0());
            		
            // InternalT2A.g:782:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalT2A.g:783:4: (lv_name_1_0= RULE_ID )
            {
            // InternalT2A.g:783:4: (lv_name_1_0= RULE_ID )
            // InternalT2A.g:784:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            // InternalT2A.g:800:3: (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? (otherlv_7= 'sclassString' otherlv_8= '{' ( (lv_sclassesOnline_9_0= RULE_STRING ) )* otherlv_10= '}' )? ( (lv_features_11_0= ruleFeature ) )* otherlv_12= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==14) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalT2A.g:801:4: otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? (otherlv_7= 'sclassString' otherlv_8= '{' ( (lv_sclassesOnline_9_0= RULE_STRING ) )* otherlv_10= '}' )? ( (lv_features_11_0= ruleFeature ) )* otherlv_12= '}'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getDOMAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalT2A.g:805:4: (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==15) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalT2A.g:806:5: otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}'
                            {
                            otherlv_3=(Token)match(input,15,FOLLOW_7); 

                            					newLeafNode(otherlv_3, grammarAccess.getDOMAccess().getSclassKeyword_2_1_0());
                            				
                            otherlv_4=(Token)match(input,14,FOLLOW_9); 

                            					newLeafNode(otherlv_4, grammarAccess.getDOMAccess().getLeftCurlyBracketKeyword_2_1_1());
                            				
                            // InternalT2A.g:814:5: ( (otherlv_5= RULE_ID ) )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==RULE_ID) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // InternalT2A.g:815:6: (otherlv_5= RULE_ID )
                            	    {
                            	    // InternalT2A.g:815:6: (otherlv_5= RULE_ID )
                            	    // InternalT2A.g:816:7: otherlv_5= RULE_ID
                            	    {

                            	    							if (current==null) {
                            	    								current = createModelElement(grammarAccess.getDOMRule());
                            	    							}
                            	    						
                            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_9); 

                            	    							newLeafNode(otherlv_5, grammarAccess.getDOMAccess().getSclassesStyleClassCrossReference_2_1_2_0());
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop20;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,16,FOLLOW_24); 

                            					newLeafNode(otherlv_6, grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_1_3());
                            				

                            }
                            break;

                    }

                    // InternalT2A.g:832:4: (otherlv_7= 'sclassString' otherlv_8= '{' ( (lv_sclassesOnline_9_0= RULE_STRING ) )* otherlv_10= '}' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==27) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalT2A.g:833:5: otherlv_7= 'sclassString' otherlv_8= '{' ( (lv_sclassesOnline_9_0= RULE_STRING ) )* otherlv_10= '}'
                            {
                            otherlv_7=(Token)match(input,27,FOLLOW_7); 

                            					newLeafNode(otherlv_7, grammarAccess.getDOMAccess().getSclassStringKeyword_2_2_0());
                            				
                            otherlv_8=(Token)match(input,14,FOLLOW_14); 

                            					newLeafNode(otherlv_8, grammarAccess.getDOMAccess().getLeftCurlyBracketKeyword_2_2_1());
                            				
                            // InternalT2A.g:841:5: ( (lv_sclassesOnline_9_0= RULE_STRING ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==RULE_STRING) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // InternalT2A.g:842:6: (lv_sclassesOnline_9_0= RULE_STRING )
                            	    {
                            	    // InternalT2A.g:842:6: (lv_sclassesOnline_9_0= RULE_STRING )
                            	    // InternalT2A.g:843:7: lv_sclassesOnline_9_0= RULE_STRING
                            	    {
                            	    lv_sclassesOnline_9_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                            	    							newLeafNode(lv_sclassesOnline_9_0, grammarAccess.getDOMAccess().getSclassesOnlineSTRINGTerminalRuleCall_2_2_2_0());
                            	    						

                            	    							if (current==null) {
                            	    								current = createModelElement(grammarAccess.getDOMRule());
                            	    							}
                            	    							addWithLastConsumed(
                            	    								current,
                            	    								"sclassesOnline",
                            	    								lv_sclassesOnline_9_0,
                            	    								"uma.es.angular.t2a.T2A.STRING");
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop22;
                                }
                            } while (true);

                            otherlv_10=(Token)match(input,16,FOLLOW_25); 

                            					newLeafNode(otherlv_10, grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_2_3());
                            				

                            }
                            break;

                    }

                    // InternalT2A.g:864:4: ( (lv_features_11_0= ruleFeature ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)||LA24_0==29) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalT2A.g:865:5: (lv_features_11_0= ruleFeature )
                    	    {
                    	    // InternalT2A.g:865:5: (lv_features_11_0= ruleFeature )
                    	    // InternalT2A.g:866:6: lv_features_11_0= ruleFeature
                    	    {

                    	    						newCompositeNode(grammarAccess.getDOMAccess().getFeaturesFeatureParserRuleCall_2_3_0());
                    	    					
                    	    pushFollow(FOLLOW_25);
                    	    lv_features_11_0=ruleFeature();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDOMRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"features",
                    	    							lv_features_11_0,
                    	    							"uma.es.angular.t2a.T2A.Feature");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getDOMAccess().getRightCurlyBracketKeyword_2_4());
                    			

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
    // InternalT2A.g:892:1: entryRuleComp returns [EObject current=null] : iv_ruleComp= ruleComp EOF ;
    public final EObject entryRuleComp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComp = null;


        try {
            // InternalT2A.g:892:45: (iv_ruleComp= ruleComp EOF )
            // InternalT2A.g:893:2: iv_ruleComp= ruleComp EOF
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
    // InternalT2A.g:899:1: ruleComp returns [EObject current=null] : (otherlv_0= 'Comp' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? (otherlv_7= 'sclassString' otherlv_8= '{' ( (lv_sclassesOnline_9_0= RULE_STRING ) )* otherlv_10= '}' )? ( (lv_features_11_0= ruleFeature ) )* otherlv_12= '}' )? ) ;
    public final EObject ruleComp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_sclassesOnline_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_features_11_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:905:2: ( (otherlv_0= 'Comp' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? (otherlv_7= 'sclassString' otherlv_8= '{' ( (lv_sclassesOnline_9_0= RULE_STRING ) )* otherlv_10= '}' )? ( (lv_features_11_0= ruleFeature ) )* otherlv_12= '}' )? ) )
            // InternalT2A.g:906:2: (otherlv_0= 'Comp' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? (otherlv_7= 'sclassString' otherlv_8= '{' ( (lv_sclassesOnline_9_0= RULE_STRING ) )* otherlv_10= '}' )? ( (lv_features_11_0= ruleFeature ) )* otherlv_12= '}' )? )
            {
            // InternalT2A.g:906:2: (otherlv_0= 'Comp' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? (otherlv_7= 'sclassString' otherlv_8= '{' ( (lv_sclassesOnline_9_0= RULE_STRING ) )* otherlv_10= '}' )? ( (lv_features_11_0= ruleFeature ) )* otherlv_12= '}' )? )
            // InternalT2A.g:907:3: otherlv_0= 'Comp' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? (otherlv_7= 'sclassString' otherlv_8= '{' ( (lv_sclassesOnline_9_0= RULE_STRING ) )* otherlv_10= '}' )? ( (lv_features_11_0= ruleFeature ) )* otherlv_12= '}' )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCompAccess().getCompKeyword_0());
            		
            // InternalT2A.g:911:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalT2A.g:912:4: (lv_name_1_0= RULE_ID )
            {
            // InternalT2A.g:912:4: (lv_name_1_0= RULE_ID )
            // InternalT2A.g:913:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            // InternalT2A.g:929:3: (otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? (otherlv_7= 'sclassString' otherlv_8= '{' ( (lv_sclassesOnline_9_0= RULE_STRING ) )* otherlv_10= '}' )? ( (lv_features_11_0= ruleFeature ) )* otherlv_12= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==14) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalT2A.g:930:4: otherlv_2= '{' (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )? (otherlv_7= 'sclassString' otherlv_8= '{' ( (lv_sclassesOnline_9_0= RULE_STRING ) )* otherlv_10= '}' )? ( (lv_features_11_0= ruleFeature ) )* otherlv_12= '}'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getCompAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalT2A.g:934:4: (otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==15) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalT2A.g:935:5: otherlv_3= 'sclass' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}'
                            {
                            otherlv_3=(Token)match(input,15,FOLLOW_7); 

                            					newLeafNode(otherlv_3, grammarAccess.getCompAccess().getSclassKeyword_2_1_0());
                            				
                            otherlv_4=(Token)match(input,14,FOLLOW_9); 

                            					newLeafNode(otherlv_4, grammarAccess.getCompAccess().getLeftCurlyBracketKeyword_2_1_1());
                            				
                            // InternalT2A.g:943:5: ( (otherlv_5= RULE_ID ) )*
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==RULE_ID) ) {
                                    alt26=1;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // InternalT2A.g:944:6: (otherlv_5= RULE_ID )
                            	    {
                            	    // InternalT2A.g:944:6: (otherlv_5= RULE_ID )
                            	    // InternalT2A.g:945:7: otherlv_5= RULE_ID
                            	    {

                            	    							if (current==null) {
                            	    								current = createModelElement(grammarAccess.getCompRule());
                            	    							}
                            	    						
                            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_9); 

                            	    							newLeafNode(otherlv_5, grammarAccess.getCompAccess().getHostclassesStyleClassCrossReference_2_1_2_0());
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop26;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,16,FOLLOW_24); 

                            					newLeafNode(otherlv_6, grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_1_3());
                            				

                            }
                            break;

                    }

                    // InternalT2A.g:961:4: (otherlv_7= 'sclassString' otherlv_8= '{' ( (lv_sclassesOnline_9_0= RULE_STRING ) )* otherlv_10= '}' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==27) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalT2A.g:962:5: otherlv_7= 'sclassString' otherlv_8= '{' ( (lv_sclassesOnline_9_0= RULE_STRING ) )* otherlv_10= '}'
                            {
                            otherlv_7=(Token)match(input,27,FOLLOW_7); 

                            					newLeafNode(otherlv_7, grammarAccess.getCompAccess().getSclassStringKeyword_2_2_0());
                            				
                            otherlv_8=(Token)match(input,14,FOLLOW_14); 

                            					newLeafNode(otherlv_8, grammarAccess.getCompAccess().getLeftCurlyBracketKeyword_2_2_1());
                            				
                            // InternalT2A.g:970:5: ( (lv_sclassesOnline_9_0= RULE_STRING ) )*
                            loop28:
                            do {
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==RULE_STRING) ) {
                                    alt28=1;
                                }


                                switch (alt28) {
                            	case 1 :
                            	    // InternalT2A.g:971:6: (lv_sclassesOnline_9_0= RULE_STRING )
                            	    {
                            	    // InternalT2A.g:971:6: (lv_sclassesOnline_9_0= RULE_STRING )
                            	    // InternalT2A.g:972:7: lv_sclassesOnline_9_0= RULE_STRING
                            	    {
                            	    lv_sclassesOnline_9_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                            	    							newLeafNode(lv_sclassesOnline_9_0, grammarAccess.getCompAccess().getSclassesOnlineSTRINGTerminalRuleCall_2_2_2_0());
                            	    						

                            	    							if (current==null) {
                            	    								current = createModelElement(grammarAccess.getCompRule());
                            	    							}
                            	    							addWithLastConsumed(
                            	    								current,
                            	    								"sclassesOnline",
                            	    								lv_sclassesOnline_9_0,
                            	    								"uma.es.angular.t2a.T2A.STRING");
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop28;
                                }
                            } while (true);

                            otherlv_10=(Token)match(input,16,FOLLOW_25); 

                            					newLeafNode(otherlv_10, grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_2_3());
                            				

                            }
                            break;

                    }

                    // InternalT2A.g:993:4: ( (lv_features_11_0= ruleFeature ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)||LA30_0==29) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalT2A.g:994:5: (lv_features_11_0= ruleFeature )
                    	    {
                    	    // InternalT2A.g:994:5: (lv_features_11_0= ruleFeature )
                    	    // InternalT2A.g:995:6: lv_features_11_0= ruleFeature
                    	    {

                    	    						newCompositeNode(grammarAccess.getCompAccess().getFeaturesFeatureParserRuleCall_2_3_0());
                    	    					
                    	    pushFollow(FOLLOW_25);
                    	    lv_features_11_0=ruleFeature();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCompRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"features",
                    	    							lv_features_11_0,
                    	    							"uma.es.angular.t2a.T2A.Feature");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getCompAccess().getRightCurlyBracketKeyword_2_4());
                    			

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
    // InternalT2A.g:1021:1: entryRuleInstanciaEDOM returns [EObject current=null] : iv_ruleInstanciaEDOM= ruleInstanciaEDOM EOF ;
    public final EObject entryRuleInstanciaEDOM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanciaEDOM = null;


        try {
            // InternalT2A.g:1021:54: (iv_ruleInstanciaEDOM= ruleInstanciaEDOM EOF )
            // InternalT2A.g:1022:2: iv_ruleInstanciaEDOM= ruleInstanciaEDOM EOF
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
    // InternalT2A.g:1028:1: ruleInstanciaEDOM returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? (otherlv_6= 'sclassString' otherlv_7= '{' ( (lv_sclassesOnline_8_0= RULE_STRING ) )* otherlv_9= '}' )? ( (lv_insfeatures_10_0= ruleInstanceEDOMFeature ) )* otherlv_11= '}' )? ) ;
    public final EObject ruleInstanciaEDOM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_sclassesOnline_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_insfeatures_10_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:1034:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? (otherlv_6= 'sclassString' otherlv_7= '{' ( (lv_sclassesOnline_8_0= RULE_STRING ) )* otherlv_9= '}' )? ( (lv_insfeatures_10_0= ruleInstanceEDOMFeature ) )* otherlv_11= '}' )? ) )
            // InternalT2A.g:1035:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? (otherlv_6= 'sclassString' otherlv_7= '{' ( (lv_sclassesOnline_8_0= RULE_STRING ) )* otherlv_9= '}' )? ( (lv_insfeatures_10_0= ruleInstanceEDOMFeature ) )* otherlv_11= '}' )? )
            {
            // InternalT2A.g:1035:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? (otherlv_6= 'sclassString' otherlv_7= '{' ( (lv_sclassesOnline_8_0= RULE_STRING ) )* otherlv_9= '}' )? ( (lv_insfeatures_10_0= ruleInstanceEDOMFeature ) )* otherlv_11= '}' )? )
            // InternalT2A.g:1036:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? (otherlv_6= 'sclassString' otherlv_7= '{' ( (lv_sclassesOnline_8_0= RULE_STRING ) )* otherlv_9= '}' )? ( (lv_insfeatures_10_0= ruleInstanceEDOMFeature ) )* otherlv_11= '}' )?
            {
            // InternalT2A.g:1036:3: ( (otherlv_0= RULE_ID ) )
            // InternalT2A.g:1037:4: (otherlv_0= RULE_ID )
            {
            // InternalT2A.g:1037:4: (otherlv_0= RULE_ID )
            // InternalT2A.g:1038:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanciaEDOMRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_0, grammarAccess.getInstanciaEDOMAccess().getInstanciaEDOMCrossReference_0_0());
            				

            }


            }

            // InternalT2A.g:1049:3: (otherlv_1= '{' (otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? (otherlv_6= 'sclassString' otherlv_7= '{' ( (lv_sclassesOnline_8_0= RULE_STRING ) )* otherlv_9= '}' )? ( (lv_insfeatures_10_0= ruleInstanceEDOMFeature ) )* otherlv_11= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==14) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalT2A.g:1050:4: otherlv_1= '{' (otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )? (otherlv_6= 'sclassString' otherlv_7= '{' ( (lv_sclassesOnline_8_0= RULE_STRING ) )* otherlv_9= '}' )? ( (lv_insfeatures_10_0= ruleInstanceEDOMFeature ) )* otherlv_11= '}'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getInstanciaEDOMAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalT2A.g:1054:4: (otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==15) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalT2A.g:1055:5: otherlv_2= 'sclass' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}'
                            {
                            otherlv_2=(Token)match(input,15,FOLLOW_7); 

                            					newLeafNode(otherlv_2, grammarAccess.getInstanciaEDOMAccess().getSclassKeyword_1_1_0());
                            				
                            otherlv_3=(Token)match(input,14,FOLLOW_9); 

                            					newLeafNode(otherlv_3, grammarAccess.getInstanciaEDOMAccess().getLeftCurlyBracketKeyword_1_1_1());
                            				
                            // InternalT2A.g:1063:5: ( (otherlv_4= RULE_ID ) )*
                            loop32:
                            do {
                                int alt32=2;
                                int LA32_0 = input.LA(1);

                                if ( (LA32_0==RULE_ID) ) {
                                    alt32=1;
                                }


                                switch (alt32) {
                            	case 1 :
                            	    // InternalT2A.g:1064:6: (otherlv_4= RULE_ID )
                            	    {
                            	    // InternalT2A.g:1064:6: (otherlv_4= RULE_ID )
                            	    // InternalT2A.g:1065:7: otherlv_4= RULE_ID
                            	    {

                            	    							if (current==null) {
                            	    								current = createModelElement(grammarAccess.getInstanciaEDOMRule());
                            	    							}
                            	    						
                            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_9); 

                            	    							newLeafNode(otherlv_4, grammarAccess.getInstanciaEDOMAccess().getSclassesStyleClassCrossReference_1_1_2_0());
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop32;
                                }
                            } while (true);

                            otherlv_5=(Token)match(input,16,FOLLOW_27); 

                            					newLeafNode(otherlv_5, grammarAccess.getInstanciaEDOMAccess().getRightCurlyBracketKeyword_1_1_3());
                            				

                            }
                            break;

                    }

                    // InternalT2A.g:1081:4: (otherlv_6= 'sclassString' otherlv_7= '{' ( (lv_sclassesOnline_8_0= RULE_STRING ) )* otherlv_9= '}' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==27) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalT2A.g:1082:5: otherlv_6= 'sclassString' otherlv_7= '{' ( (lv_sclassesOnline_8_0= RULE_STRING ) )* otherlv_9= '}'
                            {
                            otherlv_6=(Token)match(input,27,FOLLOW_7); 

                            					newLeafNode(otherlv_6, grammarAccess.getInstanciaEDOMAccess().getSclassStringKeyword_1_2_0());
                            				
                            otherlv_7=(Token)match(input,14,FOLLOW_14); 

                            					newLeafNode(otherlv_7, grammarAccess.getInstanciaEDOMAccess().getLeftCurlyBracketKeyword_1_2_1());
                            				
                            // InternalT2A.g:1090:5: ( (lv_sclassesOnline_8_0= RULE_STRING ) )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==RULE_STRING) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // InternalT2A.g:1091:6: (lv_sclassesOnline_8_0= RULE_STRING )
                            	    {
                            	    // InternalT2A.g:1091:6: (lv_sclassesOnline_8_0= RULE_STRING )
                            	    // InternalT2A.g:1092:7: lv_sclassesOnline_8_0= RULE_STRING
                            	    {
                            	    lv_sclassesOnline_8_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                            	    							newLeafNode(lv_sclassesOnline_8_0, grammarAccess.getInstanciaEDOMAccess().getSclassesOnlineSTRINGTerminalRuleCall_1_2_2_0());
                            	    						

                            	    							if (current==null) {
                            	    								current = createModelElement(grammarAccess.getInstanciaEDOMRule());
                            	    							}
                            	    							addWithLastConsumed(
                            	    								current,
                            	    								"sclassesOnline",
                            	    								lv_sclassesOnline_8_0,
                            	    								"uma.es.angular.t2a.T2A.STRING");
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop34;
                                }
                            } while (true);

                            otherlv_9=(Token)match(input,16,FOLLOW_12); 

                            					newLeafNode(otherlv_9, grammarAccess.getInstanciaEDOMAccess().getRightCurlyBracketKeyword_1_2_3());
                            				

                            }
                            break;

                    }

                    // InternalT2A.g:1113:4: ( (lv_insfeatures_10_0= ruleInstanceEDOMFeature ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_ID)) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalT2A.g:1114:5: (lv_insfeatures_10_0= ruleInstanceEDOMFeature )
                    	    {
                    	    // InternalT2A.g:1114:5: (lv_insfeatures_10_0= ruleInstanceEDOMFeature )
                    	    // InternalT2A.g:1115:6: lv_insfeatures_10_0= ruleInstanceEDOMFeature
                    	    {

                    	    						newCompositeNode(grammarAccess.getInstanciaEDOMAccess().getInsfeaturesInstanceEDOMFeatureParserRuleCall_1_3_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_insfeatures_10_0=ruleInstanceEDOMFeature();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getInstanciaEDOMRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"insfeatures",
                    	    							lv_insfeatures_10_0,
                    	    							"uma.es.angular.t2a.T2A.InstanceEDOMFeature");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getInstanciaEDOMAccess().getRightCurlyBracketKeyword_1_4());
                    			

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
    // InternalT2A.g:1141:1: entryRuleInstanceEDOMFeature returns [EObject current=null] : iv_ruleInstanceEDOMFeature= ruleInstanceEDOMFeature EOF ;
    public final EObject entryRuleInstanceEDOMFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceEDOMFeature = null;


        try {
            // InternalT2A.g:1141:60: (iv_ruleInstanceEDOMFeature= ruleInstanceEDOMFeature EOF )
            // InternalT2A.g:1142:2: iv_ruleInstanceEDOMFeature= ruleInstanceEDOMFeature EOF
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
    // InternalT2A.g:1148:1: ruleInstanceEDOMFeature returns [EObject current=null] : ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInstanceEDOMFeature() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;
        EObject lv_instanciaEDOM_0_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:1154:2: ( ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // InternalT2A.g:1155:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // InternalT2A.g:1155:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_STRING) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalT2A.g:1156:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    {
                    // InternalT2A.g:1156:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    // InternalT2A.g:1157:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    {
                    // InternalT2A.g:1157:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    // InternalT2A.g:1158:5: lv_instanciaEDOM_0_0= ruleInstanciaEDOM
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
                    // InternalT2A.g:1176:3: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // InternalT2A.g:1176:3: ( (lv_string_1_0= RULE_STRING ) )
                    // InternalT2A.g:1177:4: (lv_string_1_0= RULE_STRING )
                    {
                    // InternalT2A.g:1177:4: (lv_string_1_0= RULE_STRING )
                    // InternalT2A.g:1178:5: lv_string_1_0= RULE_STRING
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
    // InternalT2A.g:1198:1: entryRulePageFeature returns [EObject current=null] : iv_rulePageFeature= rulePageFeature EOF ;
    public final EObject entryRulePageFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageFeature = null;


        try {
            // InternalT2A.g:1198:52: (iv_rulePageFeature= rulePageFeature EOF )
            // InternalT2A.g:1199:2: iv_rulePageFeature= rulePageFeature EOF
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
    // InternalT2A.g:1205:1: rulePageFeature returns [EObject current=null] : ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject rulePageFeature() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;
        EObject lv_instanciaEDOM_0_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:1211:2: ( ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // InternalT2A.g:1212:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // InternalT2A.g:1212:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_STRING) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalT2A.g:1213:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    {
                    // InternalT2A.g:1213:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    // InternalT2A.g:1214:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    {
                    // InternalT2A.g:1214:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    // InternalT2A.g:1215:5: lv_instanciaEDOM_0_0= ruleInstanciaEDOM
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
                    // InternalT2A.g:1233:3: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // InternalT2A.g:1233:3: ( (lv_string_1_0= RULE_STRING ) )
                    // InternalT2A.g:1234:4: (lv_string_1_0= RULE_STRING )
                    {
                    // InternalT2A.g:1234:4: (lv_string_1_0= RULE_STRING )
                    // InternalT2A.g:1235:5: lv_string_1_0= RULE_STRING
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
    // InternalT2A.g:1255:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalT2A.g:1255:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalT2A.g:1256:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalT2A.g:1262:1: ruleFeature returns [EObject current=null] : ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_AllowSlot_1_0= 'AllowSlot' ) ) | ( (lv_string_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_AllowSlot_1_0=null;
        Token lv_string_2_0=null;
        EObject lv_instanciaEDOM_0_0 = null;



        	enterRule();

        try {
            // InternalT2A.g:1268:2: ( ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_AllowSlot_1_0= 'AllowSlot' ) ) | ( (lv_string_2_0= RULE_STRING ) ) ) )
            // InternalT2A.g:1269:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_AllowSlot_1_0= 'AllowSlot' ) ) | ( (lv_string_2_0= RULE_STRING ) ) )
            {
            // InternalT2A.g:1269:2: ( ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) ) | ( (lv_AllowSlot_1_0= 'AllowSlot' ) ) | ( (lv_string_2_0= RULE_STRING ) ) )
            int alt40=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt40=1;
                }
                break;
            case 29:
                {
                alt40=2;
                }
                break;
            case RULE_STRING:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalT2A.g:1270:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    {
                    // InternalT2A.g:1270:3: ( (lv_instanciaEDOM_0_0= ruleInstanciaEDOM ) )
                    // InternalT2A.g:1271:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    {
                    // InternalT2A.g:1271:4: (lv_instanciaEDOM_0_0= ruleInstanciaEDOM )
                    // InternalT2A.g:1272:5: lv_instanciaEDOM_0_0= ruleInstanciaEDOM
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
                    // InternalT2A.g:1290:3: ( (lv_AllowSlot_1_0= 'AllowSlot' ) )
                    {
                    // InternalT2A.g:1290:3: ( (lv_AllowSlot_1_0= 'AllowSlot' ) )
                    // InternalT2A.g:1291:4: (lv_AllowSlot_1_0= 'AllowSlot' )
                    {
                    // InternalT2A.g:1291:4: (lv_AllowSlot_1_0= 'AllowSlot' )
                    // InternalT2A.g:1292:5: lv_AllowSlot_1_0= 'AllowSlot'
                    {
                    lv_AllowSlot_1_0=(Token)match(input,29,FOLLOW_2); 

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
                    // InternalT2A.g:1305:3: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // InternalT2A.g:1305:3: ( (lv_string_2_0= RULE_STRING ) )
                    // InternalT2A.g:1306:4: (lv_string_2_0= RULE_STRING )
                    {
                    // InternalT2A.g:1306:4: (lv_string_2_0= RULE_STRING )
                    // InternalT2A.g:1307:5: lv_string_2_0= RULE_STRING
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
    // InternalT2A.g:1327:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalT2A.g:1327:44: (iv_ruleName= ruleName EOF )
            // InternalT2A.g:1328:2: iv_ruleName= ruleName EOF
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
    // InternalT2A.g:1334:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '_' | kw= '#' | kw= '-' | kw= '*' | kw= '.' | kw= '::' | kw= '>' | this_ID_7= RULE_ID )* ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_7=null;


        	enterRule();

        try {
            // InternalT2A.g:1340:2: ( (kw= '_' | kw= '#' | kw= '-' | kw= '*' | kw= '.' | kw= '::' | kw= '>' | this_ID_7= RULE_ID )* )
            // InternalT2A.g:1341:2: (kw= '_' | kw= '#' | kw= '-' | kw= '*' | kw= '.' | kw= '::' | kw= '>' | this_ID_7= RULE_ID )*
            {
            // InternalT2A.g:1341:2: (kw= '_' | kw= '#' | kw= '-' | kw= '*' | kw= '.' | kw= '::' | kw= '>' | this_ID_7= RULE_ID )*
            loop41:
            do {
                int alt41=9;
                switch ( input.LA(1) ) {
                case 30:
                    {
                    alt41=1;
                    }
                    break;
                case 31:
                    {
                    alt41=2;
                    }
                    break;
                case 32:
                    {
                    alt41=3;
                    }
                    break;
                case 33:
                    {
                    alt41=4;
                    }
                    break;
                case 34:
                    {
                    alt41=5;
                    }
                    break;
                case 35:
                    {
                    alt41=6;
                    }
                    break;
                case 36:
                    {
                    alt41=7;
                    }
                    break;
                case RULE_ID:
                    {
                    alt41=8;
                    }
                    break;

                }

                switch (alt41) {
            	case 1 :
            	    // InternalT2A.g:1342:3: kw= '_'
            	    {
            	    kw=(Token)match(input,30,FOLLOW_28); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getNameAccess().get_Keyword_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalT2A.g:1348:3: kw= '#'
            	    {
            	    kw=(Token)match(input,31,FOLLOW_28); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getNameAccess().getNumberSignKeyword_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalT2A.g:1354:3: kw= '-'
            	    {
            	    kw=(Token)match(input,32,FOLLOW_28); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getNameAccess().getHyphenMinusKeyword_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalT2A.g:1360:3: kw= '*'
            	    {
            	    kw=(Token)match(input,33,FOLLOW_28); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getNameAccess().getAsteriskKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalT2A.g:1366:3: kw= '.'
            	    {
            	    kw=(Token)match(input,34,FOLLOW_28); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getNameAccess().getFullStopKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalT2A.g:1372:3: kw= '::'
            	    {
            	    kw=(Token)match(input,35,FOLLOW_28); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getNameAccess().getColonColonKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalT2A.g:1378:3: kw= '>'
            	    {
            	    kw=(Token)match(input,36,FOLLOW_28); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getNameAccess().getGreaterThanSignKeyword_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalT2A.g:1384:3: this_ID_7= RULE_ID
            	    {
            	    this_ID_7=(Token)match(input,RULE_ID,FOLLOW_28); 

            	    			current.merge(this_ID_7);
            	    		

            	    			newLeafNode(this_ID_7, grammarAccess.getNameAccess().getIDTerminalRuleCall_7());
            	    		

            	    }
            	    break;

            	default :
            	    break loop41;
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000014782000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000014782002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000078030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000070030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000050030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000014792000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001FC0004020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001FC3010060L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001FC0010060L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000028018030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000028010030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020010030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008018030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008010030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001FC0000022L});

}