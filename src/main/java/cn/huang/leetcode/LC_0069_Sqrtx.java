package cn.huang.leetcode;

/*
    69. Sqrt(x)
 */
public class LC_0069_Sqrtx {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;

        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            // 不要写成middle*middle==x，会溢出
            if (mid == x / mid) {

                return mid;
            } else if (mid < x / mid) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (end * end == x) {
            return end;
        }
        return start;
    }
}