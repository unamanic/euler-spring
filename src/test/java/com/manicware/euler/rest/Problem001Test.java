package com.manicware.euler.rest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by unamanic on 10/8/16.
 */
public class Problem001Test {

    @Test(timeout = 60000)
    public void checkProblem0001With10() {
        Problem001 problem = new Problem001();
        String answer = problem.doProblem(10).getAnswer();
        assertEquals("23", answer);
    }

    @Test(timeout = 60000)
    public void checkProblem0001With1000() {
        Problem001 problem = new Problem001();
        String answer = problem.doProblem(1000).getAnswer();
        assertEquals("233168", answer);
    }

}