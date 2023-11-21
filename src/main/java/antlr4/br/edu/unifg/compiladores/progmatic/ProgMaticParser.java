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
		T__0=1, T__1=2, T__2=3, PRINT=4, READ=5, PROCEDURE=6, TYPE_DECLARATION=7, 
		INTEGER_LITERAL=8, STRING_LITERAL=9, CHAR_LITERAL=10, FLOAT_LITERAL=11, 
		BOOLEAN_LITERAL=12, POINTER=13, ADDRESS=14, IDENTIFIER=15, SEMICOLON=16, 
		LPAREN=17, RPAREN=18, LBRACE=19, RBRACE=20, COMMA=21, ATTRIBUTION=22, 
		PLUS=23, MINUS=24, MULTIPLY=25, DIVIDE=26, MODULO=27, GREATER=28, LESS=29, 
		EQUAL=30, NOT_EQUAL=31, GREATER_EQUAL=32, LESS_EQUAL=33, LOGICAL_AND=34, 
		LOGICAL_OR=35, LOGICAL_NOT=36, WS=37;
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_printStatement = 2, RULE_variableDeclaration = 3, 
		RULE_attribution = 4, RULE_pointerDeclaration = 5, RULE_procedureDeclaration = 6, 
		RULE_parameterList = 7, RULE_parameter = 8, RULE_procedureCall = 9, RULE_argumentList = 10, 
		RULE_ifDeclaration = 11, RULE_loopDeclaraion = 12, RULE_logicalExpression = 13, 
		RULE_logicalOrExpression = 14, RULE_logicalAndExpression = 15, RULE_equalityExpression = 16, 
		RULE_relationalExpression = 17, RULE_additiveExpression = 18, RULE_multiplicativeExpression = 19, 
		RULE_unaryExpression = 20, RULE_primaryExpression = 21, RULE_logicalNotExpression = 22, 
		RULE_inputStatement = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statements", "printStatement", "variableDeclaration", "attribution", 
			"pointerDeclaration", "procedureDeclaration", "parameterList", "parameter", 
			"procedureCall", "argumentList", "ifDeclaration", "loopDeclaraion", "logicalExpression", 
			"logicalOrExpression", "logicalAndExpression", "equalityExpression", 
			"relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "primaryExpression", "logicalNotExpression", "inputStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'loop'", "'print'", "'read'", "'func'", null, 
			null, null, null, null, null, "'->'", "'$'", null, "';'", "'('", "')'", 
			"'{'", "'}'", "','", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'>'", 
			"'<'", "'=='", "'!='", "'>='", "'<='", "'&&'", "'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "PRINT", "READ", "PROCEDURE", "TYPE_DECLARATION", 
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
			    
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33018L) != 0)) {
				{
				{
				setState(49);
				((ProgramContext)_localctx).statements = statements();
				body.add(((ProgramContext)_localctx).statements.node);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
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
		public VariableDeclarationContext variableDeclaration;
		public ProcedureDeclarationContext procedureDeclaration;
		public ProcedureCallContext procedureCall;
		public AttributionContext attribution;
		public IfDeclarationContext ifDeclaration;
		public LoopDeclaraionContext loopDeclaraion;
		public PrintStatementContext printStatement;
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
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				((StatementsContext)_localctx).variableDeclaration = variableDeclaration();
				((StatementsContext)_localctx).node =  ((StatementsContext)_localctx).variableDeclaration.node;
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
				((StatementsContext)_localctx).procedureDeclaration = procedureDeclaration();
				((StatementsContext)_localctx).node =  ((StatementsContext)_localctx).procedureDeclaration.node;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				((StatementsContext)_localctx).procedureCall = procedureCall();
				((StatementsContext)_localctx).node =  ((StatementsContext)_localctx).procedureCall.node;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				((StatementsContext)_localctx).attribution = attribution();
				((StatementsContext)_localctx).node =  ((StatementsContext)_localctx).attribution.node;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				((StatementsContext)_localctx).ifDeclaration = ifDeclaration();
				((StatementsContext)_localctx).node =  ((StatementsContext)_localctx).ifDeclaration.node;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(76);
				((StatementsContext)_localctx).loopDeclaraion = loopDeclaraion();
				((StatementsContext)_localctx).node =  ((StatementsContext)_localctx).loopDeclaraion.node;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(79);
				((StatementsContext)_localctx).printStatement = printStatement();
				((StatementsContext)_localctx).node =  ((StatementsContext)_localctx).printStatement.node;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(82);
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
	public static class PrintStatementContext extends ParserRuleContext {
		public ASTNode node;
		public LogicalExpressionContext logicalExpression;
		public TerminalNode PRINT() { return getToken(ProgMaticParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(ProgMaticParser.LPAREN, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ProgMaticParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(ProgMaticParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 4, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(PRINT);
			setState(86);
			match(LPAREN);
			setState(87);
			((PrintStatementContext)_localctx).logicalExpression = logicalExpression();
			setState(88);
			match(RPAREN);
			setState(89);
			match(SEMICOLON);
			((PrintStatementContext)_localctx).node =  new PrintExpression(((PrintStatementContext)_localctx).logicalExpression.node);
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
		public ASTNode node;
		public Token TYPE_DECLARATION;
		public Token IDENTIFIER;
		public LogicalExpressionContext logicalExpression;
		public TerminalNode TYPE_DECLARATION() { return getToken(ProgMaticParser.TYPE_DECLARATION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ProgMaticParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(ProgMaticParser.SEMICOLON, 0); }
		public TerminalNode ATTRIBUTION() { return getToken(ProgMaticParser.ATTRIBUTION, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
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
		enterRule(_localctx, 6, RULE_variableDeclaration);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				((VariableDeclarationContext)_localctx).TYPE_DECLARATION = match(TYPE_DECLARATION);
				setState(93);
				((VariableDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(94);
				match(SEMICOLON);
				((VariableDeclarationContext)_localctx).node =  new VarDeclaration((((VariableDeclarationContext)_localctx).TYPE_DECLARATION!=null?((VariableDeclarationContext)_localctx).TYPE_DECLARATION.getText():null), (((VariableDeclarationContext)_localctx).IDENTIFIER!=null?((VariableDeclarationContext)_localctx).IDENTIFIER.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				((VariableDeclarationContext)_localctx).TYPE_DECLARATION = match(TYPE_DECLARATION);
				setState(97);
				((VariableDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(98);
				match(ATTRIBUTION);
				setState(99);
				((VariableDeclarationContext)_localctx).logicalExpression = logicalExpression();
				setState(100);
				match(SEMICOLON);
				((VariableDeclarationContext)_localctx).node =  new VarDeclaration((((VariableDeclarationContext)_localctx).TYPE_DECLARATION!=null?((VariableDeclarationContext)_localctx).TYPE_DECLARATION.getText():null), (((VariableDeclarationContext)_localctx).IDENTIFIER!=null?((VariableDeclarationContext)_localctx).IDENTIFIER.getText():null), ((VariableDeclarationContext)_localctx).logicalExpression.node);
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
		public ASTNode node;
		public Token IDENTIFIER;
		public LogicalExpressionContext logicalExpression;
		public TerminalNode IDENTIFIER() { return getToken(ProgMaticParser.IDENTIFIER, 0); }
		public TerminalNode ATTRIBUTION() { return getToken(ProgMaticParser.ATTRIBUTION, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ProgMaticParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 8, RULE_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			((AttributionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(106);
			match(ATTRIBUTION);
			setState(107);
			((AttributionContext)_localctx).logicalExpression = logicalExpression();
			setState(108);
			match(SEMICOLON);
			((AttributionContext)_localctx).node =  new VarAttribution((((AttributionContext)_localctx).IDENTIFIER!=null?((AttributionContext)_localctx).IDENTIFIER.getText():null), ((AttributionContext)_localctx).logicalExpression.node);
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
		public TerminalNode TYPE_DECLARATION() { return getToken(ProgMaticParser.TYPE_DECLARATION, 0); }
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
		enterRule(_localctx, 10, RULE_pointerDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(TYPE_DECLARATION);
			setState(112);
			match(POINTER);
			setState(113);
			match(IDENTIFIER);
			setState(114);
			match(ATTRIBUTION);
			setState(115);
			match(ADDRESS);
			setState(116);
			match(IDENTIFIER);
			setState(117);
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
		public ASTNode node;
		public Token IDENTIFIER;
		public ParameterListContext parameterList;
		public StatementsContext statements;
		public TerminalNode PROCEDURE() { return getToken(ProgMaticParser.PROCEDURE, 0); }
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
		enterRule(_localctx, 12, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        List<ASTNode> body = new ArrayList<ASTNode>();
			        Map<String, Object> localSymbolTable = new HashMap<String, Object>();
			    
			setState(120);
			match(PROCEDURE);
			setState(121);
			((ProcedureDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(122);
			match(LPAREN);
			setState(123);
			((ProcedureDeclarationContext)_localctx).parameterList = parameterList();
			setState(124);
			match(RPAREN);
			setState(125);
			match(LBRACE);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33018L) != 0)) {
				{
				{
				setState(126);
				((ProcedureDeclarationContext)_localctx).statements = statements();
				body.add(((ProcedureDeclarationContext)_localctx).statements.node);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(RBRACE);

			        ((ProcedureDeclarationContext)_localctx).node =  new ProcedureDeclaration((((ProcedureDeclarationContext)_localctx).IDENTIFIER!=null?((ProcedureDeclarationContext)_localctx).IDENTIFIER.getText():null), ((ProcedureDeclarationContext)_localctx).parameterList.list,body, localSymbolTable);
			    
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
		public List<Parameter> list;
		public ParameterContext p1;
		public ParameterContext p2;
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
		enterRule(_localctx, 14, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<Parameter> paramsList = new ArrayList<Parameter>();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE_DECLARATION) {
				{
				setState(138);
				((ParameterListContext)_localctx).p1 = parameter();
				paramsList.add(((ParameterListContext)_localctx).p1.param);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(140);
					match(COMMA);
					setState(141);
					((ParameterListContext)_localctx).p2 = parameter();
					paramsList.add(((ParameterListContext)_localctx).p2.param);
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			((ParameterListContext)_localctx).list =  paramsList;
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
		public Parameter param;
		public Token TYPE_DECLARATION;
		public Token IDENTIFIER;
		public TerminalNode TYPE_DECLARATION() { return getToken(ProgMaticParser.TYPE_DECLARATION, 0); }
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
		enterRule(_localctx, 16, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			((ParameterContext)_localctx).TYPE_DECLARATION = match(TYPE_DECLARATION);
			setState(154);
			((ParameterContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			((ParameterContext)_localctx).param =  new Parameter((((ParameterContext)_localctx).TYPE_DECLARATION!=null?((ParameterContext)_localctx).TYPE_DECLARATION.getText():null), (((ParameterContext)_localctx).IDENTIFIER!=null?((ParameterContext)_localctx).IDENTIFIER.getText():null), null);
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
		public ASTNode node;
		public Token IDENTIFIER;
		public ArgumentListContext argumentList;
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
		enterRule(_localctx, 18, RULE_procedureCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			((ProcedureCallContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(158);
			match(LPAREN);
			setState(159);
			((ProcedureCallContext)_localctx).argumentList = argumentList();
			setState(160);
			match(RPAREN);
			((ProcedureCallContext)_localctx).node =  new ProcedureCall((((ProcedureCallContext)_localctx).IDENTIFIER!=null?((ProcedureCallContext)_localctx).IDENTIFIER.getText():null), ((ProcedureCallContext)_localctx).argumentList.list);
			setState(162);
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
		public List<ASTNode> list;
		public LogicalExpressionContext a1;
		public LogicalExpressionContext a2;
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
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
		enterRule(_localctx, 20, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<ASTNode> args = new ArrayList<ASTNode>();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68744814336L) != 0)) {
				{
				setState(165);
				((ArgumentListContext)_localctx).a1 = logicalExpression();
				args.add(((ArgumentListContext)_localctx).a1.node);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(167);
					match(COMMA);
					setState(168);
					((ArgumentListContext)_localctx).a2 = logicalExpression();
					args.add(((ArgumentListContext)_localctx).a2.node);
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			((ArgumentListContext)_localctx).list =  args;
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
		public ASTNode node;
		public LogicalExpressionContext logicalExpression;
		public StatementsContext s1;
		public StatementsContext s2;
		public TerminalNode LPAREN() { return getToken(ProgMaticParser.LPAREN, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ProgMaticParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(ProgMaticParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(ProgMaticParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(ProgMaticParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(ProgMaticParser.RBRACE, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
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
		enterRule(_localctx, 22, RULE_ifDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__0);
			setState(181);
			match(LPAREN);
			setState(182);
			((IfDeclarationContext)_localctx).logicalExpression = logicalExpression();
			setState(183);
			match(RPAREN);

			        List<ASTNode> ifBody = new ArrayList<ASTNode>();
			        List<ASTNode> elseBody = new ArrayList<ASTNode>();
			    
			setState(185);
			match(LBRACE);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33018L) != 0)) {
				{
				{
				setState(186);
				((IfDeclarationContext)_localctx).s1 = statements();
				ifBody.add(((IfDeclarationContext)_localctx).s1.node);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			match(RBRACE);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(195);
				match(T__1);
				setState(196);
				match(LBRACE);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33018L) != 0)) {
					{
					{
					setState(197);
					((IfDeclarationContext)_localctx).s2 = statements();
					elseBody.add(((IfDeclarationContext)_localctx).s2.node);
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(205);
				match(RBRACE);
				}
			}


			        ((IfDeclarationContext)_localctx).node =  new IfExpression(ifBody, elseBody, ((IfDeclarationContext)_localctx).logicalExpression.node);
			    
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
		public ASTNode node;
		public LogicalExpressionContext logicalExpression;
		public StatementsContext s1;
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
			setState(210);
			match(T__2);
			setState(211);
			match(LPAREN);
			setState(212);
			((LoopDeclaraionContext)_localctx).logicalExpression = logicalExpression();
			setState(213);
			match(RPAREN);

			        List<ASTNode> body = new ArrayList<ASTNode>();
			    
			setState(215);
			match(LBRACE);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33018L) != 0)) {
				{
				{
				setState(216);
				((LoopDeclaraionContext)_localctx).s1 = statements();
				body.add(((LoopDeclaraionContext)_localctx).s1.node);
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
			match(RBRACE);

			        ((LoopDeclaraionContext)_localctx).node =  new Loop(((LoopDeclaraionContext)_localctx).logicalExpression.node, body);
			    
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
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			((LogicalExpressionContext)_localctx).logicalOrExpression = logicalOrExpression();
			((LogicalExpressionContext)_localctx).node =  ((LogicalExpressionContext)_localctx).logicalOrExpression.node;
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
			setState(230);
			((LogicalOrExpressionContext)_localctx).logicalAndExpression = logicalAndExpression();
			((LogicalOrExpressionContext)_localctx).node =  ((LogicalOrExpressionContext)_localctx).logicalAndExpression.node;
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_OR) {
				{
				{
				setState(232);
				match(LOGICAL_OR);
				setState(233);
				((LogicalOrExpressionContext)_localctx).right = ((LogicalOrExpressionContext)_localctx).logicalAndExpression = logicalAndExpression();
				((LogicalOrExpressionContext)_localctx).node =  new LogicalOr(_localctx.node, ((LogicalOrExpressionContext)_localctx).right.node);
				}
				}
				setState(240);
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
			setState(241);
			((LogicalAndExpressionContext)_localctx).equalityExpression = equalityExpression();
			((LogicalAndExpressionContext)_localctx).node =  ((LogicalAndExpressionContext)_localctx).equalityExpression.node;
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_AND) {
				{
				{
				setState(243);
				match(LOGICAL_AND);
				setState(244);
				((LogicalAndExpressionContext)_localctx).right = ((LogicalAndExpressionContext)_localctx).equalityExpression = equalityExpression();
				((LogicalAndExpressionContext)_localctx).node =  new LogicalAnd(_localctx.node, ((LogicalAndExpressionContext)_localctx).right.node);
				}
				}
				setState(251);
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
			setState(252);
			((EqualityExpressionContext)_localctx).relationalExpression = relationalExpression();
			((EqualityExpressionContext)_localctx).node =  ((EqualityExpressionContext)_localctx).relationalExpression.node;
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOT_EQUAL) {
				{
				{
				setState(254);
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
				setState(255);
				((EqualityExpressionContext)_localctx).right = ((EqualityExpressionContext)_localctx).relationalExpression = relationalExpression();
				((EqualityExpressionContext)_localctx).node =  new EqualityExpression(_localctx.node, ((EqualityExpressionContext)_localctx).right.node, (((EqualityExpressionContext)_localctx).operator!=null?((EqualityExpressionContext)_localctx).operator.getText():null));
				}
				}
				setState(262);
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
			setState(263);
			((RelationalExpressionContext)_localctx).additiveExpression = additiveExpression();
			((RelationalExpressionContext)_localctx).node =  ((RelationalExpressionContext)_localctx).additiveExpression.node;
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13690208256L) != 0)) {
				{
				{
				setState(265);
				((RelationalExpressionContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 13690208256L) != 0)) ) {
					((RelationalExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(266);
				((RelationalExpressionContext)_localctx).right = ((RelationalExpressionContext)_localctx).additiveExpression = additiveExpression();
				((RelationalExpressionContext)_localctx).node =  new RelationalExpression(_localctx.node, ((RelationalExpressionContext)_localctx).right.node, (((RelationalExpressionContext)_localctx).operator!=null?((RelationalExpressionContext)_localctx).operator.getText():null));
				}
				}
				setState(273);
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
			setState(274);
			((AdditiveExpressionContext)_localctx).multiplicativeExpression = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).node =  ((AdditiveExpressionContext)_localctx).multiplicativeExpression.node;
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(276);
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
				setState(277);
				((AdditiveExpressionContext)_localctx).right = ((AdditiveExpressionContext)_localctx).multiplicativeExpression = multiplicativeExpression();
				((AdditiveExpressionContext)_localctx).node =  new AdditiveExpression(_localctx.node, ((AdditiveExpressionContext)_localctx).right.node, (((AdditiveExpressionContext)_localctx).operator!=null?((AdditiveExpressionContext)_localctx).operator.getText():null));
				}
				}
				setState(284);
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
			setState(285);
			((MultiplicativeExpressionContext)_localctx).unaryExpression = unaryExpression();
			((MultiplicativeExpressionContext)_localctx).node =  ((MultiplicativeExpressionContext)_localctx).unaryExpression.node;
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 234881024L) != 0)) {
				{
				{
				setState(287);
				((MultiplicativeExpressionContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 234881024L) != 0)) ) {
					((MultiplicativeExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(288);
				((MultiplicativeExpressionContext)_localctx).right = ((MultiplicativeExpressionContext)_localctx).unaryExpression = unaryExpression();
				((MultiplicativeExpressionContext)_localctx).node =  new MultiplicativeExpression(_localctx.node, ((MultiplicativeExpressionContext)_localctx).right.node, (((MultiplicativeExpressionContext)_localctx).operator!=null?((MultiplicativeExpressionContext)_localctx).operator.getText():null));
				}
				}
				setState(295);
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
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
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
				setState(297);
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
				setState(300);
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
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOGICAL_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				((PrimaryExpressionContext)_localctx).logicalNotExpression = logicalNotExpression();
				((PrimaryExpressionContext)_localctx).node =  ((PrimaryExpressionContext)_localctx).logicalNotExpression.node;
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				((PrimaryExpressionContext)_localctx).INTEGER_LITERAL = match(INTEGER_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant(Integer.parseInt((((PrimaryExpressionContext)_localctx).INTEGER_LITERAL!=null?((PrimaryExpressionContext)_localctx).INTEGER_LITERAL.getText():null)));
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL = match(BOOLEAN_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant(Boolean.parseBoolean((((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL!=null?((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL.getText():null)));
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(312);
				((PrimaryExpressionContext)_localctx).CHAR_LITERAL = match(CHAR_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant((((PrimaryExpressionContext)_localctx).CHAR_LITERAL!=null?((PrimaryExpressionContext)_localctx).CHAR_LITERAL.getText():null).charAt(1));
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(314);
				((PrimaryExpressionContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant((((PrimaryExpressionContext)_localctx).STRING_LITERAL!=null?((PrimaryExpressionContext)_localctx).STRING_LITERAL.getText():null).substring(1, (((PrimaryExpressionContext)_localctx).STRING_LITERAL!=null?((PrimaryExpressionContext)_localctx).STRING_LITERAL.getText():null).length() - 1));
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(316);
				((PrimaryExpressionContext)_localctx).FLOAT_LITERAL = match(FLOAT_LITERAL);
				((PrimaryExpressionContext)_localctx).node =  new Constant(Float.parseFloat((((PrimaryExpressionContext)_localctx).FLOAT_LITERAL!=null?((PrimaryExpressionContext)_localctx).FLOAT_LITERAL.getText():null)));
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 7);
				{
				setState(318);
				((PrimaryExpressionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((PrimaryExpressionContext)_localctx).node =  new VarRef((((PrimaryExpressionContext)_localctx).IDENTIFIER!=null?((PrimaryExpressionContext)_localctx).IDENTIFIER.getText():null));
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 8);
				{
				setState(320);
				match(LPAREN);
				setState(321);
				((PrimaryExpressionContext)_localctx).expr = logicalOrExpression();
				setState(322);
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
			setState(327);
			match(LOGICAL_NOT);
			setState(328);
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
	public static class InputStatementContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(ProgMaticParser.READ, 0); }
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
		enterRule(_localctx, 46, RULE_inputStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(READ);
			setState(332);
			match(LPAREN);
			setState(333);
			match(IDENTIFIER);
			setState(334);
			match(RPAREN);
			setState(335);
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

	public static final String _serializedATN =
		"\u0004\u0001%\u0152\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u00005\b\u0000\n\u0000\f\u00008\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001T\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003h\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u0082\b\u0006\n\u0006\f\u0006\u0085\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0091\b\u0007\n\u0007\f\u0007"+
		"\u0094\t\u0007\u0003\u0007\u0096\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00ac\b\n\n\n\f\n\u00af\t\n\u0003\n\u00b1\b\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00be\b\u000b\n\u000b\f\u000b"+
		"\u00c1\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00c9\b\u000b\n\u000b\f\u000b\u00cc\t\u000b\u0001"+
		"\u000b\u0003\u000b\u00cf\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00dc"+
		"\b\f\n\f\f\f\u00df\t\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u00ed\b\u000e\n\u000e\f\u000e\u00f0\t\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00f8"+
		"\b\u000f\n\u000f\f\u000f\u00fb\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0103\b\u0010\n\u0010"+
		"\f\u0010\u0106\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u010e\b\u0011\n\u0011\f\u0011\u0111"+
		"\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u0119\b\u0012\n\u0012\f\u0012\u011c\t\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u0124\b\u0013\n\u0013\f\u0013\u0127\t\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0130"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0146\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.\u0000\u0004\u0001\u0000\u001e\u001f\u0002\u0000\u001c\u001d"+
		" !\u0001\u0000\u0017\u0018\u0001\u0000\u0019\u001b\u015a\u00000\u0001"+
		"\u0000\u0000\u0000\u0002S\u0001\u0000\u0000\u0000\u0004U\u0001\u0000\u0000"+
		"\u0000\u0006g\u0001\u0000\u0000\u0000\bi\u0001\u0000\u0000\u0000\no\u0001"+
		"\u0000\u0000\u0000\fw\u0001\u0000\u0000\u0000\u000e\u0089\u0001\u0000"+
		"\u0000\u0000\u0010\u0099\u0001\u0000\u0000\u0000\u0012\u009d\u0001\u0000"+
		"\u0000\u0000\u0014\u00a4\u0001\u0000\u0000\u0000\u0016\u00b4\u0001\u0000"+
		"\u0000\u0000\u0018\u00d2\u0001\u0000\u0000\u0000\u001a\u00e3\u0001\u0000"+
		"\u0000\u0000\u001c\u00e6\u0001\u0000\u0000\u0000\u001e\u00f1\u0001\u0000"+
		"\u0000\u0000 \u00fc\u0001\u0000\u0000\u0000\"\u0107\u0001\u0000\u0000"+
		"\u0000$\u0112\u0001\u0000\u0000\u0000&\u011d\u0001\u0000\u0000\u0000("+
		"\u012f\u0001\u0000\u0000\u0000*\u0145\u0001\u0000\u0000\u0000,\u0147\u0001"+
		"\u0000\u0000\u0000.\u014b\u0001\u0000\u0000\u000006\u0006\u0000\uffff"+
		"\uffff\u000012\u0003\u0002\u0001\u000023\u0006\u0000\uffff\uffff\u0000"+
		"35\u0001\u0000\u0000\u000041\u0001\u0000\u0000\u000058\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000079\u0001\u0000"+
		"\u0000\u000086\u0001\u0000\u0000\u00009:\u0005\u0000\u0000\u0001:;\u0006"+
		"\u0000\uffff\uffff\u0000;\u0001\u0001\u0000\u0000\u0000<=\u0003\u0006"+
		"\u0003\u0000=>\u0006\u0001\uffff\uffff\u0000>T\u0001\u0000\u0000\u0000"+
		"?T\u0003\n\u0005\u0000@A\u0003\f\u0006\u0000AB\u0006\u0001\uffff\uffff"+
		"\u0000BT\u0001\u0000\u0000\u0000CD\u0003\u0012\t\u0000DE\u0006\u0001\uffff"+
		"\uffff\u0000ET\u0001\u0000\u0000\u0000FG\u0003\b\u0004\u0000GH\u0006\u0001"+
		"\uffff\uffff\u0000HT\u0001\u0000\u0000\u0000IJ\u0003\u0016\u000b\u0000"+
		"JK\u0006\u0001\uffff\uffff\u0000KT\u0001\u0000\u0000\u0000LM\u0003\u0018"+
		"\f\u0000MN\u0006\u0001\uffff\uffff\u0000NT\u0001\u0000\u0000\u0000OP\u0003"+
		"\u0004\u0002\u0000PQ\u0006\u0001\uffff\uffff\u0000QT\u0001\u0000\u0000"+
		"\u0000RT\u0003.\u0017\u0000S<\u0001\u0000\u0000\u0000S?\u0001\u0000\u0000"+
		"\u0000S@\u0001\u0000\u0000\u0000SC\u0001\u0000\u0000\u0000SF\u0001\u0000"+
		"\u0000\u0000SI\u0001\u0000\u0000\u0000SL\u0001\u0000\u0000\u0000SO\u0001"+
		"\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000T\u0003\u0001\u0000\u0000"+
		"\u0000UV\u0005\u0004\u0000\u0000VW\u0005\u0011\u0000\u0000WX\u0003\u001a"+
		"\r\u0000XY\u0005\u0012\u0000\u0000YZ\u0005\u0010\u0000\u0000Z[\u0006\u0002"+
		"\uffff\uffff\u0000[\u0005\u0001\u0000\u0000\u0000\\]\u0005\u0007\u0000"+
		"\u0000]^\u0005\u000f\u0000\u0000^_\u0005\u0010\u0000\u0000_h\u0006\u0003"+
		"\uffff\uffff\u0000`a\u0005\u0007\u0000\u0000ab\u0005\u000f\u0000\u0000"+
		"bc\u0005\u0016\u0000\u0000cd\u0003\u001a\r\u0000de\u0005\u0010\u0000\u0000"+
		"ef\u0006\u0003\uffff\uffff\u0000fh\u0001\u0000\u0000\u0000g\\\u0001\u0000"+
		"\u0000\u0000g`\u0001\u0000\u0000\u0000h\u0007\u0001\u0000\u0000\u0000"+
		"ij\u0005\u000f\u0000\u0000jk\u0005\u0016\u0000\u0000kl\u0003\u001a\r\u0000"+
		"lm\u0005\u0010\u0000\u0000mn\u0006\u0004\uffff\uffff\u0000n\t\u0001\u0000"+
		"\u0000\u0000op\u0005\u0007\u0000\u0000pq\u0005\r\u0000\u0000qr\u0005\u000f"+
		"\u0000\u0000rs\u0005\u0016\u0000\u0000st\u0005\u000e\u0000\u0000tu\u0005"+
		"\u000f\u0000\u0000uv\u0005\u0010\u0000\u0000v\u000b\u0001\u0000\u0000"+
		"\u0000wx\u0006\u0006\uffff\uffff\u0000xy\u0005\u0006\u0000\u0000yz\u0005"+
		"\u000f\u0000\u0000z{\u0005\u0011\u0000\u0000{|\u0003\u000e\u0007\u0000"+
		"|}\u0005\u0012\u0000\u0000}\u0083\u0005\u0013\u0000\u0000~\u007f\u0003"+
		"\u0002\u0001\u0000\u007f\u0080\u0006\u0006\uffff\uffff\u0000\u0080\u0082"+
		"\u0001\u0000\u0000\u0000\u0081~\u0001\u0000\u0000\u0000\u0082\u0085\u0001"+
		"\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0005\u0014\u0000\u0000\u0087\u0088\u0006"+
		"\u0006\uffff\uffff\u0000\u0088\r\u0001\u0000\u0000\u0000\u0089\u0095\u0006"+
		"\u0007\uffff\uffff\u0000\u008a\u008b\u0003\u0010\b\u0000\u008b\u0092\u0006"+
		"\u0007\uffff\uffff\u0000\u008c\u008d\u0005\u0015\u0000\u0000\u008d\u008e"+
		"\u0003\u0010\b\u0000\u008e\u008f\u0006\u0007\uffff\uffff\u0000\u008f\u0091"+
		"\u0001\u0000\u0000\u0000\u0090\u008c\u0001\u0000\u0000\u0000\u0091\u0094"+
		"\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0095\u008a\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0006\u0007\uffff\uffff\u0000\u0098\u000f\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0005\u0007\u0000\u0000\u009a\u009b\u0005\u000f\u0000\u0000\u009b"+
		"\u009c\u0006\b\uffff\uffff\u0000\u009c\u0011\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0005\u000f\u0000\u0000\u009e\u009f\u0005\u0011\u0000\u0000\u009f"+
		"\u00a0\u0003\u0014\n\u0000\u00a0\u00a1\u0005\u0012\u0000\u0000\u00a1\u00a2"+
		"\u0006\t\uffff\uffff\u0000\u00a2\u00a3\u0005\u0010\u0000\u0000\u00a3\u0013"+
		"\u0001\u0000\u0000\u0000\u00a4\u00b0\u0006\n\uffff\uffff\u0000\u00a5\u00a6"+
		"\u0003\u001a\r\u0000\u00a6\u00ad\u0006\n\uffff\uffff\u0000\u00a7\u00a8"+
		"\u0005\u0015\u0000\u0000\u00a8\u00a9\u0003\u001a\r\u0000\u00a9\u00aa\u0006"+
		"\n\uffff\uffff\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a7\u0001"+
		"\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001"+
		"\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00a5\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0006\n\uffff\uffff\u0000\u00b3\u0015\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0005\u0001\u0000\u0000\u00b5\u00b6\u0005"+
		"\u0011\u0000\u0000\u00b6\u00b7\u0003\u001a\r\u0000\u00b7\u00b8\u0005\u0012"+
		"\u0000\u0000\u00b8\u00b9\u0006\u000b\uffff\uffff\u0000\u00b9\u00bf\u0005"+
		"\u0013\u0000\u0000\u00ba\u00bb\u0003\u0002\u0001\u0000\u00bb\u00bc\u0006"+
		"\u000b\uffff\uffff\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00ba"+
		"\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00ce"+
		"\u0005\u0014\u0000\u0000\u00c3\u00c4\u0005\u0002\u0000\u0000\u00c4\u00ca"+
		"\u0005\u0013\u0000\u0000\u00c5\u00c6\u0003\u0002\u0001\u0000\u00c6\u00c7"+
		"\u0006\u000b\uffff\uffff\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd"+
		"\u00cf\u0005\u0014\u0000\u0000\u00ce\u00c3\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0006\u000b\uffff\uffff\u0000\u00d1\u0017\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0005\u0003\u0000\u0000\u00d3\u00d4\u0005\u0011\u0000\u0000"+
		"\u00d4\u00d5\u0003\u001a\r\u0000\u00d5\u00d6\u0005\u0012\u0000\u0000\u00d6"+
		"\u00d7\u0006\f\uffff\uffff\u0000\u00d7\u00dd\u0005\u0013\u0000\u0000\u00d8"+
		"\u00d9\u0003\u0002\u0001\u0000\u00d9\u00da\u0006\f\uffff\uffff\u0000\u00da"+
		"\u00dc\u0001\u0000\u0000\u0000\u00db\u00d8\u0001\u0000\u0000\u0000\u00dc"+
		"\u00df\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0001\u0000\u0000\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df"+
		"\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0014\u0000\u0000\u00e1"+
		"\u00e2\u0006\f\uffff\uffff\u0000\u00e2\u0019\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e4\u0003\u001c\u000e\u0000\u00e4\u00e5\u0006\r\uffff\uffff\u0000\u00e5"+
		"\u001b\u0001\u0000\u0000\u0000\u00e6\u00e7\u0003\u001e\u000f\u0000\u00e7"+
		"\u00ee\u0006\u000e\uffff\uffff\u0000\u00e8\u00e9\u0005#\u0000\u0000\u00e9"+
		"\u00ea\u0003\u001e\u000f\u0000\u00ea\u00eb\u0006\u000e\uffff\uffff\u0000"+
		"\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00e8\u0001\u0000\u0000\u0000"+
		"\u00ed\u00f0\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u001d\u0001\u0000\u0000\u0000"+
		"\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f2\u0003 \u0010\u0000\u00f2"+
		"\u00f9\u0006\u000f\uffff\uffff\u0000\u00f3\u00f4\u0005\"\u0000\u0000\u00f4"+
		"\u00f5\u0003 \u0010\u0000\u00f5\u00f6\u0006\u000f\uffff\uffff\u0000\u00f6"+
		"\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f3\u0001\u0000\u0000\u0000\u00f8"+
		"\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fa\u001f\u0001\u0000\u0000\u0000\u00fb"+
		"\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fd\u0003\"\u0011\u0000\u00fd\u0104"+
		"\u0006\u0010\uffff\uffff\u0000\u00fe\u00ff\u0007\u0000\u0000\u0000\u00ff"+
		"\u0100\u0003\"\u0011\u0000\u0100\u0101\u0006\u0010\uffff\uffff\u0000\u0101"+
		"\u0103\u0001\u0000\u0000\u0000\u0102\u00fe\u0001\u0000\u0000\u0000\u0103"+
		"\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0001\u0000\u0000\u0000\u0105!\u0001\u0000\u0000\u0000\u0106\u0104"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\u0003$\u0012\u0000\u0108\u010f\u0006"+
		"\u0011\uffff\uffff\u0000\u0109\u010a\u0007\u0001\u0000\u0000\u010a\u010b"+
		"\u0003$\u0012\u0000\u010b\u010c\u0006\u0011\uffff\uffff\u0000\u010c\u010e"+
		"\u0001\u0000\u0000\u0000\u010d\u0109\u0001\u0000\u0000\u0000\u010e\u0111"+
		"\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u0001\u0000\u0000\u0000\u0110#\u0001\u0000\u0000\u0000\u0111\u010f\u0001"+
		"\u0000\u0000\u0000\u0112\u0113\u0003&\u0013\u0000\u0113\u011a\u0006\u0012"+
		"\uffff\uffff\u0000\u0114\u0115\u0007\u0002\u0000\u0000\u0115\u0116\u0003"+
		"&\u0013\u0000\u0116\u0117\u0006\u0012\uffff\uffff\u0000\u0117\u0119\u0001"+
		"\u0000\u0000\u0000\u0118\u0114\u0001\u0000\u0000\u0000\u0119\u011c\u0001"+
		"\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001"+
		"\u0000\u0000\u0000\u011b%\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0003(\u0014\u0000\u011e\u0125\u0006\u0013\uffff"+
		"\uffff\u0000\u011f\u0120\u0007\u0003\u0000\u0000\u0120\u0121\u0003(\u0014"+
		"\u0000\u0121\u0122\u0006\u0013\uffff\uffff\u0000\u0122\u0124\u0001\u0000"+
		"\u0000\u0000\u0123\u011f\u0001\u0000\u0000\u0000\u0124\u0127\u0001\u0000"+
		"\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000"+
		"\u0000\u0000\u0126\'\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000"+
		"\u0000\u0128\u0129\u0007\u0002\u0000\u0000\u0129\u012a\u0003(\u0014\u0000"+
		"\u012a\u012b\u0006\u0014\uffff\uffff\u0000\u012b\u0130\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0003*\u0015\u0000\u012d\u012e\u0006\u0014\uffff\uffff"+
		"\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u0128\u0001\u0000\u0000"+
		"\u0000\u012f\u012c\u0001\u0000\u0000\u0000\u0130)\u0001\u0000\u0000\u0000"+
		"\u0131\u0132\u0003,\u0016\u0000\u0132\u0133\u0006\u0015\uffff\uffff\u0000"+
		"\u0133\u0146\u0001\u0000\u0000\u0000\u0134\u0135\u0005\b\u0000\u0000\u0135"+
		"\u0146\u0006\u0015\uffff\uffff\u0000\u0136\u0137\u0005\f\u0000\u0000\u0137"+
		"\u0146\u0006\u0015\uffff\uffff\u0000\u0138\u0139\u0005\n\u0000\u0000\u0139"+
		"\u0146\u0006\u0015\uffff\uffff\u0000\u013a\u013b\u0005\t\u0000\u0000\u013b"+
		"\u0146\u0006\u0015\uffff\uffff\u0000\u013c\u013d\u0005\u000b\u0000\u0000"+
		"\u013d\u0146\u0006\u0015\uffff\uffff\u0000\u013e\u013f\u0005\u000f\u0000"+
		"\u0000\u013f\u0146\u0006\u0015\uffff\uffff\u0000\u0140\u0141\u0005\u0011"+
		"\u0000\u0000\u0141\u0142\u0003\u001c\u000e\u0000\u0142\u0143\u0005\u0012"+
		"\u0000\u0000\u0143\u0144\u0006\u0015\uffff\uffff\u0000\u0144\u0146\u0001"+
		"\u0000\u0000\u0000\u0145\u0131\u0001\u0000\u0000\u0000\u0145\u0134\u0001"+
		"\u0000\u0000\u0000\u0145\u0136\u0001\u0000\u0000\u0000\u0145\u0138\u0001"+
		"\u0000\u0000\u0000\u0145\u013a\u0001\u0000\u0000\u0000\u0145\u013c\u0001"+
		"\u0000\u0000\u0000\u0145\u013e\u0001\u0000\u0000\u0000\u0145\u0140\u0001"+
		"\u0000\u0000\u0000\u0146+\u0001\u0000\u0000\u0000\u0147\u0148\u0005$\u0000"+
		"\u0000\u0148\u0149\u0003*\u0015\u0000\u0149\u014a\u0006\u0016\uffff\uffff"+
		"\u0000\u014a-\u0001\u0000\u0000\u0000\u014b\u014c\u0005\u0005\u0000\u0000"+
		"\u014c\u014d\u0005\u0011\u0000\u0000\u014d\u014e\u0005\u000f\u0000\u0000"+
		"\u014e\u014f\u0005\u0012\u0000\u0000\u014f\u0150\u0005\u0010\u0000\u0000"+
		"\u0150/\u0001\u0000\u0000\u0000\u00146Sg\u0083\u0092\u0095\u00ad\u00b0"+
		"\u00bf\u00ca\u00ce\u00dd\u00ee\u00f9\u0104\u010f\u011a\u0125\u012f\u0145";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}