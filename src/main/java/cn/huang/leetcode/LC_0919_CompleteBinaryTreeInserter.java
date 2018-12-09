package cn.huang.leetcode;

import cn.huang.leetcode.common.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/*

919. Complete Binary Tree Inserter

A complete binary tree is a binary tree in which every level, except possibly the last, is completely filled, and all nodes are as far left as possible.

Write a data structure CBTInserter that is initialized with a complete binary tree and supports the following operations:

    CBTInserter(TreeNode root) initializes the data structure on a given tree with head node root;

    CBTInserter.insert(int v) will insert a TreeNode into the tree with value node.val = v so that the tree remains complete,
        and returns the value of the parent of the inserted TreeNode;

    CBTInserter.get_root() will return the head node of the tree.
 */
public class LC_0919_CompleteBinaryTreeInserter {

    class CBTInserter {
        TreeNode root;
        Deque<TreeNode> deque;

        public CBTInserter(TreeNode root) {
            this.root = root;
            deque = new LinkedList();
            Queue<TreeNode> queue = new LinkedList();
            queue.offer(root);

            // BFS to populate deque
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node.left == null || node.right == null)
                    deque.offerLast(node);
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
        }

        public int insert(int v) {
            TreeNode node = deque.peekFirst();
            deque.offerLast(new TreeNode(v));
            if (node.left == null)
                node.left = deque.peekLast();
            else {
                node.right = deque.peekLast();
                deque.pollFirst();
            }

            return node.val;
        }

        public TreeNode get_root() {
            return root;
        }
    }
}
