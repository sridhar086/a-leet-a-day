package com.sridhar.code.library.easy.tree;

/*
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.



Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 2
Example 2:

Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5


Constraints:

The number of nodes in the tree is in the range [0, 105].
-1000 <= Node.val <= 1000
 */
public class MinimumDepthBinaryTree {
    public int minDepth(TreeNode root) {
        return recursivelyMinDepth(root);
    }

    private int recursivelyMinDepth(TreeNode root) {
        if(root == null) return 0;
        int left = recursivelyMinDepth(root.left);
        int right = recursivelyMinDepth(root.right);
        if(left == 0 && right == 0) {
            return 1;
        } else if(left == 0) {
            return right+1;
        } else if(right == 0) {
            return left+1;
        } else {
            return Math.min(left, right) + 1;
        }

    }
}
