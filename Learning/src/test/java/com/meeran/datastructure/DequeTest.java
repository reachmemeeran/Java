package com.meeran.datastructure;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DequeTest {

    @Test
    public void testDequeOperations() {
        Deque deque = new Deque();
        deque.addFirst(0);
        deque.addFirst(4);
        assertEquals(0, deque.peekLast());
        assertEquals(4, deque.peekFirst());
        deque.addLast(5);
        assertEquals(5, deque.peekLast());
        assertEquals(4, deque.peekFirst());
        deque.addFirst(3);
        assertEquals(5, deque.peekLast());
        assertEquals(3, deque.peekFirst());
        assertTrue(deque.removeFirst());
        assertEquals(5, deque.peekLast());
        assertEquals(4, deque.peekFirst());
        assertTrue(deque.removeLast());
        assertEquals(0, deque.peekLast());
        assertEquals(4, deque.peekFirst());
        assertTrue(deque.removeLast());
        assertTrue(deque.removeLast());
        assertEquals(-1, deque.peekLast());
        assertEquals(-1, deque.peekFirst());
        assertFalse(deque.removeFirst());
        assertFalse(deque.removeLast());
    }
}
