package com.areyes1.jgc.junit.assertfalse;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertFalse;

public class JUnitAssertFalseExample {

	int totalNumberOfApplicants = 0;
	int totalNumberOfAcceptableApplicants = 10;

	@Before
	public void setData() {
		this.totalNumberOfApplicants = 9;
	}

	@Test
	public void testAssertFalseFalse() {
		assertFalse((this.totalNumberOfApplicants != this.totalNumberOfAcceptableApplicants));
	}
	
	@Test
	public void testAssertFalse() {
		assertFalse((this.totalNumberOfApplicants == this.totalNumberOfAcceptableApplicants));
	}

	@Test
	public void testAssertFalseWithMessage() {
		assertFalse(
				"Is total number of applicants acceptable?",
				(this.totalNumberOfApplicants != this.totalNumberOfAcceptableApplicants));
	}

}
