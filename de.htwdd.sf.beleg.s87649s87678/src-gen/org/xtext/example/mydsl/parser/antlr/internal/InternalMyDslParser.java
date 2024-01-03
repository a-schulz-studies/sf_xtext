package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SUBST", "RULE_VERB", "RULE_VERBOHNEZU", "RULE_VERBMITEINEMZU", "RULE_VERBMITZWEIZU", "RULE_VERBMITDREIZU", "RULE_NOZU", "RULE_ALLEBUCHSTABEN", "RULE_KEINU", "RULE_KEINZ", "RULE_Z", "RULE_U", "RULE_NOZ", "RULE_TWOCHARS", "RULE_ZBUTNOU", "RULE_NOU", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'Um'", "', m\\u00F6chte ich als'", "'.'", "'zu'"
    };
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
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

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
            						"org.xtext.example.mydsl.MyDsl.Y");
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
            						"org.xtext.example.mydsl.MyDsl.Subst");
            				

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
            						"org.xtext.example.mydsl.MyDsl.Verb");
            				

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
            otherlv_0=(Token)match(input,28,FOLLOW_6); 

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
            						"org.xtext.example.mydsl.MyDsl.Subst");
            				

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
            						"org.xtext.example.mydsl.MyDsl.Nutzen");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_6); 

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
            						"org.xtext.example.mydsl.MyDsl.Subst");
            				

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
            						"org.xtext.example.mydsl.MyDsl.Subst");
            				

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
            						"org.xtext.example.mydsl.MyDsl.Verb");
            				

            }


            }

            otherlv_7=(Token)match(input,30,FOLLOW_2); 

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
    // InternalMyDsl.g:298:1: ruleNutzen returns [EObject current=null] : ( (lv_v_0_0= ruleVerbNutzen ) ) ;
    public final EObject ruleNutzen() throws RecognitionException {
        EObject current = null;

        EObject lv_v_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:304:2: ( ( (lv_v_0_0= ruleVerbNutzen ) ) )
            // InternalMyDsl.g:305:2: ( (lv_v_0_0= ruleVerbNutzen ) )
            {
            // InternalMyDsl.g:305:2: ( (lv_v_0_0= ruleVerbNutzen ) )
            // InternalMyDsl.g:306:3: (lv_v_0_0= ruleVerbNutzen )
            {
            // InternalMyDsl.g:306:3: (lv_v_0_0= ruleVerbNutzen )
            // InternalMyDsl.g:307:4: lv_v_0_0= ruleVerbNutzen
            {

            				newCompositeNode(grammarAccess.getNutzenAccess().getVVerbNutzenParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_v_0_0=ruleVerbNutzen();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNutzenRule());
            				}
            				set(
            					current,
            					"v",
            					lv_v_0_0,
            					"org.xtext.example.mydsl.MyDsl.VerbNutzen");
            				afterParserOrEnumRuleCall();
            			

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


    // $ANTLR start "entryRuleVerbNutzen"
    // InternalMyDsl.g:327:1: entryRuleVerbNutzen returns [EObject current=null] : iv_ruleVerbNutzen= ruleVerbNutzen EOF ;
    public final EObject entryRuleVerbNutzen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerbNutzen = null;


        try {
            // InternalMyDsl.g:327:51: (iv_ruleVerbNutzen= ruleVerbNutzen EOF )
            // InternalMyDsl.g:328:2: iv_ruleVerbNutzen= ruleVerbNutzen EOF
            {
             newCompositeNode(grammarAccess.getVerbNutzenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerbNutzen=ruleVerbNutzen();

            state._fsp--;

             current =iv_ruleVerbNutzen; 
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
    // $ANTLR end "entryRuleVerbNutzen"


    // $ANTLR start "ruleVerbNutzen"
    // InternalMyDsl.g:334:1: ruleVerbNutzen returns [EObject current=null] : ( (otherlv_0= 'zu' ( (lv_v_1_0= RULE_VERBOHNEZU ) ) ) | ( (lv_v_2_0= RULE_VERBMITEINEMZU ) ) | ( (lv_v_3_0= RULE_VERBMITZWEIZU ) ) | ( (lv_v_4_0= RULE_VERBMITDREIZU ) ) ) ;
    public final EObject ruleVerbNutzen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_v_1_0=null;
        Token lv_v_2_0=null;
        Token lv_v_3_0=null;
        Token lv_v_4_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:340:2: ( ( (otherlv_0= 'zu' ( (lv_v_1_0= RULE_VERBOHNEZU ) ) ) | ( (lv_v_2_0= RULE_VERBMITEINEMZU ) ) | ( (lv_v_3_0= RULE_VERBMITZWEIZU ) ) | ( (lv_v_4_0= RULE_VERBMITDREIZU ) ) ) )
            // InternalMyDsl.g:341:2: ( (otherlv_0= 'zu' ( (lv_v_1_0= RULE_VERBOHNEZU ) ) ) | ( (lv_v_2_0= RULE_VERBMITEINEMZU ) ) | ( (lv_v_3_0= RULE_VERBMITZWEIZU ) ) | ( (lv_v_4_0= RULE_VERBMITDREIZU ) ) )
            {
            // InternalMyDsl.g:341:2: ( (otherlv_0= 'zu' ( (lv_v_1_0= RULE_VERBOHNEZU ) ) ) | ( (lv_v_2_0= RULE_VERBMITEINEMZU ) ) | ( (lv_v_3_0= RULE_VERBMITZWEIZU ) ) | ( (lv_v_4_0= RULE_VERBMITDREIZU ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt1=1;
                }
                break;
            case RULE_VERBMITEINEMZU:
                {
                alt1=2;
                }
                break;
            case RULE_VERBMITZWEIZU:
                {
                alt1=3;
                }
                break;
            case RULE_VERBMITDREIZU:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:342:3: (otherlv_0= 'zu' ( (lv_v_1_0= RULE_VERBOHNEZU ) ) )
                    {
                    // InternalMyDsl.g:342:3: (otherlv_0= 'zu' ( (lv_v_1_0= RULE_VERBOHNEZU ) ) )
                    // InternalMyDsl.g:343:4: otherlv_0= 'zu' ( (lv_v_1_0= RULE_VERBOHNEZU ) )
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getVerbNutzenAccess().getZuKeyword_0_0());
                    			
                    // InternalMyDsl.g:347:4: ( (lv_v_1_0= RULE_VERBOHNEZU ) )
                    // InternalMyDsl.g:348:5: (lv_v_1_0= RULE_VERBOHNEZU )
                    {
                    // InternalMyDsl.g:348:5: (lv_v_1_0= RULE_VERBOHNEZU )
                    // InternalMyDsl.g:349:6: lv_v_1_0= RULE_VERBOHNEZU
                    {
                    lv_v_1_0=(Token)match(input,RULE_VERBOHNEZU,FOLLOW_2); 

                    						newLeafNode(lv_v_1_0, grammarAccess.getVerbNutzenAccess().getVVerbOhneZuTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVerbNutzenRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"v",
                    							lv_v_1_0,
                    							"org.xtext.example.mydsl.MyDsl.VerbOhneZu");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:367:3: ( (lv_v_2_0= RULE_VERBMITEINEMZU ) )
                    {
                    // InternalMyDsl.g:367:3: ( (lv_v_2_0= RULE_VERBMITEINEMZU ) )
                    // InternalMyDsl.g:368:4: (lv_v_2_0= RULE_VERBMITEINEMZU )
                    {
                    // InternalMyDsl.g:368:4: (lv_v_2_0= RULE_VERBMITEINEMZU )
                    // InternalMyDsl.g:369:5: lv_v_2_0= RULE_VERBMITEINEMZU
                    {
                    lv_v_2_0=(Token)match(input,RULE_VERBMITEINEMZU,FOLLOW_2); 

                    					newLeafNode(lv_v_2_0, grammarAccess.getVerbNutzenAccess().getVVerbMitEinemZuTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVerbNutzenRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"v",
                    						lv_v_2_0,
                    						"org.xtext.example.mydsl.MyDsl.VerbMitEinemZu");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:386:3: ( (lv_v_3_0= RULE_VERBMITZWEIZU ) )
                    {
                    // InternalMyDsl.g:386:3: ( (lv_v_3_0= RULE_VERBMITZWEIZU ) )
                    // InternalMyDsl.g:387:4: (lv_v_3_0= RULE_VERBMITZWEIZU )
                    {
                    // InternalMyDsl.g:387:4: (lv_v_3_0= RULE_VERBMITZWEIZU )
                    // InternalMyDsl.g:388:5: lv_v_3_0= RULE_VERBMITZWEIZU
                    {
                    lv_v_3_0=(Token)match(input,RULE_VERBMITZWEIZU,FOLLOW_2); 

                    					newLeafNode(lv_v_3_0, grammarAccess.getVerbNutzenAccess().getVVerbMitZweiZuTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVerbNutzenRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"v",
                    						lv_v_3_0,
                    						"org.xtext.example.mydsl.MyDsl.VerbMitZweiZu");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:405:3: ( (lv_v_4_0= RULE_VERBMITDREIZU ) )
                    {
                    // InternalMyDsl.g:405:3: ( (lv_v_4_0= RULE_VERBMITDREIZU ) )
                    // InternalMyDsl.g:406:4: (lv_v_4_0= RULE_VERBMITDREIZU )
                    {
                    // InternalMyDsl.g:406:4: (lv_v_4_0= RULE_VERBMITDREIZU )
                    // InternalMyDsl.g:407:5: lv_v_4_0= RULE_VERBMITDREIZU
                    {
                    lv_v_4_0=(Token)match(input,RULE_VERBMITDREIZU,FOLLOW_2); 

                    					newLeafNode(lv_v_4_0, grammarAccess.getVerbNutzenAccess().getVVerbMitDreiZuTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVerbNutzenRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"v",
                    						lv_v_4_0,
                    						"org.xtext.example.mydsl.MyDsl.VerbMitDreiZu");
                    				

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
    // $ANTLR end "ruleVerbNutzen"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080000380L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});

}