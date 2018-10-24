package cn.huang.leetcode;

import java.util.*;

public class LC_0349_IntersectionofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                set.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[set.size()];
        int k = 0;
        for (Integer num : set) {
            result[k++] = num;
        }
        return result;


    }

    public int[] intersection_set_faster(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++)
            set.add(nums1[i]);

        List<Integer> resultList = new ArrayList<Integer>();
        for (int i = 0; i < nums2.length; i++)
            if (set.contains(nums2[i])) {
                resultList.add(nums2[i]);
                set.remove(nums2[i]);  // delete
            }
        int result[] = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++)
            result[i] = resultList.get(i);
        return result;

    }
}
