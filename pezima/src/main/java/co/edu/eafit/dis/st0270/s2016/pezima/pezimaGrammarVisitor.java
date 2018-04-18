// Generated from pezimaGrammar.g4 by ANTLR 4.5.3

//package co.edu.eafit.dis.st0270.s2016.pezimaGrammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.Token;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Arrays;
import java.util.Stack;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pezimaGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class pezimaGrammarVisitor
    extends pezimaGrammarBaseVisitor<Boolean> {
    private Map<String,Integer> mapa;
    private Stack stackDeep = new Stack();
    public pezimaGrammarVisitor(){
	super();
	mapa = new HashMap<>();
	int cont = 0;
    }

    /**
     * Visit a parse tree produced by {@link pezimaGrammarParser#prog}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override public Boolean visitProg(pezimaGrammarParser.ProgContext ctx){
	boolean result = visit(ctx.stats());
	System.out.println("visitProg :" + result); 
	return result;
    }


    /**
     * Visit a parse tree produced by {@link pezimaGrammarParser#stats}.
     * @param ctx the parse tree
     * @return the visitor result
     */


    @Override public Boolean visitStats(pezimaGrammarParser.StatsContext ctx){
	boolean result = visit(ctx.lstSts());
	System.out.println("VisitStats :" + result);
	return result;
    }


    /**
     * Visit a parse tree produced by {@link pezimaGrammarParser#lststs}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override public Boolean visitLststs(pezimaGrammarParser.LststsContext ctx){
	boolean result = visit(ctx.next());
	System.out.println("VisitLststs 1:" + result);
	if(ctx.op == null){
	    return result;
	}

	Iterator<pezimaGrammarParser.LstStsContext> targetLstSts = ctx.lstSts().iterator();
	while(targetStat.hasNext()){
	    boolean contlist = visit(targetLstSts.next());
	    result = result && contlist;
	}
        System.out.println("VisitLststs Listas:" + result);
	return result;
    }
    /**
     * Visit a parse tree produced by the {@code NuevoBloque}
     * labeled alternative in {@link pezimaGrammarParser#stat}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override public Boolean visitNuevoBloque(pezimaGrammarParser.NuevoBloqueContext ctx){
	boolean result = false;

	stackDeep.push("[");

	if(stackDeep.push("[")){
	    cont++;
	    System.out.println("Su nivel de profundidad Actual es :" + cont);
	}
	result = visit(ctx.stats());

	stackDeep.push("]");
	
	if(stackDeeo.push("]")){
	    cont--;
	    System.out.println("Su nivel de profundidad Actual es :" + cont);
	}
	System.out.println("visitNewBloques :" + result);
	return result;
    }
    /**
     * Visit a parse tree produced by the {@code declName}
     * labeled alternative in {@link pezimaGrammarParser#stat}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override public Boolean visitDeclName(pezimaGrammarParser.DeclNameContext ctx){
	if(ctx.NAME().getSymbol().getType() == 14){
	    Integer result = 0;
	    mapa.put(ctx.NAME().getText(),null);
	    stackDeep.push(ctx.NAME().getText());
	    return true;
	}
      return false;
	}
    }
    /**
     * Visit a parse tree produced by the {@code useNameExpr}
     * labeled alternative in {@link pezimaGrammarParser#stat}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override public Boolean visitUseNameExpr(pezimaGrammarParser.UseNameExprContext ctx){
	boolean result = false;
	
	if(mapa.containsKey(ctx.NAME().getText())){
	    if (alcanzabilidad(ctx.NAME().getText(), stackDeep)){
		result = visit(ctx.expr());
		mapa.put(ctx.NAME().getText(), 0 );
		System.out.println("USeNAmeExpr :" + result);
		return result;
	    }
	}
	System.out.println("UseNameExpr :" + result);
	return result;
    }

    public Boolean alcanzabilidad(String aux, Stack set){
	boolean found = false;
	boolean valid = true;
	Stack<String> copy = (Stack<String>)set.clone();
	while(!copy.empty()){
	    String search = copy.pop();
	    if(search.equals("]")){
		valid = false;
	    }
	    if(search.equals("[")){
		valid = true;
	    }
	    if(search.equals(aux)){
		found = true;
		break;
	    }
	}
	System.out.println("VarIsAlc :" + valid);
	return valid;
    }
    /**
     * Visit a parse tree produced by the {@code ifBlock}
     * labeled alternative in {@link pezimaGrammarParser#stat}.
     * @param ctx the parse tree
     * @return the visitor result
     */
        @Override public Boolean visitIfBlock(pezimaGrammarParser.IfBlockContext ctx){
	    boolean result = false;
	    switch(ctx.op.getType()){
	    case 6:
		if(mapa.get(ctx.NAME().getText()) == 0){
		    result = visit(ctx.stat());
		}
	    case 7:
		if(mapa.get(ctx.NAME().getText()) < 0){
		    result = visit(ctx.stat());
		}
	    case 8:
		if(mapa.get(ctx.NAME().getText()) > 0){
		    result = visit(ctx.stat());
		}
	    case 9:
		if(mapa.get(ctx.NAME().getText()) != 0){
		    result = visit(ctx.stat());
		}
	    }
	    System.out.println("condicionalesIf :" + valid);
	    return result;
	}
	/**
	 * Visit a parse tree produced by {@link pezimaGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    @Override public Boolean visitExpr(pezimaGrammarParser.ExprContext ctx){
	Iterator<pezimaGrammarParser.TermContext> targetterm = ctx.term().iterator();
	boolean result = visit(targetterm.next());
	while(targetterm.hasNext()){
	    boolean contsearch = visit(targetterm.next());
	    result = result && contsearch;
	}
	System.out.println("visit Expr :" + result);
	return result;
    }
    /**
     * Visit a parse tree produced by {@link pezimaGrammarParser#term}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override public Boolean visitTerm(pezimaGrammarParser.TermContext ctx){
	Iterator<pezimaGrammarParcer.FactorContext> targetfactor = ctx.factor().iterator();
	boolean result = visit(targetfactor.next());
	while(targetfactor.hasNext()){
	    boolean contsearch = visit(targetfactor.next());
	    result = result && contsearch;
	}
	System.out.println("VisitTerm :" + result);
	return result;
    }
    /**
     * Visit a parse tree produced by the {@code negNum}
     * labeled alternative in {@link pezimaGrammarParser#factor}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override public Boolean visitNegNum(pezimaGrammarParser.NegNumContext ctx){
	boolean result = false;

	if(ctx.NUM().getSymbol().getType() == 12){
	    result = true;
	}
	System.out.println("NEgValido:" + result);
	return result;
    }
    /**
     * Visit a parse tree produced by the {@code nombre}
     * labeled alternative in {@link pezimaGrammarParser#factor}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override public Boolean visitNombre(pezimaGrammarParser.NombreContext ctx){
	boolean result = false;
	if(ctx.NAME().getSymbol().getType() == 14){
	    result = true;
	}
	System.out.println("nomValido :" + result);
	return result;
    }
    /**
	 * Visit a parse tree produced by the {@code numero}
	 * labeled alternative in {@link pezimaGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    @Override public Boolean visitNumero(pezimaGrammarParser.NumeroContext ctx){
	boolean result = false;

	if(ctx.NUM().getSymbol().getType() == 15){
	    result = true;
	}
	System.out.println("NumValido :" + result);
	return result;
    }

