package com.sridhar.code.library.blindpractice.graph;

import com.sridhar.code.utils2.Node;

import java.util.HashMap;

// Leet 133
public class CloneGraph {

    public Node cloneGraph(Node node) {
        HashMap<Node, Node> visited = new HashMap<>();
        return recursive(node, visited);
    }

    public Node recursive(Node node, HashMap<Node, Node> visited) {
        if(node == null)
            return null;

        if(visited.containsKey(node))
            return visited.get(node);

        Node newNode = new Node(node.val);
        visited.put(node, newNode);

        for (Node neighbor : node.neighbors) {
            newNode.neighbors.add(recursive(neighbor, visited));
        }
        return newNode;
    }
}
