package com.meeran.datastructure;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class QueueImplementationUsingStackTest {

    @Test
    public void testQueue() {
        QueueImplementationUsingStack q = new QueueImplementationUsingStack();
        q.add(0);
        q.add(4);
        assertEquals(0, q.peek());
        q.add(5);
        assertEquals(0, q.peek());
        q.add(3);
        assertEquals(0, q.peek());
        assertTrue(q.remove());
        assertEquals(4, q.peek());
        assertTrue(q.remove());
        assertEquals(5, q.peek());
        assertTrue(q.remove());
        assertTrue(q.remove());
        assertEquals(-1, q.peek());
        assertFalse(q.remove());
    }
}
