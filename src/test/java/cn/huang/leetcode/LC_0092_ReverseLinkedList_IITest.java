package cn.huang.leetcode;

import cn.huang.leetcode.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0092_ReverseLinkedList_IITest {

    @Test
    public void reverseBetween() {
        ListNode dummyHeader = new ListNode(1);
        ListNode curr = dummyHeader;

        for(int i =1; i<=5; i++)
        {
            curr.next = new ListNode(i);
            curr = curr.next;
        }

        ListNode header = dummyHeader.next;
        dummyHeader.next = null;

        LC_0092_ReverseLinkedList_II s = new LC_0092_ReverseLinkedList_II();

        s.reverseBetween(header, 2 , 4);
    }
}