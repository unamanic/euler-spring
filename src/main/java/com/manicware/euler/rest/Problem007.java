package com.manicware.euler.rest;

import com.manicware.euler.rest.response.Answer;
import com.manicware.euler.util.Prime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.Comparator;
import java.util.Date;
import java.util.stream.LongStream;

/**
 * Created by unamanic on 10/9/16.
 */
@RestController
@RequestMapping("/problem007")
@Qualifier("Problem007")
public class Problem007 implements Problem {


    private static final Logger log = LoggerFactory.getLogger(Problem007.class);

    private static final String QUESTION = "By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.\n" +
            "\n" +
            "What is the 10001st prime number?";

    Prime prime;

    @Autowired
    public Problem007(Prime prime) {
        this.prime = prime;
    }

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

        long max = prime.streamFirstPrimes(limit).max(Comparator.naturalOrder()).get();

        answer.setAnswer(String.valueOf(max));

        answer.setTime(new Date().getTime() - start);
        return answer;
    }
}
