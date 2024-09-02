package com.sridhar.code.library.blindpractice.graph;

import com.sridhar.code.library.blindpractice.graph.CourseSchedule;
import org.junit.jupiter.api.Test;

public class CourseScheduleTest {

    @Test
    public void test() {
        CourseSchedule courseSchedule = new CourseSchedule();
        boolean value = courseSchedule.canFinish(2, new int[][]{{0,1}, {1,0}});
    }
}
