package com.areyes1.junit.exceptions;

import static org.junit.Assert.*;
import org.junit.Test;

public class JUnitTryCatchExample {

	double value = 0.0d;

	/**
	 * We are catching the exception using the traditional try-catch clause and return
	 * an assertion.
	 */
	@Test
	public void testJUnitTryCatch() {
		try {
			if(value < 0.1d) {
				fail("Value given is not as expected");
			}
		} catch (Exception e) {
			assertTrue((value != 0.0d));
		}

	}
}
