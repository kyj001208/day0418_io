package web;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamTest {

	public static void main(String[] args) {
		
		System.out.println("출력대상만 바뀌고 사용방법이 동일");
		
		
		try(PrintStream ps= new PrintStream(new File("test03.dat"));) {
			
			ps.println("안녕하세요");
			ps.println(10);
			ps.println(3.14);
			ps.println(true);
			ps.close();
			
		} catch (FileNotFoundException e) {
			
			
		}

	}

}
