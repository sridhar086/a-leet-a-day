package com.sridhar.code.library.medium.dynamicprogramming;

import com.sridhar.code.library.medium.tree.Pair;

import java.util.Arrays;
import java.util.HashMap;

public class PredictTheWinner {


    public int maxDiff(int[] nums, int l, int r) {
        if(l > r) {
            return 0;
        }
        int left = nums[l] - maxDiff(nums, l+1, r);
        int right = nums[r] - maxDiff(nums, l, r-1);
        return Math.max(left, right);
    }

    public boolean predictTheWinner(int[] nums) {
        return maxDiff(nums, 0, nums.length - 1) >= 0;
    }


    HashMap<Pair<Integer, Integer>, Integer> hashMap = new HashMap<>();

    public int maxDiff2(int[] nums, int l, int r) {
        if(l > r) {
            return 0;
        }
        if(hashMap.containsKey(new Pair<>(l,r))) {
            return hashMap.get(new Pair<>(l, r));
        }

        int left = nums[l] - maxDiff2(nums, l+1, r);
        int right = nums[r] - maxDiff2(nums, l, r-1);

        int value = Math.max(left, right);
        hashMap.put(new Pair<>(l,r), value);
        return value;
    }

    public boolean predictTheWinner2(int[] nums) {
        return maxDiff2(nums, 0, nums.length - 1) >= 0;
    }

    int[][] memoization;
    public int maxDiff3(int[] nums, int l, int r) {
        if(memoization[l][r] != -1) {
            return memoization[l][r];
        }
        if(l > r) {
            return 0;
        }

        int left = nums[l] - maxDiff3(nums, l+1, r);
        int right = nums[r] - maxDiff3(nums, l, r-1);

        int value = Math.max(left, right);
        memoization[l][r] = value;
        return value;
    }

    public boolean predictTheWinner3(int[] nums) {
        memoization = new int[nums.length][nums.length];
        for (int[] i :
                memoization) {  Arrays.fill(i, -1);
        }
        return maxDiff3(nums, 0, nums.length - 1) >= 0;
    }
}
