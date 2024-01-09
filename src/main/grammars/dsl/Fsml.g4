grammar Fsml;
 fsm : state+ EOF ;
 state : 'initial'? 'state' stateid '{' transition* '}' ;
 transition : event ('/' action)? ('->' target=stateid)? ';' ;
 stateid : NAME ;
 event : NAME ;
 action : NAME ;
 NAME : ('a'..'z'|'A'..'Z')+ ;
 WS : [ \t\n\r]+ -> skip ;