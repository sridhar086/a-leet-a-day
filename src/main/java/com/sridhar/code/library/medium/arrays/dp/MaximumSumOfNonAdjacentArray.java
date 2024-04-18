package com.sridhar.code.library.medium.arrays.dp;

public class MaximumSumOfNonAdjacentArray {

    // Leet198.
    // simple non recursive dynamic programming solution.
    public int rob(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int i=0;
        while(i <= nums.length-1) {
            nums[i] += Math.max(getValue(nums, i-2), getValue(nums, i-3));
            i++;
        }
        return Math.max(getValue(nums, nums.length-1), getValue(nums, nums.length-2));
    }

    public int getValue(int[] nums, int index) {
        if(index < 0 ) {
            return 0;
        }
        return nums[index];
    }

}
