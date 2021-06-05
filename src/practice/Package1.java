package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Package1 {
	
public static void main(String[] args) throws IOException
	
	{
		
	File f = new File("C:\\Users\\Hari\\Desktop\\POI2.xlsx");
	FileInputStream fis = new FileInputStream(f);
	
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sh = wb.getSheet("Sheet1");
	
	XSSFRow r;
	
	XSSFCell c;
	
	
	Iterator rows =sh.rowIterator();
	
	while(rows.hasNext())
	{
		
	r=(XSSFRow)rows.next();
	
	Iterator cells = r.cellIterator();

	while (cells.hasNext())
	{
		c = (XSSFCell) cells.next();
		
		
		if (c.getCellType() == XSSFCell.CELL_TYPE_STRING) 
		{
			System.out.println(c.getStringCellValue() + " ");
		} 
else if (c.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
			System.out.println(c.getNumericCellValue() + " ");
		}
	
//System.out.println(cell.getStringCellValue());
}
	}
	
	
	}

}




	

	

