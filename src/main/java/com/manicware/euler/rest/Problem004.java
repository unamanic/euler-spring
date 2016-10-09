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
@RequestMapping("/problem004")
@Qualifier("Problem004")
public class Problem004 implements Problem {

    private static final Logger log = LoggerFactory.getLogger(Problem004.class);

    private static final String QUESTION = "A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.\n" +
            "\n" +
            "Find the largest palindrome made from the product of two 3-digit numbers.";

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

        answer.setAnswer(null);

        answer.setTime(new Date().getTime() - start);
        return answer;    }
}
