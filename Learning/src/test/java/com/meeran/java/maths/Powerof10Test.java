package com.meeran.java.maths;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.meeran.java.maths.Powerof10;

class Powerof10Test {
	@Test
	void testIsPowerOf10() {
		assertTrue(Powerof10.isPowerOf10(1)); 
	    assertTrue(Powerof10.isPowerOf10(1000));
	    assertFalse(Powerof10.isPowerOf10(4));
	    assertFalse(Powerof10.isPowerOf10(0));
	    assertTrue(Powerof10.isPowerOf10(10));
	    assertTrue(Powerof10.isPowerOf10(100));
	}

}
