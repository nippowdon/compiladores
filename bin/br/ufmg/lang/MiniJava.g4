/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar MiniJava;

goal
    : 
    mainClass 
    (typeDeclaration)* 
    EOF
    ;

mainClass
    : 
    KeywordClass 
    Identifier 
    OpenBracket 
    KeywordPublic 
    KeywordStatic 
    KeywordVoid 
    KeywordMain 
    OpenParenthesis 
    KeywordString 
    OpenSquareBrackets 
    CloseSquareBrackets 
    Identifier 
    CloseParenthesis 
    OpenBracket 
    printStatement 
    CloseBracket 
    CloseBracket
    ;

typeDeclaration
    : classDeclaration 
    | classExtendsDeclaration
    ;

classDeclaration
    : 
    KeywordClass
    Identifier 
    OpenBracket 
    varDeclaration* 
    methodDeclaration* 
    CloseBracket
    ;

classExtendsDeclaration
    :
    KeywordClass
    KeywordClass
    Identifier 
    KeywordExtends 
    Identifier 
    OpenBracket 
    varDeclaration* 
    methodDeclaration* 
    CloseBracket
    ;

varDeclaration
    :
    type 
    Identifier 
    EndLine
    ;

methodDeclaration
    :
    KeywordPublic 
    type
    Identifier  
    OpenParenthesis 
    formalParameterList? 
    CloseParenthesis 
    OpenBracket 
    varDeclaration* 
    statement* 
    KeywordReturn 
    expression 
    EndLine 
    CloseBracket
    ;

formalParameterList
    :
    formalParameter 
    formalParameterRest*
    ;

formalParameter
    : 
    type 
    Identifier
    ;

formalParameterRest
    : 
    Comma 
    formalParameter
    ;

type
    : 
    arrayType 
    | (BooleanType | IntegerType | Identifier)
    ;

arrayType
    : 
    IntegerType 
    OpenSquareBrackets 
    CloseSquareBrackets
    ;

statement
    : block 
    | assignmentStatement 
    | arrayAssignmentStatement 
    | ifStatement 
    | whileStatement 
    | printStatement
    ;

block
    : 
    OpenBracket 
    statement*    
    CloseBracket
    ;

assignmentStatement
    :
    Identifier 
    Equals 
    expression 
    EndLine
    ;

arrayAssignmentStatement
    : Identifier 
    OpenSquareBrackets    
    expression 
    CloseSquareBrackets 
    Equals 
    expression 
    EndLine
    ;

ifStatement
    : KeyWordIf 
    OpenParenthesis 
    expression 
    CloseParenthesis 
    statement 
    KeywordElse 
    statement
    ;

whileStatement
    :
    KeywordWhile 
    OpenParenthesis 
    expression  
    CloseParenthesis 
    statement
    ;

printStatement
    : 
    Sysout 
    OpenParenthesis 
    expression 
    CloseParenthesis 
    EndLine
    ;

expression
    : andExpression 
    | compareExpression 
    | plusExpression 
    | minusExpression 
    | timesExpression 
    | arrayLookup 
    | arrayLength 
    | messageSend   
    | primaryExpression
    ;

andExpression
    : 
    primaryExpression 
    LogicalAnd 
    primaryExpression
    ;

compareExpression
    : 
    primaryExpression 
    LessThan 
    primaryExpression
    ;

plusExpression
    : 
    primaryExpression 
    Plus 
    primaryExpression
    ;

minusExpression
    : 
    primaryExpression 
    Minus 
    primaryExpression
    ;

timesExpression
    : 
    primaryExpression 
    Times 
    primaryExpression
    ;

arrayLookup
    : 
    primaryExpression 
    OpenSquareBrackets 
    primaryExpression 
    CloseSquareBrackets
    ;

arrayLength
    : 
    primaryExpression 
    Dot 
    KeywordLength
    ;

messageSend
    : 
    primaryExpression 
    Dot 
    Identifier 
    OpenParenthesis 
    expressionList? 
    CloseParenthesis
    ;

expressionList
    : 
    expression 
    expressionRest*
    ;

expressionRest
    : 
    Comma 
    expression
    ;

primaryExpression
    : 
    (IntegerLiteral | TrueLiteral | FalseLiteral | Identifier | ThisExpression)
    | arrayAllocationExpression 
    | allocationExpression 
    | notExpression 
    | bracketExpression
    ;

IntegerLiteral      : ('0'..'9')+;
TrueLiteral         : 'true';
FalseLiteral        : 'false';


arrayAllocationExpression
    : 
    KeywordNew 
    IntegerType 
    OpenSquareBrackets 
    expression 
    CloseSquareBrackets
    ;

allocationExpression
    : 
    KeywordNew 
    Identifier 
    OpenParenthesis 
    CloseParenthesis
    ;

notExpression
    : 
    ExclamationMark 
    expression
    ;

bracketExpression
    : 
    OpenParenthesis 
    expression 
    CloseParenthesis
    ;

BooleanType: 'boolean';
IntegerType: 'int';

LogicalAnd              : '&&';
LessThan                : '<';
MoreThan                : '>';
Plus                    : '+';
Minus                   : '-';
Times                   : '*';
ExclamationMark         : '!';
Equals                  : '=';
EndLine                 : ';';
Comma                   : ',';
Dot                     : '.';

OpenBracket             : '{';
CloseBracket            : '}';

OpenParenthesis         : '(';
CloseParenthesis        : ')';

OpenSquareBrackets      : '[';
CloseSquareBrackets     : ']';    

Sysout                  : 'System.out.println';

ThisExpression          : 'this';


KeywordClass            : 'class';
KeywordPublic           : 'public';
KeywordStatic           : 'static';
KeywordVoid             : 'void';
KeywordMain             : 'main';
KeywordString           : 'String';
KeywordExtends          : 'extends';
KeywordReturn           : 'return';
KeyWordIf               : 'if';
KeywordElse             : 'else';
KeywordWhile            : 'while';
KeywordLength           : 'length';
KeywordNew              : 'new';


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
