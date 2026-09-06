package com.meeran.datastructure;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueByLinkedListTest {

    @Test
    public void testQueueOperations() {
        QueueByLinkedList queue = new QueueByLinkedList(1);
        assertEquals(1, queue.getLength());
        assertEquals(1, queue.getFirst().value);
        assertEquals(1, queue.getLast().value);

        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(3, queue.getLength());
        assertEquals(1, queue.getFirst().value);
        assertEquals(3, queue.getLast().value);

        Node removed = queue.dequeue();
        assertNotNull(removed);
        assertEquals(1, removed.value);
        assertEquals(2, queue.getLength());
        assertEquals(2, queue.getFirst().value);

        assertEquals(2, queue.dequeue().value);
        assertEquals(3, queue.dequeue().value);
        assertNull(queue.dequeue());
        assertEquals(0, queue.getLength());
    }
}
