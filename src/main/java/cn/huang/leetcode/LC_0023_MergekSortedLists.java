package cn.huang.leetcode;

import cn.huang.leetcode.common.ListNode;

import java.util.List;
import java.util.PriorityQueue;

/*
23. Merge k Sorted Lists

 */
//https://www.youtube.com/watch?v=5xT5GMTFvRI
public class LC_0023_MergekSortedLists {
    public ListNode mergeKLists_pq(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;

        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, (a,b)->a.val - b.val);
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for(ListNode list: lists){
            if(list!= null)
            {
                queue.add(list);
            }
        }
        while(!queue.isEmpty())
        {
            current.next = queue.poll();
            current = current.next;
            if(current.next != null)
            {
                queue.add(current.next);
            }
        }
        return dummy.next;
    }


    // O(nlogK)   l = list.length
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length ==0)
            return null;

        return mergeKLists(lists, 0, lists.length -1);


    }
    public ListNode mergeKLists(ListNode[] lists, int low, int high) {
        if (low >= high) return lists[low];
        int mid = (high - low) / 2 + low;
        ListNode l1 = mergeKLists(lists, low, mid);
        ListNode l2 = mergeKLists(lists, mid, high);

        return mergeLists(l1, l2);
    }

    public ListNode mergeLists(ListNode l1, ListNode l2)
    {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;

        if(l1.val < l2.val)
        {
            l1.next = mergeLists(l1.next, l2);
            return l1;
        }

        l2.next = mergeLists(l1, l2.next);
        return l2;
    }
}
