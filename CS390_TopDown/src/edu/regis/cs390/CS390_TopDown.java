/*
 * Copyright (C) 2016 Richard Blumenthal, All Rights Reserved
 * Dissemination or reproduction of this code is strictly forbidden
 * unless prior written permission is obtained from Dr. Blumenthal
 */
package edu.regis.cs390;

import edu.regis.cs390.parser.ParseError;
import edu.regis.cs390.parser.PredictiveParser;
import edu.regis.cs390.parser.TreeNode;
import edu.regis.cs390.tok.Token;
import edu.regis.cs390.scan.Scanner;
import java.io.IOException;

/**
 * Demonstrates the execution of a simple Scanner and Predictive Parser 
 * for using Scott's (2016) Simple Calculator LL(1) grammar. 
 * 
 * @author Rickb
 */
public class CS390_TopDown {
    /**
     * If true, only Scanning is done, otherwise parsing is also done.
     */
    public static final boolean SCANNER_ONLY = false;
    
    /**
     * Entry point that begins a parse
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        String file = "Prog1.txt";
        
        try {
            Scanner scanner = new Scanner(file);
            
            if (SCANNER_ONLY) {
                for (Token token : scanner.scanAll())
                    System.out.println(token.lexeme + " : " + token.type);
                
            } else {
                PredictiveParser parser = new PredictiveParser(scanner);
            
                TreeNode parseTree = parser.parse();
                
                parseTree.prettyPrint();
            }
          
        } catch (ParseError e) {
            System.out.println("Parse error: " + e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}