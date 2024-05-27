package com.sridhar.code.library.hard.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumLengthSubArrayTest {

    @Test
    void testv2() {
        MinimumLengthSubArray minimumLengthSubArray = new MinimumLengthSubArray();
        int[] array = {2,2,1,3};
        int  k = 3;
        int returned = minimumLengthSubArray.findMinimumLengthSubarray(Arrays.stream(array).boxed().toList(), k);
        assertEquals(3, returned);
    }

    @Test
    void testv3() {
        MinimumLengthSubArray minimumLengthSubArray = new MinimumLengthSubArray();
        int[] array = {1,2,1,2,3};
        int  k = 2;
        int returned = minimumLengthSubArray.findMinimumLengthSubarray(Arrays.stream(array).boxed().toList(), k);
        assertEquals(2, returned);
    }
}
