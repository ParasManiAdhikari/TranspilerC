lexer grammar Clexer;
K_FLOAT : 'float';
K_INT   : 'int';
K_VOID  : 'void';
POW :   '^' ;
MUL :   '*' ;
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
EQUALS: '==';
UNEQUALS: '!=';
SMALLER:'<' ;
BIGGER: '>' ;
ID  :   LETTER (LETTER | [0-9])* ;
fragment
LETTER : [a-zA-Z] ;

INT :   [0-9]+ ;

WS  :   [ \t\n\r]+ -> skip ;

SL_COMMENT
    :   '//' .*? '\n' -> skip
    ;

FORMAT : '"' (ESC | .)*? '"';
fragment ESC : '\\"' | '\\\\' ;
