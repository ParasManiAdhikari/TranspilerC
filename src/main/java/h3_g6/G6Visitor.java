// Generated from C:/Users/paras/IdeaProjects/fsu-praktikum/src/main/grammars/syntaxerkenner/G6.g4 by ANTLR 4.13.1
package h3_g6;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link G6Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface G6Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link G6Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(G6Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link G6Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(G6Parser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link G6Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(G6Parser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link G6Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(G6Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link G6Parser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact(G6Parser.FactContext ctx);
}