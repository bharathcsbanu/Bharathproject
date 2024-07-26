package com.E_commerce.generic.fileutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	public String getDataFromExcel(String sheetname, int rowNum, int celNum) throws RuntimeException, IOException {
		FileInputStream fis = new FileInputStream("./TestScriptData/testscriptdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(rowNum).getCell(celNum).getStringCellValue();

		return data;
	}

	public int getRowcount(String sheetname) throws RuntimeException, IOException {
		FileInputStream fis = new FileInputStream("./TestScriptData/testscriptdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowcount = wb.getSheet(sheetname).getLastRowNum();
		wb.close();
		return rowcount;
	}

	public void setdataBacktoExcel(String sheetname, int celNum, int rowNum, String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./TestScriptData/testscriptdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(rowNum).createCell(celNum);

		FileOutputStream fos = new FileOutputStream("./TestScriptData/testscriptdata.xlsx");
		wb.write(fos);
		wb.close();
		
}
}