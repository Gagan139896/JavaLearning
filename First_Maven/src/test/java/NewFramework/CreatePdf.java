package NewFramework;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.github.dockerjava.api.model.Image;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.Path;
import com.itextpdf.text.pdf.parser.clipper.Paths;


public class CreatePdf {

	 public static void main(String args[]) throws IOException, DocumentException {
		 try {
			 String File = "First.pdf";
			 Document doc = new Document();
			 PdfWriter.getInstance(doc, new FileOutputStream(File));
			 doc.open();
			 Paragraph para = new Paragraph("This testing Pdf to test the functionality of pdf creation process "+File);
			 doc.add(para);
			 doc.close();
			 System.out.println(para);
			 
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		 
	   }

}
