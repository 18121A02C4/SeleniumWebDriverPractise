package com.tests;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataSupplier_Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		
//			File excelFile = new File("C://Users//Shashank.Peta//eclipse-workspace//Practise_testng//src//test//resources//book.xlsx");
		File excelFile = new File("C:\\Users\\Shashank.peta.ACS\\Downloads\\book.xlsx");

			FileInputStream fis = new FileInputStream(excelFile);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			int noOfRows = sheet.getPhysicalNumberOfRows();
			int noOfColumns = sheet.getRow(0).getLastCellNum();
		
//			String[][] data = new String[noOfRows-1][noOfColumns];
			for (int i = 1; i < noOfRows; i++) {
				for (int j = 0; j < noOfColumns; j++) {
					System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+" ");
					
				}
				System.out.println();
			}
			workbook.close();
			fis.close();
			
	 		
		}

	}
