package com.sridhar.code;

import com.sridhar.code.library.ListNode;
import com.sridhar.code.library.MoveZeroes;
import com.sridhar.code.library.PalindromeLinkedList;

public class Code {

    public static void main(String[] args) {

        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        ListNode node5 = new ListNode(1);
        ListNode node4 = new ListNode(2, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode noded = new ListNode(1);
        ListNode nodec = new ListNode(2, noded);
        ListNode nodeb = new ListNode(1, nodec);
        ListNode nodea = new ListNode(1, nodeb);

        System.out.println(palindromeLinkedList.isPalindrome2(nodea));

    }



}
