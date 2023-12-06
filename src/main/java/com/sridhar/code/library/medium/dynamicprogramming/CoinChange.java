package com.sridhar.code.library.medium.dynamicprogramming;


import java.util.Arrays;

/*
LEET 322
Dynamic Programming
 */
public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
        Arrays.sort(coins);
        for(int i=1; i<=amount; i++) {
            for(int coin: coins) {
                if(i-coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i-coin] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
