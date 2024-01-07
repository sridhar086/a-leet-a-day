package com.sridhar.code.library.easy.arrays;

public class MaxDiffBetweenIncreasingElements {


    public int maximumDifference(int[] nums) {
        int minElement = nums[0];
        int maxDiff = nums[1] - nums[0];

        for(int i=1; i<nums.length; i++) {
            if(nums[i] - minElement > maxDiff) {
                maxDiff = nums[i] - minElement;
            }
            if(nums[i] < minElement) {
                minElement = nums[i];
            }
        }
        if (maxDiff>0)
            return maxDiff;
        else
            return -1;
    }
}
