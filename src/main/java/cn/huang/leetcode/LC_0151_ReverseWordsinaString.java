package cn.huang.leetcode;

import java.util.Arrays;
import java.util.Collections;

/*
151. Reverse Words in a String

 */
public class LC_0151_ReverseWordsinaString {
    // 多空格的情况，不能直接用
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        char[] charArray = s.toCharArray();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (charArray[i] == ' ') {
                continue;
            }

            int end = i;
            while (i >= 0 && charArray[i] != ' ') {
                i--;
            }

            int start = i;
            swap(charArray, start + 1, end);
        }
        swap(charArray, 0, s.length() - 1);

        return String.valueOf(charArray);
    }

    public void swap(char[] s, int start, int end) {
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }


    public String reverseWords_Easy(String s) {
        String res = "";
        String[] words = s.trim().split("\\s+");
        for (int i = words.length - 1; i > 0; --i) {
            res += words[i] + " ";
        }
        return res + words[0];
    }

    public String reverseWords_Easy2(String s) {
        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
}
