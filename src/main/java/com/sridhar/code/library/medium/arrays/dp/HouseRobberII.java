package com.sridhar.code.library.medium.arrays.dp;

import java.util.Arrays;

public class HouseRobberII {

    public int rob(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        int[] temp = Arrays.copyOf(nums, nums.length);

        for(int j=0;j<temp.length-1;j++) {
            temp[j] += Math.max(getValue(temp, j-2, true), getValue(temp, j-3, true));
        }
        int interResults = Math.max(getValue(temp, temp.length-2, true), getValue(temp, temp.length-3, true));
        temp = Arrays.copyOf(nums, nums.length);
        for(int j=1;j<temp.length;j++) {
            temp[j] += Math.max(getValue(temp, j-2, false), getValue(temp, j-3, false));
        }
        return Math.max(Math.max(getValue(temp, temp.length-1, true), getValue(temp, temp.length-2, true)), interResults);
    }

    public int getValue(int[] nums, int index, boolean flag) {
        if(flag) {
            return index < 0 ? 0 : nums[index];
        } else {
            return index < 1 ? 0 : nums[index];
        }

    }
}
