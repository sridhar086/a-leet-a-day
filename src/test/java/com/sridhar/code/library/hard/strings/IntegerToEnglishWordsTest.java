package com.sridhar.code.library.hard.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerToEnglishWordsTest {


    @Test
    void test1() {
        IntegerToEnglishWords integerToEnglishWords = new IntegerToEnglishWords();
        String returned = integerToEnglishWords.numberToWords(1147483648);
        assertEquals("One Billion One Hundred Forty Seven Million Four Hundred Eighty Three Thousand Six Hundred Forty Eight", returned);
    }

    @Test
    void test2() {
        IntegerToEnglishWords integerToEnglishWords = new IntegerToEnglishWords();
        String returned = integerToEnglishWords.numberToWords(1147483612);
        assertEquals("One Billion One Hundred Forty Seven Million Four Hundred Eighty Three Thousand Six Hundred Twelve", returned);
    }

    @Test
    void test3() {
        IntegerToEnglishWords integerToEnglishWords = new IntegerToEnglishWords();
        String returned = integerToEnglishWords.numberToWords(12345);
        assertEquals("Twelve Thousand Three Hundred Forty Five", returned);
    }

    @Test
    void test4() {
        IntegerToEnglishWords integerToEnglishWords = new IntegerToEnglishWords();
        String returned = integerToEnglishWords.numberToWords(101);
        assertEquals("One Hundred One", returned);
    }
}
