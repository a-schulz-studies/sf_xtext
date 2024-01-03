package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_ZBUTNOU=18;
    public static final int RULE_SUBST=4;
    public static final int RULE_NOU=19;
    public static final int RULE_STRING=22;
    public static final int RULE_NOZ=16;
    public static final int RULE_SL_COMMENT=24;
    public static final int RULE_ALLEBUCHSTABEN=11;
    public static final int RULE_VERBOHNEZU=6;
    public static final int RULE_VERBMITZWEIZU=8;
    public static final int RULE_VERBMITDREIZU=9;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=20;
    public static final int RULE_WS=25;
    public static final int RULE_VERB=5;
    public static final int RULE_Z=14;
    public static final int RULE_ANY_OTHER=26;
    public static final int RULE_U=15;
    public static final int RULE_VERBMITEINEMZU=7;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=21;
    public static final int T__29=29;
    public static final int RULE_KEINU=12;
    public static final int RULE_ML_COMMENT=23;
    public static final int RULE_NOZU=10;
    public static final int RULE_KEINZ=13;
    public static final int RULE_TWOCHARS=17;

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

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
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
    // $ANTLR end "T__31"

    // $ANTLR start "RULE_SUBST"
    public final void mRULE_SUBST() throws RecognitionException {
        try {
            int _type = RULE_SUBST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:426:12: ( ( 'A' .. 'Z' | '\\u00C4' | '\\u00D6' | '\\u00DC' ) ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' )* )
            // InternalMyDsl.g:426:14: ( 'A' .. 'Z' | '\\u00C4' | '\\u00D6' | '\\u00DC' ) ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='\u00C4'||input.LA(1)=='\u00D6'||input.LA(1)=='\u00DC' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:426:52: ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' )*
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
            // InternalMyDsl.g:428:11: ( ( ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' )* 'en' | 'ern' | 'eln' ) )
            // InternalMyDsl.g:428:13: ( ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' )* 'en' | 'ern' | 'eln' )
            {
            // InternalMyDsl.g:428:13: ( ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' )* 'en' | 'ern' | 'eln' )
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
                    // InternalMyDsl.g:428:14: ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' )* 'en'
                    {
                    // InternalMyDsl.g:428:14: ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' )*
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
                    // InternalMyDsl.g:428:67: 'ern'
                    {
                    match("ern"); 


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:428:73: 'eln'
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

    // $ANTLR start "RULE_VERBOHNEZU"
    public final void mRULE_VERBOHNEZU() throws RecognitionException {
        try {
            int _type = RULE_VERBOHNEZU;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:430:17: ( ( ( RULE_NOZU )* 'en' | 'ern' | 'eln' ) )
            // InternalMyDsl.g:430:19: ( ( RULE_NOZU )* 'en' | 'ern' | 'eln' )
            {
            // InternalMyDsl.g:430:19: ( ( RULE_NOZU )* 'en' | 'ern' | 'eln' )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='e') ) {
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
                    alt5=1;
                    }
                    break;
                case 'r':
                    {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3=='n') ) {
                        int LA5_5 = input.LA(4);

                        if ( ((LA5_5>='a' && LA5_5<='z')||LA5_5=='\u00DF'||LA5_5=='\u00E4'||LA5_5=='\u00F6'||LA5_5=='\u00FC') ) {
                            alt5=1;
                        }
                        else {
                            alt5=2;}
                    }
                    else if ( ((LA5_3>='a' && LA5_3<='m')||(LA5_3>='o' && LA5_3<='z')||LA5_3=='\u00DF'||LA5_3=='\u00E4'||LA5_3=='\u00F6'||LA5_3=='\u00FC') ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 'l':
                    {
                    int LA5_4 = input.LA(3);

                    if ( (LA5_4=='n') ) {
                        int LA5_6 = input.LA(4);

                        if ( ((LA5_6>='a' && LA5_6<='z')||LA5_6=='\u00DF'||LA5_6=='\u00E4'||LA5_6=='\u00F6'||LA5_6=='\u00FC') ) {
                            alt5=1;
                        }
                        else {
                            alt5=3;}
                    }
                    else if ( ((LA5_4>='a' && LA5_4<='m')||(LA5_4>='o' && LA5_4<='z')||LA5_4=='\u00DF'||LA5_4=='\u00E4'||LA5_4=='\u00F6'||LA5_4=='\u00FC') ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA5_0>='a' && LA5_0<='d')||(LA5_0>='f' && LA5_0<='z')||LA5_0=='\u00DF'||LA5_0=='\u00E4'||LA5_0=='\u00F6'||LA5_0=='\u00FC') ) {
                alt5=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:430:20: ( RULE_NOZU )* 'en'
                    {
                    // InternalMyDsl.g:430:20: ( RULE_NOZU )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='e') ) {
                            int LA4_1 = input.LA(2);

                            if ( (LA4_1=='n') ) {
                                int LA4_3 = input.LA(3);

                                if ( ((LA4_3>='a' && LA4_3<='z')||LA4_3=='\u00DF'||LA4_3=='\u00E4'||LA4_3=='\u00F6'||LA4_3=='\u00FC') ) {
                                    alt4=1;
                                }


                            }
                            else if ( ((LA4_1>='a' && LA4_1<='m')||(LA4_1>='o' && LA4_1<='z')||LA4_1=='\u00DF'||LA4_1=='\u00E4'||LA4_1=='\u00F6'||LA4_1=='\u00FC') ) {
                                alt4=1;
                            }


                        }
                        else if ( ((LA4_0>='a' && LA4_0<='d')||(LA4_0>='f' && LA4_0<='z')||LA4_0=='\u00DF'||LA4_0=='\u00E4'||LA4_0=='\u00F6'||LA4_0=='\u00FC') ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:430:20: RULE_NOZU
                    	    {
                    	    mRULE_NOZU(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match("en"); 


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:430:36: 'ern'
                    {
                    match("ern"); 


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:430:42: 'eln'
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
    // $ANTLR end "RULE_VERBOHNEZU"

    // $ANTLR start "RULE_NOZU"
    public final void mRULE_NOZU() throws RecognitionException {
        try {
            // InternalMyDsl.g:432:20: ( ( RULE_ALLEBUCHSTABEN RULE_KEINU | RULE_KEINZ RULE_ALLEBUCHSTABEN ) )
            // InternalMyDsl.g:432:22: ( RULE_ALLEBUCHSTABEN RULE_KEINU | RULE_KEINZ RULE_ALLEBUCHSTABEN )
            {
            // InternalMyDsl.g:432:22: ( RULE_ALLEBUCHSTABEN RULE_KEINU | RULE_KEINZ RULE_ALLEBUCHSTABEN )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>='a' && LA6_0<='y')||LA6_0=='\u00DF'||LA6_0=='\u00E4'||LA6_0=='\u00F6'||LA6_0=='\u00FC') ) {
                int LA6_1 = input.LA(2);

                if ( ((LA6_1>='a' && LA6_1<='t')||(LA6_1>='v' && LA6_1<='z')||LA6_1=='\u00DF'||LA6_1=='\u00E4'||LA6_1=='\u00F6'||LA6_1=='\u00FC') ) {
                    alt6=1;
                }
                else if ( (LA6_1=='u') ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0=='z') ) {
                alt6=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:432:23: RULE_ALLEBUCHSTABEN RULE_KEINU
                    {
                    mRULE_ALLEBUCHSTABEN(); 
                    mRULE_KEINU(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:432:54: RULE_KEINZ RULE_ALLEBUCHSTABEN
                    {
                    mRULE_KEINZ(); 
                    mRULE_ALLEBUCHSTABEN(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOZU"

    // $ANTLR start "RULE_ALLEBUCHSTABEN"
    public final void mRULE_ALLEBUCHSTABEN() throws RecognitionException {
        try {
            // InternalMyDsl.g:434:30: ( ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' ) )
            // InternalMyDsl.g:434:32: ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' )
            {
            if ( (input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00DF'||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALLEBUCHSTABEN"

    // $ANTLR start "RULE_KEINU"
    public final void mRULE_KEINU() throws RecognitionException {
        try {
            // InternalMyDsl.g:436:21: ( ( 'a' .. 't' | 'v' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' ) )
            // InternalMyDsl.g:436:23: ( 'a' .. 't' | 'v' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' )
            {
            if ( (input.LA(1)>='a' && input.LA(1)<='t')||(input.LA(1)>='v' && input.LA(1)<='z')||input.LA(1)=='\u00DF'||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_KEINU"

    // $ANTLR start "RULE_KEINZ"
    public final void mRULE_KEINZ() throws RecognitionException {
        try {
            // InternalMyDsl.g:438:21: ( ( 'a' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' ) )
            // InternalMyDsl.g:438:23: ( 'a' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' )
            {
            if ( (input.LA(1)>='a' && input.LA(1)<='y')||input.LA(1)=='\u00DF'||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_KEINZ"

    // $ANTLR start "RULE_VERBMITEINEMZU"
    public final void mRULE_VERBMITEINEMZU() throws RecognitionException {
        try {
            int _type = RULE_VERBMITEINEMZU;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:440:21: ( ( RULE_Z RULE_U ( RULE_NOZU )* 'en' | 'ern' | 'eln' ) )
            // InternalMyDsl.g:440:23: ( RULE_Z RULE_U ( RULE_NOZU )* 'en' | 'ern' | 'eln' )
            {
            // InternalMyDsl.g:440:23: ( RULE_Z RULE_U ( RULE_NOZU )* 'en' | 'ern' | 'eln' )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='z') ) {
                alt8=1;
            }
            else if ( (LA8_0=='e') ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2=='r') ) {
                    alt8=2;
                }
                else if ( (LA8_2=='l') ) {
                    alt8=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:440:24: RULE_Z RULE_U ( RULE_NOZU )* 'en'
                    {
                    mRULE_Z(); 
                    mRULE_U(); 
                    // InternalMyDsl.g:440:38: ( RULE_NOZU )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='e') ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1=='n') ) {
                                int LA7_3 = input.LA(3);

                                if ( ((LA7_3>='a' && LA7_3<='z')||LA7_3=='\u00DF'||LA7_3=='\u00E4'||LA7_3=='\u00F6'||LA7_3=='\u00FC') ) {
                                    alt7=1;
                                }


                            }
                            else if ( ((LA7_1>='a' && LA7_1<='m')||(LA7_1>='o' && LA7_1<='z')||LA7_1=='\u00DF'||LA7_1=='\u00E4'||LA7_1=='\u00F6'||LA7_1=='\u00FC') ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0>='a' && LA7_0<='d')||(LA7_0>='f' && LA7_0<='z')||LA7_0=='\u00DF'||LA7_0=='\u00E4'||LA7_0=='\u00F6'||LA7_0=='\u00FC') ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:440:38: RULE_NOZU
                    	    {
                    	    mRULE_NOZU(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match("en"); 


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:440:54: 'ern'
                    {
                    match("ern"); 


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:440:60: 'eln'
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
    // $ANTLR end "RULE_VERBMITEINEMZU"

    // $ANTLR start "RULE_Z"
    public final void mRULE_Z() throws RecognitionException {
        try {
            // InternalMyDsl.g:442:17: ( 'z' )
            // InternalMyDsl.g:442:19: 'z'
            {
            match('z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_Z"

    // $ANTLR start "RULE_U"
    public final void mRULE_U() throws RecognitionException {
        try {
            // InternalMyDsl.g:444:17: ( 'u' )
            // InternalMyDsl.g:444:19: 'u'
            {
            match('u'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_U"

    // $ANTLR start "RULE_VERBMITZWEIZU"
    public final void mRULE_VERBMITZWEIZU() throws RecognitionException {
        try {
            int _type = RULE_VERBMITZWEIZU;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:446:20: ( ( RULE_Z RULE_U RULE_Z RULE_U ( RULE_NOZU )* 'en' | 'ern' | 'eln' ) )
            // InternalMyDsl.g:446:22: ( RULE_Z RULE_U RULE_Z RULE_U ( RULE_NOZU )* 'en' | 'ern' | 'eln' )
            {
            // InternalMyDsl.g:446:22: ( RULE_Z RULE_U RULE_Z RULE_U ( RULE_NOZU )* 'en' | 'ern' | 'eln' )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='z') ) {
                alt10=1;
            }
            else if ( (LA10_0=='e') ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2=='r') ) {
                    alt10=2;
                }
                else if ( (LA10_2=='l') ) {
                    alt10=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:446:23: RULE_Z RULE_U RULE_Z RULE_U ( RULE_NOZU )* 'en'
                    {
                    mRULE_Z(); 
                    mRULE_U(); 
                    mRULE_Z(); 
                    mRULE_U(); 
                    // InternalMyDsl.g:446:51: ( RULE_NOZU )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='e') ) {
                            int LA9_1 = input.LA(2);

                            if ( (LA9_1=='n') ) {
                                int LA9_3 = input.LA(3);

                                if ( ((LA9_3>='a' && LA9_3<='z')||LA9_3=='\u00DF'||LA9_3=='\u00E4'||LA9_3=='\u00F6'||LA9_3=='\u00FC') ) {
                                    alt9=1;
                                }


                            }
                            else if ( ((LA9_1>='a' && LA9_1<='m')||(LA9_1>='o' && LA9_1<='z')||LA9_1=='\u00DF'||LA9_1=='\u00E4'||LA9_1=='\u00F6'||LA9_1=='\u00FC') ) {
                                alt9=1;
                            }


                        }
                        else if ( ((LA9_0>='a' && LA9_0<='d')||(LA9_0>='f' && LA9_0<='z')||LA9_0=='\u00DF'||LA9_0=='\u00E4'||LA9_0=='\u00F6'||LA9_0=='\u00FC') ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMyDsl.g:446:51: RULE_NOZU
                    	    {
                    	    mRULE_NOZU(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match("en"); 


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:446:67: 'ern'
                    {
                    match("ern"); 


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:446:73: 'eln'
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
    // $ANTLR end "RULE_VERBMITZWEIZU"

    // $ANTLR start "RULE_VERBMITDREIZU"
    public final void mRULE_VERBMITDREIZU() throws RecognitionException {
        try {
            int _type = RULE_VERBMITDREIZU;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:448:20: ( ( RULE_Z RULE_U RULE_Z RULE_U RULE_Z RULE_U ( RULE_NOZU )* 'en' | 'ern' | 'eln' ) )
            // InternalMyDsl.g:448:22: ( RULE_Z RULE_U RULE_Z RULE_U RULE_Z RULE_U ( RULE_NOZU )* 'en' | 'ern' | 'eln' )
            {
            // InternalMyDsl.g:448:22: ( RULE_Z RULE_U RULE_Z RULE_U RULE_Z RULE_U ( RULE_NOZU )* 'en' | 'ern' | 'eln' )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='z') ) {
                alt12=1;
            }
            else if ( (LA12_0=='e') ) {
                int LA12_2 = input.LA(2);

                if ( (LA12_2=='r') ) {
                    alt12=2;
                }
                else if ( (LA12_2=='l') ) {
                    alt12=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:448:23: RULE_Z RULE_U RULE_Z RULE_U RULE_Z RULE_U ( RULE_NOZU )* 'en'
                    {
                    mRULE_Z(); 
                    mRULE_U(); 
                    mRULE_Z(); 
                    mRULE_U(); 
                    mRULE_Z(); 
                    mRULE_U(); 
                    // InternalMyDsl.g:448:65: ( RULE_NOZU )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='e') ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1=='n') ) {
                                int LA11_3 = input.LA(3);

                                if ( ((LA11_3>='a' && LA11_3<='z')||LA11_3=='\u00DF'||LA11_3=='\u00E4'||LA11_3=='\u00F6'||LA11_3=='\u00FC') ) {
                                    alt11=1;
                                }


                            }
                            else if ( ((LA11_1>='a' && LA11_1<='m')||(LA11_1>='o' && LA11_1<='z')||LA11_1=='\u00DF'||LA11_1=='\u00E4'||LA11_1=='\u00F6'||LA11_1=='\u00FC') ) {
                                alt11=1;
                            }


                        }
                        else if ( ((LA11_0>='a' && LA11_0<='d')||(LA11_0>='f' && LA11_0<='z')||LA11_0=='\u00DF'||LA11_0=='\u00E4'||LA11_0=='\u00F6'||LA11_0=='\u00FC') ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMyDsl.g:448:65: RULE_NOZU
                    	    {
                    	    mRULE_NOZU(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match("en"); 


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:448:81: 'ern'
                    {
                    match("ern"); 


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:448:87: 'eln'
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
    // $ANTLR end "RULE_VERBMITDREIZU"

    // $ANTLR start "RULE_TWOCHARS"
    public final void mRULE_TWOCHARS() throws RecognitionException {
        try {
            int _type = RULE_TWOCHARS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:450:15: ( ( RULE_NOZ | RULE_NOZU ) )
            // InternalMyDsl.g:450:17: ( RULE_NOZ | RULE_NOZU )
            {
            // InternalMyDsl.g:450:17: ( RULE_NOZ | RULE_NOZU )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>='a' && LA13_0<='y')||LA13_0=='\u00DF'||LA13_0=='\u00E4'||LA13_0=='\u00F6'||LA13_0=='\u00FC') ) {
                int LA13_1 = input.LA(2);

                if ( ((LA13_1>='a' && LA13_1<='z')||LA13_1=='\u00DF'||LA13_1=='\u00E4'||LA13_1=='\u00F6'||LA13_1=='\u00FC') ) {
                    alt13=2;
                }
                else {
                    alt13=1;}
            }
            else if ( (LA13_0=='z') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:450:18: RULE_NOZ
                    {
                    mRULE_NOZ(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:450:27: RULE_NOZU
                    {
                    mRULE_NOZU(); 

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
    // $ANTLR end "RULE_TWOCHARS"

    // $ANTLR start "RULE_NOZ"
    public final void mRULE_NOZ() throws RecognitionException {
        try {
            // InternalMyDsl.g:452:19: ( ( 'a' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' ) )
            // InternalMyDsl.g:452:21: ( 'a' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' )
            {
            if ( (input.LA(1)>='a' && input.LA(1)<='y')||input.LA(1)=='\u00DF'||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOZ"

    // $ANTLR start "RULE_ZBUTNOU"
    public final void mRULE_ZBUTNOU() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:23: ( ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' ) ( 'a' .. 't' | 'v' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' ) )
            // InternalMyDsl.g:454:25: ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' ) ( 'a' .. 't' | 'v' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' )
            {
            if ( (input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00DF'||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( (input.LA(1)>='a' && input.LA(1)<='t')||(input.LA(1)>='v' && input.LA(1)<='z')||input.LA(1)=='\u00DF'||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ZBUTNOU"

    // $ANTLR start "RULE_NOU"
    public final void mRULE_NOU() throws RecognitionException {
        try {
            // InternalMyDsl.g:456:19: ( ( 'a' .. 't' | 'v' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' ) )
            // InternalMyDsl.g:456:21: ( 'a' .. 't' | 'v' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' )
            {
            if ( (input.LA(1)>='a' && input.LA(1)<='t')||(input.LA(1)>='v' && input.LA(1)<='z')||input.LA(1)=='\u00DF'||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOU"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:458:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:458:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:458:11: ( '^' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='^') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:458:11: '^'
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

            // InternalMyDsl.g:458:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
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
            	    break loop15;
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
            // InternalMyDsl.g:460:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:460:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:460:12: ( '0' .. '9' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:460:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // InternalMyDsl.g:462:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:462:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:462:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\"') ) {
                alt19=1;
            }
            else if ( (LA19_0=='\'') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:462:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:462:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='!')||(LA17_0>='#' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalMyDsl.g:462:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:462:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop17;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:462:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:462:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\\') ) {
                            alt18=1;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalMyDsl.g:462:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:462:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop18;
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
            // InternalMyDsl.g:464:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:464:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:464:24: ( options {greedy=false; } : . )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='*') ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1=='/') ) {
                        alt20=2;
                    }
                    else if ( ((LA20_1>='\u0000' && LA20_1<='.')||(LA20_1>='0' && LA20_1<='\uFFFF')) ) {
                        alt20=1;
                    }


                }
                else if ( ((LA20_0>='\u0000' && LA20_0<=')')||(LA20_0>='+' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:464:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop20;
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
            // InternalMyDsl.g:466:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:466:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:466:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:466:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop21;
                }
            } while (true);

            // InternalMyDsl.g:466:40: ( ( '\\r' )? '\\n' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\n'||LA23_0=='\r') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:466:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:466:41: ( '\\r' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='\r') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalMyDsl.g:466:41: '\\r'
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
            // InternalMyDsl.g:468:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:468:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:468:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {
                    alt24=1;
                }


                switch (alt24) {
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
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
            // InternalMyDsl.g:470:16: ( . )
            // InternalMyDsl.g:470:18: .
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
        // InternalMyDsl.g:1:8: ( T__27 | T__28 | T__29 | T__30 | T__31 | RULE_SUBST | RULE_VERB | RULE_VERBOHNEZU | RULE_VERBMITEINEMZU | RULE_VERBMITZWEIZU | RULE_VERBMITDREIZU | RULE_TWOCHARS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt25=19;
        alt25 = dfa25.predict(input);
        switch (alt25) {
            case 1 :
                // InternalMyDsl.g:1:10: T__27
                {
                mT__27(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__28
                {
                mT__28(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__29
                {
                mT__29(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__30
                {
                mT__30(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__31
                {
                mT__31(); 

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
                // InternalMyDsl.g:1:61: RULE_VERBOHNEZU
                {
                mRULE_VERBOHNEZU(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:77: RULE_VERBMITEINEMZU
                {
                mRULE_VERBMITEINEMZU(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:97: RULE_VERBMITZWEIZU
                {
                mRULE_VERBMITZWEIZU(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:116: RULE_VERBMITDREIZU
                {
                mRULE_VERBMITDREIZU(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:135: RULE_TWOCHARS
                {
                mRULE_TWOCHARS(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:149: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:157: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:166: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:178: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:194: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:210: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:218: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA25_eotS =
        "\2\uffff\1\26\1\22\1\uffff\1\27\1\26\2\41\1\22\1\uffff\1\41\2\uffff\3\22\3\uffff\1\55\1\26\4\uffff\1\56\3\41\1\72\2\41\1\uffff\6\41\7\uffff\3\27\1\uffff\1\72\3\27\4\uffff\4\72\1\27\1\uffff\4\27\1\uffff\1\27\2\uffff\1\27\1\uffff\2\27\1\72\2\27\1\uffff\1\27\2\uffff\1\72\1\uffff\1\27\1\72\2\uffff\1\27\1\uffff\2\27\1\72\1\27\1\72\1\uffff\1\72\2\27\1\uffff\1\27\2\uffff\1\27\1\uffff\2\27\1\72\1\27\1\72\2\uffff\1\72\3\27\1\uffff\1\72\1\uffff\1\72\1\27\1\uffff\4\27\3\uffff\1\72\2\uffff\2\72\1\uffff";
    static final String DFA25_eofS =
        "\u0089\uffff";
    static final String DFA25_minS =
        "\1\0\1\uffff\1\60\1\40\1\uffff\1\141\3\60\1\101\1\uffff\1\141\2\uffff\2\0\1\52\3\uffff\2\60\4\uffff\2\60\1\141\4\60\1\uffff\1\60\1\141\2\60\2\141\7\uffff\4\141\1\60\6\141\1\uffff\2\60\1\141\1\60\16\141\1\60\11\141\1\60\12\141\1\60\12\141\1\60\1\141\1\60\11\141\1\60\11\141\1\60\5\141";
    static final String DFA25_maxS =
        "\1\uffff\1\uffff\1\172\1\40\1\uffff\1\u00fc\1\172\2\u00fc\1\172\1\uffff\1\u00fc\2\uffff\2\uffff\1\57\3\uffff\1\u00fc\1\172\4\uffff\7\u00fc\1\uffff\6\u00fc\7\uffff\13\u00fc\1\uffff\62\u00fc\1\172\33\u00fc";
    static final String DFA25_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\5\uffff\1\6\1\uffff\1\15\1\16\3\uffff\1\22\1\23\1\1\2\uffff\1\6\1\15\1\3\1\4\7\uffff\1\14\6\uffff\1\16\1\17\1\20\1\21\1\22\1\2\1\5\13\uffff\1\7\116\uffff";
    static final String DFA25_specialS =
        "\1\1\15\uffff\1\2\1\0\171\uffff}>";
    static final String[] DFA25_transitionS = {
            "\11\22\2\21\2\22\1\21\22\22\1\21\1\22\1\16\4\22\1\17\4\22\1\3\1\22\1\4\1\20\12\15\1\1\6\22\24\6\1\2\5\6\3\22\1\11\1\14\1\22\4\10\1\7\24\10\1\5\111\22\1\12\21\22\1\12\5\22\1\12\2\22\1\13\4\22\1\13\21\22\1\13\5\22\1\13\uff03\22",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\14\25\1\24\15\25",
            "\1\30",
            "",
            "\4\35\1\33\17\35\1\32\5\35\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\25",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\45\1\42\6\45\1\40\1\45\1\36\3\45\1\37\2\45\1\44\5\45\144\uffff\1\43\4\uffff\1\43\21\uffff\1\43\5\uffff\1\43",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\45\1\42\17\45\1\44\5\45\144\uffff\1\43\4\uffff\1\43\21\uffff\1\43\5\uffff\1\43",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\4\43\1\46\17\43\1\47\5\43\144\uffff\1\43\4\uffff\1\43\21\uffff\1\43\5\uffff\1\43",
            "",
            "",
            "\0\51",
            "\0\51",
            "\1\52\4\uffff\1\53",
            "",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\25\144\uffff\1\26\4\uffff\1\26\21\uffff\1\26\5\uffff\1\26",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\25",
            "",
            "",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\61\1\57\24\61\1\60\144\uffff\1\62\4\uffff\1\62\21\uffff\1\62\5\uffff\1\62",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\65\1\64\10\65\1\63\13\65\1\66\144\uffff\1\67\4\uffff\1\67\21\uffff\1\67\5\uffff\1\67",
            "\4\67\1\70\24\67\1\71\144\uffff\1\67\4\uffff\1\67\21\uffff\1\67\5\uffff\1\67",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\65\1\64\24\65\1\66\144\uffff\1\67\4\uffff\1\67\21\uffff\1\67\5\uffff\1\67",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\65\1\64\24\65\1\66\144\uffff\1\67\4\uffff\1\67\21\uffff\1\67\5\uffff\1\67",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\65\1\64\10\65\1\73\13\65\1\66\144\uffff\1\67\4\uffff\1\67\21\uffff\1\67\5\uffff\1\67",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\65\1\64\10\65\1\74\13\65\1\66\144\uffff\1\67\4\uffff\1\67\21\uffff\1\67\5\uffff\1\67",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\65\1\64\10\65\1\63\13\65\1\66\144\uffff\1\67\4\uffff\1\67\21\uffff\1\67\5\uffff\1\67",
            "\4\67\1\70\24\67\1\71\144\uffff\1\67\4\uffff\1\67\21\uffff\1\67\5\uffff\1\67",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\65\1\64\24\65\1\66\144\uffff\1\67\4\uffff\1\67\21\uffff\1\67\5\uffff\1\67",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\65\1\64\24\65\1\66\144\uffff\1\67\4\uffff\1\67\21\uffff\1\67\5\uffff\1\67",
            "\4\67\1\70\10\67\1\75\13\67\1\71\144\uffff\1\67\4\uffff\1\67\21\uffff\1\67\5\uffff\1\67",
            "\4\67\1\70\24\67\1\71\144\uffff\1\67\4\uffff\1\67\21\uffff\1\67\5\uffff\1\67",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\4\102\1\77\10\102\1\76\6\102\1\101\5\102\144\uffff\1\100\4\uffff\1\100\21\uffff\1\100\5\uffff\1\100",
            "\4\106\1\103\17\106\1\104\5\106\144\uffff\1\105\4\uffff\1\105\21\uffff\1\105\5\uffff\1\105",
            "\4\102\1\77\17\102\1\101\5\102\144\uffff\1\100\4\uffff\1\100\21\uffff\1\100\5\uffff\1\100",
            "\4\100\1\107\17\100\1\110\5\100\144\uffff\1\100\4\uffff\1\100\21\uffff\1\100\5\uffff\1\100",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\113\1\111\17\113\1\114\5\113\144\uffff\1\112\4\uffff\1\112\21\uffff\1\112\5\uffff\1\112",
            "\4\113\1\111\10\113\1\115\6\113\1\114\5\113\144\uffff\1\112\4\uffff\1\112\21\uffff\1\112\5\uffff\1\112",
            "\4\113\1\111\17\113\1\114\5\113\144\uffff\1\112\4\uffff\1\112\21\uffff\1\112\5\uffff\1\112",
            "\4\117\1\116\17\117\1\121\5\117\144\uffff\1\120\4\uffff\1\120\21\uffff\1\120\5\uffff\1\120",
            "\4\112\1\122\17\112\1\123\5\112\144\uffff\1\112\4\uffff\1\112\21\uffff\1\112\5\uffff\1\112",
            "\4\112\1\122\10\112\1\124\6\112\1\123\5\112\144\uffff\1\112\4\uffff\1\112\21\uffff\1\112\5\uffff\1\112",
            "\4\120\1\125\17\120\1\72\5\120\144\uffff\1\120\4\uffff\1\120\21\uffff\1\120\5\uffff\1\120",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\113\1\111\17\113\1\114\5\113\144\uffff\1\112\4\uffff\1\112\21\uffff\1\112\5\uffff\1\112",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\113\1\111\17\113\1\114\5\113\144\uffff\1\112\4\uffff\1\112\21\uffff\1\112\5\uffff\1\112",
            "\4\112\1\122\17\112\1\123\5\112\144\uffff\1\112\4\uffff\1\112\21\uffff\1\112\5\uffff\1\112",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\61\1\57\24\61\1\126\144\uffff\1\62\4\uffff\1\62\21\uffff\1\62\5\uffff\1\62",
            "\4\61\1\57\10\61\1\127\13\61\1\126\144\uffff\1\62\4\uffff\1\62\21\uffff\1\62\5\uffff\1\62",
            "\4\62\1\130\24\62\1\131\144\uffff\1\62\4\uffff\1\62\21\uffff\1\62\5\uffff\1\62",
            "\4\61\1\57\24\61\1\126\144\uffff\1\62\4\uffff\1\62\21\uffff\1\62\5\uffff\1\62",
            "\4\61\1\57\24\61\1\126\144\uffff\1\62\4\uffff\1\62\21\uffff\1\62\5\uffff\1\62",
            "\4\61\1\57\10\61\1\127\13\61\1\126\144\uffff\1\62\4\uffff\1\62\21\uffff\1\62\5\uffff\1\62",
            "\4\135\1\132\24\135\1\134\144\uffff\1\133\4\uffff\1\133\21\uffff\1\133\5\uffff\1\133",
            "\4\62\1\130\24\62\1\131\144\uffff\1\62\4\uffff\1\62\21\uffff\1\62\5\uffff\1\62",
            "\4\61\1\57\24\61\1\126\144\uffff\1\62\4\uffff\1\62\21\uffff\1\62\5\uffff\1\62",
            "\4\62\1\130\10\62\1\136\13\62\1\131\144\uffff\1\62\4\uffff\1\62\21\uffff\1\62\5\uffff\1\62",
            "\4\62\1\130\24\62\1\131\144\uffff\1\62\4\uffff\1\62\21\uffff\1\62\5\uffff\1\62",
            "\4\65\1\64\10\65\1\63\13\65\1\66\144\uffff\1\67\4\uffff\1\67\21\uffff\1\67\5\uffff\1\67",
            "\4\67\1\70\24\67\1\71\144\uffff\1\67\4\uffff\1\67\21\uffff\1\67\5\uffff\1\67",
            "\4\65\1\64\24\65\1\66\144\uffff\1\67\4\uffff\1\67\21\uffff\1\67\5\uffff\1\67",
            "\4\65\1\64\24\65\1\66\144\uffff\1\67\4\uffff\1\67\21\uffff\1\67\5\uffff\1\67",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\65\1\64\24\65\1\66\144\uffff\1\67\4\uffff\1\67\21\uffff\1\67\5\uffff\1\67",
            "\4\65\1\64\10\65\1\63\13\65\1\66\144\uffff\1\67\4\uffff\1\67\21\uffff\1\67\5\uffff\1\67",
            "\4\65\1\64\24\65\1\66\144\uffff\1\67\4\uffff\1\67\21\uffff\1\67\5\uffff\1\67",
            "\4\67\1\70\24\67\1\71\144\uffff\1\67\4\uffff\1\67\21\uffff\1\67\5\uffff\1\67",
            "\4\121\1\137\25\121\144\uffff\1\72\4\uffff\1\72\21\uffff\1\72\5\uffff\1\72",
            "\4\67\1\70\10\67\1\75\13\67\1\71\144\uffff\1\67\4\uffff\1\67\21\uffff\1\67\5\uffff\1\67",
            "\4\67\1\70\24\67\1\71\144\uffff\1\67\4\uffff\1\67\21\uffff\1\67\5\uffff\1\67",
            "\4\67\1\70\24\67\1\71\144\uffff\1\67\4\uffff\1\67\21\uffff\1\67\5\uffff\1\67",
            "\4\67\1\70\10\67\1\75\13\67\1\71\144\uffff\1\67\4\uffff\1\67\21\uffff\1\67\5\uffff\1\67",
            "\4\106\1\103\17\106\1\121\5\106\144\uffff\1\105\4\uffff\1\105\21\uffff\1\105\5\uffff\1\105",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\102\1\77\17\102\1\101\5\102\144\uffff\1\100\4\uffff\1\100\21\uffff\1\100\5\uffff\1\100",
            "\4\100\1\107\10\100\1\140\6\100\1\110\5\100\144\uffff\1\100\4\uffff\1\100\21\uffff\1\100\5\uffff\1\100",
            "\4\105\1\141\17\105\1\72\5\105\144\uffff\1\105\4\uffff\1\105\21\uffff\1\105\5\uffff\1\105",
            "\4\146\1\143\10\146\1\142\6\146\1\144\5\146\144\uffff\1\145\4\uffff\1\145\21\uffff\1\145\5\uffff\1\145",
            "\4\145\1\147\17\145\1\150\5\145\144\uffff\1\145\4\uffff\1\145\21\uffff\1\145\5\uffff\1\145",
            "\4\154\1\151\17\154\1\153\5\154\144\uffff\1\152\4\uffff\1\152\21\uffff\1\152\5\uffff\1\152",
            "\4\146\1\143\17\146\1\144\5\146\144\uffff\1\145\4\uffff\1\145\21\uffff\1\145\5\uffff\1\145",
            "\4\100\1\107\17\100\1\110\5\100\144\uffff\1\100\4\uffff\1\100\21\uffff\1\100\5\uffff\1\100",
            "\4\121\1\137\10\121\1\155\14\121\144\uffff\1\72\4\uffff\1\72\21\uffff\1\72\5\uffff\1\72",
            "\4\62\1\130\24\62\1\131\144\uffff\1\62\4\uffff\1\62\21\uffff\1\62\5\uffff\1\62",
            "\4\62\1\130\10\62\1\136\13\62\1\131\144\uffff\1\62\4\uffff\1\62\21\uffff\1\62\5\uffff\1\62",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\135\1\132\24\135\1\156\144\uffff\1\133\4\uffff\1\133\21\uffff\1\133\5\uffff\1\133",
            "\4\135\1\132\10\135\1\157\13\135\1\156\144\uffff\1\133\4\uffff\1\133\21\uffff\1\133\5\uffff\1\133",
            "\4\135\1\132\24\135\1\156\144\uffff\1\133\4\uffff\1\133\21\uffff\1\133\5\uffff\1\133",
            "\4\133\1\160\24\133\1\161\144\uffff\1\133\4\uffff\1\133\21\uffff\1\133\5\uffff\1\133",
            "\4\135\1\132\24\135\1\156\144\uffff\1\133\4\uffff\1\133\21\uffff\1\133\5\uffff\1\133",
            "\4\133\1\160\10\133\1\162\13\133\1\161\144\uffff\1\133\4\uffff\1\133\21\uffff\1\133\5\uffff\1\133",
            "\4\133\1\160\24\133\1\161\144\uffff\1\133\4\uffff\1\133\21\uffff\1\133\5\uffff\1\133",
            "\4\135\1\132\10\135\1\157\13\135\1\156\144\uffff\1\133\4\uffff\1\133\21\uffff\1\133\5\uffff\1\133",
            "\4\133\1\160\24\133\1\161\144\uffff\1\133\4\uffff\1\133\21\uffff\1\133\5\uffff\1\133",
            "\4\165\1\163\24\165\1\164\144\uffff\1\166\4\uffff\1\166\21\uffff\1\166\5\uffff\1\166",
            "\4\135\1\132\24\135\1\156\144\uffff\1\133\4\uffff\1\133\21\uffff\1\133\5\uffff\1\133",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\121\1\137\25\121",
            "\4\154\1\151\17\154\1\121\5\154\144\uffff\1\152\4\uffff\1\152\21\uffff\1\152\5\uffff\1\152",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\146\1\143\17\146\1\144\5\146\144\uffff\1\145\4\uffff\1\145\21\uffff\1\145\5\uffff\1\145",
            "\4\145\1\147\10\145\1\167\6\145\1\150\5\145\144\uffff\1\145\4\uffff\1\145\21\uffff\1\145\5\uffff\1\145",
            "\4\152\1\170\17\152\1\72\5\152\144\uffff\1\152\4\uffff\1\152\21\uffff\1\152\5\uffff\1\152",
            "\4\145\1\147\17\145\1\150\5\145\144\uffff\1\145\4\uffff\1\145\21\uffff\1\145\5\uffff\1\145",
            "\4\174\1\172\10\174\1\171\6\174\1\175\5\174\144\uffff\1\173\4\uffff\1\173\21\uffff\1\173\5\uffff\1\173",
            "\4\177\1\176\17\177\1\121\5\177\144\uffff\1\u0080\4\uffff\1\u0080\21\uffff\1\u0080\5\uffff\1\u0080",
            "\4\174\1\172\17\174\1\175\5\174\144\uffff\1\173\4\uffff\1\173\21\uffff\1\173\5\uffff\1\173",
            "\4\173\1\u0081\17\173\1\u0082\5\173\144\uffff\1\173\4\uffff\1\173\21\uffff\1\173\5\uffff\1\173",
            "\4\133\1\160\24\133\1\161\144\uffff\1\133\4\uffff\1\133\21\uffff\1\133\5\uffff\1\133",
            "\4\133\1\160\10\133\1\162\13\133\1\161\144\uffff\1\133\4\uffff\1\133\21\uffff\1\133\5\uffff\1\133",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\165\1\163\24\165\1\164\144\uffff\1\166\4\uffff\1\166\21\uffff\1\166\5\uffff\1\166",
            "\4\165\1\163\10\165\1\u0083\13\165\1\164\144\uffff\1\166\4\uffff\1\166\21\uffff\1\166\5\uffff\1\166",
            "\4\166\1\u0084\24\166\1\u0085\144\uffff\1\166\4\uffff\1\166\21\uffff\1\166\5\uffff\1\166",
            "\4\165\1\163\24\165\1\164\144\uffff\1\166\4\uffff\1\166\21\uffff\1\166\5\uffff\1\166",
            "\4\165\1\163\24\165\1\164\144\uffff\1\166\4\uffff\1\166\21\uffff\1\166\5\uffff\1\166",
            "\4\165\1\163\10\165\1\u0083\13\165\1\164\144\uffff\1\166\4\uffff\1\166\21\uffff\1\166\5\uffff\1\166",
            "\4\165\1\163\24\165\1\164\144\uffff\1\166\4\uffff\1\166\21\uffff\1\166\5\uffff\1\166",
            "\4\166\1\u0084\24\166\1\u0085\144\uffff\1\166\4\uffff\1\166\21\uffff\1\166\5\uffff\1\166",
            "\4\166\1\u0084\10\166\1\u0086\13\166\1\u0085\144\uffff\1\166\4\uffff\1\166\21\uffff\1\166\5\uffff\1\166",
            "\4\166\1\u0084\24\166\1\u0085\144\uffff\1\166\4\uffff\1\166\21\uffff\1\166\5\uffff\1\166",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\174\1\172\17\174\1\175\5\174\144\uffff\1\173\4\uffff\1\173\21\uffff\1\173\5\uffff\1\173",
            "\4\173\1\u0081\10\173\1\u0087\6\173\1\u0082\5\173\144\uffff\1\173\4\uffff\1\173\21\uffff\1\173\5\uffff\1\173",
            "\4\u0080\1\u0088\17\u0080\1\72\5\u0080\144\uffff\1\u0080\4\uffff\1\u0080\21\uffff\1\u0080\5\uffff\1\u0080",
            "\4\173\1\u0081\17\173\1\u0082\5\173\144\uffff\1\173\4\uffff\1\173\21\uffff\1\173\5\uffff\1\173",
            "\4\166\1\u0084\24\166\1\u0085\144\uffff\1\166\4\uffff\1\166\21\uffff\1\166\5\uffff\1\166",
            "\4\166\1\u0084\10\166\1\u0086\13\166\1\u0085\144\uffff\1\166\4\uffff\1\166\21\uffff\1\166\5\uffff\1\166"
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__27 | T__28 | T__29 | T__30 | T__31 | RULE_SUBST | RULE_VERB | RULE_VERBOHNEZU | RULE_VERBMITEINEMZU | RULE_VERBMITZWEIZU | RULE_VERBMITDREIZU | RULE_TWOCHARS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_15 = input.LA(1);

                        s = -1;
                        if ( ((LA25_15>='\u0000' && LA25_15<='\uFFFF')) ) {s = 41;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_0 = input.LA(1);

                        s = -1;
                        if ( (LA25_0==':') ) {s = 1;}

                        else if ( (LA25_0=='U') ) {s = 2;}

                        else if ( (LA25_0==',') ) {s = 3;}

                        else if ( (LA25_0=='.') ) {s = 4;}

                        else if ( (LA25_0=='z') ) {s = 5;}

                        else if ( ((LA25_0>='A' && LA25_0<='T')||(LA25_0>='V' && LA25_0<='Z')) ) {s = 6;}

                        else if ( (LA25_0=='e') ) {s = 7;}

                        else if ( ((LA25_0>='a' && LA25_0<='d')||(LA25_0>='f' && LA25_0<='y')) ) {s = 8;}

                        else if ( (LA25_0=='^') ) {s = 9;}

                        else if ( (LA25_0=='\u00C4'||LA25_0=='\u00D6'||LA25_0=='\u00DC') ) {s = 10;}

                        else if ( (LA25_0=='\u00DF'||LA25_0=='\u00E4'||LA25_0=='\u00F6'||LA25_0=='\u00FC') ) {s = 11;}

                        else if ( (LA25_0=='_') ) {s = 12;}

                        else if ( ((LA25_0>='0' && LA25_0<='9')) ) {s = 13;}

                        else if ( (LA25_0=='\"') ) {s = 14;}

                        else if ( (LA25_0=='\'') ) {s = 15;}

                        else if ( (LA25_0=='/') ) {s = 16;}

                        else if ( ((LA25_0>='\t' && LA25_0<='\n')||LA25_0=='\r'||LA25_0==' ') ) {s = 17;}

                        else if ( ((LA25_0>='\u0000' && LA25_0<='\b')||(LA25_0>='\u000B' && LA25_0<='\f')||(LA25_0>='\u000E' && LA25_0<='\u001F')||LA25_0=='!'||(LA25_0>='#' && LA25_0<='&')||(LA25_0>='(' && LA25_0<='+')||LA25_0=='-'||(LA25_0>=';' && LA25_0<='@')||(LA25_0>='[' && LA25_0<=']')||LA25_0=='`'||(LA25_0>='{' && LA25_0<='\u00C3')||(LA25_0>='\u00C5' && LA25_0<='\u00D5')||(LA25_0>='\u00D7' && LA25_0<='\u00DB')||(LA25_0>='\u00DD' && LA25_0<='\u00DE')||(LA25_0>='\u00E0' && LA25_0<='\u00E3')||(LA25_0>='\u00E5' && LA25_0<='\u00F5')||(LA25_0>='\u00F7' && LA25_0<='\u00FB')||(LA25_0>='\u00FD' && LA25_0<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_14 = input.LA(1);

                        s = -1;
                        if ( ((LA25_14>='\u0000' && LA25_14<='\uFFFF')) ) {s = 41;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}