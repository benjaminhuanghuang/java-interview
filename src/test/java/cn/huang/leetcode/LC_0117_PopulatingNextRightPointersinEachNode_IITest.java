package cn.huang.leetcode;

import cn.huang.leetcode.common.TreeLinkNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0117_PopulatingNextRightPointersinEachNode_IITest {

    @Test
    public void connect2() {
        /*
                     1
                   /  \
                  2    3
                 / \    \
                4   5    7

                     1 -> NULL
                   /  \
                  2 -> 3 -> NULL
                 / \    \
                4-> 5 -> 7 -> NULL
         */
        TreeLinkNode root = new TreeLinkNode(1);
        root.left = new TreeLinkNode(2);
        root.right = new TreeLinkNode(3);
        root.left.left = new TreeLinkNode(4);
        root.left.right = new TreeLinkNode(5);
        root.right.right = new TreeLinkNode(7);


        LC_0117_PopulatingNextRightPointersinEachNode_II s = new LC_0117_PopulatingNextRightPointersinEachNode_II();
        s.connect2(root);
    }
}