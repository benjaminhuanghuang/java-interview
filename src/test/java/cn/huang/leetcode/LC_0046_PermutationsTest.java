package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LC_0046_PermutationsTest {

    @Test
    public void permute() {
        LC_0046_Permutations s = new LC_0046_Permutations();
        List<List<Integer>> res = s.permute(new int[]{1, 2, 3});
        Assert.assertEquals(6, res.size());
    }
}