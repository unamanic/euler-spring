package com.manicware.euler.util.impl;

import com.manicware.euler.util.MathOperations;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by unamanic on 10/9/16.
 */
public class MathOperationsImplTest {

    @Test
    public void isPrime() throws Exception {
        MathOperations mathOperations = new MathOperationsImpl();
        assertEquals("Checking 2", true, mathOperations.isPrime(2));
        assertEquals("Checking 5", true, mathOperations.isPrime(5));
        assertEquals("Checking 9", false, mathOperations.isPrime(9));
        assertEquals("Checking 11", true, mathOperations.isPrime(11));
        assertEquals("Checking 12", false, mathOperations.isPrime(12));
        assertEquals("Checking 8000000008", false, mathOperations.isPrime(8000000008l));
        assertEquals("Checking 8660254037 ", true, mathOperations.isPrime(8660254037l));
    }

}