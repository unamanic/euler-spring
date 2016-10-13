package com.manicware.euler.rest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by unamanic on 10/12/16.
 */
public class Problem006Test {

    Problem006 problem006 = new Problem006();

    @Test
    public void doProblem() throws Exception {
        assertEquals("2640", problem006.doProblem(10).getAnswer());
    }

}