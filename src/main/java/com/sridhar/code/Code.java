package com.sridhar.code;

import com.sridhar.code.library.easy.tree.TreeNode;
import com.sridhar.code.library.medium.tree.BinaryTreeBoundary;
import com.sridhar.code.library.medium.tree.BinaryTreeVerticalOrderTraversal;

import java.util.List;

public class Code {

    public static void main(String[] args) {

        TreeNode node5 = new TreeNode(5);
        TreeNode node1 = new TreeNode(1);
        TreeNode node7 = new TreeNode(7);


        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);

        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);
        TreeNode node11 = new TreeNode(11);

        node2.setLeft(node9);
        node2.setRight(node8);

        node8.setLeft(node1);
        node8.setRight(node7);

        node1.setRight(node5);

        node9.setLeft(node4);
        node4.setLeft(node3);
        node4.setRight(node11);


        BinaryTreeBoundary binaryTreeBoundary = new BinaryTreeBoundary();
        binaryTreeBoundary.boundaryOfBinaryTree(node2);

//        BinaryTreeVerticalOrderTraversal binaryTreeVerticalOrderTraversal = new BinaryTreeVerticalOrderTraversal();
//        List<List<Integer>> values = binaryTreeVerticalOrderTraversal.verticalOrder(node2);
//        System.out.println("testing");


    }



}
