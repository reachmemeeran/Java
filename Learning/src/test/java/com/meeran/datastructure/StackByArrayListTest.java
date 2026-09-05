package com.meeran.datastructure;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StackByArrayListTest {

    @Test
    public void testStackOperations() {
        StackByArrayList<Integer> myStack = new StackByArrayList<>();
        assertTrue(myStack.isEmpty());

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        assertEquals(3, myStack.size());
        assertEquals(3, myStack.peek());
        assertEquals(3, myStack.pop());
        assertEquals(2, myStack.size());
        assertEquals(2, myStack.peek());
    }
}
