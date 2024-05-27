package com.sridhar.code.library.hard.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubarraysWithKDifferentIntegersTEst {


    @Test
    void testv2() {
        SubarraysWithKDifferentIntegers subarraysWithKDifferentIntegers = new SubarraysWithKDifferentIntegers();
        int[] array = {2,2,1,3};
        int k = 2;
        int returned = subarraysWithKDifferentIntegers.subarraysWithKDistinct(array, k);
        assertEquals(3, returned);
    }

    @Test
    void testv3() {
        SubarraysWithKDifferentIntegers subarraysWithKDifferentIntegers = new SubarraysWithKDifferentIntegers();
        int[] array = {1,2,1,2,3};
        int  k = 2;
        int returned = subarraysWithKDifferentIntegers.subarraysWithKDistinct(array, k);
        assertEquals(7, returned);
    }
}
