package com.sridhar.code.library.acompany.microsoft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DebugTest {

    @Test
    public void test() {

        Debug debug = new Debug();
        int[] arr = new int[]{ -1, 0, 0, 1, -3, 4, 5, -9 };

        int value = debug.solution(arr);
        Assertions.assertEquals(value, 9);

    }
    @Test
    public void test2() {

        Debug debug = new Debug();
        int[] arr = new int[]{ -1, -1, -1 };

        int value = debug.solution(arr);
        Assertions.assertEquals(value, -1);

    }

    @Test
    public void test3() {

        Debug debug = new Debug();
        int[] arr = new int[]{ -1 };

        int value = debug.solution(arr);
        Assertions.assertEquals(value, -1);

    }

    @Test
    public void test4() {

        Debug debug = new Debug();
        int[] arr = new int[]{ 1 };

        int value = debug.solution(arr);
        Assertions.assertEquals(value, 1);

    }

    @Test
    public void test5() {

        Debug debug = new Debug();
        int[] arr = new int[]{ };

        int value = debug.solution(arr);
        Assertions.assertEquals(value, -1);

    }

    @Test
    public void test6() {

        Debug debug = new Debug();
        int[] arr = new int[]{9, -1, -1, 0, 1, 2};

        int value = debug.solution(arr);
        Assertions.assertEquals(value, 9);

    }

    @Test
    public void test7() {

        Debug debug = new Debug();
        int[] arr = new int[]{9, -1, 0, 1, 2, 3};

        int value = debug.solution(arr);
        Assertions.assertEquals(value, 9);

    }
}
