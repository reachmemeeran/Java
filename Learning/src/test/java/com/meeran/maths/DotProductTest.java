package com.meeran.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DotProductTest {

    @Test
    public void testDoctProduct() {
        int[] array1 = {2, 3};
        int[] array2 = {1, 2};
        assertEquals(8, DotProduct.dotProduct(array1, array2));
    }
}
