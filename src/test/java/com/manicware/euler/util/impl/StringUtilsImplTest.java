package com.manicware.euler.util.impl;

import com.manicware.euler.util.StringUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by unamanic on 10/9/16.
 */
public class StringUtilsImplTest {
    StringUtils utils = new StringUtilsImpl();

    @Test
    public void isPalindrome() throws Exception {
        assertEquals(true, utils.isPalindrome("racecar"));
        assertEquals(false, utils.isPalindrome("ricecar"));
        assertEquals(true, utils.isPalindrome("r"));
        assertEquals(true, utils.isPalindrome("rr"));
        assertEquals(false, utils.isPalindrome("ray"));
    }

}