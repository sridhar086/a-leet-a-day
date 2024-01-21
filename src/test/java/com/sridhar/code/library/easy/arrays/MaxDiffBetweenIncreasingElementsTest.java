package com.sridhar.code.library.easy.arrays;

import org.junit.jupiter.api.Test;

public class MaxDiffBetweenIncreasingElementsTest {

    @Test
    void testv2() {
        MaxDiffBetweenIncreasingElements maxDiffBetweenIncreasingElements = new MaxDiffBetweenIncreasingElements();
        int maxDiff = maxDiffBetweenIncreasingElements.maximumDifference(new int[]{9,4,3,2});
        System.out.println("max difference: " + maxDiff);
    }
}
