package coding.problems;
/*
https://www.youtube.com/watch?v=MVVKyn3SKTY

 */
public class ReverseSublist_google {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseSubList(ListNode L, int start, int finish) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = L;

        ListNode curr = dummyHead;

        int k = 1;
        while (k++ < start)
            curr = curr.next;


        ListNode prev = curr;
        while (k++ < finish) {
            ListNode temp = curr.next;
            curr.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;

        }

        return dummyHead.next;
    }
}
