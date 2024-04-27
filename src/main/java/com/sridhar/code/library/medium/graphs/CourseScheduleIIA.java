package com.sridhar.code.library.medium.graphs;

import java.util.ArrayList;
import java.util.List;

public class CourseScheduleIIA {

    //todo need fixing the ordering
    private boolean dfsCycleSearch(int node, List<List<Integer>> adjacency, boolean[] visited, boolean[] inCurrentSearch, List<Integer> courses) {

        if(inCurrentSearch[node]) {
            return true;
        }

        if(visited[node]) {
            return false;
        }
        visited[node] = true;
        inCurrentSearch[node] = true;
        for(int neighbors: adjacency.get(node)) {
            if(dfsCycleSearch(neighbors, adjacency, visited, inCurrentSearch, courses)) {
                return true;
            }
        }
        inCurrentSearch[node] = false;
        courses.add(node);
        return false;
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {


        List<List<Integer>> adjacency = new ArrayList<>();
        for(int course=0;course<numCourses; course++) {
            adjacency.add(new ArrayList<>());
        }

        for(int[] preReq: prerequisites) {
            adjacency.get(preReq[1]).add(preReq[0]);
        }
        boolean[] visited = new boolean[numCourses];
        boolean[] inCurrentSearch = new boolean[numCourses];
        List<Integer> courses = new ArrayList<>();

        for(int course=0;course<numCourses; course++) {
            if(dfsCycleSearch(course, adjacency, visited, inCurrentSearch, courses)) {
                return new int[]{};
            }
        }
        return courses.stream().mapToInt(Integer::intValue).toArray();
    }
}
