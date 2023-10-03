grammar Hello;            // Define a grammar called Hello
r  : 'hello' INT ;         // match keyword hello followed by an identifier
INT : [a-z]+ ;             // match lower-case identifiers
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines, \r (Windows)