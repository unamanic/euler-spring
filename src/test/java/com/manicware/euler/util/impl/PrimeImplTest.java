package com.manicware.euler.util.impl;

import com.manicware.euler.util.Prime;
import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * Created by unamanic on 10/9/16.
 */
public class PrimeImplTest {

    Prime prime = new PrimeImpl();

    @Test
    public void streamFirstPrimes() throws Exception {
        Stream<Long> firstPrimes = prime.streamFirstPrimes(10l);
        assertEquals("Count list", true, firstPrimes.count() == 10);
    }

    @Test
    public void streamPrimesLowerThan() throws Exception {
        Stream<Long> firstPrimes = prime.streamPrimesLowerThan(23l);
        assertEquals("Count list", true, firstPrimes.count() == 10);
    }

    @Test
    public void isPrime() throws Exception {
        assertEquals("Checking 2", true, prime.isPrime(2));
        assertEquals("Checking 5", true, prime.isPrime(5));
        assertEquals("Checking 9", false, prime.isPrime(9));
        assertEquals("Checking 11", true, prime.isPrime(11));
        assertEquals("Checking 12", false, prime.isPrime(12));
        assertEquals("Checking 8000000008", false, prime.isPrime(8000000008l));
        assertEquals("Checking 8660254037 ", true, prime.isPrime(8660254037l));
    }



}