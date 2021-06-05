package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataEngine {
	
	XSSFWorkbook wb;
	XSSFSheet sh;
	
	
	public ExcelDataEngine(String Filename) throws IOException
	{
		File f = new File(Filename);
		FileInputStream fis = new FileInputStream(f);
		
		wb = new XSSFWorkbook(fis);	
	}
	
	
	
	
	public String getData(int sheetNumber,int row,int column) 
	{ 
	sh=wb.getSheetAt(sheetNumber); 
	String data=sh.getRow(row).getCell(column).getStringCellValue(); 
	return data; 
	} 
	
	
	// to fetch total rows
	
	public int getRowCount(int sheetIndex) 
	{ 
	int row=wb.getSheetAt(sheetIndex).getLastRowNum(); 
	return row; 
	} 


}
