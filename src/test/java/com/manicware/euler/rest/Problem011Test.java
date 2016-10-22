package com.manicware.euler.rest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by unamanic on 10/22/16.
 */
public class Problem011Test {
    Problem011 problem = new Problem011();

    @Test
    public void calcRight() throws Exception {
        assertEquals(2647840, problem.calcRight(8, 6, 4));
    }

    @Test
    public void calcDown() throws Exception {
        assertEquals(4791800, problem.calcDown(8, 6, 4));
    }

    @Test
    public void calcDiagnalLeft() throws Exception {
        assertEquals(1788696, problem.calcDiagnalLeft(8, 6, 4));
    }

    @Test
    public void calcDiagnalRight() throws Exception {
        assertEquals(0, problem.calcDiagnalRight(8, 6, 4));
    }

    @Test
    public void findMaxForPostition() throws Exception {
        assertEquals(4791800, problem.findMaxForPostition(8, 6, 4));
    }


    @Test
    public void doProblem() throws Exception {

        assertEquals("70600674", problem.doProblem(4).getAnswer());

    }

}