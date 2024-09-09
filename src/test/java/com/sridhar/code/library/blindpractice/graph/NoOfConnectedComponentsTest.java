package com.sridhar.code.library.blindpractice.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NoOfConnectedComponentsTest {


    @Test
    public void connectedcomponentstest() {
        NoOfConnectedComponents noOfConnectedComponents = new NoOfConnectedComponents();
        int value = noOfConnectedComponents.countComponents(2, new int[][]{{1,0}});
        Assertions.assertEquals(value, 1);
    }
}
