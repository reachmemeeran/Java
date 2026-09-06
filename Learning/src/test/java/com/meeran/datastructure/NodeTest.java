package com.meeran.datastructure;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NodeTest {

    @Test
    public void testDefaultConstructor() {
        Node node = new Node();
        assertEquals(0, node.value);
        assertNull(node.next);
        assertNull(node.prev);
        assertNull(node.left);
        assertNull(node.right);
        assertNull(node.key);
    }

    @Test
    public void testValueConstructor() {
        Node node = new Node(42);
        assertEquals(42, node.value);
        assertNull(node.next);
        assertNull(node.prev);
    }

    @Test
    public void testTreeConstructor() {
        Node left = new Node(1);
        Node right = new Node(2);
        Node node = new Node(left, right, 3);
        assertEquals(3, node.value);
        assertEquals(left, node.left);
        assertEquals(right, node.right);
    }

    @Test
    public void testHashTableConstructor() {
        Node node = new Node("nails", 100);
        assertEquals("nails", node.key);
        assertEquals(100, node.value);
        assertNull(node.next);
    }
}
