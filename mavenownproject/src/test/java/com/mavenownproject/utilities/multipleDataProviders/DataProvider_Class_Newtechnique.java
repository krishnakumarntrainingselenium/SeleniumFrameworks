package com.mavenownproject.utilities.multipleDataProviders;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProvider_Class_Newtechnique {

	// DataProvider
	@DataProvider(name = "Datapro")
	public static Object[][] getData(Method m) {
		Object[][] data = null;
		if (m.getName().equals("TestCase1")) 
		{			
			data = new Object[2][2];
			
			data[0][0] = "Datapro_1_data00";
			data[0][1] = "Datapro_1_data01";

			data[1][0] = "Datapro_1_data10";
			data[1][1] = "Datapro_1_data00";
			
		} else if (m.getName().equals("TestCase2")) 
		{
			data = new Object[2][3];
			
			data[0][0] = "Datapro_2_data00";
			data[0][1] = "Datapro_2_data01";
			data[0][2] = "Datapro_2_data02";

			data[1][0] = "Datapro_2_data10";
			data[1][1] = "Datapro_2_data11";
			data[1][2] = "Datapro_2_data12";
		}
		return data;
	}
}