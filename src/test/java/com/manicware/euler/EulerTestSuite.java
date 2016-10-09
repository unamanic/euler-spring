package com.manicware.euler;

import com.manicware.euler.rest.Problem001Test;
import com.manicware.euler.rest.Problem002Test;
import com.manicware.euler.util.impl.FibonacciImplTest;
import com.manicware.euler.util.impl.MathOperationsImplTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by unamanic on 10/8/16.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        FibonacciImplTest.class,
        MathOperationsImplTest.class,
        Problem001Test.class,
        Problem002Test.class
})
public class EulerTestSuite {

}
