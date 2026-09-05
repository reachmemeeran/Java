package com.meeran.stringandpatterns;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import org.junit.jupiter.api.Test;

public class StringMergerTest {

    private Random random = new Random();

    @Test
    public void normalHappyFlow() {
        assertTrue(StringMerger.isMerge("codewars", "code", "wars"), "codewars can be created from code and wars");
        assertTrue(StringMerger.isMerge("codewars", "cdwr", "oeas"), "codewars can be created from cdwr and oeas");
        assertTrue(StringMerger.isMerge("Making progress", "Mak pross", "inggre"), "Making progress");
    }

    @Test
    public void alwaysPass() {
        assertTrue(true, "this can't fail");
    }

    @Test
    public void normalSadFlow() {
        assertFalse(StringMerger.isMerge("codewars", "code", "code"), "codewars is not code + code");
        assertFalse(StringMerger.isMerge("More progress", "More ess", "pro"), "More progress");
    }

    @Test
    public void canHandleEmptyPart() {
        assertTrue(StringMerger.isMerge("codewars", "codewars", ""), "codewars are codewars");
        assertTrue(StringMerger.isMerge("codewars", "", "codewars"), "codewars are codewars");
    }

    @Test
    public void canHandleTooFewChars() {
        assertFalse(StringMerger.isMerge("codewars", "code", "war"), "codewars is not codewar");
        assertFalse(StringMerger.isMerge("codewars", "c", "o"), "codewars is not co");
    }

    @Test
    public void canHandleExtraChars() {
        assertFalse(StringMerger.isMerge("codewars", "code", "warss"), "codewars is not codewarss");
    }

    @Test
    public void canHandleCharactersInWrongOrder() {
        assertFalse(StringMerger.isMerge("codewars", "code", "wasr"), "codewars can't be created from code and wasr");
        assertFalse(StringMerger.isMerge("codewars", "cwdr", "oeas"), "codewars can't be created from cwdr and oeas");
    }

    @Test
    public void canHandleEmptyStrings() {
        assertFalse(StringMerger.isMerge("", "code", "wars"), "empty result string");
        assertFalse(StringMerger.isMerge("codewars", "", "code"), "empty part one");
        assertFalse(StringMerger.isMerge("codewars", "code", ""), "empty part two");
        assertFalse(StringMerger.isMerge("codewars", "", ""), "empty parts");
        assertTrue(StringMerger.isMerge("", "", ""), "all empty");
    }

    @Test
    public void canHandleBananas() {
        assertTrue(StringMerger.isMerge("Bananas from Bahamas", "Bahas", "Bananas from am"), "Going bananas!");
    }

    @Test
    public void someRandomCases() {
        for(int i = 0; i < 20; i++) {
            String[] parts = splitString("Can we merge it? Yes, we can!");
            if (random.nextBoolean())
                assertTrue(StringMerger.isMerge("Can we merge it? Yes, we can!", parts[0], parts[1]));
            else
                assertFalse(StringMerger.isMerge("Can we merge it? No, we can't!", parts[0], parts[1]));
        }
    }

    @Test
    public void someMoreRandomCases() {
        for(int i = 0; i < 20; i++) {
            String s = randomString();
            String[] parts = splitString(s);
            assertTrue(StringMerger.isMerge(s, parts[0], parts[1]));
        }
    }

    @Test
    public void evenMoreRandomCases() {
        for(int i = 0; i < 20; i++) {
            String s = randomString();
            if (random.nextBoolean() || s.charAt(0) == s.charAt(s.length()-1)) {
                String[] parts = splitString(s);
                assertTrue(StringMerger.isMerge(s, parts[0], parts[1]));
            } else {
                String[] parts = splitString(s);
                s = s.charAt(s.length()-1) + s.substring(1, s.length()-1) + s.charAt(0);
                assertFalse(StringMerger.isMerge(s, parts[0], parts[1]));
            }
        }
    }

    @Test
    public void someTrickyRandomCases() {
        for(int i = 0; i < 20; i++) {
            String[] chunks = {randomString(), randomString(), randomString(), randomString()};
            String s = chunks[0] + chunks[1] + chunks[0] + chunks[2] + chunks[3];
            String p1 = chunks[0] + chunks[2];
            String p2 = chunks[0] + chunks[1] + chunks[3];
            assertTrue(StringMerger.isMerge(s, p1, p2));
        }
    }

    private String randomString() {
        String s = "";
        int length = random.nextInt(20) + 10;
        for(int i = 0; i < length; i++) {
            char ch = (char) (random.nextInt(123-32) + 32);
            s += ch;
        }
        return s;
    }

    private String[] splitString(String s) {
        String s1 = "";
        String s2 = "";
        for(char ch: s.toCharArray()) {
            if (random.nextBoolean())
                s1 += ch;
            else
                s2 += ch;
        }
        return new String[] {s1, s2};
    }
}
