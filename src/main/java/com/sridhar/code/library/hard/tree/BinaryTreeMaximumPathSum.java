package com.sridhar.code.library.hard.tree;

import com.sridhar.code.utils.TreeNode;

public class BinaryTreeMaximumPathSum {

    int maximum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        recursiveSum(root);
        return maximum;
    }

    public int recursiveSum(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = Math.max(recursiveSum(root.left), 0);
        int right = Math.max(recursiveSum(root.right), 0);
        int currentVal = root.val;
        maximum = Math.max(left+currentVal+right, maximum);
        return Math.max(left+currentVal, right+currentVal);
    }
}
