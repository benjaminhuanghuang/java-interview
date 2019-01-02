package cn.huang.leetcode;

import java.util.Arrays;

/*
805. Split Array With Same Average

In a given integer array A, we must move every element of A to either list B or list C. (B and C initially start empty.)

Return true if and only if after such a move, it is possible that the average value of B is equal to the average value of C, and B and C are both non-empty.

Example :
Input:
[1,2,3,4,5,6,7,8]
Output: true
Explanation: We can split the array into [1,4,5,8] and [2,3,6,7], and both of them have the average of 4.5.

Note:

    The length of A will be in the range [1, 30].
    A[i] will be in the range of [0, 10000].



 */
public class LC_0805_SplitArrayWithSameAverage {
    /*
    Avg(A) == Avg(B) = Avg(C) == sum(A)/Len
    计算出A的平均数avg， 若B的元素总和为 i * avg, 0 < i <= n / 2
    (B和C必定有一方的元素个数大于等于另一方, 我们取元素个数较少的那一方)， 那么B和C的平均数一定相等

    于是问题转化为， 迭代i， 对A中元素回溯， 看看是否能够挑出i个元素， 使得元素之和为 i * avg

     */
    public boolean splitArraySameAverage(int[] A) {
        int sum = 0, len = A.length;
        for (int n : A) sum += n;
        Arrays.sort(A);
        for (int i = 1; i <= len / 2; i++) {
            if ((sum * i % len) == 0 && check(A, 0, i, sum * i / len)) {
                return true;
            }
        }
        return false;
    }

    private boolean check(int[] A, int pos, int remain, int target) {
        if (target == 0 && remain == 0) return true;
        boolean ret = false;
        if (target != 0 && remain != 0) {
            for (int i = pos; i < A.length; i++) {
                if (target < A[i]) break;
                ret |= check(A, i + 1, remain - 1, target - A[i]);
            }
        }
        return ret;
    }

}
