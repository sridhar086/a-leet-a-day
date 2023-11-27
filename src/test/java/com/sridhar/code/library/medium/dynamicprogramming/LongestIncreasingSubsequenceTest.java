package com.sridhar.code.library.medium.dynamicprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestIncreasingSubsequenceTest {


    @Test
    public void test() {
        LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();
        int sum = longestIncreasingSubsequence.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18});
        Assertions.assertEquals(4, sum);
    }

    @Test
    public void test2() {
        LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();
        int sum = longestIncreasingSubsequence.lengthOfLIS(new int[]{0,1,0,3,2,3});
        Assertions.assertEquals(4, sum);
    }

    @Test
    public void test3() {

        LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();
        int sum = longestIncreasingSubsequence.lengthOfLIS(new int[]{1,3,6,7,9,4,10,5,6});
        Assertions.assertEquals(5, sum);
    }


}
