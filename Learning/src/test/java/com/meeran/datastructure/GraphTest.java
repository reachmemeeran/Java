package com.meeran.datastructure;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GraphTest {

    @Test
    public void testGraphOperations() {
        Graph graph = new Graph();

        assertTrue(graph.addVertex("A"));
        assertTrue(graph.addVertex("B"));
        assertTrue(graph.addVertex("C"));
        assertTrue(graph.addVertex("D"));

        assertTrue(graph.addEdge("A", "B"));
        assertTrue(graph.addEdge("A", "C"));
        assertTrue(graph.addEdge("A", "D"));
        assertTrue(graph.addEdge("B", "D"));
        assertTrue(graph.addEdge("C", "D"));

        assertTrue(graph.removeVertex("D"));
        assertNull(graph.getAdjList().get("D"));

        assertTrue(graph.removeEdge("A", "B"));
        assertFalse(graph.getAdjList().get("A").contains("B"));
    }
}
