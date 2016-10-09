package com.manicware.euler;

import com.manicware.euler.rest.Problem001Test;
import com.manicware.euler.rest.Problem002Test;
import com.manicware.euler.rest.Problem003Test;
import com.manicware.euler.util.impl.FactorImpl;
import com.manicware.euler.util.impl.FactorImplTest;
import com.manicware.euler.util.impl.FibonacciImplTest;
import com.manicware.euler.util.impl.PrimeImplTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by unamanic on 10/8/16.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        FactorImplTest.class,
        FibonacciImplTest.class,
        PrimeImplTest.class,
        Problem001Test.class,
        Problem002Test.class,
        Problem003Test.class
})
public class EulerTestSuite {

}
