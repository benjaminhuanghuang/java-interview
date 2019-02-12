package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LC_0989_AddtoArray_FormofIntegerTest {

    @Test
    public void addToArrayForm() {
        LC_0989_AddtoArray_FormofInteger s= new LC_0989_AddtoArray_FormofInteger();
        List<Integer> res = s.addToArrayForm(new int[]{2,7,4}, 181);

        for(int a : res)
        {
            System.out.println(a);
        }
    }

    @Test
    public void addToArrayForm2() {
        LC_0989_AddtoArray_FormofInteger s= new LC_0989_AddtoArray_FormofInteger();
        List<Integer> res = s.addToArrayForm(new int[]{0}, 23);

        for(int a : res)
        {
            System.out.println(a);
        }
    }
    @Test
    public void addToArrayForm3() {
        LC_0989_AddtoArray_FormofInteger s= new LC_0989_AddtoArray_FormofInteger();
        List<Integer> res = s.addToArrayForm(new int[]{0}, 10000);

        for(int a : res)
        {
            System.out.println(a);
        }
    }

    @Test
    public void addToArrayForm4() {
        LC_0989_AddtoArray_FormofInteger s= new LC_0989_AddtoArray_FormofInteger();
        List<Integer> res = s.addToArrayForm(new int[]{6,5,6}, 6);

        for(int a : res)
        {
            System.out.println(a);
        }
    }
}