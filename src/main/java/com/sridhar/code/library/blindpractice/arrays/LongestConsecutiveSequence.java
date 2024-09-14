package com.sridhar.code.library.blindpractice.arrays;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {

        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }

        int max = 0;
        for (int num : nums) {
            if(!hashSet.contains(num-1)) {
                int temp = num;
                int count = 1;
                while(hashSet.contains(++temp)) {
                    count++;
                    hashSet.remove(temp);
                }
                temp = num;
                while(hashSet.contains(--temp)) {
                    count++;
                    hashSet.remove(temp);
                }
                max = Math.max(count, max);
            }
        }
        return max;
    }

}
