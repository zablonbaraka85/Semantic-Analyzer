/*
 * Copyright (C) 2016 Richard Blumenthal, All Rights Reserved
 * Dissemination or reproduction of this code is strictly forbidden
 * unless prior written permission is obtained from Dr. Blumenthal
 */
package edu.regis.cs390.parser;

import edu.regis.cs390.tok.TokenType;

/**
 *
 * @author Rickb
 */
public class ParseError extends Exception {
    public ParseError(TokenType type, int lineNo) {
        this("Expecting " + type + " at " + lineNo);
    }
    
    public ParseError(String msg) {
        super(msg);
    }
}
