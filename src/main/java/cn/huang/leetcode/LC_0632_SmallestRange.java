package cn.huang.leetcode;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/*
632. Smallest Range

You have k lists of sorted integers in ascending order. Find the smallest range that includes at least one number from each of the k lists.

We define the range [a,b] is smaller than range [c,d] if b-a < d-c or a < c if b-a == d-c.

Example 1:

Input:[[4,10,15,24,26], [0,9,12,20], [5,18,22,30]]
Output: [20,24]
Explanation:
List 1: [4, 10, 15, 24,26], 24 is in range [20,24].
List 2: [0, 9, 12, 20], 20 is in range [20,24].
List 3: [5, 18, 22, 30], 22 is in range [20,24].

Note:

    The given list may contain duplicates, so ascending order means >= here.
    1 <= k <= 3500
    -105 <= value of elements <= 105.
    For Java users, please note that the input type has been changed to List<List<Integer>>. And after you reset the code template, you'll see this point.

 */

/*
 find smallest range 包括每个list至少一个number
 Lai Offer https://www.youtube.com/watch?v=csJXQZFYklE

    可以很容易的看出，答案的区间左右端点一定是某两个序列中的某两个数。
    初始化 k 个指针指向每个列表的首元素，并将其和所在列表的序号合并为 pair 加入到小根堆中，并记录这 k 个数的最大值。
    每次从小根堆中弹出最小值，和此时的最大值构成的区间就构成一个候选的答案。
    接着，最小值所在列表的指针向后移动，加入新的数字到堆中，并更新此时的最大值。
    不断按照以上操作，直到某个指针到达了序列末尾为止。


 */
public class LC_0632_SmallestRange {
    /*
        Time O((n*m)^3) n is the average length of a list, m is the number of lists
        Find 2 numbers from n*m numbers, the time complexity is (n*m)^2
     */
    public int[] smallestRange_Naive(List<List<Integer>> nums) {
        return null;
    }

    /*

     */
    public int[] smallestRange_binarysearch(List<List<Integer>> nums) {
        return null;
    }
    public int[] smallestRange(List<List<Integer>> nums) {
        int start = -1;
        int end = -1;
        int max = Integer.MIN_VALUE;
        int range = Integer.MAX_VALUE;

        PriorityQueue<Element> queue = new PriorityQueue(new Comparator<Element>() {
            public int compare(Element e1, Element e2) {
                return e1.val - e2.val;
            }
        });
        for (int i = 0; i < nums.size(); i++) {
            Element e = new Element(nums.get(i).get(0), 0, i);
            queue.offer(e);
            max = Math.max(max, e.val);
        }
        while (queue.size() == nums.size()) {
            Element e = queue.poll();
            if (max - e.val < range) {
                range = max - e.val;
                start = e.val;
                end = max;
            }
            if (e.index + 1 < nums.get(e.row).size()) {
                e.index = e.index + 1;
                e.val = nums.get(e.row).get(e.index);
                queue.offer(e);
                if (e.val > max) {
                    max = e.val;
                }
            }
        }
        return new int[]{start, end};
    }
    class Element {
        int index;
        int row;
        int val;

        public Element(int val, int index, int row) {
            this.val = val;
            this.index = index;
            this.row = row;
        }
    }
}
