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

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

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

    StringUtils stringUtils;

    @Autowired
    public Problem004(StringUtils stringUtils) {
        this.stringUtils = stringUtils;
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

        long low = (long)Math.pow(10, limit - 1);
        long high = (long)Math.pow(10, limit) - 1;
        long max = 0;
        List<Long> set = LongStream.range(low, high).boxed().collect(Collectors.toList());
        for(long i: set){
            for (long j: set){
                if(i * j > max && stringUtils.isPalindrome(String.valueOf(i*j))){
                    max = i * j;
                }
            }
        }
        answer.setAnswer(String.valueOf(max));

        answer.setTime(new Date().getTime() - start);
        return answer;    }
}
