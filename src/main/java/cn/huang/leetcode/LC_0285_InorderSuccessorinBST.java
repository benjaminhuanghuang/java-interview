package cn.huang.leetcode;

import cn.huang.leetcode.common.TreeNode;

import java.util.Stack;

/*
285. Inorder Successor in BST

Given a binary search tree and a node in it, find the in-order successor of that node in the BST.

Note: If the given node has no in-order successor in the tree, return null.


 */
public class LC_0285_InorderSuccessorinBST {

    // Time is O(log(n)) and space is O(1).
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null)
            return null;

        TreeNode next = null;
        TreeNode curr = root;
        while (curr != null && curr.val != p.val) {
            if (curr.val > p.val) {
                next = curr;
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

        if (curr == null)
            return null;

        if (curr.right == null)
            return next;

        curr = curr.right;
        while (curr.left != null)
            curr = curr.left;

        return curr;
    }

    //Time is O(n), Space is O(n).
    public TreeNode inorderSuccessor2(TreeNode root, TreeNode p) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (root == null || p == null)
            return null;

        stack.push(root);
        boolean isNext = false;
        while (!stack.isEmpty()) {
            TreeNode top = stack.pop();

            if (top.right == null && top.left == null) {
                if (isNext) {
                    return top;
                }

                if (p.val == top.val) {
                    isNext = true;
                }
                continue;
            }

            if (top.right != null) {
                stack.push(top.right);
                top.right = null;
            }

            stack.push(top);

            if (top.left != null) {
                stack.push(top.left);
                top.left = null;
            }
        }

        return null;
    }
}
