package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0949_LargestTimeforGivenDigitsTest {

    @Test
    public void largestTimeFromDigits() {
        LC_0949_LargestTimeforGivenDigits s= new LC_0949_LargestTimeforGivenDigits();
        String res = s.largestTimeFromDigits(new int[]{0,4,0,0});
        Assert.assertEquals("04:00", res);
    }

    @Test
    public void largestTimeFromDigits2() {
        LC_0949_LargestTimeforGivenDigits s= new LC_0949_LargestTimeforGivenDigits();
        String res = s.largestTimeFromDigits(new int[]{1,2,3,4});
        Assert.assertEquals("23:41", res);
    }
}