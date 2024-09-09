package com.sridhar.code.library.blindpractice.tree;

import com.sridhar.code.utils.TreeNode;
import com.sridhar.code.utils.Utility;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class KthSmallestBSTTest {

    @Test
    public void test() {
        KthSmallestBST kthSmallestBST = new KthSmallestBST();
        TreeNode root = Utility.buildTree(Arrays.asList(3,1,4,null,2));
        kthSmallestBST.kthSmallest(root, 1);
    }
}
