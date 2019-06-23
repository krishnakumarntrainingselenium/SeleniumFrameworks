package com.mavenownproject.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CommonTestCase {
	
	
	@BeforeClass
	void beforeClass()
	{
		System.out.println("beforeClass_CommonTestCase");
	}
	
	@AfterClass
	void afterClass()
	{
		System.out.println("beforeClass_CommonTestCase");
	}

	@Test
	void commonTestCase1()
	{
		System.out.println("commonTestCase1");
	}
	@Test
	void commonTestCase2()
	{
		System.out.println("commonTestCase2");
	}

}
