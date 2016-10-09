package com.manicware.euler.rest;

import com.manicware.euler.util.impl.FactorImpl;
import com.manicware.euler.util.impl.PrimeImpl;
import com.manicware.euler.util.impl.StringUtilsImpl;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by unamanic on 10/9/16.
 */
@Configuration
@ComponentScan(basePackageClasses = {StringUtilsImpl.class, Problem004.class})
public class Problem004TestConfig {}
