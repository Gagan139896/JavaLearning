package testpack1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TabNames {

	public static void main(String[] args) throws IOException, InvalidFormatException {
		File exc= new File("Data.xlsx");
		Workbook wb = WorkbookFactory.create(exc);
		int sheetNum = wb.getNumberOfSheets();
		
		List<String> sheetNames = new ArrayList<String>();
		for (int i=0; i<sheetNum; i++) {
		    sheetNames.add( wb.getSheetName(i) ); 
		}//System.out.println(sheetNames);
		for (int j=0;j<sheetNames.size();j++) {
			String name = sheetNames.get(j);
			if (name.equalsIgnoreCase("Old")) {
				Sheet sheet = wb.getSheet(name); 
				
				int rows = sheet.getLastRowNum();
				int cols = sheet.getRow(0).getLastCellNum();
				//System.out.println("rows "+rows);
				//System.out.println("cols "+cols);
				for(int k=0;k<=rows;k++)
				{//System.out.println("k "+k);
					Row row = sheet.getRow(k);
					for(int l=0;l<cols;l++)
					{//System.out.println("l "+l);
					Cell cell = row.getCell(l);
//					System.out.println(cell.getStringCellValue());
					String myName = cell.getStringCellValue();
					if(myName.equalsIgnoreCase("Gagan")) {
						System.out.println(cell.getStringCellValue());
					}
						
					}
				}
			}
		}
}
}
