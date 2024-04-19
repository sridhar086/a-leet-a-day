package com.sridhar.code.library.medium.arrays.dp;

import com.sridhar.code.library.medium.arrays.FindIfElementIsInSortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSumOfNonAdjacentArrayTest {

    @Test
    void testv2() {
        MaximumSumOfNonAdjacentArray maximumSumOfNonAdjacentArray = new MaximumSumOfNonAdjacentArray();
//        int returned = maximumSumOfNonAdjacentArray.rob(new int[]{1, 3, 5, 9, 35, 43, 56, 99});
//        int returned = maximumSumOfNonAdjacentArray.rob(new int[]{4,1,2,7,5,3,1});
        int returned = maximumSumOfNonAdjacentArray.rob(new int[]{6,6,4,8,4,3,3,10});

        assertEquals(12, returned);
    }
}
