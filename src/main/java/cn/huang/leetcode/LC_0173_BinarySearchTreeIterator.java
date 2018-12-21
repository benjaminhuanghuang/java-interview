package cn.huang.leetcode;

import cn.huang.leetcode.common.TreeNode;

import java.util.Stack;

/*
173. Binary Search Tree Iterator

 */
public class LC_0173_BinarySearchTreeIterator {
    public class BSTIterator {
        private Stack<TreeNode> stack = new Stack<TreeNode>();

        public BSTIterator(TreeNode root) {
            help(root);
        }

        /**
         * @return whether we have a next smallest number
         */
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        /**
         * @return the next smallest number
         */
        public int next() {
            TreeNode minCurrent = stack.pop();
            help(minCurrent.right);

            return minCurrent.val;
        }

        private void help(TreeNode root)
        {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
        }
    }
}
