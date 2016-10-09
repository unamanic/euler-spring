package com.manicware.euler.util.impl;

import com.manicware.euler.util.MathOperations;

import java.util.stream.LongStream;

/**
 * Created by unamanic on 10/9/16.
 */
public class MathOperationsImpl implements MathOperations {

    @Override
    public boolean isPrime(long n){
        if(n == 1 || n == 2){
            return true;
        }
        return !LongStream.range(2, (long)java.lang.Math.sqrt(n) + 1).boxed()
                .parallel()
                .anyMatch(p -> n % p ==0);
    }
}
