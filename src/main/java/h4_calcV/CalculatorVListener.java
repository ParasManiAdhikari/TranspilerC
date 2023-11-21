// Generated from C:/Users/paras/IdeaProjects/fsu-praktikum/src/main/grammars/syntaxgesteuerte/CalculatorV.g4 by ANTLR 4.13.1
package h4_calcV;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorVParser}.
 */
public interface CalculatorVListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorVParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CalculatorVParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorVParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CalculatorVParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CalculatorVParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(CalculatorVParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CalculatorVParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(CalculatorVParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CalculatorVParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CalculatorVParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CalculatorVParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CalculatorVParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clear}
	 * labeled alternative in {@link CalculatorVParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterClear(CalculatorVParser.ClearContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clear}
	 * labeled alternative in {@link CalculatorVParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitClear(CalculatorVParser.ClearContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link CalculatorVParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(CalculatorVParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link CalculatorVParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(CalculatorVParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link CalculatorVParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(CalculatorVParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link CalculatorVParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(CalculatorVParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CalculatorVParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(CalculatorVParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CalculatorVParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(CalculatorVParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compare}
	 * labeled alternative in {@link CalculatorVParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompare(CalculatorVParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link CalculatorVParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompare(CalculatorVParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CalculatorVParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(CalculatorVParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CalculatorVParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(CalculatorVParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CalculatorVParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(CalculatorVParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CalculatorVParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(CalculatorVParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bedingte}
	 * labeled alternative in {@link CalculatorVParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBedingte(CalculatorVParser.BedingteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bedingte}
	 * labeled alternative in {@link CalculatorVParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBedingte(CalculatorVParser.BedingteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link CalculatorVParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(CalculatorVParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CalculatorVParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(CalculatorVParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code power}
	 * labeled alternative in {@link CalculatorVParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPower(CalculatorVParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code power}
	 * labeled alternative in {@link CalculatorVParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPower(CalculatorVParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link CalculatorVParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(CalculatorVParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link CalculatorVParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(CalculatorVParser.IntContext ctx);
}