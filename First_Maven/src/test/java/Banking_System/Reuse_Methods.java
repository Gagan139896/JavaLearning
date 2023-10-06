package Banking_System;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class Reuse_Methods {
	public int excel_RowCount(String filepath,String sheetname) throws IOException
    {
        int rows=0;
        String excelFilePath= filepath;
		FileInputStream inputstream = new FileInputStream(excelFilePath);
		
		XSSFWorkbook Workbook = new XSSFWorkbook(inputstream);
		XSSFSheet sheet=Workbook.getSheet(sheetname);
		try {
			rows = sheet.getLastRowNum();
		} catch (Exception e) {
			e.printStackTrace();
		}
//		System.out.println("rows "+rows);
        return rows;
    }
	
	public int excel_ColumnCount2(String filepath,String sheetname,int row) throws IOException
    {   int cols =0;
        try {
			String excelFilePath= filepath;
			FileInputStream inputstream = new FileInputStream(excelFilePath);
			
			XSSFWorkbook Workbook = new XSSFWorkbook(inputstream);
			XSSFSheet sheet=Workbook.getSheet(sheetname);
			int rows=sheet.getLastRowNum();
			cols= sheet.getRow(row).getLastCellNum();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return cols;
    }
	
	public void write_Excel2(String filepath,String sheetname, String value,int rows, int cols) throws InterruptedException, IOException {
	   	 String excelFilePath= filepath;
			//------------Creating Workbook-------------------
			FileInputStream exc_path=new FileInputStream(excelFilePath);  
			Workbook wb=new XSSFWorkbook(exc_path);   
			Sheet sheet=wb.getSheet(sheetname);
			Row row;
			//----------Getting Number of rows and columns-----------+
			if(cols<1) 
			{
				row = sheet.createRow(rows+1);
			}
			else 
			{
				row = sheet.getRow(rows+1);
				
			}
				try 
				{
					Cell cell = row.createCell(cols);
					cell.setCellValue(value);
				} 
				catch (Exception e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			//------Saving excel file------------------
			FileOutputStream fileOut = new FileOutputStream(excelFilePath);
			wb.write(fileOut);
			fileOut.close();  
		}
	
	public void write_Exce23(String filepath,String sheetname, String value,int rows, int cols) throws InterruptedException, IOException {
	   	 String excelFilePath= filepath;
			//------------Creating Workbook-------------------
			FileInputStream exc_path=new FileInputStream(excelFilePath);  
			Workbook wb=new XSSFWorkbook(exc_path);   
			Sheet sheet=wb.getSheet(sheetname);
			Row row;
			//----------Getting Number of rows and columns-----------+
				row = sheet.createRow(rows+1);
				row = sheet.getRow(rows+1);
				try 
				{
					Cell cell = row.createCell(cols);
					cell.setCellValue(value);
				} 
				catch (Exception e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			//------Saving excel file------------------
			FileOutputStream fileOut = new FileOutputStream(excelFilePath);
			wb.write(fileOut);
			fileOut.close();  
		}
	
	public void write_Exce34(String filepath,String sheetname, String value,int rows, int cols) throws InterruptedException, IOException {
	   	 String excelFilePath= filepath;
			//------------Creating Workbook-------------------
			FileInputStream exc_path=new FileInputStream(excelFilePath);  
			Workbook wb=new XSSFWorkbook(exc_path);   
			Sheet sheet=wb.getSheet(sheetname);
			Row row;
			//----------Getting Number of rows and columns-----------+
//				row = sheet.createRow(rows+1);
				row = sheet.getRow(rows+1);
				try 
				{
					Cell cell = row.createCell(cols);
					cell.setCellValue(value);
				} 
				catch (Exception e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			//------Saving excel file------------------
			FileOutputStream fileOut = new FileOutputStream(excelFilePath);
			wb.write(fileOut);
			fileOut.close();  
		}
	
	//---------Write data in excel----------------
		public void write_Excel(String filepath,String sheetname, String value) throws InterruptedException, IOException {
	   	 String excelFilePath= filepath;
			//------------Creating Workbook-------------------
			FileInputStream exc_path=new FileInputStream(excelFilePath);  
			Workbook wb=new XSSFWorkbook(exc_path);   
			Sheet sheet=wb.getSheet(sheetname);
			
			//----------Getting Number of rows and columns-----------
			int rows= sheet.getLastRowNum();
	        int cols= sheet.getRow(0).getLastCellNum();
	       
			for(int i=0;i<rows;i++)   
			{ Row row1= sheet.getRow(i+1);
			
			  for(int j=0;j<cols;j++)      
			  {  
				  Cell cell=sheet.getRow(i+1).getCell(0);
				  //------Writing data in excel after fetching from web table-----
				  row1.createCell(0).setCellValue(value);
				  }
				  //------Saving excel file------------------
				  FileOutputStream fileOut = new FileOutputStream(excelFilePath);
				    wb.write(fileOut);
				    fileOut.close();  
			  }
		}
	
	public String read_excel(String filepath,String sheetname,int row, int col) throws IOException
	{
		String excelFilePath= filepath;
		String value ="";
        FileInputStream inputstream = new FileInputStream(excelFilePath);
        Workbook Workbook = new XSSFWorkbook(inputstream);
        Sheet sheet=Workbook.getSheet(sheetname);
        Row curr_row= sheet.getRow(row);
        
            
			try {
				Cell cell=curr_row.getCell(col);
				value = cell.getStringCellValue();
			} catch (Exception e) {
				System.out.print("     ");
			}
            return value; 
	}
	
	public String current_Date()
	{
	 LocalDate currentDate = LocalDate.now();
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
     String dateString = currentDate.format(formatter);
     return dateString;
	}
	
	public String getCellValue(String Sheetname, String testName, String colName) {
		String cellValue = null;
		try 
		{
			FileInputStream fis = new FileInputStream(""+System.getProperty("user.dir")+"\\TestData.xlsx");
			Workbook wb = new XSSFWorkbook(fis);
			Sheet ws = wb.getSheet(Sheetname);
			for (int i=0;i<=ws.getLastRowNum();i++) 
			{
				for(int j=0; j<=ws.getRow(i).getLastCellNum(); j++) 
				{
					if(ws.getRow(0).getCell(j).getStringCellValue().equalsIgnoreCase(colName)) 
					{
						cellValue=ws.getRow(i).getCell(j).getStringCellValue();
						break;
					}
				}
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return cellValue;
		} 
	
	
	public void addNewSheetTab(String sheetName, String fileName) throws InvalidFormatException, EncryptedDocumentException, org.apache.poi.openxml4j.exceptions.InvalidFormatException 
	{
		ArrayList<String> transaction = new ArrayList<String>();
		transaction.add("Credit");
		transaction.add("Debit");
		transaction.add("Date");
		transaction.add("Balance");
		// Load an existing workbook
        Workbook workbook = null;
        try {
            workbook = WorkbookFactory.create(new FileInputStream(fileName+".xlsx"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Create a new sheet
        Sheet sheet = workbook.createSheet("New Sheet");

        // Rename the sheet tab
        workbook.setSheetName(workbook.getSheetIndex(sheet), sheetName);

        // Write some data to the sheet
        Row row = sheet.createRow(0);
        for(int i=0; i<4; i++)
          {
  	        Cell cell = row.createCell(i);
  	        cell.setCellValue(transaction.get(i));
          }

        // Save the workbook to a file
        try (FileOutputStream fileOut = new FileOutputStream(fileName+".xlsx")) {
            workbook.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Close the workbook
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
    }
	}
	
	public int random_number(int maxvalue,int minvalue)
	{
		int number = (int)(Math.random()*(maxvalue-minvalue)+minvalue);
		return number;
	}
}
