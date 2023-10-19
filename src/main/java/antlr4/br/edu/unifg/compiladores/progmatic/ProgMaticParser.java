// Generated from C:/Users/filip/OneDrive/Documentos/intelliJ/progmatic-compiler/src/main/java/antlr4/br/edu/unifg/compiladores/progmatic/ProgMatic.g4 by ANTLR 4.13.1
package antlr4.br.edu.unifg.compiladores.progmatic;
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
		INTEGER_LITERAL=10, STRING_LITERAL=11, CHAR_LITERAL=12, FLOAT_LITERAL=13, 
		BOOLEAN_LITERAL=14, POINTER=15, ADDRESS=16, IDENTIFIER=17, SEMICOLON=18, 
		LPAREN=19, RPAREN=20, LBRACE=21, RBRACE=22, COMMA=23, ATTRIBUTION=24, 
		PLUS=25, MINUS=26, MULTIPLY=27, DIVIDE=28, MODULO=29, GREATER=30, LESS=31, 
		EQUAL=32, NOT_EQUAL=33, GREATER_EQUAL=34, LESS_EQUAL=35, LOGICAL_AND=36, 
		LOGICAL_OR=37, LOGICAL_NOT=38, WS=39;
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_variableDeclaration = 2, RULE_attribution = 3, 
		RULE_pointerDeclaration = 4, RULE_procedureDeclaration = 5, RULE_procedureCall = 6, 
		RULE_argumentList = 7, RULE_typeDeclaration = 8, RULE_attributionValues = 9, 
		RULE_ifDeclaration = 10, RULE_elseDeclaration = 11, RULE_loopDeclaraion = 12, 
		RULE_expression = 13, RULE_conditionalExpression = 14, RULE_logicalOrExpression = 15, 
		RULE_logicalAndExpression = 16, RULE_equalityExpression = 17, RULE_relationalExpression = 18, 
		RULE_additiveExpression = 19, RULE_multiplicativeExpression = 20, RULE_unaryExpression = 21, 
		RULE_primaryExpression = 22, RULE_logicalNotExpression = 23, RULE_parameterList = 24, 
		RULE_parameter = 25, RULE_procedure = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statements", "variableDeclaration", "attribution", "pointerDeclaration", 
			"procedureDeclaration", "procedureCall", "argumentList", "typeDeclaration", 
			"attributionValues", "ifDeclaration", "elseDeclaration", "loopDeclaraion", 
			"expression", "conditionalExpression", "logicalOrExpression", "logicalAndExpression", 
			"equalityExpression", "relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "primaryExpression", "logicalNotExpression", "parameterList", 
			"parameter", "procedure"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'str'", "'char'", "'float'", "'boolean'", "'if'", "'else'", 
			"'loop'", "'func'", null, null, null, null, null, "'->'", "'$'", null, 
			"';'", "'('", "')'", "'{'", "'}'", "','", "'='", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'>'", "'<'", "'=='", "'!='", "'>='", "'<='", "'&&'", "'||'", 
			"'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "INTEGER_LITERAL", 
			"STRING_LITERAL", "CHAR_LITERAL", "FLOAT_LITERAL", "BOOLEAN_LITERAL", 
			"POINTER", "ADDRESS", "IDENTIFIER", "SEMICOLON", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "COMMA", "ATTRIBUTION", "PLUS", "MINUS", "MULTIPLY", 
			"DIVIDE", "MODULO", "GREATER", "LESS", "EQUAL", "NOT_EQUAL", "GREATER_EQUAL", 
			"LESS_EQUAL", "LOGICAL_AND", "LOGICAL_OR", "LOGICAL_NOT", "WS"
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

	public ProgMaticParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
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
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131966L) != 0)) {
				{
				{
				setState(54);
				statements();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(EOF);
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
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				pointerDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				procedureDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				procedureCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				attribution();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				ifDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
				loopDeclaraion();
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
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				typeDeclaration();
				setState(72);
				match(IDENTIFIER);
				setState(73);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				typeDeclaration();
				setState(76);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(80);
			match(IDENTIFIER);
			setState(81);
			match(ATTRIBUTION);
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
			case IDENTIFIER:
			case LPAREN:
			case PLUS:
			case MINUS:
			case LOGICAL_NOT:
				{
				setState(82);
				expression();
				}
				break;
			case STRING_LITERAL:
			case CHAR_LITERAL:
			case FLOAT_LITERAL:
			case BOOLEAN_LITERAL:
				{
				setState(83);
				attributionValues();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(86);
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
			setState(88);
			typeDeclaration();
			setState(89);
			match(POINTER);
			setState(90);
			match(IDENTIFIER);
			setState(91);
			match(ATTRIBUTION);
			setState(92);
			match(ADDRESS);
			setState(93);
			match(IDENTIFIER);
			setState(94);
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
			setState(96);
			procedure();
			setState(97);
			match(IDENTIFIER);
			setState(98);
			match(LPAREN);
			setState(99);
			parameterList();
			setState(100);
			match(RPAREN);
			setState(101);
			match(LBRACE);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131966L) != 0)) {
				{
				{
				setState(102);
				statements();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
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
			setState(110);
			match(IDENTIFIER);
			setState(111);
			match(LPAREN);
			setState(112);
			argumentList();
			setState(113);
			match(RPAREN);
			setState(114);
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
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(116);
				match(IDENTIFIER);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(117);
					match(COMMA);
					setState(118);
					match(IDENTIFIER);
					}
					}
					setState(123);
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
			setState(126);
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
			setState(128);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30720L) != 0)) ) {
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
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
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
			setState(130);
			match(T__5);
			setState(131);
			match(LPAREN);
			setState(132);
			conditionalExpression();
			setState(133);
			match(RPAREN);
			setState(134);
			match(LBRACE);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131966L) != 0)) {
				{
				{
				setState(135);
				statements();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(RBRACE);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(142);
				elseDeclaration();
				}
				}
				setState(147);
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
			setState(148);
			match(T__6);
			setState(149);
			match(LBRACE);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131966L) != 0)) {
				{
				{
				setState(150);
				statements();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
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
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
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
			setState(158);
			match(T__7);
			setState(159);
			match(LPAREN);
			setState(160);
			conditionalExpression();
			setState(161);
			match(RPAREN);
			setState(162);
			match(LBRACE);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131966L) != 0)) {
				{
				{
				setState(163);
				statements();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
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
	public static class ExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			logicalOrExpression();
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
	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public List<TerminalNode> EQUAL() { return getTokens(ProgMaticParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(ProgMaticParser.EQUAL, i);
		}
		public List<TerminalNode> NOT_EQUAL() { return getTokens(ProgMaticParser.NOT_EQUAL); }
		public TerminalNode NOT_EQUAL(int i) {
			return getToken(ProgMaticParser.NOT_EQUAL, i);
		}
		public List<TerminalNode> GREATER() { return getTokens(ProgMaticParser.GREATER); }
		public TerminalNode GREATER(int i) {
			return getToken(ProgMaticParser.GREATER, i);
		}
		public List<TerminalNode> LESS() { return getTokens(ProgMaticParser.LESS); }
		public TerminalNode LESS(int i) {
			return getToken(ProgMaticParser.LESS, i);
		}
		public List<TerminalNode> GREATER_EQUAL() { return getTokens(ProgMaticParser.GREATER_EQUAL); }
		public TerminalNode GREATER_EQUAL(int i) {
			return getToken(ProgMaticParser.GREATER_EQUAL, i);
		}
		public List<TerminalNode> LESS_EQUAL() { return getTokens(ProgMaticParser.LESS_EQUAL); }
		public TerminalNode LESS_EQUAL(int i) {
			return getToken(ProgMaticParser.LESS_EQUAL, i);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgMaticListener ) ((ProgMaticListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgMaticVisitor ) return ((ProgMaticVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			logicalOrExpression();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0)) {
				{
				{
				setState(174);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(179);
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
	public static class LogicalOrExpressionContext extends ParserRuleContext {
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
		enterRule(_localctx, 30, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			logicalAndExpression();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_OR) {
				{
				{
				setState(181);
				match(LOGICAL_OR);
				setState(182);
				logicalAndExpression();
				}
				}
				setState(187);
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
		enterRule(_localctx, 32, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			equalityExpression();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_AND) {
				{
				{
				setState(189);
				match(LOGICAL_AND);
				setState(190);
				equalityExpression();
				}
				}
				setState(195);
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
		enterRule(_localctx, 34, RULE_equalityExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			relationalExpression();
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(197);
					_la = _input.LA(1);
					if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(198);
					relationalExpression();
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 36, RULE_relationalExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			additiveExpression();
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(205);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 54760833024L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(206);
					additiveExpression();
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 38, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			multiplicativeExpression();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(213);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(214);
				multiplicativeExpression();
				}
				}
				setState(219);
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
		enterRule(_localctx, 40, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			unaryExpression();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) {
				{
				{
				setState(221);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(222);
				unaryExpression();
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
	public static class UnaryExpressionContext extends ParserRuleContext {
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
		enterRule(_localctx, 42, RULE_unaryExpression);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(229);
				unaryExpression();
				}
				break;
			case INTEGER_LITERAL:
			case IDENTIFIER:
			case LPAREN:
			case LOGICAL_NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				primaryExpression();
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
		public LogicalNotExpressionContext logicalNotExpression() {
			return getRuleContext(LogicalNotExpressionContext.class,0);
		}
		public TerminalNode INTEGER_LITERAL() { return getToken(ProgMaticParser.INTEGER_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ProgMaticParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ProgMaticParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ProgMaticParser.RPAREN, 0); }
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
		enterRule(_localctx, 44, RULE_primaryExpression);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOGICAL_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				logicalNotExpression();
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(INTEGER_LITERAL);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				match(IDENTIFIER);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				match(LPAREN);
				setState(237);
				expression();
				setState(238);
				match(RPAREN);
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
		enterRule(_localctx, 46, RULE_logicalNotExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(LOGICAL_NOT);
			setState(243);
			primaryExpression();
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
		enterRule(_localctx, 48, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) {
				{
				setState(245);
				parameter();
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(246);
					match(COMMA);
					setState(247);
					parameter();
					}
					}
					setState(252);
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
		enterRule(_localctx, 50, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			typeDeclaration();
			setState(256);
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
		enterRule(_localctx, 52, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
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

	public static final String _serializedATN =
		"\u0004\u0001\'\u0105\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0005\u0000"+
		"8\b\u0000\n\u0000\f\u0000;\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001F\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002O\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003U\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005h\b\u0005"+
		"\n\u0005\f\u0005k\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007x\b\u0007\n\u0007\f\u0007{\t\u0007\u0003\u0007"+
		"}\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u0089\b\n\n\n\f\n\u008c\t\n\u0001\n\u0001\n"+
		"\u0005\n\u0090\b\n\n\n\f\n\u0093\t\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u0098\b\u000b\n\u000b\f\u000b\u009b\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00a5\b"+
		"\f\n\f\f\f\u00a8\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00b0\b\u000e\n\u000e\f\u000e\u00b3\t\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u00b8\b\u000f\n\u000f\f\u000f\u00bb"+
		"\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00c0\b\u0010"+
		"\n\u0010\f\u0010\u00c3\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u00c8\b\u0011\n\u0011\f\u0011\u00cb\t\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u00d0\b\u0012\n\u0012\f\u0012\u00d3\t\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00d8\b\u0013\n\u0013\f\u0013"+
		"\u00db\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00e0\b"+
		"\u0014\n\u0014\f\u0014\u00e3\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u00e8\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00f1\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u00f9\b\u0018\n\u0018\f\u0018\u00fc\t\u0018\u0003\u0018\u00fe\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0000\u0000\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.024\u0000\u0007\u0001\u0000\u0001"+
		"\u0005\u0001\u0000\u000b\u000e\u0001\u0000\u001e#\u0001\u0000 !\u0002"+
		"\u0000\u001e\u001f\"#\u0001\u0000\u0019\u001a\u0001\u0000\u001b\u001d"+
		"\u0106\u00009\u0001\u0000\u0000\u0000\u0002E\u0001\u0000\u0000\u0000\u0004"+
		"N\u0001\u0000\u0000\u0000\u0006P\u0001\u0000\u0000\u0000\bX\u0001\u0000"+
		"\u0000\u0000\n`\u0001\u0000\u0000\u0000\fn\u0001\u0000\u0000\u0000\u000e"+
		"|\u0001\u0000\u0000\u0000\u0010~\u0001\u0000\u0000\u0000\u0012\u0080\u0001"+
		"\u0000\u0000\u0000\u0014\u0082\u0001\u0000\u0000\u0000\u0016\u0094\u0001"+
		"\u0000\u0000\u0000\u0018\u009e\u0001\u0000\u0000\u0000\u001a\u00ab\u0001"+
		"\u0000\u0000\u0000\u001c\u00ad\u0001\u0000\u0000\u0000\u001e\u00b4\u0001"+
		"\u0000\u0000\u0000 \u00bc\u0001\u0000\u0000\u0000\"\u00c4\u0001\u0000"+
		"\u0000\u0000$\u00cc\u0001\u0000\u0000\u0000&\u00d4\u0001\u0000\u0000\u0000"+
		"(\u00dc\u0001\u0000\u0000\u0000*\u00e7\u0001\u0000\u0000\u0000,\u00f0"+
		"\u0001\u0000\u0000\u0000.\u00f2\u0001\u0000\u0000\u00000\u00fd\u0001\u0000"+
		"\u0000\u00002\u00ff\u0001\u0000\u0000\u00004\u0102\u0001\u0000\u0000\u0000"+
		"68\u0003\u0002\u0001\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000"+
		"\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000<=\u0005\u0000\u0000\u0001=\u0001"+
		"\u0001\u0000\u0000\u0000>F\u0003\u0004\u0002\u0000?F\u0003\b\u0004\u0000"+
		"@F\u0003\n\u0005\u0000AF\u0003\f\u0006\u0000BF\u0003\u0006\u0003\u0000"+
		"CF\u0003\u0014\n\u0000DF\u0003\u0018\f\u0000E>\u0001\u0000\u0000\u0000"+
		"E?\u0001\u0000\u0000\u0000E@\u0001\u0000\u0000\u0000EA\u0001\u0000\u0000"+
		"\u0000EB\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000ED\u0001\u0000"+
		"\u0000\u0000F\u0003\u0001\u0000\u0000\u0000GH\u0003\u0010\b\u0000HI\u0005"+
		"\u0011\u0000\u0000IJ\u0005\u0012\u0000\u0000JO\u0001\u0000\u0000\u0000"+
		"KL\u0003\u0010\b\u0000LM\u0003\u0006\u0003\u0000MO\u0001\u0000\u0000\u0000"+
		"NG\u0001\u0000\u0000\u0000NK\u0001\u0000\u0000\u0000O\u0005\u0001\u0000"+
		"\u0000\u0000PQ\u0005\u0011\u0000\u0000QT\u0005\u0018\u0000\u0000RU\u0003"+
		"\u001a\r\u0000SU\u0003\u0012\t\u0000TR\u0001\u0000\u0000\u0000TS\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0005\u0012\u0000\u0000"+
		"W\u0007\u0001\u0000\u0000\u0000XY\u0003\u0010\b\u0000YZ\u0005\u000f\u0000"+
		"\u0000Z[\u0005\u0011\u0000\u0000[\\\u0005\u0018\u0000\u0000\\]\u0005\u0010"+
		"\u0000\u0000]^\u0005\u0011\u0000\u0000^_\u0005\u0012\u0000\u0000_\t\u0001"+
		"\u0000\u0000\u0000`a\u00034\u001a\u0000ab\u0005\u0011\u0000\u0000bc\u0005"+
		"\u0013\u0000\u0000cd\u00030\u0018\u0000de\u0005\u0014\u0000\u0000ei\u0005"+
		"\u0015\u0000\u0000fh\u0003\u0002\u0001\u0000gf\u0001\u0000\u0000\u0000"+
		"hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0005\u0016"+
		"\u0000\u0000m\u000b\u0001\u0000\u0000\u0000no\u0005\u0011\u0000\u0000"+
		"op\u0005\u0013\u0000\u0000pq\u0003\u000e\u0007\u0000qr\u0005\u0014\u0000"+
		"\u0000rs\u0005\u0012\u0000\u0000s\r\u0001\u0000\u0000\u0000ty\u0005\u0011"+
		"\u0000\u0000uv\u0005\u0017\u0000\u0000vx\u0005\u0011\u0000\u0000wu\u0001"+
		"\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000"+
		"yz\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000"+
		"\u0000|t\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u000f\u0001"+
		"\u0000\u0000\u0000~\u007f\u0007\u0000\u0000\u0000\u007f\u0011\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0007\u0001\u0000\u0000\u0081\u0013\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0005\u0006\u0000\u0000\u0083\u0084\u0005\u0013"+
		"\u0000\u0000\u0084\u0085\u0003\u001c\u000e\u0000\u0085\u0086\u0005\u0014"+
		"\u0000\u0000\u0086\u008a\u0005\u0015\u0000\u0000\u0087\u0089\u0003\u0002"+
		"\u0001\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000"+
		"\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000"+
		"\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008d\u0091\u0005\u0016\u0000\u0000\u008e\u0090\u0003\u0016"+
		"\u000b\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000"+
		"\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092\u0015\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0005\u0007\u0000\u0000\u0095\u0099\u0005\u0015"+
		"\u0000\u0000\u0096\u0098\u0003\u0002\u0001\u0000\u0097\u0096\u0001\u0000"+
		"\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009c\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0016"+
		"\u0000\u0000\u009d\u0017\u0001\u0000\u0000\u0000\u009e\u009f\u0005\b\u0000"+
		"\u0000\u009f\u00a0\u0005\u0013\u0000\u0000\u00a0\u00a1\u0003\u001c\u000e"+
		"\u0000\u00a1\u00a2\u0005\u0014\u0000\u0000\u00a2\u00a6\u0005\u0015\u0000"+
		"\u0000\u00a3\u00a5\u0003\u0002\u0001\u0000\u00a4\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0016\u0000"+
		"\u0000\u00aa\u0019\u0001\u0000\u0000\u0000\u00ab\u00ac\u0003\u001e\u000f"+
		"\u0000\u00ac\u001b\u0001\u0000\u0000\u0000\u00ad\u00b1\u0003\u001e\u000f"+
		"\u0000\u00ae\u00b0\u0007\u0002\u0000\u0000\u00af\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u001d\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b9\u0003 \u0010\u0000"+
		"\u00b5\u00b6\u0005%\u0000\u0000\u00b6\u00b8\u0003 \u0010\u0000\u00b7\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u001f"+
		"\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00c1"+
		"\u0003\"\u0011\u0000\u00bd\u00be\u0005$\u0000\u0000\u00be\u00c0\u0003"+
		"\"\u0011\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c2!\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c9\u0003$\u0012\u0000\u00c5\u00c6\u0007\u0003\u0000\u0000"+
		"\u00c6\u00c8\u0003$\u0012\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8"+
		"\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0001\u0000\u0000\u0000\u00ca#\u0001\u0000\u0000\u0000\u00cb\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cc\u00d1\u0003&\u0013\u0000\u00cd\u00ce\u0007"+
		"\u0004\u0000\u0000\u00ce\u00d0\u0003&\u0013\u0000\u00cf\u00cd\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2%\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d9\u0003(\u0014\u0000"+
		"\u00d5\u00d6\u0007\u0005\u0000\u0000\u00d6\u00d8\u0003(\u0014\u0000\u00d7"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da"+
		"\'\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00e1"+
		"\u0003*\u0015\u0000\u00dd\u00de\u0007\u0006\u0000\u0000\u00de\u00e0\u0003"+
		"*\u0015\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e2)\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0007\u0005\u0000\u0000\u00e5\u00e8\u0003*\u0015\u0000"+
		"\u00e6\u00e8\u0003,\u0016\u0000\u00e7\u00e4\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e8+\u0001\u0000\u0000\u0000\u00e9\u00f1"+
		"\u0003.\u0017\u0000\u00ea\u00f1\u0005\n\u0000\u0000\u00eb\u00f1\u0005"+
		"\u0011\u0000\u0000\u00ec\u00ed\u0005\u0013\u0000\u0000\u00ed\u00ee\u0003"+
		"\u001a\r\u0000\u00ee\u00ef\u0005\u0014\u0000\u0000\u00ef\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f0\u00e9\u0001\u0000\u0000\u0000\u00f0\u00ea\u0001\u0000"+
		"\u0000\u0000\u00f0\u00eb\u0001\u0000\u0000\u0000\u00f0\u00ec\u0001\u0000"+
		"\u0000\u0000\u00f1-\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005&\u0000\u0000"+
		"\u00f3\u00f4\u0003,\u0016\u0000\u00f4/\u0001\u0000\u0000\u0000\u00f5\u00fa"+
		"\u00032\u0019\u0000\u00f6\u00f7\u0005\u0017\u0000\u0000\u00f7\u00f9\u0003"+
		"2\u0019\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fd\u00f5\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fe1\u0001\u0000\u0000\u0000\u00ff\u0100\u0003\u0010\b"+
		"\u0000\u0100\u0101\u0005\u0011\u0000\u0000\u01013\u0001\u0000\u0000\u0000"+
		"\u0102\u0103\u0005\t\u0000\u0000\u01035\u0001\u0000\u0000\u0000\u0016"+
		"9ENTiy|\u008a\u0091\u0099\u00a6\u00b1\u00b9\u00c1\u00c9\u00d1\u00d9\u00e1"+
		"\u00e7\u00f0\u00fa\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}