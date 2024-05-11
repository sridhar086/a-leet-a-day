package com.sridhar.code.library.medium.arrays.dp;

public class MaximumSumCircularSubarray {

    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        int curMinSum = 0;
        int curMaxSum = 0;

        int totalSum = 0;

        for(int i=0; i< nums.length; i++) {
            totalSum += nums[i];
            curMinSum = Math.min(curMinSum+nums[i], nums[i]);
            minSum = Math.min(curMinSum, minSum);

            curMaxSum = Math.max(curMaxSum+nums[i], nums[i]);
            maxSum = Math.max(curMaxSum, maxSum);
        }
        return minSum == totalSum ? maxSum : Math.max(maxSum, totalSum - minSum);
    }
}
