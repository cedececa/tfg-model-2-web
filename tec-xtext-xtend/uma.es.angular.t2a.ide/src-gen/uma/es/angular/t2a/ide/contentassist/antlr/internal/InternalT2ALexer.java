package uma.es.angular.t2a.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalT2ALexer extends Lexer {
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_STRING2=5;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalT2ALexer() {;} 
    public InternalT2ALexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalT2ALexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalT2A.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:11:7: ( 'Page' )
            // InternalT2A.g:11:9: 'Page'
            {
            match("Page"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:12:7: ( '{' )
            // InternalT2A.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:13:7: ( '}' )
            // InternalT2A.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:14:7: ( 'SClass' )
            // InternalT2A.g:14:9: 'SClass'
            {
            match("SClass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:15:7: ( 'StyleClass' )
            // InternalT2A.g:15:9: 'StyleClass'
            {
            match("StyleClass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:16:7: ( ';' )
            // InternalT2A.g:16:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:17:7: ( 'Dom' )
            // InternalT2A.g:17:9: 'Dom'
            {
            match("Dom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:18:7: ( 'Comp' )
            // InternalT2A.g:18:9: 'Comp'
            {
            match("Comp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:19:7: ( 'home' )
            // InternalT2A.g:19:9: 'home'
            {
            match("home"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:20:7: ( 'showInNav' )
            // InternalT2A.g:20:9: 'showInNav'
            {
            match("showInNav"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:21:7: ( 'AllowSlot' )
            // InternalT2A.g:21:9: 'AllowSlot'
            {
            match("AllowSlot"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:2175:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalT2A.g:2175:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalT2A.g:2175:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\"') ) {
                alt3=1;
            }
            else if ( (LA3_0=='\'') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalT2A.g:2175:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalT2A.g:2175:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop1:
                    do {
                        int alt1=3;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='\\') ) {
                            alt1=1;
                        }
                        else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                            alt1=2;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalT2A.g:2175:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalT2A.g:2175:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalT2A.g:2175:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalT2A.g:2175:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='\\') ) {
                            alt2=1;
                        }
                        else if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                            alt2=2;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalT2A.g:2175:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalT2A.g:2175:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:2177:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '#' | '-' | '*' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '#' | '-' | '*' )* )
            // InternalT2A.g:2177:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '#' | '-' | '*' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '#' | '-' | '*' )*
            {
            // InternalT2A.g:2177:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalT2A.g:2177:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='#'||input.LA(1)=='*'||input.LA(1)=='-'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalT2A.g:2177:52: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '#' | '-' | '*' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='#'||LA5_0=='*'||LA5_0=='-'||(LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalT2A.g:
            	    {
            	    if ( input.LA(1)=='#'||input.LA(1)=='*'||input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING2"
    public final void mRULE_STRING2() throws RecognitionException {
        try {
            int _type = RULE_STRING2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:2179:14: ( ( ':' | ': ' | ' : ' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '#' | '-' | '%' | '*' | ',' | ', ' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '#' | '-' | '%' | '*' | ',' | ', ' )* )
            // InternalT2A.g:2179:16: ( ':' | ': ' | ' : ' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '#' | '-' | '%' | '*' | ',' | ', ' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '#' | '-' | '%' | '*' | ',' | ', ' )*
            {
            // InternalT2A.g:2179:16: ( ':' | ': ' | ' : ' )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==':') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==' ') ) {
                    alt6=2;
                }
                else if ( (LA6_1=='#'||LA6_1=='%'||LA6_1=='*'||(LA6_1>=',' && LA6_1<='-')||(LA6_1>='0' && LA6_1<='9')||(LA6_1>='A' && LA6_1<='Z')||LA6_1=='_'||(LA6_1>='a' && LA6_1<='z')) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==' ') ) {
                alt6=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalT2A.g:2179:17: ':'
                    {
                    match(':'); 

                    }
                    break;
                case 2 :
                    // InternalT2A.g:2179:21: ': '
                    {
                    match(": "); 


                    }
                    break;
                case 3 :
                    // InternalT2A.g:2179:26: ' : '
                    {
                    match(" : "); 


                    }
                    break;

            }

            // InternalT2A.g:2179:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '#' | '-' | '%' | '*' | ',' | ', ' )
            int alt7=10;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalT2A.g:2179:34: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // InternalT2A.g:2179:43: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 3 :
                    // InternalT2A.g:2179:52: '0' .. '9'
                    {
                    matchRange('0','9'); 

                    }
                    break;
                case 4 :
                    // InternalT2A.g:2179:61: '_'
                    {
                    match('_'); 

                    }
                    break;
                case 5 :
                    // InternalT2A.g:2179:65: '#'
                    {
                    match('#'); 

                    }
                    break;
                case 6 :
                    // InternalT2A.g:2179:69: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 7 :
                    // InternalT2A.g:2179:73: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 8 :
                    // InternalT2A.g:2179:77: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 9 :
                    // InternalT2A.g:2179:81: ','
                    {
                    match(','); 

                    }
                    break;
                case 10 :
                    // InternalT2A.g:2179:85: ', '
                    {
                    match(", "); 


                    }
                    break;

            }

            // InternalT2A.g:2179:91: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '#' | '-' | '%' | '*' | ',' | ', ' )*
            loop8:
            do {
                int alt8=11;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalT2A.g:2179:92: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // InternalT2A.g:2179:101: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalT2A.g:2179:110: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 4 :
            	    // InternalT2A.g:2179:114: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;
            	case 5 :
            	    // InternalT2A.g:2179:123: '#'
            	    {
            	    match('#'); 

            	    }
            	    break;
            	case 6 :
            	    // InternalT2A.g:2179:127: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;
            	case 7 :
            	    // InternalT2A.g:2179:131: '%'
            	    {
            	    match('%'); 

            	    }
            	    break;
            	case 8 :
            	    // InternalT2A.g:2179:135: '*'
            	    {
            	    match('*'); 

            	    }
            	    break;
            	case 9 :
            	    // InternalT2A.g:2179:139: ','
            	    {
            	    match(','); 

            	    }
            	    break;
            	case 10 :
            	    // InternalT2A.g:2179:143: ', '
            	    {
            	    match(", "); 


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING2"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:2181:10: ( ( '0' .. '9' )+ )
            // InternalT2A.g:2181:12: ( '0' .. '9' )+
            {
            // InternalT2A.g:2181:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalT2A.g:2181:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:2183:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalT2A.g:2183:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalT2A.g:2183:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalT2A.g:2183:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:2185:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalT2A.g:2185:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalT2A.g:2185:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalT2A.g:2185:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalT2A.g:2185:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalT2A.g:2185:41: ( '\\r' )? '\\n'
                    {
                    // InternalT2A.g:2185:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalT2A.g:2185:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:2187:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalT2A.g:2187:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalT2A.g:2187:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalT2A.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:2189:16: ( . )
            // InternalT2A.g:2189:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalT2A.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | RULE_STRING | RULE_ID | RULE_STRING2 | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=19;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalT2A.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalT2A.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalT2A.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalT2A.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalT2A.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalT2A.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalT2A.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalT2A.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalT2A.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalT2A.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalT2A.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalT2A.g:1:76: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 13 :
                // InternalT2A.g:1:88: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 14 :
                // InternalT2A.g:1:96: RULE_STRING2
                {
                mRULE_STRING2(); 

                }
                break;
            case 15 :
                // InternalT2A.g:1:109: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 16 :
                // InternalT2A.g:1:118: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 17 :
                // InternalT2A.g:1:134: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 18 :
                // InternalT2A.g:1:150: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 19 :
                // InternalT2A.g:1:158: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA7_eotS =
        "\11\uffff\1\13\2\uffff";
    static final String DFA7_eofS =
        "\14\uffff";
    static final String DFA7_minS =
        "\1\43\10\uffff\1\40\2\uffff";
    static final String DFA7_maxS =
        "\1\172\10\uffff\1\40\2\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\12\1\11";
    static final String DFA7_specialS =
        "\14\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\5\1\uffff\1\7\4\uffff\1\10\1\uffff\1\11\1\6\2\uffff\12\3\7\uffff\32\2\4\uffff\1\4\1\uffff\32\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "2179:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '#' | '-' | '%' | '*' | ',' | ', ' )";
        }
    }
    static final String DFA8_eotS =
        "\1\1\11\uffff\1\14\2\uffff";
    static final String DFA8_eofS =
        "\15\uffff";
    static final String DFA8_minS =
        "\1\43\11\uffff\1\40\2\uffff";
    static final String DFA8_maxS =
        "\1\172\11\uffff\1\40\2\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\13\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\12\1\11";
    static final String DFA8_specialS =
        "\15\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\6\1\uffff\1\10\4\uffff\1\11\1\uffff\1\12\1\7\2\uffff\12\5\7\uffff\32\3\4\uffff\1\4\1\uffff\32\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "()* loopback of 2179:91: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '#' | '-' | '%' | '*' | ',' | ', ' )*";
        }
    }
    static final String DFA15_eotS =
        "\1\uffff\1\26\2\uffff\1\26\1\uffff\5\26\3\24\1\uffff\1\24\1\43\1\uffff\1\24\2\uffff\1\26\3\uffff\2\26\1\uffff\5\26\6\uffff\3\26\1\62\4\26\1\67\2\26\1\uffff\1\72\1\73\2\26\1\uffff\2\26\2\uffff\2\26\1\102\3\26\1\uffff\7\26\1\115\1\116\1\117\3\uffff";
    static final String DFA15_eofS =
        "\120\uffff";
    static final String DFA15_minS =
        "\1\0\1\141\2\uffff\1\103\1\uffff\3\157\1\150\1\154\2\0\1\43\1\uffff\1\40\1\72\1\uffff\1\52\2\uffff\1\147\3\uffff\1\154\1\171\1\uffff\3\155\1\157\1\154\6\uffff\1\145\1\141\1\154\1\43\1\160\1\145\1\167\1\157\1\43\1\163\1\145\1\uffff\2\43\1\111\1\167\1\uffff\1\163\1\103\2\uffff\1\156\1\123\1\43\1\154\1\116\1\154\1\uffff\2\141\1\157\1\163\1\166\1\164\1\163\3\43\3\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\141\2\uffff\1\164\1\uffff\3\157\1\150\1\154\2\uffff\1\172\1\uffff\1\172\1\72\1\uffff\1\57\2\uffff\1\147\3\uffff\1\154\1\171\1\uffff\3\155\1\157\1\154\6\uffff\1\145\1\141\1\154\1\172\1\160\1\145\1\167\1\157\1\172\1\163\1\145\1\uffff\2\172\1\111\1\167\1\uffff\1\163\1\103\2\uffff\1\156\1\123\1\172\1\154\1\116\1\154\1\uffff\2\141\1\157\1\163\1\166\1\164\1\163\3\172\3\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\6\10\uffff\1\15\2\uffff\1\17\1\uffff\1\22\1\23\1\uffff\1\15\1\2\1\3\2\uffff\1\6\5\uffff\1\14\1\16\1\22\1\17\1\20\1\21\13\uffff\1\7\4\uffff\1\1\2\uffff\1\10\1\11\6\uffff\1\4\12\uffff\1\12\1\13\1\5";
    static final String DFA15_specialS =
        "\1\0\12\uffff\1\1\1\2\103\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\24\2\23\2\24\1\23\22\24\1\20\1\24\1\13\1\16\3\24\1\14\2\24\1\16\2\24\1\16\1\24\1\22\12\21\1\17\1\5\5\24\1\12\1\16\1\7\1\6\13\16\1\1\2\16\1\4\7\16\3\24\1\15\1\16\1\24\7\16\1\10\12\16\1\11\7\16\1\2\1\24\1\3\uff82\24",
            "\1\25",
            "",
            "",
            "\1\31\60\uffff\1\32",
            "",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\0\41",
            "\0\41",
            "\1\26\6\uffff\1\26\2\uffff\1\26\23\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\42\2\uffff\1\42\1\uffff\1\42\4\uffff\1\42\1\uffff\2\42\2\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\42",
            "",
            "\1\45\4\uffff\1\46",
            "",
            "",
            "\1\47",
            "",
            "",
            "",
            "\1\50",
            "\1\51",
            "",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\26\6\uffff\1\26\2\uffff\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\26\6\uffff\1\26\2\uffff\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\70",
            "\1\71",
            "",
            "\1\26\6\uffff\1\26\2\uffff\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\6\uffff\1\26\2\uffff\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\74",
            "\1\75",
            "",
            "\1\76",
            "\1\77",
            "",
            "",
            "\1\100",
            "\1\101",
            "\1\26\6\uffff\1\26\2\uffff\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\26\6\uffff\1\26\2\uffff\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\6\uffff\1\26\2\uffff\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\6\uffff\1\26\2\uffff\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | RULE_STRING | RULE_ID | RULE_STRING2 | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='P') ) {s = 1;}

                        else if ( (LA15_0=='{') ) {s = 2;}

                        else if ( (LA15_0=='}') ) {s = 3;}

                        else if ( (LA15_0=='S') ) {s = 4;}

                        else if ( (LA15_0==';') ) {s = 5;}

                        else if ( (LA15_0=='D') ) {s = 6;}

                        else if ( (LA15_0=='C') ) {s = 7;}

                        else if ( (LA15_0=='h') ) {s = 8;}

                        else if ( (LA15_0=='s') ) {s = 9;}

                        else if ( (LA15_0=='A') ) {s = 10;}

                        else if ( (LA15_0=='\"') ) {s = 11;}

                        else if ( (LA15_0=='\'') ) {s = 12;}

                        else if ( (LA15_0=='^') ) {s = 13;}

                        else if ( (LA15_0=='#'||LA15_0=='*'||LA15_0=='-'||LA15_0=='B'||(LA15_0>='E' && LA15_0<='O')||(LA15_0>='Q' && LA15_0<='R')||(LA15_0>='T' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='g')||(LA15_0>='i' && LA15_0<='r')||(LA15_0>='t' && LA15_0<='z')) ) {s = 14;}

                        else if ( (LA15_0==':') ) {s = 15;}

                        else if ( (LA15_0==' ') ) {s = 16;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 17;}

                        else if ( (LA15_0=='/') ) {s = 18;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r') ) {s = 19;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='$' && LA15_0<='&')||(LA15_0>='(' && LA15_0<=')')||(LA15_0>='+' && LA15_0<=',')||LA15_0=='.'||(LA15_0>='<' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_11 = input.LA(1);

                        s = -1;
                        if ( ((LA15_11>='\u0000' && LA15_11<='\uFFFF')) ) {s = 33;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_12 = input.LA(1);

                        s = -1;
                        if ( ((LA15_12>='\u0000' && LA15_12<='\uFFFF')) ) {s = 33;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}