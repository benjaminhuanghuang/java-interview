package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0942_DIStringMatchTest {

    @Test
    public void diStringMatch() {
        LC_0942_DIStringMatch s = new LC_0942_DIStringMatch();
        int[] res = s.diStringMatch("IDID");
        Assert.assertArrayEquals(res, new int[]{0, 4, 1, 3, 2});
    }
}