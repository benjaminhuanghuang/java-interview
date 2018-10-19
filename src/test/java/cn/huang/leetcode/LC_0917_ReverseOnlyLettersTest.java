package cn.huang.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0917_ReverseOnlyLettersTest {
    @Test
    public void testCase1() {
        LC_0917_ReverseOnlyLetters s = new LC_0917_ReverseOnlyLetters();

        String result = s.reverseOnlyLetters("7_28]");

        assertEquals("7_28]", result);
    }

}