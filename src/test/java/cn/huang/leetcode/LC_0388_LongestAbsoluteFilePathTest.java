package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0388_LongestAbsoluteFilePathTest {

    @Test
    public void lengthLongestPath() {
        LC_0388_LongestAbsoluteFilePath s=  new LC_0388_LongestAbsoluteFilePath();
        int res = s.lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext");

        Assert.assertEquals(20, res);
    }
}