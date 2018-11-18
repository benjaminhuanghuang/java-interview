package cn.huang.leetcode;

import java.util.PriorityQueue;

/*
    703. Kth Largest Element in a Stream
    Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order,
    not the kth distinct element.

    Your KthLargest class will have a constructor which accepts an integer k and an integer array nums, which contains
    initial elements from the stream. For each call to the method KthLargest.add, return the element representing the kth
    largest element in the stream.
 */
public class LC_0703_KthLargestElementinaStream {
    class KthLargest {
        private PriorityQueue<Integer> q;
        private int size;
        public KthLargest(int k, int[] nums) {
            q = new PriorityQueue<>();
            size = k;

            for (int i=0;i<nums.length;i++){
                add(nums[i]);
            }

        }

        public int add(int val) {
            if (q.size() < size) {
                q.add(val);
            } else if (q.peek() < val) {
                q.poll();
                q.add(val);
            }
            return q.peek();
        }
    }
}
