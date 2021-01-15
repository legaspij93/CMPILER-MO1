/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Arrays;

import static org.antlr.v4.runtime.CharStreams.fromFileName;
import static org.antlr.v4.runtime.CharStreams.fromString;

/**
 *
 * @author JUSTIN CHUA, JOHN GABRIEL LEGASPI and JUDE KANG
 */
public class Main {

    public static void main(String[] args) throws IOException {

        String s = "testinput.txt";
        CharStream stream = fromFileName(s);
        TripleJLexer lexer  = new TripleJLexer(stream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        TripleJParser parser = new TripleJParser(tokenStream);

        SyntaxErrorListener SEListener = new SyntaxErrorListener();

        parser.removeErrorListener(ConsoleErrorListener.INSTANCE);

        parser.addErrorListener(SEListener);

        TripleJParser.CompilationUnitContext tree = parser.compilationUnit();

        TripleJBaseListener listener = new TripleJBaseListener();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener,tree);

        //Code for showing the tree in GUI
        JFrame frame = new JFrame("Antlr Tree");
        JPanel panel = new JPanel();
        frame.setLocationByPlatform(true);
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);

        viewr.setScale(1);//scale a little

        panel.add(viewr);
        JScrollPane scrollPane = new JScrollPane(panel);
        frame.add(scrollPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);

        //GUI Showing error
        JFrame frame2 = new JFrame("Triple J Console");
        JPanel panel2 = new JPanel();
        JTextArea textarea = new JTextArea();
        panel2.add(textarea);
        textarea.setEditable(false);
        frame2. setLocationByPlatform(true);
        for(int i=0;i<SEListener.errorsArray.size();i++) {
            System.out.println("Line " + SEListener.errorsArray.get(i).getLine());
            System.out.println("Message: "+SEListener.errorsArray.get(i).getOffendingSymbol());
            String msg = SEListener.errorsArray.get(i).getMessage();
            String error = msg.split("'")[1];
            System.out.println(msg.split("'")[0]);
            System.out.println("Error symbols found: " + error);
            System.out.println("_____________________________________________________________");
            if (msg.contains("missing")) {
                textarea.append("(Syntax Error at Line " + SEListener.errorsArray.get(i).getLine() + ") " + "Missing -> " + error + "\n");
            }
            else if (msg.contains("extraneous input")){
                textarea.append("(Syntax Error at Line " + SEListener.errorsArray.get(i).getLine() + ") "+ "Extra character/s -> " + error + "\n");
            }
            else if(msg.contains("mismatched input")){
                textarea.append("(Syntax Error at Line " + SEListener.errorsArray.get(i).getLine() + ") "+ "Unexpected -> " + error + "\n");
            }
            else if(msg.contains("no viable alternative at input")){
                String test = SEListener.errorsArray.get(i).getOffendingSymbol().toString();
                test = test.split("'")[1];
                textarea.append("(Syntax Error at Line " + SEListener.errorsArray.get(i).getLine() + ") "+ "Consider changing symbol in expression -> " + test + "\n");
            }
            else if(msg.contains("cannot find symbol")){
                textarea.append("(Syntax Error at Line " + SEListener.errorsArray.get(i).getLine() + ") "+ "Missing symbol -> " + error + "\n");
            }
            else {
                textarea.append("(Syntax Error at Line " + SEListener.errorsArray.get(i).getLine() + ") " + SEListener.errorsArray.get(i).getMessage() + "\n");
            }
        }

        JScrollPane scrollPane2 = new JScrollPane(panel2);
        frame2.add(scrollPane2);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(400,400);
        frame2.setVisible(true);

        //FRAME 3 CONTAINS INPUT
        JFrame textEditor = new JFrame("Triple J TextEditor");
        JPanel panel3 = new JPanel();
        JButton fontCompileButton = new JButton("Compile");
        JTextArea textarea2 = new JTextArea("Place Input here");
        textarea2.setLineWrap(false);
        textarea2.setWrapStyleWord(false);
        textarea2.setFont(new Font("Arial",Font.PLAIN,12));
        textEditor. setLocationByPlatform(true);

        fontCompileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                process(textarea2.getText(),textarea,viewr);
                panel.repaint();
                panel.revalidate();
            }
        });

        panel3.add(fontCompileButton);
        panel3.add(textarea2);
        textEditor.add(panel3);
        textEditor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textEditor.setSize(1000, 400);
        textEditor.setVisible(true);

    }

    static public void process(String input, JTextArea errors, TreeViewer viewr){
        CharStream stream = fromString(input);
        TripleJLexer lexer  = new TripleJLexer(stream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        TripleJParser parser = new TripleJParser(tokenStream);

        SyntaxErrorListener listener = new SyntaxErrorListener();
        parser.addErrorListener(listener);
        TripleJParser.CompilationUnitContext tree = parser.compilationUnit();

        errors.setText("");
        for(int i=0;i<listener.errorsArray.size();i++){
            String msg = listener.errorsArray.get(i).getMessage();
            String error = msg;//.split("'")[1];
            System.out.println(error);
            if (msg.contains("missing")) {
                errors.append("(Syntax Error at Line " + listener.errorsArray.get(i).getLine() + ") "+ "Missing -> " + error + "\n");
            } else if (msg.contains("extraneous input")){
                errors.append("(Syntax Error at Line " + listener.errorsArray.get(i).getLine() + ") "+ "Extra character/s -> " + error + "\n");
            }
            else if(msg.contains("mismatched input")){
                errors.append("(Syntax Error at Line " + listener.errorsArray.get(i).getLine() + ") "+ "Unexpected -> " + error + "\n");
            }
            else if(msg.contains("no viable alternative at input")){
                String test = listener.errorsArray.get(i).getOffendingSymbol().toString();
                test = test.split("'")[1];
                errors.append("(Syntax Error at Line " + listener.errorsArray.get(i).getLine() + ") "+ "Consider changing symbol in expression -> " + test + "\n");
            }
            else if(msg.contains("cannot find symbol")){
                errors.append("(Syntax Error at Line " + listener.errorsArray.get(i).getLine() + ") "+ "Missing symbol -> " + error + "\n");
            }
            else {
                errors.append("(Syntax Error at Line " + listener.errorsArray.get(i).getLine() + ") "+ listener.errorsArray.get(i).getMessage() + "\n");
            }
        }

        viewr.setScale(1);//scale a little
        viewr.setRuleNames(Arrays.asList(parser.getRuleNames()));
        viewr.setTree(tree);
    }
}