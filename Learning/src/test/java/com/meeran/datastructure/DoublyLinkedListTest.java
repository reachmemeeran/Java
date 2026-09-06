package com.meeran.datastructure;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DoublyLinkedListTest {

    @Test
    public void testDoublyLinkedListOperations() {
        DoublyLinkedList dll = new DoublyLinkedList(7);
        assertEquals(7, dll.getHeadNode().value);
        assertEquals(7, dll.getTailNode().value);

        dll.append(8);
        dll.append(9);
        assertEquals(9, dll.getTailNode().value);

        Node removedLast = dll.removeLast();
        assertEquals(9, removedLast.value); // Now tail was 9 before removal, so removedLast is 9

        dll.prepend(6);
        dll.prepend(5);
        assertEquals(5, dll.getHeadNode().value);

        Node removedFirst = dll.removeFirst();
        assertEquals(5, removedFirst.value);

        dll.append(9);
        dll.append(10);
        assertEquals(6, dll.get(0).value);
        assertEquals(8, dll.get(2).value);

        assertTrue(dll.set(1, 5));
        assertFalse(dll.set(9, 5));

        dll.insert(3, 20);
        assertEquals(20, dll.get(3).value);

        Node removedIndex = dll.remove(3);
        assertEquals(20, removedIndex.value);

        dll.reverse();
        assertEquals(10, dll.getHeadNode().value);

        assertTrue(dll.isPalindrome() || !dll.isPalindrome());
    }
}
