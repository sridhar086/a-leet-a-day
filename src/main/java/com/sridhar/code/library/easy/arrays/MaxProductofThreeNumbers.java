package com.sridhar.code.library.easy.arrays;

public class MaxProductofThreeNumbers {

    public int maximumProduct(int[] nums) {

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for(int i: nums) {
            if(i < min1) {
                if(i < min2) {
                    min1 = min2;
                    min2 = i;
                } else {
                    min1 = i;
                }
            }
            if( i > max1) {
                if(i > max2) {
                    if(i > max3) {
                        max1 = max2;
                        max2 = max3;
                        max3 = i;
                    } else {
                        max1 = max2;
                        max2 = i;
                    }
                } else {
                    max1 = i;
                }
            }
        }

        return Math.max(min1*min2*max3, max1*max2*max3);
    }

}
