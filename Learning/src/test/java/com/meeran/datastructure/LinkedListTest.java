package com.meeran.datastructure;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    @Test
    public void testLinkedListOperations() {
        LinkedList ll = new LinkedList(4);
        ll.append(5);
        ll.getHead();
        ll.getTail();

        ll.prepend(3);
        assertEquals(3, ll.removeFirst().value);
        assertEquals(4, ll.removeFirst().value);
        assertEquals(5, ll.removeFirst().value);
        assertNull(ll.removeFirst());

        ll.append(1);
        ll.append(2);
        ll.prepend(0);

        // removeLast removes from the tail (2, then 1, then 0)
        assertEquals(2, ll.removeLast().value);
        assertEquals(1, ll.removeLast().value);
        assertEquals(0, ll.removeLast().value);
        assertNull(ll.removeLast());

        ll.append(1);
        ll.append(2);
        ll.prepend(0);

        assertEquals(0, ll.get(0).value);
        assertEquals(1, ll.get(1).value);

        ll.set(0, 10);
        assertEquals(10, ll.get(0).value);

        ll.insert(1, 11);
        assertEquals(11, ll.get(1).value);

        ll.remove(1);
        ll.reverse();

        assertNotNull(ll.findMiddleNode());
        assertFalse(ll.hasLoop());
    }

    @Test
    public void testAdvancedLinkedListOperations() {
        LinkedList ll = new LinkedList(4);
        ll.append(5);
        ll.append(6);

        int k = 2;
        assertEquals(5, ll.findKthFromEnd(k).value);

        ll.append(5);
        ll.append(6);
        ll.removeDuplicates();

        // Valid bounds for reverseBetween (indices 1 to 2)
        ll.reverseBetween(1, 2);
        ll.partitionList(5);

        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(2);
        myLinkedList.append(6);
        myLinkedList.append(5);
        myLinkedList.append(1);
        myLinkedList.append(3);

        myLinkedList.insertionSort();
        assertEquals(1, myLinkedList.get(0).value);
        assertEquals(6, myLinkedList.get(myLinkedList.getLength() - 1).value);

        LinkedList l1 = new LinkedList(1);
        l1.append(3);
        l1.append(5);
        l1.append(7);

        LinkedList l2 = new LinkedList(2);
        l2.append(4);
        l2.append(6);
        l2.append(8);

        l1.merge(l2);
        assertEquals(1, l1.get(0).value);
        assertEquals(2, l1.get(1).value);
        assertEquals(8, l1.get(l1.getLength() - 1).value);
    }
}
