package com.manicware.euler.rest;

import com.manicware.euler.util.Fibonacci;
import com.manicware.euler.util.impl.FibonacciImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by unamanic on 10/8/16.
 */
public class Problem002Test {

    @Autowired
    private Problem002 problem002 = new Problem002(new FibonacciImpl());

    @Test(timeout = 60000)
    public void doProblem() throws Exception {
        assertEquals("4613732", problem002.doProblem(4000000).getAnswer());
    }

}