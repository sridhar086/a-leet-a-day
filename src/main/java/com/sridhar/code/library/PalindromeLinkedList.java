package com.sridhar.code.library;

public class PalindromeLinkedList {


    /*
    My modified approach
    create a reversed list for the second half alone and then compare it with first half of the original list
     */
    public boolean isPalindrome2(ListNode head) {

        if(head == null) {
            return true;
        }
        ListNode node = new ListNode(head.val, head.next);
        int count=0;
        while(node!=null) {
            node=node.next;
            count=count+1;
        }
        if(count == 1)
            return true;
        node = new ListNode(head.val, head.next);

        int iter=0;
        while(iter < ((count/2) - 1)) {
            node=node.next;
            iter+=1;
        }

        ListNode reversedNode = reverseList(node.next);

        node = null;
        System.gc();
        iter = 0;
        while(iter <= ((count/2) - 1)) {
            iter+=1;
            if(head.val != reversedNode.val) {
                return false;
            }
            head=head.next;
            reversedNode=reversedNode.next;
        }
        System.out.println("The count is " + count);
        return true;

    }



    // working solution but O(n) space and lots of time waste.
    public boolean isPalindrome(ListNode head) {

        if(head == null) {
            return true;
        }
        ListNode node = new ListNode(head.val, head.next);
        int count=0;
        while(node!=null) {
            node=node.next;
            count=count+1;
        }
        if(count == 1)
            return true;

        try {
            ListNode lp = recursive(head, 0, count);
        } catch (RuntimeException e) {
            return false;
        }
        System.out.println("The count is " + count);
        return true;
    }

    ListNode recursive(ListNode firstPointer, int iter, int size) {
        System.out.println("recursion val is "+firstPointer.val);
        if(iter < ((size/2) - 1)) {
            ListNode secondPointer = recursive(firstPointer.next, iter+1, size);
            if(secondPointer == null) {
                throw new RuntimeException("Not a palindrome");
            }
            return comparePointer(firstPointer, secondPointer);
        }
        if(isOdd(size)) {
            return comparePointer(firstPointer, firstPointer.next.next);
        } else {
            return comparePointer(firstPointer, firstPointer.next);
        }
    }

    static ListNode comparePointer(ListNode one, ListNode two) {
        if(one.val == two.val)
            return two.next;
        else
            throw new RuntimeException("Not a palindrome");
    }

    static boolean isOdd (int number)
    {
        // n & 1 is 1, then odd, else even
        return (number & 1) == 1;
    }

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
