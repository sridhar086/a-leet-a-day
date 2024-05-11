package com.sridhar.code.library.medium.arrays.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSumCircularSubarrayTest {


    @Test
    void test1() {
        MaximumSumCircularSubarray maximumSumCircularSubarray = new MaximumSumCircularSubarray();
        int returned = maximumSumCircularSubarray.maxSubarraySumCircular(new int[]{1,-2,3,-2});
        assertEquals(3, returned);
    }

    @Test
    void test2() {
        MaximumSumCircularSubarray maximumSumCircularSubarray = new MaximumSumCircularSubarray();
        int returned = maximumSumCircularSubarray.maxSubarraySumCircular(new int[]{5,-3,5});
        assertEquals(10, returned);
    }

    @Test
    void test3() {
        MaximumSumCircularSubarray maximumSumCircularSubarray = new MaximumSumCircularSubarray();
        int returned = maximumSumCircularSubarray.maxSubarraySumCircular(new int[]{-3,-2,-3});
        assertEquals(-2, returned);
    }

    @Test
    void test4() {
        MaximumSumCircularSubarray maximumSumCircularSubarray = new MaximumSumCircularSubarray();
        int returned = maximumSumCircularSubarray.maxSubarraySumCircular(new int[]{-1,5,-3,-6,7});
        assertEquals(11, returned);
    }
}
