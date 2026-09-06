package com.meeran.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class AddFractionTest {

    @Test
    public void testAddFractions() {
        int[] array1 = {2, 3};
        int[] array2 = {1, 2};
        int[] output= {7,6};
        assertEquals(Arrays.toString(output), Arrays.toString(AddFraction.addFractions(array1, array2)));
    }
}
