package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileIOTest03 {

	public static void main(String[] args) throws IOException {
		//바이트 출력스트림
		
		OutputStream os =new FileOutputStream("여름몽");

		byte []arr= {97,98,99};
		os.write(arr);
		os.flush();
		os.close();
		
		
		OutputStream os2 =new FileOutputStream("여름여름 몽몽");
		byte []arr2= {97,98,99,100,101,102,103};
		
		//2개 건너 뛴 위치부터 3byte 저장해 라는 의미
		os2.write(arr2, 2, 3); //off: 건너띄는 갯수, len: 길이
		
		os2.flush();
		os2.close();
	}

}
