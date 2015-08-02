package com.areyes1.junit.exceptions;

import org.junit.Test;

public class JUnitAnnotationExample {
	
	/**
	 * This means that the method is expecting a number format exception.
	 */
	@Test(expected=NumberFormatException.class)
	public void testAnnotationExample() {
		String numberStr = "abc";
		Integer.valueOf(numberStr);
	}
}
