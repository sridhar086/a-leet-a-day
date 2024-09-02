package com.sridhar.code.library.acompany.amazon;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AmazonSprintsProblemTest {

    @Test
    void testv2() {
        AmazonSprintsProblem amazonSprintsProblem = new AmazonSprintsProblem();
        int returned = amazonSprintsProblem.getMaximumPoints(4, List.of(4,2,3,4), 4);

        assertEquals(10, returned);
    }
}
