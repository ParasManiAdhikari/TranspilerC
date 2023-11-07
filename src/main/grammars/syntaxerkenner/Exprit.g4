grammar Exprit;
import CommonRules;
prog : stat+;
stat : expr NL | NL;
expr : term (('+'|'-') term)* ;
term : fact (('*'|'/') fact)* ;
fact : '+' fact | '-' fact | '(' expr ')' | INT ;


/*
Antworten:
1. Type 2 : CFG, weil es hat N -> N*T struktur
2. ja
3.
Recursiv:
fact: rechts-rekursiv

4.
Associativität
+, -  -> rechts associativ

Priorität hoch zu niedrig
'('|')'
'*'|'/'
'+'|'-'

*/