package com.sridhar.code.library.hard.heap;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/*
Proud of myself to have solved this problem without looking at solution.

Leet 632

You have k lists of sorted integers in non-decreasing order. Find the smallest range that includes at least one number from each of the k lists.

We define the range [a, b] is smaller than range [c, d] if b - a < d - c or a < c if b - a == d - c.



Example 1:

Input: nums = [[4,10,15,24,26],[0,9,12,20],[5,18,22,30]]
Output: [20,24]
Explanation:
List 1: [4, 10, 15, 24,26], 24 is in range [20,24].
List 2: [0, 9, 12, 20], 20 is in range [20,24].
List 3: [5, 18, 22, 30], 22 is in range [20,24].
Example 2:

Input: nums = [[1,2,3],[1,2,3],[1,2,3]]
Output: [1,1]


Constraints:

nums.length == k
1 <= k <= 3500
1 <= nums[i].length <= 50
-105 <= nums[i][j] <= 105
nums[i] is sorted in non-decreasing order.
 */
public class SmallestRangeCoveringElementsFromKLists {

    public int[] smallestRange(List<List<Integer>> nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int diff = Integer.MAX_VALUE;
        int[] range = new int[2];
        PriorityQueue<int[]> kHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        int[] index = new int[nums.size()];

        for(int i=0; i<nums.size(); i++) {
            int value = nums.get(i).get(0);
            kHeap.offer(new int[]{nums.get(i).get(0), i});
            index[i] = 0;
            if(value > max) {
                max = value;
            }
        }

        while(true) {
            int[] check = kHeap.poll();
            min = check[0];
            if(max-min < diff) {
                diff = max-min;
                range[0] = min;
                range[1] = max;
            }
            int arrTraversal = check[1];
            int nextIndex = index[arrTraversal]+1;
            if(nextIndex < nums.get(arrTraversal).size()) {
                int localMax = nums.get(arrTraversal).get(nextIndex);
                if(localMax > max) {
                    max = localMax;
                }
                kHeap.offer(new int[]{localMax, arrTraversal});
                index[arrTraversal] = nextIndex;
            } else {
                break;
            }
        }
        return range;
    }

}
