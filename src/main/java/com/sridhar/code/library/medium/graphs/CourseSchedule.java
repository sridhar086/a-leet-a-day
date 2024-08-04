package com.sridhar.code.library.medium.graphs;


import java.util.ArrayList;
import java.util.List;

/*
There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
Return true if you can finish all courses. Otherwise, return false.



Example 1:

Input: numCourses = 2, prerequisites = [[1,0]]
Output: true
Explanation: There are a total of 2 courses to take.
To take course 1 you should have finished course 0. So it is possible.
Example 2:

Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
Output: false
Explanation: There are a total of 2 courses to take.
To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.


Constraints:

1 <= numCourses <= 2000
0 <= prerequisites.length <= 5000
prerequisites[i].length == 2
0 <= ai, bi < numCourses
All the pairs prerequisites[i] are unique.
 */
public class CourseSchedule {

    private boolean dfsCycleSearch(int node, List<List<Integer>> adjacency, boolean[] visited, boolean[] inCurrentSearch) {

        if(inCurrentSearch[node]) {
            return true;
        }

        if(visited[node]) {
            return false;
        }
        visited[node] = true;
        inCurrentSearch[node] = true;
        for(int neighbors: adjacency.get(node)) {
            if(dfsCycleSearch(neighbors, adjacency, visited, inCurrentSearch)) {
                return true;
            }
        }
        inCurrentSearch[node] = false;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> adjacency = new ArrayList<>();
        for(int course=0;course<numCourses; course++) {
            adjacency.add(new ArrayList<>());
        }

        for(int[] preReq: prerequisites) {
            adjacency.get(preReq[1]).add(preReq[0]);
        }
        boolean[] visited = new boolean[numCourses];
        boolean[] inCurrentSearch = new boolean[numCourses];

        for(int course=0;course<numCourses; course++) {
            if(dfsCycleSearch(course, adjacency, visited, inCurrentSearch)) {
                return false;
            }
        }
        return true;

    }



}
