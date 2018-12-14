package cn.huang.leetcode;

import sun.jvm.hotspot.oops.Array;

import java.util.ArrayList;
import java.util.List;

/*
46. Permutations
Given a collection of distinct integers, return all possible permutations.

Example:

Input: [1,2,3]
Output:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]


 */
public class LC_0046_Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<>(), nums);
        return res;
    }

    private void helper(List<List<Integer>> res, List<Integer> combination, int[] nums) {
        if (combination.size() == nums.length) {
            res.add(new ArrayList<>(combination));  // note! DO not use res.add(combination);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (combination.contains(nums[i]))
                continue;
            combination.add(nums[i]);
            helper(res, combination, nums);
            combination.remove(combination.size() - 1);
        }
    }

    // 避免使用combination.contains(nums[i])
    public List<List<Integer>> permute_better(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper2(res, 0, nums);
        return res;
    }

    private void helper2(List<List<Integer>> res, int index, int[] nums) {
        if (index == nums.length) {
            List<Integer> temp = new ArrayList<Integer>();
            for (int num : nums)
                temp.add(num);
            res.add(temp);
        }
        for (int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            helper2(res, index + 1, nums);
            swap(nums, i, index);
        }
    }

    private void swap(int[] nums, int m, int n) {
        int temp = nums[m];
        nums[m] = nums[n];
        nums[n] = temp;
    }
}
