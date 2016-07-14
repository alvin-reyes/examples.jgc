package com.junit.unrooted.test.sample;

import org.junit.Test;

import junit.framework.TestCase;

public class SuperClassTestCase extends TestCase {
	
	int totalNumberOfApplicants = 0;
	int totalNumberOfAcceptableApplicants = 10;
	

	public void testSetData(){
		this.totalNumberOfApplicants = 9;
	}
}
