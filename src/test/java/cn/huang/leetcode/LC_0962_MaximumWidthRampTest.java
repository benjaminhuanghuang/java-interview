package cn.huang.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0962_MaximumWidthRampTest {

    @Test
    public void maxWidthRamp2() {
        LC_0962_MaximumWidthRamp s = new LC_0962_MaximumWidthRamp();

        int res = s.maxWidthRamp2(new int[]{6, 0, 8, 2, 1, 5});
        assertEquals(4, res);
    }

    @Test
    public void maxWidthRamp2_2() {
        LC_0962_MaximumWidthRamp s = new LC_0962_MaximumWidthRamp();

        int res = s.maxWidthRamp2(new int[]{9, 8, 1, 0, 1, 9, 4, 0, 4, 1});
        assertEquals(7, res);
    }

    @Test
    public void maxWidthRamp2_3() {
        LC_0962_MaximumWidthRamp s = new LC_0962_MaximumWidthRamp();

        int res = s.maxWidthRamp2(new int[]{6, 7, 8, 8, 6, 5, 5, 8, 2, 2});
        assertEquals(7, res);
    }
}