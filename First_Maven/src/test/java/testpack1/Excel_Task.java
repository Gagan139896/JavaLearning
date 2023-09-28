package testpack1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel_Task {
	
	public static WebDriver driver;
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		try {
			//-----------Reading Excel-------------------
			FileInputStream exc_path=new FileInputStream(new File("Data_File.xlsx"));  
			Workbook wb=new XSSFWorkbook(exc_path);   
			Sheet sheet=wb.getSheet("Data");
			//-----------Reading Excel-------------------
			FileInputStream newexc_path=new FileInputStream(new File("Report.xlsx"));  
			Workbook newwb=new XSSFWorkbook(newexc_path);   
			Sheet newsheet=newwb.getSheet("ReportTab");
			//-------Hashmap for storing excel data---------
			HashMap<String, String> map = new HashMap<String, String>();
			List<String> steps = new ArrayList<String>();
			//------Saving excel file------------------
			
			//----------Launching Browser--------------------
			WebDriverManager.chromedriver().setup(); 
			ChromeOptions opt = new ChromeOptions(); 
			opt.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(opt); 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			steps.add("Browser is invoked successfully");
			
			try {
				//---------For loop to put excel data in Hashmap---------------------
				for(int i=0;i<=sheet.getLastRowNum();i++)
				{
					Row row = sheet.getRow(i);
					
					for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
					{
						Cell cell = row.getCell(j,Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
						map.put(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue());
					}
				}System.out.println(map);
			} catch (Exception e) {
				System.out.println("Below error is found in reading first sheet \n"+e);
			}
			try {
				//-------Opening URL-----------
				driver.get(map.get("URL"));
				steps.add("URL is opened");
				//------Clicking on Electronics-----
				driver.findElement(By.xpath(map.get("Electronics"))).click();
				steps.add("Clicked on Electronics tab");
				//-------Clicking on Headphones-----
				driver.findElement(By.xpath(map.get("Headphones"))).click();
				steps.add("Clicked on Headphones section under Electronics");
				//-----Clicking on In-Ear section under headphones-----
				driver.findElement(By.xpath(map.get("In_Ear"))).click();
				steps.add("Clicked on In_Ear section under Headphones");
			} catch (Exception er) {
				System.out.println("Not able to proceed due to below error \n"+er);
			}
			
			try {
				for(int k=0; k<5;k++) {
					//-------Clicking on products--------
					driver.findElement(By.xpath(map.get("products"))).click();
					steps.add("Clicked on product");
					Set<String> tabs1 = driver.getWindowHandles();
				    List<String> tabs2 = new ArrayList<String>();
				    tabs2.addAll(tabs1); 
				    driver.switchTo().window(tabs2.get(1));
				    //------Getting cart count before adding product to cart-----
				    String Before = driver.findElement(By.xpath(map.get("Cart"))).getText();
				    steps.add("Getting count of items in cart before adding any product to cart");
				    //-------Clicking on Add to cart button-------
					driver.findElement(By.xpath(map.get("add_Cart"))).click();
					steps.add("Clicked on Add to cart button");
					Thread.sleep(2000); 
					//-----Converting before count string to int-----
					int Count_Before = Integer.parseInt(Before);
					steps.add("Number of items in cart before adding new product to cart is :"+Count_Before);
					//------Getting cart count after adding product to cart-----
					String After = driver.findElement(By.xpath(map.get("Cart"))).getText();
					steps.add("Getting count of items in cart after adding any product to cart");
					//-----Converting after count string to int-----
					int Count_After = Integer.parseInt(After);
					steps.add("Number of items in cart After adding new product to cart is :"+Count_After);
					//------Calculating the difference between before and after count-----
					int diff_Count = Count_After - Count_Before; 
					//---------Statement to verify whether product is added to cart or not----
					if(diff_Count==1) {
						System.out.println("Number of Products added to cart is : "+Count_After);
						steps.add("Number of Products added to cart is : "+Count_After);
						driver.close();
					}else {
						System.out.println("Product is not added to cart");
						steps.add("Product is not added to cart");
						driver.close();
					}driver.switchTo().window(tabs2.get(0));
					Thread.sleep(2000);
				}System.out.println(steps.size());
				FileOutputStream fileOut = new FileOutputStream("Report.xlsx");
				for(int s=0;s<steps.size();s++) {
					String values = steps.get(s);
					System.out.println(values);
					Row newrow = newsheet.createRow(s);
					Cell newcell = newrow.createCell(0);
					newcell.setCellValue(values);
				}newwb.write(fileOut);  
				fileOut.close();
				driver.quit();
			} catch (Exception err) {
				System.out.println("Below error is found during adding product and writing result in sheet\n"+err);
			}
		}catch(Exception errr){
			System.out.println("Adding product to cart process is not working fine. Below error is found : "+errr);
			driver.quit();
		}
	}  
}
