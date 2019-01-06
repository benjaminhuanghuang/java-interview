package cn.huang.leetcode;

import java.util.*;

/*
911. Online Election

In an election, the i-th vote was cast for persons[i] at time times[i].

Now, we would like to implement the following query function: TopVotedCandidate.q(int t) will return the number of
the person that was leading the election at time t.

Votes cast at time t will count towards our query.  In the case of a tie, the most recent vote (among tied candidates) wins.


Example 1:

Input: ["TopVotedCandidate","q","q","q","q","q","q"], [[[0,1,1,0,0,1,0],[0,5,10,15,20,25,30]],[3],[12],[25],[15],[24],[8]]
Output: [null,0,1,1,0,0,1]
Explanation:
At time 3, the votes are [0], and 0 is leading.
At time 12, the votes are [0,1,1], and 1 is leading.
At time 25, the votes are [0,1,1,0,0,1], and 1 is leading (as ties go to the most recent vote.)
This continues for 3 more queries at time 15, 24, and 8.



Note:

    1 <= persons.length = times.length <= 5000
    0 <= persons[i] <= persons.length
    times is a strictly increasing array with all elements in [0, 10^9].
    TopVotedCandidate.q is called at most 10000 times per test case.
    TopVotedCandidate.q(int t) is always called with t >= times[0].


 */
public class LC_0911_OnlineElection {
    class TopVotedCandidate {
        Map<Integer, Integer> history = new HashMap<>();
        int[] times;

        public TopVotedCandidate(int[] persons, int[] times) {
            this.times = times;
            Map<Integer, Integer> votes = new HashMap<>();
            int n = persons.length;
            int winner = persons[0];
            for (int i = 0; i < n; i++) {
                votes.put(persons[i], votes.getOrDefault(persons[i], 0)+1);
                if (votes.get(persons[i]) >= votes.get(winner))
                    winner = persons[i];
                history.put(times[i], winner);
            }
        }

        public int q(int t) {

            int i = Arrays.binarySearch(times, t);
            if (i < 0)
                //The insertion point is defined as the point at which the key would be inserted into the array
                //1.不存在时由1开始计数；
                return history.get(times[-i-1]);
            return history.get(times[i]);
        }
    }
}
