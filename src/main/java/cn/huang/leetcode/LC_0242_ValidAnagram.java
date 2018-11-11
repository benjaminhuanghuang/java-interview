package cn.huang.leetcode;

/*
    242. Valid Anagram
 */
public class LC_0242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] sArray = new int[26];
        int[] tArray = new int[26];

        char[] sCharArr = s.toCharArray();
        for (int i = 0; i < sCharArr.length; i++) {
            int index = sCharArr[i] - 'a';
            sArray[index] += 1;
        }
        char[] tCharArr = t.toCharArray();
        for (int i = 0; i < tCharArr.length; i++) {
            int index = tCharArr[i] - 'a';
            tArray[index] += 1;
        }

        for (int i = 0; i < 26; i++) {
            if (sArray[i] != tArray[i]) return false;
        }
        return true;
    }

    public boolean isAnagram_better(String s, String t) {
        int[] times = new int[26];

        char[] sCharArr = s.toCharArray();
        for (int i = 0; i < sCharArr.length; i++) {
            int index = sCharArr[i] - 'a';
            times[index] += 1;
        }
        char[] tCharArr = t.toCharArray();
        for (int i = 0; i < tCharArr.length; i++) {
            int index = tCharArr[i] - 'a';
            times[index] -= 1;
        }

        for (int i = 0; i < 26; i++) {
            if (times[i] != 0) return false;
        }
        return true;
    }
}
