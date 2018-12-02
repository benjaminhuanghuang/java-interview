package cn.huang.leetcode;

/*
926. Flip String to Monotone Increasing

A string of '0's and '1's is monotone increasing if it consists of some number of '0's (possibly 0), followed by some number of '1's (also possibly 0.)

We are given a string S of '0's and '1's, and we may flip any '0' to a '1' or a '1' to a '0'.

Return the minimum number of flips to make S monotone increasing.
 */
public class LC_0926_FlipStringtoMonotoneIncreasing {
    public int minFlipsMonoIncr(String S) {
        if (S == null || S.length() == 0) {
            return 0;
        }

        int ones = 0;
        int zeros = 0;

        for (int i = S.length() - 1; i >= 0; i--) {
            if(S.charAt(i) == '0')
            {
                zeros++;
            }
            else
            {
                if(zeros > 0)
                    break;
                ones ++;
            }
        }
        if(ones == 0)
            return zeros;
        if(zeros ==0)
            return ones;
        return Math.min(zeros, ones);
    }
    public int minFlipsMonoIncr_2(String S) {
        if (S == null || S.length() == 0) {
            return 0;
        }

        int ones = 0;
        int zeros = 0;

        for (int i = S.length() - 1; i >= 0; i--) {
            if(S.charAt(i) == '0')
            {
                zeros++;
            }
            else
            {
                if(zeros > 0)
                    break;
                ones ++;
            }
        }
        if(ones == 0)
            return zeros;
        if(zeros ==0)
            return ones;
        return Math.min(zeros, ones);
    }
}
