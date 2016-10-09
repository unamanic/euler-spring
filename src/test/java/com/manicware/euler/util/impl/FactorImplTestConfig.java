package com.manicware.euler.util.impl;

import com.manicware.euler.rest.Problem002;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by unamanic on 10/9/16.
 */
@Configuration
@ComponentScan(basePackageClasses = {PrimeImpl.class, FactorImpl.class})
public class FactorImplTestConfig {
}
