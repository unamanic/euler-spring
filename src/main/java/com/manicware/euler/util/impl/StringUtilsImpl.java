package com.manicware.euler.util.impl;

import com.manicware.euler.util.StringUtils;
import org.springframework.stereotype.Component;

/**
 * Created by unamanic on 10/9/16.
 */
@Component
public class StringUtilsImpl implements StringUtils {

    @Override
    public boolean isPalindrome(String in){
        char[] input = in.toCharArray();
        for(int i = 0; i < input.length / 2; i++ ){
            if(input[i] != input[input.length - 1 - i]){
                return false;
            }
        }
        return true;
    }
}
