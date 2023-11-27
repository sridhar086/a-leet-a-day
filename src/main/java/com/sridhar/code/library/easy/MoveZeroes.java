package com.sridhar.code.library.easy;


/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.



Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]


Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1


Follow up: Could you minimize the total number of operations done?
 */
public class MoveZeroes {


    //This solution just moves all the non zero numbers and fills it up
    // from the start of the array and keeps track of total non zero number
    //once the first loop completes then
    // just fill the rest of the array with zeroes till the array ends.
    //simplest solution with just a single pass.
    public int[] moveZerosSolution2(int[] nums) {
        int i=0;
        for(int num: nums) {
            if(num != 0) {
                nums[i] = num;
                i++;
            }
        }
        for(int j=i;j<nums.length;j++) {
            nums[j] = 0;
        }
        return nums;
    }

    //This solution does two operation
    // checks if all the zeroes are at the end, if not
    // does a O(n) operation to flip numbers and continues this
    // till all numbers are moved around.
    public int[] moveZerosSolution1(int[] nums) {
        while(checkZeroes(nums)!=true) {
            for(int i = 1;i<nums.length;i++) {
                if(nums[i-1] == 0 && nums[i] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[i-1];
                    nums[i-1] = temp;
                }
            }
        }
        return nums;
    }

    public boolean checkZeroes(int[] nums) {
        boolean flag=false;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0) {
                flag = true;
            }
            if(nums[i] != 0 && flag==true) {
                flag = false;
                return false;
            }
        }
        return true;
    }
}
