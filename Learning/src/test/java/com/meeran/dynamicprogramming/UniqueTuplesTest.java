package com.meeran.dynamicprogramming;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class UniqueTuplesTest {

    @Test
    public void testUniqueTuples() {
        assertEquals("[abc, bca]", Arrays.toString(UniqueTuples.uniqueTuples("abca", 3).toArray()));
        assertEquals("[ab, bb, bc, cc, cd, de]", Arrays.toString(UniqueTuples.uniqueTuples("abbccde", 2).toArray()));
    }
}
