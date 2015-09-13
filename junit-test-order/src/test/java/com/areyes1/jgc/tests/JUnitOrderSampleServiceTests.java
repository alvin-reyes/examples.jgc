package com.areyes1.jgc.tests;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JUnitOrderSampleServiceTests {
	
	@Test
	public void testC() {
		System.out.println("C");
		int numberCResult = 0;
		for (int i=0;i<1000;i++) {
			//complex loop
			numberCResult++;
			
		}
		Assert.assertThat(numberCResult,isA(Integer.class));
	}
	
	@Test
	public void testA() {
		System.out.println("A");
		int numberAResult = 0;
		for (int i=0;i<10000;i++) {
			//complex loop
			numberAResult++;
			
		}
		Assert.assertThat(numberAResult,isA(Integer.class));
	}
	
	@Test
	public void testD() {
		System.out.println("D");
		int numberDResult = 0;
		for (int i=0;i<100000;i++) {
			//complex loop
			numberDResult++;
			
		}
		Assert.assertThat(numberDResult,isA(Integer.class));
	}
	
	@Test
	public void testB() {
		System.out.println("B");
		int numberBResult = 0;
		for (int i=0;i<1000000;i++) {
			//complex loop
			numberBResult++;
			
		}
		Assert.assertThat(numberBResult,isA(Integer.class));
	}
	

	
	

}
