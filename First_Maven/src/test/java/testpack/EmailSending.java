package testpack;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import NewFramework.MasterData;

public class EmailSending extends MasterData {
	
	//-------Hashmap for storing excel data---------
     static HashMap<String, String> map = new HashMap<String, String>();
     public static void ExcelData() throws IOException {
    	//-----------Reading Excel-------------------
 		FileInputStream exc_path=new FileInputStream(new File("Data_File.xlsx"));  
 		Workbook wb=new XSSFWorkbook(exc_path);   
 		Sheet sheet=wb.getSheet("GlobalData");
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
 			}
 		} catch (Exception e) {
 			System.out.println("Below error is found in reading first sheet \n"+e);
 		}
     }
     public static void SendEmail() throws IOException {
    	 ExcelData();
    	 
    	//--------Get system properties------------ 
         Properties prop = System.getProperties();

         //-------Setup mail server----------------
         prop.put("mail.smtp.host", "smtp.gmail.com");
         prop.put("mail.smtp.port", "465");
         prop.put("mail.smtp.ssl.enable", "true"); 
         prop.put("mail.smtp.auth", "true");

         //------Creating session object and passing username and password--------- 
         Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
             protected PasswordAuthentication getPasswordAuthentication() {
                 return new PasswordAuthentication(map.get("EmailFrom"), map.get("Pass"));
             }
         });
         try {
        	 //------Creating Msg object-------------
             MimeMessage msg = new MimeMessage(session);
             msg.setFrom(new InternetAddress(map.get("EmailFrom")));
             //-------Adding Recipients------------
             msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(map.get("EmailTo")));
             
             //-----Checking CcStatus fron the excel sheet--------
             if(map.get("CcStatus").equalsIgnoreCase("Yes")) {
            	 //-----Adding Recipients in cc-----
            	 msg.addRecipients(Message.RecipientType.CC, InternetAddress.parse(map.get("Cc")));
             }
             //-----Subject of mail-------
             msg.setSubject("This is a test email");
             Multipart multipart = new MimeMultipart();
             MimeBodyPart attachmentPart = new MimeBodyPart();
             MimeBodyPart textPart = new MimeBodyPart();
             try {
            	 //----Checkinh Attachment Status from excel sheet----
             	if(map.get("AttachStatus").equalsIgnoreCase("Yes")) 
             	{
                 //------Attaching file----------
                 File f =new File(map.get("AttachFile"));
                 attachmentPart.attachFile(f);
                 multipart.addBodyPart(attachmentPart);
             	}
             	//-----Body of the mail-------
                 textPart.setText("Hi Team,\nHope you all are doing well!\nThis mail is only for testing purpose\n\nThanks\nAutomation Testing Team");
                 multipart.addBodyPart(textPart);
                 
             } catch (Exception e) {
                 System.out.println(e);
             } 
             msg.setContent(multipart);
             System.out.println("sending...");
             Transport.send(msg);
             System.out.println("Sent message successfully....");
         } catch (Exception ex) {
            System.out.println(ex);
         }
     }
     public static void main(String[] args) throws IOException{
    	 SendEmail();
    }
}