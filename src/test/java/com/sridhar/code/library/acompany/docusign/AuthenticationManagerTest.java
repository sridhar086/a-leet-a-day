package com.sridhar.code.library.acompany.docusign;

import org.junit.jupiter.api.Test;

public class AuthenticationManagerTest {




    @Test
    void testv3() {
        AuthenticationManager2 authenticationManager = new AuthenticationManager2(13);
            /*
            [[13],
            ["ajvy",1], renew
            [3], countunex
            [4], countunex
            ["fuzxq",5],gen
            ["izmry",7],gen
            ["puv",12],renew
            ["ybiqb",13],gen
            ["gm",14],gen
            [15],countunex
            [18],countunex
            [19],countunex
            ["ybiqb",21],renew
            [23],countunex
            [25],countunex
            [26],countunex
            ["aqdm",28],gen
            [29],countunex
            ["puv",30], renew
            ]

            fuzxq 5 + 13
            izmry 7 + 13
            ybiqb 13 + 13
            gm 14 + 13
            count 15
            count 18
            count 19
            ybiqb 21 + 13 renew
            count 23
            count 25
            count 26
            aqdm 28 + 13
            count 29

             */

            /*
            ["AuthenticationManager",
            "renew",
            "countUnexpiredTokens",
            "countUnexpiredTokens",
            "generate",
            "generate",
            "renew",
            "generate",
            "generate",
            "countUnexpiredTokens",
            "countUnexpiredTokens",
            "countUnexpiredTokens",
            "renew",
            "countUnexpiredTokens",
            "countUnexpiredTokens",
            "countUnexpiredTokens",
            "generate",
            "countUnexpiredTokens",
            "renew"]
            */

        /*
                    fuzxq 5 + 13
            izmry 7 + 13
            ybiqb 13 + 13
            gm 14 + 13
            count 15
            count 18
            count 19
            ybiqb 21 + 13 renew
            count 23
            count 25
            count 26
            aqdm 28 + 13
            count 29
         */

        authenticationManager.generate("fuzxq", 5);
        authenticationManager.generate("izmry", 7);
        authenticationManager.generate("ybiqb", 13);
        authenticationManager.generate("gm", 14);
        System.out.println(authenticationManager.countUnexpiredTokens(15));
        System.out.println(authenticationManager.countUnexpiredTokens(18));
        System.out.println(authenticationManager.countUnexpiredTokens(19));
        authenticationManager.renew("ybiqb", 21);
        System.out.println(authenticationManager.countUnexpiredTokens(23));
        System.out.println(authenticationManager.countUnexpiredTokens(25));
        System.out.println(authenticationManager.countUnexpiredTokens(26));
        authenticationManager.generate("aqdm", 13);
        System.out.println(authenticationManager.countUnexpiredTokens(29));
    }


    @Test
    void testv4() {

        /*
        ["AuthenticationManager","renew","generate","countUnexpiredTokens","generate","renew","renew","countUnexpiredTokens"]
        [[5],["aaa",1],["aaa",2],[6],["bbb",7],["aaa",8],["bbb",10],[15]]
         */
        AuthenticationManager authenticationManager = new AuthenticationManager(5);

        authenticationManager.renew("aaa", 1);
        authenticationManager.generate("aaa", 2);
        System.out.println(authenticationManager.countUnexpiredTokens(6));
        authenticationManager.generate("bbb", 7);

        authenticationManager.renew("aaa", 8);
        authenticationManager.renew("bbb", 10);
        System.out.println(authenticationManager.countUnexpiredTokens(15));

    }

    @Test
    void testv5() {

        AuthenticationManager authenticationManager = new AuthenticationManager(13);

        authenticationManager.generate("fuzxq", 5);
        authenticationManager.generate("izmry", 7);
        authenticationManager.renew("puv",12);
        authenticationManager.generate("ybiqb", 13);
        authenticationManager.generate("gm", 14);
        System.out.println(authenticationManager.countUnexpiredTokens(15));
        System.out.println(authenticationManager.countUnexpiredTokens(18));
        System.out.println(authenticationManager.countUnexpiredTokens(19));
        authenticationManager.renew("ybiqb", 21);
        System.out.println(authenticationManager.countUnexpiredTokens(23));
        System.out.println(authenticationManager.countUnexpiredTokens(25));
        System.out.println(authenticationManager.countUnexpiredTokens(26));
        authenticationManager.generate("aqdm", 28);
        System.out.println(authenticationManager.countUnexpiredTokens(29));
    }
}
