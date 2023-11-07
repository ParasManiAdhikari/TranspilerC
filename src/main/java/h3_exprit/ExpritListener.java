// Generated from C:/Users/paras/IdeaProjects/fsu-praktikum/src/main/grammars/syntaxerkenner/Exprit.g4 by ANTLR 4.13.1
package h3_exprit;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpritParser}.
 */
public interface ExpritListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpritParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExpritParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpritParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExpritParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpritParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ExpritParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpritParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ExpritParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpritParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExpritParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpritParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExpritParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpritParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ExpritParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpritParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ExpritParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpritParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(ExpritParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpritParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(ExpritParser.FactContext ctx);
}