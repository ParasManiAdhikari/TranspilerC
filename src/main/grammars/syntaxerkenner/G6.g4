grammar G6;
import CommonRules;

prog : stat | prog stat ;
stat : NEWLINE | expr NEWLINE;
expr : term | expr ('+'|'-') term;
term : fact | term ('*'|'/') fact;
fact : INT | '(' expr ')';