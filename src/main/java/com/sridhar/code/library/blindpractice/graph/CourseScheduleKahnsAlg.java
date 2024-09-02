package com.sridhar.code.library.blindpractice.graph;

import java.util.*;

public class CourseScheduleKahnsAlg {


    public int[] findOrder(int numCourses, int[][] prerequisites) {

        HashMap<Integer, HashSet<Integer>> adjacency = new HashMap<>();
        HashMap<Integer, Integer> indegree = new HashMap<>();

        for(int i=0; i< numCourses; i++) {
            adjacency.put(i, new HashSet<>());
            indegree.put(i, 0);
        }

        for(int[] prerequisite: prerequisites) {
            adjacency.get(prerequisite[1]).add(prerequisite[0]);
            indegree.compute(prerequisite[0], (k,v) -> {
                if(v == null)
                    return 1;
                else
                    return v+1;
            });
        }

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> order =  new ArrayList<>();

        for(int i: indegree.keySet()) {
            if(indegree.get(i) == 0) {
                queue.add(i);
            }
        }

        while(!queue.isEmpty()) {
            int next = queue.poll();
            order.add(next);
            HashSet<Integer> values = adjacency.get(next);
            adjacency.remove(next);
            values.forEach(value -> indegree.compute(value, (k, v) -> {
                if (v != null) {
                    if(v == 1) {
                        queue.add(k);
                        return null;
                    } else {
                        return v-1;
                    }
                }
                return null;
            }));
        }
        if(adjacency.isEmpty()) {
            return order.stream().mapToInt(Integer::intValue).toArray();
        } else {
            return new int[]{};
        }
    }

}
