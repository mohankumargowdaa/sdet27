package com.crm.autodesk.contactsTest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.crm.autodesk.genericUtility.ListenerImplementation.class)
public class demo {
	@Test
	public void demo() {
		System.out.println("Hi");
	}
	
	@Test
	public void demo2() {
		//Assert.fail();
		System.out.println("Hello");
	}
	
	@Test
	public void demo3() throws Throwable {
		Assert.fail();
		System.out.println("Namaskara");
	}
	@Test(dependsOnMethods ="demo3")
	public void demo4() throws Throwable {
		System.out.println("working");
	}
}