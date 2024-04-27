package com.sridhar.code.library.medium.graphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheapestFlightsWithKStopsTest {

    @Test
    void testv2() {
        CheapestFlightsWithKStops cheapestFlightsWithKStops = new CheapestFlightsWithKStops();
        int[][] flights = new int[][]{{1, 5, 300}, {1, 2, 200}, {1, 3, 250}, {2, 4, 30}, {4, 5, 20}, {3, 5, 150}};
        int[] dests = new int[]{0,1,2,3,4,5};
        int returned = cheapestFlightsWithKStops.findCheapestPrice(6, flights, 1, 5, 2);
        assertEquals(250, returned);
    }

    @Test
    void testv3() {
        CheapestFlightsWithKStops cheapestFlightsWithKStops = new CheapestFlightsWithKStops();
        int[][] flights = new int[][]{{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int returned = cheapestFlightsWithKStops.findCheapestPrice(4, flights, 0, 3, 1+1);
        assertEquals(700, returned);
    }

    @Test
    void testv4() {
        CheapestFlightsWithKStops cheapestFlightsWithKStops = new CheapestFlightsWithKStops();
        int[][] flights = new int[][]{{3,4,4},{2,5,6},{4,7,10},{9,6,5},{7,4,4},{6,2,10},{6,8,6},{7,9,4},{1,5,4},{1,0,4},{9,7,3},{7,0,5},{6,5,8},{1,7,6},{4,0,9},{5,9,1},{8,7,3},{1,2,6},{4,1,5},{5,2,4},{1,9,1},{7,8,10},{0,4,2},{7,2,8}};
        int returned = cheapestFlightsWithKStops.findCheapestPrice(10, flights, 6, 0, 7);
        assertEquals(700, returned);
    }
}
