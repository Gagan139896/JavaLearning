package testpack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CopyDataExcel {

	public static void main(String[] args) throws IOException {
		//-----------Reading Excel-------------------
				FileInputStream exc_path=new FileInputStream(new File("My_Data.xlsx"));  
				Workbook wb=new XSSFWorkbook(exc_path);   
				Sheet sheet = wb.getSheet("Data1");
				Sheet sheet2 = wb.getSheet("Data2");
				
				//----------Getting Number of rows and columns-----------
				int rows= sheet.getLastRowNum();
		        int cols= sheet.getRow(0).getLastCellNum();
		        
		        //--------For loop to get data from web table----------
				for(int i=0;i<=rows;i++)   
				{ 
					Row row= sheet.getRow(i);
//					Row row2 =sheet2.getRow(i);
				 
				  for(int j=0;j<cols;j++)      
				  {  
					  Cell cell=sheet.getRow(i).getCell(j);
					//------Writing data in excel after fetching from web table-----
					  sheet2.getRow(i).createCell(j).setCellValue(cell.getStringCellValue());
					   
					  //------Saving excel file------------------
					  FileOutputStream fileOut = new FileOutputStream("Data.xlsx");
					    wb.write(fileOut); 
					    fileOut.close();
//				      System.out.print(cell.getStringCellValue()+"|| ");
				  
				  }System.out.println();
	}
	}
}
