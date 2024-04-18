package io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DataOutputStreamTest {

	public static void main(String[] args) {
	
		// 기본 Data 타입 단위로 입출력 가능 
		
		OutputStream os=null;
		DataOutputStream dos=null;
		try {
			os = new FileOutputStream("test02.dat");
			dos=new DataOutputStream(os);
			dos.writeUTF("문자열로 저장해준다");
			dos.writeInt(10);
			dos.writeDouble(3.14);
		
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}finally {
			
			try {dos.close();} catch (IOException e) {}
			try {os.close();} catch (IOException e) {}
		}
		

	}

}
