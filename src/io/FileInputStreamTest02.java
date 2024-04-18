package io;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStreamTest02 {

	public static void main(String[] args) throws IOException  {
		
		//파일입력스트림 특징: 지정된 경로에 파일이 존재하지 않으면 자동으로 만들어 주지 않는다
		InputStream is =new FileInputStream("E:/kdt6th/IMG/img1.jpg");
		OutputStream os=new FileOutputStream("img2_copy.jpg");
	
		int readSize;
		int count=0;
		byte [] buffer=new byte[1024*10];
		
		while((readSize=is.read(buffer)) != -1) {
			
			//0번 위치부터 readSize byte 만큼 저장해
			os.write(buffer,0,readSize);
			count++;
			
		}		
		
		os.close();
		is.close();
		
		System.out.println("완료 : " + count);

	}

}
