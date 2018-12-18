package cn.huang.leetcode;

import cn.huang.leetcode.common.TreeLinkNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
116. Populating Next Right Pointers in Each Node

    You may only use constant extra space.
    Recursive approach is fine, implicit stack space does not count as extra space for this problem.
    You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).

 */
public class LC_0116_PopulatingNextRightPointersinEachNode {


    public void connect(TreeLinkNode root) {
        if (root == null)
            return;

        Queue<TreeLinkNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int count = q.size();
            List<TreeLinkNode> layer = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                TreeLinkNode node = q.poll();
                layer.add(node);
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
            }

            for (int i = 0; i < count - 1; i++) {
                layer.get(i).next = layer.get(i + 1);
            }
        }
    }

    public void connect_recursion(TreeLinkNode root) {
        if (root == null)
            return;
        if (root.left != null) {
            root.left.next = root.right;
        }
        // have left sub tree and right sub tree
        if (root.next != null && root.right != null) {
            root.right.next = root.next.left;   // connect left sub tree and right sub tree
        }
        connect_recursion(root.left);
        connect_recursion(root.right);
    }
}
