package com.sridhar.code.library.medium.arrays.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumProductSubarrayTest {

    @Test
    void testv2() {
        MaximumProductSubarray maximumProductSubarray = new MaximumProductSubarray();
        int returned = maximumProductSubarray.maxProduct(new int[]{2 ,-5, 3, 1, -4, 0, -10, 2, 8});
        assertEquals(120, returned);
    }
}
