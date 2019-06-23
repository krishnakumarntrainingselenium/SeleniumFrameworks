package com.mavenownproject.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BasicExcelWriting {
	
	public static void main(String[] args) throws IOException
	{
		
//	Step	//1,WorkBook Creation
		XSSFWorkbook Wb=new XSSFWorkbook();
		
//	Step	//2,WorkSheet's Creation 
		XSSFSheet Ws1=Wb.createSheet("Sheet_Created1");
		XSSFSheet Ws2=Wb.createSheet("Sheet_Created2");
		XSSFSheet Ws3=Wb.createSheet("Sheet_Created3");
		
//	Step	//3,Create row in sheet
		//a, Ws1
		Row Ws1_row0=Ws1.createRow(0);
		Row Ws1_row1=Ws1.createRow(1);
		
    	//b, Ws2
		Row Ws2_row0=Ws2.createRow(0);
		Row Ws2_row1=Ws2.createRow(1);
		
		//c, Ws3
		Row Ws3_row0=Ws3.createRow(0);
		Row Ws3_row1=Ws3.createRow(1);
		
//Step  //4, Column Creation
		//a,----------------------------------------------------
		Cell Ws1_row0_CellA0=Ws1_row0.createCell(0);  //createCell(0) -- represents Column value
		Cell Ws1_row0_CellB0=Ws1_row0.createCell(1);
		Ws1_row0_CellB0.setCellValue("Kumar");	
		
		Cell Ws1_row1_CellA1=Ws1_row1.createCell(0);		
		Cell Ws1_row1_CellB1=Ws1_row1.createCell(1);
		//b,------------------------------------------------------		
		Cell Ws2_row0_CellA0=Ws2_row0.createCell(0);
		Cell Ws2_row1_CellA1=Ws2_row1.createCell(0);
		//c,------------------------------------------------------
		Cell Ws3_row0_CellA0=Ws3_row0.createCell(0);
		Cell Ws3_row1_CellA1=Ws3_row1.createCell(0);
		//------------------------------------------------------
		
		
//Step //5, Creating the file in the specified path
		File Excelfile=new File("C:\\Users\\Krishna Kumar N\\Desktop\\Testdata_Automatic.xlsx");
		
//Step //6,	 Pointing OutputStream to path
		FileOutputStream fo=new FileOutputStream(Excelfile);

//Step //7, Writing Wb to OutputStream
		Wb.write(fo);

//Step //8, Closing the Stream
		fo.close();
		
		System.out.println("Excel file is created automatically");
		
		
	}

}
