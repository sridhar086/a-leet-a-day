package com.sridhar.code.library.medium.dynamicprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PredictTheWinnerTest {

    @Test
    public void test() {
        PredictTheWinner predictTheWinner = new PredictTheWinner();
        boolean value = predictTheWinner.predictTheWinner(new int[]{1163573,4225123,1034109,6416120,4401957,408968,8769389,7498770,6003151,2054050,2621821,8204739,2586055,6520977,2014732,4750306,4172182,6965656,1861876,9549339});
        Assertions.assertTrue(value);
    }
}
