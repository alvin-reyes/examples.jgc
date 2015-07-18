package com.areyes1.junitassertthat.sample;

import static org.junit.Assert.*;
import static com.areyes1.junitassertthat.sample.CustomMatcher.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class JUnitTestAssertThatCustomMatcher {

	ArrayList<String> listOfValidStrings = new ArrayList<String>();
	private String inputValue = new String("Hello");
	@Before
	public void setData(){
		listOfValidStrings.add("object_1");
		listOfValidStrings.add("object_2");
		listOfValidStrings.add("object_3");
	}
	
	@Test
	public void testLogic(){
		assertThat(inputValue,matches("Hello"));
	}
}
