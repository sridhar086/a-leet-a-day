package com.sridhar.code.library.medium.arrays;

import java.util.Arrays;

public class MinMeetingRoomsII {

    public int minMeetingRooms(int[][] intervals) {

        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];

        for(int i=0; i<intervals.length; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        Arrays.sort(starts);
        Arrays.sort(ends);

        int occupiedRooms = 0;
        int startIndex=0;
        int endIndex=0;
        while(startIndex < intervals.length || endIndex < intervals.length ) {

            if(startIndex == intervals.length)
                break;
            if(starts[startIndex] > ends[endIndex]) {
                startIndex++;
                endIndex++;
            } else {
                occupiedRooms += 1;
                startIndex++;
            }

        }
        return occupiedRooms;
    }

}
