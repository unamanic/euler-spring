package com.manicware.euler.rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by unamanic on 10/8/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Problem002TestConfig.class)
public class Problem002Test {

    @Autowired
    private Problem002 problem002;

    @Test(timeout = 60000)
    public void doProblem() throws Exception {
        assertEquals("4613732", problem002.doProblem(4000000).getAnswer());
    }

}