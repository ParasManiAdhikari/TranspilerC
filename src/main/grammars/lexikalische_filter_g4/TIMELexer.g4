lexer grammar TIMELexer;
ID : Hour Colon Minute (Colon Sekunden) ?;
Hour : [0-1] DIGIT | [2] [0-3];
Minute :  [0] DIGIT | [1-5] DIGIT;
Sekunden :  [0] DIGIT | [1-5] DIGIT;
fragment Colon :  ':';
fragment DIGIT : [0-9] ;
// Everything else to be ignored
OTHER : . -> skip ;