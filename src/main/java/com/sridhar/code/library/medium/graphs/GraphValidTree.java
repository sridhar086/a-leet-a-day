package com.sridhar.code.library.medium.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class GraphValidTree {

    /*
    You have a graph of n nodes labeled from 0 to n - 1. You are given an integer n and a list of edges where edges[i] = [ai, bi] indicates that there is an undirected edge between nodes ai and bi in the graph.
    Return true if the edges of the given graph make up a valid tree, and false otherwise.
    Input: n = 5, edges = [[0,1],[0,2],[0,3],[1,4]]
    Output: true

    Input: n = 5, edges = [[0,1],[1,2],[2,3],[1,3],[1,4]]
    Output: false


    Constraints:

    1 <= n <= 2000
    0 <= edges.length <= 5000
    edges[i].length == 2
    0 <= ai, bi < n
    ai != bi
    There are no self-loops or repeated edges.
     */

    public boolean validTree(int n, int[][] edges) {

        List<List<Integer>> adjacency = new ArrayList<>();
        for(int i=0; i<n; i++) {
            adjacency.add(new ArrayList<>());
        }

        for(int[] edge: edges) {
            adjacency.get(edge[0]).add(edge[1]);
            adjacency.get(edge[1]).add(edge[0]);
        }
        Stack<Integer> stack  = new Stack<>();
        List<Integer> seen = new ArrayList<>();
        seen.add(0);
        stack.push(0);
        while(!stack.isEmpty()) {
            int node = stack.pop();
            for(int element: adjacency.get(node)) {
                if(seen.contains(element)) {
                    continue;
                }
                seen.add(element);
                stack.push(element);
            }
        }
        return seen.size() == n;

    }


}
