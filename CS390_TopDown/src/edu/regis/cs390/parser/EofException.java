/*
 * Copyright (C) 2016 Richard Blumenthal, All Rights Reserved
 * Dissemination or reproduction of this code is strictly forbidden
 * unless prior written permission is obtained from Dr. Blumenthal
 */
package edu.regis.cs390.parser;

/**
 *
 * @author Rickb
 */
public class EofException extends Exception {
    public EofException (String msg) {
        super(msg);
    }
}
