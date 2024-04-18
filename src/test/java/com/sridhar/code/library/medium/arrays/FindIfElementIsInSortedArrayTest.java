package com.sridhar.code.library.medium.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindIfElementIsInSortedArrayTest {


    @Test
    void testv2() {
        FindIfElementIsInSortedArray findIfElementIsInSortedArray = new FindIfElementIsInSortedArray();
        int returned = findIfElementIsInSortedArray.search(new int[]{1, 3, 5, 9, 35, 43, 56, 99}, 35);
        assertEquals(4, returned);
    }


    @Test
    void testv3() {
        FindIfElementIsInSortedArray findIfElementIsInSortedArray = new FindIfElementIsInSortedArray();
        int returned = findIfElementIsInSortedArray.search(new int[]{1, 3, 5, 9, 35, 43, 56, 99}, 34);
        assertEquals(-1, returned);
    }
}
