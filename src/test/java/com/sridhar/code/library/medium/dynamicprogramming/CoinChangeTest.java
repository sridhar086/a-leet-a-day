package com.sridhar.code.library.medium.dynamicprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoinChangeTest {


    @Test
    void testv2() {
        CoinChange coinChange = new CoinChange();
        int ans = coinChange.coinChange(new int[]{1, 2, 5}, 11);
        Assertions.assertEquals(ans, 3);
    }

    @Test
    void testv3() {
        CoinChange coinChange = new CoinChange();
        int ans = coinChange.coinChange(new int[]{2}, 3);
        Assertions.assertEquals(ans, -1);
    }
}
