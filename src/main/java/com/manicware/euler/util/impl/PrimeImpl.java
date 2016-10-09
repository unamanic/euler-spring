package com.manicware.euler.util.impl;

import com.codepoetics.protonpack.StreamUtils;
import com.manicware.euler.util.Prime;
import org.springframework.stereotype.Component;

import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Created by unamanic on 10/9/16.
 */
@Component
public class PrimeImpl implements Prime {

    /**
     * {@inheritDoc}
     * @param n
     * @return
     */
    @Override
    public boolean isPrime(long n){
        if(n == 1 || n == 2){
            return true;
        }
        return !LongStream.range(2, (long)java.lang.Math.sqrt(n) + 1).boxed()
                .parallel()
                .anyMatch(p -> n % p ==0);
    }

    @Override
    public Stream<Long> streamFirstPrimes(long limit) {
        return Stream.iterate(1l, p -> p + 1)
                .filter(p -> isPrime(p))
                .limit(limit);
    }

    @Override
    public Stream<Long> streamPrimesLowerThan(long limit) {
        Stream<Long> infinitePrimeStream = Stream.iterate(1l, p -> p + 1)
                .filter(p -> isPrime(p));
        return StreamUtils.takeWhile(infinitePrimeStream, p -> p <= limit);
    }
}
