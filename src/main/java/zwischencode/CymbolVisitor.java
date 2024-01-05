// Generated from C:/Users/paras/IdeaProjects/fsu-praktikum/src/main/grammars/zwischencodegen/Cymbol.g4 by ANTLR 4.13.1
package zwischencode;
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
	 * Visit a parse tree produced by the {@code StatBlock}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatBlock(CymbolParser.StatBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(CymbolParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfElse}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(CymbolParser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Forloop}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForloop(CymbolParser.ForloopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Whileloop}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileloop(CymbolParser.WhileloopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(CymbolParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(CymbolParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(CymbolParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CymbolParser.ExpressionContext ctx);
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
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(CymbolParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegate(CymbolParser.NegateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(CymbolParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(CymbolParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Vergleich}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVergleich(CymbolParser.VergleichContext ctx);
	/**
	 * Visit a parse tree produced by the {@code True}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(CymbolParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code False}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(CymbolParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VergleichParens}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVergleichParens(CymbolParser.VergleichParensContext ctx);
}