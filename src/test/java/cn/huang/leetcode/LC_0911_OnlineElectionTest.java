package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0911_OnlineElectionTest {
    @Test
    public void TestCase1() {
        LC_0911_OnlineElection s = new LC_0911_OnlineElection();
        LC_0911_OnlineElection.TopVotedCandidate voter = s.new TopVotedCandidate(new int[]{0, 1, 1, 0, 0, 1, 0}, new int[]{0, 5, 10, 15, 20, 25, 30});

        int res = voter.q(3);
        Assert.assertEquals(0, res);
    }
}

