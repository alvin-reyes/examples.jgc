package com.areyes1.junit.exceptions;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class JUnitRuleAnnotation {

	//	We introduce this to create an expected exception object
	@Rule
	public ExpectedException expectedThrown = ExpectedException.none();
	
	/**
	 * The test is expecting throw the expected exception (which in this case, the NumberFormatException)
	 */
	@Test
	public void testExpectedRuleException() {
		expectedThrown.expect(NumberFormatException.class);
		String numberStr = "abc";
		Integer.valueOf(numberStr);
		
	}
	
}
