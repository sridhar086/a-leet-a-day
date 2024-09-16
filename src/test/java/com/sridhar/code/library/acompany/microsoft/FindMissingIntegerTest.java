package com.sridhar.code.library.acompany.microsoft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMissingIntegerTest {
    @Test
    public void test() {
        FindMissingInteger findMissingInteger = new FindMissingInteger();
        int ans = findMissingInteger.solution(new int[] {-1, 2, -3});
        Assertions.assertEquals(1, ans);
    }

    @Test
    public void test1() {
        FindMissingInteger findMissingInteger = new FindMissingInteger();
        int ans = findMissingInteger.solution(new int[] {1, 2, 3});
        Assertions.assertEquals(4, ans);
    }

    @Test
    public void test3() {
        FindMissingInteger findMissingInteger = new FindMissingInteger();
        int ans = findMissingInteger.solution(new int[] {1, 2, 4});
        Assertions.assertEquals(3, ans);
    }

    @Test
    public void test2() {
        FindMissingInteger findMissingInteger = new FindMissingInteger();
        int ans = findMissingInteger.solution(new int[] {-3, 3});
        Assertions.assertEquals(1, ans);
    }

    @Test
    public void test4() {
        FindMissingInteger findMissingInteger = new FindMissingInteger();
        int ans = findMissingInteger.solution(new int[] {0, 1});
        Assertions.assertEquals(2, ans);
    }
}
