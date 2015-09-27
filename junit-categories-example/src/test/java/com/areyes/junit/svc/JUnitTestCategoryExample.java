package com.areyes.junit.svc;

import static org.hamcrest.CoreMatchers.isA;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.areyes.junit.cat.intf.FunctionalGroupTests1;
import com.areyes.junit.cat.intf.FunctionalGroupTests2;
import com.areyes.junit.cat.intf.IntegrationTests;
import com.areyes.junit.cat.intf.SanityTests;

public class JUnitTestCategoryExample {

	@Test @Category(FunctionalGroupTests1.class)
	public void testFunctionalTests1Test1() {
		//	You're test case here: Below is just an example.
		int numberInLoop = 0;
		for (int i=0;i<1000;i++) {
			numberInLoop++;
			
		}
		System.out.println("FunctionalGroupTests1: testFunctionalTests1Test1");
		Assert.assertThat(numberInLoop,isA(Integer.class));
	}
	
	@Test @Category(FunctionalGroupTests1.class)
	public void testFunctionalTests1Test2() {
		//	You're test case here: Below is just an example.
		int numberInLoop = 0;
		for (int i=1000;i<4000;i++) {
			numberInLoop++;
			
		}
		System.out.println("FunctionalGroupTests1: testFunctionalTests1Test2");
		Assert.assertThat(numberInLoop,isA(Integer.class));
	}
	
	@Test @Category(FunctionalGroupTests2.class)
	public void testFunctionalTests2Test1() {
		//	You're test case here: Below is just an example.
		int numberInLoop = 0;
		do{
			numberInLoop++;
		}while(numberInLoop != 1000);
		System.out.println("FunctionalGroupTests2: testFunctionalTests2Test1");
		Assert.assertThat(numberInLoop,isA(Integer.class));
	}
	
	@Test @Category(FunctionalGroupTests2.class)
	public void testFunctionalTests2Test2() {
		System.out.println("FunctionalGroupTests2: testFunctionalTests2Test2");
	}

	@Test @Category({IntegrationTests.class,FunctionalGroupTests1.class})
	public void testIntegrationTestsTest1() {
		System.out.println("IntegrationTests: testIntegrationTestsTest1");
	}
	
	
	@Test @Category(SanityTests.class)
	public void testSanityTestsTest1() {
		System.out.println("SanityTests: testSanityTestsTest1");
	}
	
}
