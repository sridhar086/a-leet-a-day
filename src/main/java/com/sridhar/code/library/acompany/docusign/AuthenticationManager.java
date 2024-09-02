package com.sridhar.code.library.acompany.docusign;

import java.util.HashMap;

class Node {

    Node next;
    Node before;

    int expiryTime;
    String tokenId;

    public Node(String tokenId, int expiryTime) {
        this.tokenId = tokenId;
        this.expiryTime = expiryTime;
        this.next = null;
        this.before = null;
    }
}

public class AuthenticationManager {

    Node head;
    Node end;
    int ttl;
    HashMap<String, Node> hashMap;

    public AuthenticationManager(int ttl) {
        this.ttl = ttl;
        this.hashMap = new HashMap<>();
    }

    public void generate(String tokenId, int currentTime) {
        Node n = new Node(tokenId, currentTime+ttl);
        if(head == null) {
            head = n;
            end = n;
        } else {
            end.next = n;
            end.next.before = end;
            end = n;
        }
        hashMap.put(tokenId, n);
    }

    public void renew(String tokenId, int currentTime) {

        if (!hashMap.containsKey(tokenId) || hashMap.get(tokenId).expiryTime <= currentTime) {
            return;
        }
        Node n = hashMap.get(tokenId);
        n.expiryTime = currentTime+ttl;
        if(n == end) {

        } else if(n == head) {
            head=n.next;
            head.before = null;

            end.next = n;
            n.before = end;
            n.next = null;
            end = n;
        } else {
            Node before = n.before;
            Node next = n.next;
            before.next = next;
            next.before = before;

            end.next = n;
            n.before = end;
            n.next = null;
            end = n;
        }
    }

    public int countUnexpiredTokens(int currentTime) {

        while(head != null && head.expiryTime <= currentTime) {
            hashMap.remove(head.tokenId);
            head = head.next;
        }
        return hashMap.size();
    }
}


