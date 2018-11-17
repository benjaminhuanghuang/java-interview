package cn.huang.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0441_ArrangingCoinsTest {

    @Test
    public void arrangeCoins() {
        LC_0441_ArrangingCoins s = new LC_0441_ArrangingCoins();
        int n = s.arrangeCoins(1804289383);
        assertEquals(n, 60070);
    }
}