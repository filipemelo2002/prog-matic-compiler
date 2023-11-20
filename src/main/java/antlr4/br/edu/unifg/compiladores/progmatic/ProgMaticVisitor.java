// Generated from C:/Users/filip/OneDrive/Documentos/intelliJ/progmatic-compiler/src/main/java/antlr4/br/edu/unifg/compiladores/progmatic/ProgMatic.g4 by ANTLR 4.13.1
package antlr4.br.edu.unifg.compiladores.progmatic;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProgMaticParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProgMaticVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProgMaticParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ProgMaticParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgMaticParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(ProgMaticParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgMaticParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(ProgMaticParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgMaticParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(ProgMaticParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgMaticParser#attribution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribution(ProgMaticParser.AttributionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgMaticParser#pointerDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerDeclaration(ProgMaticParser.PointerDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgMaticParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(ProgMaticParser.ProcedureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgMaticParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(ProgMaticParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgMaticParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(ProgMaticParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgMaticParser#procedureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureCall(ProgMaticParser.ProcedureCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgMaticParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(ProgMaticParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgMaticParser#ifDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfDeclaration(ProgMaticParser.IfDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgMaticParser#loopDeclaraion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopDeclaraion(ProgMaticParser.LoopDeclaraionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgMaticParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(ProgMaticParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgMaticParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(ProgMaticParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgMaticParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(ProgMaticParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgMaticParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(ProgMaticParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgMaticParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(ProgMaticParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgMaticParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(ProgMaticParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgMaticParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(ProgMaticParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgMaticParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(ProgMaticParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgMaticParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(ProgMaticParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgMaticParser#logicalNotExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNotExpression(ProgMaticParser.LogicalNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgMaticParser#inputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStatement(ProgMaticParser.InputStatementContext ctx);
}