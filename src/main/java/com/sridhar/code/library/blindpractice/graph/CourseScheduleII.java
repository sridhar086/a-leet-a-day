package com.sridhar.code.library.blindpractice.graph;

import java.util.ArrayList;
import java.util.List;

/*
only using depth first search and detecting the cycle
 */
public class CourseScheduleII {

    private boolean dfsCycleSearch(int course, List<List<Integer>> adjacency, boolean[] visited, boolean[] cycle, List<Integer> courses) {

        if(cycle[course]) {
            return true;
        }

        if(visited[course]) {
            return false;
        }
        cycle[course] = true;
        for(int neighbors: adjacency.get(course)) {
            if(dfsCycleSearch(neighbors, adjacency, visited, cycle, courses)) {
                return true;
            }
        }
        cycle[course] = false;
        visited[course] = true;
        courses.add(course);
        return false;
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        List<List<Integer>> adjacency = new ArrayList<>();
        for(int course=0;course<numCourses; course++) {
            adjacency.add(new ArrayList<>());
        }

        for(int[] preReq: prerequisites) {
            adjacency.get(preReq[0]).add(preReq[1]);
        }
        boolean[] visited = new boolean[numCourses];
        boolean[] cycle = new boolean[numCourses];
        List<Integer> courses = new ArrayList<>();

        for(int course=0;course<numCourses; course++) {
            if(dfsCycleSearch(course, adjacency, visited, cycle, courses)) {
                return new int[]{};
            }
        }
        return courses.stream().mapToInt(Integer::intValue).toArray();
    }

}
