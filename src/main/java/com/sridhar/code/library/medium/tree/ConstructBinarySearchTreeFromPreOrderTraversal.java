package com.sridhar.code.library.medium.tree;

import com.sridhar.code.utils.TreeNode;
import com.sun.source.tree.Tree;

import java.util.Stack;

public class ConstructBinarySearchTreeFromPreOrderTraversal {

    public TreeNode bstFromPreorder(int[] preorder) {
        Stack<TreeNode> stack = new Stack<>();
        return recursiveTreeCreation(preorder, 0, stack);
    }


    public TreeNode recursiveSolution2(int[] preorder, int start, int end) {
        if(start > end) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[start]);
        int i=start+1;
        for(;i<=end; i++) {
            if(preorder[i] > root.val) {
                break;
            }
        }
        root.left=recursiveSolution2(preorder, start+1, i-1);
        root.right=recursiveSolution2(preorder, i, end);
        return root;
    }

    public TreeNode recursiveTreeCreation(int[] preorder, int index, Stack<TreeNode> treeNodeStack) {
        if(index < preorder.length) {
            TreeNode node = new TreeNode(preorder[index]);
            if(!treeNodeStack.isEmpty()) {
                if(preorder[index] < treeNodeStack.peek().val) {
                    TreeNode top = treeNodeStack.peek();
                    top.left = node;
                    treeNodeStack.push(node);
                    recursiveTreeCreation(preorder, index+1, treeNodeStack);
                } else {
                    TreeNode temp = treeNodeStack.peek();
                    while(!treeNodeStack.isEmpty() && preorder[index] > treeNodeStack.peek().val) {
                        temp = treeNodeStack.pop();
                    }
                    temp.right = node;
                    treeNodeStack.push(node);
                    recursiveTreeCreation(preorder, index+1, treeNodeStack);
                }
            } else {
                treeNodeStack.push(node);
                recursiveTreeCreation(preorder, index+1, treeNodeStack);
            }
            return node;
        } else {
            return null;
        }
    }
}
