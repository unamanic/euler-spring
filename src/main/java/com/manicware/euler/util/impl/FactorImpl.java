package com.manicware.euler.util.impl;

import com.manicware.euler.util.Prime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.LongStream;
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
        return factors(in).keySet().stream();
    }

    public Map<Long, Long> factors(long num) {
        Map<Long, Long> factors = new HashMap<>();

        long val = num;
        while(!prime.isPrime(val)){
            final long intVal = val;
            long factor = prime.streamPrimesLowerThan(num/2 + 1).filter(p -> intVal % p == 0).findFirst().get();
            val = val /factor;
            long count = factors.getOrDefault(factor, 0l);
            factors.put(factor, ++count);
        }
        long count = factors.getOrDefault(val, 0l);
        factors.put(val, ++count);
        return factors;
    }

}
