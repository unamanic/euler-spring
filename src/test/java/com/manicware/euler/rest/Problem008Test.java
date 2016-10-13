package com.manicware.euler.rest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by unamanic on 10/13/16.
 */
public class Problem008Test {

    Problem008 problem008 = new Problem008();

    @Test
    public void doProblem() throws Exception {
        assertEquals("5832", problem008.doProblem(4).getAnswer());
    }

}