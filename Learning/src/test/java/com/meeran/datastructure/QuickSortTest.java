package com.meeran.datastructure;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class QuickSortTest {

    @Test
    public void testQuickSort() {
        int[] array = {4, 6, 1, 7, 3, 2, 5};
        int[] expected = {1, 2, 3, 4, 5, 6, 7};

        QuickSort.quickSort(array);
        assertArrayEquals(expected, array);
    }
}
