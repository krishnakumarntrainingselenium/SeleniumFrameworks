package com.mavenownproject.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcase1 {
	
//	@Test(priority=1)
	@BeforeSuite
	void beforeSuite()
	{
		System.out.println("beforeSuite1");
	}
	
	@AfterSuite
	void afterSuite()
	{
		System.out.println("afterSuite1");
	}
	
	@BeforeClass
	void beforeClass()
	{
		System.out.println("beforeClass1");
	}
	
	@AfterClass
	void afterClass()
	{
		System.out.println("afterClass1");
		System.out.println("****************Test Case 1 Completed****************");
	}
	
	
	@BeforeMethod
	void before_Method()
	{
		System.out.println("before_Method1");
	}
	
	@AfterMethod
	void after_Method()
	{
		System.out.println("after_Method1");
	}
	
	@BeforeTest
	void beforeTest()
	{
		System.out.println("beforeTest1");
	}
	
	@AfterTest
	void afterTest()
	{
		System.out.println("afterTest1");
	}
		
	@Test
	void loginMethod1()
	{
		System.out.println("loginMethod1");
		testcase1 a=new testcase1();
		a.loginMethodcall();
	}
	void loginMethodcall()
	{
		
		System.out.println("loginMethodcall");
	
	}
	
	@Test
	void loginMethod_NewTest()
	{
		System.out.println("loginMethod_NewTest");
		
		
	}
	
	
	
//	@Test
//	void loginMethod2()
//	{
//		System.out.println("loginMethod2");
//	}
	

}
