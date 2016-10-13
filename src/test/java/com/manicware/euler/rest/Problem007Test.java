package com.manicware.euler.rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by unamanic on 10/12/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Problem007TestConfig.class)
public class Problem007Test {

    @Autowired
    Problem007 problem007;

    @Test(timeout = 60000)
    public void doProblem() throws Exception {
        assertEquals("13", problem007.doProblem(6).getAnswer());
    }

}