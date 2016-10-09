package com.manicware.euler.util;

import java.math.BigInteger;
import java.util.stream.Stream;

/**
 * Created by unamanic on 10/8/16.
 */
public interface Fibonacci {

    /**
     * Produces a stream of the first n Fibonacci numbers.
     *
     * @param n
     * @return
     */
    Stream<BigInteger> streamFirst(long n);


    /**
     * Returns the nth Fibonacci number.
     *
     * @param n
     * @return
     */
    BigInteger find(long n);

    /**
     * Produces a stream of Fibonacci numbers less than the provided limit.
     *
     * @param limit
     * @return
     */
    Stream<BigInteger> streamToLimit(long limit);
}