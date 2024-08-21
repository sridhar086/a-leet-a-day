package com.sridhar.code.library.acompany.docusign;

/*
1797. Design Authentication Manager


 */

import java.util.HashMap;

public class AuthenticationManager2 {

    int timeToLive;
    HashMap<String, Integer> hashMap;


    public AuthenticationManager2(int timeToLive) {
        this.timeToLive = timeToLive;
        hashMap = new HashMap<>();
    }

    public void generate(String tokenId, int currentTime) {
        hashMap.put(tokenId, currentTime);
    }

    public void renew(String tokenId, int currentTime) {
        hashMap.computeIfPresent(tokenId, (key, value) -> currentTime < value+timeToLive ? currentTime : value);

    }

    public int countUnexpiredTokens(int currentTime) {
        return Math.toIntExact(hashMap.entrySet().stream()
                .filter(entry -> entry.getValue() + timeToLive > currentTime)
                .count());
    }

}


