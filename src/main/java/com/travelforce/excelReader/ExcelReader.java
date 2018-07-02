package com.travelforce.excelReader;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelReader {
	
	public static void main(String args[]) throws Exception {
		File src= new File("E:\\MyWork\\TravelForce\\src\\main\\java\\com\\travelforce\\data\\TestData.xls");
		FileInputStream fis= new FileInputStream(src);
		HSSFWorkbook wb= new HSSFWorkbook(fis);
		HSSFSheet s1= wb.getSheetAt(0);
		String data0=s1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("File Data is"+data0);
		wb.close();
	}
	
}