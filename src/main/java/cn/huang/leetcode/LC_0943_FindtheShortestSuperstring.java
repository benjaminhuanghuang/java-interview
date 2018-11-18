package cn.huang.leetcode;

/*
    943. Find the Shortest Superstring
    Given an array A of strings, find any smallest string that contains each string in A as a substring.

    We may assume that no string in A is substring of another string in A.

    Example 1:

    Input: ["alex","loves","leetcode"]
    Output: "alexlovesleetcode"

    Explanation: All permutations of "alex","loves","leetcode" would also be accepted.
    Example 2:

    Input: ["catg","ctaagt","gcta","ttca","atgcatc"]
    Output: "gctaagttcatgcatc"
 */
public class LC_0943_FindtheShortestSuperstring {

    public String shortestSuperstring(String[] A) {
        int n = A.length;

        while (n != 1) {
            // store the max overlap
            int max = Integer.MIN_VALUE;
            int p = -1, q = -1;
            String res_str = "";

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    StringBuilder sb = new StringBuilder();

                    int r = findOverlappingPair(A[i], A[j], sb);
                    if (max < r) {
                        max = r;
                        res_str = sb.toString();
                        p = i;
                        q = j;

                    }
                }
            }
            n--;

            if (max == Integer.MIN_VALUE) {
                A[0] = A[0] + A[n];
            } else {
                A[p] = res_str;
                A[q] = A[n];
            }

        }
        return A[0];
    }

    // calculate maximum overlap in two given strings
    public int findOverlappingPair(String s1, String s2, StringBuilder sb) {
        int max = Integer.MIN_VALUE;

        int n = Math.min(s1.length(), s2.length());

        // check suffix of s1 matches with prefix of s2
        for (int i = 1; i < n; i++) {
            if (s1.substring(s1.length() - i).equals(s2.substring(0, i))) {
                if (max < i) {
                    max = i;
                    sb.setLength(0);
                    sb.append(s1).append(s2.substring(i));
                }
            }
        }

        // check prefix of s1 matches with suffix of s2
        for (int i = 1; i <= n; i++) {
            if (s1.substring(0, i).equals(s2.substring(s2.length() - i))) {
                if (max < i) {
                    max = i;
                    sb.setLength(0);
                    sb.append(s2).append(s1.substring(i));
                }
            }
        }
        return max;
    }
}


/*
["ift","efd","dnete","tef","fdn"]
Output:
"iftdnetefdn"
Expected:
"iftefdnete"
 */