grammar pezimaGrammar;

@parser::header {
		package co.edu.eafit.dis.st0270.s2016.pezimaGrammar;
}

@lexer::header {
	       package co.edu.eafit.dis.st0270.s2016.pezimaGrammar;
}

@parser::rulecatch {
		   catch(RecognitionException e){
		   			      throw e;
		   }
}

prog	:	'[' stats ']'
	;

stats	:	lststs?
	;

lststs	:	stat (op = ';' lststs)*
	;

stat	:	'[' stats ']'						#NuevoBloque
	|	'decl' NAME						#declName
	|	'use'  NAME expr					#useNameExpr
	|	op= ('ifzero'|'ifneg'|'ifpos'|'ifnzero') NAME stat	#ifBlock
	;

expr	:	term('+'term)*
			;

term	: 	factor ('*' factor)*
			;

factor	:	'neg'? NUM						#negNum
	|	NAME							#nombre
	|	op=NUM							#numero
	;

NUM	:	(('1'..'9')('0'..'9')*|'0')
	;

NAME	:	('a'..'z'|'A'..'Z')+('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
	;

KEYWORDS
	:	'decl'
	|  	'use'
	|  	'ifneg'
	|  	'ifpos'
	|  	'ifzero'
	|  	'ifnzero'
	|	'neg'
	;

OPERATORS
	:	'+'
	|	'*'
	|	'='
	;

SEPARATORS
	:	'('
	|	')'
	|	'['
	|	']'
	|	';'
	;
WS
	: ( ' '
    	| '\t'
    	| '\r'
	| '\n'
	| '\f'
	| '\n\f'
	) -> skip
	;

//Captura cualquier otro caracter que no pertenezca a estas categorias
ERRORCHARACTER	    : .
		    ;