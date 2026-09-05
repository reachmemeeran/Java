package com.meeran.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TweleveCardGameTest {

    @Test
    public void exampleTests() {
        assertEquals(true,
                TweleveCardGame.game(new int[] { 2, 5, 8, 11 }, new int[] { 1, 4, 7, 10 }, new int[] { 0, 3, 6, 9 }));
        assertEquals(false,
                TweleveCardGame.game(new int[] { 1, 2, 3, 4 }, new int[] { 5, 6, 7, 8 }, new int[] { 0, 9, 10, 11 }));
        assertEquals(true,
                TweleveCardGame.game(new int[] { 4, 5, 6, 9 }, new int[] { 0, 1, 8, 11 }, new int[] { 2, 3, 7, 10 }));
        assertEquals(true,
                TweleveCardGame.game(new int[] { 2, 3, 6, 10 }, new int[] { 1, 7, 8, 11 }, new int[] { 0, 4, 5, 9 }));
        assertEquals(false,
                TweleveCardGame.game(new int[] { 0, 2, 4, 6 }, new int[] { 3, 5, 9, 10 }, new int[] { 1, 7, 8, 11 }));
        assertEquals(false,
                TweleveCardGame.game(new int[] { 0, 3, 4, 6 }, new int[] { 1, 9, 10, 11 }, new int[] { 2, 5, 7, 8 }));
    }
}
