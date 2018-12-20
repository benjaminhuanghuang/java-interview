package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LC_0127_WordLadderTest {

    @Test
    public void ladderLength_better() {
        LC_0127_WordLadder s = new LC_0127_WordLadder();
        List<String> words = Arrays.asList("hot", "dot", "dog", "lot", "log");
        int step = s.ladderLength_better("hit", "cog", words);

        Assert.assertEquals(0, step);

    }
}