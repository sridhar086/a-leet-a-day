package com.sridhar.code.library.medium.dynamicprogramming;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromeTest {

    @Test
    void test() {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        String ans = longestPalindrome.longestPalindromeString("racecar");
        Assertions.assertEquals(ans, "racecar");
    }

    @Test
    void test2() {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        String ans = longestPalindrome.longestPalindromeString("abrarkt");
        Assertions.assertEquals(ans, "rar");
    }

    @Test
    void test3() {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        String ans = longestPalindrome.longestPalindromeString("rarkit");
        Assertions.assertEquals(ans, "rar");
    }

    @Test
    void testv2() {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        String ans = longestPalindrome.longestPalindromString2("racecar");
        Assertions.assertEquals(ans, "racecar");
    }

    @Test
    void test2v2() {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        String ans = longestPalindrome.longestPalindromString2("abrarkt");
        Assertions.assertEquals(ans, "rar");
    }

    @Test
    void test3v3() {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        String ans = longestPalindrome.longestPalindromString2("cbbd");
        Assertions.assertEquals(ans, "bb");
    }

    @Test
    void test3v4() {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        String ans = longestPalindrome.longestPalindromString2("aa");
        Assertions.assertEquals(ans, "aa");
    }
}
