package com.meeran.datastructure;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class BubbleSelectionInsertionSortTest {

    @Test
    public void testSortingAlgorithms() {
        int[] expected = {1, 2, 3, 4, 5, 6};

        int[] bubbleArray = {4, 2, 6, 5, 1, 3};
        BubbleSelectionInsertionSort.bubbleSort(bubbleArray);
        assertArrayEquals(expected, bubbleArray);

        int[] selectionArray = {4, 2, 6, 5, 1, 3};
        BubbleSelectionInsertionSort.selectionSort(selectionArray);
        assertArrayEquals(expected, selectionArray);

        int[] insertionArray = {4, 2, 6, 5, 1, 3};
        BubbleSelectionInsertionSort.insertionSort(insertionArray);
        assertArrayEquals(expected, insertionArray);
    }
}
