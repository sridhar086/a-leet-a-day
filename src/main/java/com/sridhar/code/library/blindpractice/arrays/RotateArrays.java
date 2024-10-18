package com.sridhar.code.library.blindpractice.arrays;

import java.util.List;

public class RotateArrays {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for(int base = 0; count<nums.length; base++) {
            int current = base;
            int currentval = nums[base];
            do {
                int next = (current+k) % nums.length;
                int temp = nums[next];
                nums[next] = currentval;
                currentval = temp;
                current = next;
                count++;
            } while(base!=current);
        }
    }


    public void rotate2(List<Integer> nums, int k) {
        k = k % nums.size();
        int count = 0;
        for(int base = 0; count<nums.size(); base++) {
            int current = base;
            int currentval = nums.get(base);
            do {
                int next = (current+k) % nums.size();
                int temp = nums.get(next);
                nums.add(next, currentval);
                currentval = temp;
                current = next;
                count++;
            } while(base!=current);
        }
    }

    public void rotate3(int[] nums, int k) {
        k = k % nums.length;
        reverseAll(nums);
        reverseArray(nums, k);
    }

    public void reverseAll(int[] nums) {
        for(int i=0, j=nums.length-1; i<nums.length && j>=0 && i<j ; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    public void reverseArray(int[] nums, int offset) {

        for(int i=0, j=offset-1; i<offset && j>=0 && i<j ; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        for(int i=offset, j=nums.length-1; i<nums.length && j>=offset && i<j ; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

    }
}