package cn.huang.leetcode;
/*
333. Largest BST Subtree

Given a binary tree, find the largest subtree which is a Binary Search Tree (BST),

where largest means subtree with largest number of nodes in it.

Note:
A subtree must include all of its descendants.
Here's an example:

    10
    / \
   5  15
  / \   \
 1   8   7

The Largest BST Subtree in this case is the highlighted one.
The return value is the subtree's size, which is 3.



Hint:

    You can recursively use algorithm similar to 98. Validate Binary Search Tree at each node of the tree,
    which will result in O(nlogn) time complexity.

 */


/*
二分树的最大BST，所谓BBST就是满足左<根<右的二分树，我们需要返回这个二分搜索子树的节点个数。
题目中给的提示说我们可以用之前那道Validate Binary Search Tree的方法来做，时间复杂度为O(n2)，
这种方法是把每个节点都当做根节点，来验证其是否是二叉搜索数，并记录节点的个数，若是二叉搜索树，就更新最终结果
 */
public class LC_0333_LargestBSTSubtree
{
}
