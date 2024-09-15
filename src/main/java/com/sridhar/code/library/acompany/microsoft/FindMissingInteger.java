package com.sridhar.code.library.acompany.microsoft;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class FindMissingInteger {

    public int solution(int[] A) {
        // Implement your solution here
        int small = 1;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Set<Integer> set = new HashSet<>();
        for(int i: A) {
            if(i>0 && !set.contains(i)) {
                set.add(i);
                priorityQueue.add(i);
            }
        }
        while(!priorityQueue.isEmpty()) {
            int i = priorityQueue.poll();
            if( i == small )
                small = i+1;
            else

                break;
        }
        return small;
    }
}
