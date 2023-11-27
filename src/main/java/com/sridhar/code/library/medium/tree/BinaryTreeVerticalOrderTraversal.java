package com.sridhar.code.library.medium.tree;


import com.sridhar.code.library.easy.tree.TreeNode;


import java.util.*;
import java.util.stream.Collectors;

/*
Given the root of a binary tree, return the vertical order traversal of its nodes' values. (i.e., from top to bottom, column by column).

If two nodes are in the same row and column, the order should be from left to right.



Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[9],[3,15],[20],[7]]
Example 2:


Input: root = [3,9,8,4,0,1,7]
Output: [[4],[9],[3,0,1],[8],[7]]
Example 3:


Input: root = [3,9,8,4,0,1,7,null,null,null,2,5]
Output: [[4],[9,5],[3,0,1],[8,2],[7]]


Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 */

public class BinaryTreeVerticalOrderTraversal {

    public List<List<Integer>> verticalOrder(TreeNode root) {

        List<List<Integer>> output = new ArrayList<>();
        if(root == null) {
            return output;
        }
        TreeMap<Integer,List<Integer>> hashmap = new TreeMap<>();
        Queue<Pair<Integer,TreeNode>> queue = new LinkedList<>();

        queue.add(new Pair<>(0, root));

        while(!queue.isEmpty()) {
            Pair<Integer, TreeNode> pair = queue.poll();
            Integer key = pair.getLeft();
            TreeNode node = pair.getRight();
            if(node != null) {
                if(!hashmap.containsKey(key)) {
                    hashmap.put(key, new ArrayList<>());
                }
                hashmap.get(key).add(node.getVal());
                queue.add(new Pair<>(key-1, node.getLeft()));
                queue.add(new Pair<>(key+1, node.getRight()));
            }
        }
        ArrayList<Integer> keys = new ArrayList<>(hashmap.keySet());
        Collections.sort(keys);

        for (Integer key: keys) {
            output.add(hashmap.get(key));
        }
        return output;
    }
}
