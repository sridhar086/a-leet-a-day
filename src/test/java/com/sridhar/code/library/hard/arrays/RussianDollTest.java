package com.sridhar.code.library.hard.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RussianDollTest {

    @Test
    public void test() {
        RussianDoll russianDoll = new RussianDoll();
        int[][] test = new int[][]{{1,1},{1,1},{1,1}};
        int value = russianDoll.maxEnvelopes(test);
        Assertions.assertEquals(1, value);
    }



    @Test
    public void test2() {
        RussianDoll russianDoll = new RussianDoll();
        int[][] test = new int[][]{{5,4},{6,4},{6,7},{2,3}};
        int value = russianDoll.maxEnvelopes(test);
        Assertions.assertEquals(1, value);
    }

    @Test
    public void test3() {
        RussianDoll russianDoll = new RussianDoll();
        int[][] test = new int[][]{{30,50},{12,2},{3,4},{12,15}};
        int value = russianDoll.maxEnvelopes(test);
        Assertions.assertEquals(1, value);
    }


}
