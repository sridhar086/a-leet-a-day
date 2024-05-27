package com.sridhar.code.library.hard.dp.stack;

import java.util.Stack;

public class TrappingRainWater {


    public int trap(int[] height) {

        Stack<Integer> stack = new Stack<>();
        int totalWatervolume = 0;

        for(int i=0; i<height.length; i++) {
            //chances of water dam
            while(!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.pop();
                if(stack.isEmpty())
                    break;
                int peek = stack.peek();
                totalWatervolume += (Math.min(height[peek], height[i]) - height[top]) * (i-peek-1);
            }
            stack.push(i);
        }
        return totalWatervolume;
    }
}
