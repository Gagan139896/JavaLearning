package NewFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.NetworkInterface;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MasterData {
	static HashMap<String, String> map = new HashMap<String, String>();
	public static void MyData(String SheetName,String TabName) throws IOException {
			
	        String ROOT_DIR = "C:\\Users\\gagandeep.singh_bits\\BIG\\First_Maven";
	        String ExcelFileName = SheetName;
	        String locx = (ROOT_DIR + "\\" + ExcelFileName + ".xlsx");
	        
	      //-----------Reading Excel------------------- 
			FileInputStream ExcFile = new FileInputStream(locx);  
			Workbook wbx=new XSSFWorkbook(ExcFile);   
			Sheet sheetx=wbx.getSheet(TabName); 
			try {
				//---------For loop to put excel data in Hashmap---------------------
				for(int i=0;i<=sheetx.getLastRowNum();i++)
				{
					Row row = sheetx.getRow(i);
					
					for(int j=0;j<sheetx.getRow(0).getLastCellNum();j++)
					{
						Cell cell = row.getCell(j,Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
						map.put(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue());
//						System.out.println(cell.getStringCellValue());
					}
				}//System.out.println(map);
			} catch (Exception e) {
				System.out.println("Below error is found in reading first sheet \n"+e);
			}
	}
	public static void main(String[] args) throws IOException { 
//		MyData();
	
	}

}
