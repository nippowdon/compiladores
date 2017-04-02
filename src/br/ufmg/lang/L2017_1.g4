/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar L2017_1;

//
// Whitespace and comments
//

WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;

Digit 
    : '0'
    | '1'
    | '2'
    | '3'
    | '4'
    | '5'
    | '6'
    | '7'
    | '8'
    | '9' 
    ;

identifier
    : Identifier
    ;

Identifier
    :   JavaLetter JavaLetterOrDigit*
    ;

fragment
JavaLetter
    :   [a-zA-Z$_] // these are the "java letters" below 0x7F
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
        {Character.isJavaIdentifierStart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;

fragment
JavaLetterOrDigit
    :   [a-zA-Z0-9$_] // these are the "java letters or digits" below 0x7F
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
        {Character.isJavaIdentifierPart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;


UNICODE_CHAR: '\u0000'..'\uFFFE';
       
relop: '=' | '<' | '<=' | '>' | '>=' | '!=';
addop: '+' | '-' | 'or';
mulop: '*' | '/' | 'div' | 'MOD' | 'AND'; 


program : 'program' identifier ';' decl_list compound_stmt;

decl_list : decl (';' decl)*;

decl 
    : dcl_var
    | dcl_proc
    ;

dcl_var : ident_list ':' type;

ident_list 
    : identifier (',' identifier)*
    ;

type 
    : 'integer'
    | 'real'
    | 'boolean'
    | 'char'
    ;

dcl_proc 
    : tipo_retornado 'procedure' identifier espec_parametros corpo
    ;

tipo_retornado 
    : ('integer'
    | 'real'
    | 'boolean'
    | 'char')?
    ;

corpo 
    :  (':' decl_list ';' compound_stmt id_return)?;

id_return : (identifier)?;

espec_parametros : '(' lista_parametros ')';
      
lista_parametros 
    : parametro
    | lista_parametros ',' parametro
    ;

parametro 
    : modo type ':' identifier
    ;

modo 
    : 'value'
    | 'reference'
    ;

compound_stmt : 'begin' stmt_list 'end';
      
stmt_list 
    : stmt_list ';' stmt
    | stmt
    ;

stmt 
    : assign_stmt
    | if_stmt
    | repeat_stmt
    | read_stmt
    | write_stmt
    | compound_stmt
    | function_ref_par
    ;

assign_stmt : identifier ':=' expr;

if_stmt 
    : 'if' cond 'then' stmt
    | 'if' cond 'then' stmt 'else' stmt
    ;

cond : expr;

repeat_stmt : 'repeat' stmt_list 'until' expr;

read_stmt : 'read' '(' ident_list ')';

write_stmt : 'write' '(' expr_list ')';

expr_list 
    : expr
    | expr_list ',' expr
    ;

expr 
    : simple_expr
    | simple_expr relop simple_expr
    ;

simple_expr 
    : term
    | simple_expr addop term
    ;

term 
    : term mulop factor_a
    | factor_a
    ;

factor_a 
    : '−' factor
    | factor
    ;

factor 
    : identifier
    | constant
    | '(' expr ')'
    | 'NOT' factor
    | function_ref_par
    ;

function_ref_par : variable '(' expr_list ')';

variable : simple_variable_or_proc;

simple_variable_or_proc : identifier;

constant 
    : integer_constant
    | real_constant
    | char_constant
    | boolean_constant
    ;

boolean_constant : 'false' | 'true';

unsigned_integer : Digit+;

sign : ('+'|'-')?;

scale_factor : 'E' sign unsigned_integer;

unsigned_real : unsigned_integer ('.' Digit*)?(scale_factor)?;

integer_constant : unsigned_integer;

real_constant : unsigned_real;

char_constant : '\'' UNICODE_CHAR '\'';

goal: program;