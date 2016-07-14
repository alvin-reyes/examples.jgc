package com.junit.unrooted.test.sample;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import junit.framework.TestCase;

@RunWith(BlockJUnit4ClassRunner.class)
public class JUnitSampleUnRootedTest {
	
	int totalNumberOfApplicants = 0;
	int totalNumberOfAcceptableApplicants = 10;
	
	@Test
	public void testAssertions() {
		assertTrue((this.totalNumberOfApplicants != this.totalNumberOfAcceptableApplicants));
	}

	
	@Test
	public void testAssertTrueWithMessage(){
		assertTrue("Is total number of applicants acceptable?",(this.totalNumberOfApplicants != this.totalNumberOfAcceptableApplicants));
	}
}