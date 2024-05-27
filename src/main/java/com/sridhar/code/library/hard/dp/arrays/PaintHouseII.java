package com.sridhar.code.library.hard.dp.arrays;

import java.util.Arrays;


//LeetCode 265 PaintHouse II
//solved a first hard dp problem in one go. This feels great.
public class PaintHouseII {


    public int minCost(int[][] costs) {

        for(int i=costs.length-2; i>=0; i--) {
            for(int j=0; j<costs[0].length; j++) {
                //calculate the sum
                int[] localCost= new int[costs[0].length];
                for(int k=0; k<costs[0].length; k++) {
                    localCost[k] = costs[i+1][k] + costs[i][j];
                }
                localCost[j] = Integer.MAX_VALUE;
                Arrays.sort(localCost);

                costs[i][j] = localCost[0];
            }
        }
        Arrays.sort(costs[0]);
        return costs[0][0];

    }
}
