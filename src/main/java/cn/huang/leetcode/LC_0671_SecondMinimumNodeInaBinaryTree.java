package cn.huang.leetcode;
/*
    671. Second Minimum Node In a Binary Tree

    Given a non-empty special binary tree consisting of nodes with the non-negative value, where each node in
    this tree has exactly two or zero sub-node. If the node has two sub-nodes, then this node's value is the
    smaller value among its two sub-nodes.

    Given such a binary tree, you need to output the second minimum value in the set made of all the nodes'
    value in the whole tree.
 */

import cn.huang.leetcode.common.TreeNode;

public class LC_0671_SecondMinimumNodeInaBinaryTree {
    int min = Integer.MAX_VALUE;
    int secondMin = Integer.MAX_VALUE;
    boolean seenMoreThanOne = false;
    int orig = -1;

    public int findSecondMinimumValue(TreeNode root) {
        if(root ==  null)
            return -1;

        orig = root.val;
        preOrderWalk(root);
        if(min == secondMin || !seenMoreThanOne)
            return -1;
        return secondMin;
    }

    private void preOrderWalk(TreeNode root){
        if(root == null)
            return;

        if(root.val != orig)
        {
            seenMoreThanOne = true;
        }
        if(root.val < min)
        {
            int tmp = min;
            min = root.val;
            secondMin = tmp;
        }
        else if(root.val < secondMin && root.val != min){
            secondMin = root.val;
        }
        preOrderWalk(root.left);
        preOrderWalk(root.right);
    }
}
