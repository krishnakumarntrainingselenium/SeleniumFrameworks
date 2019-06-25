package com.mavenownproject.utilities.multipleDataProviders;

import org.testng.annotations.Test;

public class TestCase_CallingMultipleDataProviders_Class_NewTechnique {
	

	//----------------------TestCase 1 - with 2 arguments
	@Test(dataProviderClass=DataProvider_Class_Newtechnique.class, dataProvider="Datapro")
	public void TestCase1(String testData1,String testData2)
	{
		System.out.println(testData1+"-------"+testData2);
	}
	
	//----------------------TestCase 2 - with 3 arguments
	@Test(dataProviderClass=DataProvider_Class_Newtechnique.class, dataProvider="Datapro")
	public void TestCase2(String testData1,String testData2, String testData3)
	{
		System.out.println(testData1+"-------"+testData2+"-------"+testData3);
	}

}
