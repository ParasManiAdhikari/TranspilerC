lexer grammar CommonRules;

ID : [a-zA-Z]+ ;            // words
INT : [0-9]+ ;              // numbers
NEWLINE : '\r'? '\n' ;      // new line
WS : [ \t]+ -> skip ;       // skip whitespace