package cn.huang.leetcode;

import cn.huang.leetcode.common.TreeNode;

import java.util.*;

public class LC_144_BinaryTreePreorderTraversal {
    public List<Integer> recursion(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        result.add(root.val);
        if (root.left != null) {
            result.addAll(recursion(root.left));
        }
        if (root.right != null) {
            result.addAll(recursion(root.right));
        }
        return result;
    }

    public List<Integer> iteration(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root != null) {
            Deque<TreeNode> stack = new ArrayDeque<>();
            stack.add(root);

            while (!stack.isEmpty()) {
                TreeNode node = stack.removeLast();
                result.add(node.val);

                // push right node firstly
                if (node.right != null) {
                    stack.add(node.right);
                }
                if (node.left != null) {
                    stack.add(node.left);
                }
            }
        }

        return result;
    }
}
