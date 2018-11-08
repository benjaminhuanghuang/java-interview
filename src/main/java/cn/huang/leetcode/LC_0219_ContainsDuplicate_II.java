package cn.huang.leetcode;

import java.util.HashMap;

/*
219. Contains Duplicate II

 */
public class LC_0219_ContainsDuplicate_II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int pre = map.get(nums[i]);
                if(i-pre<=k)
                    return true;
            }

            map.put(nums[i], i);
        }

        return false;
    }
}
