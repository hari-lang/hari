package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Package2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File obj = new File ("C:\\Users\\Hari\\Desktop\\POI2.xlsx");
		FileInputStream input = new FileInputStream(obj);
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		sheet.getRow(0).createCell(1).setCellValue("123456");
		sheet.getRow(0).createCell(2).setCellValue("Tester");
		sheet.getRow(1).createCell(2).setCellValue("java");
		sheet.getRow(1).createCell(3).setCellValue("1.1");
		sheet.getRow(1).createCell(4).setCellValue("13/12/1993");
		sheet.getRow(2).createCell(2).setCellValue("hfa");
		sheet.getRow(2).createCell(2).setCellValue("787");
		System.out.println("how are you"); 
		FileOutputStream output = new FileOutputStream(obj);
		wb.write(output);
		


	}

}
