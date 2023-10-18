// Generated from C:/Users/paras/IdeaProjects/fsu-praktikum/src/main/grammars/h0/Graphics.g4 by ANTLR 4.13.1
package h0_graphics;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GraphicsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GraphicsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GraphicsParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(GraphicsParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicsParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(GraphicsParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicsParser#point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoint(GraphicsParser.PointContext ctx);
}