lexer grammar CommonRules;

ID : [a-zA-Z]+ ;            // words
INT : [0-9]+ ;              // numbers
NL : '\r'? '\n' ;           // new line with/without
WS : [ \t]+ -> skip ;       // skip whitespace
MUL : '*' ;                 // assigns token name to '*' used above in grammar
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
ASSIGN : '=';
POWER : '^';
CLEAR : 'clear';
GREATER : '>';
SMALLER : '<';
EQUALS : '==';