package com.sridhar.code.library.medium.arrays.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaintHouseTest {

    @Test
    void testv2() {
        PaintHouse paintHouse = new PaintHouse();
        int[][] array = {{17,2,17},{16,16,5},{14,3,19}};
        int returned = paintHouse.minCost(array);
        assertEquals(10, returned);
    }
}
