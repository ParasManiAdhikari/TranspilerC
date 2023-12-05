grammar Cymbol ;

file : (functionDecl | varDecl)+ ;

varDecl : type ID ('=' expr)? ';' ;
type : 'float' | 'int' | 'void' ; // user-defined types

functionDecl : type ID '(' formalParameters? ')' block ; // "void f(int x) {...}"
formalParameters : formalParameter (',' formalParameter)*;
formalParameter : type ID ;

block : '{' stat* '}' ; // possibly empty statement block
stat: block                         # Fblock
    | varDecl                       # Vdec
    | 'if' expr stat ('else' stat)? # IfElse
    | 'return' expr? ';'            # Return
    | expr '=' expr ';'             # Assign
    | expr ';'                      # Fcall
    ;

expr: ID '(' exprList? ')'  # Call
    | expr '[' expr ']'     # Index
    | '-' expr              # Negate
    | '!' expr              # Not
    | expr ('*'|'/') expr   # MultDiv
    | expr ('+'|'-') expr   # AddSub
    | expr ('<'|'>') expr   # LessGreat
    | expr ('<='|'>=') expr # LesseqGreateq
    | expr '!=' expr        # Noteq
    | expr '==' expr        # Equal
    | ID                    # Var
    | INT                   # Int
    | '(' expr ')'          # Parens
    ;
exprList : expr (',' expr)* ; // arg list

INT : DIGIT+ ;// match integers
ID : ID_LETTER (ID_LETTER | DIGIT)* ; // From C language
fragment ID_LETTER : 'a'..'z'|'A'..'Z'|'_' ;
fragment DIGIT : '0'..'9';

OTHER : . ->skip ;

