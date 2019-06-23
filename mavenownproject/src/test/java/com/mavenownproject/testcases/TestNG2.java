package com.mavenownproject.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class TestNG2 {
	@BeforeSuite
	void beforeSuite2()
	{
		System.out.println("beforeSuite2");
	}
	
	@AfterSuite
	void afterSuite2()
	{
		System.out.println("afterSuite2");
	}
	
	@BeforeClass
	void beforeClass2()
	{
		System.out.println("beforeClass2");
	}
	
	@AfterClass
	void afterClass2()
	{
		System.out.println("afterClass2");
	}
	
	
	@BeforeMethod
	void before_Method2()
	{
		System.out.println("before_Method2");
	}
	
	@AfterMethod
	void after_Method2()
	{
		System.out.println("after_Method2");
	}
	
	@BeforeTest
	void beforeTest2()
	{
		System.out.println("beforeTest2");
	}
	
	@AfterTest
	void afterTest2()
	{
		System.out.println("afterTest2");
	}
		
	@Test
	void loginMethod2()
	{
		System.out.println("loginMethod2");
	}
}
