lexer grammar IPLexer;
IP : INT Dot INT Dot INT Dot INT;
INT : DIGIT | DIGIT DIGIT|[1] DIGIT DIGIT | [2] [0-4] DIGIT | [2] [5] [0-5];
fragment Dot :  '.';
fragment DIGIT : [0-9] ;
// Everything else to be ignored
OTHER : . -> skip ;