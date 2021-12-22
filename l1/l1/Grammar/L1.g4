grammar L1;
 
program :  (function ';')+ ;

function : 'define' type IDENT '(' var_list ')' function_body 'end' ;
type : ('void'| 'int' | 'char' | 'bool' | 'string' | 'int array' | 'char array' | 'bool array' );
var_list :  | type IDENT (',' type IDENT )* ;
function_body : (stmt ';')* 'return' (expr | ) ';' '\n';
fact_params : ((expr ',') * expr | ) ;
op_definition : type IDENT ':=' expr ;
op_assign :  IDENT ':=' expr ;
op_func_call: IDENT '(' fact_params ')';
op_if : 'if' expr 'then' (stmt)* ('elseif' expr 'then' (stmt)*)* ('else' (stmt)*)? 'end' ;
op_while_pre: 'while' expr 'do' (stmt)* 'end' ;
op_while_post: 'do' (stmt ';')* 'while' expr ;
op_assert: 'assert' expr ;
stmt : op_definition | op_assign | op_func_call | op_if |op_while_pre | op_while_post | op_assert ; 

expr: and_expr (OR and_expr)*;
and_expr : comp ('and' comp)* ;
comp: arith_expr ( COMPARE arith_expr)*;
arith_expr: term ( ARITH term)* ;
term: factor (MULT factor)* ;
factor: (power | '-' factor );
power: atom_expr ('**' factor)?;
atom_expr : ( IDENT '[' expr ']' | IDENT '[' expr ']' |
 'new' type'['expr']' | IDENT | NUMBER | STRING | BOOLEAN) ;    
NUMBER : (DIGITS)+;
STRING : '"' (LOWERCASE|UPPERCASE|DIGITS)* '"' ;
BOOLEAN: ('T' | 'F');
COMPARE: ('='| '<'| '>'|'>='|'<='|'<>');
ARITH:  ('+'|'-');
MULT: ('mod'|'/'|'*');
OR: ('xor'|'or');

fragment DIGITS: [0-9];
fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;
fragment TAB : '\t';
fragment COMMENT: '***' ~[\r\n\f]* ;
IDENT : (UPPERCASE|LOWERCASE) (UPPERCASE|LOWERCASE|DIGITS|'_')*  ;
WHITESPACE : (' '| '\t' | COMMENT | '\r'? '\n' | '\r' | '\f')+ -> skip ;


