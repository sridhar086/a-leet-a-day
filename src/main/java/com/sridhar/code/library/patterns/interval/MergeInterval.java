package com.sridhar.code.library.patterns.interval;

import com.sridhar.code.utils.Pair;

import java.util.*;


class MyDef implements Comparator<Pair<Integer, Integer>> {

    @Override
    public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
        if(o1.getLeft() == o2.getLeft() && o1.getRight() == o2.getRight()) {
            return 0;
        } else if(o1.getLeft() == o2.getLeft() && o1.getRight() < o2.getRight()) {
            return -1;
        } else if(o1.getLeft() < o2.getLeft()) {
            return -1;
        } else {
            return 1;
        }
    }
}

class MyDef2 implements Comparator<int[]> {

    @Override
    public int compare(int[] o1, int[] o2) {
        if(o1[0] == o2[0] && o1[1] == o2[1]) {
            return 0;
        } else if(o1[0] == o2[0] && o1[1] < o2[1]) {
            return -1;
        } else if(o1[0] < o2[1]) {
            return -1;
        } else {
            return 1;
        }
    }
}

//todo

public class MergeInterval {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> list =  new LinkedList<>();
        for (int[] interval : intervals) {
            if(list.isEmpty() || list.getLast()[1] < interval[0]) {
                list.add(interval);
            } else {
                list.getLast()[1] = Math.max(interval[1], list.getLast()[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }

}
