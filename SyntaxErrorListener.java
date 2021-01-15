import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.antlr.v4.runtime.*;

public class SyntaxErrorListener extends BaseErrorListener {
    public static ArrayList<SyntaxError> errorsArray = new ArrayList<SyntaxError>();

    public static SyntaxErrorListener INSTANCE = new SyntaxErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
    {
        String errorLog = msg;
        if(errorLog.contains("extraneous input")){
            if(errorLog.contains("extraneous input ')' expecting ';'")){
                errorLog = "Mismatched parenthesis.";
                errorsArray.add(new SyntaxError(recognizer, offendingSymbol, line, charPositionInLine, errorLog, e));
            }
        }
        else if(errorLog.contains("missing '}'")){
            errorLog = "Missing closing curly braces.";
            errorsArray.add(new SyntaxError(recognizer, offendingSymbol, line, charPositionInLine, errorLog, e));
        }
        else if(errorLog.contains("missing ';' at '('")){
            errorLog = "Mismatched parenthesis.";
            errorsArray.add(new SyntaxError(recognizer, offendingSymbol, line, charPositionInLine, errorLog, e));
        }
        else if(errorLog.contains("printStatement")){
            errorLog = msg;
            errorLog = errorLog.replace("rule printStatement ", "");
            errorsArray.add(new SyntaxError(recognizer, offendingSymbol, line, charPositionInLine, errorLog, e));
        }
        else{
            errorLog = errorLog.replace("rule forCondition ", "");
            errorLog = errorLog.replace("rule postfixExpression ", "");
            errorLog = errorLog.replace("rule additiveExpression ", "");
            errorLog = errorLog.replace("rule comparisonStatement ", "");
            errorLog = errorLog.replace("rule jumpStatement ", "");
            errorLog = errorLog.replace("rule assignmentExpression ", "");
            errorLog = errorLog.replace("rule equalityExpression ", "");
            errorLog = errorLog.replace("rule multiplicativeExpression ", "");
            errorLog = errorLog.replace("rule expression ", "");
            errorLog = errorLog.replace("rule typedefName ", "");
            errorsArray.add(new SyntaxError(recognizer, offendingSymbol, line, charPositionInLine, errorLog, e));
        }

    }
}