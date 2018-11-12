package cn.huang.leetcode;

/*
    278. First Bad Version

 */
public class LC_0278_FirstBadVersion {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid;
            }
        }
        if (isBadVersion(start))
            return start;

        return end;
    }

    boolean isBadVersion(int version) {
        return false;
    }
}
