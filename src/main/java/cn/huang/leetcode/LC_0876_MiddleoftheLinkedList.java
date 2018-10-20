package cn.huang.leetcode;

import cn.huang.leetcode.common.ListNode;

/*
    876	 Middle of the Linked List

 */
public class LC_0876_MiddleoftheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        if(fast.next != null)
            slow = slow.next;

        return slow;
    }
}
