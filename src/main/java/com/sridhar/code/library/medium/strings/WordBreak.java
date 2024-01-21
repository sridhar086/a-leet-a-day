package com.sridhar.code.library.medium.strings;

import java.util.*;

public class WordBreak {

    private String s;
    private List<String> wordDict;
    private int[] memo;

    public boolean dp(int i) {
        if (i < 0) return true;

        if(memo[i]!=-1)
            return memo[i] == 1;


        for (String word: wordDict) {
            // Handle out of bounds case
            if (i - word.length() + 1 < 0) {
                continue;
            }

            if (s.substring(i - word.length() + 1, i + 1).equals(word) && dp(i - word.length())) {
                memo[i] = 1;
                return true;
            }
        }

        memo[i] = 0;
        return false;

    }


    public boolean wordBreak(String s, List<String> wordDict) {
        this.s=s;
        this.wordDict=wordDict;
        memo = new int[s.length()];
        Arrays.fill(this.memo, -1);
        return dp(s.length() - 1);
//        return doesItComplete(s, 0, wordDict);
    }

    private boolean doesItComplete(String s, int index, List<String> wordDict) {
        ArrayList<String> arrayList = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] seen = new boolean[s.length() + 1];
        queue.add(index);

        while(!queue.isEmpty()) {
            int start = queue.remove();
            if(start == s.length()) {
                return true;
            }

            for(int end=start+1; end<s.length(); end++) {
                if (seen[end]) {
                    continue;
                }

                if (wordDict.contains(s.substring(start, end))) {
                    queue.add(end);
                    seen[end] = true;
                }
            }
        }
        return false;
    }


}
