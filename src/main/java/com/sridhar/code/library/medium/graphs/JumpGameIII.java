package com.sridhar.code.library.medium.graphs;

/*
Leet 1306
Given an array of non-negative integers arr, you are initially positioned at start index of the array. When you are at index i, you can jump to i + arr[i] or i - arr[i], check if you can reach any index with value 0.

Notice that you can not jump outside of the array at any time.



Example 1:

Input: arr = [4,2,3,0,3,1,2], start = 5
Output: true
Explanation:
All possible ways to reach at index 3 with value 0 are:
index 5 -> index 4 -> index 1 -> index 3
index 5 -> index 6 -> index 4 -> index 1 -> index 3
Example 2:

Input: arr = [4,2,3,0,3,1,2], start = 0
Output: true
Explanation:
One possible way to reach at index 3 with value 0 is:
index 0 -> index 4 -> index 1 -> index 3
Example 3:

Input: arr = [3,0,2,1,2], start = 2
Output: false
Explanation: There is no way to reach at index 1 with value 0.


Constraints:

1 <= arr.length <= 5 * 104
0 <= arr[i] < arr.length
0 <= start < arr.length
 */

import java.util.*;

public class JumpGameIII {

    public boolean canReach(int[] arr, int start) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                index = i;
            }
        }
        if(arr[start] == 0) return true;


        Deque<Integer> indexQueue = new ArrayDeque<>();
        HashSet<Integer> visited = new HashSet<>();

        indexQueue.add(start);
        while (!indexQueue.isEmpty()) {
            int currentIndex = indexQueue.poll();
            if(arr[currentIndex] == 0) return true;
            if(visited.contains(currentIndex)) continue;
            visited.add(currentIndex);
            int forwardIndex = currentIndex + arr[currentIndex];
            int backIndex = currentIndex - arr[currentIndex];
            if(forwardIndex < arr.length) indexQueue.add(forwardIndex);
            if(backIndex >= 0) indexQueue.add(backIndex);
        }
        return false;
    }
}
