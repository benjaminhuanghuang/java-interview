package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0743_NetworkDelayTimeTest {

    @Test
    public void networkDelayTime() {
        LC_0743_NetworkDelayTime s = new LC_0743_NetworkDelayTime();
        int res = s.networkDelayTime(new int[][]{new int[]{1, 2, 1}, new int[]{2, 1, 3}}, 2,2);

        Assert.assertEquals(3, res);
    }
}