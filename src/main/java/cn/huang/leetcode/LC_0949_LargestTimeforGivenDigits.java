package cn.huang.leetcode;

import java.util.Arrays;
import java.util.Collections;

/*
949. Largest Time for Given Digits

Given an array of 4 digits, return the largest 24 hour time that can be made.

The smallest 24 hour time is 00:00, and the largest is 23:59.  Starting from 00:00, a time is larger if more time has elapsed since midnight.

Return the answer as a string of length 5.  If no valid time can be made, return an empty string.


Example 1:

Input: [1,2,3,4]
Output: "23:41"
Example 2:

Input: [5,5,5,5]
Output: ""


Note:

A.length == 4
0 <= A[i] <= 9
 */
public class LC_0949_LargestTimeforGivenDigits {
    public String largestTimeFromDigits(int[] A) {
        if (A == null || A.length == 0)
            return "";

        Arrays.sort(A);
        char[] chars = new char[5];
        for (int i = 0; i < chars.length; i++)
            chars[i] = '-';
        chars[2] = ':';
        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] <= 2 && chars[0] == '-') {
                chars[0] = (char) (A[i] + '0');
            } else if (A[i] < 4 && chars[1] == '-' || A[i] == 4 && chars[0] == '0') {
                chars[1] = (char) (A[i] + '0');
            } else if (A[i] <= 5 && chars[3] == '-') {
                chars[3] = (char) (A[i] + '0');
            } else if (chars[4] == '-') {
                chars[4] = (char) (A[i] + '0');
            }
        }
        for (int i = 0; i < chars.length; i++)
            if (chars[i] == '-')
                return "";
        String res = String.valueOf(chars);

        return res;
    }
}
