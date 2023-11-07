grammar Expr;
import CommonRules;
prog : stat+ ;
stat : expr NL | NL ;
expr : INT | expr ('+'|'-') expr | expr ('*'|'/') expr | '(' expr ')' ;