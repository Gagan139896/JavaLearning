package testpack;

import java.io.File;  
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;  

public class ExcelOperations { 
	public static WebDriver driver;
	
	public static void main(String args[]) throws IOException  
	{  
		//----------Launching Browser--------------------
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt); 
		driver.manage().window().maximize();
		
		//----------Opening URL---------------------------
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		//------------Creating Workbook-------------------
		FileInputStream exc_path=new FileInputStream(new File("Data.xlsx"));  
		Workbook wb=new XSSFWorkbook(exc_path);   
		Sheet sheet=wb.getSheetAt(0);
		
		//---------Getting List of Web Elements----------------
		List <WebElement> t_row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
		List <WebElement> t_col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td"));
		
		//----------Getting Number of rows and columns-----------
		int rows= sheet.getLastRowNum();
        int cols= sheet.getRow(0).getLastCellNum();
        
        //--------For loop to get data from web table----------
		for(int i=0;i<t_row.size();i++)   
		{ Row row= sheet.getRow(i);
		
		  for(int j=0;j<t_col.size();j++)      
		  {  Cell cell=sheet.getRow(i).getCell(j); 
			  if(i<t_row.size()) {
			  String values = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+(i+2)+"]/td["+(j+1)+"]")).getText();
			  
			  //------Writing data in excel after fetching from web table-----
			  row.createCell(j).setCellValue(values);
			  
			  //------Saving excel file------------------
			  FileOutputStream fileOut = new FileOutputStream("Data.xlsx");
			    wb.write(fileOut);
			    fileOut.close();  
			    
			  //--------Reading data from excel----------
			  System.out.print(cell.getStringCellValue()+"|| ");
			  }
			  
			  else {
				  break;
			  }
			  
			}System.out.println();
		}   
	}  
}
