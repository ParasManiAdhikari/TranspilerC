grammar Hello;            // Define a grammar called Hello
r  : 'h0_hello' INT ;         // match keyword h0_hello followed by an identifier
INT : [a-z]+ ;             // match lower-case identifiers
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines, \r (Windows)