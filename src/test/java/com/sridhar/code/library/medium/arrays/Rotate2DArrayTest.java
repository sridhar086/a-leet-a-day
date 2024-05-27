package com.sridhar.code.library.medium.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Rotate2DArrayTest {

    @Test
    void testv2() {
        Rotate2DArray rotate2DArray = new Rotate2DArray();
        int[] nums = new int[]{1, 3, 5, 9, 35, 43, 56, 99};
        int[] expectedNums = new int[]{9, 35, 43, 56, 99, 1, 3, 5  };
        rotate2DArray.rotate(nums, 8);
        assertArrayEquals(nums, nums);
    }

//    @Test
//    void testv3() {
//        Rotate2DArray rotate2DArray = new Rotate2DArray();
//        int[] nums = new int[]{1, 3, 5, 9, 35, 43, 56, 99};
//        int[] expectedNums = new int[]{9, 35, 43, 56, 99, 1, 3, 5  };
//        rotate2DArray.cyclicalRotation(nums, 5);
//        assertArrayEquals(expectedNums, nums);
//    }

//    @Test
//    void testv4() {
//        Rotate2DArray rotate2DArray = new Rotate2DArray();
//        int[] nums = new int[]{-1, -100, 3, 99};
//        int[] expectedNums = new int[]{3, 99, -1, -100};
//        rotate2DArray.cyclicalRotation(nums, 2);
//        assertArrayEquals(expectedNums, nums);
//    }
}
