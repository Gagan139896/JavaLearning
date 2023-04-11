package testpack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelHandling {

	public static void main(String[] args) throws IOException
		{  
			//------------Creating Workbook-------------------
			FileInputStream exc_path=new FileInputStream(new File("Data.xlsx"));  
			Workbook wb=new XSSFWorkbook(exc_path);   
			Sheet sheet=wb.getSheetAt(0);
			
			//----------Getting Number of rows and columns-----------
			int rows= sheet.getLastRowNum();
	        int cols= sheet.getRow(0).getLastCellNum();
	        
	        //--------For loop to get data from web table----------
			for(int i=0;i<rows;i++)   
			{ 
				Row row= sheet.getRow(i);
			 
			  for(int j=0;j<cols;j++)      
			  {  
				  Cell cell=sheet.getRow(i).getCell(j);
			      System.out.print(cell.getStringCellValue()+"|| ");
			  
			  }
			} 
		}  
}