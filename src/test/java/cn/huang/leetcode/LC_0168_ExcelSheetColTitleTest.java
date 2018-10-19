package cn.huang.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0168_ExcelSheetColTitleTest {
    @Test
    public void case1(){
        LC_0168_ExcelSheetColTitle s = new LC_0168_ExcelSheetColTitle();
        String title = s.convertToTitle(26);

        assertEquals("Z", title);

    }

    @Test
    public void case2(){
        LC_0168_ExcelSheetColTitle s = new LC_0168_ExcelSheetColTitle();
        String title = s.convertToTitle(701);

        assertEquals("ZY", title);

    }

    @Test
    public void case3(){
        LC_0168_ExcelSheetColTitle s = new LC_0168_ExcelSheetColTitle();
        String title = s.convertToTitle(28);

        assertEquals("AB", title);

    }
}