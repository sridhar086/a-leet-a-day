package com.sridhar.code.library.medium.tree;

import com.sridhar.code.library.easy.tree.TreeNode;

public class SmallestSubtreeWithAllTheDeepestNodes {

    int maxDepth;
    TreeNode subtree;

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if(root == null) {
            return root;
        }
        recursion(root, root, 0);
        return subtree;
    }


    public int recursion(TreeNode parent, TreeNode node, int level) {
        if(node == null) {
            return level-1;
        }

        int left = recursion(node, node.getLeft(), level+1);
        int right = recursion(node, node.getRight(), level+1);
        if(left == 0 && right == 0) {
            subtree = parent;
        }

        if(Math.max(left, right) > maxDepth) {
            maxDepth = Math.max(left, right);
            subtree = parent;
        }
        return Math.max(left, right);
    }

}
