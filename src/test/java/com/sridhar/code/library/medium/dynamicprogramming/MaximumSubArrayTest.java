package com.sridhar.code.library.medium.dynamicprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumSubArrayTest {

    @Test
    public void test() {
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        int sum = maximumSubArray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        Assertions.assertEquals(6, sum);
    }
}
