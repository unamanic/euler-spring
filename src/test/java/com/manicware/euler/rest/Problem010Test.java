package com.manicware.euler.rest;

import com.manicware.euler.util.Prime;
import com.manicware.euler.util.impl.PrimeImpl;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by unamanic on 10/16/16.
 */
public class Problem010Test {

    Prime prime = new PrimeImpl();

    Problem problem = new Problem010(prime);

    @Test
    public void doProblem() throws Exception {
        assertEquals("Sum of all prines less than 10 should be 17", "17", problem.doProblem(10).getAnswer());
    }

}