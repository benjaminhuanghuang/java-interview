package cn.huang.leetcode;

/*
540. Single Element in a Sorted Array
Given a sorted array consisting of only integers where every element appears twice except for one element which
appears once. Find this single element that appears only once.

Note: Your solution should run in O(log n) time and O(1) space.
 */
public class LC_0540_SingleElementinaSortedArray {
    public int singleNonDuplicate_N(int[] nums) {
        int L = nums.length;
        int ans = 0;
        for (int i = 0 ; i < L ; i++ ){
            ans ^= nums[i];
        }
        return ans;
    }
    
    public int singleNonDuplicate(int[] nums) {
        int l = 0;
        int r = nums.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            // int n = m % 2 == 0 ? m + 1 : m - 1;
            int n = m ^ 1;
            if (nums[m] == nums[n])
                l = m + 1;
            else
                r = m;
        }
        return nums[l];
    }
}
