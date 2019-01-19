package cn.huang.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
658. Find K Closest Elements

 Given a sorted array, two integers k and x, find the k closest elements to x in the array. The result should also
 be sorted in ascending order. If there is a tie, the smaller elements are always preferred.

Example 1:

Input: [1,2,3,4,5], k=4, x=3
Output: [1,2,3,4]

Example 2:

Input: [1,2,3,4,5], k=4, x=-1
Output: [1,2,3,4]

Note:

    The value k is positive and will always be smaller than the length of the sorted array.
    Length of the given array is positive and will not exceed 104
    Absolute value of elements in the array and x will not exceed 104

 */
public class LC_0658_FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();

        // arr.length - k indicats the max index the begin elemet's index can be
        int begin = 0, end = arr.length - k;
        while (begin <= end) {
            int mid = begin + (end - begin) / 2;
            if (x > arr[mid]) {
                //check if x is left size of right size of interval arr[mid]
                if (x - arr[mid] > arr[mid + k] - x) {
                    begin = mid + 1;
                } else {
                    end = mid;
                }
            } else {
                end = mid;
            }
        }
        int index = begin;
        while (k != 0) {
            res.add(arr[index++]);
            k--;
        }
        return res;
    }
}
