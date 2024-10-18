package com.sridhar.code.library.hard.arrays;

import java.util.Arrays;

//todo
class Envelope {

    int len;
    int br;

    public Envelope(int len, int br) {
        this.len = len;
        this.br = br;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getBr() {
        return br;
    }

    public void setBr(int br) {
        this.br = br;
    }

    public int getLen() {
        return len;
    }

    public static Envelope of(int length, int breadth) { return new Envelope(length, breadth); }

}

public class RussianDoll {

    public int maxEnvelopes(int[][] envelopes) {

        int sum = 0;
        Envelope[] envs = new Envelope[envelopes.length];

        for (int i = 0; i < envelopes.length; i++) {
            envs[i] = new Envelope(envelopes[i][0], envelopes[i][1]);
        }

        Arrays.sort(envs, (a,b) -> {
            if(a.len < b.len && a.br < b.br) {
                return -1;
            } else if(a.len == b.len && a.br == b.br) {
                return 0;
            } else {
                return 1;
            }
        });

        int count = 0;
        int i = 0;
        int j = 1;

        while(j<envs.length) {
            if(toKeepOrSkip(envs[i], envs[j])) {
                i++;
            }
            if(fits(envs[i], envs[j])) {
                count++;
                i = j;
            }
            j++;
        }

        return count+1;
    }

    private boolean toKeepOrSkip(Envelope a, Envelope b) {
        if(a.len > b.len || a.br > b.br) {
            return true;
        }
        return false;
    }
    private boolean fits(Envelope a, Envelope b) {
        return a.len < b.len && a.br < b.br;
    }
}
