package com.sridhar.code.library.acompany.salesforce;

import com.sridhar.code.utils.Node;

public class PopulatingNextRightPointersinEachNode {

    public Node connect(Node root) {
        recursiveConnect(root);
        return root;
    }

    public void recursiveConnect(Node root) {
        if(root == null)
            return;
        if(root.left == null && root.right == null) {
            return;
        }
        root.left.next = root.right;
        root.right.next = null;
        if(root.next != null) {
            root.right.next = root.next.left;
        }
        recursiveConnect(root.left);
        recursiveConnect(root.right);
    }

}
