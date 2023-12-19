grammar Cymbol;
import Clexer;

@header {
}

file:  include* (functionDecl | varDecl)+ ;

include: '#include' ('<stdio.h>'| '<stdbool.h>');

functionDecl
    :   type ID '(' formalParameters? ')' block
    ;

formalParameters
    :   formalParameter (',' formalParameter)*
    ;
formalParameter
    :   type ID
    ;

stat:   block
    |   varDecl
    |   ifStat
    |   forStat
    |   whileStat
    |   returnStat ';'
    |   assignStat  ';'
    |   printStat  ';'
    |   expr ';'
    ;

block:  '{' stat* '}' ;

assignStat:  ID '=' expr ;


ifStat: 'if' '('bexpr ')' stat elseStat? ;

elseStat: 'else' stat;

forStat: 'for' '(' assignStat ';' bexpr ';' assignStat ')' stat ;

whileStat: 'while' '('bexpr')' stat ;

returnStat: 'return' expr ;

args : (expr (',' expr)*)? ;

printStat: 'printf' '(' FORMAT ',' expr ')';

varDecl:   type ID ';' ;

type:   'float' | 'int'  ;

expr:   op = '-' expr           # NegateVar
    |   expr op=('*'|'/') expr  # MulDiv
    |   expr op=('+'|'-') expr  # AddSub
    |   ID                      # Var
    |   INT                     # Int
    |   '(' expr ')'            # BracketExpr
    |   ID '(' args ')'         # Call
    ;

bexpr:   '!' bexpr                          # IsNot
    |   expr op=('=='|'!='|'<'|'>') expr    # Comparison
    |   'true'                              # IsTrue
    |   'false'                             # IsFalse
    |   '(' bexpr ')'                       # BracketBexpr
    ;
