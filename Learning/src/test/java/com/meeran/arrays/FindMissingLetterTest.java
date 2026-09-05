package com.meeran.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FindMissingLetterTest {

    @Test
    public void exampleTests() {
        assertEquals('e', FindMissingLetter.findMissingLetter(new char[] { 'a', 'b', 'c', 'd', 'f' }));
        assertEquals('P', FindMissingLetter.findMissingLetter(new char[] { 'O', 'Q', 'R', 'S' }));
    }
}
