package cn.huang.leetcode;

import cn.huang.leetcode.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0958_CheckCompletenessofaBinaryTreeTest {

    @Test
    public void isCompleteTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);


        LC_0958_CheckCompletenessofaBinaryTree s = new LC_0958_CheckCompletenessofaBinaryTree();
        boolean res = s.isCompleteTree(root);
        Assert.assertEquals(true, res);
    }

    @Test
    public void isCompleteTree4() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);


        LC_0958_CheckCompletenessofaBinaryTree s = new LC_0958_CheckCompletenessofaBinaryTree();
        boolean res = s.isCompleteTree(root);
        Assert.assertEquals(true, res);
    }

    @Test
    public void isCompleteTree2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        //root.right.left = null
        root.right.right = new TreeNode(7);


        LC_0958_CheckCompletenessofaBinaryTree s = new LC_0958_CheckCompletenessofaBinaryTree();
        boolean res = s.isCompleteTree(root);
        Assert.assertEquals(false, res);
    }
    @Test
    public void isCompleteTree3() {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);

        LC_0958_CheckCompletenessofaBinaryTree s = new LC_0958_CheckCompletenessofaBinaryTree();
        boolean res = s.isCompleteTree(root);
        Assert.assertEquals(false, res);
    }

    @Test
    public void isCompleteTree5() {
        TreeNode root = new TreeNode(1);

        LC_0958_CheckCompletenessofaBinaryTree s = new LC_0958_CheckCompletenessofaBinaryTree();
        boolean res = s.isCompleteTree(root);
        Assert.assertEquals(true, res);
    }
}