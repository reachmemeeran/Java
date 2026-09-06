package com.meeran.datastructure;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeSortTest {

    @Test
    public void testMergeSort() {
        int[] array = {1, 3, 8, 7, 2, 4, 6, 5};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};

        MergeSort.mergeSort(array);
        assertArrayEquals(expected, array);
    }
}