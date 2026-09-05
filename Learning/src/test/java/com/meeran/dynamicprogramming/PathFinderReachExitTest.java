package com.meeran.dynamicprogramming;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PathFinderReachExitTest {

    @Test
    public void sampleTests() {
        String a = ".W.\n" + ".W.\n" + "...",
                b = ".W.\n" + ".W.\n" + "W..",
                c = "......\n" + "......\n" + "......\n" + "......\n" + "......\n" + "......",
                d = "......\n" + "......\n" + "......\n" + "......\n" + ".....W\n" + "....W.";

        assertEquals(true, PathFinderReachExit.pathFinderReachExit(a));
        assertEquals(false, PathFinderReachExit.pathFinderReachExit(b));
        assertEquals(true, PathFinderReachExit.pathFinderReachExit(c));
        assertEquals(false, PathFinderReachExit.pathFinderReachExit(d));

        assertEquals(true, PathFinderReachExit.pathFinderShortPath(a));
        assertEquals(false, PathFinderReachExit.pathFinderShortPath(b));
        assertEquals(true, PathFinderReachExit.pathFinderShortPath(c));
        assertEquals(false, PathFinderReachExit.pathFinderShortPath(d));
    }
}
