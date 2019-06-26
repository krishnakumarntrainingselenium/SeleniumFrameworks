package com.mavenownproject.utilities.ExcelfetchingHashTable;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mavenownproject.utilities.ExcelReader;

public class TestNGParameterizationExcel {
	
	public static ExcelReader excel=null;
	
	//TestCase
	@Test(dataProvider="getDataFromExcel")
	public void testdata1(Hashtable<String,String> data)
	{
		System.out.println(data.get("Header1")+"---"+data.get("Header2")+"------"+data.get("Header3")+"-----"+data.get("Header4"));
	}
	
	//DataProvider
	@DataProvider
	public static Object[][] getDataFromExcel()
	{
		if(excel==null)
		{
			excel=new ExcelReader("C:\\Users\\Krishna Kumar N\\git\\KrishnaKumarntraining_SeleniumFrameworks\\mavenownproject\\src\\test\\java\\com\\mavenownproject\\utilities\\ExcelfetchingHashTable\\TestNGdata.xlsx");
		}
		
		String sheetName="Sheet1";
				
		int rows=excel.getRowCount(sheetName);	
		int cols=excel.getColumnCount(sheetName);	
		
		Object[][] data=new Object[rows-1][1];
		
		Hashtable<String,String> table=null;
				
		for(int rownum=2;rownum<=rows;rownum++)
		{
			table=new Hashtable<String,String>();
			
			for(int colnum=0;colnum<=cols;colnum++)
			{
				table.put(excel.getCellData(sheetName, colnum, 1),excel.getCellData(sheetName, colnum, rownum));
				
				data[rownum-2][0]=table;
		}
}
		return data;
	}
		
			
	}