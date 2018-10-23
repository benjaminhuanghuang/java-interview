package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0028_ImplementstrStrTest {

    @Test
    public void strStr() {
        LC_0028_ImplementstrStr s = new LC_0028_ImplementstrStr();
        int res = s.strStr("mississippi", "pi");
        Assert.assertEquals(res, 9);
    }
}