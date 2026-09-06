package com.meeran.datastructure;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StackImplementationUsingQueueTest {

    @Test
    public void testStack() {
        StackImplementationUsingQueue s = new StackImplementationUsingQueue();
        s.push(0);
        s.push(4);
        assertEquals(4, s.peek());
        s.push(5);
        assertEquals(5, s.peek());
        s.push(3);
        assertEquals(3, s.peek());
        assertTrue(s.pop());
        assertEquals(5, s.peek());
        assertTrue(s.pop());
        assertEquals(4, s.peek());
        assertTrue(s.pop());
        assertTrue(s.pop());
        assertFalse(s.pop());
        assertEquals(-1, s.peek());
    }
}
