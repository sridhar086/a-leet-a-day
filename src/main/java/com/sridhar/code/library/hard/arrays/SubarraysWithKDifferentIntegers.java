package com.sridhar.code.library.hard.arrays;

import java.util.HashMap;

/*
Leet 992
 */
public class SubarraysWithKDifferentIntegers {

    public int subarraysWithKDistinct(int[] nums, int k) {
        return subArraysWithAtMostK(nums, k) - subArraysWithAtMostK(nums, k-1);
    }

    private int subArraysWithAtMostK(int[] nums, int k) {

        HashMap<Integer, Integer> integerMap = new HashMap<>();
        int l = 0;
        int r = 0;
        int count = 0;

        for(int num: nums) {
            //always try to fill at least k distinct integers
            int currInt = num;
            if(integerMap.containsKey(currInt)) {
                integerMap.replace(currInt, integerMap.get(currInt)+1);
                r++;
            } else {
                integerMap.put(currInt, 1);
                r++;
            }

            while(integerMap.size() > k) {
                int leftVal = nums[l];
                l++;
                if(integerMap.get(leftVal) > 1) {
                    integerMap.replace(leftVal, integerMap.get(leftVal) - 1);
                } else {
                    integerMap.remove(leftVal);
                }
            }
            // cumulatively add the number of sub arrays that can be formed with given two index
            count += r-l+1;
        }
        return count;
    }
}
