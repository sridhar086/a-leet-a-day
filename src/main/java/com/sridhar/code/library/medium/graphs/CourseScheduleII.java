package com.sridhar.code.library.medium.graphs;

import java.util.*;

public class CourseScheduleII {

    Set<Integer> visit = new HashSet<>();
    List<Integer> output = new ArrayList<>();
    Set<Integer> cycle = new HashSet<>();

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        HashMap<Integer, Set<Integer>> hashMap = new HashMap<>();
        for(int i=0; i<prerequisites.length; i++) {
            int course = prerequisites[i][0];
            int pre = prerequisites[i][1];
            if(hashMap.containsKey(course)) {
                hashMap.get(course).add(pre);
            } else {
                Set<Integer> set = new HashSet<>();
                set.add(pre);
                hashMap.put(course, set);
            }
        }

        for(int i=0; i<numCourses; i++) {
            if(!depthFirstSearch(i, hashMap)) {
                return new int[]{};
            }
        }

        int[] arr = new int[output.size()];
        int i = 0;
        for (int x : output)
            arr[i++] = x;
        return arr;
    }


    private boolean depthFirstSearch(int course, HashMap<Integer, Set<Integer>> hashMap) {
        if(cycle.contains(course))
            return false;
        if(visit.contains(course))
            return true;

        cycle.add(course);
        if(hashMap.containsKey(course)) {
            for (Integer pre : hashMap.get(course)) {
                if(!depthFirstSearch(pre, hashMap)) {
                    return false;
                }
            }
        }
        cycle.remove(course);
        visit.add(course);
        output.add(course);
        return true;
    }

}
