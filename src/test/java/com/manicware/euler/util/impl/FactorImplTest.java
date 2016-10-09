package com.manicware.euler.util.impl;

import com.manicware.euler.util.Factor;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 * Created by unamanic on 10/9/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {FactorImplTestConfig.class})
public class FactorImplTest {
    @Autowired
    Factor factor;

    @Test
    public void streamPrimeFactors() throws Exception {
        List<Long> primeFactors = factor.streamPrimeFactors(13195).collect(Collectors.toList());
        assertThat(primeFactors, Matchers.contains(
                new Long(1),
                new Long(5),
                new Long(7),
                new Long(13),
                new Long(29)
        ));
    }

}