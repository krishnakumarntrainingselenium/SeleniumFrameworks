package com.mavenownproject.utilites.fetchingParameterValuefromParameterXML;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Value_fetching_from_XML {
	
	@Parameters({"browser"})
	@Test
	public void testCase1(String browser)
	{
		System.out.println(browser);
		
	}
	

}
