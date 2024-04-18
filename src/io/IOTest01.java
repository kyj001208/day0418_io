package io;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class IOTest01 {

	public static void main(String[] args) throws IOException {
		
		InputStream is =System.in; //키보드로 입력되는 스트림
		OutputStream os=System.out;//모니터로 출력되는 스트림
		OutputStream os1=System.err;//모니터로 에러메서지가 출력되는 스트림 
		
		
		PrintStream ps=(PrintStream) os;
		ps.println("몽여름 보고싶다");
		
		System.out.println("몽여름 원해!");
		System.err.println("♥");
		
		int data=System.in.read();
		System.out.println(data);
		System.out.println((char)data);
		
		Scanner sc=new Scanner(System.in);

	}

}
