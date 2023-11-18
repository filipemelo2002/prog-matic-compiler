// Generated from C:/Users/filip/OneDrive/Documentos/intelliJ/progmatic-compiler/src/main/java/antlr4/br/edu/unifg/compiladores/progmatic/ProgMatic.g4 by ANTLR 4.13.1
package antlr4.br.edu.unifg.compiladores.progmatic;

    import java.util.Map;
    import java.util.HashMap;
    import java.util.List;
    import java.util.ArrayList;
    import br.edu.unifg.compiladores.progmatic.ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ProgMaticParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, INTEGER_LITERAL=12, STRING_LITERAL=13, CHAR_LITERAL=14, 
		FLOAT_LITERAL=15, BOOLEAN_LITERAL=16, POINTER=17, ADDRESS=18, IDENTIFIER=19, 
		SEMICOLON=20, LPAREN=21, RPAREN=22, LBRACE=23, RBRACE=24, COMMA=25, ATTRIBUTION=26, 
		PLUS=27, MINUS=28, MULTIPLY=29, DIVIDE=30, MODULO=31, GREATER=32, LESS=33, 
		EQUAL=34, NOT_EQUAL=35, GREATER_EQUAL=36, LESS_EQUAL=37, LOGICAL_AND=38, 
		LOGICAL_OR=39, LOGICAL_NOT=40, WS=41;
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_variableDeclaration = 2, RULE_attribution = 3, 
		RULE_pointerDeclaration = 4, RULE_procedureDeclaration = 5, RULE_procedureCall = 6, 
		RULE_argumentList = 7, RULE_typeDeclaration = 8, RULE_attributionValues = 9, 
		RULE_ifDeclaration = 10, RULE_elseDeclaration = 11, RULE_loopDeclaraion = 12, 
		RULE_logicalExpression = 13, RULE_logicalOrExpression = 14, RULE_logicalAndExpression = 15, 
		RULE_equalityExpression = 16, RULE_relationalExpression = 17, RULE_additiveExpression = 18, 
		RULE_multiplicativeExpression = 19, RULE_unaryExpression = 20, RULE_primaryExpression = 21, 
		RULE_logicalNotExpression = 22, RULE_parameterList = 23, RULE_parameter = 24, 
		RULE_printStatement = 25, RULE_inputStatement = 26, RULE_print = 27, RULE_read = 28, 
		RULE_procedure = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statements", "variableDeclaration", "attribution", "pointerDeclaration", 
			"procedureDeclaration", "procedureCall", "argumentList", "typeDeclaration", 
			"attributionValues", "ifDeclaration", "elseDeclaration", "loopDeclaraion", 
			"logicalExpression", "logicalOrExpression", "logicalAndExpression", "equalityExpression", 
			"relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "primaryExpression", "logicalNotExpression", "parameterList", 
			"parameter", "printStatement", "inputStatement", "print", "read", "procedure"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'str'", "'char'", "'float'", "'boolean'", "'if'", "'else'", 
			"'loop'", "'print'", "'read'", "'func'", null, null, null, null, null, 
			"'->'", "'$'", null, "';'", "'('", "')'", "'{'", "'}'", "','", "'='", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'>'", "'<'", "'=='", "'!='", "'>='", 
			"'<='", "'&&'", "'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"INTEGER_LITERAL", "STRING_LITERAL", "CHAR_LITERAL", "FLOAT_LITERAL", 
			"BOOLEAN_LITERAL", "POINTER", "ADDRESS", "IDENTIFIER", "SEMICOLON", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "COMMA", "ATTRIBUTION", "PLUS", "MINUS", 
			"MULTIPLY", "DIVIDE", "MODULO", "GREATER", "LESS", "EQUAL", "NOT_EQUAL", 
			"GREATER_EQUAL", "LESS_EQUAL", "LOGICAL_AND", "LOGICAL_OR", "LOGICAL_NOT", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ProgMatic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		Map<String, Object> symbolTable = new HashMap<String, Object>();

	public ProgMaticParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public StatementsContext statements;
		public TerminalNode EOF() { return getToken(ProgMaticParser.EOF, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        List<ASTNode> body = new ArrayList<ASTNode>();
			        Map<String, Object> symbolTable = new HashMap<String, Object>();
			    
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 528254L) != 0)) {
				{
				{
				setState(61);
				((ProgramContext)_localctx).statements = statements();
				body.add(((ProgramContext)_localctx).statements.node);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(EOF);

			        for (ASTNode n : body) {
			            n.execute(symbolTable);
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public ASTNode node;
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public PointerDeclarationContext pointerDeclaration() {
			return getRuleContext(PointerDeclarationContext.class,0);
		}
		public ProcedureDeclarationContext procedureDeclaration() {
			return getRuleContext(ProcedureDeclarationContext.class,0);
		}
		public ProcedureCallContext procedureCall() {
			return getRuleContext(ProcedureCallContext.class,0);
		}
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public IfDeclarationContext ifDeclaration() {
			return getRuleContext(IfDeclarationContext.class,0);
		}
		public LoopDeclaraionContext loopDeclaraion() {
			return getRuleContext(LoopDeclaraionContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public InputStatementContext inputStatement() {
			return getRuleContext(InputStatementContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				pointerDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				procedureDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				procedureCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				attribution();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				ifDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(78);
				loopDeclaraion();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(79);
				printStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(80);
				inputStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ProgMaticParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(ProgMaticParser.SEMICOLON, 0); }
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDeclaration);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				typeDeclaration();
				setState(84);
				match(IDENTIFIER);
				setState(85);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				typeDeclaration();
				setState(88);
				attribution();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ProgMaticParser.IDENTIFIER, 0); }
		public TerminalNode ATTRIBUTION() { return getToken(ProgMaticParser.ATTRIBUTION, 0); }
		public TerminalNode SEMICOLON() { return getToken(ProgMaticParser.SEMICOLON, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public AttributionValuesContext attributionValues() {
			return getRuleContext(AttributionValuesContext.class,0);
		}
		public AttributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterAttribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitAttribution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitAttribution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributionContext attribution() throws RecognitionException {
		AttributionContext _localctx = new AttributionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(IDENTIFIER);
			setState(93);
			match(ATTRIBUTION);
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(94);
				logicalExpression();
				}
				break;
			case 2:
				{
				setState(95);
				attributionValues();
				}
				break;
			}
			setState(98);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PointerDeclarationContext extends ParserRuleContext {
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TerminalNode POINTER() { return getToken(ProgMaticParser.POINTER, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ProgMaticParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ProgMaticParser.IDENTIFIER, i);
		}
		public TerminalNode ATTRIBUTION() { return getToken(ProgMaticParser.ATTRIBUTION, 0); }
		public TerminalNode ADDRESS() { return getToken(ProgMaticParser.ADDRESS, 0); }
		public TerminalNode SEMICOLON() { return getToken(ProgMaticParser.SEMICOLON, 0); }
		public PointerDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterPointerDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitPointerDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitPointerDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerDeclarationContext pointerDeclaration() throws RecognitionException {
		PointerDeclarationContext _localctx = new PointerDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pointerDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			typeDeclaration();
			setState(101);
			match(POINTER);
			setState(102);
			match(IDENTIFIER);
			setState(103);
			match(ATTRIBUTION);
			setState(104);
			match(ADDRESS);
			setState(105);
			match(IDENTIFIER);
			setState(106);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureDeclarationContext extends ParserRuleContext {
		public ProcedureContext procedure() {
			return getRuleContext(ProcedureContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ProgMaticParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ProgMaticParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ProgMaticParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ProgMaticParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ProgMaticParser.RBRACE, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ProcedureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterProcedureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitProcedureDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitProcedureDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureDeclarationContext procedureDeclaration() throws RecognitionException {
		ProcedureDeclarationContext _localctx = new ProcedureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			procedure();
			setState(109);
			match(IDENTIFIER);
			setState(110);
			match(LPAREN);
			setState(111);
			parameterList();
			setState(112);
			match(RPAREN);
			setState(113);
			match(LBRACE);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 528254L) != 0)) {
				{
				{
				setState(114);
				statements();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ProgMaticParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ProgMaticParser.LPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ProgMaticParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(ProgMaticParser.SEMICOLON, 0); }
		public ProcedureCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterProcedureCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitProcedureCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitProcedureCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureCallContext procedureCall() throws RecognitionException {
		ProcedureCallContext _localctx = new ProcedureCallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_procedureCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(IDENTIFIER);
			setState(123);
			match(LPAREN);
			setState(124);
			argumentList();
			setState(125);
			match(RPAREN);
			setState(126);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ProgMaticParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ProgMaticParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProgMaticParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProgMaticParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(128);
				match(IDENTIFIER);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(129);
					match(COMMA);
					setState(130);
					match(IDENTIFIER);
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclarationContext extends ParserRuleContext {
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributionValuesContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(ProgMaticParser.STRING_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(ProgMaticParser.CHAR_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(ProgMaticParser.FLOAT_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(ProgMaticParser.BOOLEAN_LITERAL, 0); }
		public AttributionValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributionValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterAttributionValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitAttributionValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitAttributionValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributionValuesContext attributionValues() throws RecognitionException {
		AttributionValuesContext _localctx = new AttributionValuesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attributionValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 122880L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfDeclarationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ProgMaticParser.LPAREN, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ProgMaticParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ProgMaticParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ProgMaticParser.RBRACE, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<ElseDeclarationContext> elseDeclaration() {
			return getRuleContexts(ElseDeclarationContext.class);
		}
		public ElseDeclarationContext elseDeclaration(int i) {
			return getRuleContext(ElseDeclarationContext.class,i);
		}
		public IfDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterIfDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitIfDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitIfDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfDeclarationContext ifDeclaration() throws RecognitionException {
		IfDeclarationContext _localctx = new IfDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__5);
			setState(143);
			match(LPAREN);
			setState(144);
			logicalExpression();
			setState(145);
			match(RPAREN);
			setState(146);
			match(LBRACE);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 528254L) != 0)) {
				{
				{
				setState(147);
				statements();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			match(RBRACE);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(154);
				elseDeclaration();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseDeclarationContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ProgMaticParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ProgMaticParser.RBRACE, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ElseDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterElseDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitElseDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitElseDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseDeclarationContext elseDeclaration() throws RecognitionException {
		ElseDeclarationContext _localctx = new ElseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__6);
			setState(161);
			match(LBRACE);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 528254L) != 0)) {
				{
				{
				setState(162);
				statements();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopDeclaraionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ProgMaticParser.LPAREN, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ProgMaticParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ProgMaticParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ProgMaticParser.RBRACE, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public LoopDeclaraionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopDeclaraion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterLoopDeclaraion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitLoopDeclaraion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitLoopDeclaraion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopDeclaraionContext loopDeclaraion() throws RecognitionException {
		LoopDeclaraionContext _localctx = new LoopDeclaraionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_loopDeclaraion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__7);
			setState(171);
			match(LPAREN);
			setState(172);
			logicalExpression();
			setState(173);
			match(RPAREN);
			setState(174);
			match(LBRACE);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 528254L) != 0)) {
				{
				{
				setState(175);
				statements();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public LogicalOrExpressionContext logicalOrExpression;
		public LogicalAndExpressionContext logicalAndExpression;
		public LogicalExpressionContext logicalExpression;
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public TerminalNode LOGICAL_NOT() { return getToken(ProgMaticParser.LOGICAL_NOT, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_logicalExpression);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				((LogicalExpressionContext)_localctx).logicalOrExpression = logicalOrExpression();
				((LogicalExpressionContext)_localctx).node =  ((LogicalExpressionContext)_localctx).logicalOrExpression.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				((LogicalExpressionContext)_localctx).logicalAndExpression = logicalAndExpression();
				((LogicalExpressionContext)_localctx).node =  ((LogicalExpressionContext)_localctx).logicalAndExpression.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				match(LOGICAL_NOT);
				setState(190);
				((LogicalExpressionContext)_localctx).logicalExpression = logicalExpression();
				((LogicalExpressionContext)_localctx).node =  ((LogicalExpressionContext)_localctx).logicalExpression.node;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public LogicalAndExpressionContext logicalAndExpression;
		public LogicalAndExpressionContext right;
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> LOGICAL_OR() { return getTokens(ProgMaticParser.LOGICAL_OR); }
		public TerminalNode LOGICAL_OR(int i) {
			return getToken(ProgMaticParser.LOGICAL_OR, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			((LogicalOrExpressionContext)_localctx).logicalAndExpression = logicalAndExpression();
			((LogicalOrExpressionContext)_localctx).node =  ((LogicalOrExpressionContext)_localctx).logicalAndExpression.node;
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_OR) {
				{
				{
				setState(197);
				match(LOGICAL_OR);
				setState(198);
				((LogicalOrExpressionContext)_localctx).right = ((LogicalOrExpressionContext)_localctx).logicalAndExpression = logicalAndExpression();
				((LogicalOrExpressionContext)_localctx).node =  new LogicalOr(_localctx.node, ((LogicalOrExpressionContext)_localctx).right.node);
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public EqualityExpressionContext equalityExpression;
		public EqualityExpressionContext right;
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> LOGICAL_AND() { return getTokens(ProgMaticParser.LOGICAL_AND); }
		public TerminalNode LOGICAL_AND(int i) {
			return getToken(ProgMaticParser.LOGICAL_AND, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			((LogicalAndExpressionContext)_localctx).equalityExpression = equalityExpression();
			((LogicalAndExpressionContext)_localctx).node =  ((LogicalAndExpressionContext)_localctx).equalityExpression.node;
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_AND) {
				{
				{
				setState(208);
				match(LOGICAL_AND);
				setState(209);
				((LogicalAndExpressionContext)_localctx).right = ((LogicalAndExpressionContext)_localctx).equalityExpression = equalityExpression();
				((LogicalAndExpressionContext)_localctx).node =  new LogicalAnd(_localctx.node, ((LogicalAndExpressionContext)_localctx).right.node);
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public RelationalExpressionContext relationalExpression;
		public Token operator;
		public RelationalExpressionContext right;
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(ProgMaticParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(ProgMaticParser.EQUAL, i);
		}
		public List<TerminalNode> NOT_EQUAL() { return getTokens(ProgMaticParser.NOT_EQUAL); }
		public TerminalNode NOT_EQUAL(int i) {
			return getToken(ProgMaticParser.NOT_EQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			((EqualityExpressionContext)_localctx).relationalExpression = relationalExpression();
			((EqualityExpressionContext)_localctx).node =  ((EqualityExpressionContext)_localctx).relationalExpression.node;
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOT_EQUAL) {
				{
				{
				setState(219);
				((EqualityExpressionContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
					((EqualityExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(220);
				((EqualityExpressionContext)_localctx).right = ((EqualityExpressionContext)_localctx).relationalExpression = relationalExpression();
				((EqualityExpressionContext)_localctx).node =  new EqualityExpression(_localctx.node, ((EqualityExpressionContext)_localctx).right.node, (((EqualityExpressionContext)_localctx).operator!=null?((EqualityExpressionContext)_localctx).operator.getText():null));
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public AdditiveExpressionContext additiveExpression;
		public Token operator;
		public AdditiveExpressionContext right;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> LESS() { return getTokens(ProgMaticParser.LESS); }
		public TerminalNode LESS(int i) {
			return getToken(ProgMaticParser.LESS, i);
		}
		public List<TerminalNode> GREATER() { return getTokens(ProgMaticParser.GREATER); }
		public TerminalNode GREATER(int i) {
			return getToken(ProgMaticParser.GREATER, i);
		}
		public List<TerminalNode> LESS_EQUAL() { return getTokens(ProgMaticParser.LESS_EQUAL); }
		public TerminalNode LESS_EQUAL(int i) {
			return getToken(ProgMaticParser.LESS_EQUAL, i);
		}
		public List<TerminalNode> GREATER_EQUAL() { return getTokens(ProgMaticParser.GREATER_EQUAL); }
		public TerminalNode GREATER_EQUAL(int i) {
			return getToken(ProgMaticParser.GREATER_EQUAL, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			((RelationalExpressionContext)_localctx).additiveExpression = additiveExpression();
			((RelationalExpressionContext)_localctx).node =  ((RelationalExpressionContext)_localctx).additiveExpression.node;
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 219043332096L) != 0)) {
				{
				{
				setState(230);
				((RelationalExpressionContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 219043332096L) != 0)) ) {
					((RelationalExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(231);
				((RelationalExpressionContext)_localctx).right = ((RelationalExpressionContext)_localctx).additiveExpression = additiveExpression();
				((RelationalExpressionContext)_localctx).node =  new RelationalExpression(_localctx.node, ((RelationalExpressionContext)_localctx).right.node, (((RelationalExpressionContext)_localctx).operator!=null?((RelationalExpressionContext)_localctx).operator.getText():null));
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public MultiplicativeExpressionContext multiplicativeExpression;
		public Token operator;
		public MultiplicativeExpressionContext right;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ProgMaticParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ProgMaticParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(ProgMaticParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ProgMaticParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			((AdditiveExpressionContext)_localctx).multiplicativeExpression = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).node =  ((AdditiveExpressionContext)_localctx).multiplicativeExpression.node;
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(241);
				((AdditiveExpressionContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((AdditiveExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(242);
				((AdditiveExpressionContext)_localctx).right = ((AdditiveExpressionContext)_localctx).multiplicativeExpression = multiplicativeExpression();
				((AdditiveExpressionContext)_localctx).node =  new AdditiveExpression(_localctx.node, ((AdditiveExpressionContext)_localctx).right.node, (((AdditiveExpressionContext)_localctx).operator!=null?((AdditiveExpressionContext)_localctx).operator.getText():null));
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public UnaryExpressionContext unaryExpression;
		public Token operator;
		public UnaryExpressionContext right;
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULTIPLY() { return getTokens(ProgMaticParser.MULTIPLY); }
		public TerminalNode MULTIPLY(int i) {
			return getToken(ProgMaticParser.MULTIPLY, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(ProgMaticParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(ProgMaticParser.DIVIDE, i);
		}
		public List<TerminalNode> MODULO() { return getTokens(ProgMaticParser.MODULO); }
		public TerminalNode MODULO(int i) {
			return getToken(ProgMaticParser.MODULO, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			((MultiplicativeExpressionContext)_localctx).unaryExpression = unaryExpression();
			((MultiplicativeExpressionContext)_localctx).node =  ((MultiplicativeExpressionContext)_localctx).unaryExpression.node;
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) {
				{
				{
				setState(252);
				((MultiplicativeExpressionContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) ) {
					((MultiplicativeExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(253);
				((MultiplicativeExpressionContext)_localctx).right = ((MultiplicativeExpressionContext)_localctx).unaryExpression = unaryExpression();
				((MultiplicativeExpressionContext)_localctx).node =  new MultiplicativeExpression(_localctx.node, ((MultiplicativeExpressionContext)_localctx).right.node, (((MultiplicativeExpressionContext)_localctx).operator!=null?((MultiplicativeExpressionContext)_localctx).operator.getText():null));
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public Token operator;
		public UnaryExpressionContext operand;
		public PrimaryExpressionContext primaryExpression;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(ProgMaticParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ProgMaticParser.MINUS, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unaryExpression);
		int _la;
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				((UnaryExpressionContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((UnaryExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(262);
				((UnaryExpressionContext)_localctx).operand = unaryExpression();
				((UnaryExpressionContext)_localctx).node =  new UnaryExpression((((UnaryExpressionContext)_localctx).operator!=null?((UnaryExpressionContext)_localctx).operator.getText():null), ((UnaryExpressionContext)_localctx).operand.node);
				}
				break;
			case INTEGER_LITERAL:
			case STRING_LITERAL:
			case CHAR_LITERAL:
			case FLOAT_LITERAL:
			case BOOLEAN_LITERAL:
			case IDENTIFIER:
			case LPAREN:
			case LOGICAL_NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				((UnaryExpressionContext)_localctx).primaryExpression = primaryExpression();
				((UnaryExpressionContext)_localctx).node =  ((UnaryExpressionContext)_localctx).primaryExpression.node;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public LogicalNotExpressionContext logicalNotExpression;
		public Token INTEGER_LITERAL;
		public Token BOOLEAN_LITERAL;
		public Token CHAR_LITERAL;
		public Token STRING_LITERAL;
		public Token FLOAT_LITERAL;
		public Token IDENTIFIER;
		public LogicalOrExpressionContext expr;
		public LogicalNotExpressionContext logicalNotExpression() {
			return getRuleContext(LogicalNotExpressionContext.class,0);
		}
		public TerminalNode INTEGER_LITERAL() { return getToken(ProgMaticParser.INTEGER_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(ProgMaticParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(ProgMaticParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ProgMaticParser.STRING_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(ProgMaticParser.FLOAT_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ProgMaticParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ProgMaticParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ProgMaticParser.RPAREN, 0); }
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_primaryExpression);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOGICAL_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				((PrimaryExpressionContext)_localctx).logicalNotExpression = logicalNotExpression();
				((PrimaryExpressionContext)_localctx).node =  ((PrimaryExpressionContext)_localctx).logicalNotExpression.node;
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				((PrimaryExpressionContext)_localctx).INTEGER_LITERAL = match(INTEGER_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant(Integer.parseInt((((PrimaryExpressionContext)_localctx).INTEGER_LITERAL!=null?((PrimaryExpressionContext)_localctx).INTEGER_LITERAL.getText():null)));
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL = match(BOOLEAN_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant(Boolean.parseBoolean((((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL!=null?((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL.getText():null)));
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				((PrimaryExpressionContext)_localctx).CHAR_LITERAL = match(CHAR_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant((((PrimaryExpressionContext)_localctx).CHAR_LITERAL!=null?((PrimaryExpressionContext)_localctx).CHAR_LITERAL.getText():null).charAt(1));
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(279);
				((PrimaryExpressionContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant((((PrimaryExpressionContext)_localctx).STRING_LITERAL!=null?((PrimaryExpressionContext)_localctx).STRING_LITERAL.getText():null).substring(1, (((PrimaryExpressionContext)_localctx).STRING_LITERAL!=null?((PrimaryExpressionContext)_localctx).STRING_LITERAL.getText():null).length() - 1));
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(281);
				((PrimaryExpressionContext)_localctx).FLOAT_LITERAL = match(FLOAT_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant(Float.parseFloat((((PrimaryExpressionContext)_localctx).FLOAT_LITERAL!=null?((PrimaryExpressionContext)_localctx).FLOAT_LITERAL.getText():null)));
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 7);
				{
				setState(283);
				((PrimaryExpressionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((PrimaryExpressionContext)_localctx).node =  new VarRef((((PrimaryExpressionContext)_localctx).IDENTIFIER!=null?((PrimaryExpressionContext)_localctx).IDENTIFIER.getText():null));
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 8);
				{
				setState(285);
				match(LPAREN);
				setState(286);
				((PrimaryExpressionContext)_localctx).expr = logicalOrExpression();
				setState(287);
				match(RPAREN);
				((PrimaryExpressionContext)_localctx).node =  ((PrimaryExpressionContext)_localctx).expr.node;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalNotExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public PrimaryExpressionContext operand;
		public TerminalNode LOGICAL_NOT() { return getToken(ProgMaticParser.LOGICAL_NOT, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public LogicalNotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalNotExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterLogicalNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitLogicalNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitLogicalNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalNotExpressionContext logicalNotExpression() throws RecognitionException {
		LogicalNotExpressionContext _localctx = new LogicalNotExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_logicalNotExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(LOGICAL_NOT);
			setState(293);
			((LogicalNotExpressionContext)_localctx).operand = primaryExpression();
			((LogicalNotExpressionContext)_localctx).node =  new LogicalNot(((LogicalNotExpressionContext)_localctx).operand.node);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProgMaticParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProgMaticParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) {
				{
				setState(296);
				parameter();
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(297);
					match(COMMA);
					setState(298);
					parameter();
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ProgMaticParser.IDENTIFIER, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			typeDeclaration();
			setState(307);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ProgMaticParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ProgMaticParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(ProgMaticParser.SEMICOLON, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public AttributionValuesContext attributionValues() {
			return getRuleContext(AttributionValuesContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			print();
			setState(310);
			match(LPAREN);
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(311);
				logicalExpression();
				}
				break;
			case 2:
				{
				setState(312);
				attributionValues();
				}
				break;
			}
			setState(315);
			match(RPAREN);
			setState(316);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputStatementContext extends ParserRuleContext {
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ProgMaticParser.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ProgMaticParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(ProgMaticParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(ProgMaticParser.SEMICOLON, 0); }
		public InputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterInputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitInputStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitInputStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputStatementContext inputStatement() throws RecognitionException {
		InputStatementContext _localctx = new InputStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_inputStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			read();
			setState(319);
			match(LPAREN);
			setState(320);
			match(IDENTIFIER);
			setState(321);
			match(RPAREN);
			setState(322);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReadContext extends ParserRuleContext {
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureContext extends ParserRuleContext {
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001)\u014b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000A\b\u0000\n\u0000\f\u0000D\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001R\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002[\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003a\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005t\b\u0005"+
		"\n\u0005\f\u0005w\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u0084\b\u0007\n\u0007\f\u0007\u0087\t\u0007\u0003"+
		"\u0007\u0089\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u0095\b\n\n\n\f\n\u0098\t\n\u0001\n"+
		"\u0001\n\u0005\n\u009c\b\n\n\n\f\n\u009f\t\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00a4\b\u000b\n\u000b\f\u000b\u00a7\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00b1"+
		"\b\f\n\f\f\f\u00b4\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00c2\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u00ca\b\u000e\n\u000e\f\u000e\u00cd\t\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00d5\b\u000f"+
		"\n\u000f\f\u000f\u00d8\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00e0\b\u0010\n\u0010\f\u0010"+
		"\u00e3\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u00eb\b\u0011\n\u0011\f\u0011\u00ee\t\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u00f6\b\u0012\n\u0012\f\u0012\u00f9\t\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0101\b\u0013"+
		"\n\u0013\f\u0013\u0104\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u010d\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u0123\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u012c"+
		"\b\u0017\n\u0017\f\u0017\u012f\t\u0017\u0003\u0017\u0131\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u013a\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0000\u0000\u001e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:\u0000\u0006\u0001"+
		"\u0000\u0001\u0005\u0001\u0000\r\u0010\u0001\u0000\"#\u0002\u0000 !$%"+
		"\u0001\u0000\u001b\u001c\u0001\u0000\u001d\u001f\u0151\u0000<\u0001\u0000"+
		"\u0000\u0000\u0002Q\u0001\u0000\u0000\u0000\u0004Z\u0001\u0000\u0000\u0000"+
		"\u0006\\\u0001\u0000\u0000\u0000\bd\u0001\u0000\u0000\u0000\nl\u0001\u0000"+
		"\u0000\u0000\fz\u0001\u0000\u0000\u0000\u000e\u0088\u0001\u0000\u0000"+
		"\u0000\u0010\u008a\u0001\u0000\u0000\u0000\u0012\u008c\u0001\u0000\u0000"+
		"\u0000\u0014\u008e\u0001\u0000\u0000\u0000\u0016\u00a0\u0001\u0000\u0000"+
		"\u0000\u0018\u00aa\u0001\u0000\u0000\u0000\u001a\u00c1\u0001\u0000\u0000"+
		"\u0000\u001c\u00c3\u0001\u0000\u0000\u0000\u001e\u00ce\u0001\u0000\u0000"+
		"\u0000 \u00d9\u0001\u0000\u0000\u0000\"\u00e4\u0001\u0000\u0000\u0000"+
		"$\u00ef\u0001\u0000\u0000\u0000&\u00fa\u0001\u0000\u0000\u0000(\u010c"+
		"\u0001\u0000\u0000\u0000*\u0122\u0001\u0000\u0000\u0000,\u0124\u0001\u0000"+
		"\u0000\u0000.\u0130\u0001\u0000\u0000\u00000\u0132\u0001\u0000\u0000\u0000"+
		"2\u0135\u0001\u0000\u0000\u00004\u013e\u0001\u0000\u0000\u00006\u0144"+
		"\u0001\u0000\u0000\u00008\u0146\u0001\u0000\u0000\u0000:\u0148\u0001\u0000"+
		"\u0000\u0000<B\u0006\u0000\uffff\uffff\u0000=>\u0003\u0002\u0001\u0000"+
		">?\u0006\u0000\uffff\uffff\u0000?A\u0001\u0000\u0000\u0000@=\u0001\u0000"+
		"\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CE\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000"+
		"EF\u0005\u0000\u0000\u0001FG\u0006\u0000\uffff\uffff\u0000G\u0001\u0001"+
		"\u0000\u0000\u0000HR\u0003\u0004\u0002\u0000IR\u0003\b\u0004\u0000JR\u0003"+
		"\n\u0005\u0000KR\u0003\f\u0006\u0000LR\u0003\u0006\u0003\u0000MR\u0003"+
		"\u0014\n\u0000NR\u0003\u0018\f\u0000OR\u00032\u0019\u0000PR\u00034\u001a"+
		"\u0000QH\u0001\u0000\u0000\u0000QI\u0001\u0000\u0000\u0000QJ\u0001\u0000"+
		"\u0000\u0000QK\u0001\u0000\u0000\u0000QL\u0001\u0000\u0000\u0000QM\u0001"+
		"\u0000\u0000\u0000QN\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000"+
		"QP\u0001\u0000\u0000\u0000R\u0003\u0001\u0000\u0000\u0000ST\u0003\u0010"+
		"\b\u0000TU\u0005\u0013\u0000\u0000UV\u0005\u0014\u0000\u0000V[\u0001\u0000"+
		"\u0000\u0000WX\u0003\u0010\b\u0000XY\u0003\u0006\u0003\u0000Y[\u0001\u0000"+
		"\u0000\u0000ZS\u0001\u0000\u0000\u0000ZW\u0001\u0000\u0000\u0000[\u0005"+
		"\u0001\u0000\u0000\u0000\\]\u0005\u0013\u0000\u0000]`\u0005\u001a\u0000"+
		"\u0000^a\u0003\u001a\r\u0000_a\u0003\u0012\t\u0000`^\u0001\u0000\u0000"+
		"\u0000`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0005\u0014"+
		"\u0000\u0000c\u0007\u0001\u0000\u0000\u0000de\u0003\u0010\b\u0000ef\u0005"+
		"\u0011\u0000\u0000fg\u0005\u0013\u0000\u0000gh\u0005\u001a\u0000\u0000"+
		"hi\u0005\u0012\u0000\u0000ij\u0005\u0013\u0000\u0000jk\u0005\u0014\u0000"+
		"\u0000k\t\u0001\u0000\u0000\u0000lm\u0003:\u001d\u0000mn\u0005\u0013\u0000"+
		"\u0000no\u0005\u0015\u0000\u0000op\u0003.\u0017\u0000pq\u0005\u0016\u0000"+
		"\u0000qu\u0005\u0017\u0000\u0000rt\u0003\u0002\u0001\u0000sr\u0001\u0000"+
		"\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001"+
		"\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000"+
		"xy\u0005\u0018\u0000\u0000y\u000b\u0001\u0000\u0000\u0000z{\u0005\u0013"+
		"\u0000\u0000{|\u0005\u0015\u0000\u0000|}\u0003\u000e\u0007\u0000}~\u0005"+
		"\u0016\u0000\u0000~\u007f\u0005\u0014\u0000\u0000\u007f\r\u0001\u0000"+
		"\u0000\u0000\u0080\u0085\u0005\u0013\u0000\u0000\u0081\u0082\u0005\u0019"+
		"\u0000\u0000\u0082\u0084\u0005\u0013\u0000\u0000\u0083\u0081\u0001\u0000"+
		"\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000"+
		"\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u0080\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u000f\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0007\u0000\u0000\u0000\u008b\u0011\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0007\u0001\u0000\u0000\u008d\u0013\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0005\u0006\u0000\u0000\u008f\u0090\u0005\u0015"+
		"\u0000\u0000\u0090\u0091\u0003\u001a\r\u0000\u0091\u0092\u0005\u0016\u0000"+
		"\u0000\u0092\u0096\u0005\u0017\u0000\u0000\u0093\u0095\u0003\u0002\u0001"+
		"\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000"+
		"\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000"+
		"\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0099\u009d\u0005\u0018\u0000\u0000\u009a\u009c\u0003\u0016\u000b"+
		"\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000"+
		"\u0000\u009e\u0015\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0005\u0007\u0000\u0000\u00a1\u00a5\u0005\u0017\u0000"+
		"\u0000\u00a2\u00a4\u0003\u0002\u0001\u0000\u00a3\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0018\u0000"+
		"\u0000\u00a9\u0017\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\b\u0000\u0000"+
		"\u00ab\u00ac\u0005\u0015\u0000\u0000\u00ac\u00ad\u0003\u001a\r\u0000\u00ad"+
		"\u00ae\u0005\u0016\u0000\u0000\u00ae\u00b2\u0005\u0017\u0000\u0000\u00af"+
		"\u00b1\u0003\u0002\u0001\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0018\u0000\u0000\u00b6"+
		"\u0019\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003\u001c\u000e\u0000\u00b8"+
		"\u00b9\u0006\r\uffff\uffff\u0000\u00b9\u00c2\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0003\u001e\u000f\u0000\u00bb\u00bc\u0006\r\uffff\uffff\u0000\u00bc"+
		"\u00c2\u0001\u0000\u0000\u0000\u00bd\u00be\u0005(\u0000\u0000\u00be\u00bf"+
		"\u0003\u001a\r\u0000\u00bf\u00c0\u0006\r\uffff\uffff\u0000\u00c0\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c1\u00b7\u0001\u0000\u0000\u0000\u00c1\u00ba"+
		"\u0001\u0000\u0000\u0000\u00c1\u00bd\u0001\u0000\u0000\u0000\u00c2\u001b"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0003\u001e\u000f\u0000\u00c4\u00cb"+
		"\u0006\u000e\uffff\uffff\u0000\u00c5\u00c6\u0005\'\u0000\u0000\u00c6\u00c7"+
		"\u0003\u001e\u000f\u0000\u00c7\u00c8\u0006\u000e\uffff\uffff\u0000\u00c8"+
		"\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c5\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cc\u001d\u0001\u0000\u0000\u0000\u00cd"+
		"\u00cb\u0001\u0000\u0000\u0000\u00ce\u00cf\u0003 \u0010\u0000\u00cf\u00d6"+
		"\u0006\u000f\uffff\uffff\u0000\u00d0\u00d1\u0005&\u0000\u0000\u00d1\u00d2"+
		"\u0003 \u0010\u0000\u00d2\u00d3\u0006\u000f\uffff\uffff\u0000\u00d3\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d0\u0001\u0000\u0000\u0000\u00d5\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d7\u001f\u0001\u0000\u0000\u0000\u00d8\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d9\u00da\u0003\"\u0011\u0000\u00da\u00e1\u0006"+
		"\u0010\uffff\uffff\u0000\u00db\u00dc\u0007\u0002\u0000\u0000\u00dc\u00dd"+
		"\u0003\"\u0011\u0000\u00dd\u00de\u0006\u0010\uffff\uffff\u0000\u00de\u00e0"+
		"\u0001\u0000\u0000\u0000\u00df\u00db\u0001\u0000\u0000\u0000\u00e0\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e2!\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0003$\u0012\u0000\u00e5\u00ec\u0006\u0011"+
		"\uffff\uffff\u0000\u00e6\u00e7\u0007\u0003\u0000\u0000\u00e7\u00e8\u0003"+
		"$\u0012\u0000\u00e8\u00e9\u0006\u0011\uffff\uffff\u0000\u00e9\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e6\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ed#\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f0\u0003&\u0013\u0000\u00f0\u00f7\u0006\u0012\uffff"+
		"\uffff\u0000\u00f1\u00f2\u0007\u0004\u0000\u0000\u00f2\u00f3\u0003&\u0013"+
		"\u0000\u00f3\u00f4\u0006\u0012\uffff\uffff\u0000\u00f4\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f1\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f8%\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0003(\u0014\u0000\u00fb\u0102\u0006\u0013\uffff\uffff"+
		"\u0000\u00fc\u00fd\u0007\u0005\u0000\u0000\u00fd\u00fe\u0003(\u0014\u0000"+
		"\u00fe\u00ff\u0006\u0013\uffff\uffff\u0000\u00ff\u0101\u0001\u0000\u0000"+
		"\u0000\u0100\u00fc\u0001\u0000\u0000\u0000\u0101\u0104\u0001\u0000\u0000"+
		"\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000"+
		"\u0000\u0103\'\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0007\u0004\u0000\u0000\u0106\u0107\u0003(\u0014\u0000\u0107"+
		"\u0108\u0006\u0014\uffff\uffff\u0000\u0108\u010d\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\u0003*\u0015\u0000\u010a\u010b\u0006\u0014\uffff\uffff\u0000"+
		"\u010b\u010d\u0001\u0000\u0000\u0000\u010c\u0105\u0001\u0000\u0000\u0000"+
		"\u010c\u0109\u0001\u0000\u0000\u0000\u010d)\u0001\u0000\u0000\u0000\u010e"+
		"\u010f\u0003,\u0016\u0000\u010f\u0110\u0006\u0015\uffff\uffff\u0000\u0110"+
		"\u0123\u0001\u0000\u0000\u0000\u0111\u0112\u0005\f\u0000\u0000\u0112\u0123"+
		"\u0006\u0015\uffff\uffff\u0000\u0113\u0114\u0005\u0010\u0000\u0000\u0114"+
		"\u0123\u0006\u0015\uffff\uffff\u0000\u0115\u0116\u0005\u000e\u0000\u0000"+
		"\u0116\u0123\u0006\u0015\uffff\uffff\u0000\u0117\u0118\u0005\r\u0000\u0000"+
		"\u0118\u0123\u0006\u0015\uffff\uffff\u0000\u0119\u011a\u0005\u000f\u0000"+
		"\u0000\u011a\u0123\u0006\u0015\uffff\uffff\u0000\u011b\u011c\u0005\u0013"+
		"\u0000\u0000\u011c\u0123\u0006\u0015\uffff\uffff\u0000\u011d\u011e\u0005"+
		"\u0015\u0000\u0000\u011e\u011f\u0003\u001c\u000e\u0000\u011f\u0120\u0005"+
		"\u0016\u0000\u0000\u0120\u0121\u0006\u0015\uffff\uffff\u0000\u0121\u0123"+
		"\u0001\u0000\u0000\u0000\u0122\u010e\u0001\u0000\u0000\u0000\u0122\u0111"+
		"\u0001\u0000\u0000\u0000\u0122\u0113\u0001\u0000\u0000\u0000\u0122\u0115"+
		"\u0001\u0000\u0000\u0000\u0122\u0117\u0001\u0000\u0000\u0000\u0122\u0119"+
		"\u0001\u0000\u0000\u0000\u0122\u011b\u0001\u0000\u0000\u0000\u0122\u011d"+
		"\u0001\u0000\u0000\u0000\u0123+\u0001\u0000\u0000\u0000\u0124\u0125\u0005"+
		"(\u0000\u0000\u0125\u0126\u0003*\u0015\u0000\u0126\u0127\u0006\u0016\uffff"+
		"\uffff\u0000\u0127-\u0001\u0000\u0000\u0000\u0128\u012d\u00030\u0018\u0000"+
		"\u0129\u012a\u0005\u0019\u0000\u0000\u012a\u012c\u00030\u0018\u0000\u012b"+
		"\u0129\u0001\u0000\u0000\u0000\u012c\u012f\u0001\u0000\u0000\u0000\u012d"+
		"\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e"+
		"\u0131\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u0130"+
		"\u0128\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131"+
		"/\u0001\u0000\u0000\u0000\u0132\u0133\u0003\u0010\b\u0000\u0133\u0134"+
		"\u0005\u0013\u0000\u0000\u01341\u0001\u0000\u0000\u0000\u0135\u0136\u0003"+
		"6\u001b\u0000\u0136\u0139\u0005\u0015\u0000\u0000\u0137\u013a\u0003\u001a"+
		"\r\u0000\u0138\u013a\u0003\u0012\t\u0000\u0139\u0137\u0001\u0000\u0000"+
		"\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000"+
		"\u0000\u013b\u013c\u0005\u0016\u0000\u0000\u013c\u013d\u0005\u0014\u0000"+
		"\u0000\u013d3\u0001\u0000\u0000\u0000\u013e\u013f\u00038\u001c\u0000\u013f"+
		"\u0140\u0005\u0015\u0000\u0000\u0140\u0141\u0005\u0013\u0000\u0000\u0141"+
		"\u0142\u0005\u0016\u0000\u0000\u0142\u0143\u0005\u0014\u0000\u0000\u0143"+
		"5\u0001\u0000\u0000\u0000\u0144\u0145\u0005\t\u0000\u0000\u01457\u0001"+
		"\u0000\u0000\u0000\u0146\u0147\u0005\n\u0000\u0000\u01479\u0001\u0000"+
		"\u0000\u0000\u0148\u0149\u0005\u000b\u0000\u0000\u0149;\u0001\u0000\u0000"+
		"\u0000\u0017BQZ`u\u0085\u0088\u0096\u009d\u00a5\u00b2\u00c1\u00cb\u00d6"+
		"\u00e1\u00ec\u00f7\u0102\u010c\u0122\u012d\u0130\u0139";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}