package com.sridhar.code.utils2;

import com.sridhar.code.utils.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Utility {

    public static Node buildTree(List<Integer> nodes) {
        int n = nodes.size();
        if (n == 0) return null;
        Queue<Node> parentQueue = new LinkedList<>();
        Node root = new Node(nodes.get(0));
        Node curParent = root;
        for (int i = 1; i < n; i++) {
            var node = nodes.get(i);
            if (i % 2 == 1) {
                if (node != null) {
                    curParent.left = new Node(node);
                    parentQueue.add(curParent.left);
                }
            } else {
                if (node != null) {
                    curParent.right = new Node(node);
                    parentQueue.add(curParent.right);
                }
                curParent = parentQueue.poll();
            }
        }
        return root;
    }
}
