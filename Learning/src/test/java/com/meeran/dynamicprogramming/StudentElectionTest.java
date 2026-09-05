package com.meeran.dynamicprogramming;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StudentElectionTest {

    @Test
    public void testWhoIsElected() {
        assertEquals(1, StudentElection.whoIsElected(1, 1));
        assertEquals(1, StudentElection.whoIsElected(2, 2));
        assertEquals(1, StudentElection.whoIsElected(4, 2));
        assertEquals(13, StudentElection.whoIsElected(14, 2));
        assertEquals(3, StudentElection.whoIsElected(5, 2));
    }

    @Test
    public void testJosephus() {
        assertEquals(1, StudentElection.josephus(1, 1));
        assertEquals(1, StudentElection.josephus(2, 2));
        assertEquals(1, StudentElection.josephus(4, 2));
        assertEquals(13, StudentElection.josephus(14, 2));
        assertEquals(3, StudentElection.josephus(5, 2));
    }
}
