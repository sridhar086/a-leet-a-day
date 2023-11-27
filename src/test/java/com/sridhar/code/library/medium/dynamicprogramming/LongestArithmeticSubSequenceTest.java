package com.sridhar.code.library.medium.dynamicprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestArithmeticSubSequenceTest {

    @Test
    public void test() {
        MaximumArithmeticSubSequence maximumArithmeticSubSequence = new MaximumArithmeticSubSequence();
        int sum = maximumArithmeticSubSequence.longestArithSeqLength(new int[]{20, 1, 15, 3, 10, 5, 8});
        Assertions.assertEquals(4, sum);
    }


    @Test
    public void test2() {
        MaximumArithmeticSubSequence maximumArithmeticSubSequence = new MaximumArithmeticSubSequence();
        int sum = maximumArithmeticSubSequence.longestArithSeqLength(new int[]{0,1,0,3,2,3});
        Assertions.assertEquals(4, sum);
    }

}
