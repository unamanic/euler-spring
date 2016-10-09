package com.manicware.euler.rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by unamanic on 10/8/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Problem004TestConfig.class)
public class Problem004Test {

    @Autowired
    private Problem004 problem004;

    @Test(timeout = 60000)
    public void doProblem() throws Exception {
        assertEquals("906609", problem004.doProblem(3).getAnswer());
    }

}