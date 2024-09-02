package com.sridhar.code.library.acompany.hubspot;


import com.sridhar.code.utils.ListNode;

import java.util.PriorityQueue;

public class MergeKOrderedLists {

     public ListNode mergeKLists(ListNode[] lists) {
         PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));

         for (ListNode list : lists) {
             ListNode head = list;
             while (head != null) {
                 priorityQueue.add(head);
                 head = head.next;
             }
         }
         ListNode movingHead = null;
         ListNode head = null;
         ListNode temp;
         boolean flag = true;
         while(!priorityQueue.isEmpty()) {
             if(flag) {
                 movingHead = priorityQueue.poll();
                 head = movingHead;
                 flag = false;
             }
             else {
                 temp = priorityQueue.poll();
                 movingHead.next = temp;
                 temp.next = null;
                 movingHead = temp;
             }
         }
         return head;
     }



}
