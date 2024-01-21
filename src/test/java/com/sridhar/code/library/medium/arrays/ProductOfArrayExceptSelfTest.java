package com.sridhar.code.library.medium.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ProductOfArrayExceptSelfTest {

    @Test
    void testv2() {
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] binary = productOfArrayExceptSelf.productExceptSelf(new int[]{1,2,3,4});
        System.out.println(Arrays.toString(binary));
    }
}
