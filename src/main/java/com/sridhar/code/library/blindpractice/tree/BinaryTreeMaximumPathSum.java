package com.sridhar.code.library.blindpractice.tree;

import com.sridhar.code.utils.TreeNode;

public class BinaryTreeMaximumPathSum {

    public int maximum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        recursiveSum(root);
        return maximum;
    }

    public int recursiveSum(TreeNode root) {
        if(root == null)
            return 0;

        int left = Math.max(recursiveSum(root.left), 0);
        int right = Math.max(recursiveSum(root.right), 0);
        maximum = Math.max(maximum, left+right+root.val);
        return Math.max(left+root.val, right+root.val);
    }
}
