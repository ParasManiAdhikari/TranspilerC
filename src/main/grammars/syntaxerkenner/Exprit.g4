grammar Exprit;
import CommonRules;
prog : stat+;
stat : expr NL | NL;
expr : term (('+'|'-') term)* ;
term : fact (('*'|'/') fact)* ;
fact : '+' fact | '-' fact | '(' expr ')' | INT ;