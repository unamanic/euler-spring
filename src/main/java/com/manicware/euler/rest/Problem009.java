package com.manicware.euler.rest;

import com.codepoetics.protonpack.StreamUtils;
import com.manicware.euler.rest.response.Answer;
import com.manicware.euler.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Created by unamanic on 10/9/16.
 */
@RestController
@RequestMapping("/problem009")
@Qualifier("Problem009")
public class Problem009 implements Problem {

    private static final Logger log = LoggerFactory.getLogger(Problem009.class);

    private static final String QUESTION = "A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,\n" +
            "\n" +
            "a^2 + b^2 = c^2\n" +
            "For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.\n" +
            "\n" +
            "There exists exactly one Pythagorean triplet for which a + b + c = 1000.\n" +
            "Find the product abc.";

    @Override
    @RequestMapping("/")
    public Answer getQuestion() {
        Answer answer = new Answer();
        answer.setQuestion(QUESTION);
        return answer;
    }


    @Override
    @RequestMapping("/{limit}")
    public Answer doProblem(@PathVariable long limit) {
        Answer answer = new Answer();
        answer.setQuestion(QUESTION);
        long start = new Date().getTime();



        OptionalLong product = LongStream.range(1l, limit/2).map(a -> {
            OptionalLong foo = LongStream.range(a, limit - (a + 1)).map(b -> {
                long c = limit - (a + b);
                if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)){
                    return a * b * c;
                }
                return 0;
            }).filter(p -> p > 0).findFirst();
            if(foo.isPresent()){
                return  foo.getAsLong();
            }
            return 0;
        }).filter(p -> p > 0).findFirst();

        if(product.isPresent()) {
            answer.setAnswer(String.valueOf(product.getAsLong()));
        } else {
            answer.setAnswer("NONE");
        }

        answer.setTime(new Date().getTime() - start);
        return answer;
    }
}
