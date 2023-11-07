// Generated from C:/Users/paras/IdeaProjects/fsu-praktikum/src/main/grammars/syntaxerkenner/Exprit.g4 by ANTLR 4.13.1
package h3_exprit;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpritParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpritVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpritParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExpritParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpritParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(ExpritParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpritParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExpritParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpritParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(ExpritParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpritParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact(ExpritParser.FactContext ctx);
}