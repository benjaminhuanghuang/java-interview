package cn.huang.leetcode;

import cn.huang.leetcode.common.TreeLinkNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
117. Populating Next Right Pointers in Each Node II

 */
public class LC_0117_PopulatingNextRightPointersinEachNode_II {
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

    //https://www.programcreek.com/2014/06/leetcode-populating-next-right-pointers-in-each-node-ii-java/
    public void connect2(TreeLinkNode root) {
        if (root == null)
            return;

        TreeLinkNode lastHead = root;//prevous level's head
        TreeLinkNode lastCurrent = null;//previous level's pointer
        TreeLinkNode currentHead = null;//currnet level's head
        TreeLinkNode current = null;//current level's pointer

        while (lastHead != null) {
            lastCurrent = lastHead;

            while (lastCurrent != null) {
                //left child is not null
                if (lastCurrent.left != null) {
                    if (currentHead == null) {
                        currentHead = lastCurrent.left;
                        current = lastCurrent.left;
                    } else {
                        current.next = lastCurrent.left;
                        current = current.next;
                    }
                }

                //right child is not null
                if (lastCurrent.right != null) {
                    if (currentHead == null) {
                        currentHead = lastCurrent.right;
                        current = lastCurrent.right;
                    } else {
                        current.next = lastCurrent.right;
                        current = current.next;
                    }
                }

                lastCurrent = lastCurrent.next;
            }

            //update last head
            lastHead = currentHead;
            currentHead = null;
        }
    }
}
