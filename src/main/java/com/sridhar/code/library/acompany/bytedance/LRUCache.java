package com.sridhar.code.library.acompany.bytedance;



/*

    write code for byte dance LRU cache implementation
    hashmap and DLL
    hashmap <key, Node>
    Node (value)

 */

import java.util.HashMap;

class Node {

    int key;
    int value;

    Node next;
    Node before;

    public Node(int key, int value) {
        this.value = value;
        this.next = null;
        this.before = null;
    }

}

public class LRUCache {

    Node head;
    Node end;
    int capacity;

    HashMap<Integer, Node> hashMap;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        hashMap = new HashMap<>(capacity);
        head = null;
        end = null;
    }


    public void put(int key, int value) {

        //this is an update
        if(hashMap.containsKey(key)) {
            updateKeyValue(key, value);
        } else {
            // this is an insert
            if(hashMap.size() == capacity) {
                // delete the least recently used
                delete();
                // insert at the front which is the most recently used
                insertKeyValue(key, value);
            } else {
                // insert at the front which is the most recently used
                insertKeyValue(key, value);
            }
        }
    }

    public int get(int key) {
        if(hashMap.containsKey(key)) {
            Node n = hashMap.get(key);
            updatePosition(n);
            return n.value;
        } else {
            return -1;
        }
    }

    private void updateKeyValue(int key, int value) {
        Node n = hashMap.get(key);
        n.value = value;
        updatePosition(n);
    }

    private void updatePosition(Node n) {
        if(!(n.before == null && n.next == null)) {
            //node at end
            if (n.next == null) {
                Node tempEnd = n.before;
                updateFront(n);
                tempEnd.next = null;
                end = tempEnd;
            } else if(n.before != null) {
                //node in the middle
                Node tempBefore = n.before;
                Node tempNext = n.next;
                tempBefore.next = tempNext;
                tempNext.before = tempBefore;
                updateFront(n);
            }
        }
    }


    private void insertKeyValue(int key, int value) {
        Node n = insertFront(key, value);
        hashMap.put(key, n);
    }

    private void updateFront(Node n) {
        n.before = null;
        n.next = head;
        head.before = n;
        head = n;
    }

    private Node insertFront(int key, int value) {
        Node n = new Node(key, value);
        if(head == null) {
            head = n;
            end = n;
            return n;
        }
        updateFront(n);
        return n;
    }

    private void delete() {
        int key = end.key;
        if(end.next == null && end.before==null) {
            head = null;
            end = null;
        } else {
            Node temp = end.before;
            temp.next = null;
            end = temp;
        }
        hashMap.remove(key);
    }


}
