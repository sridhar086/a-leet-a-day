package com.sridhar.code.library.blindpractice.tree;

import com.sridhar.code.utils.TreeNode;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestBST {


    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        dfs(root, priorityQueue, k);
        return priorityQueue.poll();
    }

    public void dfs(TreeNode node, PriorityQueue<Integer> priorityQueue, int k) {
        if(node == null)
            return;
        if(priorityQueue.size() == k && node.val < priorityQueue.peek()) {
            priorityQueue.poll();
            priorityQueue.add(node.val);
        } else if(priorityQueue.size() < k) {
            priorityQueue.add(node.val);
        }
        dfs(node.left, priorityQueue, k);
        dfs(node.right, priorityQueue, k);
    }

}
