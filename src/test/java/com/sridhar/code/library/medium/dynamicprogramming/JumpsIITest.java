package com.sridhar.code.library.medium.dynamicprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JumpsIITest {

    @Test
    void testv2() {
        JumpsII jumpsII = new JumpsII();
        int ans = jumpsII.jump(new int[]{2 ,3 ,1, 1, 4});
        Assertions.assertEquals(ans, 2);
    }
}
