package com.sridhar.code.library.easy;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*

Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.



Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true


Constraints:

1 <= arr.length <= 1000
-1000 <= arr[i] <= 1000

 */
public class UniqueOccurrences {

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            if(hashmap.containsKey(arr[i])) {
                hashmap.put(arr[i], hashmap.get(arr[i])+1);
            } else {
                hashmap.put(arr[i], 1);
            }
        }
        Set<Integer> set = new HashSet<>(hashmap.values());
        if(set.size() != hashmap.values().size()) {
            return false;
        } else {
            return true;
        }
    }
}
