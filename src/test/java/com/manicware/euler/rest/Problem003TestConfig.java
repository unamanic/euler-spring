package com.manicware.euler.rest;

import com.manicware.euler.util.impl.FactorImpl;
import com.manicware.euler.util.impl.FibonacciImpl;
import com.manicware.euler.util.impl.PrimeImpl;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by unamanic on 10/9/16.
 */
@Configuration
@ComponentScan(basePackageClasses = {PrimeImpl.class, FactorImpl.class, Problem003.class})
public class Problem003TestConfig {}
