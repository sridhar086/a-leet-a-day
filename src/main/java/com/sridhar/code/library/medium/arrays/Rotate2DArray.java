package com.sridhar.code.library.medium.arrays;

public class Rotate2DArray {

    //todo
    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        for(int i = 0; i < k; i++) {
            rotateOnce(nums);
        }

    }

    public void cyclicalRotation(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for(int base=0; count<nums.length; base++) {
            int current = base;
            int prev = nums[base];
            do {
                int modulo = (base+k) % nums.length;
                int temp = nums[modulo];
                nums[modulo] = prev;
                prev = temp;
                current = modulo;
                count++ ;

            } while(base != current);
        }
    }

    public void rotateOnce(int[] nums) {
        int temp1=nums[nums.length-1];
        for(int i=0; i<=nums.length-1; i++) {
            int temp2 = nums[i];
            nums[i] = temp1;
            temp1 = temp2;
        }
    }
}
