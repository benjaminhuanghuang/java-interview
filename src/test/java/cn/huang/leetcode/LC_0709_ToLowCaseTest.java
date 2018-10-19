package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LC_0709_ToLowCaseTest {
    @Test
    public void case1() throws Exception {
        LC_0709_ToLowCase s = new LC_0709_ToLowCase();
        String result = s.toLowerCase("aBC");
        Assert.assertEquals("abc", result);
    }
}