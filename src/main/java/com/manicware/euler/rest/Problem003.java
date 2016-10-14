package com.manicware.euler.rest;

import com.manicware.euler.rest.response.Answer;
import com.manicware.euler.util.Factor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by unamanic on 10/9/16.
 */
@RestController
@RequestMapping("/problem003")
@Qualifier("Problem003")
public class Problem003 implements Problem {

    private static final Logger log = LoggerFactory.getLogger(Problem003.class);

    private static final String QUESTION = "The prime factors of 13195 are 5, 7, 13 and 29.\n" +
            "\n" +
            "What is the largest prime factor of the number 600851475143 ?";

    Factor factor;

    @Autowired
    public Problem003(Factor factor) {
        this.factor = factor;
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

        List<Long> factors = factor.streamPrimeFactors(limit).collect(Collectors.toList());
        Long ans = factors.stream().max(Comparator.naturalOrder()).get();

        answer.setAnswer(ans.toString());

        answer.setTime(new Date().getTime() - start);
        return answer;    }
}
