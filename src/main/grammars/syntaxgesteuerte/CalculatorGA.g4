grammar CalculatorGA;
import CommonRules;

@header {
    import java.util.*;
}

@parser::members {
    /** "memory" for our calculator; variable/value pairs go here */
    Map<String, Integer> memory = new HashMap<String, Integer>();
    int eval(int left, int op, int right) {
        switch ( op ) {
            case MUL : return left * right;
            case DIV : return left / right;
            case ADD : return left + right;
            case SUB : return left - right;
            case EQUALS : return left == right ? 1 : 0;
            case SMALLER : return left < right ? 1 : 0;
            case GREATER : return left > right ? 1 : 0;
        }
        return 0;
    }
}

prog: stat+;
stat: expr NL {System.out.println($expr.v);}
    | ID '=' expr NL {memory.put($ID.text, $expr.v);}
    | NL
    | CLEAR {memory.clear();}
    ;
    
expr returns [int v]
    : '(' expr ')' {$v = $expr.v;}
    | <assoc=right>  a=expr op=POWER b=expr {$v = (int) Math.pow($a.v, $b.v);}
    | a=expr op=( MUL | DIV ) b=expr {$v = eval($a.v, $op.type, $b.v);}
    | a=expr op=( ADD | SUB ) b=expr {$v = eval($a.v, $op.type, $b.v);}
    | a=expr op=(EQUALS | SMALLER | GREATER ) b=expr {$v = eval($a.v, $op.type, $b.v);}
    | a=expr '?' b=expr ':' c=expr {$v = $a.v==1 ? $b.v : $c.v;}
    | INT {$v = $INT.int;}
    | ID
      {
      String id = $ID.text;
      $v = memory.containsKey(id) ? memory.get(id) : 0;
      }
    ;