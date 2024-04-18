package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileIOTest02 {

	public static void main(String[] args) throws IOException {
		//파일 입출력 테스트 
		
		
		OutputStream os=new FileOutputStream("몽여름");
		os.write(48); //1바이트씩 출력 -파일에 저장 
		os.write(49);
		os.write(50);
		
		os.flush();//출력버퍼에 남은 모든 바이트를 출력
		os.close();
		System.out.println("파일 저장완료");
		
		//try {if(os !=null)os.close();} catch (IOException e) {}
		
	}

}
