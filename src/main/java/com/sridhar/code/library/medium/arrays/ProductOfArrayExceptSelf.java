package com.sridhar.code.library.medium.arrays;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] l = new int[nums.length];
        int[] r = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            l[i] = nums[i];
            r[i] = nums[i];
        }


        for(int i=1; i<nums.length; i++) {
            l[i] = l[i]*l[i-1];
        }

        for(int i=nums.length-2; i>=0; i--) {
            r[i] = r[i]*r[i+1];
        }

        int[] productSelf = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            if(i==0) {
                productSelf[i] = r[i + 1];
            } else if(i==nums.length-1) {
                productSelf[i] = l[i-1];
            } else {
                productSelf[i] = l[i-1] * r[i+1];
            }
        }

        return productSelf;

    }
}
