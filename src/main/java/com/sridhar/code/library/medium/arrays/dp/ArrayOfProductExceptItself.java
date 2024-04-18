package com.sridhar.code.library.medium.arrays.dp;

public class ArrayOfProductExceptItself {

    //Leet 238.
    public int[] productExceptSelf(int[] nums) {

        int[] l = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            l[i] = nums[i];
        }

        for(int i=1; i<nums.length; i++) {
            l[i] = l[i] * l[i-1];
        }

        int temp = 1;
        for(int i=nums.length-1; i>=0; i--) {
            if(i == 0) {
                l[i] = temp;
            } else {
                l[i] = l[i-1] * temp;
                temp = temp* nums[i];
            }
        }

        return l;
    }
}
