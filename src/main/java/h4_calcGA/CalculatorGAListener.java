// Generated from C:/Users/paras/IdeaProjects/fsu-praktikum/src/main/grammars/syntaxgesteuerte/CalculatorGA.g4 by ANTLR 4.13.1
package h4_calcGA;

    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorGAParser}.
 */
public interface CalculatorGAListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorGAParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CalculatorGAParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorGAParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CalculatorGAParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorGAParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CalculatorGAParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorGAParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CalculatorGAParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorGAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CalculatorGAParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorGAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CalculatorGAParser.ExprContext ctx);
}