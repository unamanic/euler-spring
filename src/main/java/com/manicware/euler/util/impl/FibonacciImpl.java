package com.manicware.euler.util.impl;

import com.codepoetics.protonpack.StreamUtils;
import com.manicware.euler.util.Fibonacci;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by unamanic on 10/8/16.
 */
@Component
public class FibonacciImpl implements Fibonacci {

    /**
     * {@inheritDoc}
     *
     * @param n
     * @return
     */
    @Override
    public Stream<BigInteger> streamFirst(long n){
        //Unending stream of Fibonacci
        Stream<BigInteger[]> infinateFibs = Stream.iterate(new BigInteger[]{ BigInteger.ZERO, BigInteger.ONE, BigInteger.ZERO },
                p->new BigInteger[]{ p[1], p[0].add(p[1]), p[2].add(BigInteger.ONE) });
        ///Terminate stream when number of fibs is reached
        Stream<BigInteger[]> fibs = StreamUtils.takeWhile(infinateFibs, p -> !p[2].equals(new BigInteger(String.valueOf(n))));

        return fibs.map(p -> p[1]);
    }

    /**
     * {@inheritDoc}
     *
     * @param n
     * @return
     */
    @Override
    public BigInteger find(long n){
        List<BigInteger> fibList = streamFirst(n).collect(Collectors.toList());

        return fibList.get(fibList.size() - 1);
    }

    /**
     * {@inheritDoc}
     *
     * @param limit
     * @return
     */
    @Override
    public Stream<BigInteger> streamToLimit(long limit){

        Stream<BigInteger[]> infinateFibs = Stream.iterate(new BigInteger[]{ BigInteger.ZERO, BigInteger.ONE },
                p->new BigInteger[]{ p[1], p[0].add(p[1])});
        ///Terminate stream when number of fibs is reached
        Stream<BigInteger[]> fibs = StreamUtils.takeWhile(infinateFibs, p -> p[1].compareTo(new BigInteger(String.valueOf(limit))) < 0);
        return fibs.map(p -> p[1]);
    }
}
