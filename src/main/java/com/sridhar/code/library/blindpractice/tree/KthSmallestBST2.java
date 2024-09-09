package com.sridhar.code.library.blindpractice.tree;

import com.sridhar.code.utils.TreeNode;

public class KthSmallestBST2 {

    int answer=0; int i=0;
    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return answer;
    }

    public void dfs(TreeNode node, int k) {
        if(node == null) return;
        dfs(node.left, k);
        i++;
        if(i == k) answer = node.val;
        if(i != k) dfs(node.right, k);
    }


}
