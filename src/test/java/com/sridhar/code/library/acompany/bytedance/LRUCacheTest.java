package com.sridhar.code.library.acompany.bytedance;

import com.sridhar.code.library.acompany.amazon.AmazonSprintsProblem;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LRUCacheTest {

    @Test
    void testv2() {
        LRUCache lruCache = new LRUCache(2);
        /*
        ["LRUCache","put","put","get","put","get","put","get","get","get"]
        [[2],[1,1],[2,2],[1],[3,3],[2],[4,4],[1],[3],[4]]
         */

        lruCache.put(1,1);
        lruCache.put(2,2);
        System.out.println(lruCache.get(1));
        lruCache.put(3,3);
        System.out.println(lruCache.get(2));
        lruCache.put(4,4);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(3));
        System.out.println(lruCache.get(4));

    }

    @Test
    void testv3() {
        LRUCache lruCache = new LRUCache(1);
        /*
        ["LRUCache","put","get","put","get","get"]
        [[1],[2,1],[2],[3,2],[2],[3]]
         */

        lruCache.put(2,1);
        System.out.println(lruCache.get(2));
        lruCache.put(3,2);
        System.out.println(lruCache.get(2));
        System.out.println(lruCache.get(3));
    }


}
