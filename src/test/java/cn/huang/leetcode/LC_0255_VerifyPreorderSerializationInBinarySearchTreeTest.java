package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0255_VerifyPreorderSerializationInBinarySearchTreeTest {

    @Test
    public void verifyPreorder() {
        LC_0255_VerifyPreorderSerializationInBinarySearchTree s = new LC_0255_VerifyPreorderSerializationInBinarySearchTree();

        boolean res = s.verifyPreorder(new int[]{5, 2, 1, 3, 6});

        Assert.assertEquals(true, res);
    }
}