package com.sridhar.code.library.hard.heap;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestRangeCoveringElementsFromKListsTest {

    @Test
    void test1() {
        SmallestRangeCoveringElementsFromKLists smallestRangeCoveringElementsFromKLists = new SmallestRangeCoveringElementsFromKLists();
        int[][] array = {{4,10,15,24,26},{0,9,12,20},{5,18,22,30}};
        List<List<Integer>> howisthat = Arrays.stream(array).map(i -> Arrays.stream(i).boxed().toList()).collect(Collectors.toList());
        int n = 4;
        int[] returned = smallestRangeCoveringElementsFromKLists.smallestRange(howisthat);
        assertEquals(20, returned[0]);
        assertEquals(24, returned[1]);
    }
}
