package com.sridhar.code.library.blindpractice.arrays;

public class MinimumInRotatedSortedArray {

    public int findMin(int[] nums) {
        int val = recursion(0, nums.length-1, nums);
        return val == -1 ? nums[0] : val;
    }
    public int recursion(int l, int r, int[] nums) {
        if(l < r) {
            if(nums[l] < nums[r]) {
                return -1;
            } else {
                if(l==r-1) {
                    return nums[r];
                } else {
                    if(nums[(l+r)/2] < nums[l]) {
                        return recursion(l, (l+r)/2, nums);
                    } else {
                        return recursion((l+r)/2, r, nums);
                    }
                }
            }
        } else {
            return -1;
        }
    }
}
