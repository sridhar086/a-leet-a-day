package com.sridhar.code.library.hard.dp.arrays;

import java.util.*;

public class SlidingWindowMaximum {

    /*


    You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window.



Example 1:

Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation:
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
Example 2:

Input: nums = [1], k = 1
Output: [1]


Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
1 <= k <= nums.length
     */


    public int[] maxSlidingWindow(int[] nums, int k) {


        Deque<Integer> descendingDeque = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<k; i++) {
            while(!descendingDeque.isEmpty() && nums[i] >= nums[descendingDeque.peekLast()]) {
                descendingDeque.pollLast();
            }
            descendingDeque.offerLast(i);
        }
        result.add(nums[descendingDeque.peekFirst()]);

        for(int i=k; i<nums.length; i++) {
            if(descendingDeque.peekFirst() == i-k)
                descendingDeque.pollFirst();

            while(!descendingDeque.isEmpty() && nums[i] >= nums[descendingDeque.peekLast()]) {
                descendingDeque.pollLast();
            }
            descendingDeque.offerLast(i);
            result.add(nums[descendingDeque.peekFirst()]);
        }
        return result.stream().mapToInt(i->i).toArray();
    }

}
