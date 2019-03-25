package cn.huang.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

/*
 1020. Partition Array Into Three Parts With Equal Sum
    Given an array A of integers, return true if and only if we can partition the array into three non-empty
    parts with equal sums.

    Formally, we can partition the array if we can find indexes i+1 < j with
    (A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1])



    Example 1:

    Input: [0,2,1,-6,6,-7,9,1,2,0,1]
    Output: true
    Explanation: 0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1

    Example 2:

    Input: [0,2,1,-6,6,7,9,-1,2,0,1]
    Output: false

    Example 3:

    Input: [3,3,6,5,-2,2,5,1,-9,4]
    Output: true
    Explanation: 3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4



    Note:

        3 <= A.length <= 50000
        -10000 <= A[i] <= 10000


 */

public class LC_1020_PartitionArrayIntoThreePartsWithEqualSum {
    /*
        Time complexity: O(n)
        Space complexity: O(1)
         */
    public boolean canThreePartsEqualSum(int[] A) {
        int sum =  Arrays.stream(A).sum();

        if (sum % 3 != 0)
            return false;

        int part = sum / 3;
        int cnt = 0;
        for(int i = 0, total = 0; i < A.length; i ++)
        {
            total += A[i];
            if ( total == part)
            {
                cnt ++;
                total = 0;
            }
        }
        return cnt == 3;    //等于3，返回true
    }

    public boolean canThreePartsEqualSum_my_error(int[] A) {
        HashMap<Long, Integer> map = new HashMap<>();
        long sum =0;
        for(int i =0 ;i < A.length ; i++)
        {
            sum += A[i];
            map.put(sum, i);
        }
        if(sum % 3 !=0 )
            return false;

        return map.containsKey(sum/3) && map.containsKey(sum/3 * 2) && map.get(sum/3 * 2) > map.get(sum/3);
    }
}
