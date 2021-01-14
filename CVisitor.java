// Generated from C:/Users/Jude Kang/Desktop/CMPILER MP 3/src\C.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#block_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_content(CParser.Block_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(CParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(CParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(CParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#returnstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstatement(CParser.ReturnstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(CParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#intparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntparameter(CParser.IntparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#booleanparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanparameter(CParser.BooleanparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#floatparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatparameter(CParser.FloatparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#stringparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringparameter(CParser.StringparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#charparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharparameter(CParser.CharparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#arrayparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayparameter(CParser.ArrayparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#constantdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantdeclaration(CParser.ConstantdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#singledeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingledeclaration(CParser.SingledeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#arraydeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraydeclaration(CParser.ArraydeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#booleandeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleandeclaration(CParser.BooleandeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#booleanarrdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanarrdeclaration(CParser.BooleanarrdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#intdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntdeclaration(CParser.IntdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#stringdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringdeclaration(CParser.StringdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#intarrdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntarrdeclaration(CParser.IntarrdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#floatdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatdeclaration(CParser.FloatdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#floatarrdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatarrdeclaration(CParser.FloatarrdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#chardeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChardeclaration(CParser.ChardeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#chararrdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChararrdeclaration(CParser.ChararrdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(CParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(CParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#loopfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopfor(CParser.LoopforContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#loopwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopwhile(CParser.LoopwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#loopdowhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopdowhile(CParser.LoopdowhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(CParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#opr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpr(CParser.OprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#plus_minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus_minus(CParser.Plus_minusContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#multopr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultopr(CParser.MultoprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#mult_div_mod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult_div_mod(CParser.Mult_div_modContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#terminalopr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminalopr(CParser.TerminaloprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#shortopr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortopr(CParser.ShortoprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(CParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#scan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScan(CParser.ScanContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#booleanexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanexp(CParser.BooleanexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#booleanvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanvalue(CParser.BooleanvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(CParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(CParser.LogicContext ctx);
}