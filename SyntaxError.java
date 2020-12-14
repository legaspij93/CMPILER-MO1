import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class SyntaxError {
    private final Recognizer <?, ?> recognizer;
    private final Object offendingSymbol;
    private final int line;
    private final int charPosition;
    private final String message;
    private final RecognitionException e;
    String newMessage;
    SyntaxError (Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPosition, String msg, RecognitionException e)
    {
        this.recognizer = recognizer;
        this.offendingSymbol = offendingSymbol;
        this.line = line;
        this.charPosition = charPosition;
        this.message = msg;
        this.e = e;

        newMessage ="ERROR: ("+ line + charPosition + ")";
    }

public Recognizer<?, ?> getRecognizer(){
    return recognizer;
}

public Object getOffendingSymbol(){
    return offendingSymbol;
}

public int getLine(){
    return line;
}

public int getCharPosition() {
    return charPosition;
}

public String getMessage(){
    return message;
}

public RecognitionException getException()
{
    return e;
}
}

