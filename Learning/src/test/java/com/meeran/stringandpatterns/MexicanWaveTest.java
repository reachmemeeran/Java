package com.meeran.stringandpatterns;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

public class MexicanWaveTest {

    @Test
    public void basicTest1() {
        String[] result = new String[] { "A       b    ", "a       B    " };
        assertArrayEquals(result, MexicanWave.wave("a       b    "));
    }

    @Test
    public void basicTest2() {
        String[] result = new String[] { "This is a few words", "tHis is a few words", "thIs is a few words", "thiS is a few words", "this Is a few words", "this iS a few words", "this is A few words", "this is a Few words", "this is a fEw words", "this is a feW words", "this is a few Words", "this is a few wOrds", "this is a few woRds", "this is a few worDs", "this is a few wordS" };
        assertArrayEquals(result, MexicanWave.wave("this is a few words"));
    }

    @Test
    public void basicTest3() {
        String[] result = new String[] { };
        assertArrayEquals(result, MexicanWave.wave(""));
    }

    @Test
    public void basicTest4() {
        String[] result = new String[] { " Gap ", " gAp ", " gaP " };
        assertArrayEquals(result, MexicanWave.wave(" gap "));
    }

    @Test
    public void randomTest() {
        for (int i = 0; i <= 200; i++) {
            String word = getWord();
            String[] result = wave2(word);
            assertArrayEquals(result, MexicanWave.wave(word));
        }
    }

    private Random rand = new Random();
    private String letters = "abcd efghi jklmno pqrstu vwxyz";

    private String getWord() {
        StringBuilder builder = new StringBuilder();
        for (int let = 0; let < rand.nextInt(200); let++) {
            builder.append(letters.charAt(rand.nextInt(letters.length())));
        }
        return builder.toString();
    }

    private String[] wave2(String str) {
        return IntStream
                .range(0, str.length())
                .mapToObj(x -> new StringBuilder(str).replace(x, x+1, String.valueOf(str.charAt(x)).toUpperCase()).toString())
                .filter(x -> !x.equals(str))
                .toArray(String[]::new);
    }
}
