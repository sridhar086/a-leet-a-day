package com.sridhar.code.library.medium.graphs;

import com.sridhar.code.library.medium.dynamicprogramming.CoinChangeII;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CourseScheduleIITest {


    @Test
    void testv2() {
        CourseScheduleII courseScheduleII = new CourseScheduleII();
        int[] output = courseScheduleII.findOrder(4, new int[][]{{1,0},{2,0},{3,1},{3,2}});
        System.out.println(Arrays.toString(output));
        System.out.println("output");
    }

    @Test
    void testv1() {
        CourseScheduleII courseScheduleII = new CourseScheduleII();
        int[] output = courseScheduleII.findOrder(2, new int[][]{{0,1}});
        System.out.println(Arrays.toString(output));
        System.out.println("output");
    }
}
