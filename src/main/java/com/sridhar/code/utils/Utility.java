package com.sridhar.code.utils;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Utility {

    public static TreeNode buildTree(List<Integer> nodes) {
        int n = nodes.size();
        if (n == 0) return null;
        Queue<TreeNode> parentQueue = new LinkedList<>();
        TreeNode root = new TreeNode(nodes.get(0));
        TreeNode curParent = root;
        for (int i = 1; i < n; i++) {
            var node = nodes.get(i);
            if (i % 2 == 1) {
                if (node != null) {
                    curParent.left = new TreeNode(node);
                    parentQueue.add(curParent.left);
                }
            } else {
                if (node != null) {
                    curParent.right = new TreeNode(node);
                    parentQueue.add(curParent.right);
                }
                curParent = parentQueue.poll();
            }
        }
        return root;
    }
}
