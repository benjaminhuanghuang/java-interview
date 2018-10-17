package coding.problems;

import cn.huang.leetcode.LC_091_DecodeWays;
import org.junit.Assert;
import org.junit.Test;

public class LC_091_DecodeWaysTest {
    @Test
    public void shouldReturnCorrectValue() throws Exception {
        LC_091_DecodeWays s = new LC_091_DecodeWays();
        int actual = s.num_ways_recursive("12");

        Assert.assertEquals(actual, 2);
    }


    @Test
    public void shouldReturnCorrectValue2() throws Exception {
        LC_091_DecodeWays s = new LC_091_DecodeWays();
        int actual = s.num_ways_dp("12");

        Assert.assertEquals(actual, 2);
    }
}