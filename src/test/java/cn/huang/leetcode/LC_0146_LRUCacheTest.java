package cn.huang.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0146_LRUCacheTest {
    @Test
    public void Test()
    {
        LC_0146_LRUCache s = new LC_0146_LRUCache();
        LC_0146_LRUCache.LRUCache cache = s.new LRUCache(2);


        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // returns 1
        cache.put(3, 3);    // evicts key 2
        cache.get(2);       // returns -1 (not found)
        cache.put(4, 4);    // evicts key 1
        cache.get(1);       // returns -1 (not found)
        cache.get(3);       // returns 3
        cache.get(4);       // returns 4
    }

}