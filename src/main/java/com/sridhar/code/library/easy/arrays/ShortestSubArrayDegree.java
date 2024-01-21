package com.sridhar.code.library.easy.arrays;

import java.util.*;
import java.util.stream.Collectors;

/*
Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.

Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.



Example 1:

Input: nums = [1,2,2,3,1]
Output: 2
Explanation:
The input array has a degree of 2 because both elements 1 and 2 appear twice.
Of the subarrays that have the same degree:
[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
The shortest length is 2. So return 2.
Example 2:

Input: nums = [1,2,2,3,1,4,2]
Output: 6
Explanation:
The degree is 3 because the element 2 is repeated 3 times.
So [2,2,3,1,4,2] is the shortest subarray, therefore returning 6.


Constraints:

nums.length will be between 1 and 50,000.
nums[i] will be an integer between 0 and 49,999.
 */
public class ShortestSubArrayDegree {

    class IntegerComparator implements Comparator<Map.Entry<Integer, Integer>> {
        @Override
        public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
            if(Objects.equals(o1.getValue(), o2.getValue())) {
                return 0;
            } else if(o1.getValue() < o2.getValue()) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    // my first solution
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i])+1);
            } else {
                hashMap.put(nums[i], 1);
            }
        }
        int value = hashMap.entrySet().stream().max(new IntegerComparator()).orElseThrow().getValue();
        Map<Integer, Integer> map = hashMap.entrySet().stream().filter(i -> i.getValue().equals(value))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        int smallest = Integer.MAX_VALUE;
        for(Integer key: map.keySet()) {
            int lowerindex = -1;
            int higherindex = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == key && lowerindex == -1) {
                    lowerindex = i;
                }
                if (nums[i] == key) {
                    higherindex = i;
                }
            }
            int diff = higherindex - lowerindex + 1;
            if(diff < smallest) {
                smallest = diff;
            }
        }
        return smallest;
    }

    //second optimized solution
    public int findShortestSubArray2(int[] nums) {

        HashMap<Integer, Integer> left = new HashMap<>(), right= new HashMap<>(), count = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int key = nums[i];
            if(!left.containsKey(key)) {
                left.put(key, i);
            }
            right.put(key, i);
            count.put(key, count.getOrDefault(key, 0) + 1);
        }

        int degree = Collections.max(count.values());
        for(int x: count.values()) {
            if(count.get(x).equals(degree)) {

            }
        }
        return count.entrySet().stream()
                .filter(i -> i.getValue().equals(degree))
                .map(i -> right.get(i.getKey()) - left.get(i.getKey()) + 1).min(Comparator.naturalOrder()).orElseThrow();
    }

}
