package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {
    @Test
    public void noChange() throws Exception {
        int actual = ReverseInteger.solve(11111);

        Assert.assertEquals(actual, 11111);
    }

    @Test
    public void shouldReversePositiveNum() throws Exception {
        int actual = ReverseInteger.solve(123);

        Assert.assertEquals(actual, 321);
    }

    @Test
    public void shouldReverseNegativeNum() throws Exception {
        int actual = ReverseInteger.solve(-123);

        Assert.assertEquals(actual, -321);
    }

    @Test
    public void shouldReverseNumEndWithZero() throws Exception {
        int actual = ReverseInteger.solve(120);

        Assert.assertEquals(actual, 21);
    }


}
