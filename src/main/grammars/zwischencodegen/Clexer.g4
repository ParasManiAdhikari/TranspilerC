lexer grammar Clexer;
K_FLOAT : 'float';
K_INT   : 'int';
K_VOID  : 'void';
ID  :   LETTER (LETTER | [0-9])* ;
EQ: '==';
NEQ: '!=';
LT: '<';
GT: '>';
fragment
LETTER : [a-zA-Z] ;
ADD : '+';
SUB : '-';
MULT : '*';
DIV : '/';
INT :   [0-9]+ ;         // match integers
FORMAT : '"' .*? '%' .*? '"';
WS  :   [ \t\n\r]+ -> skip ; // toss out whitespace
SL_COMMENT
    :   '//' .*? '\n' -> skip
    ;