package com.meeran.datastructure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GraphTraversalTest {

    @Test
    public void testGraphTrStructure() {
        GraphTr graph = new GraphTr(6);
        graph.addedges(0, 1);
        graph.addedges(1, 3);
        graph.addedges(0, 2);
        graph.addedges(2, 4);
        graph.addedges(3, 5);

        assertEquals(6, graph.node);
        assertEquals(2, graph.graphArr.get(0).size());
    }
}
