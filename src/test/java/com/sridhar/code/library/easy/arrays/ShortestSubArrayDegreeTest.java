package com.sridhar.code.library.easy.arrays;

import org.junit.jupiter.api.Test;

public class ShortestSubArrayDegreeTest {

    @Test
    void testv2() {
        ShortestSubArrayDegree shortestSubArrayDegree = new ShortestSubArrayDegree();
        int maxDiff = shortestSubArrayDegree.findShortestSubArray(new int[]{1,2,2,3,1});
        System.out.println("max difference: " + maxDiff);
    }

    @Test
    void testv3() {
        ShortestSubArrayDegree shortestSubArrayDegree = new ShortestSubArrayDegree();
        int maxDiff = shortestSubArrayDegree.findShortestSubArray2(new int[]{1,2,2,3,1});
        System.out.println("max difference: " + maxDiff);
    }
}
