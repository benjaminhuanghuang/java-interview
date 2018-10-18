package cn.huang.leetcode;

import java.util.HashMap;

public class LC_771_JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        if(J == null || S == null)
            return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < J.length(); i++) {
            char c = J.charAt(i);
            map.put(c, 0);
        }

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if(map.containsKey(c))
                map.put(c, map.get(c) + 1);
        }

        int num = 0;
        for (char key : map.keySet()) {
            num += map.get(key);
        }

        return num;
    }
}
