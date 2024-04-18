package io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamTest {
	
	public static void main(String[] args) {
		//
		try (DataInputStream dis = new DataInputStream(new FileInputStream("test02.dat"));) {
			String str=dis.readUTF();
			int num=dis.readInt();
			Double mum=dis.readDouble();
			System.out.println(str);
			System.out.println(num);
			System.out.println(mum);
			dis.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재 하지 않습니다");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
