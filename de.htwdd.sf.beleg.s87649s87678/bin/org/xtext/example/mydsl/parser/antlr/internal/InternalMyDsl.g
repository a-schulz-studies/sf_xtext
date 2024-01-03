/*
 * generated by Xtext 2.33.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleS
entryRuleS returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSRule()); }
	iv_ruleS=ruleS
	{ $current=$iv_ruleS.current; }
	EOF;

// Rule S
ruleS returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getSAccess().getTitelParserRuleCall_0());
		}
		this_Titel_0=ruleTitel
		{
			$current = $this_Titel_0.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getSAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSAccess().getSentenceYParserRuleCall_2_0());
				}
				lv_sentence_2_0=ruleY
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSRule());
					}
					set(
						$current,
						"sentence",
						lv_sentence_2_0,
						"org.xtext.example.mydsl.MyDsl.Y");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTitel
entryRuleTitel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTitelRule()); }
	iv_ruleTitel=ruleTitel
	{ $current=$iv_ruleTitel.current; }
	EOF;

// Rule Titel
ruleTitel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_s_0_0=RULE_SUBST
				{
					newLeafNode(lv_s_0_0, grammarAccess.getTitelAccess().getSSubstTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTitelRule());
					}
					setWithLastConsumed(
						$current,
						"s",
						lv_s_0_0,
						"org.xtext.example.mydsl.MyDsl.Subst");
				}
			)
		)
		(
			(
				lv_v_1_0=RULE_VERB
				{
					newLeafNode(lv_v_1_0, grammarAccess.getTitelAccess().getVVerbTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTitelRule());
					}
					setWithLastConsumed(
						$current,
						"v",
						lv_v_1_0,
						"org.xtext.example.mydsl.MyDsl.Verb");
				}
			)
		)
	)
;

// Entry rule entryRuleY
entryRuleY returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getYRule()); }
	iv_ruleY=ruleY
	{ $current=$iv_ruleY.current; }
	EOF;

// Rule Y
ruleY returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Um'
		{
			newLeafNode(otherlv_0, grammarAccess.getYAccess().getUmKeyword_0());
		}
		(
			(
				lv_s_1_0=RULE_SUBST
				{
					newLeafNode(lv_s_1_0, grammarAccess.getYAccess().getSSubstTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getYRule());
					}
					setWithLastConsumed(
						$current,
						"s",
						lv_s_1_0,
						"org.xtext.example.mydsl.MyDsl.Subst");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getYAccess().getNNutzenParserRuleCall_2_0());
				}
				lv_n_2_0=ruleNutzen
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getYRule());
					}
					set(
						$current,
						"n",
						lv_n_2_0,
						"org.xtext.example.mydsl.MyDsl.Nutzen");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=', m\u00F6chte ich als'
		{
			newLeafNode(otherlv_3, grammarAccess.getYAccess().getMöchteIchAlsKeyword_3());
		}
		(
			(
				lv_r_4_0=RULE_SUBST
				{
					newLeafNode(lv_r_4_0, grammarAccess.getYAccess().getRSubstTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getYRule());
					}
					setWithLastConsumed(
						$current,
						"r",
						lv_r_4_0,
						"org.xtext.example.mydsl.MyDsl.Subst");
				}
			)
		)
		(
			(
				lv_ziel_5_0=RULE_SUBST
				{
					newLeafNode(lv_ziel_5_0, grammarAccess.getYAccess().getZielSubstTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getYRule());
					}
					setWithLastConsumed(
						$current,
						"ziel",
						lv_ziel_5_0,
						"org.xtext.example.mydsl.MyDsl.Subst");
				}
			)
		)
		(
			(
				lv_wunsch_6_0=RULE_VERB
				{
					newLeafNode(lv_wunsch_6_0, grammarAccess.getYAccess().getWunschVerbTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getYRule());
					}
					setWithLastConsumed(
						$current,
						"wunsch",
						lv_wunsch_6_0,
						"org.xtext.example.mydsl.MyDsl.Verb");
				}
			)
		)
		otherlv_7='.'
		{
			newLeafNode(otherlv_7, grammarAccess.getYAccess().getFullStopKeyword_7());
		}
	)
;

// Entry rule entryRuleNutzen
entryRuleNutzen returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNutzenRule()); }
	iv_ruleNutzen=ruleNutzen
	{ $current=$iv_ruleNutzen.current; }
	EOF;

// Rule Nutzen
ruleNutzen returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getNutzenAccess().getVVerbNutzenParserRuleCall_0());
			}
			lv_v_0_0=ruleVerbNutzen
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getNutzenRule());
				}
				set(
					$current,
					"v",
					lv_v_0_0,
					"org.xtext.example.mydsl.MyDsl.VerbNutzen");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleVerbNutzen
entryRuleVerbNutzen returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVerbNutzenRule()); }
	iv_ruleVerbNutzen=ruleVerbNutzen
	{ $current=$iv_ruleVerbNutzen.current; }
	EOF;

// Rule VerbNutzen
ruleVerbNutzen returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='zu'
			{
				newLeafNode(otherlv_0, grammarAccess.getVerbNutzenAccess().getZuKeyword_0_0());
			}
			(
				(
					lv_v_1_0=RULE_VERBOHNEZU
					{
						newLeafNode(lv_v_1_0, grammarAccess.getVerbNutzenAccess().getVVerbOhneZuTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVerbNutzenRule());
						}
						setWithLastConsumed(
							$current,
							"v",
							lv_v_1_0,
							"org.xtext.example.mydsl.MyDsl.VerbOhneZu");
					}
				)
			)
		)
		    |
		(
			(
				lv_v_2_0=RULE_VERBMITEINEMZU
				{
					newLeafNode(lv_v_2_0, grammarAccess.getVerbNutzenAccess().getVVerbMitEinemZuTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVerbNutzenRule());
					}
					setWithLastConsumed(
						$current,
						"v",
						lv_v_2_0,
						"org.xtext.example.mydsl.MyDsl.VerbMitEinemZu");
				}
			)
		)
		    |
		(
			(
				lv_v_3_0=RULE_VERBMITZWEIZU
				{
					newLeafNode(lv_v_3_0, grammarAccess.getVerbNutzenAccess().getVVerbMitZweiZuTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVerbNutzenRule());
					}
					setWithLastConsumed(
						$current,
						"v",
						lv_v_3_0,
						"org.xtext.example.mydsl.MyDsl.VerbMitZweiZu");
				}
			)
		)
		    |
		(
			(
				lv_v_4_0=RULE_VERBMITDREIZU
				{
					newLeafNode(lv_v_4_0, grammarAccess.getVerbNutzenAccess().getVVerbMitDreiZuTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVerbNutzenRule());
					}
					setWithLastConsumed(
						$current,
						"v",
						lv_v_4_0,
						"org.xtext.example.mydsl.MyDsl.VerbMitDreiZu");
				}
			)
		)
	)
;

RULE_SUBST : ('A'..'Z'|'\u00C4'|'\u00D6'|'\u00DC') ('a'..'z'|'\u00E4'|'\u00F6'|'\u00FC'|'\u00DF')*;

RULE_VERB : (('a'..'z'|'\u00E4'|'\u00F6'|'\u00FC'|'\u00DF')* 'en'|'ern'|'eln');

RULE_VERBOHNEZU : (RULE_NOZU* 'en'|'ern'|'eln');

fragment RULE_NOZU : (RULE_ALLEBUCHSTABEN RULE_KEINU|RULE_KEINZ RULE_ALLEBUCHSTABEN);

fragment RULE_ALLEBUCHSTABEN : ('a'..'z'|'\u00E4'|'\u00F6'|'\u00FC'|'\u00DF');

fragment RULE_KEINU : ('a'..'t'|'v'..'z'|'\u00E4'|'\u00F6'|'\u00FC'|'\u00DF');

fragment RULE_KEINZ : ('a'..'y'|'\u00E4'|'\u00F6'|'\u00FC'|'\u00DF');

RULE_VERBMITEINEMZU : (RULE_Z RULE_U RULE_NOZU* 'en'|'ern'|'eln');

fragment RULE_Z : 'z';

fragment RULE_U : 'u';

RULE_VERBMITZWEIZU : (RULE_Z RULE_U RULE_Z RULE_U RULE_NOZU* 'en'|'ern'|'eln');

RULE_VERBMITDREIZU : (RULE_Z RULE_U RULE_Z RULE_U RULE_Z RULE_U RULE_NOZU* 'en'|'ern'|'eln');

RULE_TWOCHARS : (RULE_NOZ|RULE_NOZU);

fragment RULE_NOZ : ('a'..'y'|'\u00E4'|'\u00F6'|'\u00FC'|'\u00DF');

fragment RULE_ZBUTNOU : ('a'..'z'|'\u00E4'|'\u00F6'|'\u00FC'|'\u00DF') ('a'..'t'|'v'..'z'|'\u00E4'|'\u00F6'|'\u00FC'|'\u00DF');

fragment RULE_NOU : ('a'..'t'|'v'..'z'|'\u00E4'|'\u00F6'|'\u00FC'|'\u00DF');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
