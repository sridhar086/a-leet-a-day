package com.sridhar.code.library.easy.strings;

import com.sridhar.code.library.medium.strings.WordBreak;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreakTest {

    @Test
    void testv2() {
        WordBreak wordBreak = new WordBreak();
        List<String> array = new ArrayList<>();
        array.add("car"); array.add("ca"); array.add("rs");
        boolean ans = wordBreak.wordBreak("cars", array);
        Assertions.assertTrue(ans);
    }


    @Test
    void testv3() {
        WordBreak wordBreak = new WordBreak();
        List<String> array = new ArrayList<>();
        array.add("cats"); array.add("dog"); array.add("sand"); array.add("and"); array.add("cat");
        boolean ans = wordBreak.wordBreak("catsandog", array);
        Assertions.assertFalse(ans);
    }

    @Test
    void testv4() {
        WordBreak wordBreak = new WordBreak();
        List<String> array = Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa");
        boolean ans = wordBreak.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", array);
        Assertions.assertFalse(ans);


    }
}
