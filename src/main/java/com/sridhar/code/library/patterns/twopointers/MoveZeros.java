package com.sridhar.code.library.patterns.twopointers;

public class MoveZeros {

    //todo

    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if(num == 0)
                count++;
        }
        int i=0;
        int curr=0;
        int size = nums.length-count;

        while(i<size) {
            if(nums[curr] != 0) {
                nums[i] = nums[curr];
                i++;
            }
            curr++;
        }
        while(i<nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}
