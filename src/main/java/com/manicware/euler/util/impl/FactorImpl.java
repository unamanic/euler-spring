package com.manicware.euler.util.impl;

import com.manicware.euler.util.Prime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

/**
 * Created by unamanic on 10/9/16.
 */
@Component
public class FactorImpl implements com.manicware.euler.util.Factor {

    @Autowired
    Prime prime;

    /**
     * {@inheritDoc}
     * @param in
     * @return
     */
    @Override
    public Stream<Long> streamPrimeFactors(long in){
        return prime.streamPrimesLowerThan(in)
                .filter(p -> in % p == 0);
    }

}
