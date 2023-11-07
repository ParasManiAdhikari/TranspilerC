lexer grammar CommonRules;

ID : [a-zA-Z]+ ;            // words
INT : [0-9]+ ;              // numbers
NL : '\r'? '\n' ;           // new line with/without
WS : [ \t]+ -> skip ;       // skip whitespace