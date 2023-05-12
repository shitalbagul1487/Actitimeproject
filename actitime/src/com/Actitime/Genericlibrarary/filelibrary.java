package com.Actitime.Genericlibrarary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this is generic library class which contain all the generic class
 * @author Sashank
 *
 */

public class filelibrary {
	/**
	 * this method is generic method it is used to read the data from common file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
public String readDatafrompropertyfile(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./testdata/commondata.property");
	Properties p=new Properties();
	p.load(fis);
	 String value = p.getProperty("key");
	 return value;
}
	//read the data from excel file
public String readdatafromExcel(String sheetname ,int row,int cell)throws EncryptedDocumentException, IOException {
	FileInputStream fis1=new FileInputStream("./testdata/scoty.xlsx");
	Workbook wb = WorkbookFactory.create(fis1);
	String value = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	return value;
}



	
	
	
	
}
