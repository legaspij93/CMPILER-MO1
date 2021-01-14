// Generated from C:/Users/Jude Kang/Desktop/CMPILER MP 3/src\C.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CParser}.
 */
public interface CListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#block_content}.
	 * @param ctx the parse tree
	 */
	void enterBlock_content(CParser.Block_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#block_content}.
	 * @param ctx the parse tree
	 */
	void exitBlock_content(CParser.Block_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(CParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(CParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(CParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(CParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#returnstatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnstatement(CParser.ReturnstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#returnstatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnstatement(CParser.ReturnstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(CParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(CParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#intparameter}.
	 * @param ctx the parse tree
	 */
	void enterIntparameter(CParser.IntparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#intparameter}.
	 * @param ctx the parse tree
	 */
	void exitIntparameter(CParser.IntparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#booleanparameter}.
	 * @param ctx the parse tree
	 */
	void enterBooleanparameter(CParser.BooleanparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#booleanparameter}.
	 * @param ctx the parse tree
	 */
	void exitBooleanparameter(CParser.BooleanparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#floatparameter}.
	 * @param ctx the parse tree
	 */
	void enterFloatparameter(CParser.FloatparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#floatparameter}.
	 * @param ctx the parse tree
	 */
	void exitFloatparameter(CParser.FloatparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#stringparameter}.
	 * @param ctx the parse tree
	 */
	void enterStringparameter(CParser.StringparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#stringparameter}.
	 * @param ctx the parse tree
	 */
	void exitStringparameter(CParser.StringparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#charparameter}.
	 * @param ctx the parse tree
	 */
	void enterCharparameter(CParser.CharparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#charparameter}.
	 * @param ctx the parse tree
	 */
	void exitCharparameter(CParser.CharparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#arrayparameter}.
	 * @param ctx the parse tree
	 */
	void enterArrayparameter(CParser.ArrayparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#arrayparameter}.
	 * @param ctx the parse tree
	 */
	void exitArrayparameter(CParser.ArrayparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#constantdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantdeclaration(CParser.ConstantdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#constantdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantdeclaration(CParser.ConstantdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#singledeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingledeclaration(CParser.SingledeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#singledeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingledeclaration(CParser.SingledeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#arraydeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArraydeclaration(CParser.ArraydeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#arraydeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArraydeclaration(CParser.ArraydeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#booleandeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBooleandeclaration(CParser.BooleandeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#booleandeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBooleandeclaration(CParser.BooleandeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#booleanarrdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBooleanarrdeclaration(CParser.BooleanarrdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#booleanarrdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBooleanarrdeclaration(CParser.BooleanarrdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#intdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIntdeclaration(CParser.IntdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#intdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIntdeclaration(CParser.IntdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#stringdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStringdeclaration(CParser.StringdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#stringdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStringdeclaration(CParser.StringdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#intarrdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIntarrdeclaration(CParser.IntarrdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#intarrdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIntarrdeclaration(CParser.IntarrdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#floatdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFloatdeclaration(CParser.FloatdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#floatdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFloatdeclaration(CParser.FloatdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#floatarrdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFloatarrdeclaration(CParser.FloatarrdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#floatarrdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFloatarrdeclaration(CParser.FloatarrdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#chardeclaration}.
	 * @param ctx the parse tree
	 */
	void enterChardeclaration(CParser.ChardeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#chardeclaration}.
	 * @param ctx the parse tree
	 */
	void exitChardeclaration(CParser.ChardeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#chararrdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterChararrdeclaration(CParser.ChararrdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#chararrdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitChararrdeclaration(CParser.ChararrdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(CParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(CParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#loopfor}.
	 * @param ctx the parse tree
	 */
	void enterLoopfor(CParser.LoopforContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#loopfor}.
	 * @param ctx the parse tree
	 */
	void exitLoopfor(CParser.LoopforContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#loopwhile}.
	 * @param ctx the parse tree
	 */
	void enterLoopwhile(CParser.LoopwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#loopwhile}.
	 * @param ctx the parse tree
	 */
	void exitLoopwhile(CParser.LoopwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#loopdowhile}.
	 * @param ctx the parse tree
	 */
	void enterLoopdowhile(CParser.LoopdowhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#loopdowhile}.
	 * @param ctx the parse tree
	 */
	void exitLoopdowhile(CParser.LoopdowhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(CParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(CParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#opr}.
	 * @param ctx the parse tree
	 */
	void enterOpr(CParser.OprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#opr}.
	 * @param ctx the parse tree
	 */
	void exitOpr(CParser.OprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#plus_minus}.
	 * @param ctx the parse tree
	 */
	void enterPlus_minus(CParser.Plus_minusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#plus_minus}.
	 * @param ctx the parse tree
	 */
	void exitPlus_minus(CParser.Plus_minusContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#multopr}.
	 * @param ctx the parse tree
	 */
	void enterMultopr(CParser.MultoprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#multopr}.
	 * @param ctx the parse tree
	 */
	void exitMultopr(CParser.MultoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#mult_div_mod}.
	 * @param ctx the parse tree
	 */
	void enterMult_div_mod(CParser.Mult_div_modContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#mult_div_mod}.
	 * @param ctx the parse tree
	 */
	void exitMult_div_mod(CParser.Mult_div_modContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#terminalopr}.
	 * @param ctx the parse tree
	 */
	void enterTerminalopr(CParser.TerminaloprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#terminalopr}.
	 * @param ctx the parse tree
	 */
	void exitTerminalopr(CParser.TerminaloprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#shortopr}.
	 * @param ctx the parse tree
	 */
	void enterShortopr(CParser.ShortoprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#shortopr}.
	 * @param ctx the parse tree
	 */
	void exitShortopr(CParser.ShortoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(CParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(CParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#scan}.
	 * @param ctx the parse tree
	 */
	void enterScan(CParser.ScanContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#scan}.
	 * @param ctx the parse tree
	 */
	void exitScan(CParser.ScanContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void enterBooleanexp(CParser.BooleanexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void exitBooleanexp(CParser.BooleanexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#booleanvalue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanvalue(CParser.BooleanvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#booleanvalue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanvalue(CParser.BooleanvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(CParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(CParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(CParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(CParser.LogicContext ctx);
}