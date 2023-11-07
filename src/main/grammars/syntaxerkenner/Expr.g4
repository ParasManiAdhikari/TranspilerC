grammar Expr;
import CommonRules;
prog : stat+ ;
stat : expr NL | NL ;
expr : INT | expr ('+'|'-') expr | expr ('*'|'/') expr | '(' expr ')' ;


/*
Antworten:
1. Type 2 : CFG, weil es hat N -> N*T struktur (nicht bei Type 1) & es hat rekuriv regeln ( nicht bei Type 3)
2. ja
3.
Recursiv:
expr: indirekt-rekursiv

4.
Associativität
keine

Priorität hoch zu niedrig
alle operatoren gleiche priorität

*/