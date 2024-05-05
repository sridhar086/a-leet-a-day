package com.sridhar.code.library.medium.graphs;

import com.sridhar.code.utils.Triplet;

import java.util.*;

public class CheapestFlightsWithKStops {


    // The most important concept to remember here is the updation of the distances that can happen inbetween
    // always remember an interesting corner case.
    /*
    This corner case made me fix an issue
    int[][] flights = new int[][]{{0,1,1},{0,2,5},{1,2,1},{2,3,1}};
     */
    public int bfsQueue(List<Map<Integer, Integer>> adjacency, int[] distances, int src, int dst, int k) {

        Queue<Triplet<Integer, Integer, Integer>> queue = new LinkedList<>();
        queue.add(Triplet.of(src, 0, 0));
        distances[src] = 0;
        while(!queue.isEmpty()) {
            Triplet<Integer, Integer, Integer> queueTriplet = queue.poll();
            int count = queueTriplet.getLevel();
            if(count >= k) {
                break;
            }
            int queueSource = queueTriplet.getNode();
            int queueDistance = queueTriplet.getDistance();
            Map<Integer, Integer> map = adjacency.get(queueSource);
            map.forEach((key, value) -> {
                int dest = key;
                int sumToReach = value + queueDistance;
                if (sumToReach <= distances[dest]) {
                    distances[dest] = sumToReach;
                    queue.add(Triplet.of(key, count+1, sumToReach));
                }
            });
        }
        return distances[dst];
    }



    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<Map<Integer, Integer>> adjacency = new ArrayList<>();
        int[] distances = new int[n];
        for(int i=0; i<n; i++) {
            adjacency.add(new HashMap<>());
            distances[i] = Integer.MAX_VALUE;
        }

        for(int[] flight: flights) {
            int source = flight[0];
            int dest = flight[1];
            int cost = flight[2];
            adjacency.get(source).put(dest, cost);
        }
        int cost = bfsQueue(adjacency, distances, src, dst, k+1);
        return cost == Integer.MAX_VALUE ? -1 : cost;
    }
}
