package com.mavenownproject.utilities.multipleDataProviders;

//------------------------------------------------------------------------------
//Goal:
//	Passing different dataproviders in one class, to the different calling 
//  "testcase - methods" in another class --"TestCase_CallingMultipleDataProviders_Class" 
//   created especially for "testcases"
//------------------------------------------------------------------------------

import org.testng.annotations.DataProvider;

public class DataProviders_Class {
	
	//DataProvider 1
	@DataProvider(name="Datapro_1")
	public static Object[][] getData1()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="Datapro_1_data00";
		data[0][1]="Datapro_1_data01";
		
		data[1][0]="Datapro_1_data10";
		data[1][1]="Datapro_1_data00";
		return data;
	}
	
	//DataProvider 2
	@DataProvider(name="Datapro_2")
	public static Object[][] getData2()
	{
		Object[][] data=new Object[2][3];
		data[0][0]="Datapro_2_data00";
		data[0][1]="Datapro_2_data01";
		data[0][2]="Datapro_2_data02";
		
		data[1][0]="Datapro_2_data10";
		data[1][1]="Datapro_2_data11";
		data[1][2]="Datapro_2_data12";
		return data;
	}

}
