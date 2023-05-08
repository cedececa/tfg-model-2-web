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
            // InternalT2A.g:11:7: ( '_' )
            // InternalT2A.g:11:9: '_'
            {
            match('_'); 

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
            // InternalT2A.g:12:7: ( '#' )
            // InternalT2A.g:12:9: '#'
            {
            match('#'); 

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
            // InternalT2A.g:13:7: ( '-' )
            // InternalT2A.g:13:9: '-'
            {
            match('-'); 

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
            // InternalT2A.g:14:7: ( '*' )
            // InternalT2A.g:14:9: '*'
            {
            match('*'); 

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
            // InternalT2A.g:15:7: ( '.' )
            // InternalT2A.g:15:9: '.'
            {
            match('.'); 

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
            // InternalT2A.g:16:7: ( '::' )
            // InternalT2A.g:16:9: '::'
            {
            match("::"); 


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
            // InternalT2A.g:17:7: ( '>' )
            // InternalT2A.g:17:9: '>'
            {
            match('>'); 

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
            // InternalT2A.g:18:7: ( 'AppName:' )
            // InternalT2A.g:18:9: 'AppName:'
            {
            match("AppName:"); 


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
            // InternalT2A.g:19:7: ( 'Page' )
            // InternalT2A.g:19:9: 'Page'
            {
            match("Page"); 


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
            // InternalT2A.g:20:7: ( '{' )
            // InternalT2A.g:20:9: '{'
            {
            match('{'); 

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
            // InternalT2A.g:21:7: ( '}' )
            // InternalT2A.g:21:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:22:7: ( 'sclass' )
            // InternalT2A.g:22:9: 'sclass'
            {
            match("sclass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:23:7: ( 'StyleGlobal' )
            // InternalT2A.g:23:9: 'StyleGlobal'
            {
            match("StyleGlobal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:24:7: ( 'StyleOnline' )
            // InternalT2A.g:24:9: 'StyleOnline'
            {
            match("StyleOnline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:25:7: ( 'JSOnline' )
            // InternalT2A.g:25:9: 'JSOnline'
            {
            match("JSOnline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:26:7: ( 'StyleClass' )
            // InternalT2A.g:26:9: 'StyleClass'
            {
            match("StyleClass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:27:7: ( ';' )
            // InternalT2A.g:27:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:28:7: ( 'after' )
            // InternalT2A.g:28:9: 'after'
            {
            match("after"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:29:7: ( 'active' )
            // InternalT2A.g:29:9: 'active'
            {
            match("active"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:30:7: ( 'Dom' )
            // InternalT2A.g:30:9: 'Dom'
            {
            match("Dom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:31:7: ( 'Comp' )
            // InternalT2A.g:31:9: 'Comp'
            {
            match("Comp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:32:7: ( 'home' )
            // InternalT2A.g:32:9: 'home'
            {
            match("home"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:33:7: ( 'showInNav' )
            // InternalT2A.g:33:9: 'showInNav'
            {
            match("showInNav"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:34:7: ( 'AllowSlot' )
            // InternalT2A.g:34:9: 'AllowSlot'
            {
            match("AllowSlot"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:3566:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalT2A.g:3566:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalT2A.g:3566:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalT2A.g:3566:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalT2A.g:3566:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalT2A.g:3566:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // InternalT2A.g:3566:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalT2A.g:3566:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalT2A.g:3566:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalT2A.g:3566:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // InternalT2A.g:3566:137: ~ ( ( '\\\\' | '\\'' ) )
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

    // $ANTLR start "RULE_STRING2"
    public final void mRULE_STRING2() throws RecognitionException {
        try {
            int _type = RULE_STRING2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:3568:14: ( ( ': ' | ':' | ' : ' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '#' | '-' | '%' | '*' | ',' | ', ' | '(' | ')' | 'px ' | '\"' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '#' | '-' | '%' | '*' | ',' | ', ' | '(' | ')' | 'px ' | '\"' )* )
            // InternalT2A.g:3568:16: ( ': ' | ':' | ' : ' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '#' | '-' | '%' | '*' | ',' | ', ' | '(' | ')' | 'px ' | '\"' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '#' | '-' | '%' | '*' | ',' | ', ' | '(' | ')' | 'px ' | '\"' )*
            {
            // InternalT2A.g:3568:16: ( ': ' | ':' | ' : ' )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==':') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==' ') ) {
                    alt4=1;
                }
                else if ( ((LA4_1>='\"' && LA4_1<='#')||LA4_1=='%'||(LA4_1>='(' && LA4_1<='*')||(LA4_1>=',' && LA4_1<='-')||(LA4_1>='0' && LA4_1<='9')||(LA4_1>='A' && LA4_1<='Z')||LA4_1=='_'||(LA4_1>='a' && LA4_1<='z')) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==' ') ) {
                alt4=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalT2A.g:3568:17: ': '
                    {
                    match(": "); 


                    }
                    break;
                case 2 :
                    // InternalT2A.g:3568:22: ':'
                    {
                    match(':'); 

                    }
                    break;
                case 3 :
                    // InternalT2A.g:3568:26: ' : '
                    {
                    match(" : "); 


                    }
                    break;

            }

            // InternalT2A.g:3568:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '#' | '-' | '%' | '*' | ',' | ', ' | '(' | ')' | 'px ' | '\"' )
            int alt5=14;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalT2A.g:3568:34: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // InternalT2A.g:3568:43: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 3 :
                    // InternalT2A.g:3568:52: '0' .. '9'
                    {
                    matchRange('0','9'); 

                    }
                    break;
                case 4 :
                    // InternalT2A.g:3568:61: '_'
                    {
                    match('_'); 

                    }
                    break;
                case 5 :
                    // InternalT2A.g:3568:65: '#'
                    {
                    match('#'); 

                    }
                    break;
                case 6 :
                    // InternalT2A.g:3568:69: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 7 :
                    // InternalT2A.g:3568:73: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 8 :
                    // InternalT2A.g:3568:77: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 9 :
                    // InternalT2A.g:3568:81: ','
                    {
                    match(','); 

                    }
                    break;
                case 10 :
                    // InternalT2A.g:3568:85: ', '
                    {
                    match(", "); 


                    }
                    break;
                case 11 :
                    // InternalT2A.g:3568:90: '('
                    {
                    match('('); 

                    }
                    break;
                case 12 :
                    // InternalT2A.g:3568:94: ')'
                    {
                    match(')'); 

                    }
                    break;
                case 13 :
                    // InternalT2A.g:3568:98: 'px '
                    {
                    match("px "); 


                    }
                    break;
                case 14 :
                    // InternalT2A.g:3568:104: '\"'
                    {
                    match('\"'); 

                    }
                    break;

            }

            // InternalT2A.g:3568:109: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '#' | '-' | '%' | '*' | ',' | ', ' | '(' | ')' | 'px ' | '\"' )*
            loop6:
            do {
                int alt6=15;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // InternalT2A.g:3568:110: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // InternalT2A.g:3568:119: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalT2A.g:3568:128: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 4 :
            	    // InternalT2A.g:3568:132: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;
            	case 5 :
            	    // InternalT2A.g:3568:141: '#'
            	    {
            	    match('#'); 

            	    }
            	    break;
            	case 6 :
            	    // InternalT2A.g:3568:145: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;
            	case 7 :
            	    // InternalT2A.g:3568:149: '%'
            	    {
            	    match('%'); 

            	    }
            	    break;
            	case 8 :
            	    // InternalT2A.g:3568:153: '*'
            	    {
            	    match('*'); 

            	    }
            	    break;
            	case 9 :
            	    // InternalT2A.g:3568:157: ','
            	    {
            	    match(','); 

            	    }
            	    break;
            	case 10 :
            	    // InternalT2A.g:3568:161: ', '
            	    {
            	    match(", "); 


            	    }
            	    break;
            	case 11 :
            	    // InternalT2A.g:3568:166: '('
            	    {
            	    match('('); 

            	    }
            	    break;
            	case 12 :
            	    // InternalT2A.g:3568:170: ')'
            	    {
            	    match(')'); 

            	    }
            	    break;
            	case 13 :
            	    // InternalT2A.g:3568:174: 'px '
            	    {
            	    match("px "); 


            	    }
            	    break;
            	case 14 :
            	    // InternalT2A.g:3568:180: '\"'
            	    {
            	    match('\"'); 

            	    }
            	    break;

            	default :
            	    break loop6;
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:3570:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalT2A.g:3570:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalT2A.g:3570:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalT2A.g:3570:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalT2A.g:3570:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalT2A.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalT2A.g:3572:10: ( ( '0' .. '9' )+ )
            // InternalT2A.g:3572:12: ( '0' .. '9' )+
            {
            // InternalT2A.g:3572:12: ( '0' .. '9' )+
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
            	    // InternalT2A.g:3572:13: '0' .. '9'
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
            // InternalT2A.g:3574:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalT2A.g:3574:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalT2A.g:3574:24: ( options {greedy=false; } : . )*
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
            	    // InternalT2A.g:3574:52: .
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
            // InternalT2A.g:3576:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalT2A.g:3576:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalT2A.g:3576:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalT2A.g:3576:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalT2A.g:3576:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalT2A.g:3576:41: ( '\\r' )? '\\n'
                    {
                    // InternalT2A.g:3576:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalT2A.g:3576:41: '\\r'
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
            // InternalT2A.g:3578:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalT2A.g:3578:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalT2A.g:3578:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalT2A.g:3580:16: ( . )
            // InternalT2A.g:3580:18: .
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
        // InternalT2A.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | RULE_STRING | RULE_STRING2 | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=32;
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
                // InternalT2A.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalT2A.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalT2A.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalT2A.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalT2A.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalT2A.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalT2A.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalT2A.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalT2A.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalT2A.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalT2A.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalT2A.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalT2A.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalT2A.g:1:154: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 26 :
                // InternalT2A.g:1:166: RULE_STRING2
                {
                mRULE_STRING2(); 

                }
                break;
            case 27 :
                // InternalT2A.g:1:179: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 28 :
                // InternalT2A.g:1:187: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 29 :
                // InternalT2A.g:1:196: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 30 :
                // InternalT2A.g:1:212: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 31 :
                // InternalT2A.g:1:228: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 32 :
                // InternalT2A.g:1:236: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA5_eotS =
        "\1\uffff\1\14\7\uffff\1\20\4\uffff\1\14\3\uffff";
    static final String DFA5_eofS =
        "\22\uffff";
    static final String DFA5_minS =
        "\1\42\1\170\7\uffff\1\40\4\uffff\1\40\3\uffff";
    static final String DFA5_maxS =
        "\1\172\1\170\7\uffff\1\40\4\uffff\1\40\3\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\13\1\14\1\1\1\16\1\uffff\1\12\1\11\1\15";
    static final String DFA5_specialS =
        "\22\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\15\1\5\1\uffff\1\7\2\uffff\1\12\1\13\1\10\1\uffff\1\11\1\6\2\uffff\12\3\7\uffff\32\2\4\uffff\1\4\1\uffff\17\14\1\1\12\14",
            "\1\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\17",
            "",
            "",
            "",
            "",
            "\1\21",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "3568:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '#' | '-' | '%' | '*' | ',' | ', ' | '(' | ')' | 'px ' | '\"' )";
        }
    }
    static final String DFA6_eotS =
        "\1\1\1\uffff\1\15\7\uffff\1\21\4\uffff\1\15\3\uffff";
    static final String DFA6_eofS =
        "\23\uffff";
    static final String DFA6_minS =
        "\1\42\1\uffff\1\170\7\uffff\1\40\4\uffff\1\40\3\uffff";
    static final String DFA6_maxS =
        "\1\172\1\uffff\1\170\7\uffff\1\40\4\uffff\1\40\3\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\17\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\13\1\14\1\1\1\16\1\uffff\1\12\1\11\1\15";
    static final String DFA6_specialS =
        "\23\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\16\1\6\1\uffff\1\10\2\uffff\1\13\1\14\1\11\1\uffff\1\12\1\7\2\uffff\12\5\7\uffff\32\3\4\uffff\1\4\1\uffff\17\15\1\2\12\15",
            "",
            "\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\20",
            "",
            "",
            "",
            "",
            "\1\22",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "()* loopback of 3568:109: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '#' | '-' | '%' | '*' | ',' | ', ' | '(' | ')' | 'px ' | '\"' )*";
        }
    }
    static final String DFA15_eotS =
        "\1\uffff\1\35\4\uffff\1\34\1\uffff\2\36\2\uffff\3\36\1\uffff\4\36\2\34\1\66\1\34\2\uffff\1\34\13\uffff\3\36\2\uffff\4\36\1\uffff\5\36\5\uffff\11\36\1\117\4\36\1\124\6\36\1\uffff\1\133\1\134\2\36\1\uffff\4\36\1\145\1\36\2\uffff\2\36\1\151\5\36\1\uffff\1\157\2\36\1\uffff\5\36\2\uffff\5\36\1\174\1\175\1\176\3\36\3\uffff\2\36\1\u0084\1\u0085\1\u0086\3\uffff";
    static final String DFA15_eofS =
        "\u0087\uffff";
    static final String DFA15_minS =
        "\1\0\1\60\4\uffff\1\40\1\uffff\1\154\1\141\2\uffff\1\143\1\164\1\123\1\uffff\1\143\3\157\2\0\1\72\1\101\2\uffff\1\52\13\uffff\1\160\1\154\1\147\2\uffff\1\154\1\157\1\171\1\117\1\uffff\2\164\3\155\5\uffff\1\116\1\157\1\145\1\141\1\167\1\154\1\156\1\145\1\151\1\60\1\160\1\145\1\141\1\167\1\60\1\163\1\111\1\145\1\154\1\162\1\166\1\uffff\2\60\1\155\1\123\1\uffff\1\163\1\156\1\103\1\151\1\60\1\145\2\uffff\1\145\1\154\1\60\1\116\1\154\1\156\1\154\1\156\1\uffff\1\60\1\72\1\157\1\uffff\1\141\1\157\1\154\1\141\1\145\2\uffff\1\164\1\166\1\142\1\151\1\163\3\60\1\141\1\156\1\163\3\uffff\1\154\1\145\3\60\3\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\172\4\uffff\1\172\1\uffff\1\160\1\141\2\uffff\1\150\1\164\1\123\1\uffff\1\146\3\157\2\uffff\1\72\1\172\2\uffff\1\57\13\uffff\1\160\1\154\1\147\2\uffff\1\154\1\157\1\171\1\117\1\uffff\2\164\3\155\5\uffff\1\116\1\157\1\145\1\141\1\167\1\154\1\156\1\145\1\151\1\172\1\160\1\145\1\141\1\167\1\172\1\163\1\111\1\145\1\154\1\162\1\166\1\uffff\2\172\1\155\1\123\1\uffff\1\163\1\156\1\117\1\151\1\172\1\145\2\uffff\1\145\1\154\1\172\1\116\1\154\1\156\1\154\1\156\1\uffff\1\172\1\72\1\157\1\uffff\1\141\1\157\1\154\1\141\1\145\2\uffff\1\164\1\166\1\142\1\151\1\163\3\172\1\141\1\156\1\163\3\uffff\1\154\1\145\3\172\3\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\uffff\1\7\2\uffff\1\12\1\13\3\uffff\1\21\10\uffff\1\33\1\34\1\uffff\1\37\1\40\1\1\1\33\1\2\1\3\1\4\1\5\1\6\1\32\1\7\3\uffff\1\12\1\13\4\uffff\1\21\5\uffff\1\31\1\37\1\34\1\35\1\36\25\uffff\1\24\4\uffff\1\11\6\uffff\1\25\1\26\10\uffff\1\22\3\uffff\1\14\5\uffff\1\23\1\10\13\uffff\1\17\1\30\1\27\5\uffff\1\20\1\15\1\16";
    static final String DFA15_specialS =
        "\1\0\23\uffff\1\2\1\1\161\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\26\1\34\1\24\1\2\3\34\1\25\2\34\1\4\2\34\1\3\1\5\1\32\12\31\1\6\1\17\2\34\1\7\2\34\1\10\1\30\1\22\1\21\5\30\1\16\5\30\1\11\2\30\1\15\7\30\3\34\1\27\1\1\1\34\1\20\6\30\1\23\12\30\1\14\7\30\1\12\1\34\1\13\uff82\34",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "",
            "",
            "\1\44\1\uffff\2\44\1\uffff\1\44\2\uffff\3\44\1\uffff\2\44\2\uffff\12\44\1\43\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\47\3\uffff\1\46",
            "\1\50",
            "",
            "",
            "\1\53\4\uffff\1\54",
            "\1\55",
            "\1\56",
            "",
            "\1\61\2\uffff\1\60",
            "\1\62",
            "\1\63",
            "\1\64",
            "\0\65",
            "\0\65",
            "\1\44",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\1\70\4\uffff\1\71",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "",
            "",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "",
            "",
            "",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\135",
            "\1\136",
            "",
            "\1\137",
            "\1\140",
            "\1\143\3\uffff\1\141\7\uffff\1\142",
            "\1\144",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\146",
            "",
            "",
            "\1\147",
            "\1\150",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\160",
            "\1\161",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "",
            "",
            "",
            "\1\u0082",
            "\1\u0083",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | RULE_STRING | RULE_STRING2 | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='_') ) {s = 1;}

                        else if ( (LA15_0=='#') ) {s = 2;}

                        else if ( (LA15_0=='-') ) {s = 3;}

                        else if ( (LA15_0=='*') ) {s = 4;}

                        else if ( (LA15_0=='.') ) {s = 5;}

                        else if ( (LA15_0==':') ) {s = 6;}

                        else if ( (LA15_0=='>') ) {s = 7;}

                        else if ( (LA15_0=='A') ) {s = 8;}

                        else if ( (LA15_0=='P') ) {s = 9;}

                        else if ( (LA15_0=='{') ) {s = 10;}

                        else if ( (LA15_0=='}') ) {s = 11;}

                        else if ( (LA15_0=='s') ) {s = 12;}

                        else if ( (LA15_0=='S') ) {s = 13;}

                        else if ( (LA15_0=='J') ) {s = 14;}

                        else if ( (LA15_0==';') ) {s = 15;}

                        else if ( (LA15_0=='a') ) {s = 16;}

                        else if ( (LA15_0=='D') ) {s = 17;}

                        else if ( (LA15_0=='C') ) {s = 18;}

                        else if ( (LA15_0=='h') ) {s = 19;}

                        else if ( (LA15_0=='\"') ) {s = 20;}

                        else if ( (LA15_0=='\'') ) {s = 21;}

                        else if ( (LA15_0==' ') ) {s = 22;}

                        else if ( (LA15_0=='^') ) {s = 23;}

                        else if ( (LA15_0=='B'||(LA15_0>='E' && LA15_0<='I')||(LA15_0>='K' && LA15_0<='O')||(LA15_0>='Q' && LA15_0<='R')||(LA15_0>='T' && LA15_0<='Z')||(LA15_0>='b' && LA15_0<='g')||(LA15_0>='i' && LA15_0<='r')||(LA15_0>='t' && LA15_0<='z')) ) {s = 24;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 25;}

                        else if ( (LA15_0=='/') ) {s = 26;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r') ) {s = 27;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='$' && LA15_0<='&')||(LA15_0>='(' && LA15_0<=')')||(LA15_0>='+' && LA15_0<=',')||(LA15_0>='<' && LA15_0<='=')||(LA15_0>='?' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_21 = input.LA(1);

                        s = -1;
                        if ( ((LA15_21>='\u0000' && LA15_21<='\uFFFF')) ) {s = 53;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_20 = input.LA(1);

                        s = -1;
                        if ( ((LA15_20>='\u0000' && LA15_20<='\uFFFF')) ) {s = 53;}

                        else s = 28;

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