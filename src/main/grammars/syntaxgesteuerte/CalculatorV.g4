grammar CalculatorV;
import CommonRules;

prog: stat+;
stat: expr NL                       # printExpr
    | ID ASSIGN expr NL             # assign
    | CLEAR NL                      # clear
    | 'if' '('expr')' stat 'else' stat  # ifelse
    | NL                            # blank
    ;

expr: '(' expr ')'                  # parens
    | expr POWER expr               # power
    | expr op=(MUL | DIV) expr      # MulDiv
    | expr op=(ADD | SUB) expr      # AddSub
    | expr op=(EQUALS | GREATER | SMALLER) expr   # compare
    | expr '?' expr ':' expr        # bedingte
    | ID                            # id
    | INT                           # int
    ;