package cn.huang.leetcode;

/*
962. Maximum Width Ramp

Given an array A of integers, a ramp is a tuple (i, j) for which i < j and A[i] <= A[j].  The width of such a ramp is j - i.

Find the maximum width of a ramp in A.  If one doesn't exist, return 0.



Example 1:

Input: [6,0,8,2,1,5]
Output: 4
Explanation:
The maximum width ramp is achieved at (i, j) = (1, 5): A[1] = 0 and A[5] = 5.
Example 2:

Input: [9,8,1,0,1,9,4,0,4,1]
Output: 7
Explanation:
The maximum width ramp is achieved at (i, j) = (2, 9): A[2] = 1 and A[9] = 1.


Note:

2 <= A.length <= 50000
0 <= A[i] <= 50000

 */
public class LC_0962_MaximumWidthRamp {

    public int maxWidthRamp(int[] A) {
        int maxWidth = 0;

        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] >= A[i]) {
                    int width = j - i;
                    maxWidth = Math.max(maxWidth, width);
                }
            }
        }
        return maxWidth;
    }

    public int maxWidthRamp2(int[] A) {
        int maxWidth = 0;
        for (int r = A.length - 1; r > 0; r--) {
            for (int l = 0; l < r; l++) {
                if(r -l < maxWidth)
                    continue;
                if (A[r] >= A[l]) {
                    maxWidth = Math.max(maxWidth, r - l);
                }
            }
        }

        return maxWidth;
    }
}
