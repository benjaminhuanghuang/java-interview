package cn.huang.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
937. Reorder Log Files
You have an array of logs.  Each log is a space delimited string of words.

For each log, the first word in each log is an alphanumeric identifier.  Then, either:

Each word after the identifier will consist only of lowercase letters, or;
Each word after the identifier will consist only of digits.
We will call these two varieties of logs letter-logs and digit-logs.  It is guaranteed that each log has at least one word after its identifier.

Reorder the logs so that all of the letter-logs come before any digit-log.  The letter-logs are ordered lexicographically ignoring identifier, with the identifier used in case of ties.  The digit-logs should be put in their original order.

Return the final order of the logs.



Example 1:

Input: ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
Output: ["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
 */
public class LC_0937_ReorderLogFiles {
    public String[] reorderLogFiles(String[] logs) {
        List<String> digitLogs = new ArrayList<>();
        List<String> letterLogs = new ArrayList<>();

        for (int i = 0; i < logs.length; i++) {
            String log = logs[i];
            String[] parts = log.split(" ");
            if (Character.isDigit(parts[1].charAt(0))) {
                digitLogs.add(log);
            } else {
                letterLogs.add(log);
            }
        }
        letterLogs.sort(new Comparator<String>() {
            @Override
            public int compare(String m1, String m2) {
                String[] parts1 = m1.split(" ");
                String[] parts2 = m2.split(" ");

                for (int i = 1; i < Math.max(parts1.length, parts2.length); i++) {
                    String s1 = " ";
                    String s2 = " ";

                    if (i < parts1.length)
                        s1 = parts1[i];
                    if (i < parts2.length)
                        s2 = parts2[i];
                    if(!s1.equals(s2))
                        return s1.compareTo(s2);
                }
                return 0;
            }
        });

        letterLogs.addAll(digitLogs);

        String[] ans = letterLogs.toArray(new String[letterLogs.size()]);

        return ans;
    }
}
["0 fkbikbts","i gf mwdoa","qi ir oo i","4 j trouka","gn j q al","cp vnzw i","5r w wgqc","m8 x haje","fg 28694 6","ao 0850716"]
        ["0 fkbikbts","i gf mwdoa","qi ir oo i","gn j q al","4 j trouka","cp vnzw i","5r w wgqc","m8 x haje","fg 28694 6","ao 0850716"]

        ["j mo","5 m w","g 07","o 2 0","t q h"]
        ["j mo","5 m w","t q h","g 07","o 2 0"]
        ["5 m w","j mo","t q h","g 07","o 2 0"]