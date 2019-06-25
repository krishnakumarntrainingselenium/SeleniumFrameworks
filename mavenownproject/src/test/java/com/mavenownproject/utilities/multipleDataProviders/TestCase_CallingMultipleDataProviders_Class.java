package com.mavenownproject.utilities.multipleDataProviders;

import org.testng.annotations.Test;

public class TestCase_CallingMultipleDataProviders_Class {
	
	//  If we are using different class (other than the "testcase" method residing - class)
    //	for getting the "testData" from the "DataProvider",means then we need to pass that 
	// a, corresponding dataprovider method class name (i.e in which dataprovider method is present) 
    //							and
	// b, also we need to provide the dataprovider name
	
	//----------------------TestCase 1 - with 2 arguments
	@Test(dataProviderClass=DataProviders_Class.class, dataProvider="Datapro_1")
	public void TestCase1(String testData1,String testData2)
	{
		System.out.println(testData1+"-------"+testData2);
	}
	
	//----------------------TestCase 2 - with 3 arguments
	@Test(dataProviderClass=DataProviders_Class.class, dataProvider="Datapro_2")
	public void TestCase2(String testData1,String testData2, String testData3)
	{
		System.out.println(testData1+"-------"+testData2+"-------"+testData3);
	}

}
