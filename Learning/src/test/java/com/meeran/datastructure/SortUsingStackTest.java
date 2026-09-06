package com.meeran.datastructure;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortUsingStackTest {

    @Test
    public void testSortStack() {
        StackByArrayList<Integer> stack = new StackByArrayList<>();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.push(4);

        SortUsingStack.sortStack(stack);

        assertFalse(stack.isEmpty());
        // Verify sorted order by popping elements
        assertEquals(1, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(3, stack.pop());
        assertEquals(4, stack.pop());
        assertEquals(5, stack.pop());
        assertTrue(stack.isEmpty());
    }
}
