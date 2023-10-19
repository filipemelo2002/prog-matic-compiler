// Generated from C:/Users/filip/OneDrive/Documentos/intelliJ/progmatic-compiler/src/main/java/antlr4/br/edu/unifg/compiladores/progmatic/ProgMatic.g4 by ANTLR 4.13.1
package antlr4.br.edu.unifg.compiladores.progmatic;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProgMaticParser}.
 */
public interface ProgMaticListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ProgMaticParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ProgMaticParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(ProgMaticParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(ProgMaticParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ProgMaticParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ProgMaticParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#attribution}.
	 * @param ctx the parse tree
	 */
	void enterAttribution(ProgMaticParser.AttributionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#attribution}.
	 * @param ctx the parse tree
	 */
	void exitAttribution(ProgMaticParser.AttributionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#pointerDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPointerDeclaration(ProgMaticParser.PointerDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#pointerDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPointerDeclaration(ProgMaticParser.PointerDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(ProgMaticParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(ProgMaticParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#procedureCall}.
	 * @param ctx the parse tree
	 */
	void enterProcedureCall(ProgMaticParser.ProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#procedureCall}.
	 * @param ctx the parse tree
	 */
	void exitProcedureCall(ProgMaticParser.ProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(ProgMaticParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(ProgMaticParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(ProgMaticParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(ProgMaticParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#attributionValues}.
	 * @param ctx the parse tree
	 */
	void enterAttributionValues(ProgMaticParser.AttributionValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#attributionValues}.
	 * @param ctx the parse tree
	 */
	void exitAttributionValues(ProgMaticParser.AttributionValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#ifDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIfDeclaration(ProgMaticParser.IfDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#ifDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIfDeclaration(ProgMaticParser.IfDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#elseDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterElseDeclaration(ProgMaticParser.ElseDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#elseDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitElseDeclaration(ProgMaticParser.ElseDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#loopDeclaraion}.
	 * @param ctx the parse tree
	 */
	void enterLoopDeclaraion(ProgMaticParser.LoopDeclaraionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#loopDeclaraion}.
	 * @param ctx the parse tree
	 */
	void exitLoopDeclaraion(ProgMaticParser.LoopDeclaraionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ProgMaticParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ProgMaticParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(ProgMaticParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(ProgMaticParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(ProgMaticParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(ProgMaticParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(ProgMaticParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(ProgMaticParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(ProgMaticParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(ProgMaticParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(ProgMaticParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(ProgMaticParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(ProgMaticParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(ProgMaticParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(ProgMaticParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(ProgMaticParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(ProgMaticParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(ProgMaticParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(ProgMaticParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(ProgMaticParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#logicalNotExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNotExpression(ProgMaticParser.LogicalNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#logicalNotExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNotExpression(ProgMaticParser.LogicalNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(ProgMaticParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(ProgMaticParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(ProgMaticParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(ProgMaticParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgMaticParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(ProgMaticParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgMaticParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(ProgMaticParser.ProcedureContext ctx);
}