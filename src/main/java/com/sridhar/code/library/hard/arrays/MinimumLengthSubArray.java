package com.sridhar.code.library.hard.arrays;

import java.util.HashMap;
import java.util.List;


/*
Hacker Rank
For an array of n positive integers arr[n] and an integer k, a subarray is considered good
if it consists of at least k distinct integers.
Find the minimum length subarray that is good. if there is no such subarray, return -1;

Example
arr = [2,2,1,1,3]
k=3

The subarrays with at least k = 3 distinct integers are [2,2,1,1,3] and [2,1,1,3]. Return 4, the minimum
length of good subarray

constraints
1 <= n <= 10 ^ 5
1 <= arr[i] <= 10 ^ 6
1 <= k <= n
 */

public class MinimumLengthSubArray {

        /*
         * Complete the 'findMinimumLengthSubarray' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER_ARRAY arr
         *  2. INTEGER k
         */

     /*
     set of length k

     HashMap<integer, count>

     2 2 1 1 3


     l = 0
     r = 0

     add it to hashmap  - (2  - 1)
     r = 1
     add it to hashmap - (2 -> 2)

     r = 5
     add it to hashmap - (2 -> 2, 1 -> 2, 3 -> 1)
     */

    public int findMinimumLengthSubarray(List<Integer> nums, int k) {

        HashMap<Integer, Integer> integerMap = new HashMap<>();
        int l = 0;
        int r = 0;
        int minLength = Integer.MAX_VALUE;
        for(int num : nums) {
            //always try to fill at least k distinct integers
            if(integerMap.containsKey(num)) {
                System.out.println("adding the integer: " + num);
                integerMap.replace(num, integerMap.get(num)+1);
                r++;
            } else {
                System.out.println("adding the integer: " + num);
                integerMap.put(num, 1);
                r++;
            }

            // integerMap.keySet().forEach(i -> System.out.print(i + "\t"));
            System.out.println("integer map size:" + integerMap.size());
            //trim the array and calculate the min length
            if(integerMap.size() == k) {
                System.out.println("added at least k distinct integers");
                while(true) {
                    if(r-l < minLength) {
                        minLength = r-l;
                        System.out.println("the min length " + minLength);
                    }
                    int leftVal = nums.get(l);
                    if(integerMap.get(leftVal) > 1) {
                        l++;
                        integerMap.replace(leftVal, integerMap.get(leftVal) - 1);
                    } else {
                        l++;
                        integerMap.remove(leftVal);
                        break;
                    }

                }
            }

        }
        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }

}


