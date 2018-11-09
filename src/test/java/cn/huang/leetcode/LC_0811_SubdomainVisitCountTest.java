package cn.huang.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LC_0811_SubdomainVisitCountTest {

    @Test
    public void subdomainVisits() {
        LC_0811_SubdomainVisitCount s = new LC_0811_SubdomainVisitCount();
        String [] input =  new String[]{"9001 discuss.leetcode.com"};
        List<String> res =s.subdomainVisits(input);

    }
}