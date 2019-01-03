package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0076_MinimumWindowSubstringTest {

    @Test
    public void minWindow() {
        LC_0076_MinimumWindowSubstring s = new LC_0076_MinimumWindowSubstring();
        String res = s.minWindow("ADOBECODEBANC", "ABC");
        Assert.assertEquals("BANC", res);
    }
}