package char_base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTest {

	public static void main(String[] args) throws IOException {
		// 문자기반 스트림: Reader 경우에도 파일이 존재하지 않으면 FileNotFoundException 발생

		File file = new File("test.dat");
		System.out.println("파일존재여부 : " + file.exists()); // 파일이 존재하는지 유무확인하는 방법: exists()

		// if(file.exists() == false) { //이렇게 if문 사용가능

		if (!file.exists()) { // 간단하게 표현 방법

			file.createNewFile(); // 파일 생성 방법 : createNewFile

		}

		Reader r = new FileReader(file);
		int data; 
		
		while((data= r.read()) !=-1) {
			
			System.out.println(data);
		}
		r.close();
		System.out.println("정상처리 완료");

	}

}
