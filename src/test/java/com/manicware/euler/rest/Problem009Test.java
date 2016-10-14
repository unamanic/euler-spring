package com.manicware.euler.rest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by unamanic on 10/14/16.
 */
public class Problem009Test {

    Problem problem = new Problem009();

    @Test
    public void doProblem() throws Exception {
        assertEquals("60", problem.doProblem(12).getAnswer());
    }

}