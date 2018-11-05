package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0724_FindPivotIndexTest {

    @Test
    public void pivotIndex() {
        LC_0724_FindPivotIndex s = new LC_0724_FindPivotIndex();

        int res = s.pivotIndex(new int[]{1, 7, 3, 6, 5, 6});

        Assert.assertEquals(3, res);

    }

    @Test
    public void pivotIndex2() {
        LC_0724_FindPivotIndex s = new LC_0724_FindPivotIndex();

        int res = s.pivotIndex(new int[]{-1, -1, -1, -1, -1, 0});

        Assert.assertEquals(3, res);

    }
}