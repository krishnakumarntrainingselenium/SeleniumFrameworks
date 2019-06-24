package com.mavenownproject.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.util.SystemOutLogger;

public class BasicExcelReading {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//File
		File f=new File("C:\\Users\\Krishna Kumar N\\git\\KrishnaKumarntraining_SeleniumFrameworks\\mavenownproject\\src\\test\\java\\com\\mavenownproject\\utilities\\BasicExcelReading.xlsx");
	
		//InputStream
		FileInputStream inpfis=new FileInputStream(f);
		
		//InputStream connecting to Workbookfactory
		Workbook Wb=WorkbookFactory.create(inpfis);
		
		//get the first sheet
		org.apache.poi.ss.usermodel.Sheet sheet0=Wb.getSheetAt(0);
		
		//Get the first Row
		Row row0=sheet0.getRow(0);
		
		//get the first Cell
		Cell cell0=row0.getCell(0);
		Cell cell1=row0.getCell(1);
		Cell cell2=row0.getCell(2);
		
		System.out.println("cell0 "+cell0);
		System.out.println("cell1 "+cell1);
		System.out.println("cell2 "+cell2);

	
	}
	

}
