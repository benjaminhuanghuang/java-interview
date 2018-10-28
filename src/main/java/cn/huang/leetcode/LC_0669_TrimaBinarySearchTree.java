package cn.huang.leetcode;

import cn.huang.leetcode.common.TreeNode;

/*
 669. Trim a Binary Search Tree
 */
public class LC_0669_TrimaBinarySearchTree {
    /*
     *   BST: left < root < right
     *
     * */
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }
        if (root.val < L)
            return trimBST(root.right, L, R);
        if (root.val > R)
            return trimBST(root.left, L, R);

        root.left = trimBST(root.left, L, R);

        root.right = trimBST(root.right, L, R);

        return root;
    }
}
