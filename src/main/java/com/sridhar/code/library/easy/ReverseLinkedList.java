package com.sridhar.code.library.easy;

/*
Given the head of a singly linked list, reverse the list, and return the reversed list.



Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []


Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000


Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
 */


public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode present = head;
        //if given node is null or node next is null return node
        // single node
        if(present == null || present.next == null) {
            return present;
        }

        // two node list
        ListNode prev = present;
        present = present.next;
        if(present.next == null) {
            present.next = prev;
            prev.next = null;
            return present;
        }

        ListNode future = present.next;
        prev.next = null;
        while(future!=null) {
            present.next = prev;
            prev = present;
            present = future;
            future = future.next;
        }
        present.next=prev;
        return present;

    }
}
