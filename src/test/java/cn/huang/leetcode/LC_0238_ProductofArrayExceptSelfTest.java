package cn.huang.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0238_ProductofArrayExceptSelfTest {

    @Test
    public void productExceptSelf() {
        LC_0238_ProductofArrayExceptSelf s = new LC_0238_ProductofArrayExceptSelf();
        int[] res = s.productExceptSelf(new int[]{1, 2, 3, 4});
        assertArrayEquals(new int[]{24, 12, 8, 6}, res);
    }
}