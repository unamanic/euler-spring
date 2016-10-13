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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by unamanic on 10/9/16.
 */
@RestController
@RequestMapping("/problem005")
@Qualifier("Problem006")
public class Problem006 implements Problem {

    private static final Logger log = LoggerFactory.getLogger(Problem006.class);

    private static final String QUESTION = "The sum of the squares of the first ten natural numbers is,\n" +
            "\n" +
            "1^2 + 2^2 + ... + 10^2 = 385\n" +
            "The square of the sum of the first ten natural numbers is,\n" +
            "\n" +
            "(1 + 2 + ... + 10)^2 = 552 = 3025\n" +
            "Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.\n" +
            "\n" +
            "Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.\n" +
            "\n";

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


        answer.setAnswer(String.valueOf(null));

        answer.setTime(new Date().getTime() - start);
        return answer;    }
}
