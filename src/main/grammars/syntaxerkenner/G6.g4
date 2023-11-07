grammar G6;
import CommonRules;

prog : stat | prog stat ;
stat : NL | expr NL;
expr : term | expr ('+'|'-') term;
term : fact | term ('*'|'/') fact;
fact : INT | '(' expr ')';