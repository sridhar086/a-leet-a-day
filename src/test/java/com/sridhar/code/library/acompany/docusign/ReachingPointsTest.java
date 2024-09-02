package com.sridhar.code.library.acompany.docusign;

import org.junit.jupiter.api.Test;

public class ReachingPointsTest {

    @Test
    public void test() {
        ReachingPoints reachingPoints = new ReachingPoints();
        reachingPoints.reachingPoints(6, 3, 6, 15);
    }

    @Test
    public void test2() {
        ReachingPoints reachingPoints = new ReachingPoints();
        reachingPoints.reachingPoints(1, 1, 3, 5);
    }

    @Test
    public void test3() {
        ReachingPoints reachingPoints = new ReachingPoints();
        reachingPoints.reachingPoints(9, 10, 9, 19);
    }
}
