package com.manicware.euler.rest;

import com.manicware.euler.rest.response.Answer;
import com.manicware.euler.util.Factor;
import com.manicware.euler.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by unamanic on 10/9/16.
 */
@RestController
@RequestMapping("/problem005")
@Qualifier("Problem005")
public class Problem005 implements Problem {

    private static final Logger log = LoggerFactory.getLogger(Problem005.class);

    private static final String QUESTION = "2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.\n" +
            "\n" +
            "What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?";

    @Autowired
    Factor factor;

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

        Map<Long, Long> factorMap = new HashMap<>();

        for(long i = 1; i <= limit; i++){
            Map<Long, Long> factors = factor.factors(i);
            factors.keySet().stream()
                    .filter(key -> factors.get(key) > factorMap.getOrDefault(key, 0l))
                    .forEach(key -> {
                        factorMap.put(key, factors.get(key));
                    });
        }

        long ans = factorMap.keySet().stream().reduce(1l, (a, b) -> a * (long)Math.pow(b, factorMap.get(b)));

        answer.setAnswer(String.valueOf(ans));

        answer.setTime(new Date().getTime() - start);
        return answer;    }
}
