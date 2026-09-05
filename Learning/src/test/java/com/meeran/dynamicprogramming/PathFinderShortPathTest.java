package com.meeran.dynamicprogramming;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PathFinderShortPathTest {

    @Test
    public void sampleTests() {
        String a = ".W.\n" + ".W.\n" + "...",
                b = ".W.\n" + ".W.\n" + "W..",
                c = "......\n" + "......\n" + "......\n" + "......\n" + "......\n" + "......",
                d = "......\n" + "......\n" + "......\n" + "......\n" + ".....W\n" + "....W.";

        assertEquals(4, PathFinderShortPath.pathFinder(a), a);
        assertEquals(-1, PathFinderShortPath.pathFinder(b), b);
        assertEquals(10, PathFinderShortPath.pathFinder(c), c);
        assertEquals(-1, PathFinderShortPath.pathFinder(d), d);
    }
}
