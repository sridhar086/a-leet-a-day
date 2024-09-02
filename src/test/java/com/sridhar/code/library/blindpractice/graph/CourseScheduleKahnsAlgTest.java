package com.sridhar.code.library.blindpractice.graph;

import org.junit.jupiter.api.Test;

public class CourseScheduleKahnsAlgTest {

    @Test
    public void test() {
        CourseScheduleKahnsAlg courseScheduleKahnsAlg = new CourseScheduleKahnsAlg();
        courseScheduleKahnsAlg.findOrder(4, new int[][]{ {1, 0}, {2,0}, {2,1}, {3,1}, {3,2} });

    }
}
