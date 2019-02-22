package cn.huang.leetcode;

import cn.huang.leetcode.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0297_SerializeandDeserializeBinaryTreeTest {

    @Test
    public void serialize1() {
    }

    @Test
    public void deserialize1Test() {
        String data = "1 2 # # 3 4 # # 5 # #";
        LC_0297_SerializeandDeserializeBinaryTree s = new LC_0297_SerializeandDeserializeBinaryTree();

        TreeNode treeNode = s.deserialize1(data);

        String out = s.serialize1(treeNode);

        assertEquals(data, out);
    }
}