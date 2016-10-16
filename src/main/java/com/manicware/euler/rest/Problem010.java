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

import java.util.Date;
import java.util.OptionalLong;
import java.util.stream.LongStream;

/**
 * Created by unamanic on 10/9/16.
 */
@RestController
@RequestMapping("/problem010")
@Qualifier("Problem010")
public class Problem010 implements Problem {

    private static final Logger log = LoggerFactory.getLogger(Problem010.class);

    private static final String QUESTION = "The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.\n" +
            "\n" +
            "Find the sum of all the primes below two million.";

    private final Prime prime;

    @Autowired
    public Problem010(Prime prime) {
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



        answer.setTime(new Date().getTime() - start);
        return answer;
    }
}
