package cn.huang.leetcode;

/*
    367. Valid Perfect Square
 */
public class LC_0367_ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        long left = 0, right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long t = mid * mid;
            if (t == num) return true;
            else if (t < num) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}
