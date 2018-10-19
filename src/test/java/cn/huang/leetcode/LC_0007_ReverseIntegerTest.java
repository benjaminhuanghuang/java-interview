package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LC_0007_ReverseIntegerTest {
    @Test
    public void noChange() throws Exception {

        int actual = LC_0007_ReverseInteger.reverse(11111);

        Assert.assertEquals(actual, 11111);
    }

    @Test
    public void shouldReversePositiveNum() throws Exception {
        int actual = LC_0007_ReverseInteger.reverse(123);

        Assert.assertEquals(actual, 321);
    }

    @Test
    public void shouldReverseNegativeNum() throws Exception {
        int actual = LC_0007_ReverseInteger.reverse(-123);

        Assert.assertEquals(actual, -321);
    }

    @Test
    public void shouldReverseNumEndWithZero() throws Exception {
        int actual = LC_0007_ReverseInteger.reverse(120);

        Assert.assertEquals(actual, 21);
    }


}
