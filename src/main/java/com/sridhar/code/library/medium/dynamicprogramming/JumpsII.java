package com.sridhar.code.library.medium.dynamicprogramming;

import java.util.Arrays;

public class JumpsII {

    public int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, 1000000);
        dp[0] = 0;
        for(int i=0; i<=n-1; i++) {
            for(int j=i+1; j<=nums[i]+i; j++) {
                if(j < n) {
                    dp[j] = Math.min(dp[j], dp[i] + 1);
                }
                if(j == n-1) {
                    return dp[n-1];
                }
            }
        }
        return dp[n-1];
    }




}
