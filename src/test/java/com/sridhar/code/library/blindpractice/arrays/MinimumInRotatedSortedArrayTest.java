package com.sridhar.code.library.blindpractice.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumInRotatedSortedArrayTest {

    @Test
    public void test() {
        MinimumInRotatedSortedArray minimumInRotatedSortedArray = new MinimumInRotatedSortedArray();
        int value = minimumInRotatedSortedArray.findMin(new int[]{4,5,6,7,0,1,2});
        Assertions.assertEquals(0, value);
    }
}
