grammar G6;
import CommonRules;

prog : stat | prog stat ;
stat : NL | expr NL;
expr : term | expr ('+'|'-') term;
term : fact | term ('*'|'/') fact;
fact : INT | '(' expr ')';


/*
Antworten:
1. Type 2 : CFG, weil es hat N -> N*T struktur
2. ja
3.
Recursiv:
prog, expr, term: links-rekursiv

4.
Associativität
+, -, *,/   -> links associativ

Priorität hoch zu niedrig
'('|')'
'*'|'/'
'+'|'-'

*/