package com.sridhar.code.library.acompany.amazon;



/*

given n sprints,

where, n=3
sprints [2,3,2]
each sprint is done in i'th days


sprint 1             sprint 2            sprint 3
day 1  day 2     day 1 day 2 day 3      day 1 day 2

given k = 4, a person can only attend 4 consecutive days but maximize points earned
what is the maximum point earned ?


given values of products such as

1 4 7 9 10 1

remove j items such that, any k items bought will never exceed threshold.
 */

import java.util.LinkedList;
import java.util.List;

public class AmazonSprintsProblem {

    public int getMaximumPoints(int n, List<Integer> sprints, int k) {

        if(k == 0) {
            return 0;
        }
        //minimize the k elements
        int track = 0;
        int minSum = Integer.MAX_VALUE;
        int currMinSum = 0;
        int totalSum = 0;
        int totalDays = 0;
        for(int sprint: sprints) {
            totalDays+=sprint;
        }

        int minimalDays = totalDays - k;
        LinkedList<Integer> minimalWindow = new LinkedList<>();

        for(int sprint: sprints) {
            for(int days=1; days<=sprint; days++) {
                if(track<minimalDays) {
                    minimalWindow.offerLast(days);
                    currMinSum += days;
                    totalSum += days;
                    track+=1;
                } else {
                    totalSum += days;
                    minSum = Math.min(currMinSum, minSum);
                    int remove = minimalWindow.pollFirst();
                    minimalWindow.offerLast(days);
                    currMinSum = currMinSum - remove + days;
                }
            }
        }
        return totalSum-minSum;
    }

}
