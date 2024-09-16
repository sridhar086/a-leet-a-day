package com.sridhar.code.library.blindpractice.matrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovesForStonesTest {

    @Test
    public void test() {
        MovesForStones movesForStones = new MovesForStones();
        int[][] grid = new int[][] {{ 1,1,0},{1,1,1},{1,2,1 }};
        int value = movesForStones.minimumMoves(grid);
        Assertions.assertEquals(value, 3);

    }

    @Test
    public void test2() {
        MovesForStones movesForStones = new MovesForStones();
        int[][] grid = new int[][]{{1, 3, 0}, {1, 0, 0}, {1, 0, 3}};
        int value = movesForStones.minimumMoves(grid);
        Assertions.assertEquals(4, value);
    }

    @Test
    public void test3() {
        MovesForStones movesForStones = new MovesForStones();
        int[][] grid = new int[][]{{1,2,2},{1,1,0},{0,1,1}};
        int value = movesForStones.minimumMoves(grid);
        Assertions.assertEquals(value, 4);
    }


}
