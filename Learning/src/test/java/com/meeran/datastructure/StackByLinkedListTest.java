package com.meeran.datastructure;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackByLinkedListTest {

    @Test
    public void testStackOperations() {
        StackByLinkedList stack = new StackByLinkedList(1);
        assertEquals(1, stack.getHeight());
        assertEquals(1, stack.getTop().value);

        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.getHeight());
        assertEquals(3, stack.getTop().value);

        Node popped = stack.pop();
        assertNotNull(popped);
        assertEquals(3, popped.value);
        assertEquals(2, stack.getHeight());
        assertEquals(2, stack.getTop().value);

        assertEquals(2, stack.pop().value);
        assertEquals(1, stack.pop().value);
        assertNull(stack.pop());
        assertEquals(0, stack.getHeight());
    }
}
