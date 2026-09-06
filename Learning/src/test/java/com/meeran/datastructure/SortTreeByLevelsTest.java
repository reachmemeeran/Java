package com.meeran.datastructure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class SortTreeByLevelsTest {

    @Test
    public void nullTest() {
        assertEquals(Arrays.asList(), SortTreeByLevels.treeByLevels(null));
    }

    @Test
    public void basicTest() {
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6),
                SortTreeByLevels.treeByLevels(new Node(new Node(null, new Node(null, null, 4), 2),
                        new Node(new Node(null, null, 5), new Node(null, null, 6), 3), 1)));
    }
}
