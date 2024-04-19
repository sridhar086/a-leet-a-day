package com.sridhar.code.library.medium.arrays.dp;

public class MaximumProductSubarray {

    //152. Maximum Product Subarray

    public int maxProduct(int[] nums) {
        int minValue = nums[0];
        int maxValue = nums[0];
        int result = maxValue;
        for(int i=1; i<=nums.length-1; i++) {
            int currValue = nums[i];
            int localMin = minValue;
            int localMax = maxValue;
            maxValue = Math.max(Math.max(currValue, currValue*localMax), currValue*localMin);
            minValue = Math.min(Math.min(currValue, currValue*localMax), currValue*localMin);
            result = Math.max(maxValue, result);
        }
        return result;
    }
}
