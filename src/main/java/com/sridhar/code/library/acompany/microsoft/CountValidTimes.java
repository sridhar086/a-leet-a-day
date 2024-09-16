package com.sridhar.code.library.acompany.microsoft;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CountValidTimes {

    public int solution(int A, int B, int C, int D) {

        List<Integer> list = new ArrayList<>();
        list.add(A); list.add(B); list.add(C); list.add(D);
        HashSet<String> strings = new HashSet<>();
        int nooftimes = 0;
        for(int i=0; i<4;i++) {
            for(int j=0; j<4; j++) {
                if(i!=j) {
                    for(int k=0; k<4; k++) {
                        if(k!=j && k!=i) {
                            for (int l = 0; l < 4; l++) {
                                if(l!=k && l!=j && l!=i) {
                                    String str = String.format("%s%s:%s%s", list.get(i), list.get(j), list.get(k), list.get(l));
                                    if (isValidTime(str))
                                        strings.add(str);
                                }
                            }
                        }
                    }

                }
            }
        }
        return strings.size();
    }

    public static boolean isValidTime(String time) {
        try {
            LocalTime.parse(time);  // Attempt to parse the time string
            return true;  // If parsing succeeds, the time is valid
        } catch (DateTimeParseException e) {
            return false;  // If parsing fails, the time is invalid
        }
    }
}
