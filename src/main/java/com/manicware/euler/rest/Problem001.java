package com.manicware.euler.rest;

import com.manicware.euler.rest.response.Answer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.stream.IntStream;

/**
 * Created by unamanic on 10/8/16.
 */
@RestController
@RequestMapping("/problem001")
@Qualifier("Problem001")
public class Problem001 implements Problem {

    private static final Logger log = LoggerFactory.getLogger(Problem001.class);

    private static final String QUESTION = "If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.\n" +
            "\n" +
            "Find the sum of all the multiples of 3 or 5 below 1000.";

    @Override
    @RequestMapping("/")
    public Answer getQuestion() {
        Answer answer = new Answer();
        answer.setQuestion(QUESTION);
        return answer;
    }

    @RequestMapping("/{limit}")
    public Answer doProblem(@PathVariable long limit) {
        Answer answer = new Answer();
        answer.setQuestion(QUESTION);
        long start = new Date().getTime();

        int sum = IntStream.range(1, (int)limit).parallel().map(i -> {
            if (i % 3 == 0 || i % 5 == 0){
                return i;
            }
            return 0;
        }).sum();

        answer.setAnswer(String.valueOf(sum));

        answer.setTime(new Date().getTime() - start);
        return answer;
    }
}
