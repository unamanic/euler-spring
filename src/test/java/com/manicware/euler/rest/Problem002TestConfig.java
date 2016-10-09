package com.manicware.euler.rest;

import com.manicware.euler.util.impl.FibonacciImpl;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by unamanic on 10/9/16.
 */
@Configuration
@ComponentScan(basePackageClasses = {FibonacciImpl.class, Problem002.class})
public class Problem002TestConfig {}
