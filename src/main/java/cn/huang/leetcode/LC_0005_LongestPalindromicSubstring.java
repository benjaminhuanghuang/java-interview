package cn.huang.leetcode;
/*
5. Longest Palindromic Substring

 */
public class LC_0005_LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if(s == null || s.length()==0)
            return "";
        // palin[i][j] means string[i to j] is palin or not
        boolean[][] palin = new boolean[s.length()][s.length()];
        String res = "";
        int maxLen = 0;
        for(int i=s.length()-1;i>=0;i--)
        {
            for(int j=i;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j) && (j-i<=2 || palin[i+1][j-1]))
                {
                    palin[i][j] = true;  // single char is palin
                    if(maxLen<j-i+1)
                    {
                        maxLen=j-i+1;
                        res = s.substring(i,j+1);
                    }
                }
            }
        }
        return res;
    }
}
