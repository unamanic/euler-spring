package com.manicware.euler.util.impl;

import com.manicware.euler.util.Fibonacci;
import org.junit.Test;

import java.math.BigInteger;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 * Created by unamanic on 10/8/16.
 */
public class FibonacciImplTest {
    Fibonacci fibonacci = new FibonacciImpl();

    @Test
    public void streamFirst() throws Exception {
        assertEquals(10, fibonacci.streamFirst(10).count());
        assertEquals("55", fibonacci.streamFirst(10).collect(Collectors.toList()).get(9).toString());
    }

    @Test
    public void streamToLimit() throws Exception {
        assertEquals("55", fibonacci.streamToLimit(60).collect(Collectors.toList()).get(9).toString());
    }

    @Test
    public void findFibonacci(){

        assertEquals(new BigInteger("55"), fibonacci.find(10));
    }

}