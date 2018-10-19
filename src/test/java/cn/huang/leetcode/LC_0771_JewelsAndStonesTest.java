package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LC_0771_JewelsAndStonesTest {
    @Test
    public void case1() throws Exception {
        LC_0771_JewelsAndStones s = new LC_0771_JewelsAndStones();
        int n = s.numJewelsInStones("aA", "aAABBB");
        Assert.assertEquals(n, 3);
    }
}