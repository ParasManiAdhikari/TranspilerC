// Generated from C:/Users/paras/IdeaProjects/fsu-praktikum/src/main/grammars/zwischencodegen/Cymbol.g4 by ANTLR 4.13.1
package zwischencodeGENERATED;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CymbolParser}.
 */
public interface CymbolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CymbolParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(CymbolParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(CymbolParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(CymbolParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(CymbolParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(CymbolParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(CymbolParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(CymbolParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(CymbolParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(CymbolParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CymbolParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CymbolParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CymbolParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CymbolParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(CymbolParser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(CymbolParser.AssignStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(CymbolParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(CymbolParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#forStat}.
	 * @param ctx the parse tree
	 */
	void enterForStat(CymbolParser.ForStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#forStat}.
	 * @param ctx the parse tree
	 */
	void exitForStat(CymbolParser.ForStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(CymbolParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(CymbolParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(CymbolParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(CymbolParser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CymbolParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CymbolParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#printStat}.
	 * @param ctx the parse tree
	 */
	void enterPrintStat(CymbolParser.PrintStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#printStat}.
	 * @param ctx the parse tree
	 */
	void exitPrintStat(CymbolParser.PrintStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(CymbolParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(CymbolParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CymbolParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CymbolParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Call}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCall(CymbolParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCall(CymbolParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(CymbolParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(CymbolParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(CymbolParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(CymbolParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVar(CymbolParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVar(CymbolParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracketExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBracketExpr(CymbolParser.BracketExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracketExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBracketExpr(CymbolParser.BracketExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(CymbolParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(CymbolParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegateVar}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegateVar(CymbolParser.NegateVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegateVar}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegateVar(CymbolParser.NegateVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsNot}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterIsNot(CymbolParser.IsNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsNot}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitIsNot(CymbolParser.IsNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterComparison(CymbolParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitComparison(CymbolParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsTrue}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterIsTrue(CymbolParser.IsTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsTrue}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitIsTrue(CymbolParser.IsTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsFalse}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterIsFalse(CymbolParser.IsFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsFalse}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitIsFalse(CymbolParser.IsFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracketBexpr}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBracketBexpr(CymbolParser.BracketBexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracketBexpr}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBracketBexpr(CymbolParser.BracketBexprContext ctx);
}