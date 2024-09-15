package com.sridhar.code.library.acompany.microsoft;

import java.util.HashMap;

/*

given list of strings[] A denoted by recipes...
and another String with ingredients, find if the recipes can be created with the given string,
for example

A{ "azzz", "zz", "zzzz", "azz"   }
S "azzz"
3 recipes can be made

 */
public class Recipes {

    public int solution(String[] A, String S) {
        // Implement your solution here
        HashMap<Character, Integer> count = new HashMap<>();
        for (char c : S.toCharArray()) {
            count.compute(c, (k,v) -> {
                if(v==null)
                    return 1;
                else
                    return v+1;
            });
        }
        int recipe = 0;
        for(String s: A) {
            HashMap<Character, Integer> localCount = new HashMap<>();
            for (char c : s.toCharArray()) {
                localCount.compute(c, (k,v) -> {
                    if(v==null)
                        return 1;
                    else
                        return v+1;
                });
            }
            boolean flag = true;
            for (Character key : localCount.keySet()) {
                if(count.containsKey(key)) {
                    int needed = localCount.get(key);
                    int available = count.get(key);
                    if(needed > available) {
                        flag = false;
                        break;
                    }
                } else {
                    flag = false;
                    break;
                }
            }
            if(flag)
                recipe++;
        }
        return recipe;
    }


}
