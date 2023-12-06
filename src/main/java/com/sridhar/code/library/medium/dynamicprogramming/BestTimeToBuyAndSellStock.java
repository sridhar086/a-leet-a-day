package com.sridhar.code.library.medium.dynamicprogramming;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        int l=0;
        int r=1;
        int maxProfit=0;

        for(int i=0; i<prices.length && r<prices.length; i++) {
            if(prices[r] < prices[l]) {
                l=r;
                r=r+1;
            }
            else {
                if(prices[r]-prices[l] > maxProfit) {
                    maxProfit=prices[r]-prices[l];
                    r=r+1;
                } else {
                    r=r+1;
                }
            }
        }
        return maxProfit;
    }
}
