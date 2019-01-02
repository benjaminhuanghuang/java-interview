package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0805_SplitArrayWithSameAverageTest {

    @Test
    public void splitArraySameAverage() {
        LC_0805_SplitArrayWithSameAverage s = new LC_0805_SplitArrayWithSameAverage();
        boolean res = s.splitArraySameAverage(new int[]{6,8,18,3,1});

        Assert.assertEquals(false, res);
    }
}