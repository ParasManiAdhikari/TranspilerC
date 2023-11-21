// Generated from C:/Users/paras/IdeaProjects/fsu-praktikum/src/main/grammars/syntaxgesteuerte/Calculator.g4 by ANTLR 4.13.1
package h4_calculator;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CalculatorParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(CalculatorParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(CalculatorParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clear}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClear(CalculatorParser.ClearContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse(CalculatorParser.IfelseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(CalculatorParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(CalculatorParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(CalculatorParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(CalculatorParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(CalculatorParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bedingte}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBedingte(CalculatorParser.BedingteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(CalculatorParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code power}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(CalculatorParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(CalculatorParser.IntContext ctx);
}