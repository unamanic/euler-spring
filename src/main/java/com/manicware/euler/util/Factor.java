package com.manicware.euler.util;

import java.util.stream.Stream;

/**
 * Created by unamanic on 10/9/16.
 */
public interface Factor {

    /**
     * Streams all prime factors from input number
     *
     * @param in
     * @return
     */
    Stream<Long> streamPrimeFactors(long in);
}
