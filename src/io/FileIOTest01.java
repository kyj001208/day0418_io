package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileIOTest01 {

	public static void main(String[] args) {
		//파일 입출력 테스트 
		
		
		try {
			//try-catch문으로 파일출력스트림의 경우 파일이 존재하지 않으면 파일을 자동 생성시켜준다.
			OutputStream os=new FileOutputStream("몽여름");
			System.out.println("try 구간");
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
			System.out.println("catch 구간");
		}
		
		
		System.out.println("프로그램을 종료합니다");
		
	}

}
