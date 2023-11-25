package com.sridhar.code.library.medium.dynamicprogramming;

public class LongestPalindrome {

    public String longestPalindromeString(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int[] ans = new int[2];

        for(int i=0; i<n; i++) {
            dp[i][i] = true;
        }

        for(int diff=1; diff<n; diff++ ) {
            for(int i=0;i<n-diff;i++) {
                int j=i+diff;
                if(diff == 1) {
                    if(s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = true;
                        ans[0] = i;
                        ans[1] = j;
                    }
                } else {
                    if((s.charAt(i) == s.charAt(j)) && dp[i+1][j-1] == true) {
                        dp[i][j] = true;
                        ans[0] = i;
                        ans[1] = j;
                    }
                }
            }
        }
        return s.substring(ans[0], ans[1]+1);
    }

    public String longestPalindromString2(String s) {

        int n = s.length();
        int[] ans = new int[]{0,0};
        for(int center=0; center<n; center++) {
            corepiece(s, ans, center);
        }
        return s.substring(ans[0], ans[1]+1);
    }

    private void corepiece(String s, int[] ans, int center) {
        int[] edges = expand(s, center, center);
        if(edges[1]-edges[0] > ans[1]- ans[0]) {
            ans[0] = edges[0];
            ans[1] = edges[1];
        }
        int[] evenEdges = expand(s, center, center +1);
        if(evenEdges[1]-evenEdges[0] > ans[1]- ans[0]) {
            ans[0] = evenEdges[0];
            ans[1] = evenEdges[1];
        }
    }

    private int[] expand(String s, int index1, int index2) {
        int left = index1;
        int right = index2;
        boolean flag=true;
        while(left >=0 && right < s.length() && s.charAt(left)==s.charAt(right)) {
            flag=false;
            left = left-1;
            right = right+1;
        }
        if(flag && index1 != index2) {
            return new int[]{left, right-1};
        } else {
            return new int[]{left+1, right-1};
        }
    }
}
