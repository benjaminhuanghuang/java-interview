package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void shouldReturnRightValue() throws Exception {
        int[] actual = LC_0001_TwoSum.solve(new int[]{2, 7, 11, 15}, 9);

        Assert.assertArrayEquals(actual, new int[]{0, 1});
    }

    @Test
    public void shouldReturnRightValue2() throws Exception {
        int[] actual = LC_0001_TwoSum.solve2(new int[]{2, 7, 11, 15}, 9);

        Assert.assertArrayEquals(actual, new int[]{0, 1});
    }

    @Test
    public void shouldReturnZero() throws Exception {
        int[] actual = LC_0001_TwoSum.solve(new int[]{2, 7, 11, 15}, 100);

        Assert.assertArrayEquals(actual, new int[]{0, 0});
    }

}
