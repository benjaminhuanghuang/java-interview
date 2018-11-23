package cn.huang.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
    496. Next Greater Element I

 */
public class LC_0496_NextGreaterElement_I {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        /*
        思路是遍历nums1，对每一个数，找到它在nums2的位置，然后从这个位置开始向后遍历，
        如果能找到比它大的，就记下第一个比它大的数，否则记为-1
        */
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] result = new int[len1];

        for(int i = 0; i < len1; i++){
            result[i] = -1;
            int curNum = nums1[i];
            boolean startFlag = false;

            for(int j = 0; j < len2; j++){
                if(nums2[j] == curNum){
                    startFlag = true;
                    continue;
                }
                if(startFlag && nums2[j] > curNum){
                    result[i] = nums2[j];
                    break;
                }
            }
        }
        return result;

    }
}
