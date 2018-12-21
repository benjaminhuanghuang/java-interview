package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0165_CompareVersionNumbersTest {

    @Test
    public void compareVersion() {
        LC_0165_CompareVersionNumbers s= new LC_0165_CompareVersionNumbers();
        int res = s.compareVersion("0.1", "1.1");
        Assert.assertEquals(-1, res);
    }
}