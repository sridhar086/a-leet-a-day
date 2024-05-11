package com.sridhar.code.library.hard.dp.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrappingRainWaterTest {

    @Test
    void test1() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int[] array = {0,1,0,2,1,0,1,3,2,1,2,1};
        int returned = trappingRainWater.trap(array);
        assertEquals(6, returned);
    }
}
