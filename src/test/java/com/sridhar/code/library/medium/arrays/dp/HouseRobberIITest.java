package com.sridhar.code.library.medium.arrays.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HouseRobberIITest {

    @Test
    void testv2() {
        HouseRobberII houseRobberII = new HouseRobberII();
        int returned = houseRobberII.rob(new int[]{1, 2, 3, 1});
//        int returned = houseRobberII.rob(new int[]{4, 1, 2, 7, 5, 3, 1});
        assertEquals(4, returned);
    }

    @Test
    void testv3() {
        HouseRobberII houseRobberII = new HouseRobberII();
        int returned = houseRobberII.rob(new int[]{2, 3, 2});
//        int returned = houseRobberII.rob(new int[]{4, 1, 2, 7, 5, 3, 1});
        assertEquals(3, returned);
    }
}
