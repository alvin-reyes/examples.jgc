package com.areyes1.junitassertthat.sample;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.BaseMatcher.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class JUnitTestAssertThatAssertions {
	
	int totalNumberOfApplicants = 0;
	int totalNumberOfAcceptableApplicants = 10;
	ArrayList<String> listOfValidStrings = new ArrayList<String>();
	
	@Before
	public void setData(){
		this.totalNumberOfApplicants = 9;
		listOfValidStrings.add("object_1");
		listOfValidStrings.add("object_2");
		listOfValidStrings.add("object_3");
	}
	
	@Test
	public void testAssertThatEqual() {
		assertThat("123",is("123"));
	}
	
	@Test
	public void testAssertThatNotEqual() {
		assertThat(totalNumberOfApplicants,is(123));
	}
	
	@Test
	public void testAssertThatObject() {
		assertThat("123",isA(String.class));
	}
	
	
	@Test
	public void testAssertThatWMessage(){
		assertThat("They are not equal!","123",is("1234"));
	}
}
