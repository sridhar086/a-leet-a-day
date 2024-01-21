package com.sridhar.code.library.medium.graphs;

import org.junit.jupiter.api.Test;

public class NumberOfIslandsTest {

    @Test
    void testv2() {
        char[][] array = new char[][]{{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};

        NumberOfIslands numberOfIslands = new NumberOfIslands();
        int count = numberOfIslands.numIslands(array);
        System.out.println(count);


    }

    @Test
    void testv3() {
        char[][] array = new char[][] {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        int count = numberOfIslands.numIslands(array);
        System.out.println(count);

    }
}
