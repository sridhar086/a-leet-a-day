package com.sridhar.code.library.easy.arrays;

import com.sridhar.code.library.medium.arrays.dp.PaintHouse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxProductofThreeNumbersTest {

    @Test
    void testv2() {
        MaxProductofThreeNumbers maxProductofThreeNumbers = new MaxProductofThreeNumbers();
        int[][] array = {{17,2,17},{16,16,5},{14,3,19}};
        int ans = maxProductofThreeNumbers.maximumProduct(new int[]{1,2,3,4});
        assertEquals(24, ans);
    }
}
