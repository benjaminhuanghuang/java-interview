package cn.huang.leetcode;

import cn.huang.leetcode.common.TreeLinkNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0116_PopulatingNextRightPointersinEachNodeTest {

    @Test
    public void connect() {

       TreeLinkNode root = new TreeLinkNode(1);
       root.left = new TreeLinkNode(2);
       root.right = new TreeLinkNode(3);

        LC_0116_PopulatingNextRightPointersinEachNode s = new LC_0116_PopulatingNextRightPointersinEachNode();
        s.connect(root);


    }
}