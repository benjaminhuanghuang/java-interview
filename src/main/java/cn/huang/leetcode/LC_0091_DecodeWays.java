package cn.huang.leetcode;

/*
    https://leetcode.com/problems/decode-ways/

    Facebook Coding Interview Question - How Many Ways to Decode This Message?
    https://www.youtube.com/watch?v=qli-JCrSwuk


    "a" -> 1
    "b" -> 2
    ...

    "12" -> ab
    "12" -> l

    Analysis:
    case 1: "12345" -> "a" + decode("2345") or "l" + decode("345")
    so
        num_ways("12345") = num_ways("2345") + num_ways("345")

    case 2: "27345" -> "b" + decode("7345")
    so
        num_ways("27345") = num_ways("7345")

    case 3: num_ways("011") = 0

 */
public class LC_0091_DecodeWays {
    // To case "111111", h(6) = h(5) + h(4), h(5) = h(4) + h(3)... h(4) were calculated twice
    public int num_ways_recursive(String data) {
        return this.helper(data, data.length());

    }

    private int helper(String data, int restLetters) {
        if (restLetters == 0)
            return 1;

        int startIndex = data.length() - restLetters;
        if (data.charAt(startIndex) == '0')
            return 0;
        int result = helper(data, restLetters - 1);

        // (data.charAt(startIndex) != '0') can guarantee Integer.parseInt(data.substring(startIndex, startIndex + 2)) >= 10
        if (restLetters >= 2 && Integer.parseInt(data.substring(startIndex, startIndex + 2)) <= 26) {
            result += this.helper(data, restLetters - 2);
        }

        return result;
    }

    public int num_ways_dp(String data) {
        if (data == null || data.length() == 0 || data.charAt(0) == '0')
            return 0;
        if (data.length() == 1)
            return 1;

        int[] dp = new int[data.length()];
        dp[0] = 1;

        if (Integer.parseInt(data.substring(0, 2)) > 26) {
            if (data.charAt(1) != '0') {
                dp[1] = 1;
            } else {
                dp[1] = 0;
            }
        } else {
            if (data.charAt(1) != '0') {
                dp[1] = 2;
            } else {
                dp[1] = 1;
            }
        }

        for (int i = 2; i < data.length(); i++) {
            if (data.charAt(i) != '0') {
                dp[i] += dp[i - 1];
            }

            int val = Integer.parseInt(data.substring(i - 1, i + 1));
            if (val <= 26 && val >= 10) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[data.length() - 1];

    }
}