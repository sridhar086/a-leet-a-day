package com.sridhar.code.library.medium.graphs;

import com.sridhar.code.utils.Pair;

import java.util.*;

public class CheapestFlightsWithKStops {


    int bfsStack(List<Map<Integer, Integer>> adjacency, int src, int dst, int k, boolean[] visited) {

        //todo think of having a queue
        if(k==0 || visited[src]) {
            visited[src] = true;
            return Integer.MAX_VALUE;
        }
        visited[src] = true;
        Map<Integer, Integer> map = adjacency.get(src);
        int minCost = Integer.MAX_VALUE;
        for(int key: map.keySet()) {
            int smallCost = map.get(key);
            if(key != dst) {
                int returnedCost = bfsStack(adjacency, key, dst, k-1, visited);
                smallCost = returnedCost == Integer.MAX_VALUE ? Integer.MAX_VALUE : returnedCost+smallCost;
            }
            if(smallCost < minCost) {
                minCost = smallCost;
            }
        }
        return minCost;
    }


    public int bfsQueue(List<Map<Integer, Integer>> adjacency, int src, int dst, int k, boolean[] visited) {

        Queue<Integer> queue = new LinkedList<>();
        Map<Pair<Integer, Integer>, Integer> distances = new HashMap<>();
        queue.add(src);
        visited[src] = true;
        while(!queue.isEmpty()) {
            int queueSource = queue.poll();
            Map<Integer, Integer> map = adjacency.get(queueSource);
            map.entrySet().stream().forEach(entry -> {
                Pair<Integer, Integer> key = Pair.of(queueSource, entry.getKey());
                if(distances.containsKey(key)) {
                    int value = distances.get(key);
                    distances.put(key, Math.min(value, ))
                } else {

                }
            });

        }

    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        List<Map<Integer, Integer>> adjacency = new ArrayList<>();
        for(int i=0; i<n; i++) {
            adjacency.add(new HashMap<>());
        }

        for(int[] flight: flights) {
            int source = flight[0];
            int dest = flight[1];
            int cost = flight[2];
            adjacency.get(source).put(dest, cost);
        }
        boolean[] visited = new boolean[n];
        int cost = bfsStack(adjacency, src, dst, k+1, visited);
        return cost == Integer.MAX_VALUE ? -1 : cost;
    }
}
