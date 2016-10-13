package com.manicware.euler.rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by unamanic on 10/12/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Problem005TestConfig.class)
public class Problem005Test {

    @Autowired
    Problem005 problem005;

    @Test(timeout = 60000)
    public void doProblem() throws Exception {
        assertEquals("2520", problem005.doProblem(10).getAnswer());
    }

}