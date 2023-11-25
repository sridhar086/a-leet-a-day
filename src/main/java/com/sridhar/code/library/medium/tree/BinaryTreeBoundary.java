package com.sridhar.code.library.medium.tree;


import com.sridhar.code.library.easy.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;


enum Flag  {

    L("LEFT"),
    R("RIGHT"),
    T("ROOT"),
    O("OTHER");

    public final String label;
    Flag(String label) {
        this.label = label;
    }
}


public class BinaryTreeBoundary {

    ArrayList<Integer> leftBoundary = new ArrayList<>();
    ArrayList<Integer> leafBoundary = new ArrayList<>();
    ArrayList<Integer> rightBoundary = new ArrayList<>();

    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        recursiveTree(root, Flag.T);
        leftBoundary.addAll(leafBoundary);
        leftBoundary.addAll(rightBoundary);
        return leftBoundary;
    }
    private boolean isLeftBoundary(Flag flag) {
        return flag.equals(Flag.L);
    }

    private boolean isRightBoundary(Flag flag) {
        return flag.equals(Flag.R);
    }

    private boolean isRoot(Flag flag) {
        return flag.equals(Flag.T);
    }

    private boolean isLeaf(TreeNode node) {
        return node.getLeft() == null && node.getRight() == null;
    }

    private Flag getLeftFlag(TreeNode node, Flag flag) {
        if(isLeftBoundary(flag) || isRoot(flag)) {
            return Flag.L;
        } else if(isRightBoundary(flag) && node.getRight() == null) {
            return Flag.R;
        } else {
            return Flag.O;
        }
    }

    private Flag getRightFlag(TreeNode node, Flag flag) {
        if(isRightBoundary(flag) || isRoot(flag)) {
            return Flag.R;
        } else if(isLeftBoundary(flag) && node.getLeft() == null) {
            return Flag.L;
        } else {
            return Flag.O;
        }
    }

    private void recursiveTree(TreeNode node, Flag flag) {

        if(node == null) {
            return;
        } else if (isLeaf(node)) {
            leafBoundary.add(node.getVal());
        } else if (isLeftBoundary(flag) || isRoot(flag)) {
            leftBoundary.add(node.getVal());
        } else if(isRightBoundary(flag)) {
            rightBoundary.add(0, node.getVal());
        }

        recursiveTree(node.getLeft(), getLeftFlag(node,flag));
        recursiveTree(node.getRight(), getRightFlag(node, flag));
    }

}
