package com.meeran.datastructure;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {

    @Test
    public void testBSTOperations() {
        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.rInsert(18);
        myBST.rInsert(52);
        myBST.insert(82);

        assertFalse(myBST.contains(27));
        assertFalse(myBST.rContains(27));

        myBST.insert(27);

        assertTrue(myBST.contains(27));
        assertTrue(myBST.rContains(27));

        assertEquals(18, myBST.minimumValue(myBST.getRoot()));
        assertEquals(52, myBST.minimumValue(myBST.getRoot().right));

        BinarySearchTree myBST1 = new BinarySearchTree();
        myBST1.insert(2);
        myBST1.insert(1);
        myBST1.insert(3);

        assertEquals(2, myBST1.getRoot().value);
        assertEquals(1, myBST1.getRoot().left.value);
        assertEquals(3, myBST1.getRoot().right.value);

        myBST1.deleteNode(2);
        assertEquals(3, myBST1.getRoot().value);
        assertEquals(1, myBST1.getRoot().left.value);
        assertNull(myBST1.getRoot().right);
    }

    @Test
    public void testBSTTraversals() {
        BinarySearchTree myBSTraversal = new BinarySearchTree();
        myBSTraversal.insert(47);
        myBSTraversal.insert(21);
        myBSTraversal.insert(76);
        myBSTraversal.insert(18);
        myBSTraversal.insert(27);
        myBSTraversal.insert(52);
        myBSTraversal.insert(82);

        assertEquals(Arrays.asList(47, 21, 76, 18, 27, 52, 82), myBSTraversal.BFS());
        assertEquals(Arrays.asList(47, 21, 18, 27, 76, 52, 82), myBSTraversal.DFSPreOrder());
        assertEquals(Arrays.asList(18, 27, 21, 52, 82, 76, 47), myBSTraversal.DFSPostOrder());
        assertEquals(Arrays.asList(18, 21, 27, 47, 52, 76, 82), myBSTraversal.DFSInOrder());
    }
}
