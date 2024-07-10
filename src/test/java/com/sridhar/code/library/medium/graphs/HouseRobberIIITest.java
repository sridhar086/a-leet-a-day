package com.sridhar.code.library.medium.graphs;

import com.sridhar.code.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseRobberIIITest {

    @Test
    void testv3() {
        TreeNode node0 = new TreeNode(8);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(7);
        TreeNode node4 = new TreeNode(40);
        TreeNode node5 = new TreeNode(12);

        node0.setRight(node4);
        node4.setRight(node5);
        node0.setLeft(node1);
        node1.setLeft(node2);
        node1.setRight(node3);

        HouseRobberIII houseRobberIII = new HouseRobberIII();
        int result = houseRobberIII.rob(node0);
        Assertions.assertEquals(result, 48);
    }
}
