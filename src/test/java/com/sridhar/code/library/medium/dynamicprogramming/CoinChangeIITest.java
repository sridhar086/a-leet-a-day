package com.sridhar.code.library.medium.dynamicprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoinChangeIITest {

    @Test
    void testv2() {
        CoinChangeII coinChangeII = new CoinChangeII();
        int ans = coinChangeII.change(5, new int[]{1, 2, 5});
        Assertions.assertEquals(ans, 3);
    }
}
