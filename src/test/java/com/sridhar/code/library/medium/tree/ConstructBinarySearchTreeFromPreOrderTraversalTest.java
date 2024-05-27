package com.sridhar.code.library.medium.tree;

import com.sridhar.code.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConstructBinarySearchTreeFromPreOrderTraversalTest {

    @Test
    void testv3() {
        ConstructBinarySearchTreeFromPreOrderTraversal constructBinarySearchTreeFromPreOrderTraversal = new ConstructBinarySearchTreeFromPreOrderTraversal();


        TreeNode node0 = new TreeNode(8);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(7);
        TreeNode node4 = new TreeNode(10);
        TreeNode node5 = new TreeNode(12);


        node0.setRight(node4);
        node4.setRight(node5);
        node0.setLeft(node1);
        node1.setLeft(node2);
        node1.setRight(node3);


        TreeNode node = constructBinarySearchTreeFromPreOrderTraversal.bstFromPreorder(new int[]{8,5,1,7,10,12});
        Assertions.assertEquals(node.val, 8);
        Assertions.assertEquals(node.left.val, 5);
        Assertions.assertEquals(node.left.left.val, 1);
        Assertions.assertEquals(node.left.right.val, 7);

        Assertions.assertEquals(node.right.val, 10);
        Assertions.assertEquals(node.right.right.val, 12);

    }
}
