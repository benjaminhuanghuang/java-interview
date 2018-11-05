package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0125_ValidPalindromeTest {

    @Test
    public void isPalindrome() {
        LC_0125_ValidPalindrome s = new LC_0125_ValidPalindrome();
        boolean res = s.isPalindrome_Better("race a car");

        Assert.assertEquals(res, false);
    }

    @Test
    public void isPalindrome2() {
        LC_0125_ValidPalindrome s = new LC_0125_ValidPalindrome();
        boolean res = s.isPalindrome_Better("A man, a plan, a canal: Panama");

        Assert.assertEquals(res, true);
    }
}