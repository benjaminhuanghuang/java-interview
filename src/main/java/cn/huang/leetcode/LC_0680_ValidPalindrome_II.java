package cn.huang.leetcode;

/*
    680. Valid Palindrome II
 */
public class LC_0680_ValidPalindrome_II {
    /*
    https://www.youtube.com/watch?v=hvI-rJyG4ik
     */
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return isValid(s, left, right - 1) || isValid(s, left + 1, right);
            ++left;
            --right;
        }
        return true;
    }

    boolean isValid(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}