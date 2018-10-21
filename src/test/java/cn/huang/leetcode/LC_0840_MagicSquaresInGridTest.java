package cn.huang.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0840_MagicSquaresInGridTest {
    @Test
    public void TestCase1(){
        LC_0840_MagicSquaresInGrid s = new LC_0840_MagicSquaresInGrid();
        int res = s.numMagicSquaresInside(new int[][] {{4,3,8,4},{9,5,1,9},{2,7,6,2}});
    }

}