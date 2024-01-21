package com.sridhar.code.library.easy;

import org.junit.jupiter.api.Test;

public class LargestNumberTest {

    @Test
    void testv2() {
        LargestNumber largestNumber = new LargestNumber();
        String binary = largestNumber.largestNumber(new int[]{3,30,34,5,9});
        System.out.println(binary);
    }

    @Test
    void testv3() {
        LargestNumber largestNumber = new LargestNumber();
        String binary = largestNumber.largestNumber(new int[]{10, 2});
        System.out.println(binary);
    }
    @Test
    void testv4() {
        LargestNumber largestNumber = new LargestNumber();
        String binary = largestNumber.largestNumber(new int[]{2177,1064,407});
        System.out.println(binary);
    }

}
