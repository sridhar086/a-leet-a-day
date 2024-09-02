package com.sridhar.code.library.medium.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JumpGameIIITest {

    @Test
    void testv3() {
        JumpGameIII jumpGameIII = new JumpGameIII();
        Assertions.assertTrue(jumpGameIII.canReach(new int[]{1,0,2,0}, 0));
    }

    @Test
    void testv4() {
        JumpGameIII jumpGameIII = new JumpGameIII();
        Assertions.assertFalse(jumpGameIII.canReach(new int[]{3,0,2,1,2}, 0));
    }
}
