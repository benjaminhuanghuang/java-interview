package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0997_FindtheTownJudgeTest {

    @Test
    public void findJudge() {
        LC_0997_FindtheTownJudge s = new LC_0997_FindtheTownJudge();

        int t = s.findJudge(3, new int[][]{{1, 3}, {2, 3}, {3, 1}});

        Assert.assertEquals(-1, t);
    }

    @Test
    public void findJudge2() {
        LC_0997_FindtheTownJudge s = new LC_0997_FindtheTownJudge();

        int t = s.findJudge(4, new int[][]{{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}});

        Assert.assertEquals(3, t);
    }

    @Test
    public void findJudge3() {
        LC_0997_FindtheTownJudge s = new LC_0997_FindtheTownJudge();

        int t = s.findJudge(3, new int[][]{{1, 3}, {2, 3}, {3, 1}});

        Assert.assertEquals(-1, t);
    }

    @Test
    public void findJudge4() {
        LC_0997_FindtheTownJudge s = new LC_0997_FindtheTownJudge();

        int t = s.findJudge(3, new int[][]{{1, 2}, {2, 3}});

        Assert.assertEquals(-1, t);
    }

    @Test
    public void findJudge5() {
        LC_0997_FindtheTownJudge s = new LC_0997_FindtheTownJudge();

        int t = s.findJudge(4, new int[][]{{1, 2}, {1, 3}, {2, 1}, {2, 3}, {1, 4}, {4, 3}, {4, 1}});

        Assert.assertEquals(3, t);
    }

    @Test
    public void findJudge6() {
        LC_0997_FindtheTownJudge s = new LC_0997_FindtheTownJudge();

        int t = s.findJudge(2, new int[][]{{1, 2}, {2, 1}});

        Assert.assertEquals(-1, t);
    }

    @Test
    public void findJudge7() {
        LC_0997_FindtheTownJudge s = new LC_0997_FindtheTownJudge();

        int t = s.findJudge(4, new int[][]{{1, 2}, {3, 2}, {1, 3}, {3, 4}, {3, 1}, {2, 1}, {1, 4}, {4, 3}, {4, 1}, {2, 4}});

        Assert.assertEquals(-1, t);
    }

    @Test
    public void findJudge8() {
        LC_0997_FindtheTownJudge s = new LC_0997_FindtheTownJudge();

        int t = s.findJudge(7, new int[][]{{4, 7}, {1, 3}, {5, 6}, {5, 4}, {6, 2}, {1, 6}, {3, 7}, {7, 2}, {1, 2}, {3, 1}, {6, 7}, {
                7, 6}, {6, 3}, {3, 6}, {4, 1}, {3, 2}, {4, 5}, {7, 5}, {4, 2}, {6, 5}, {3, 5}, {4, 6}, {5, 2}, {6, 1}, {5, 7}, {7, 4}, {4, 3}, {
                1, 7}, {3, 4}});

        Assert.assertEquals(2, t);
    }
}