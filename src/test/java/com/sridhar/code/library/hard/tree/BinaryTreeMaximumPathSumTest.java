package com.sridhar.code.library.hard.tree;

import com.sridhar.code.library.medium.tree.SmallestSubtreeWithAllTheDeepestNodes;
import com.sridhar.code.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTreeMaximumPathSumTest {



    @Test
    void testv3() {
        //[-10,9,20,null,null,15,7]
        BinaryTreeMaximumPathSum binaryTreeMaximumPathSum = new BinaryTreeMaximumPathSum();
        TreeNode node0 = new TreeNode(-10);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);

        node0.setLeft(node1);
        node0.setRight(node2);
        node2.setLeft(node3);
        node2.setRight(node4);
        int totalValue = binaryTreeMaximumPathSum.maxPathSum(node0);
        Assertions.assertEquals(totalValue, 42);
    }

    @Test
    void testv1() {
        //[-10]
        BinaryTreeMaximumPathSum binaryTreeMaximumPathSum = new BinaryTreeMaximumPathSum();
        TreeNode node0 = new TreeNode(-10);

        int totalValue = binaryTreeMaximumPathSum.maxPathSum(node0);
        Assertions.assertEquals(totalValue, -10);
    }

}
