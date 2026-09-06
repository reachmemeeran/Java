package com.meeran.datastructure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BSTTraversalTest {

    @Test
    public void testTreeCalculations() {
        Node node = new Node(1);
        node.left = new Node(2);
        node.left.left = new Node(3);
        node.left.right = new Node(4);
        node.right = new Node(9);
        node.right.left = new Node(10);
        node.right.right = new Node(11);

        PrintTreeNodeData tree = new PrintTreeNodeData();
        int depth = tree.depthOfTree(node, 1);
        assertEquals(3, depth);
    }
}