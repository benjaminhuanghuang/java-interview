package cn.huang.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
398. Random Pick Index

Given an array of integers with possible duplicates, randomly output the index of a given target number.
You can assume that the given target number must exist in the array.

Note:
The array size can be very large. Solution that uses too much extra space will not pass the judge.

Example:

int[] nums = new int[] {1,2,3,3,3};
Solution solution = new Solution(nums);

// pick(3) should return either index 2, 3, or 4 randomly. Each index should have equal probability of returning.
solution.pick(3);

// pick(1) should return 0. Since in the array only nums[0] is equal to 1.
solution.pick(1);


 */
public class LC_0398_RandomPickIndex {
    class Solution {

        int[] nums;
        Random rand;

        public Solution(int[] nums) {
            this.nums = nums;
            this.rand = new Random();
        }

        public int pick(int target) {
            int total = 0;//total index match target
            int res = -1;
            List<Integer> list = new ArrayList<>();   // index list of elements equals target
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    total++;
                    list.add(i);
                }
            }
            res = list.get(rand.nextInt(total)); //int in [0,total)
            return res;
        }
    }
}
