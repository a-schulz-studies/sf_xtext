/*
 * generated by Xtext 2.26.0
 */
package de.htwdd.sf.xtext.mydsl.serializer;

import com.google.inject.Inject;
import de.htwdd.sf.xtext.mydsl.myDsl.MyDslPackage;
import de.htwdd.sf.xtext.mydsl.myDsl.Nutzen;
import de.htwdd.sf.xtext.mydsl.myDsl.Titel;
import de.htwdd.sf.xtext.mydsl.myDsl.Y;
import de.htwdd.sf.xtext.mydsl.services.MyDslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.NUTZEN:
				sequence_Nutzen(context, (Nutzen) semanticObject); 
				return; 
			case MyDslPackage.TITEL:
				if (rule == grammarAccess.getSRule()) {
					sequence_S_Titel(context, (Titel) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTitelRule()) {
					sequence_Titel(context, (Titel) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.Y:
				sequence_Y(context, (Y) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Nutzen returns Nutzen
	 *
	 * Constraint:
	 *     v=Verb
	 * </pre>
	 */
	protected void sequence_Nutzen(ISerializationContext context, Nutzen semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NUTZEN__V) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NUTZEN__V));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNutzenAccess().getVVerbTerminalRuleCall_1_0(), semanticObject.getV());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     S returns Titel
	 *
	 * Constraint:
	 *     (s=Subst v=Verb sentence=Y)
	 * </pre>
	 */
	protected void sequence_S_Titel(ISerializationContext context, Titel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.TITEL__S) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.TITEL__S));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.TITEL__V) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.TITEL__V));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.TITEL__SENTENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.TITEL__SENTENCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTitelAccess().getSSubstTerminalRuleCall_0_0(), semanticObject.getS());
		feeder.accept(grammarAccess.getTitelAccess().getVVerbTerminalRuleCall_1_0(), semanticObject.getV());
		feeder.accept(grammarAccess.getSAccess().getSentenceYParserRuleCall_2_0(), semanticObject.getSentence());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Titel returns Titel
	 *
	 * Constraint:
	 *     (s=Subst v=Verb)
	 * </pre>
	 */
	protected void sequence_Titel(ISerializationContext context, Titel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.TITEL__S) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.TITEL__S));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.TITEL__V) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.TITEL__V));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTitelAccess().getSSubstTerminalRuleCall_0_0(), semanticObject.getS());
		feeder.accept(grammarAccess.getTitelAccess().getVVerbTerminalRuleCall_1_0(), semanticObject.getV());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Y returns Y
	 *
	 * Constraint:
	 *     (s=Subst n=Nutzen r=Subst ziel=Subst wunsch=Verb)
	 * </pre>
	 */
	protected void sequence_Y(ISerializationContext context, Y semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.Y__S) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.Y__S));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.Y__N) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.Y__N));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.Y__R) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.Y__R));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.Y__ZIEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.Y__ZIEL));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.Y__WUNSCH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.Y__WUNSCH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getYAccess().getSSubstTerminalRuleCall_1_0(), semanticObject.getS());
		feeder.accept(grammarAccess.getYAccess().getNNutzenParserRuleCall_2_0(), semanticObject.getN());
		feeder.accept(grammarAccess.getYAccess().getRSubstTerminalRuleCall_4_0(), semanticObject.getR());
		feeder.accept(grammarAccess.getYAccess().getZielSubstTerminalRuleCall_5_0(), semanticObject.getZiel());
		feeder.accept(grammarAccess.getYAccess().getWunschVerbTerminalRuleCall_6_0(), semanticObject.getWunsch());
		feeder.finish();
	}
	
	
}
