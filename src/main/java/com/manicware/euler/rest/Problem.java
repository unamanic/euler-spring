package com.manicware.euler.rest;

import com.manicware.euler.rest.response.Answer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by unamanic on 10/8/16.
 */
public interface Problem {
    @RequestMapping("/")
    Answer getQuestion();

    @RequestMapping("/{limit}")
    Answer doProblem(@PathVariable int limit);
}
