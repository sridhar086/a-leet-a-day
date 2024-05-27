package com.sridhar.code.library.hard.dp.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaintHouseIITest {

    @Test
    void testv2() {
        PaintHouseII paintHouse = new PaintHouseII();
        int[][] array = {{17,2,17,5},{16,16,5,6},{14,3,19,1}};
        int returned = paintHouse.minCost(array);
        assertEquals(8, returned);
    }
}

