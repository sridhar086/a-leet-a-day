package com.sridhar.code.library.blindpractice.graph;

import java.util.*;

public class NoOfConnectedComponents {

    public int countComponents(int n, int[][] edges) {
        HashMap<Integer, HashSet<Integer>> adjacency = new HashMap<>();
        for(int i=0; i<n; i++) {
            adjacency.put(i, new HashSet<>());
        }
        for(int[] edge: edges) {
            int val1 = edge[0];
            int val2 = edge[1];
            adjacency.get(val1).add(val2);
            adjacency.get(val2).add(val1);
        }
        boolean[] visited = new boolean[n];
        int count = 0;
        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                dfs(i, adjacency, visited);
                count++;
            }
        }
        return count;
    }

    private void dfs(int node, HashMap<Integer, HashSet<Integer>> adjacency,
                       boolean[] visited) {
        if(visited[node])
            return;
        visited[node] = true;
        for(int i: adjacency.get(node)) {
            dfs(i, adjacency, visited);
        }
        adjacency.remove(node);
    }

}
