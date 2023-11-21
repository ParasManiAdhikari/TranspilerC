// Generated from C:/Users/paras/IdeaProjects/fsu-praktikum/src/main/grammars/syntaxgesteuerte/Calculator.g4 by ANTLR 4.13.1
package h4_calculator;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CalculatorParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CalculatorParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(CalculatorParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(CalculatorParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CalculatorParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CalculatorParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clear}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterClear(CalculatorParser.ClearContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clear}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitClear(CalculatorParser.ClearContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(CalculatorParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(CalculatorParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(CalculatorParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(CalculatorParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(CalculatorParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(CalculatorParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compare}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompare(CalculatorParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompare(CalculatorParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(CalculatorParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(CalculatorParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(CalculatorParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(CalculatorParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bedingte}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBedingte(CalculatorParser.BedingteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bedingte}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBedingte(CalculatorParser.BedingteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(CalculatorParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(CalculatorParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code power}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPower(CalculatorParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code power}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPower(CalculatorParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(CalculatorParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(CalculatorParser.IntContext ctx);
}