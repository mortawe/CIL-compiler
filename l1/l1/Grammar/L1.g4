grammar L1;

options {
  language = CSharp3;
  TokenLabelType=CommonToken;
}

@lexer::namespace {L1} 
@parser::namespace {L1}
 
program :  (function ';')+ ;

function : 'define' type IDENT '(' var_list ')' function_body 'end' ;

type : ('void'| 'int' | 'char' | 'bool' | 'int array' | 'char array' | 'bool array' );

var_list :  | type IDENT (',' type IDENT )* ;

function_body : (stmt ';')* 'return' expr ';' '\n';
fact_params : ((expr ',') * expr | ) ;
op_definition : type IDENT ':=' expr ;
op_assign :  IDENT ':=' expr ;
op_func_call: IDENT '(' fact_params ')';
op_if : 'if' cond 'then' (stmt)* ('elseif' cond 'then' (stmt)*)* ('else' (stmt)*)? 'end' ;
op_while_pre: 'while' cond 'do' (stmt)* 'end' ;
op_while_post: 'do' (stmt ';')* 'while' cond ;
op_assert: 'assert' cond ;
stmt : (op_definition | op_assign | op_func_call | op_if |op_while_pre | op_while_post | op_assert) ; 
cond : expr (('='| '<'| '>'|'>='|'<='|'<>') expr)? ;
expr: xor_expr (('xor'|'or') xor_expr)* ;
xor_expr: and_expr('and' and_expr)* ;
and_expr : arith_expr('and' arith_expr)* ;
arith_expr: term (('+'|'-') term)* ;
term: factor (('mod'|'/'|'*') factor)* ;
factor: (power | '-' factor );
power: atom_expr ('**' factor)?;
atom_expr : ( IDENT '[' expr ']' | IDENT '[' expr ']' |
 'new' type'['expr']' | IDENT | NUMBER | STRING | BOOLEAN) ;    
NUMBER : (DIGITS)+;
STRING : '"' (LOWERCASE|UPPERCASE|DIGITS)* '"' ;
BOOLEAN: ('T' | 'F');


fragment DIGITS: [0-9];
fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;
fragment TAB : '\t';
fragment COMMENT: '***' ~[\r\n\f]* ;
IDENT : (UPPERCASE|LOWERCASE) (UPPERCASE|LOWERCASE|DIGITS|'_')*  ;
WHITESPACE : (' '| '\t' | COMMENT | '\r'? '\n' | '\r' | '\f')+ -> skip ;


