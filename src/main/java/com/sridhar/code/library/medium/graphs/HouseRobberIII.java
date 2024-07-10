package com.sridhar.code.library.medium.graphs;

import com.sridhar.code.utils.TreeNode;

import java.util.HashMap;

public class HouseRobberIII {

    HashMap<TreeNode, Integer> robbed = new HashMap<>();
    HashMap<TreeNode, Integer> notRobbed = new HashMap<>();

    public int rob(TreeNode node) {
        return helper(node, false);
    }

    public int helper(TreeNode node, boolean parentRobbed) {
        if(node == null) return 0;

        if(parentRobbed) {
            if(robbed.containsKey(node)) return robbed.get(node);

            int result = helper(node.left, false) + helper(node.right, false);
            robbed.put(node, result);
            return result;
        } else {
            if(notRobbed.containsKey(node)) return notRobbed.get(node);
            int rob = node.val + helper(node.left, true) + helper(node.right, true);
            int notRob = helper(node.left, false) + helper(node.right, false);
            int result = Math.max(rob, notRob);
            notRobbed.put(node, result);
            return result;
        }
    }

}
