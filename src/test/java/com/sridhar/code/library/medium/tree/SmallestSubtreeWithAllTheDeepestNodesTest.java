package com.sridhar.code.library.medium.tree;

import com.sridhar.code.library.easy.tree.TreeNode;
import com.sridhar.code.library.medium.strings.WordBreak;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SmallestSubtreeWithAllTheDeepestNodesTest {

    @Test
    void testv3() {
        SmallestSubtreeWithAllTheDeepestNodes smallestSubtreeWithAllTheDeepestNodes = new SmallestSubtreeWithAllTheDeepestNodes();


        TreeNode node0 = new TreeNode(0);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);

        node3.setLeft(node5);
        node3.setRight(node1);
        node5.setLeft(node6);
        node5.setRight(node2);
        node2.setLeft(node7);
        node2.setRight(node4);
        node1.setLeft(node0);
        node1.setRight(node8);

        TreeNode node = smallestSubtreeWithAllTheDeepestNodes.subtreeWithAllDeepest(node3);
        System.out.println("asdfasfg");
    }

    @Test
    void testv2() {
        SmallestSubtreeWithAllTheDeepestNodes smallestSubtreeWithAllTheDeepestNodes = new SmallestSubtreeWithAllTheDeepestNodes();
        TreeNode node1 = new TreeNode(1);

        TreeNode node = smallestSubtreeWithAllTheDeepestNodes.subtreeWithAllDeepest(node1);
        System.out.println("asdfasfg");
    }
}
