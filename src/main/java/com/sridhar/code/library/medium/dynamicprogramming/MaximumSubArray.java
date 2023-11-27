package com.sridhar.code.library.medium.dynamicprogramming;

public class MaximumSubArray {


    public int maxSubArray(int[] nums) {

        if(nums.length == 0) {
            return 0;
        }
        int curr_sum= nums[0];
        int max_sum = curr_sum;
        for(int i=1; i< nums.length; i++) {
            if(curr_sum+nums[i] > nums[i]) {
                curr_sum += nums[i];
            } else {
                curr_sum = nums[i];
            }
            if(curr_sum > max_sum) {
                max_sum = curr_sum;
            }
        }
        return max_sum;
    }

    public int maxSubArray2(int[] nums) {

        if(nums.length == 0) {
            return 0;
        }
        return recursiveMaxSubArray(nums, 0, nums.length-1);
    }

    public int recursiveMaxSubArray(int[] nums, int l, int r) {

        if(l > r) {
            return Integer.MIN_VALUE;
        }

        int mid = (l+r)/2;
        int bestLeftSum = 0;
        int bestRightSum = 0;
        int curr = 0;

        for(int i=mid-1; i>=l; i--) {
            curr += nums[i];
            bestLeftSum = Math.max(curr, bestLeftSum);
        }
        curr = 0;
        for(int i=mid+1; i<r; i++) {
            curr += nums[i];
            bestRightSum = Math.max(curr, bestRightSum);
        }
        int bestCombined = bestLeftSum + nums[mid] + bestRightSum;

        int left = recursiveMaxSubArray(nums, l, mid-1);
        int right = recursiveMaxSubArray(nums, mid+1, r);

        return Math.max(bestCombined, Math.max(left, right));
    }

}
