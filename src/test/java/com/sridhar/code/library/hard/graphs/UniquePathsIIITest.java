package com.sridhar.code.library.hard.graphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniquePathsIIITest {



    @Test
    void test1() {
        UniquePathsIII uniquePathsIII = new UniquePathsIII();
        int[][] array = {{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
        int returned = uniquePathsIII.uniquePathsIII(array);
        assertEquals(2, returned);
    }


    @Test
    void test2() {
        UniquePathsIII uniquePathsIII = new UniquePathsIII();
        int[][] array =  {{1,0,0,0},{0,0,0,0},{0,0,0,2}};
        int returned = uniquePathsIII.uniquePathsIII(array);
        assertEquals(4, returned);
    }

    @Test
    void test3() {
        UniquePathsIII uniquePathsIII = new UniquePathsIII();
        int[][] array = {{0,1},{2,0}};
        int returned = uniquePathsIII.uniquePathsIII(array);
        assertEquals(0, returned);
    }


}
