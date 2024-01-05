// Generated from C:/Users/paras/IdeaProjects/fsu-praktikum/src/main/grammars/zwischencodegen/Cymbol.g4 by ANTLR 4.13.1
package zwischencode;
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
	 * Enter a parse tree produced by the {@code StatBlock}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatBlock(CymbolParser.StatBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatBlock}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatBlock(CymbolParser.StatBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CymbolParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CymbolParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElse}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(CymbolParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElse}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(CymbolParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Forloop}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterForloop(CymbolParser.ForloopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Forloop}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitForloop(CymbolParser.ForloopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Whileloop}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhileloop(CymbolParser.WhileloopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Whileloop}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhileloop(CymbolParser.WhileloopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReturn(CymbolParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReturn(CymbolParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CymbolParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CymbolParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint(CymbolParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint(CymbolParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CymbolParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CymbolParser.ExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(CymbolParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(CymbolParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegate(CymbolParser.NegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegate(CymbolParser.NegateContext ctx);
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
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterNot(CymbolParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitNot(CymbolParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Vergleich}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterVergleich(CymbolParser.VergleichContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Vergleich}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitVergleich(CymbolParser.VergleichContext ctx);
	/**
	 * Enter a parse tree produced by the {@code True}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterTrue(CymbolParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code True}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitTrue(CymbolParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code False}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterFalse(CymbolParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code False}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitFalse(CymbolParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VergleichParens}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterVergleichParens(CymbolParser.VergleichParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VergleichParens}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitVergleichParens(CymbolParser.VergleichParensContext ctx);
}