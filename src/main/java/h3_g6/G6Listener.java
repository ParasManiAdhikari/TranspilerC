// Generated from C:/Users/paras/IdeaProjects/fsu-praktikum/src/main/grammars/syntaxerkenner/G6.g4 by ANTLR 4.13.1
package h3_g6;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link G6Parser}.
 */
public interface G6Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link G6Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(G6Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link G6Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(G6Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link G6Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(G6Parser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link G6Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(G6Parser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link G6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(G6Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link G6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(G6Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link G6Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(G6Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link G6Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(G6Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link G6Parser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(G6Parser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link G6Parser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(G6Parser.FactContext ctx);
}