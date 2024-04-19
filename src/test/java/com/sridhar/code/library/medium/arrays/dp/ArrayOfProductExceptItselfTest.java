package com.sridhar.code.library.medium.arrays.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayOfProductExceptItselfTest {

    @Test
    void testv2() {
        ArrayOfProductExceptItself arrayOfProductExceptItself = new ArrayOfProductExceptItself();
        int[] returned = arrayOfProductExceptItself.productExceptSelf(new int[]{1,2,3,4,5,6});

        assertArrayEquals(new int[]{720, 360, 240, 180, 144, 120}, returned);
    }
}
