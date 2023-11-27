package com.sridhar.code.library.medium.dynamicprogramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {


    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for(int j=1; j<nums.length; j++) {
            for(int i=0;i<j; i++) {
                if((nums[j] > nums[i]) && (dp[i]+1 > dp[j])) {
                    dp[j] = dp[i] + 1;
                }
            }
        }
        int max = dp[0];
        for(int i=1;i<nums.length;i++) {
            if(dp[i] > max) {
                max = dp[i];
            }
        }
        return max;
    }

}
