package com.sridhar.code.library.medium.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;


public class MoveAllZerosToEitherEndsTest {


    @Test
    void testv2() {
        MoveAllZerosToEitherEnds moveAllZerosToEitherEnds = new MoveAllZerosToEitherEnds();
        int[] returned = moveAllZerosToEitherEnds.moveZerosToBeginning(new int[]{1, 0, 2, 5, 0, 1, 0, 1});
        assertArrayEquals(new int[]{0, 0, 0, 1, 2, 5, 1, 1}, returned);
    }

    @Test
    void testv3() {
        MoveAllZerosToEitherEnds moveAllZerosToEitherEnds = new MoveAllZerosToEitherEnds();
        int[] returned = moveAllZerosToEitherEnds.moveZerosToEnd(new int[]{1, 0, 2, 5, 0, 1, 0, 1});
        System.out.println(Arrays.stream(returned).mapToObj(String::valueOf).collect(Collectors.joining()));
        assertArrayEquals(new int[]{1, 2, 5, 1, 1, 0, 0, 0}, returned);
    }

}
