package cn.huang.leetcode;

import cn.huang.leetcode.common.TreeNode;

/*
    226. Invert Binary Tree
 */
public class LC_0226_InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return root;

        TreeNode tmp = invertTree(root.right);
        root.right = invertTree(root.left);
        root.left = tmp;

        return root;
    }
}
