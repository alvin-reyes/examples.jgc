package com.areyes1.jgc.no.tests;

import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class JUnitTestingSampleNoTestFound {

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
