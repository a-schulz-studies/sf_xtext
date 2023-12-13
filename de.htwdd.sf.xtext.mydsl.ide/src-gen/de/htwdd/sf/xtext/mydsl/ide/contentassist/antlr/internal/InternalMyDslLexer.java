package de.htwdd.sf.xtext.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_SUBST=4;
    public static final int RULE_ID=6;
    public static final int RULE_WS=11;
    public static final int RULE_VERB=5;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( ':' )
            // InternalMyDsl.g:11:9: ':'
            {
            match(':'); 

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
            // InternalMyDsl.g:12:7: ( 'Um' )
            // InternalMyDsl.g:12:9: 'Um'
            {
            match("Um"); 


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
            // InternalMyDsl.g:13:7: ( ', m\\u00F6chte ich als' )
            // InternalMyDsl.g:13:9: ', m\\u00F6chte ich als'
            {
            match(", m\u00F6chte ich als"); 


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
            // InternalMyDsl.g:14:7: ( '.' )
            // InternalMyDsl.g:14:9: '.'
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
            // InternalMyDsl.g:15:7: ( 'zu' )
            // InternalMyDsl.g:15:9: 'zu'
            {
            match("zu"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "RULE_SUBST"
    public final void mRULE_SUBST() throws RecognitionException {
        try {
            int _type = RULE_SUBST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:692:12: ( ( 'A' .. 'Z' | '\\u00C4' | '\\u00D6' | '\\u00DC' ) ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' )* )
            // InternalMyDsl.g:692:14: ( 'A' .. 'Z' | '\\u00C4' | '\\u00D6' | '\\u00DC' ) ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='\u00C4'||input.LA(1)=='\u00D6'||input.LA(1)=='\u00DC' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:692:52: ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='a' && LA1_0<='z')||LA1_0=='\u00DF'||LA1_0=='\u00E4'||LA1_0=='\u00F6'||LA1_0=='\u00FC') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00DF'||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SUBST"

    // $ANTLR start "RULE_VERB"
    public final void mRULE_VERB() throws RecognitionException {
        try {
            int _type = RULE_VERB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:694:11: ( ( ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' )* 'en' | 'ern' | 'eln' ) )
            // InternalMyDsl.g:694:13: ( ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' )* 'en' | 'ern' | 'eln' )
            {
            // InternalMyDsl.g:694:13: ( ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' )* 'en' | 'ern' | 'eln' )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='e') ) {
                switch ( input.LA(2) ) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                case '\u00DF':
                case '\u00E4':
                case '\u00F6':
                case '\u00FC':
                    {
                    alt3=1;
                    }
                    break;
                case 'r':
                    {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3=='n') ) {
                        int LA3_5 = input.LA(4);

                        if ( ((LA3_5>='a' && LA3_5<='z')||LA3_5=='\u00DF'||LA3_5=='\u00E4'||LA3_5=='\u00F6'||LA3_5=='\u00FC') ) {
                            alt3=1;
                        }
                        else {
                            alt3=2;}
                    }
                    else if ( ((LA3_3>='a' && LA3_3<='m')||(LA3_3>='o' && LA3_3<='z')||LA3_3=='\u00DF'||LA3_3=='\u00E4'||LA3_3=='\u00F6'||LA3_3=='\u00FC') ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 'l':
                    {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4=='n') ) {
                        int LA3_6 = input.LA(4);

                        if ( ((LA3_6>='a' && LA3_6<='z')||LA3_6=='\u00DF'||LA3_6=='\u00E4'||LA3_6=='\u00F6'||LA3_6=='\u00FC') ) {
                            alt3=1;
                        }
                        else {
                            alt3=3;}
                    }
                    else if ( ((LA3_4>='a' && LA3_4<='m')||(LA3_4>='o' && LA3_4<='z')||LA3_4=='\u00DF'||LA3_4=='\u00E4'||LA3_4=='\u00F6'||LA3_4=='\u00FC') ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA3_0>='a' && LA3_0<='d')||(LA3_0>='f' && LA3_0<='z')||LA3_0=='\u00DF'||LA3_0=='\u00E4'||LA3_0=='\u00F6'||LA3_0=='\u00FC') ) {
                alt3=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:694:14: ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' )* 'en'
                    {
                    // InternalMyDsl.g:694:14: ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='e') ) {
                            int LA2_1 = input.LA(2);

                            if ( (LA2_1=='n') ) {
                                int LA2_3 = input.LA(3);

                                if ( ((LA2_3>='a' && LA2_3<='z')||LA2_3=='\u00DF'||LA2_3=='\u00E4'||LA2_3=='\u00F6'||LA2_3=='\u00FC') ) {
                                    alt2=1;
                                }


                            }
                            else if ( ((LA2_1>='a' && LA2_1<='m')||(LA2_1>='o' && LA2_1<='z')||LA2_1=='\u00DF'||LA2_1=='\u00E4'||LA2_1=='\u00F6'||LA2_1=='\u00FC') ) {
                                alt2=1;
                            }


                        }
                        else if ( ((LA2_0>='a' && LA2_0<='d')||(LA2_0>='f' && LA2_0<='z')||LA2_0=='\u00DF'||LA2_0=='\u00E4'||LA2_0=='\u00F6'||LA2_0=='\u00FC') ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:
                    	    {
                    	    if ( (input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00DF'||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
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

                    match("en"); 


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:694:67: 'ern'
                    {
                    match("ern"); 


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:694:73: 'eln'
                    {
                    match("eln"); 


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
    // $ANTLR end "RULE_VERB"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:696:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:696:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:696:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:696:11: '^'
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

            // InternalMyDsl.g:696:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:698:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:698:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:698:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:698:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:700:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:700:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:700:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:700:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:700:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:700:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:700:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:700:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:700:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:700:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:700:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop8;
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:702:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:702:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:702:24: ( options {greedy=false; } : . )*
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
            	    // InternalMyDsl.g:702:52: .
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
            // InternalMyDsl.g:704:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:704:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:704:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:704:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalMyDsl.g:704:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:704:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:704:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalMyDsl.g:704:41: '\\r'
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
            // InternalMyDsl.g:706:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:706:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:706:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalMyDsl.g:
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
            // InternalMyDsl.g:708:16: ( . )
            // InternalMyDsl.g:708:18: .
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
        // InternalMyDsl.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | RULE_SUBST | RULE_VERB | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=14;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalMyDsl.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: RULE_SUBST
                {
                mRULE_SUBST(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:51: RULE_VERB
                {
                mRULE_VERB(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:61: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:69: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:78: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:90: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:106: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:122: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:130: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\2\uffff\1\26\1\22\1\uffff\1\27\1\26\2\27\1\22\1\uffff\1\22\2\uffff\3\22\3\uffff\1\46\1\26\4\uffff\1\47\2\27\1\uffff\1\35\2\27\7\uffff\2\35";
    static final String DFA15_eofS =
        "\52\uffff";
    static final String DFA15_minS =
        "\1\0\1\uffff\1\60\1\40\1\uffff\1\141\1\60\2\141\1\101\1\uffff\1\141\2\uffff\2\0\1\52\3\uffff\2\60\4\uffff\1\60\2\141\1\uffff\1\60\2\141\7\uffff\2\60";
    static final String DFA15_maxS =
        "\1\uffff\1\uffff\1\172\1\40\1\uffff\1\u00fc\1\172\2\u00fc\1\172\1\uffff\1\u00fc\2\uffff\2\uffff\1\57\3\uffff\1\u00fc\1\172\4\uffff\3\u00fc\1\uffff\1\172\2\u00fc\7\uffff\2\172";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\5\uffff\1\6\1\uffff\1\10\1\11\3\uffff\1\15\1\16\1\1\2\uffff\1\6\1\10\1\3\1\4\3\uffff\1\7\3\uffff\1\11\1\12\1\13\1\14\1\15\1\2\1\5\2\uffff";
    static final String DFA15_specialS =
        "\1\1\15\uffff\1\0\1\2\32\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\22\2\21\2\22\1\21\22\22\1\21\1\22\1\16\4\22\1\17\4\22\1\3\1\22\1\4\1\20\12\15\1\1\6\22\24\6\1\2\5\6\3\22\1\11\1\14\1\22\4\10\1\7\24\10\1\5\111\22\1\12\21\22\1\12\5\22\1\12\2\22\1\13\4\22\1\13\21\22\1\13\5\22\1\13\uff03\22",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\14\25\1\24\15\25",
            "\1\30",
            "",
            "\4\34\1\33\17\34\1\32\5\34\144\uffff\1\35\4\uffff\1\35\21\uffff\1\35\5\uffff\1\35",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\25",
            "\4\34\1\33\6\34\1\40\1\34\1\36\3\34\1\37\10\34\144\uffff\1\35\4\uffff\1\35\21\uffff\1\35\5\uffff\1\35",
            "\4\34\1\33\25\34\144\uffff\1\35\4\uffff\1\35\21\uffff\1\35\5\uffff\1\35",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\32\35\144\uffff\1\35\4\uffff\1\35\21\uffff\1\35\5\uffff\1\35",
            "",
            "",
            "\0\42",
            "\0\42",
            "\1\43\4\uffff\1\44",
            "",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\25\144\uffff\1\26\4\uffff\1\26\21\uffff\1\26\5\uffff\1\26",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\25",
            "",
            "",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\34\1\33\25\34\144\uffff\1\35\4\uffff\1\35\21\uffff\1\35\5\uffff\1\35",
            "\4\34\1\33\10\34\1\36\14\34\144\uffff\1\35\4\uffff\1\35\21\uffff\1\35\5\uffff\1\35",
            "\4\34\1\33\25\34\144\uffff\1\35\4\uffff\1\35\21\uffff\1\35\5\uffff\1\35",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\34\1\33\25\34",
            "\4\34\1\33\10\34\1\50\14\34\144\uffff\1\35\4\uffff\1\35\21\uffff\1\35\5\uffff\1\35",
            "\4\34\1\33\10\34\1\51\14\34\144\uffff\1\35\4\uffff\1\35\21\uffff\1\35\5\uffff\1\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\34\1\33\25\34",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\34\1\33\25\34"
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
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | RULE_SUBST | RULE_VERB | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_14 = input.LA(1);

                        s = -1;
                        if ( ((LA15_14>='\u0000' && LA15_14<='\uFFFF')) ) {s = 34;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0==':') ) {s = 1;}

                        else if ( (LA15_0=='U') ) {s = 2;}

                        else if ( (LA15_0==',') ) {s = 3;}

                        else if ( (LA15_0=='.') ) {s = 4;}

                        else if ( (LA15_0=='z') ) {s = 5;}

                        else if ( ((LA15_0>='A' && LA15_0<='T')||(LA15_0>='V' && LA15_0<='Z')) ) {s = 6;}

                        else if ( (LA15_0=='e') ) {s = 7;}

                        else if ( ((LA15_0>='a' && LA15_0<='d')||(LA15_0>='f' && LA15_0<='y')) ) {s = 8;}

                        else if ( (LA15_0=='^') ) {s = 9;}

                        else if ( (LA15_0=='\u00C4'||LA15_0=='\u00D6'||LA15_0=='\u00DC') ) {s = 10;}

                        else if ( (LA15_0=='\u00DF'||LA15_0=='\u00E4'||LA15_0=='\u00F6'||LA15_0=='\u00FC') ) {s = 11;}

                        else if ( (LA15_0=='_') ) {s = 12;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 13;}

                        else if ( (LA15_0=='\"') ) {s = 14;}

                        else if ( (LA15_0=='\'') ) {s = 15;}

                        else if ( (LA15_0=='/') ) {s = 16;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 17;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='+')||LA15_0=='-'||(LA15_0>=';' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\u00C3')||(LA15_0>='\u00C5' && LA15_0<='\u00D5')||(LA15_0>='\u00D7' && LA15_0<='\u00DB')||(LA15_0>='\u00DD' && LA15_0<='\u00DE')||(LA15_0>='\u00E0' && LA15_0<='\u00E3')||(LA15_0>='\u00E5' && LA15_0<='\u00F5')||(LA15_0>='\u00F7' && LA15_0<='\u00FB')||(LA15_0>='\u00FD' && LA15_0<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_15 = input.LA(1);

                        s = -1;
                        if ( ((LA15_15>='\u0000' && LA15_15<='\uFFFF')) ) {s = 34;}

                        else s = 18;

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