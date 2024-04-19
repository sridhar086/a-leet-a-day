package com.sridhar.code.library.medium.arrays.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestUnsortedContinuousArrayTest {

    @Test
    void testv2() {
        ShortestUnsortedContinuousArray shortestUnsortedContinuousArray = new ShortestUnsortedContinuousArray();
        int returned = shortestUnsortedContinuousArray.findUnsortedSubarray(new int[]{2 ,-5, 3, 1, -4, 0, -10, 2, 8});
        assertEquals(8, returned);
    }
}
