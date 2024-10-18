package com.sridhar.code.library.patterns.tree;

import com.sridhar.code.utils.TreeNode;

public class ConvertTreeToDLL {


    //todo
    TreeNode tail;
    TreeNode head;

    public TreeNode treeToDoublyList(TreeNode node) {
        recursive(node);
        return head;
    }


    public TreeNode recursive(TreeNode node) {
        if(node == null) {
            return null;
        }
        TreeNode left = recursive(node.left);
        if(tail == null) {
            head = node;
            tail = head;
        } else {
            tail.right = node;
            node.left = tail;
            tail = node;
        }
        recursive(node.right);
        return left;
    }

}
