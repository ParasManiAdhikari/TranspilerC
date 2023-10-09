lexer grammar SATLexer;
ITYPE: 'int'
;
ID : LETTER (LETTER | DIGIT)*
;
INT : DIGIT+
;
fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9] ;
// Everything else to be ignored
OTHER : . -> skip ;