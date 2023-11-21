package h4_calculator;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class EvalListener extends CalculatorBaseListener {
    /** maps nodes to integers with Map<ParseTree,Integer> */
    ParseTreeProperty<Integer> values = new ParseTreeProperty<Integer>();

    public int getValue(ParseTree node){
        return values.get(node);
    }

    /** INT */
    @Override
    public void exitInt(CalculatorParser.IntContext ctx) {
        String intText = ctx.INT().getText();
        values.put(ctx, Integer.valueOf(intText));
    }

    /** expr ('+' | '-') expr */
    @Override
    public void exitAddSub(CalculatorParser.AddSubContext ctx) {
        int left = values.get(ctx.expr(0)); // get value of left subexpression
        int right = values.get(ctx.expr(1)); // get value of right subexpression
        if ( ctx.op.getType() == CalculatorParser.ADD ) values.put(ctx, left + right);
        else values.put(ctx, left - right);
    }

    @Override
    public void exitMulDiv(CalculatorParser.MulDivContext ctx) {
        int left = values.get(ctx.expr(0));
        int right = values.get(ctx.expr(1));
        if ( ctx.op.getType() == CalculatorParser.MUL ) values.put(ctx, left * right);
        else values.put(ctx, left / right);
    }

    /** expr op=(EQUALS | GREATER | SMALLER) expr */
    @Override
    public void exitCompare(CalculatorParser.CompareContext ctx){
        int left = values.get(ctx.expr(0));
        int right = values.get(ctx.expr(1));
        if ( ctx.op.getType() == CalculatorParser.EQUALS && left == right ) values.put(ctx, 1);
        else if ( ctx.op.getType() == CalculatorParser.SMALLER && left < right ) values.put(ctx, 1);
        else if (ctx.op.getType() == CalculatorParser.GREATER && left > right) values.put(ctx, 1);
        else values.put(ctx, 0);
    }

    /** expr '?' expr ':' expr*/
    @Override
    public void exitBedingte(CalculatorParser.BedingteContext ctx) {
        int left = values.get(ctx.expr(0)); // get value of left subexpression
        int mid = values.get(ctx.expr(1)); // get value of left subexpression
        int right = values.get(ctx.expr(2)); // get value of right subexpression
        values.put(ctx, left==1 ? mid : right);
    }

    @Override
    public void exitPower(CalculatorParser.PowerContext ctx) {
        int left = values.get(ctx.expr(0));
        int right = values.get(ctx.expr(1));
        values.put(ctx, (int) Math.pow(left, right));
    }
}
