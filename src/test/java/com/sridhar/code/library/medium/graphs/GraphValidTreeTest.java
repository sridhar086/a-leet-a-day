package com.sridhar.code.library.medium.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GraphValidTreeTest {

    @Test
    void testv2() {
        GraphValidTree graphValidTree = new GraphValidTree();
        boolean validTree = graphValidTree.validTree(5, new int[][]{{0,1},{1,2},{2,3},{1,3},{1,4}});
        Assertions.assertFalse(validTree);
    }
}
