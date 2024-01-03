/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class SElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.S");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTitelParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSentenceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSentenceYParserRuleCall_2_0 = (RuleCall)cSentenceAssignment_2.eContents().get(0);
		
		//S: Titel ":" sentence=Y;
		@Override public ParserRule getRule() { return rule; }
		
		//Titel ":" sentence=Y
		public Group getGroup() { return cGroup; }
		
		//Titel
		public RuleCall getTitelParserRuleCall_0() { return cTitelParserRuleCall_0; }
		
		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//sentence=Y
		public Assignment getSentenceAssignment_2() { return cSentenceAssignment_2; }
		
		//Y
		public RuleCall getSentenceYParserRuleCall_2_0() { return cSentenceYParserRuleCall_2_0; }
	}
	public class TitelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Titel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSSubstTerminalRuleCall_0_0 = (RuleCall)cSAssignment_0.eContents().get(0);
		private final Assignment cVAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVVerbTerminalRuleCall_1_0 = (RuleCall)cVAssignment_1.eContents().get(0);
		
		//Titel: s=Subst v=Verb;
		@Override public ParserRule getRule() { return rule; }
		
		//s=Subst v=Verb
		public Group getGroup() { return cGroup; }
		
		//s=Subst
		public Assignment getSAssignment_0() { return cSAssignment_0; }
		
		//Subst
		public RuleCall getSSubstTerminalRuleCall_0_0() { return cSSubstTerminalRuleCall_0_0; }
		
		//v=Verb
		public Assignment getVAssignment_1() { return cVAssignment_1; }
		
		//Verb
		public RuleCall getVVerbTerminalRuleCall_1_0() { return cVVerbTerminalRuleCall_1_0; }
	}
	public class YElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Y");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUmKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSSubstTerminalRuleCall_1_0 = (RuleCall)cSAssignment_1.eContents().get(0);
		private final Assignment cNAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNNutzenParserRuleCall_2_0 = (RuleCall)cNAssignment_2.eContents().get(0);
		private final Keyword cMöchteIchAlsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cRAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cRSubstTerminalRuleCall_4_0 = (RuleCall)cRAssignment_4.eContents().get(0);
		private final Assignment cZielAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cZielSubstTerminalRuleCall_5_0 = (RuleCall)cZielAssignment_5.eContents().get(0);
		private final Assignment cWunschAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cWunschVerbTerminalRuleCall_6_0 = (RuleCall)cWunschAssignment_6.eContents().get(0);
		private final Keyword cFullStopKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Y: "Um" s=Subst n=Nutzen ", möchte ich als" r=Subst ziel=Subst wunsch=Verb ".";
		@Override public ParserRule getRule() { return rule; }
		
		//"Um" s=Subst n=Nutzen ", möchte ich als" r=Subst ziel=Subst wunsch=Verb "."
		public Group getGroup() { return cGroup; }
		
		//"Um"
		public Keyword getUmKeyword_0() { return cUmKeyword_0; }
		
		//s=Subst
		public Assignment getSAssignment_1() { return cSAssignment_1; }
		
		//Subst
		public RuleCall getSSubstTerminalRuleCall_1_0() { return cSSubstTerminalRuleCall_1_0; }
		
		//n=Nutzen
		public Assignment getNAssignment_2() { return cNAssignment_2; }
		
		//Nutzen
		public RuleCall getNNutzenParserRuleCall_2_0() { return cNNutzenParserRuleCall_2_0; }
		
		//", möchte ich als"
		public Keyword getMöchteIchAlsKeyword_3() { return cMöchteIchAlsKeyword_3; }
		
		//r=Subst
		public Assignment getRAssignment_4() { return cRAssignment_4; }
		
		//Subst
		public RuleCall getRSubstTerminalRuleCall_4_0() { return cRSubstTerminalRuleCall_4_0; }
		
		//ziel=Subst
		public Assignment getZielAssignment_5() { return cZielAssignment_5; }
		
		//Subst
		public RuleCall getZielSubstTerminalRuleCall_5_0() { return cZielSubstTerminalRuleCall_5_0; }
		
		//wunsch=Verb
		public Assignment getWunschAssignment_6() { return cWunschAssignment_6; }
		
		//Verb
		public RuleCall getWunschVerbTerminalRuleCall_6_0() { return cWunschVerbTerminalRuleCall_6_0; }
		
		//"."
		public Keyword getFullStopKeyword_7() { return cFullStopKeyword_7; }
	}
	public class NutzenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Nutzen");
		private final Assignment cVAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cVVerbNutzenParserRuleCall_0 = (RuleCall)cVAssignment.eContents().get(0);
		
		//Nutzen: v=VerbNutzen ;
		@Override public ParserRule getRule() { return rule; }
		
		//v=VerbNutzen
		public Assignment getVAssignment() { return cVAssignment; }
		
		//VerbNutzen
		public RuleCall getVVerbNutzenParserRuleCall_0() { return cVVerbNutzenParserRuleCall_0; }
	}
	public class VerbNutzenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.VerbNutzen");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cZuKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cVAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cVVerbOhneZuTerminalRuleCall_0_1_0 = (RuleCall)cVAssignment_0_1.eContents().get(0);
		private final Assignment cVAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cVVerbMitEinemZuTerminalRuleCall_1_0 = (RuleCall)cVAssignment_1.eContents().get(0);
		private final Assignment cVAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cVVerbMitZweiZuTerminalRuleCall_2_0 = (RuleCall)cVAssignment_2.eContents().get(0);
		private final Assignment cVAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final RuleCall cVVerbMitDreiZuTerminalRuleCall_3_0 = (RuleCall)cVAssignment_3.eContents().get(0);
		
		//VerbNutzen: "zu" v=VerbOhneZu | v=VerbMitEinemZu | v=VerbMitZweiZu | v=VerbMitDreiZu;
		@Override public ParserRule getRule() { return rule; }
		
		//"zu" v=VerbOhneZu | v=VerbMitEinemZu | v=VerbMitZweiZu | v=VerbMitDreiZu
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//"zu" v=VerbOhneZu
		public Group getGroup_0() { return cGroup_0; }
		
		//"zu"
		public Keyword getZuKeyword_0_0() { return cZuKeyword_0_0; }
		
		//v=VerbOhneZu
		public Assignment getVAssignment_0_1() { return cVAssignment_0_1; }
		
		//VerbOhneZu
		public RuleCall getVVerbOhneZuTerminalRuleCall_0_1_0() { return cVVerbOhneZuTerminalRuleCall_0_1_0; }
		
		//v=VerbMitEinemZu
		public Assignment getVAssignment_1() { return cVAssignment_1; }
		
		//VerbMitEinemZu
		public RuleCall getVVerbMitEinemZuTerminalRuleCall_1_0() { return cVVerbMitEinemZuTerminalRuleCall_1_0; }
		
		//v=VerbMitZweiZu
		public Assignment getVAssignment_2() { return cVAssignment_2; }
		
		//VerbMitZweiZu
		public RuleCall getVVerbMitZweiZuTerminalRuleCall_2_0() { return cVVerbMitZweiZuTerminalRuleCall_2_0; }
		
		//v=VerbMitDreiZu
		public Assignment getVAssignment_3() { return cVAssignment_3; }
		
		//VerbMitDreiZu
		public RuleCall getVVerbMitDreiZuTerminalRuleCall_3_0() { return cVVerbMitDreiZuTerminalRuleCall_3_0; }
	}
	
	
	private final SElements pS;
	private final TitelElements pTitel;
	private final YElements pY;
	private final NutzenElements pNutzen;
	private final TerminalRule tSubst;
	private final TerminalRule tVerb;
	private final VerbNutzenElements pVerbNutzen;
	private final TerminalRule tVerbOhneZu;
	private final TerminalRule tNoZU;
	private final TerminalRule tAlleBuchstaben;
	private final TerminalRule tKeinU;
	private final TerminalRule tKeinZ;
	private final TerminalRule tVerbMitEinemZu;
	private final TerminalRule tZ;
	private final TerminalRule tU;
	private final TerminalRule tVerbMitZweiZu;
	private final TerminalRule tVerbMitDreiZu;
	private final TerminalRule tTwoChars;
	private final TerminalRule tNoZ;
	private final TerminalRule tZbutNoU;
	private final TerminalRule tNoU;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pS = new SElements();
		this.pTitel = new TitelElements();
		this.pY = new YElements();
		this.pNutzen = new NutzenElements();
		this.tSubst = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Subst");
		this.tVerb = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Verb");
		this.pVerbNutzen = new VerbNutzenElements();
		this.tVerbOhneZu = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.VerbOhneZu");
		this.tNoZU = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.noZU");
		this.tAlleBuchstaben = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.alleBuchstaben");
		this.tKeinU = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.keinU");
		this.tKeinZ = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.keinZ");
		this.tVerbMitEinemZu = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.VerbMitEinemZu");
		this.tZ = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.z");
		this.tU = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.u");
		this.tVerbMitZweiZu = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.VerbMitZweiZu");
		this.tVerbMitDreiZu = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.VerbMitDreiZu");
		this.tTwoChars = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.twoChars");
		this.tNoZ = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.noZ");
		this.tZbutNoU = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.ZbutNoU");
		this.tNoU = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.noU");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//S: Titel ":" sentence=Y;
	public SElements getSAccess() {
		return pS;
	}
	
	public ParserRule getSRule() {
		return getSAccess().getRule();
	}
	
	//Titel: s=Subst v=Verb;
	public TitelElements getTitelAccess() {
		return pTitel;
	}
	
	public ParserRule getTitelRule() {
		return getTitelAccess().getRule();
	}
	
	//Y: "Um" s=Subst n=Nutzen ", möchte ich als" r=Subst ziel=Subst wunsch=Verb ".";
	public YElements getYAccess() {
		return pY;
	}
	
	public ParserRule getYRule() {
		return getYAccess().getRule();
	}
	
	//Nutzen: v=VerbNutzen ;
	public NutzenElements getNutzenAccess() {
		return pNutzen;
	}
	
	public ParserRule getNutzenRule() {
		return getNutzenAccess().getRule();
	}
	
	//terminal Subst:	("A".."Z"| 'Ä' |'Ö'| 'Ü')("a".."z"| 'ä' |'ö'| 'ü'|'ß')*;
	public TerminalRule getSubstRule() {
		return tSubst;
	}
	
	//terminal Verb: ("a".."z" | 'ä' |'ö'| 'ü'|'ß' )* "en" | "ern" | "eln";
	public TerminalRule getVerbRule() {
		return tVerb;
	}
	
	//VerbNutzen: "zu" v=VerbOhneZu | v=VerbMitEinemZu | v=VerbMitZweiZu | v=VerbMitDreiZu;
	public VerbNutzenElements getVerbNutzenAccess() {
		return pVerbNutzen;
	}
	
	public ParserRule getVerbNutzenRule() {
		return getVerbNutzenAccess().getRule();
	}
	
	//// VerbOhneZu: Auf ein Z darf kein U folgen
	//// Verbendungen fehlen
	//terminal VerbOhneZu: noZU* "en" | "ern" | "eln";
	public TerminalRule getVerbOhneZuRule() {
		return tVerbOhneZu;
	}
	
	//terminal noZU: (alleBuchstaben keinU)| (keinZ alleBuchstaben);
	public TerminalRule getNoZURule() {
		return tNoZU;
	}
	
	//terminal fragment alleBuchstaben: ("a".."z" | 'ä' |'ö'| 'ü'|'ß' );
	public TerminalRule getAlleBuchstabenRule() {
		return tAlleBuchstaben;
	}
	
	//terminal fragment keinU:("a".."t" | "v".."z" | 'ä' |'ö'| 'ü'|'ß');
	public TerminalRule getKeinURule() {
		return tKeinU;
	}
	
	//terminal fragment keinZ:("a".."y" | 'ä' |'ö'| 'ü'|'ß' );
	public TerminalRule getKeinZRule() {
		return tKeinZ;
	}
	
	//// VerbMitEinemZu: Auf ein Z darf nur einmal ein U folgen
	//terminal VerbMitEinemZu: z u noZU* "en" | "ern" | "eln";
	public TerminalRule getVerbMitEinemZuRule() {
		return tVerbMitEinemZu;
	}
	
	//terminal fragment z: "z";
	public TerminalRule getZRule() {
		return tZ;
	}
	
	//terminal fragment u: "u";
	public TerminalRule getURule() {
		return tU;
	}
	
	//// VerbMitZweiZu: Auf ein Z darf einmal ein U folgen und das zweimal
	//terminal VerbMitZweiZu: z u z u noZU* "en" | "ern" | "eln";
	public TerminalRule getVerbMitZweiZuRule() {
		return tVerbMitZweiZu;
	}
	
	//// VerbMitZweiZu: Auf ein Z darf einmal ein U folgen und das dreimal
	//terminal VerbMitDreiZu: z u z u z u noZU* "en" | "ern" | "eln";
	public TerminalRule getVerbMitDreiZuRule() {
		return tVerbMitDreiZu;
	}
	
	////terminal VerbNutzen: z u twoChars* "en" | "ern" | "eln";
	//// Am Ende darf keine Leertaste sein
	////terminal zutwoChars: twoChars*;
	////evtl Fragment bei twoChars
	//terminal twoChars: noZ | noZU;
	public TerminalRule getTwoCharsRule() {
		return tTwoChars;
	}
	
	////terminal noZU: ZbutNoU noU;
	//terminal fragment noZ: ("a".."y" | 'ä' |'ö'| 'ü'|'ß' );
	public TerminalRule getNoZRule() {
		return tNoZ;
	}
	
	//terminal fragment ZbutNoU: ("a".."z" | 'ä' |'ö'| 'ü'|'ß' ) ("a".."t" | "v".."z" | 'ä' |'ö'| 'ü'|'ß' );
	public TerminalRule getZbutNoURule() {
		return tZbutNoU;
	}
	
	//terminal fragment noU: ("a".."t" | "v".."z" | 'ä' |'ö'| 'ü'|'ß' );
	public TerminalRule getNoURule() {
		return tNoU;
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}