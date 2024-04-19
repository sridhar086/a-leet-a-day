package com.sridhar.code.library.medium.arrays.dp;

import java.util.Stack;

//Leet 581 ShortestUnsortedContinuousArray
public class ShortestUnsortedContinuousArray {
    public int findUnsortedSubarray(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int l=nums.length;
        int r=0;
        for(int i=0; i< nums.length; i++) {
            while(!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                int val = stack.pop();
                l = Math.min(val, l);
            }
            stack.push(i);
        }
        stack.clear();
        for(int i=nums.length - 1; i >=0; i--) {
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                int val = stack.pop();
                r = Math.max(val, r);
            }
            stack.push(i);
        }
        return r - l > 0 ? r-l+1 : 0;
    }
}
