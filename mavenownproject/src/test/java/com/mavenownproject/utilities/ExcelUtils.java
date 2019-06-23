package com.mavenownproject.utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static XSSFSheet ExcelWs;
	private static XSSFWorkbook ExcelWb;
	private static XSSFCell ExcelCell;
	private static XSSFRow ExcelCellRow;

	public static void SettingExcelfile(String Path, String Sheetname) {
		try {
			FileInputStream ExcelFile = new FileInputStream(Path);
			ExcelWb = new XSSFWorkbook(ExcelFile);
			ExcelWs = ExcelWb.getSheet(Sheetname);
		} catch (Exception e) {

		}
	}

	public static String readCellData(int rowno, int columnno) {
		try {
			ExcelCell = ExcelWs.getRow(rowno).getCell(columnno);
			String Exceltestdata = ExcelCell.getStringCellValue();
			return Exceltestdata;
		} catch (Exception e) {
		}
		return null;
	}
}
