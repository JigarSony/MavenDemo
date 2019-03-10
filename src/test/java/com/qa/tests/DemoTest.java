package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void sum() {
		System.out.println("In SUM");
		int a = 10;
		int b = 20;
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	public void sub() {
		System.out.println("In SUB");
		int a = 10;
		int b = 20;
		Assert.assertEquals(10, b-a);
	}
	
	@Test
	public void mul() {
		System.out.println("In MUL");
		int a = 10;
		int b = 20;
		Assert.assertEquals(200, a*b);
	}
	
	@Test
	public void div() {
		System.out.println("In DIV");
		int a = 10;
		int b = 20;
		Assert.assertEquals(2,b/a);
	}
	
}
