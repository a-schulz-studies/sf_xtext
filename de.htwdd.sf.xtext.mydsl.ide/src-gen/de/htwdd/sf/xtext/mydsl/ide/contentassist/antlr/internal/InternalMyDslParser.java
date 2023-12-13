package de.htwdd.sf.xtext.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.htwdd.sf.xtext.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleS"
    // InternalMyDsl.g:53:1: entryRuleS : ruleS EOF ;
    public final void entryRuleS() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleS EOF )
            // InternalMyDsl.g:55:1: ruleS EOF
            {
             before(grammarAccess.getSRule()); 
            pushFollow(FOLLOW_1);
            ruleS();

            state._fsp--;

             after(grammarAccess.getSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleS"


    // $ANTLR start "ruleS"
    // InternalMyDsl.g:62:1: ruleS : ( ( rule__S__Group__0 ) ) ;
    public final void ruleS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__S__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__S__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__S__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__S__Group__0 )
            {
             before(grammarAccess.getSAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__S__Group__0 )
            // InternalMyDsl.g:69:4: rule__S__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__S__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleS"


    // $ANTLR start "entryRuleTitel"
    // InternalMyDsl.g:78:1: entryRuleTitel : ruleTitel EOF ;
    public final void entryRuleTitel() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleTitel EOF )
            // InternalMyDsl.g:80:1: ruleTitel EOF
            {
             before(grammarAccess.getTitelRule()); 
            pushFollow(FOLLOW_1);
            ruleTitel();

            state._fsp--;

             after(grammarAccess.getTitelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTitel"


    // $ANTLR start "ruleTitel"
    // InternalMyDsl.g:87:1: ruleTitel : ( ( rule__Titel__Group__0 ) ) ;
    public final void ruleTitel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Titel__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Titel__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Titel__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Titel__Group__0 )
            {
             before(grammarAccess.getTitelAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Titel__Group__0 )
            // InternalMyDsl.g:94:4: rule__Titel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Titel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTitelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTitel"


    // $ANTLR start "entryRuleY"
    // InternalMyDsl.g:103:1: entryRuleY : ruleY EOF ;
    public final void entryRuleY() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleY EOF )
            // InternalMyDsl.g:105:1: ruleY EOF
            {
             before(grammarAccess.getYRule()); 
            pushFollow(FOLLOW_1);
            ruleY();

            state._fsp--;

             after(grammarAccess.getYRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleY"


    // $ANTLR start "ruleY"
    // InternalMyDsl.g:112:1: ruleY : ( ( rule__Y__Group__0 ) ) ;
    public final void ruleY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Y__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Y__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Y__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Y__Group__0 )
            {
             before(grammarAccess.getYAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Y__Group__0 )
            // InternalMyDsl.g:119:4: rule__Y__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Y__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getYAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleY"


    // $ANTLR start "entryRuleNutzen"
    // InternalMyDsl.g:128:1: entryRuleNutzen : ruleNutzen EOF ;
    public final void entryRuleNutzen() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleNutzen EOF )
            // InternalMyDsl.g:130:1: ruleNutzen EOF
            {
             before(grammarAccess.getNutzenRule()); 
            pushFollow(FOLLOW_1);
            ruleNutzen();

            state._fsp--;

             after(grammarAccess.getNutzenRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNutzen"


    // $ANTLR start "ruleNutzen"
    // InternalMyDsl.g:137:1: ruleNutzen : ( ( rule__Nutzen__Group__0 ) ) ;
    public final void ruleNutzen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Nutzen__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Nutzen__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Nutzen__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Nutzen__Group__0 )
            {
             before(grammarAccess.getNutzenAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Nutzen__Group__0 )
            // InternalMyDsl.g:144:4: rule__Nutzen__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Nutzen__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNutzenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNutzen"


    // $ANTLR start "rule__S__Group__0"
    // InternalMyDsl.g:152:1: rule__S__Group__0 : rule__S__Group__0__Impl rule__S__Group__1 ;
    public final void rule__S__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:156:1: ( rule__S__Group__0__Impl rule__S__Group__1 )
            // InternalMyDsl.g:157:2: rule__S__Group__0__Impl rule__S__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__S__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S__Group__0"


    // $ANTLR start "rule__S__Group__0__Impl"
    // InternalMyDsl.g:164:1: rule__S__Group__0__Impl : ( ruleTitel ) ;
    public final void rule__S__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:168:1: ( ( ruleTitel ) )
            // InternalMyDsl.g:169:1: ( ruleTitel )
            {
            // InternalMyDsl.g:169:1: ( ruleTitel )
            // InternalMyDsl.g:170:2: ruleTitel
            {
             before(grammarAccess.getSAccess().getTitelParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTitel();

            state._fsp--;

             after(grammarAccess.getSAccess().getTitelParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S__Group__0__Impl"


    // $ANTLR start "rule__S__Group__1"
    // InternalMyDsl.g:179:1: rule__S__Group__1 : rule__S__Group__1__Impl rule__S__Group__2 ;
    public final void rule__S__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:183:1: ( rule__S__Group__1__Impl rule__S__Group__2 )
            // InternalMyDsl.g:184:2: rule__S__Group__1__Impl rule__S__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__S__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S__Group__1"


    // $ANTLR start "rule__S__Group__1__Impl"
    // InternalMyDsl.g:191:1: rule__S__Group__1__Impl : ( ':' ) ;
    public final void rule__S__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:195:1: ( ( ':' ) )
            // InternalMyDsl.g:196:1: ( ':' )
            {
            // InternalMyDsl.g:196:1: ( ':' )
            // InternalMyDsl.g:197:2: ':'
            {
             before(grammarAccess.getSAccess().getColonKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S__Group__1__Impl"


    // $ANTLR start "rule__S__Group__2"
    // InternalMyDsl.g:206:1: rule__S__Group__2 : rule__S__Group__2__Impl ;
    public final void rule__S__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:210:1: ( rule__S__Group__2__Impl )
            // InternalMyDsl.g:211:2: rule__S__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__S__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S__Group__2"


    // $ANTLR start "rule__S__Group__2__Impl"
    // InternalMyDsl.g:217:1: rule__S__Group__2__Impl : ( ( rule__S__SentenceAssignment_2 ) ) ;
    public final void rule__S__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:221:1: ( ( ( rule__S__SentenceAssignment_2 ) ) )
            // InternalMyDsl.g:222:1: ( ( rule__S__SentenceAssignment_2 ) )
            {
            // InternalMyDsl.g:222:1: ( ( rule__S__SentenceAssignment_2 ) )
            // InternalMyDsl.g:223:2: ( rule__S__SentenceAssignment_2 )
            {
             before(grammarAccess.getSAccess().getSentenceAssignment_2()); 
            // InternalMyDsl.g:224:2: ( rule__S__SentenceAssignment_2 )
            // InternalMyDsl.g:224:3: rule__S__SentenceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__S__SentenceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSAccess().getSentenceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S__Group__2__Impl"


    // $ANTLR start "rule__Titel__Group__0"
    // InternalMyDsl.g:233:1: rule__Titel__Group__0 : rule__Titel__Group__0__Impl rule__Titel__Group__1 ;
    public final void rule__Titel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:237:1: ( rule__Titel__Group__0__Impl rule__Titel__Group__1 )
            // InternalMyDsl.g:238:2: rule__Titel__Group__0__Impl rule__Titel__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Titel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Titel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Titel__Group__0"


    // $ANTLR start "rule__Titel__Group__0__Impl"
    // InternalMyDsl.g:245:1: rule__Titel__Group__0__Impl : ( ( rule__Titel__SAssignment_0 ) ) ;
    public final void rule__Titel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:249:1: ( ( ( rule__Titel__SAssignment_0 ) ) )
            // InternalMyDsl.g:250:1: ( ( rule__Titel__SAssignment_0 ) )
            {
            // InternalMyDsl.g:250:1: ( ( rule__Titel__SAssignment_0 ) )
            // InternalMyDsl.g:251:2: ( rule__Titel__SAssignment_0 )
            {
             before(grammarAccess.getTitelAccess().getSAssignment_0()); 
            // InternalMyDsl.g:252:2: ( rule__Titel__SAssignment_0 )
            // InternalMyDsl.g:252:3: rule__Titel__SAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Titel__SAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTitelAccess().getSAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Titel__Group__0__Impl"


    // $ANTLR start "rule__Titel__Group__1"
    // InternalMyDsl.g:260:1: rule__Titel__Group__1 : rule__Titel__Group__1__Impl ;
    public final void rule__Titel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:264:1: ( rule__Titel__Group__1__Impl )
            // InternalMyDsl.g:265:2: rule__Titel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Titel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Titel__Group__1"


    // $ANTLR start "rule__Titel__Group__1__Impl"
    // InternalMyDsl.g:271:1: rule__Titel__Group__1__Impl : ( ( rule__Titel__VAssignment_1 ) ) ;
    public final void rule__Titel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:275:1: ( ( ( rule__Titel__VAssignment_1 ) ) )
            // InternalMyDsl.g:276:1: ( ( rule__Titel__VAssignment_1 ) )
            {
            // InternalMyDsl.g:276:1: ( ( rule__Titel__VAssignment_1 ) )
            // InternalMyDsl.g:277:2: ( rule__Titel__VAssignment_1 )
            {
             before(grammarAccess.getTitelAccess().getVAssignment_1()); 
            // InternalMyDsl.g:278:2: ( rule__Titel__VAssignment_1 )
            // InternalMyDsl.g:278:3: rule__Titel__VAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Titel__VAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTitelAccess().getVAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Titel__Group__1__Impl"


    // $ANTLR start "rule__Y__Group__0"
    // InternalMyDsl.g:287:1: rule__Y__Group__0 : rule__Y__Group__0__Impl rule__Y__Group__1 ;
    public final void rule__Y__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:1: ( rule__Y__Group__0__Impl rule__Y__Group__1 )
            // InternalMyDsl.g:292:2: rule__Y__Group__0__Impl rule__Y__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Y__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Y__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y__Group__0"


    // $ANTLR start "rule__Y__Group__0__Impl"
    // InternalMyDsl.g:299:1: rule__Y__Group__0__Impl : ( 'Um' ) ;
    public final void rule__Y__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:303:1: ( ( 'Um' ) )
            // InternalMyDsl.g:304:1: ( 'Um' )
            {
            // InternalMyDsl.g:304:1: ( 'Um' )
            // InternalMyDsl.g:305:2: 'Um'
            {
             before(grammarAccess.getYAccess().getUmKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getYAccess().getUmKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y__Group__0__Impl"


    // $ANTLR start "rule__Y__Group__1"
    // InternalMyDsl.g:314:1: rule__Y__Group__1 : rule__Y__Group__1__Impl rule__Y__Group__2 ;
    public final void rule__Y__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:318:1: ( rule__Y__Group__1__Impl rule__Y__Group__2 )
            // InternalMyDsl.g:319:2: rule__Y__Group__1__Impl rule__Y__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Y__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Y__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y__Group__1"


    // $ANTLR start "rule__Y__Group__1__Impl"
    // InternalMyDsl.g:326:1: rule__Y__Group__1__Impl : ( ( rule__Y__SAssignment_1 ) ) ;
    public final void rule__Y__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:330:1: ( ( ( rule__Y__SAssignment_1 ) ) )
            // InternalMyDsl.g:331:1: ( ( rule__Y__SAssignment_1 ) )
            {
            // InternalMyDsl.g:331:1: ( ( rule__Y__SAssignment_1 ) )
            // InternalMyDsl.g:332:2: ( rule__Y__SAssignment_1 )
            {
             before(grammarAccess.getYAccess().getSAssignment_1()); 
            // InternalMyDsl.g:333:2: ( rule__Y__SAssignment_1 )
            // InternalMyDsl.g:333:3: rule__Y__SAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Y__SAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getYAccess().getSAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y__Group__1__Impl"


    // $ANTLR start "rule__Y__Group__2"
    // InternalMyDsl.g:341:1: rule__Y__Group__2 : rule__Y__Group__2__Impl rule__Y__Group__3 ;
    public final void rule__Y__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:345:1: ( rule__Y__Group__2__Impl rule__Y__Group__3 )
            // InternalMyDsl.g:346:2: rule__Y__Group__2__Impl rule__Y__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Y__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Y__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y__Group__2"


    // $ANTLR start "rule__Y__Group__2__Impl"
    // InternalMyDsl.g:353:1: rule__Y__Group__2__Impl : ( ( rule__Y__NAssignment_2 ) ) ;
    public final void rule__Y__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:357:1: ( ( ( rule__Y__NAssignment_2 ) ) )
            // InternalMyDsl.g:358:1: ( ( rule__Y__NAssignment_2 ) )
            {
            // InternalMyDsl.g:358:1: ( ( rule__Y__NAssignment_2 ) )
            // InternalMyDsl.g:359:2: ( rule__Y__NAssignment_2 )
            {
             before(grammarAccess.getYAccess().getNAssignment_2()); 
            // InternalMyDsl.g:360:2: ( rule__Y__NAssignment_2 )
            // InternalMyDsl.g:360:3: rule__Y__NAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Y__NAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getYAccess().getNAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y__Group__2__Impl"


    // $ANTLR start "rule__Y__Group__3"
    // InternalMyDsl.g:368:1: rule__Y__Group__3 : rule__Y__Group__3__Impl rule__Y__Group__4 ;
    public final void rule__Y__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:372:1: ( rule__Y__Group__3__Impl rule__Y__Group__4 )
            // InternalMyDsl.g:373:2: rule__Y__Group__3__Impl rule__Y__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Y__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Y__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y__Group__3"


    // $ANTLR start "rule__Y__Group__3__Impl"
    // InternalMyDsl.g:380:1: rule__Y__Group__3__Impl : ( ', m\\u00F6chte ich als' ) ;
    public final void rule__Y__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:384:1: ( ( ', m\\u00F6chte ich als' ) )
            // InternalMyDsl.g:385:1: ( ', m\\u00F6chte ich als' )
            {
            // InternalMyDsl.g:385:1: ( ', m\\u00F6chte ich als' )
            // InternalMyDsl.g:386:2: ', m\\u00F6chte ich als'
            {
             before(grammarAccess.getYAccess().getMöchteIchAlsKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getYAccess().getMöchteIchAlsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y__Group__3__Impl"


    // $ANTLR start "rule__Y__Group__4"
    // InternalMyDsl.g:395:1: rule__Y__Group__4 : rule__Y__Group__4__Impl rule__Y__Group__5 ;
    public final void rule__Y__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:399:1: ( rule__Y__Group__4__Impl rule__Y__Group__5 )
            // InternalMyDsl.g:400:2: rule__Y__Group__4__Impl rule__Y__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Y__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Y__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y__Group__4"


    // $ANTLR start "rule__Y__Group__4__Impl"
    // InternalMyDsl.g:407:1: rule__Y__Group__4__Impl : ( ( rule__Y__RAssignment_4 ) ) ;
    public final void rule__Y__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:411:1: ( ( ( rule__Y__RAssignment_4 ) ) )
            // InternalMyDsl.g:412:1: ( ( rule__Y__RAssignment_4 ) )
            {
            // InternalMyDsl.g:412:1: ( ( rule__Y__RAssignment_4 ) )
            // InternalMyDsl.g:413:2: ( rule__Y__RAssignment_4 )
            {
             before(grammarAccess.getYAccess().getRAssignment_4()); 
            // InternalMyDsl.g:414:2: ( rule__Y__RAssignment_4 )
            // InternalMyDsl.g:414:3: rule__Y__RAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Y__RAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getYAccess().getRAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y__Group__4__Impl"


    // $ANTLR start "rule__Y__Group__5"
    // InternalMyDsl.g:422:1: rule__Y__Group__5 : rule__Y__Group__5__Impl rule__Y__Group__6 ;
    public final void rule__Y__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:426:1: ( rule__Y__Group__5__Impl rule__Y__Group__6 )
            // InternalMyDsl.g:427:2: rule__Y__Group__5__Impl rule__Y__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Y__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Y__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y__Group__5"


    // $ANTLR start "rule__Y__Group__5__Impl"
    // InternalMyDsl.g:434:1: rule__Y__Group__5__Impl : ( ( rule__Y__ZielAssignment_5 ) ) ;
    public final void rule__Y__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:438:1: ( ( ( rule__Y__ZielAssignment_5 ) ) )
            // InternalMyDsl.g:439:1: ( ( rule__Y__ZielAssignment_5 ) )
            {
            // InternalMyDsl.g:439:1: ( ( rule__Y__ZielAssignment_5 ) )
            // InternalMyDsl.g:440:2: ( rule__Y__ZielAssignment_5 )
            {
             before(grammarAccess.getYAccess().getZielAssignment_5()); 
            // InternalMyDsl.g:441:2: ( rule__Y__ZielAssignment_5 )
            // InternalMyDsl.g:441:3: rule__Y__ZielAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Y__ZielAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getYAccess().getZielAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y__Group__5__Impl"


    // $ANTLR start "rule__Y__Group__6"
    // InternalMyDsl.g:449:1: rule__Y__Group__6 : rule__Y__Group__6__Impl rule__Y__Group__7 ;
    public final void rule__Y__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:453:1: ( rule__Y__Group__6__Impl rule__Y__Group__7 )
            // InternalMyDsl.g:454:2: rule__Y__Group__6__Impl rule__Y__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Y__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Y__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y__Group__6"


    // $ANTLR start "rule__Y__Group__6__Impl"
    // InternalMyDsl.g:461:1: rule__Y__Group__6__Impl : ( ( rule__Y__WunschAssignment_6 ) ) ;
    public final void rule__Y__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:465:1: ( ( ( rule__Y__WunschAssignment_6 ) ) )
            // InternalMyDsl.g:466:1: ( ( rule__Y__WunschAssignment_6 ) )
            {
            // InternalMyDsl.g:466:1: ( ( rule__Y__WunschAssignment_6 ) )
            // InternalMyDsl.g:467:2: ( rule__Y__WunschAssignment_6 )
            {
             before(grammarAccess.getYAccess().getWunschAssignment_6()); 
            // InternalMyDsl.g:468:2: ( rule__Y__WunschAssignment_6 )
            // InternalMyDsl.g:468:3: rule__Y__WunschAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Y__WunschAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getYAccess().getWunschAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y__Group__6__Impl"


    // $ANTLR start "rule__Y__Group__7"
    // InternalMyDsl.g:476:1: rule__Y__Group__7 : rule__Y__Group__7__Impl ;
    public final void rule__Y__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:480:1: ( rule__Y__Group__7__Impl )
            // InternalMyDsl.g:481:2: rule__Y__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Y__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y__Group__7"


    // $ANTLR start "rule__Y__Group__7__Impl"
    // InternalMyDsl.g:487:1: rule__Y__Group__7__Impl : ( '.' ) ;
    public final void rule__Y__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:1: ( ( '.' ) )
            // InternalMyDsl.g:492:1: ( '.' )
            {
            // InternalMyDsl.g:492:1: ( '.' )
            // InternalMyDsl.g:493:2: '.'
            {
             before(grammarAccess.getYAccess().getFullStopKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getYAccess().getFullStopKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y__Group__7__Impl"


    // $ANTLR start "rule__Nutzen__Group__0"
    // InternalMyDsl.g:503:1: rule__Nutzen__Group__0 : rule__Nutzen__Group__0__Impl rule__Nutzen__Group__1 ;
    public final void rule__Nutzen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:507:1: ( rule__Nutzen__Group__0__Impl rule__Nutzen__Group__1 )
            // InternalMyDsl.g:508:2: rule__Nutzen__Group__0__Impl rule__Nutzen__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Nutzen__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutzen__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__0"


    // $ANTLR start "rule__Nutzen__Group__0__Impl"
    // InternalMyDsl.g:515:1: rule__Nutzen__Group__0__Impl : ( 'zu' ) ;
    public final void rule__Nutzen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:519:1: ( ( 'zu' ) )
            // InternalMyDsl.g:520:1: ( 'zu' )
            {
            // InternalMyDsl.g:520:1: ( 'zu' )
            // InternalMyDsl.g:521:2: 'zu'
            {
             before(grammarAccess.getNutzenAccess().getZuKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNutzenAccess().getZuKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__0__Impl"


    // $ANTLR start "rule__Nutzen__Group__1"
    // InternalMyDsl.g:530:1: rule__Nutzen__Group__1 : rule__Nutzen__Group__1__Impl ;
    public final void rule__Nutzen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:534:1: ( rule__Nutzen__Group__1__Impl )
            // InternalMyDsl.g:535:2: rule__Nutzen__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nutzen__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__1"


    // $ANTLR start "rule__Nutzen__Group__1__Impl"
    // InternalMyDsl.g:541:1: rule__Nutzen__Group__1__Impl : ( ( rule__Nutzen__VAssignment_1 ) ) ;
    public final void rule__Nutzen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:545:1: ( ( ( rule__Nutzen__VAssignment_1 ) ) )
            // InternalMyDsl.g:546:1: ( ( rule__Nutzen__VAssignment_1 ) )
            {
            // InternalMyDsl.g:546:1: ( ( rule__Nutzen__VAssignment_1 ) )
            // InternalMyDsl.g:547:2: ( rule__Nutzen__VAssignment_1 )
            {
             before(grammarAccess.getNutzenAccess().getVAssignment_1()); 
            // InternalMyDsl.g:548:2: ( rule__Nutzen__VAssignment_1 )
            // InternalMyDsl.g:548:3: rule__Nutzen__VAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Nutzen__VAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNutzenAccess().getVAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__1__Impl"


    // $ANTLR start "rule__S__SentenceAssignment_2"
    // InternalMyDsl.g:557:1: rule__S__SentenceAssignment_2 : ( ruleY ) ;
    public final void rule__S__SentenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:561:1: ( ( ruleY ) )
            // InternalMyDsl.g:562:2: ( ruleY )
            {
            // InternalMyDsl.g:562:2: ( ruleY )
            // InternalMyDsl.g:563:3: ruleY
            {
             before(grammarAccess.getSAccess().getSentenceYParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleY();

            state._fsp--;

             after(grammarAccess.getSAccess().getSentenceYParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S__SentenceAssignment_2"


    // $ANTLR start "rule__Titel__SAssignment_0"
    // InternalMyDsl.g:572:1: rule__Titel__SAssignment_0 : ( RULE_SUBST ) ;
    public final void rule__Titel__SAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:576:1: ( ( RULE_SUBST ) )
            // InternalMyDsl.g:577:2: ( RULE_SUBST )
            {
            // InternalMyDsl.g:577:2: ( RULE_SUBST )
            // InternalMyDsl.g:578:3: RULE_SUBST
            {
             before(grammarAccess.getTitelAccess().getSSubstTerminalRuleCall_0_0()); 
            match(input,RULE_SUBST,FOLLOW_2); 
             after(grammarAccess.getTitelAccess().getSSubstTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Titel__SAssignment_0"


    // $ANTLR start "rule__Titel__VAssignment_1"
    // InternalMyDsl.g:587:1: rule__Titel__VAssignment_1 : ( RULE_VERB ) ;
    public final void rule__Titel__VAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:1: ( ( RULE_VERB ) )
            // InternalMyDsl.g:592:2: ( RULE_VERB )
            {
            // InternalMyDsl.g:592:2: ( RULE_VERB )
            // InternalMyDsl.g:593:3: RULE_VERB
            {
             before(grammarAccess.getTitelAccess().getVVerbTerminalRuleCall_1_0()); 
            match(input,RULE_VERB,FOLLOW_2); 
             after(grammarAccess.getTitelAccess().getVVerbTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Titel__VAssignment_1"


    // $ANTLR start "rule__Y__SAssignment_1"
    // InternalMyDsl.g:602:1: rule__Y__SAssignment_1 : ( RULE_SUBST ) ;
    public final void rule__Y__SAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:606:1: ( ( RULE_SUBST ) )
            // InternalMyDsl.g:607:2: ( RULE_SUBST )
            {
            // InternalMyDsl.g:607:2: ( RULE_SUBST )
            // InternalMyDsl.g:608:3: RULE_SUBST
            {
             before(grammarAccess.getYAccess().getSSubstTerminalRuleCall_1_0()); 
            match(input,RULE_SUBST,FOLLOW_2); 
             after(grammarAccess.getYAccess().getSSubstTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y__SAssignment_1"


    // $ANTLR start "rule__Y__NAssignment_2"
    // InternalMyDsl.g:617:1: rule__Y__NAssignment_2 : ( ruleNutzen ) ;
    public final void rule__Y__NAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:621:1: ( ( ruleNutzen ) )
            // InternalMyDsl.g:622:2: ( ruleNutzen )
            {
            // InternalMyDsl.g:622:2: ( ruleNutzen )
            // InternalMyDsl.g:623:3: ruleNutzen
            {
             before(grammarAccess.getYAccess().getNNutzenParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNutzen();

            state._fsp--;

             after(grammarAccess.getYAccess().getNNutzenParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y__NAssignment_2"


    // $ANTLR start "rule__Y__RAssignment_4"
    // InternalMyDsl.g:632:1: rule__Y__RAssignment_4 : ( RULE_SUBST ) ;
    public final void rule__Y__RAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:636:1: ( ( RULE_SUBST ) )
            // InternalMyDsl.g:637:2: ( RULE_SUBST )
            {
            // InternalMyDsl.g:637:2: ( RULE_SUBST )
            // InternalMyDsl.g:638:3: RULE_SUBST
            {
             before(grammarAccess.getYAccess().getRSubstTerminalRuleCall_4_0()); 
            match(input,RULE_SUBST,FOLLOW_2); 
             after(grammarAccess.getYAccess().getRSubstTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y__RAssignment_4"


    // $ANTLR start "rule__Y__ZielAssignment_5"
    // InternalMyDsl.g:647:1: rule__Y__ZielAssignment_5 : ( RULE_SUBST ) ;
    public final void rule__Y__ZielAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:651:1: ( ( RULE_SUBST ) )
            // InternalMyDsl.g:652:2: ( RULE_SUBST )
            {
            // InternalMyDsl.g:652:2: ( RULE_SUBST )
            // InternalMyDsl.g:653:3: RULE_SUBST
            {
             before(grammarAccess.getYAccess().getZielSubstTerminalRuleCall_5_0()); 
            match(input,RULE_SUBST,FOLLOW_2); 
             after(grammarAccess.getYAccess().getZielSubstTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y__ZielAssignment_5"


    // $ANTLR start "rule__Y__WunschAssignment_6"
    // InternalMyDsl.g:662:1: rule__Y__WunschAssignment_6 : ( RULE_VERB ) ;
    public final void rule__Y__WunschAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:1: ( ( RULE_VERB ) )
            // InternalMyDsl.g:667:2: ( RULE_VERB )
            {
            // InternalMyDsl.g:667:2: ( RULE_VERB )
            // InternalMyDsl.g:668:3: RULE_VERB
            {
             before(grammarAccess.getYAccess().getWunschVerbTerminalRuleCall_6_0()); 
            match(input,RULE_VERB,FOLLOW_2); 
             after(grammarAccess.getYAccess().getWunschVerbTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Y__WunschAssignment_6"


    // $ANTLR start "rule__Nutzen__VAssignment_1"
    // InternalMyDsl.g:677:1: rule__Nutzen__VAssignment_1 : ( RULE_VERB ) ;
    public final void rule__Nutzen__VAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:681:1: ( ( RULE_VERB ) )
            // InternalMyDsl.g:682:2: ( RULE_VERB )
            {
            // InternalMyDsl.g:682:2: ( RULE_VERB )
            // InternalMyDsl.g:683:3: RULE_VERB
            {
             before(grammarAccess.getNutzenAccess().getVVerbTerminalRuleCall_1_0()); 
            match(input,RULE_VERB,FOLLOW_2); 
             after(grammarAccess.getNutzenAccess().getVVerbTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__VAssignment_1"

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