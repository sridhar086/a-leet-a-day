package com.sridhar.code.library.blindpractice.graph;

import org.junit.jupiter.api.Test;

public class NumberOfIslandTest {

    @Test
    public void test(){
        NumberOfIsland numberOfIsland = new NumberOfIsland();
        numberOfIsland.numIslands(new char[][]{{'1','1','1'},{'0','1','0'},{'1','1','1'}});
    }
}
