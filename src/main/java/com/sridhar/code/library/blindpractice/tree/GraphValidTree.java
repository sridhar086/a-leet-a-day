package com.sridhar.code.library.blindpractice.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class GraphValidTree {


    public boolean validTree(int n, int[][] edges) {

        //checking cycle is easy in undirected graph, because if no of edges is not n-1, then
        if(edges.length != n-1)
            return false;

        HashMap<Integer, List<Integer>> adj = new HashMap<>();
        for (int i = 0; i < n; i++) {
            adj.put(i, new ArrayList<>());
        }

        for(int[] edge: edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        HashSet<Integer> visits = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if(!visits.contains(i)) {
                dfs(0, adj, visits);
            }
        }
        return visits.size() == n;

    }

    public boolean dfs(int node, HashMap<Integer, List<Integer>> hashMap, HashSet<Integer> visits) {
        if(visits.contains(node))
            return true;
        visits.add(node);
        for(int neighbor: hashMap.get(node)) {
            dfs(neighbor, hashMap, visits);
        }
        return true;

    }

}
