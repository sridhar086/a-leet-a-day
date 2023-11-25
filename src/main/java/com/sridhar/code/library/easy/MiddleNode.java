package com.sridhar.code.library.easy;


/*
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.



Example 1:


Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
Example 2:


Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.


Constraints:

The number of nodes in the list is in the range [1, 100].
1 <= Node.val <= 100
 */
public class MiddleNode {

    public ListNode middleNode(ListNode head) {

        if(head == null || head.next == null) {
            return head;
        }
        ListNode node = head;
        //get the total length of the linkedlist
        int i = 1;
        while(node.next !=null) {
            i++;
            node=node.next;
        }

        node = head;
        //calculate the midpoint of the index as specified.
        int index = i / 2;
        i = 0;
        while(node.next != null) {
            if(i==index) {
                return node;
            } else {
                node=node.next;
                i++;
            }
        }
        return node;
    }
}
