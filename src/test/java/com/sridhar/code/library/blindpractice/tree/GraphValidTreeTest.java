package com.sridhar.code.library.blindpractice.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GraphValidTreeTest {

    @Test
    public void test() {
        GraphValidTree graphValidTree = new GraphValidTree();
        boolean value = graphValidTree.validTree(5, new int[][]{{0,1},{0,2},{0,3},{1,4}});
        Assertions.assertTrue(value);
    }

    @Test
    public void test2() {
        GraphValidTree graphValidTree = new GraphValidTree();
        boolean value = graphValidTree.validTree(5, new int[][]{{0,1},{1,2},{2,3},{1,3},{1,4}});
        Assertions.assertFalse(value);
    }

}
