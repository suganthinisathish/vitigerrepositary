package com.vtiger.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtillity {
	
	public String getDataFromProperties(String key) throws IOException
	{
		String propertiesFilePath="./src/test/resources/commonData.properties";
		FileInputStream fis=new FileInputStream(propertiesFilePath);
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(key);
		return value;
	}
	public String getDataFromExcel(String sheet,int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
		String excelFilePath="./src/test/resources/TestData.xlsx";
		FileInputStream fis=new FileInputStream(excelFilePath);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheet);
		String value=sh.getRow(rownum).getCell(cellnum).getStringCellValue();
		return value;
		
	}

}
