package com.sridhar.code.library.medium.dynamicprogramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MaximumArithmeticSubSequence {

    public int longestArithSeqLength(int[] nums) {

        List<HashMap<Integer, Integer>> dp = new ArrayList<>();
        HashMap<Integer, Integer>[] hashMapArray = (HashMap<Integer, Integer>[])new HashMap[nums.length];
        for (int i =0; i< nums.length; i++) {
            hashMapArray[i] = new HashMap<>();
        }

        int r = 1;
        int max=0;
        while(r<nums.length) {
            HashMap<Integer, Integer> rightMap = new HashMap<>();
            for(int l=0; l<r; l++) {
                int diff = nums[l]-nums[r];
                hashMapArray[r].put(diff, hashMapArray[l].getOrDefault(diff, 1) + 1);
                max = Math.max(max, hashMapArray[r].get(diff));
            }
            r++;
        }
        return max;
    }

}
