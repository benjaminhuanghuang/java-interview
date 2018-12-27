package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0468_ValidateIPAddressTest {

    @Test
    public void validIPAddress() {
        LC_0468_ValidateIPAddress s = new LC_0468_ValidateIPAddress();
        String res = s.validIPAddress("172.16.254.1");
        Assert.assertEquals("IPv4", res);
    }

    @Test
    public void validIPAddress2() {
        LC_0468_ValidateIPAddress s = new LC_0468_ValidateIPAddress();
        String res = s.validIPAddress("12..33.4");
        Assert.assertEquals("Neither", res);
    }

    @Test
    public void validIPAddress3() {
        LC_0468_ValidateIPAddress s = new LC_0468_ValidateIPAddress();
        String res = s.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334");
        Assert.assertEquals("IPv6", res);
    }

    @Test
    public void validIPAddress4() {
        LC_0468_ValidateIPAddress s = new LC_0468_ValidateIPAddress();
        String res = s.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:");
        Assert.assertEquals("Neither", res);
    }
}