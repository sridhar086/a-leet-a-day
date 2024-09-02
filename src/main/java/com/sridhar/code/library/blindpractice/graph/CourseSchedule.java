package com.sridhar.code.library.blindpractice.graph;


/*
There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
Return true if you can finish all courses. Otherwise, return false.
 */

import java.util.*;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        HashSet<Integer> allElements = new HashSet<>();

        HashMap<Integer, HashSet<Integer>> hashMap = new HashMap<>();

        for(int i=0; i<numCourses; i++) {
            hashMap.put(i, new HashSet<>());
            allElements.add(i);
        }

        for(int[] prerequisite: prerequisites) {
            int baseCourse = prerequisite[0];
            int preReq = prerequisite[1];
            hashMap.get(baseCourse).add(preReq);
        }

        for(int i=0; i<numCourses; i++) {
            HashSet<Integer> visited = new HashSet<>();
            boolean value = dfs(i, hashMap, visited);
            if(!value)
                return false;
        }
        return true;
    }

    public boolean dfs(int course, HashMap<Integer, HashSet<Integer>> adjacency, HashSet<Integer> visited) {

        if(visited.contains(course)) {
            return false;
        }
        visited.add(course);
        HashSet<Integer> elements = adjacency.getOrDefault(course, new HashSet<>());
        for(int element: elements) {
            boolean value =  dfs(element, adjacency, visited);
            if(!value)
                return false;
            elements.add(element);
        }
        adjacency.remove(course);
        visited.remove(course);
        return true;
    }
}