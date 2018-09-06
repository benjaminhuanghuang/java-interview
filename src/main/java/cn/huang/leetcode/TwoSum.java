package cn.huang.leetcode;


import java.util.HashMap;

public class TwoSum {
    public static int[] solve(int[] nums, int target) {
        if (nums == null || nums.length < 2)
            return new int[]{0, 0};

        // map<value, index>
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            } else {
                map.put(target - nums[i], i);
            }
        }

        return new int[]{0, 0};
    }


    public static int[] solve2(int[] nums, int target) {
        if (nums == null || nums.length < 2)
            return new int[]{0, 0};

        // map<value, index>
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[]{0, 0};
    }
}
