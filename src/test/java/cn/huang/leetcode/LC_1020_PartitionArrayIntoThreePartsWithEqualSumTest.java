package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC_1020_PartitionArrayIntoThreePartsWithEqualSumTest {

    @Test
    public void canThreePartsEqualSum() {
        LC_1020_PartitionArrayIntoThreePartsWithEqualSum s = new LC_1020_PartitionArrayIntoThreePartsWithEqualSum();

        boolean res = s.canThreePartsEqualSum(new int[]{6,1,1,13,-1,0,-10,20});

        Assert.assertEquals(false, res);
    }
}