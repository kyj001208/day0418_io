package web;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriteTest {

	public static void main(String[] args) {
		
		try(PrintWriter out =new PrintWriter(new File("test.html"));) {
			
			out.println("<html><head></head><body>");
			out.println("<h1>");
			out.println("Hello Dog");
			out.println("</h1>");
			out.println("<img src='img1_copy.jpg'width='800px'/>");
			out.println("</body></html>");
		
			out.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
