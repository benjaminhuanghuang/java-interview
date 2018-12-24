package cn.huang.leetcode;

import java.util.HashMap;

/*
325. Maximum Size Subarray Sum Equals k

Given an array nums and a target value k, find the maximum length of a subarray that sums to k. If there isn't one,
return 0 instead.

Note:
The sum of the entire nums array is guaranteed to fit within the 32-bit signed integer range.

Example 1:
Given nums = [1, -1, 5, -2, 3], k = 3,
return 4. (because the subarray [1, -1, 5, -2] sums to 3 and is the longest)
 */
public class LC_0325_MaximumSizeSubarraySumEqualsk {
    /*
    http://www.cnblogs.com/grandyang/p/5336668.html
     */
    public int maxSubArrayLen(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int max = 0;

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                max = Math.max(max, i + 1);
            }

            int diff = sum - k;

            if (map.containsKey(diff)) {
                max = Math.max(max, i - map.get(diff));
            }
            //保存第一个出现该sum和的位置
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return max;
    }
    /*
    https://www.youtube.com/watch?v=mKXIH9GnhgU
    */

}
