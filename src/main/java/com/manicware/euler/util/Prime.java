package com.manicware.euler.util;

import java.util.stream.Stream;

/**
 * Created by unamanic on 10/9/16.
 */
public interface Prime {

    /**
     * Checks to determine if n is prime.
     *
     * @param n
     * @return
     */
    boolean isPrime(long n);

    /**
     * Streams the first n primes
     *
     * @param limit
     * @return
     */
    Stream<Long> streamFirstPrimes(long limit);

    /**
     * Streams all primes lower than the limit
     *
     * @param limit
     * @return
     */
    Stream<Long> streamPrimesLowerThan(long limit);
}
