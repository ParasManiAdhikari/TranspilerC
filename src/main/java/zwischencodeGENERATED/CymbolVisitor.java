// Generated from C:/Users/paras/IdeaProjects/fsu-praktikum/src/main/grammars/zwischencodegen/Cymbol.g4 by ANTLR 4.13.1
package zwischencodeGENERATED;


import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CymbolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CymbolVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CymbolParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(CymbolParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude(CymbolParser.IncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(CymbolParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(CymbolParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(CymbolParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(CymbolParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CymbolParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#assignStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStat(CymbolParser.AssignStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(CymbolParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#forStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStat(CymbolParser.ForStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#whileStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(CymbolParser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#returnStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat(CymbolParser.ReturnStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(CymbolParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#printStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStat(CymbolParser.PrintStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(CymbolParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CymbolParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(CymbolParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(CymbolParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(CymbolParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(CymbolParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BracketExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketExpr(CymbolParser.BracketExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(CymbolParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegateVar}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegateVar(CymbolParser.NegateVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsNot}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNot(CymbolParser.IsNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(CymbolParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsTrue}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsTrue(CymbolParser.IsTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsFalse}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsFalse(CymbolParser.IsFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BracketBexpr}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketBexpr(CymbolParser.BracketBexprContext ctx);
}