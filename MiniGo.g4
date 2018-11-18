grammar MiniGo;
program		: decl+	 {System.out.println("201402406 Rule 0");}; //b
decl		: var_decl {System.out.println("201402406 Rule 1-0");} //b
			| fun_decl {System.out.println("201402406 Rule 1-1");}; //b
var_decl	: dec_spec IDENT type_spec  {System.out.println("201402406 Rule 2-0");} //b
			| dec_spec IDENT type_spec '=' LITERAL  {System.out.println("201402406 Rule 2-1");} //b
			| dec_spec IDENT '[' LITERAL ']' type_spec {System.out.println("201402406 Rule 2-2");}; //b
dec_spec	: VAR {System.out.println("201402406 Rule 3");};  //b
type_spec	: INT {System.out.println("201402406 Rule 4-0");} //b
			| {System.out.println("201402406 Rule 4-1");}; //b
fun_decl	: FUNC IDENT '(' params ')' type_spec compound_stmt {System.out.println("201402406 Rule 5-0");} //b
			| FUNC IDENT '(' params ')' '(' type_spec ',' type_spec ')' compound_stmt {System.out.println("201402406 Rule 5-1");}; //b
params		: param(',' param)* {System.out.println("201402406 Rule 6-0");} //b
			| {System.out.println("201402406 Rule 6-1");}; //b
param		: IDENT {System.out.println("201402406 Rule 7-0");} //b
			| IDENT type_spec {System.out.println("201402406 Rule 7-1");}; //b
stmt		: expr_stmt {System.out.println("201402406 Rule 8-0");} //b
			| compound_stmt {System.out.println("201402406 Rule 8-1");} //b
			| if_stmt {System.out.println("201402406 Rule 8-2");} //b
			| for_stmt {System.out.println("201402406 Rule 8-3");} //b
			| return_stmt {System.out.println("201402406 Rule 8-4");}; //b
expr_stmt	: expr	{System.out.println("201402406 Rule 9");}; //b
for_stmt	: FOR loop_expr stmt	{System.out.println("201402406 Rule 10-0");} //b
			| FOR expr stmt	{System.out.println("201402406 Rule 10-1");}; //b
compound_stmt: '{' local_decl* stmt* '}' {System.out.println("201402406 Rule 11");}; //b
local_decl	: dec_spec IDENT type_spec {System.out.println("201402406 Rule 12-0");} //b
			| dec_spec IDENT type_spec '=' LITERAL  {System.out.println("201402406 Rule 12-1");} //b
			| dec_spec IDENT '[' LITERAL ']' type_spec {System.out.println("201402406 Rule 12-2");}; //b
if_stmt		: IF expr stmt {System.out.println("201402406 Rule 13-0");} //b
			| IF expr stmt ELSE stmt {System.out.println("201402406 Rule 13-1");}; //b
return_stmt	: RETURN expr{System.out.println("201402406 Rule 14-0");} //b
			| RETURN expr ',' expr {System.out.println("201402406 Rule 14-1");} //b
			| RETURN {System.out.println("201402406 Rule 14-2");}; //b
loop_expr   : expr ';' expr ';' expr ('++'|'--') {System.out.println("201402406 Rule 15");}; //b
expr		: (LITERAL|IDENT) {System.out.println("201402406 Rule 16-0");} //b
			| '(' expr ')' {System.out.println("201402406 Rule 16-1");} //b
			| IDENT '[' expr ']' {System.out.println("201402406 Rule 16-2");} //b
			| IDENT '(' args ')' {System.out.println("201402406 Rule 16-3");} //b
			| FMT '.' IDENT '(' args ')' {System.out.println("201402406 Rule 16-4");} //b
			| op=('-'|'+'|'--'|'++'|'!') expr {System.out.println("201402406 Rule 16-5");} //b
			| left=expr op=('*'|'/') right=expr {System.out.println("201402406 Rule 16-6");} //b
			| left=expr op=('%'|'+'|'-') right=expr {System.out.println("201402406 Rule 16-7");}
			| left=expr op=(EQ|NE|LE|'<'|GE|'>'|AND|OR) right=expr {System.out.println("201402406 Rule 16-8");} //b
			| IDENT '=' expr {System.out.println("201402406 Rule 16-9");} //b
			| IDENT '[' expr ']' '=' expr {System.out.println("201402406 Rule 16-10");}; 
args		: expr (',' expr) * {System.out.println("201402406 Rule 17-0");} //b
			| {System.out.println("201402406 Rule 17-1");}; //b
VAR			: 'var'   {System.out.println("201402406 Rule 18");}; //b
FUNC		: 'func'  {System.out.println("201402406 Rule 19");}; //b
FMT			: 'fmt'	  {System.out.println("201402406 Rule 20");}; //
INT			: 'int'   {System.out.println("201402406 Rule 21");}; //b
FOR			: 'for'   {System.out.println("201402406 Rule 22");}; //b
IF			: 'if'    {System.out.println("201402406 Rule 23");};
ELSE		: 'else'  {System.out.println("201402406 Rule 24");};
RETURN		: 'return'{System.out.println("201402406 Rule 25");};
OR			: 'or'    {System.out.println("201402406 Rule 26");};
AND			: 'and'   {System.out.println("201402406 Rule 27");};
LE			: '<='    {System.out.println("201402406 Rule 28");};
GE			: '>='    {System.out.println("201402406 Rule 29");};
EQ			: '=='    {System.out.println("201402406 Rule 30");};
NE			: '!='    {System.out.println("201402406 Rule 31");};

IDENT		: [a-zA-Z_] {System.out.println("201402406 Rule 32-0");} // b
			( [a-zA-Z_] {System.out.println("201402406 Rule 32-1");} // b
			| [0-9] {System.out.println("201402406 Rule 32-2");} // b
			)*;
			
LITERAL		: DecimalConstant | OctalConstant | HexadecimalConstant {System.out.println("201402406 Rule 33");};

DecimalConstant	: '0' {System.out.println("201402406 Rule 34-0");}
				| [1-9] [0-9]* {System.out.println("201402406 Rule 34-1");};
OctalConstant	: '0' [0-7]* {System.out.println("201402406 Rule 35");};
HexadecimalConstant	: '0' [xX] [0-9a-fA-F]+ {System.out.println("201402406 Rule 36");};
WS			: (' ' {System.out.println("201402406 Rule 37-0");} //b
			| '\t' {System.out.println("201402406 Rule 37-1");} 
			| '\r' {System.out.println("201402406 Rule 37-2");} //b
			| '\n' {System.out.println("201402406 Rule 37-3");} //b   
			)+ 
	-> channel(HIDDEN) 	 
    ;
