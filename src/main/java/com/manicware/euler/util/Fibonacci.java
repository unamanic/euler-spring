package com.manicware.euler.util;

import java.math.BigInteger;
import java.util.stream.Stream;

/**
 * Created by unamanic on 10/8/16.
 */
public interface Fibonacci {
    Stream<BigInteger> streamFirst(long n);

    BigInteger find(long n);

    Stream<BigInteger> streamToLimit(long limit);
}