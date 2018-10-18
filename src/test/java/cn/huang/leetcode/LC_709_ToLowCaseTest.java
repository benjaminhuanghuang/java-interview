package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC_709_ToLowCaseTest {
    @Test
    public void case1() throws Exception {
        LC_709_ToLowCase s = new LC_709_ToLowCase();
        String result = s.toLowerCase("aBC");
        Assert.assertEquals("abc", result);
    }
}