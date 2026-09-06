package com.meeran.maths;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class DecimalConversionTest {

    @Test
    public void testvulgarToDecimal(){
        assertTrue(DecimalConversion.vulgarToDecimal(1l, 2l).equals("0.5"));
        assertTrue(DecimalConversion.vulgarToDecimal(1l, 3l).equals("0.(3)"));
        assertTrue(DecimalConversion.vulgarToDecimal(1l, 30l).equals("0.0(3)"));
        assertTrue(DecimalConversion.vulgarToDecimal(1l, 75l).equals("0.01(3)"));
        assertTrue(DecimalConversion.vulgarToDecimal(4l, 7l).equals("0.(571428)"));
    }
}
