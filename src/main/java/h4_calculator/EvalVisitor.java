package h4_calculator;

import java.util.*;

public class EvalVisitor extends CalculatorBaseVisitor<Integer>{
    /** "memory" for our calculator; variable/value pairs go here */
    Map<String, Integer> memory = new HashMap<String, Integer>();

    /** expr ('+' | '-') expr */
    @Override
    public Integer visitAddSub(CalculatorParser.AddSubContext ctx) {
        int left = visit(ctx.expr(0)); // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        if ( ctx.op.getType() == CalculatorParser.ADD ) return left + right;
        return left - right; // must be SUB
    }

    /** expr op=('*'|'/') expr */
    @Override
    public Integer visitMulDiv(CalculatorParser.MulDivContext ctx) {
        int left = visit(ctx.expr(0)); // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        if ( ctx.op.getType() == CalculatorParser.MUL ) return left * right;
        return left / right; // must be SUB
    }

    /** '(' expr ')' */
    @Override
    public Integer visitParens(CalculatorParser.ParensContext ctx) {
        return visit(ctx.expr()); // return child expr's value
    }

    /** INT */
    @Override
    public Integer visitInt(CalculatorParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    /** expr NEWLINE */
    @Override
    public Integer visitPrintExpr(CalculatorParser.PrintExprContext ctx) {
        Integer value = visit(ctx.expr()); // evaluate the expr child
        System.out.println(value); // print the result
        return value; // return dummy value
    }

    /** ID '=' expr NEWLINE */
    @Override
    public Integer visitAssign(CalculatorParser.AssignContext ctx) {
        String id = ctx.ID().getText(); // id is left-hand side of '='
        int value = visit(ctx.expr()); // compute value of expression on right
        memory.put(id, value); // store it in our memory
        return value;
    }

    /** expr op=(EQUALS | GREATER | SMALLER) expr */
    @Override
    public Integer visitCompare(CalculatorParser.CompareContext ctx) {
        int left = visit(ctx.expr(0)); // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        if ( ctx.op.getType() == CalculatorParser.EQUALS && left == right ) return 1;
        if ( ctx.op.getType() == CalculatorParser.SMALLER && left < right ) return 1;
        if (ctx.op.getType() == CalculatorParser.GREATER && left > right) return 1;
        return 0;
    }

    /** CLEAR */
    @Override
    public Integer visitClear(CalculatorParser.ClearContext ctx) {
        memory.clear();
        return 0;
    }

    /** expr POWER expr */
    @Override
    public Integer visitPower(CalculatorParser.PowerContext ctx) {
        int left = visit(ctx.expr(0)); // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        return (int) Math.pow(left, right); // return power
    }

    /** expr '?' expr ':' expr*/
    @Override
    public Integer visitBedingte(CalculatorParser.BedingteContext ctx) {
        int left = visit(ctx.expr(0));  // get value of left subexpression
        int mid = visit(ctx.expr(1));   // get value of middle subexpression
        int right = visit(ctx.expr(2)); // get value of right subexpression
        return left==1 ? mid : right;
    }
}
