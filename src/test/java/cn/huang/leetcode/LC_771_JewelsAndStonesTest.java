package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC_771_JewelsAndStonesTest {
    @Test
    public void noChange() throws Exception {
        LC_771_JewelsAndStones s = new LC_771_JewelsAndStones();
        int n = s.numJewelsInStones("aA", "aAABBB");
        Assert.assertEquals(n, 3);
    }
}