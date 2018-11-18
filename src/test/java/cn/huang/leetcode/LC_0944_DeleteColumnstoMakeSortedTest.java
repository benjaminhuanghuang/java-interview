package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0944_DeleteColumnstoMakeSortedTest {

    @Test
    public void minDeletionSize() {
        LC_0944_DeleteColumnstoMakeSorted s = new LC_0944_DeleteColumnstoMakeSorted();
        int res = s.minDeletionSize(new String[]{"cba","daf","ghi"});
        Assert.assertEquals(res, 1);
    }
}