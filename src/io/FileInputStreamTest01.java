package io;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStreamTest01 {

	public static void main(String[] args) throws IOException  {
		
		//파일입력스트림 특징: 지정된 경로에 파일이 존재하지 않으면 자동으로 만들어 주지 않는다
		InputStream is =new FileInputStream("E:/kdt6th/IMG/img1.jpg");
		OutputStream os=new FileOutputStream("img1_copy.jpg");
	
		int data;
		int count=0;
		
		while((data=is.read()) != -1) {
			
			os.write(data);
			count++;
			
		}		
		
		os.close();
		is.close();
		
		System.out.println("완료 : " + count);

	}

}
