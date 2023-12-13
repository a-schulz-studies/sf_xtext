package de.htwdd.sf.xtext.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.htwdd.sf.xtext.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SUBST", "RULE_VERB", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'Um'", "', m\\u00F6chte ich als'", "'.'", "'zu'"
    };
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "S";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleS"
    // InternalMyDsl.g:64:1: entryRuleS returns [EObject current=null] : iv_ruleS= ruleS EOF ;
    public final EObject entryRuleS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleS = null;


        try {
            // InternalMyDsl.g:64:42: (iv_ruleS= ruleS EOF )
            // InternalMyDsl.g:65:2: iv_ruleS= ruleS EOF
            {
             newCompositeNode(grammarAccess.getSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleS=ruleS();

            state._fsp--;

             current =iv_ruleS; 
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
    // $ANTLR end "entryRuleS"


    // $ANTLR start "ruleS"
    // InternalMyDsl.g:71:1: ruleS returns [EObject current=null] : (this_Titel_0= ruleTitel otherlv_1= ':' ( (lv_sentence_2_0= ruleY ) ) ) ;
    public final EObject ruleS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Titel_0 = null;

        EObject lv_sentence_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (this_Titel_0= ruleTitel otherlv_1= ':' ( (lv_sentence_2_0= ruleY ) ) ) )
            // InternalMyDsl.g:78:2: (this_Titel_0= ruleTitel otherlv_1= ':' ( (lv_sentence_2_0= ruleY ) ) )
            {
            // InternalMyDsl.g:78:2: (this_Titel_0= ruleTitel otherlv_1= ':' ( (lv_sentence_2_0= ruleY ) ) )
            // InternalMyDsl.g:79:3: this_Titel_0= ruleTitel otherlv_1= ':' ( (lv_sentence_2_0= ruleY ) )
            {

            			newCompositeNode(grammarAccess.getSAccess().getTitelParserRuleCall_0());
            		
            pushFollow(FOLLOW_3);
            this_Titel_0=ruleTitel();

            state._fsp--;


            			current = this_Titel_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:91:3: ( (lv_sentence_2_0= ruleY ) )
            // InternalMyDsl.g:92:4: (lv_sentence_2_0= ruleY )
            {
            // InternalMyDsl.g:92:4: (lv_sentence_2_0= ruleY )
            // InternalMyDsl.g:93:5: lv_sentence_2_0= ruleY
            {

            					newCompositeNode(grammarAccess.getSAccess().getSentenceYParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_sentence_2_0=ruleY();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSRule());
            					}
            					set(
            						current,
            						"sentence",
            						lv_sentence_2_0,
            						"de.htwdd.sf.xtext.mydsl.MyDsl.Y");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleS"


    // $ANTLR start "entryRuleTitel"
    // InternalMyDsl.g:114:1: entryRuleTitel returns [EObject current=null] : iv_ruleTitel= ruleTitel EOF ;
    public final EObject entryRuleTitel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitel = null;


        try {
            // InternalMyDsl.g:114:46: (iv_ruleTitel= ruleTitel EOF )
            // InternalMyDsl.g:115:2: iv_ruleTitel= ruleTitel EOF
            {
             newCompositeNode(grammarAccess.getTitelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitel=ruleTitel();

            state._fsp--;

             current =iv_ruleTitel; 
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
    // $ANTLR end "entryRuleTitel"


    // $ANTLR start "ruleTitel"
    // InternalMyDsl.g:121:1: ruleTitel returns [EObject current=null] : ( ( (lv_s_0_0= RULE_SUBST ) ) ( (lv_v_1_0= RULE_VERB ) ) ) ;
    public final EObject ruleTitel() throws RecognitionException {
        EObject current = null;

        Token lv_s_0_0=null;
        Token lv_v_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:127:2: ( ( ( (lv_s_0_0= RULE_SUBST ) ) ( (lv_v_1_0= RULE_VERB ) ) ) )
            // InternalMyDsl.g:128:2: ( ( (lv_s_0_0= RULE_SUBST ) ) ( (lv_v_1_0= RULE_VERB ) ) )
            {
            // InternalMyDsl.g:128:2: ( ( (lv_s_0_0= RULE_SUBST ) ) ( (lv_v_1_0= RULE_VERB ) ) )
            // InternalMyDsl.g:129:3: ( (lv_s_0_0= RULE_SUBST ) ) ( (lv_v_1_0= RULE_VERB ) )
            {
            // InternalMyDsl.g:129:3: ( (lv_s_0_0= RULE_SUBST ) )
            // InternalMyDsl.g:130:4: (lv_s_0_0= RULE_SUBST )
            {
            // InternalMyDsl.g:130:4: (lv_s_0_0= RULE_SUBST )
            // InternalMyDsl.g:131:5: lv_s_0_0= RULE_SUBST
            {
            lv_s_0_0=(Token)match(input,RULE_SUBST,FOLLOW_5); 

            					newLeafNode(lv_s_0_0, grammarAccess.getTitelAccess().getSSubstTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTitelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"s",
            						lv_s_0_0,
            						"de.htwdd.sf.xtext.mydsl.MyDsl.Subst");
            				

            }


            }

            // InternalMyDsl.g:147:3: ( (lv_v_1_0= RULE_VERB ) )
            // InternalMyDsl.g:148:4: (lv_v_1_0= RULE_VERB )
            {
            // InternalMyDsl.g:148:4: (lv_v_1_0= RULE_VERB )
            // InternalMyDsl.g:149:5: lv_v_1_0= RULE_VERB
            {
            lv_v_1_0=(Token)match(input,RULE_VERB,FOLLOW_2); 

            					newLeafNode(lv_v_1_0, grammarAccess.getTitelAccess().getVVerbTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTitelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"v",
            						lv_v_1_0,
            						"de.htwdd.sf.xtext.mydsl.MyDsl.Verb");
            				

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
    // $ANTLR end "ruleTitel"


    // $ANTLR start "entryRuleY"
    // InternalMyDsl.g:169:1: entryRuleY returns [EObject current=null] : iv_ruleY= ruleY EOF ;
    public final EObject entryRuleY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleY = null;


        try {
            // InternalMyDsl.g:169:42: (iv_ruleY= ruleY EOF )
            // InternalMyDsl.g:170:2: iv_ruleY= ruleY EOF
            {
             newCompositeNode(grammarAccess.getYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleY=ruleY();

            state._fsp--;

             current =iv_ruleY; 
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
    // $ANTLR end "entryRuleY"


    // $ANTLR start "ruleY"
    // InternalMyDsl.g:176:1: ruleY returns [EObject current=null] : (otherlv_0= 'Um' ( (lv_s_1_0= RULE_SUBST ) ) ( (lv_n_2_0= ruleNutzen ) ) otherlv_3= ', m\\u00F6chte ich als' ( (lv_r_4_0= RULE_SUBST ) ) ( (lv_ziel_5_0= RULE_SUBST ) ) ( (lv_wunsch_6_0= RULE_VERB ) ) otherlv_7= '.' ) ;
    public final EObject ruleY() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_s_1_0=null;
        Token otherlv_3=null;
        Token lv_r_4_0=null;
        Token lv_ziel_5_0=null;
        Token lv_wunsch_6_0=null;
        Token otherlv_7=null;
        EObject lv_n_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:182:2: ( (otherlv_0= 'Um' ( (lv_s_1_0= RULE_SUBST ) ) ( (lv_n_2_0= ruleNutzen ) ) otherlv_3= ', m\\u00F6chte ich als' ( (lv_r_4_0= RULE_SUBST ) ) ( (lv_ziel_5_0= RULE_SUBST ) ) ( (lv_wunsch_6_0= RULE_VERB ) ) otherlv_7= '.' ) )
            // InternalMyDsl.g:183:2: (otherlv_0= 'Um' ( (lv_s_1_0= RULE_SUBST ) ) ( (lv_n_2_0= ruleNutzen ) ) otherlv_3= ', m\\u00F6chte ich als' ( (lv_r_4_0= RULE_SUBST ) ) ( (lv_ziel_5_0= RULE_SUBST ) ) ( (lv_wunsch_6_0= RULE_VERB ) ) otherlv_7= '.' )
            {
            // InternalMyDsl.g:183:2: (otherlv_0= 'Um' ( (lv_s_1_0= RULE_SUBST ) ) ( (lv_n_2_0= ruleNutzen ) ) otherlv_3= ', m\\u00F6chte ich als' ( (lv_r_4_0= RULE_SUBST ) ) ( (lv_ziel_5_0= RULE_SUBST ) ) ( (lv_wunsch_6_0= RULE_VERB ) ) otherlv_7= '.' )
            // InternalMyDsl.g:184:3: otherlv_0= 'Um' ( (lv_s_1_0= RULE_SUBST ) ) ( (lv_n_2_0= ruleNutzen ) ) otherlv_3= ', m\\u00F6chte ich als' ( (lv_r_4_0= RULE_SUBST ) ) ( (lv_ziel_5_0= RULE_SUBST ) ) ( (lv_wunsch_6_0= RULE_VERB ) ) otherlv_7= '.'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getYAccess().getUmKeyword_0());
            		
            // InternalMyDsl.g:188:3: ( (lv_s_1_0= RULE_SUBST ) )
            // InternalMyDsl.g:189:4: (lv_s_1_0= RULE_SUBST )
            {
            // InternalMyDsl.g:189:4: (lv_s_1_0= RULE_SUBST )
            // InternalMyDsl.g:190:5: lv_s_1_0= RULE_SUBST
            {
            lv_s_1_0=(Token)match(input,RULE_SUBST,FOLLOW_7); 

            					newLeafNode(lv_s_1_0, grammarAccess.getYAccess().getSSubstTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getYRule());
            					}
            					setWithLastConsumed(
            						current,
            						"s",
            						lv_s_1_0,
            						"de.htwdd.sf.xtext.mydsl.MyDsl.Subst");
            				

            }


            }

            // InternalMyDsl.g:206:3: ( (lv_n_2_0= ruleNutzen ) )
            // InternalMyDsl.g:207:4: (lv_n_2_0= ruleNutzen )
            {
            // InternalMyDsl.g:207:4: (lv_n_2_0= ruleNutzen )
            // InternalMyDsl.g:208:5: lv_n_2_0= ruleNutzen
            {

            					newCompositeNode(grammarAccess.getYAccess().getNNutzenParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_n_2_0=ruleNutzen();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getYRule());
            					}
            					set(
            						current,
            						"n",
            						lv_n_2_0,
            						"de.htwdd.sf.xtext.mydsl.MyDsl.Nutzen");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getYAccess().getMöchteIchAlsKeyword_3());
            		
            // InternalMyDsl.g:229:3: ( (lv_r_4_0= RULE_SUBST ) )
            // InternalMyDsl.g:230:4: (lv_r_4_0= RULE_SUBST )
            {
            // InternalMyDsl.g:230:4: (lv_r_4_0= RULE_SUBST )
            // InternalMyDsl.g:231:5: lv_r_4_0= RULE_SUBST
            {
            lv_r_4_0=(Token)match(input,RULE_SUBST,FOLLOW_6); 

            					newLeafNode(lv_r_4_0, grammarAccess.getYAccess().getRSubstTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getYRule());
            					}
            					setWithLastConsumed(
            						current,
            						"r",
            						lv_r_4_0,
            						"de.htwdd.sf.xtext.mydsl.MyDsl.Subst");
            				

            }


            }

            // InternalMyDsl.g:247:3: ( (lv_ziel_5_0= RULE_SUBST ) )
            // InternalMyDsl.g:248:4: (lv_ziel_5_0= RULE_SUBST )
            {
            // InternalMyDsl.g:248:4: (lv_ziel_5_0= RULE_SUBST )
            // InternalMyDsl.g:249:5: lv_ziel_5_0= RULE_SUBST
            {
            lv_ziel_5_0=(Token)match(input,RULE_SUBST,FOLLOW_5); 

            					newLeafNode(lv_ziel_5_0, grammarAccess.getYAccess().getZielSubstTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getYRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ziel",
            						lv_ziel_5_0,
            						"de.htwdd.sf.xtext.mydsl.MyDsl.Subst");
            				

            }


            }

            // InternalMyDsl.g:265:3: ( (lv_wunsch_6_0= RULE_VERB ) )
            // InternalMyDsl.g:266:4: (lv_wunsch_6_0= RULE_VERB )
            {
            // InternalMyDsl.g:266:4: (lv_wunsch_6_0= RULE_VERB )
            // InternalMyDsl.g:267:5: lv_wunsch_6_0= RULE_VERB
            {
            lv_wunsch_6_0=(Token)match(input,RULE_VERB,FOLLOW_9); 

            					newLeafNode(lv_wunsch_6_0, grammarAccess.getYAccess().getWunschVerbTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getYRule());
            					}
            					setWithLastConsumed(
            						current,
            						"wunsch",
            						lv_wunsch_6_0,
            						"de.htwdd.sf.xtext.mydsl.MyDsl.Verb");
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getYAccess().getFullStopKeyword_7());
            		

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
    // $ANTLR end "ruleY"


    // $ANTLR start "entryRuleNutzen"
    // InternalMyDsl.g:291:1: entryRuleNutzen returns [EObject current=null] : iv_ruleNutzen= ruleNutzen EOF ;
    public final EObject entryRuleNutzen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNutzen = null;


        try {
            // InternalMyDsl.g:291:47: (iv_ruleNutzen= ruleNutzen EOF )
            // InternalMyDsl.g:292:2: iv_ruleNutzen= ruleNutzen EOF
            {
             newCompositeNode(grammarAccess.getNutzenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNutzen=ruleNutzen();

            state._fsp--;

             current =iv_ruleNutzen; 
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
    // $ANTLR end "entryRuleNutzen"


    // $ANTLR start "ruleNutzen"
    // InternalMyDsl.g:298:1: ruleNutzen returns [EObject current=null] : (otherlv_0= 'zu' ( (lv_v_1_0= RULE_VERB ) ) ) ;
    public final EObject ruleNutzen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_v_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:304:2: ( (otherlv_0= 'zu' ( (lv_v_1_0= RULE_VERB ) ) ) )
            // InternalMyDsl.g:305:2: (otherlv_0= 'zu' ( (lv_v_1_0= RULE_VERB ) ) )
            {
            // InternalMyDsl.g:305:2: (otherlv_0= 'zu' ( (lv_v_1_0= RULE_VERB ) ) )
            // InternalMyDsl.g:306:3: otherlv_0= 'zu' ( (lv_v_1_0= RULE_VERB ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getNutzenAccess().getZuKeyword_0());
            		
            // InternalMyDsl.g:310:3: ( (lv_v_1_0= RULE_VERB ) )
            // InternalMyDsl.g:311:4: (lv_v_1_0= RULE_VERB )
            {
            // InternalMyDsl.g:311:4: (lv_v_1_0= RULE_VERB )
            // InternalMyDsl.g:312:5: lv_v_1_0= RULE_VERB
            {
            lv_v_1_0=(Token)match(input,RULE_VERB,FOLLOW_2); 

            					newLeafNode(lv_v_1_0, grammarAccess.getNutzenAccess().getVVerbTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNutzenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"v",
            						lv_v_1_0,
            						"de.htwdd.sf.xtext.mydsl.MyDsl.Verb");
            				

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
    // $ANTLR end "ruleNutzen"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});

}