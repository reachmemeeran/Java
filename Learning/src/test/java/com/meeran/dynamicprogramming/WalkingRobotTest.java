package com.meeran.dynamicprogramming;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class WalkingRobotTest {

    @Test
    public void testWalk() {
        assertEquals(Arrays.toString(new Integer[] {0, 0}), Arrays.toString(WalkingRobot.walk("")));
        assertEquals(Arrays.toString(new Integer[] {-1, 0}), Arrays.toString(WalkingRobot.walk("L")));
        assertEquals(Arrays.toString(new Integer[] {0, -3}), Arrays.toString(WalkingRobot.walk("UUU")));
        assertEquals(Arrays.toString(new Integer[] {0, 0}), Arrays.toString(WalkingRobot.walk("ULDR")));
        assertEquals(Arrays.toString(new Integer[] {0, -2}), Arrays.toString(WalkingRobot.walk("UUUDLR")));
    }
}
